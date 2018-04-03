public class student extends person{
    private String name , ename ,department , email , phone ,address ,id ;
    private short sex =2;
    private int height ,weight ;


    public student(String name1 , String ename1 , String department1 , String email1 , String phone1 , String address1 , String id1, short sex1 , int height1 , int weight1){
        super(name1,sex1);
        this.setEname(ename1);
        this.setDepartment(department1);
        this.setEmail(email1);
        this.setPhone(phone1);
        this.setAddress(address1);
        this.setId(id1);
        this.setHeight(height1);
        this.setWeight(weight1);



    }


    public void setEname(String ename1){
        this.ename = ename1;
    }
    public String getEname() {
        return ename;
    }
    public void setDepartment(String department1){
        this.department = department1;
    }
    public String getDepartment() {
        return department;
    }
    public void setEmail(String email1){
        this.email = email1;
    }
    public String getEmail() {
        return email;
    }
    public void setPhone(String phone1){
        this.phone = phone1;
    }
    public String getPhone() {
        return phone;
    }
    public void setAddress(String address1){
        this.address = address1;
    }
    public String getAddress() {
        return address;
    }
    public void setId(String id1){
        this.id = id1;
        if (id1.matches("[0-9]{9}")){
            id =id1;
        }else { id= "error";
        }
    }
    public String getId() {
        return id;

    }



    public void setHeight(int height1){
        this.height = height1;
        if (height1 <250 && height1>0){
            height =height1;
        }
        else  {
            System.out.println("wrong");
        }
    }
    public int getHeight() {
        return height;
    }

    public void setWeight(int weight1){
        this.weight = weight1;
    }
    public int getWeight() {
        return weight;
    }


}
