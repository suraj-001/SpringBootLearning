//OOPs starts here
class Calculator{
    int a;
    public int add(int a,int b)
    {
        System.out.println("Hmmm ! let me these two numbers ");
        return a+b;

    }
}
public class OOPs {
    public static void main(String[] args) {
        int num1=4;
        int num2=5;
        Calculator calc = new Calculator();
        int result=calc.add(num1,num2);   
        System.out.println("sum of two numbers is " + result); 
    }
}
