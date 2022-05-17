package collections.linkedList;

import java.util.LinkedList;

public class ArrayListVsLinkedList {
    public static void main(String[] args) {
        System.out.println("-----------");
        LinkedList<Double> numbers = new LinkedList<>();
        numbers.add(10.5);
        numbers.add(12.5);
        numbers.add(13.3);
        numbers.add(17.7);
        System.out.println(numbers); //[10.5, 12.5, 13.3, 17.7]

        System.out.println("\n-----------");
        for (Double number : numbers) {
            System.out.println(number);
        }

        System.out.println("\n------Methods of LinkedList-----");
        numbers.get(0); //10.5
        numbers.getFirst(); //10.5
        System.out.println(numbers.getLast()); //17.7

        System.out.println("\n------Additional Methods of LinkedList-----");
        System.out.println(numbers.peek()); //getFirst() 10.5
        System.out.println(numbers.peekFirst()); //10.5
        System.out.println(numbers.peekLast()); //17.7

        System.out.println(numbers); //[10.5, 12.5, 13.3, 17.7]

        System.out.println("\n--------POLL METHOD , it removes");
        System.out.println(numbers.poll()); //it gets first element and removes it //10.5
        System.out.println(numbers); //[12.5, 13.3, 17.7]
        System.out.println(numbers.pollFirst()); // also retrieves first element //12.5

        System.out.println(numbers.pollLast()); //17.7
        System.out.println(numbers);  //[13.3]

        System.out.println("----------PUSH METHOD-----------");
        numbers.push(5.7); //adds the object to the head (to the zero index)
        numbers.push(8.9);
        System.out.println("----------POP METHOD-----------");
        System.out.println(numbers.pop()); //removes the object from the head(from zero index)
        System.out.println(numbers);





    }
}
