public class Animal implements Cloneable{
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


}