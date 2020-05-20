public class Test {
    public static void main(String[] args) {
        int[] array = {0,4,5,3,2,6,0};
        System.out.println(findRepeat(array));
    }


    static int findRepeat(int[] array){
        boolean[] aux = new boolean[array.length];
        for (int i : array) {
            if (aux[i]) {
                return i;
            }
            aux[i] = true;
        }
        return -1;
    }
}
