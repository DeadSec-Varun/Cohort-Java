public class Task2a{
    public static void main(String[] args) {
        int num1=Integer.parseInt(args[0]);
        int num2=Integer.parseInt(args[1]);

        String operation=args[2];
        switch(operation){
            case "+":System.out.println("Addition: "+(num1+num2));
                    break;
            case "-":System.out.println("Subtraction: "+(num1-num2));
                    break;
            case "*":System.out.println("Multiplication: "+(num1*num2));
                    break;
            case "/":System.out.println("Division: "+(num1/num2));
                    break;
            case "%":System.out.println("Modulus: "+(num1%num2));
                    break;
        }

    }    
}
