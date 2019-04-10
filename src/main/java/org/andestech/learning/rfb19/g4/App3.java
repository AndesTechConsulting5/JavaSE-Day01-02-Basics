package org.andestech.learning.rfb19.g4;


public class App3
{
    public static void main( String[] args )
    {
        // Блочная видимость переменных

        int k =30;
        {
            int i = 30 + k;

        }


        int j = 33;
        {
            int i = 20 + j;

        }




    }
}
