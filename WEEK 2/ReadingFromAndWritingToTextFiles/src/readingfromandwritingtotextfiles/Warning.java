package readingfromandwritingtotextfiles;
// **************************************************************************** 
// Warning.java 
// Andika Yudha Riyanto - 191524034
// D4-2B Teknik Informatika
// Politeknik Negeri Bandung 
// Reads student data from a text file and writes data to another text file. 
// **************************************************************************** 
import java.util.Scanner; 
import java.io.*; 
public class Warning  
{  
    // --------------------------------------------------------------------   
    // Reads student data (name, semester hours, quality points) from a   
    // text file, computes the GPA, then writes data to another file   
    // if the student is placed on academic warning.  
    // --------------------------------------------------------------------   
    public static void main (String[] args)  
    {   
        String name;        // name of students
        int creditHrs ;     // number of semester hours earned   
        double qualityPts ; // number of quality points earned   
        double gpa ;        // grade point (quality point) average  
      
        String inputName = "C:\\Users\\ANDIKA YUDHA RIYANTO\\Documents\\GitHub\\APPL1\\WEEK 2\\"
                + "ReadingFromAndWritingToTextFiles\\src\\readingfromandwritingtotextfiles\\students.txt";  
        String outputName = "C:\\Users\\ANDIKA YUDHA RIYANTO\\Documents\\GitHub\\APPL1\\WEEK 2\\"
                + "ReadingFromAndWritingToTextFiles\\src\\readingfromandwritingtotextfiles\\warning.txt"; 
                
 
        try  
        {  
          // Set up scanner to input file  
            Scanner scan = new Scanner(new FileInputStream(inputName));
          // Set up the output file stream  
            PrintWriter outFile = new PrintWriter(new FileWriter(outputName));  
          // Print a header to the output file  
            outFile.println("Students on Academic Warning"); 
            outFile.println("============================"); 
            outFile.println("Name \t GPA\t CreditHrs");
            outFile.println("============================"); 
            // Process the input file, one token at a time    
            while (scan.hasNext())  
            {  
                // Get the credit hours and quality points and
                name = scan.next();
                creditHrs = Integer.parseInt(scan.next());
                qualityPts = Double.parseDouble(scan.next());                

                gpa = qualityPts/creditHrs;
                // determine if the student is on warning. If so,
                if ((gpa < 1.5 && creditHrs < 30) || (gpa < 1.75 && creditHrs < 60) 
                        || (gpa < 2.0 && creditHrs >= 60))
                {
                    // write the student data to the output file.
                    outFile.print(name + "\t ");
                    outFile.print(creditHrs + "\t ");
                    //membulatkan bilangan desimal
                    outFile.println(Math.round(gpa*100.0)/100.0);
                }                         
            }  
            // Close output file
              
            outFile.close();
            System.out.println("File has been written"); 
        }  
        
      // catch exeception
        catch (FileNotFoundException exception)  
        {  
            System.out.println ("The file " + inputName + " was not found.");   
        }  
        catch (IOException exception)  
        {  
            System.out.println (exception);  
        }  
        catch (NumberFormatException e)  
        {  
            System.out.println ("Format error in input file: " + e);   
        }  
 
    }  
}