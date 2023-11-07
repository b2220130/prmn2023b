package lecture02;

import java.util.Scanner;

public class prac3 {
    public static void main(String[] args) {
        String[][] account = new String[100][2];

        account[0][0] = "B2001000";
        account[0][1] = "abc";
        account[1][0] = "B2002000";
        account[1][1] = "def";
        account[2][0] = "B2003000";
        account[2][1] = "ghi";
        account[3][0] = "B2004000";
        account[3][1] = "jkl";
        account[4][0] = "B2005000";
        account[4][1] = "mno";

        Scanner scan = new Scanner(System.in);
        System.out.print("学籍番号を入力:");
        String gakuseki = scan.next();

        Hanbetu hanbetu = new Hanbetu();
        hanbetu.roguin(gakuseki,account);
    }
}
