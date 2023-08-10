import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = new FileWriter("Alphabet.txt");
        fileWriter.write("A a\n");
        fileWriter.write("B b\n");
        fileWriter.write("C c\n");
        fileWriter.write("D d\n");
        fileWriter.write("E e\n");
        fileWriter.write("F f\n");
        fileWriter.write("G g\n");
        fileWriter.write("H h\n");
        fileWriter.write("I i\n");
        fileWriter.write("J j\n");
        fileWriter.write("K k\n");
        fileWriter.write("L l\n");
        fileWriter.write("M m\n");
        fileWriter.write("N n\n");
        fileWriter.write("O o\n");
        fileWriter.write("P p\n");
        fileWriter.write("Q q\n");
        fileWriter.write("R r\n");
        fileWriter.write("S s\n");
        fileWriter.write("T t\n");
        fileWriter.write("U u\n");
        fileWriter.write("V v\n");
        fileWriter.write("W w\n");
        fileWriter.write("X x\n");
        fileWriter.write("Y y\n");
        fileWriter.write("Z z\n");


        fileWriter.close();

        FileReader fileReader = new FileReader("Alphabet.txt");
        Scanner scanner = new Scanner(fileReader);
        int num =1;
        for (int i = 0; i < num; i++) {

        }

        while (scanner.hasNextLine()){
            System.out.println(num  +" : " + scanner.nextLine());
            num++;
        }
        fileReader.close();

    }
}