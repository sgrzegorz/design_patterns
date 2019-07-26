public class  Animal implements Cloneable{
    int i=9;
    public void sayYourName(){

    }

    public Animal clone(){
        try{
            return (Animal) super.clone();
        }catch (Exception e){
            System.out.println("hhhhhajajaja");
            return null;
        }

    }
    Animal a = new Animal();
    Animal b = (Animal) ((Animal) a).clone();



}