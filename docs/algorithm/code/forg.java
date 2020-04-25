//import java.util.Scanner;

public class forg {
    public static void main(String[] args){
        int n=7;
		//int n;
        //System.out.print("please input a num(0<n<=1002):");
        //Scanner scanner=new Scanner(System.in);
        //n=scanner.nextInt();
        System.out.println(count(n));
    }

    public static int count(int n) {
        if(n>2){
            return count(n-1)+count(n-2)*2-same(n);
        }else{
            return n;
        }
    }

    public static int same(int n){
        if(n==3||n==4){
            return n-2;
        }else{
            return same(n-1)+same(n-2);
        }
    }
}