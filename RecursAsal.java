import java.util.Scanner;

public class RecursAsal {

    static void  sayi(int n,int i){

      if(n==i){
          System.out.println(n+" Asal Sayidir...");
          return;
      }
      if(n%i==0){

          System.out.println(n+" Asal Sayi Degildir...");
          return;
      }

        sayi(n,i+1);

    }


    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int  n;
        System.out.print("Sayi Gir :");
        n= inp.nextInt();

        sayi(n,2);

        
    }
}
