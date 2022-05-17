package practiceAbeData;

public class RemoveExtraSpaces_Burak {
    public static String extraSpace(String str) {
        str = str.trim();
        String s = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ' || str.charAt(i + 1) != ' ' ) s += str.charAt(i);
        }
        return s;
    }

    public static void main(String[] args) {

        System.out.println(extraSpace("Data   data"));






    }
    }