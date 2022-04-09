package casting;

public class Recap {
    public static void main(String[] args) {

        String s = "10.5";
        System.out.println(s+2); //10.52

        Double d1 = Double.valueOf(s);//10.5->d1 is more that 8 bytes
        System.out.println(d1+2); //12.5

        double d2 =  Double.valueOf(s);//10.5 -> d2 is 8 bytes //redundant boxing- bespoleznoe deistvie
        System.out.println(d2+2); //12.5

        double d3 = Double.parseDouble(s);//10.5 -> straight to primitive
        System.out.println(d3+2); //12.5








    }
}
