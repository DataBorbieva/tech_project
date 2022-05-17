package javaMemoryManagement;

public class StringBufferExample {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");

        sb.setCharAt(2,'X');
        System.out.println(sb); //HeXlo

        sb.reverse();
        System.out.println(sb); //olXeH

        sb.insert(0,"Hey ");
        System.out.println(sb); //Hey olXeH

    }
}
