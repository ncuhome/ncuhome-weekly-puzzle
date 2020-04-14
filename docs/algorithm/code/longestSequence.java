public class longestSequence {
    public static void main(String[] args){
        int num=1;
        int[] ints={1,2,4,1,3,4,5,2};
        int[] counts=new int[ints.length];
        for(int i=0;i<ints.length;i++){
            for(int j=i;j<ints.length-1;j++){
                if(ints[j]<ints[j+1]){
                    ++num;
                }else{
                    break;
                }
            }
            counts[i]=num;
            num=1;
        }
        int max=1;
        if(counts.length>1){
            max=counts[0];
            for(int i=0;i<counts.length;i++){
                for(int j=0;j<counts.length;j++)
                {
                    if(max<counts[j]){
                        max=counts[j];
                    }
                }
            }
        }
        System.out.println(max);
    }
}