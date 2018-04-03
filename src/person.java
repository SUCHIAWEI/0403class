public class person {

    private String name;
    private short sex = 2;

    public person(String name1,short sex1) {
        setName(name1);
        setSex(sex1);

    }
    public String getName() {
        return name;
    }
    public void setName (String name1){

        if (name1.length() > 30) {
            name = name1.substring(0, 30);
            System.out.println("error names so long");

        } else {
            name = name1;
        }
    }
    public void setSex(short sex1) {
        this.sex = sex1;
        sex =1;//男生
        sex =2;//女生

    }

    public String getSex() {
        if (sex ==1){
            return "男生";
        }
        else if (sex==2){
            return "女生";
        }

        else {
            return "你怪怪的";
        }

    }


}
