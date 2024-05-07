public class classDemo1 {

    String name = "";
    String caste = "";
    String dob = "";
    int age = 0;
    public static String Nationality = "Pakistan";
    public static void printNationality(){
        System.out.println(Nationality);
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

    void getInformation(String tempName,String tempCaste, String tempDob, int tempAge){
        setName(tempName);
        setCaste(tempCaste);
        setdob(tempDob);
        setAge(tempAge);
        getName();
        getcaste();
        getdob();
        getage();
    }
    void getInformationHard(String tempName,String tempCaste, String tempDob){
        setName(tempName);
        setCaste(tempCaste);
        setdob(tempDob);
        age = 30;
        getName();
        getcaste();
        getdob();
        getage();
    }
}
