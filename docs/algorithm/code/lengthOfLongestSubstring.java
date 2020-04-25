import java.util.HashSet;
import java.util.Set;

public class lengthOfLongestSubstring {
    public static void main(String[] args){
        String str="aaaaa";
        int num=0,max=1;
        //集合，确定不同元素
        Set<Character> set=new HashSet<>();
        for(int i=0;i<str.length();i++){
            //向集合内加入str所在索引i处的元素
            set.add(str.charAt(i));
            for(int j=i+1;j<str.length();j++){
                //通过add返回值判断j处字符是否与之前集合中已有的字符相同
                if(set.add(str.charAt(j))){
                    num=set.size();
                    max=Math.max(max, num);
                }
                else{
                    //清空集合
                    set.removeAll(set);
                    break;
                }
            }
        }
        System.out.println(max);
    }
}