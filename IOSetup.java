import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

class test {
    static final String INPUT = "io/input.txt";
    static final String OUTPUT = "io/output.txt";
    public static Scanner setIO(){
        // Defining FileInputStream and PrintStream objects
        FileInputStream instream = null;
        PrintStream outstream = null;

        try{
            instream = new FileInputStream(INPUT);
            outstream = new PrintStream(new FileOutputStream(OUTPUT));
            System.setIn(instream);
            System.setOut(outstream);
        }catch(Exception e){
            System.out.println("Error occurred = "+e);
        }

        Scanner input = new Scanner(System.in);
        return input;
    }
    public static void main(String[] args){
        Scanner input = setIO();

        int x = input.nextInt();
        System.out.println(x*3);
        return;
    }
}
