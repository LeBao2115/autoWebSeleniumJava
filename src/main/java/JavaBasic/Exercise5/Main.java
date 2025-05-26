package JavaBasic.Exercise5;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        NhanVien a = new NhanVien("James",23,1.500,"KMS");
        NhanVien b = new NhanVien("Kleen",30,100.500,"Bocsh");
        NhanVien c = new NhanVien("Max",35,168000,"LA");
        NhanVien d = new NhanVien("Hydro",46,10000,"VN");
        NhanVien e = new NhanVien("Marco",70,50.05,"KPMC");

        ArrayList<NhanVien> listNhanVien = new ArrayList<>();
        listNhanVien.add(a);
        listNhanVien.add(b);
        listNhanVien.add(c);
        listNhanVien.add(d);
        listNhanVien.add(e);

        for (int i = 0; i < listNhanVien.size(); i++){
            System.out.println(listNhanVien.get(i).toString());
        }
    }
}
