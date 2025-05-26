package JavaBasic.Exercise5;

public class NhanVien {
    private String name;
    private int age;
    private double salary;
    private String company;

    public NhanVien(String name, int age, double salary, String company){
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.company = company;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public String getCompany() {
        return company;
    }

    public String toString(){
        return getName() +" "+ getAge() +" "+ getSalary() +" "+ getCompany();
    }

}
