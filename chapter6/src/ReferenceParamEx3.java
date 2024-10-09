public class ReferenceParamEx3 {
    public static void main(String[] args) {
        int [] ary=new int[] {3,2,1,6,5,4};

        printAry(ary);
        sortAry(ary);
        printAry(ary);

        System.out.println("sum= "+sumAry(ary));
    }
    public static void printAry(int[] ary) {
        System.out.print("[");
        for(int i:ary)
            System.out.print(i+",");
        System.out.println("]");
    }
    public static int sumAry(int[] ary) {
        int sum=0;
        for(int i:ary)
            sum+=ary[i];
        return sum;
    }
    static void sortAry(int[] ary) {
        for(int i=0;i<ary.length-1;i++)
            for(int j=0;j<ary.length-1;j++)
                if(ary[j]>ary[j+1]){
                    ary[j]=ary[j]^ary[j+1];
                    ary[j+1]=ary[j]^ary[j+1];
                    ary[j+1]=ary[j]^ary[j+1];
                }
    }
}
