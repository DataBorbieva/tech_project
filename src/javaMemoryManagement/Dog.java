package javaMemoryManagement;

public class Dog {

    public String bread;
    public int age;

    @Override
    protected void finalize(){
        System.out.println("A dog object is garbage collected");
        System.out.println("The object is =========== " + this.getClass().hashCode());
    }
}
