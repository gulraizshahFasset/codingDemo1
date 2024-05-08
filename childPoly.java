public class childPoly extends parentPoly{
    // |Override
    // Overloading

   // @Override

    void namePrint(){
        parentPoly p1= new parentPoly();
        p1.namePrint();
        System.out.println("Gulraiz Shah");
    }
    void identity(String name){
        System.out.println(name);
    }
    void identity(String name,String ID){
        System.out.println(name+ID);
    }
    void identity(int Salary){
        System.out.println(Salary);
    }
    void identity(){
        System.out.println("I am empty");
    }
    String identity(float salary){
        return "";
    }
}
