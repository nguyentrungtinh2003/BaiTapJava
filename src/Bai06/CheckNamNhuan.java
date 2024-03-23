package Bai06;

import java.util.Scanner;

public class CheckNamNhuan {

    public static boolean check(int y) {
        if( y % 4 == 0 && y % 100 != 0 || y % 400 ==0 ) {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap nam can kiem tra nam nhuan : ");
        int y = sc.nextInt();
        if(check(y)) {
            System.out.println("Nam "+y+" la nam nhuan");
        }else {
            System.out.println("Nam "+y+" khong la nam nhuan");
        }
    }
}
