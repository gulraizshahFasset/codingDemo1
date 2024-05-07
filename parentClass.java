public class parentClass {
    String caste = "Shah";
    String getCaste(){
        return caste;
    }
    void getName(String name){
        System.out.println("This is parent class");
        System.out.println("My name is "+name+" "+getCaste());
    }
}
