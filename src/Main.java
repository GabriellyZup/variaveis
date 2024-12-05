//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int [] array = {1, 2, 3, 4, 5};

    //exercício 1: Laço for
        for (int index = 0; index < array.length; index++) {
            System.out.println(array[index]);
        }

    //exercício 2: laço while
        int index = 0;
        while (index < array.length) {
            System.out.println(array[index]);
            index++;
        }
    }
}