package Bai01;

import java.util.Scanner;

public class UCLN_BCNN {
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
                System.out.println("ban phai nhap so !!!");
                input.nextLine();
            }
        }
        return(n);
    }
    public static int UCLN(int a, int b) {
        while(a!=b) {
            if(a>b) a=a-b;
            else b= b-a;
        }
        return(a);
    }
    public static void main(String[] args) {
        System.out.println("Nhap so a");
        int a = nhap();
        System.out.println("Nhap so b");
        int b = nhap();
        System.out.println("Uoc chung lon nhat cua "+a+" va "+b+" la : "+UCLN(a,b));
        System.out.println("Boi chung nho nhat cua "+a+" va "+b+" la : "+((a*b)/UCLN(a,b)));
    }
}
