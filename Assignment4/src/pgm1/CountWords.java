package pgm1;
import java.io.*;
import java.util.*;
import java.util.Map;
import java.util.Scanner;

public class CountWords
{
private CountWords(String filename, Map< String, Integer> words) throws FileNotFoundException
{
Scanner file=new Scanner (new File(filename));
while(file.hasNext()){
String word=file.next();
Integer count=words.get(word);
if(count!=null)
count++;
else
count=1;
words.put(word,count);
}
file.close();
}
public static void main(String[] args)
{
Map<String,Integer> words=new HashMap<String, Integer>();
CountWords11("C:\\Users\\tanay\\eclipse-workspace\\java training\\src\\main\\java\\story.txt",words);
System.out.println(words);
}
@SuppressWarnings("unused")
private static void CountWords11(String string, Map<String, Integer> words) {
	// TODO Auto-generated method stub
	
}
@SuppressWarnings("unused")
private static void CountWords1(String string, Map<String, Integer> words) {
	// TODO Auto-generated method stub
	
}
}