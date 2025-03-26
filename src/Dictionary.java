import java.io.*;
import java.util.*;
public class Dictionary {

    //Using Hashset(unique elements will be stored in unordered fashion)
    // as it takes **constant time that is O(1)** for insertion, removing, searching.
    //**Space complexity will be O(n)**
    private Set<String> dictionary=new HashSet<>();

    //a method which load the dictionary and afterwards return its size.
    //Using bufferedReader class which is efficient for long data set.
    public int dictionaryLoader(String filename){

        //try with resource which automatically closes the resource after use.
        try(BufferedReader br=new BufferedReader(new FileReader(filename))){

            String word="";
            //checking and inserting on the same line preventing extra iteration
            // which would leads to null pointer exception.
            while((word=br.readLine())!=null){
                //removes extra spaces & convert to lower case.
                word=word.trim().toLowerCase();
                //before adding word to dictionary, condition checking:
                //word is not empty & no numbers or special character is allowed in dictionary.
                if(!word.isEmpty() && word.matches("[a-z]+"))
                    dictionary.add(word);
            }
        }
        //child class of Exception which handles errors regarding IO operation
        catch(IOException e){
            System.out.println("error reading file:\t"+e.getMessage());
        }
        //parent level class which handles any other error in respective block.
        catch(Exception e){
            System.out.println("error:\t"+e.getMessage());
        }
        //returns the size of respective dictionary.
        return dictionary.size();
    }

    //a method which searches the argument present in respective dictionary.
    public boolean searchWord(String word){
        //checks for not null condition
        if(word!=null){
            //trimming removes white spaces from both ends.
            //coverts to lowercase for insensitive structure.
            word=word.trim().toLowerCase();
            //after removing white space string must not empty
            if(word.isEmpty())
                return false;
            //return statement based on dictionary having respective word.
            return dictionary.contains(word);
        }
        else return false;
    }
}