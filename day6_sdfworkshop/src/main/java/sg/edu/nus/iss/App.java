package sg.edu.nus.iss;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/**
 * Hello world!
 *
 */
public class App 
{
    /**
     * @param args
     * @throws Exception
     */
    public static void main( String[] args ) throws Exception
    {
       

        File text = new File("C:/Users/HP/Desktop/VTTP/day 6 workshop/day6_sdfworkshop/src/main/Article.txt");

        List<String> noma = new ArrayList<String>();

        FileReader fr = new FileReader(text);

        BufferedReader br = new BufferedReader(fr);

        StringBuilder sbFileContent = new StringBuilder();

        String lineInput = "";

        while((lineInput = br.readLine()) !=null){
            sbFileContent.append(lineInput);
        }

        br.close();
        fr.close();

        //System.out.println(sbFileContent);

        //System.out.println(sbFileContent.toString().toLowerCase());

        String fileContent = sbFileContent.toString();

        fileContent = fileContent.toLowerCase();

        //System.out.println(fileContent);

//        fileContent = fileContent.replace('.', ' ');
//        fileContent = fileContent.replace(',', ' ');
//        fileContent = fileContent.replace('!', ' ');
//        fileContent = fileContent.replace('?', ' ');
//        fileContent = fileContent.replace('@', ' ');
//        fileContent = fileContent.replace('#', ' ');
//        fileContent = fileContent.replace('$', ' ');
//        fileContent = fileContent.replace('%', ' ');
//        fileContent = fileContent.replace('^', ' ');
//        fileContent = fileContent.replace('*', ' ');
//        fileContent = fileContent.replace('(', ' ');
//        fileContent = fileContent.replace(')', ' ');
//        fileContent = fileContent.replace('"', ' ');



        String[] STOPWORDS = {
            "a", "about", "above", "after", "again", "against", "all", "am", "an", "and", "any", "are", "aren't", "as", "at", "be",
            "because", "been", "before", "being", "below", "between", "both", "but", "by", "can't", "cannot", "could",
            "couldn't", "did", "didn't", "do", "does", "doesn't", "doing", "don't", "down", "during", "each", "few", "for", "from",
            "further", "had", "hadn't", "has", "hasn't", "have", "haven't", "having", "he", "he'd", "he'll",
            "he's", "her", "here", "here's", "hers", "herself", "him", "himself", "his", "how", "how's", "i", "i'd", "i'll",
            "i'm", "i've", "if", "in", "into", "is", "isn't", "it", "it's", "its", "itself", "let's", "me", "more",
            "most", "mustn't", "my", "myself", "no", "nor", "not", "of", "off", "on", "once", "only", "or", "other", "ought",
            "our", "ours", "ourselves", "out", "over", "own", "same", "shan't", "she", "she'd", "she'll", "she's", "should",
            "shouldn't", "so", "some", "such", "than", "that", "that's", "the", "their", "theirs", "them", "themselves", "then",
            "there", "there's", "these", "they", "they'd", "they'll", "they're", "they've", "this", "those", "through", "to",
            "too", "under", "until", "up", "very", "was", "wasn't", "we", "we'd", "we'll", "we're", "we've", "were",
            "weren't", "what", "what's", "when", "when's", "where", "where's", "which", "while", "who", "who's", "whom", "why",
            "why's", "with", "won't", "would", "wouldn't", "you", "you'd", "you'll", "you're", "you've", "your", "yours",
            "yourself", "yourselves"
        };

        String [] fileContentArray = fileContent.split(" ");

        System.out.println("The total number of words is : " + fileContentArray.length);

        for(int t = 0; t <fileContentArray.length; t++){
            
            fileContentArray[t] = fileContentArray[t].replaceAll("\\p{P}", " ");
            

       // fileContent = fileContent.replaceAll("\\p{P}", " ");
        
        }

    //    String fileContents = fileContent;
        

   //     String [] fileContentArray = fileContent.split(" ");

     //   String [] fileContentArrays = fileContents.split(" ");

         System.out.println("The total number of words is : " + fileContentArray.length);

        Set<String> listOfWords = new HashSet<>();

        for(String words: fileContentArray){

          // System.out.println(words);
            if(!listOfWords.contains(words)){
          listOfWords.add(words);
            }
        }
            System.out.println("The number of unique words including stop words is : " + listOfWords.size());


    //      for(String hi: STOPWORDS);{
            
   //         if(words.equalsIgnoreCase(fileContentArray[t]))
        


    //      for(int t = 0; t <fileContentArray.length; t++){
    //      if(!words.equalsIgnoreCase(fileContentArray[t])){
            

            for(int i = 0; i < STOPWORDS.length; i++){

                listOfWords.remove(STOPWORDS[i]);
       //     if(!words.equalsIgnoreCase(STOPWORDS[i])){
        //        for(int t = 0; t <fileContentArray.length; t++){
          //          if(!words.equalsIgnoreCase(fileContentArray[t])){
                        
                    }

                   

       //         }


     //           listOfWords.add(words);
   //         }
     //     } 
     //   }

        System.out.println("The number of unique words is : " + listOfWords.size());

     //   Iterator itr = listOfWords.

        }


    }





    

