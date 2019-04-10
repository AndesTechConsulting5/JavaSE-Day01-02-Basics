package org.andestech.learning.rfb19.g4;


public class App4
{
    public static void main( String[] args )
    {

        int i = 0;

        for(; i<10; i=i+1)
        {
            System.out.println("i=" +i);
        }

        System.out.println(i);

//--------------------------------------
        {
            int k =0;
            for (;;) {
                if (!(k < 5)) break;
                System.out.println("k=" + k);
                //..
                k++;
            }
        }
        System.out.println(i);

        for(int k=0; k<5; k++) System.out.println("k=" + k);

        //--------------------------------

        while(i>0){
         System.out.println("i=" + i);
         i--;
        }
        System.out.println("------------------------");
        while(true){
            if( !(i<5)) break;
            System.out.println("i=" + i);
            i++;
        }

        //----------------------
        System.out.println("+++++++++++++++++++++++++++");
        do{

         System.out.println("i=" + i);
         i--;
        }while (i>0);


        System.out.print("A\t");
        System.out.print("B\n");







    }
}
