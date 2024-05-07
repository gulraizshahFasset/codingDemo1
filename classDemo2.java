public class classDemo2 {
    // encapsulation
    // public , private
    public String name = "";
    public String caste = "";
    public String dob = "";
    private int age = 0;

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

    public void getInformation(String tempName,String tempCaste, String tempDob, int tempAge){
        setName(tempName);
        setCaste(tempCaste);
        setdob(tempDob);
        setAge(tempAge);
        getName();
        getcaste();
        getdob();
        getage();
    }
    private void getInformationHard(String tempName,String tempCaste, String tempDob){
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
