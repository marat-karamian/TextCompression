package compression;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Compression c = new Compression();
        System.out.println("Введите строку ->");
        Scanner in = new Scanner(System.in);
        System.out.println(c.Comp(in.nextLine()));
    }
}
