package practiceAbeData;

public class StringMethodsPractice {
    public static void main(String[] args) {
        //ValueOF Method
        double d = 178.55;
        String d1 = String.valueOf(d);
        System.out.println(d1); //178.55

        int num = 178;
        String numString = String.valueOf(num);
        System.out.println(num); //178

        System.out.println("\nindexOf()\n");
        String str = "TechGlobal School";
        int indexOfLetterG = str.indexOf('G'); //5-1=4
        int indexOfGlobalWord = str.indexOf("School"); //12-1=11
        int indexOfSentence = str.indexOf("TechGlobal School"); //0
        int indexOf1 = str.indexOf(" ");   //10   -->>> when we have space there is no minus 1 ???
       System.out.println(indexOfLetterG);
       System.out.println(indexOfGlobalWord);
        System.out.println(indexOfSentence);
        System.out.println(indexOf1);

        System.out.println("\n\nlastIndexOf()\n");
        String str1 = "TechGlobal Tech";
        int lastIndexOfLetterL = str1.lastIndexOf('l');
        int lastIndexOfTechWord = str1.lastIndexOf("Tech");
        System.out.println(lastIndexOfLetterL);
        System.out.println(lastIndexOfTechWord);






    }
}
