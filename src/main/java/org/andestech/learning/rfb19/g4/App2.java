package org.andestech.learning.rfb19.g4;

/**
 *
 *
 * @version 12.3.3
 *
 *
 * @author Andrei S
 *
 *
 */

public class App2 {

    int aaa;

    /**
     * <p>Hi! My Meth 01</p>
     * @params var1, var2
     * @since jdk 1.7
     *
     */
    public static void main(String[] args)
    {

    byte байт1 = 21;
    byte b1 = 127, b2=-128;
    byte b3,b4,b5;

    byte b6 = (byte)12339;
        System.out.println("b6=" + b6);

    byte b7 = (byte)0b1111_1111;
        System.out.println("b7=" + b7);

    // Short ------------------------

    short sh1 = 21312;
    System.out.println(Short.MAX_VALUE + " : " +Short.MIN_VALUE);

    System.out.print("AAA");

    // Int --------------------------

    int i = 2_333_444;
    int i3 = 02134234;
    int i2 = 0x0AAA_FFFF;

    System.out.println(i3);
    Integer ii;

        System.out.println("Max Int: " + 0x7fff_ffff);

    // ------------ Long

    long L1 = 1_134_324_234_234L;
    Long L2;


        System.out.println(Math.log10(0x7fffffffffffffffL));

    // ----------------- ops

    int data1 = 0b1000_1111;
    int data2 = 0b1010_1001; //key


    int data3 = (data1 ^ data2) ^ data2;

        System.out.println(Integer.toBinaryString(data3));

    int d3 = -0b11001001;
        System.out.println("d3: " + d3 );
        System.out.println("d3_shifted: " +  (d3 >> 2) );
        System.out.println("MAX for Short:" + ((1<<15) -1) );

    //------------------------------------------

    float f1 = 123.45678901234f;
        System.out.println("f=" + f1);
        System.out.println(3.001f + 1.001f);
        System.out.println(Math.log10(1<<22));

    double d1 = 123.4567890123456789;
        System.out.println("d1=" + d1);


    double d2 = 1000;


    //decimal

    // char

    char ch1 = 'A', ch2 = '\t';
    char ch3 = 2345;

        System.out.println( (char)(((int)ch1)+1) );
        System.out.println((int)ch1);
        System.out.println(ch3);

    // String
    String st = "Hello!";
    String out = st + "\t\t" +st + "\b.\n" + "Exit..";
    System.out.println(out);

    //System.out.println(st + "\t\t" +st + "\b.\n" + "Exit..");

   // Boolean

   boolean bool1 = true, bool2 = false;
   boolean res = (1!=2 || 1==2 || false || 2==5);

        System.out.println("res=" +res);
   // if

    if(1==1){
        System.out.println("True!!");
        //....
        //....
    }

       int a10 = 1;

        if(1!=a10){
        System.out.println("True1!!");
        System.out.println("True2!!");}
        else {
            System.out.println("false!!");
        }

        System.out.println("-----------------------------");

        if(1==a10){
            System.out.println("True1!!");
            if(a10*1 == 1){
            System.out.println("True2!!");}
        }
        else {
            System.out.println("false!!");
        }

     // ternary if

     int res2 = (a10==1)?1:10;
     int apples = 10;
     System.out.println("You have " + apples +
             " apple" +
             ((apples!=1)?"s":"") + "."
             );
     // switch

     String answer ="maybe!!!";

     switch(answer)
     {
         case "no":
             System.out.println("1switch yes!");
             //.....
             //.....
             break;

         case "yes": System.out.println("2switch No!"); break;
         case "maybe": System.out.println("switch Maybe..."); break;
         default: System.out.println("switch smth...");
     }

        System.out.println("-------------------------------");

     if(answer.equals("yes")){
         System.out.println("!switch yes!");
     }
     else if (answer.equals("no")) {
             System.out.println("!switch no");
          }
     else if (answer.equals("maybe")) {
             System.out.println("!switch maybe");
          }
     else {System.out.println("!switch smth...");}
    }

}
