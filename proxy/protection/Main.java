public class Main {
    // instance variables here

    public static void main(String[] args) {
        MatchMakingTestDrive test = new MatchMakingTestDrive();
        test.drive();
    }

    public MatchMakingTestDrive() {
        initializeDatabase();
    }
    public void drive() {
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
        System.out.println("Rating is " + ownerProxy.getHotOrNotRating()); this shouldn’t work!
    }
    PersonBean nonOwnerProxy = getNonOwnerProxy(joe);
            System.out.println("Name is " + nonOwnerProxy.getName());
try {
        nonOwnerProxy.setInterests("bowling, Go");
    } catch (Exception e) {
        System.out.println("Can’t set interests from non owner proxy"); setter
    }
            nonOwnerProxy.setHotOrNotRating(3);
System.out.println("Rating set from non owner proxy");
System.out.println("Rating is " + nonOwnerProxy.getHotOrNotRating()); Then try to
    set the rating
// other methods like getOwnerProxy and getNonOwnerProxy here
}
