package lecture02;

import java.util.Scanner;

public class pra2_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("名前を入力:");
        String name1 = scan.next();
        System.out.print("学籍番号を入力:");
        int num = scan.nextInt();

        System.out.println("氏名:" + name1 + ", 学籍番号:" + num);
    }
}
