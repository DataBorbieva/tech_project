package casting;

public class CastingPrimitives {
    public static void main(String[] args){
        /*
        double>float>long>int >=char>=short>byte
         */
        int myInt = 32;
        long myLong = myInt;      //implicit casting //skrytyi russian

        myInt = (int) myLong;     // explicit casting // yavnuy russian

        int mySecondInt = 'B';    // implicit casting
        char myChar = (char) 56;  //you dont have to cast char and int , because they are equal
        char mySecondChar = 56;

        int myThirdInt = (int) 45.4; //say the data type you want to convert not the other one;

        short myShort = (short) myChar;
        char myThirdChar = (char) myShort;

                /*
                Short max = 32767;
                Short min = -32768
                int max = 2147483647
                int min= - 2147483648
                char   ---> can not be negative -blablabla

                                   */


            byte num1 = 45;
            int num2 = num1;//implicit

            double num3 = 13.6;
            float num4 = (float) num3; //explicit

             int num5 = 45;
             short num6 = 34;
              char c = (char) num5;
              c = (char) num6; // we have to cast for both cuz char should be POSITIVE everytime




    }
}
