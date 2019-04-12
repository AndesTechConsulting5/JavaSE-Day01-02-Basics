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

        // mult table

        int N = 13;

        System.out.print("\t");
        for(int i1=1; i1<=N; i1++ ) System.out.print(i1 + "\t");
        System.out.print("\b\n");

        for(int i1=1; i1<=N; i1++ ){
            System.out.print(i1 + "\t");
            for(int j1=1; j1<=N; j1++ )
            {
                System.out.print(i1*j1 + "\t");
            }
            System.out.print("\b\n");
        }


     //--------------------------------------

     for(int k =0; k<10; k++)
     {

//          if(k%2==0) continue;
//         // code
//         //
//         //
//         System.out.println("end block.."+ k);


         if(k%2!=0) {
         // code
         //
         //
         System.out.println("end block.."+ k);}
     }


     // search in Nd array...

      ext:  for (int k =0; k<=20; k++)
        {
            for (int k2 =0; k2<=20; k2++)
            {
                for (int k3 =0; k3<=20; k3++)
                {
                    if(k*k2*k3 == 144)
                    {
                        System.out.printf("k=%d, k2=%d, k3=%d\n",k,k2,k3);
                        break ext;}

                }

            }


        }





    }
}
