import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        writeFile();
        readFile();
    }

    public static void createFile(){
        File file=new File("src/ogrenciler.txt");
        try {
            if(file.createNewFile()){
                System.out.println("Dosya oluşturuldu...");
            }else{
                System.out.println("Dosya zaten oluşturuldu...");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void getFile(){
        File file=new File("src/ogrenciler.txt");
        if(file.exists()){
           System.out.println("Dosya adı "+file.getName());
           System.out.println("Dosya yolu "+file.getAbsolutePath());

        }
    }

    public static void readFile(){
        File file=new File("src/ogrenciler.txt");
        try {
            Scanner myreader=new Scanner(file);
            while (myreader.hasNextLine()){
                String line=myreader.nextLine();
                System.out.println(line);
            }
            myreader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void writeFile(){
        try {
            FileWriter file=new FileWriter("src/ogrenciler.txt",true);

            file.write("Ummahan");
            file.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
