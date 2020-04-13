public class longestSequence {
    public static void main(String[] args){
        int num=1;
	//原数组序列
        int[] ints={1,2,4,1,3,4,5,2};
	//存放每一个元素的满足条件的子序列
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
	//获取counts中的最大值
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
            System.out.println(max);
        }else{
            System.out.println(max);
        }
    }
}