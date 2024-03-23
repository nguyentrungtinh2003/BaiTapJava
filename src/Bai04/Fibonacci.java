package Bai04;
import java.util.Scanner;
public class Fibonacci {
    public static int nhap(){
        Scanner input= new Scanner(System.in);
        boolean check= false;
        int n=0;
        while(!check){
            System.out.print(" ");
            try{
                n= input.nextInt();
                check= true;
            }catch(Exception e){
                System.out.println("Ban phai nhap so! hay nhap lai...");
                input.nextLine();
            }
        }
        return (n);
    }

    public static void main(String[] args) {
        System.out.println("Nhap n : ");
        int n = nhap();
        int[] f = new int[n+1];
        f[0] = 0; f[1] = 1;
        for(int i = 2;i<=n;i++) {
            f[i] = f[i-1]+f[i-2];
        }
        System.out.println("day Fibonacci cua "+n+" la : "+f[n]);
    }
}
