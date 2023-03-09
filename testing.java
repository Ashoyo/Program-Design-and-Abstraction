

Page
1
of 2
import java.util.ArrayList;
import java.util.*;
import java.*;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Array;
import java.security.Principal;
public class Testing {
    public static void main(String[] args) {
        
    
    private ArrayList <Question> questions;
    private int total;
    
    set()
    ending()
    testing()
)
public void testing(String filename) throws IOException {
    
    FileWriter a= new FileWriter(filename);
    for (i=0; i<questions.size()i++){
        a.write("question"+ (i+1)+ "\n"));
        a.write(" Answer= " +"\n");
        a.write(questions.get(i).answer()+ "\n");
}
a.close();
    public void set() {
        for (i=0; i<questions.size()i++){
            total += questions.get(i).getTotalpoints();
        }
    }
public void ending(String filename) throws IOException
{
    FileWriter a= new FileWriter(filename);
    for (i=0; i<questions.size()i++){
        a.write("question"+ (i+1)+ "\n"));
        a.write(questions.get(i).answer()+ "\n");
}
a.close();
}
