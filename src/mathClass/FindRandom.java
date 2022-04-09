package mathClass;

public class FindRandom {
    public static void main(String[] args) {
       double random = Math.random();//it returns numbers from 0.0----0.9999
       System.out.println(random);


       double random0And10Included = Math.random() * 10;//0--9 from 0 to 9 included
        //double random0And10Included = Math.random() * 1000; // 0 999
        //it only takes in double

        //if we want to get whole number in INT, we should make :casting
        int random0And10Included2 = ((int)Math.random() * 10);

        System.out.println(random0And10Included2); //because we put int and output in int 0

        //create a random between 0-20 included take that as an int
        int random0And20Included = (int)(Math.random()*21); // we need to put into () (Math.random()*21)when we dont need 0
        System.out.println(random0And20Included);

        //create a random between 10-20 included take that as an int

        int random10And20Included = (int) (Math.random()*11)+10;
        System.out.println(random10And20Included);

        //create a random between 103-346 included take that as an int
        // get the difference --> 346-103 = 243 add +1;
        //multiply it by 243 + 1= 244;
        // add the starting point to the equation;
        //random * (end point - start point+1) + start point ---> included
        int random103And346Included = (int)(Math.random()*244)+103;
        int random103And346Included1 = 102+(int)(Math.random()*244);
        System.out.println(random103And346Included);
        System.out.println(random103And346Included1);

        //create a random - 50/ 50 included take that as an int
        ////random * (end point - start point+1) + start point ---> included
        //random * (50-(-50)+1)) + (-50)---> (101))-50)
        int random_50And50Included = (int)(Math.random()*101)-50;
        System.out.println(random_50And50Included);











    }





    }

