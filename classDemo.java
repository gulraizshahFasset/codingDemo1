public class classDemo {
    String name = "";
    String caste = "";
    String dob = "";
    int age = 0;

    classDemo(){
        System.out.println(name);
        System.out.println(caste);
        System.out.println(dob);
        //System.out.println(age);
    }
    classDemo(String tempName){
        name = tempName;
        System.out.println(name);
        System.out.println(caste);
        System.out.println(dob);
        System.out.println(age);
    }
    classDemo(String tempName,String tempCaste){
        name = tempName;
        caste = tempCaste;
        System.out.println(name);
        System.out.println(caste);
        System.out.println(dob);
        System.out.println(age);
    }
    classDemo(String tempName,String tempCaste,int tempAge){
        name = tempName;
        caste = tempCaste;
        age = tempAge;
        System.out.println(name);
        System.out.println(caste);
        System.out.println(dob);
        System.out.println(age);
    }

    void setName(String tempName){
        name = tempName;
    }
    void getName(){
        System.out.println(name);
    }
    void setCaste(String tempcaste){
        caste = tempcaste;
    }
    void getcaste(){
        System.out.println(caste);
    }
    void setdob(String tempdob){
        dob = tempdob;
    }
    void getdob(){
        System.out.println(dob);
    }
    void setAge(int tempage){
        age = tempage;
    }
    void getage(){
        System.out.println(age);
    }
}
