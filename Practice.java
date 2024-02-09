
/**
 * Practice
 */
public class Practice {

    
    public static void main(String[] args) {
        //Type converesion 
        byte b=127;
        int a = b, c=257;
        byte k=(byte)c;
        float f=5.6f;
        int t=(int) f;

        System.out.println(a);
        System.out.println(k);
        System.out.println(t);

        //Type promotion
        byte m=10;
        byte n=30;
        int result = m*n;
        System.out.println(result);

        //Assignment Operator
         int num1=15;
         int num2=5;
         int sum = num1+num2;
         int sub = num1-num2;
         int mult = num1*num2;
         int div = num1/num2;
         int mod =num1%num2;
         System.out.println(sum+" "+ sub+" "+mult+" "+div+" "+mod);
         
         //Relational Operators

         int x=6;
         int y=5;
         boolean result1 =x<y; // simillarly <,>,<=,>=,==,!=
         System.out.println(result1);

         //Loops while,do while ,for
          int it=1;
          while(it<=4)
          {
            System.out.println("Hi "+it);
            it++;
            int j=1;
            while(j<=3){
                System.out.println("Hello "+j);
                j++;
            }

          }

          //for loop
          for(int i=1;i<=4;i++){
            System.out.println("HI for loop "+ i);
          }
          //
          for(int i=1;i<=5;i++){
            System.out.println("DAY "+i);
            for(int j=1;j<=9;j++){
                System.out.println(" "+(j+8)+"-"+(j+9));
            }
          }
          
          //Basics coding ends here
          

    }
}