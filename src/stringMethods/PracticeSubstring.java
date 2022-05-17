package stringMethods;

import utilities.ScannerHelper;

public class PracticeSubstring {
    public static void main(String[] args)
    {
        String sentence = ScannerHelper.getAStringFromUser();
        System.out.println(sentence.substring(0,sentence.indexOf(' '))); // first word
        System.out.println(sentence.substring(sentence.lastIndexOf(" ")+1)); //last word with string way
        System.out.println(sentence.substring(sentence.lastIndexOf(' ')+1)); //last word with char way
    }
}
