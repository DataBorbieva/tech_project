package singleton;

public class Test {
    public static void main(String[] args) {

/*
 This is not possible anymore as constructor is private
        Driver d1 = new Driver();
        Driver d2 = new Driver();
        System.out.println(d1);//singleton.Driver@1b6d3586
        System.out.println(d2);//singleton.Driver@4554617c
        */


        System.out.println(Driver.getDriver()); //singleton.Driver@1b6d3586
        System.out.println(Driver.getDriver()); //singleton.Driver@4554617c
        System.out.println(Driver.getDriver()); //singleton.Driver@1b6d3586
    }
}
