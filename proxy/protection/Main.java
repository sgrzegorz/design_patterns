import org.omg.CosNaming.NamingContextPackage.NotFound;

import java.lang.reflect.Proxy;
import java.util.ArrayList;

public class Main {
    // instance variables here
    ArrayList <PersonBean> people;

    public Main() {
        PersonBean person = new PersonBeanImpl();
        person.setName("Joe Javabean");
        people = new ArrayList<>();
        people.add(person);
    }

    public static void main(String[] args) throws ClassNotFoundException {
        Main test = new Main();
        test.drive();
    }


    public void drive() throws ClassNotFoundException {
        PersonBean joe = getPersonFromDatabase("Joe Javabean");
        PersonBean ownerProxy = getOwnerProxy(joe);
        System.out.println("Name is " + ownerProxy.getName());
        ownerProxy.setInterests("bowling, Go");
        System.out.println("Interests set from owner proxy");
        try {
            ownerProxy.setHotOrNotRating(10);
        } catch (Exception e) {
            System.out.println("Can’t set rating from owner proxy");
        }
        System.out.println("Rating is " + ownerProxy.getHotOrNotRating());

        PersonBean nonOwnerProxy = getNonOwnerProxy(joe);
        System.out.println("Name is " + nonOwnerProxy.getName());
        try {
            nonOwnerProxy.setInterests("bowling, Go");
        } catch (Exception e) {
            System.out.println("Can’t set interests from non owner proxy");
        }
        nonOwnerProxy.setHotOrNotRating(3);
        System.out.println("Rating set from non owner proxy");
        System.out.println("Rating is " + nonOwnerProxy.getHotOrNotRating());
    }

    private PersonBean getPersonFromDatabase(String name) throws ClassNotFoundException {
        for(PersonBean p :people){
            if(p.getName()== name) return p;
        }
        throw new ClassNotFoundException();
    }

    PersonBean getNonOwnerProxy(PersonBean person) {
        return (PersonBean) Proxy.newProxyInstance(person.getClass().getClassLoader(), person.getClass().getInterfaces(), new NonOwnerInvocationHandler(person));
    }


    PersonBean getOwnerProxy(PersonBean person) {
        return (PersonBean) Proxy.newProxyInstance(person.getClass().getClassLoader(), person.getClass().getInterfaces(), new OwnerInvocationHandler(person));
    }

}