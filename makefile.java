
import java.util;
import java.io;
import java.io.FileWriter;
import java.io.IOException;
public class Assignment7 {
    public static void main (String[] args)
            throws FileNotFoundException {
        System.out.println("Enter the name of your file:");
        Scanner readFile = new Scanner(System.in);
        String fileName = readFile.nextLine();
        try {
            FileWriter output = new FileWriter("output.txt");
            Scanner input = new Scanner(new File(fileName));
            while (input.hasNext()) {
                String word = input.next();
                if (word.contains("/n")) {
                    System.out.println(" dsafsd");
                }
                word = word.toLowerCase();
                word = eei(word);
                word = vowel(word);
                word = lasta(word);
                word = very(word);
                System.out.println(word);
                output.write(word + " ");
            }
            output.close();
        }
        catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    public static String vowel(String word){
        String newword = word;
        String vowels[] = {"a","e","i","o","u"};
        for(int i = 0; i < vowels.length; i++ ) {
            newword = newword.replace(vowels[i] + "r", vowels[i] + "h");
        }
        return newword;
    }
public static String lasta(String word){
        String newword = word;
        if(word.endsWith("a") && word.length() > 1){
            newword = word + "r";
        }
        return newword;
    }
    public static String very(String word){
        String newword = word;
        if(newword == "very"){
            newword = "wicked";
        }
        return newword;
    }
public static String eei(String word){
        String newword = word;
        if(word.endsWith("eer") || word.endsWith("ir")){
            newword = newword.substring(0,newword.length() - 1) + "yah";
        }
        if(word.endsWith("oor")){
            newword = newword.substring(0,newword.length() - 1) + "wah";
        }
        return newword;
    }
}
