package Bai05;

public class ThapHaNoi {
    public static void main(String[] args) {
        int n = 3; // Số đĩa
        char cotA = 'A'; // Cột ban đầu
        char cotC = 'C'; // Cột đích
        char cotB = 'B'; // Cột trung gian

        System.out.println("Các bước di chuyển để giải quyết bài toán:");
        solveHanoi(n, cotA, cotC, cotB);
    }

    public static void solveHanoi(int n, char cotA, char cotB, char cotC) {
        if (n == 1) {
            System.out.println("Di chuyển đĩa 1 từ cột " + cotA + " đến cột " + cotB);
            return;
        }
        solveHanoi(n - 1, cotA, cotB, cotC);
        System.out.println("Di chuyển đĩa " + n + " từ cột " + cotA + " đến cột " + cotC);
        solveHanoi(n - 1, cotB, cotC, cotA);
    }
}
