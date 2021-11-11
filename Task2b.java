public class Task2b{
    public static void main(String[] args) {
            int n=Integer.parseInt(args[0]);
            int[] fibb=new int[n];
            fibb[0]=0;
            fibb[1]=1;
            for(int i=2;i<n;i++){
                fibb[i]=fibb[i-1]+fibb[i-2];
            }
            int i=0;
            while(i<n) System.out.print(fibb[i++]+" ");
    }    
}
