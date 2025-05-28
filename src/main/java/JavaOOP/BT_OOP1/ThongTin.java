package JavaOOP.BT_OOP1;

public class ThongTin {
    public static void main(String[] args) {
        NhanVien nhanVienA = new NhanVien("Slim",25,"KMS");
        System.out.println(nhanVienA.getName());
        System.out.println(nhanVienA.getAge());
        System.out.println(nhanVienA.getCompany());
        System.out.println(nhanVienA.toString());
    }
}
