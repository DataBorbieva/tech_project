package loops.ControlStatements;

public class UnderstandingControlStatements {
    public static void main(String[] args) {
        System.out.println("Control Statement");

        for (int i = 1; i <= 25; i++) {
            if(i % 10 ==0) continue;     // if(i % 10 !=0) sout:(i)
            else System.out.println(i);
         }


    /*    System.out.println("Control Statement");
        int count = 1;
        while (count < 25) {
           if(count % 10 ==0) continue;
            count++;
            System.out.println(count);
        }

     */
        System.out.println("\nControl Statement WITH BREAK");
        for (int i = 1; i <= 25; i++) {
            if (i % 10 != 0) {
                System.out.println(i);
            }
        if(i ==15){
            break;
        }
        }
        System.out.println("\nControl Statement WITH BREAK");
        for (int i = 1; i <= 25; i++) {
            if (i % 10 == 0) {
               continue;
            }
            else {
                System.out.println(i);
            }
            if(i ==15){
                break;
            }
        }












    }
}
