//OOPs starts here
class Calculator{
    int a;
    public int add(int a,int b)
    {
        System.out.println("Hmmm ! let me sum these two numbers ");
        return a+b;

    }
    public int add(int a,int b,int c){
        System.out.println("Oho! so now you want sum of three numbers.okay so sum is:-");
        return a+b+c;
    }
}
class doSomething
{
    public void playMusic(){
        System.out.println("Music Playing..0 1 2");
    }
}
public class OOPs {
    public static void main(String[] args) {
        int num1=4;
        int num2=5;
        //created class reference and object. 
        Calculator calc = new Calculator();
        int result=calc.add(num1,num2);   
        System.out.println("sum of two numbers is " + result); 
        System.out.println("Give me some of three numbers");
        System.out.println(calc.add(2,3,4));
        doSomething play = new doSomething();
        play.playMusic();

    }
}
