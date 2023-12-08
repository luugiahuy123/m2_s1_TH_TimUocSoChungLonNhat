package ss2.ThucHanh.TimUocSoChungLonNhat;

import java.util.Scanner;

public class TimUocSoChungLonNhat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a;
        int b;
        System.out.println("nhap so a");
        a = scanner.nextInt();
        System.out.println("nhap so b");
        b = scanner.nextInt();
        a = Math.abs(a);
        b = Math.abs(b);
        if (a == 0 || b==0) {
            System.out.println("Không có ước số chung lớn nhất lớn nhất");
        }
        while (a != b){
            if (a > b){
                a = a - b;
            } else {
                b = b - a;
            }
        }
        System.out.println("La uoc so lon nhat cua:  " + a);
    }
}
