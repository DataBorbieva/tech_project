package forLoop;

public class CountCharacterInAString {
    public static void main(String[] args) {
        String s = "TechGlobal SchOOl";
        int count = 0;
        for (int i = 0; i <= s.length() - 1; i++) {
        if(s.toLowerCase().charAt(i) == 'o') count++;

        }
        System.out.println(count);
    }
}
