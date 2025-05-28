package JavaOOP.BT_OOP1;

public class NhanVien {
    private String name;
    private int age;
    private String company;

    public NhanVien(String name,int age,String company){
        this.name = name;
        this.age = age;
        this.company = company;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCompany() {
        return company;
    }

    public String toString() {
        return String.format("%s %d %s",name,age,company);
    }
}
