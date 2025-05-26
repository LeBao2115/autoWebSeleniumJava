package JavaBasic.Exercise1;

public class SinhVien {
    public String name = "James";
    static String company = "KMS";

    public int experienceYear(){
        int year = 5;
        return year;
    }

    public static void main(String[] args) {
        float salary = 1.5000F;
        System.out.println("Static value: " + company);
        System.out.println("Local value: " + salary);
        SinhVien sv = new SinhVien();
        System.out.println("Instance property value: " + sv.name);
        System.out.println("Instance method value: " + sv.experienceYear());

    }

}
