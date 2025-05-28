package JavaOOP.BT_OOP2;

import JavaOOP.BT_OOP1.NhanVien;

import java.util.ArrayList;

public class Company {
    private static ArrayList<Person> listNhanVien;

    public static void main(String[] args) {
        Person nhanVienA = new Person("Slim",32,Gender.MALE,"Quan 12","09123123");
        System.out.println(nhanVienA.getName());
        System.out.println(nhanVienA.getGender());
        System.out.println(nhanVienA.toString());

        Person nhanVienB = new Person("Josh",25,Gender.MALE,"Quan Binh Tan","035184");
        System.out.println(nhanVienB.toString());

        listNhanVien = new ArrayList<>();
        listNhanVien.add(nhanVienA);
        listNhanVien.add(nhanVienB);

        for (Person a: listNhanVien){
            System.out.println(a.toString());
        }
    }
}
