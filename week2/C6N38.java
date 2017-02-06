package week2;

/**
 * 6.38 random characters
 *
 * @author Sydney
 */
public class C6N38 {

    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {

            if (i % 10 == 1 && i != 1) {
                System.out.println();
            }

            System.out.print(getRandomUpperCaseLetter());

        }

        for (int i = 1; i <= 100; i++) {

            if (i % 10 == 1) {
                System.out.println();
            }

            System.out.print(getRandomDigitCharacter());

        }

    }

    public static char getRandomCharacter(char ch1, char ch2) {
        return (char) (ch1 + Math.random() * (ch2 - ch1 + 1));
    }

    public static char getRandomLowerCaseLetter() {
        return getRandomCharacter('a', 'z');
    }

    public static char getRandomUpperCaseLetter() {
        return getRandomCharacter('A', 'Z');
    }

    public static char getRandomDigitCharacter() {
        return getRandomCharacter('0', '9');
    }

    public static char getRandomCharacter() {
        return getRandomCharacter('\u0000', '\uFFFF');
    }

}
