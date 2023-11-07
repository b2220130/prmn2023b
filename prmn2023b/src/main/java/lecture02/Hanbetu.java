package lecture02;

import java.util.Scanner;

public class Hanbetu {
    void roguin(String gakuseki, String[][] account){
        Scanner scan = new Scanner(System.in);

        for(int i=0; i<5; i++){
            if(gakuseki.equals(account[i][0])){
                System.out.print("パスワードを入力:");
                String password = scan.next();

                if(password.equals(account[i][1])){
                    System.out.println("ログイン完了");
                    System.exit(0);
                }else{
                    System.out.println("不正なログイン");
                    System.exit(0);
                }
            }
        }
        System.out.println("error!!");
        System.exit(0);
    }
}
