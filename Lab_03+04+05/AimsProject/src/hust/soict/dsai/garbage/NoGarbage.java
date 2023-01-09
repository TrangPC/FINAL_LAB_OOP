package hust.soict.dsai.garbage;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.lang.String;
public class NoGarbage {

	 public static void main(String[] args) throws IOException {
	        String filename = "C:\\Users\\Admin\\eclipse-workspace\\OtherProjects\\src\\hust\\soict\\dsai\\garbage\\testfile.txt";

	        byte[]  inputBytes = { 0 };
	        long startTime, endTime;
	        inputBytes = Files.readAllBytes(Paths.get(filename));
	        startTime = System.currentTimeMillis();
	        NoGarbage outputStringBuffer = new NoGarbage();
	        for (byte b : inputBytes){
	            ((Appendable) outputStringBuffer).append((char)b);
	        }
	        endTime = System.currentTimeMillis();
	        System.out.println(endTime - startTime);
	    }
	}