/*
 * Принимает от пользователя строку вида
text~num
Нужно рассплитить строку по ~, сохранить text в связный список на позицию num.
Если введено print~num, выводит строку из позиции num в связном списке и удаляет её из списка.
 */

package HW4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class hw41 {
    public static void main(String[] args) {

        Scanner iScanner = new Scanner(System.in);
        int arraysize = 10;
        ArrayList<String> texts = new ArrayList<String>(arraysize);
        for (int i = 0; i <= arraysize - 1; i++) {
            texts.add(i, "");
        }
        boolean run = true;
        while (run) {
            String couple = iScanner.nextLine();
            String[] split = couple.split("~");
            String word = split[0];
            String numberString = split[1];
            int number = Integer.parseInt(numberString);
            System.out.println(Arrays.toString(split));

            if (word.equals("print")) {
                System.out.println(texts.get(number).toString());
                texts.remove(number);
                System.out.println(texts);
            } else if (word.equals("exit")) {
                run = false;
            } else {
                texts.set(number, word);
                System.out.println(texts);
            }
        }
        iScanner.close();
        System.out.println(texts);
    }
}
