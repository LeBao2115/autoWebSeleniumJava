package JavaBasic.Exercise1;

public class ThongTin {
    static SinhVien sv = new SinhVien();
    public static String name = sv.name;
    public static String company = SinhVien.company;
    public static int yearExperience = sv.experienceYear();

    public static void main(String[] args) {
        System.out.println("Name SinhVien: " + name);
        System.out.println("Company SinhVien: " + company);
        System.out.println("yearExperience SinhVien: " + yearExperience);
    }
}
