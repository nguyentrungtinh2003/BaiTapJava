package Bai02;

import java.util.Scanner;

public class TongCacChuSo {
    public static int nhap()
    {
        Scanner input = new Scanner(System.in);
        boolean check = false;
        int n = 0;
        while(!check) {
            System.out.println(" ");
            try {
                n = input.nextInt();
                check=true;
            }catch (Exception e) {
                System.out.println("Ban phai nhap so !!!");
                input.nextLine();
            }
        }
        return(n);
    }
    public static int tinhTong(long i) {
        int sum = 0;
        long n;
        while(i!=0) {
            n = i%10;
            sum += n;
            i/=10;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("Nhap n : ");
        int n = nhap();
        System.out.println("Tong cua cac chu so cua "+n+" la : "+tinhTong(n));
    }
}
