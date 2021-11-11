public class Task2c{
    public static void main(String[] args) {
        int num=Integer.parseInt(args[0]),fact=1;
        while(num>0){
                fact*=num;
                num--;
        }
        System.out.println("Factorial: "+fact);
    }    
}
