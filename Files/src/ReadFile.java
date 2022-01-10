import java.io.FileInputStream;
import java.io.IOException;

public class ReadFile{
    public static void main(String[] args) throws IOException {
   	 //same code for FR
   	 FileInputStream fi=new FileInputStream("a.txt");
   	 //fi.read()--->integer values -1
   	 //a single byte info a-only ascii value
   	 int i=0;
   	 //need to read all the charcters ascii value untill i get the EOF
    while((i=fi.read())!=-1) {
   	 System.out.print((char)i);

   	 
    }
    fi.close();
   	 
    }
}

