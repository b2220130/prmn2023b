package lecture02;

public class Keisan {
    int x=0;

    int sum(int[] a){
        for(int i=0; i<5; i++){
            x += a[i];
        }
        return x;
    }

    void print(int b){
        System.out.println(b);
        if(b >= 100){
            System.out.println("great!!");
        }else if(b >= 50){
            System.out.println("big");
        }else{
            System.out.println("small");
        }
    }
}
