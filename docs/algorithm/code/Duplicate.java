import java.util.ArrayList;
import java.util.Scanner;

public class Duplicate{
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<Integer>();
        System.out.print("please input a num array:");
        Scanner scan = new Scanner(System.in);
        String line = scan.nextLine();
        Scanner scanner =new Scanner(line);
        while(scanner.hasNextInt()){
            int x=scanner.nextInt();
            list.add(x);
        }
        int i=0,j=0;
        Integer samenum=0;
        for(i=0;i<list.size();i++){
            for(j=0;j<list.size();j++){
                if(j!=i){
                    if(list.get(i)==list.get(j)){samenum=list.get(i);}
                }
            }
        }
        System.out.println(samenum);
    }
}