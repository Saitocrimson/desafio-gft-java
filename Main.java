import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        int a,n=0;
        Scanner ler = new Scanner(System.in);
        a = ler.nextInt();
        a=a+1;
        do{
            if(n>0 && n%2==0){
                System.out.println(n);
            }
            n++;
        }while(a>n);
    }
}
	
