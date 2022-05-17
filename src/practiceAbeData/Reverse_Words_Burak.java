package practiceAbeData;

public class Reverse_Words_Burak {
    public static String reverseEachWord(String str){

        String[] elements =   str.split(" ");
        String container = "";
        for(String el : elements){
            for (int i = el.length()-1 ; i >= 0; i--)  {
                container += el.charAt(i);

            }
        container += " ";
        }
        return container.trim();

    }

    public static void main(String[] args) {
        System.out.println(reverseEachWord("Data is the best student"));  //ataD si eht tseb tneduts






    }
}
