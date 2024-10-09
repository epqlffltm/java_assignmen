class Tvtest4{
    public static void main(String args[]){
        int n=3;
        Tv[] ary=new Tv[n];

        for(int i=0;i<n;i++){
            ary[i]=new Tv();
            ary[i].channel=i+10;
        }

        for(int i=0;i<ary.length;i++){
            ary[i].channel++;
            System.out.println(ary[i].channel);
        }
    }
}