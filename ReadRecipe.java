import java.io.BufferedReader;
//import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class ReadRecipe {
    public static void main(String[] args) throws Exception {
        int N;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Recipe Number \n" + "1 for Biryani \n" +
                "2 for chicken curry \n" +"3 for Palak \n" + "4 for Egg curry");
        N = sc.nextInt();
        switch (N) {
            case 1:
                FileReader file1 = new FileReader("./Biryani.txt");
                BufferedReader Read1 = new BufferedReader(file1);
                String Details1;
                while ((Details1 = Read1.readLine()) != null) {
                    System.out.println(Details1);
                }
                file1.close();
                break;
            case 2:
                FileReader file2 = new FileReader("./ChickenCurry.txt");
                BufferedReader Read2 = new BufferedReader(file2);
                String Details2;
                while ((Details2 = Read2.readLine()) != null) {
                    System.out.println(Details2);
                }
                file2.close();
                break;
            case 3:
                FileReader file3 = new FileReader("./Palak.txt");
                BufferedReader Read3 = new BufferedReader(file3);
                String Details3;
                while ((Details3 = Read3.readLine()) != null) {
                    System.out.println(Details3);
                }
                file3.close();
                break;
            case 4:
                FileReader file4 = new FileReader("./EggCurry.txt");
                BufferedReader Read4 = new BufferedReader(file4);
                String Details4;
                while ((Details4 = Read4.readLine()) != null) {
                    System.out.println(Details4);
                }
                file4.close();
                break;

            default:
                FileReader file5 = new FileReader("./BasicCurry.txt");
                BufferedReader Read5 = new BufferedReader(file5);
                String Details5;
                while ((Details5 = Read5.readLine()) != null) {
                    System.out.println(Details5);
                }
                file5.close();


        }
    }
}