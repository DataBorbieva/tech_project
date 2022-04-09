package methods;

import utilities.CharacterHelper;

public class PracticeCharacterHelper {
    public static void main(String[] args) {
        char c1 = 32;
        char c2 = 'c';

        System.out.println("Does method isSpace contain space? " + CharacterHelper.isSpace(c1));
        System.out.println("Does method isSpace contain space? " + CharacterHelper.isSpace(c2));

    }
}
