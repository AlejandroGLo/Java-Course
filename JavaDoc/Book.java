/** @author Alejandro Galvez 
 * @version 2.0
 * @since 2015
*/
package JavaDoc;

/**
 * 
 * Class for Library Book
 */

public class Book {

    /**
     * @value 10 default value
     */

    static int val = 10;

    /**
     * 
     * @param s Book Name
     */


    public Book(String s){

    }

    /**
     * Issue a Book to a Student
     * @param roll Roll number of a student
     * @throws Exception If book is not available, throws Exception
     */

    public void issue(int roll) throws Exception{

    }

    /**
     * Check if book is available
     * @param str Book Name
     * @return  if book is available returns true, else false
     */

    public boolean available(String str){
        return true;
    }

    /**
     * Get Book Name
     * @param id Book id
     * @return Returns Book name
     */

    public String getName(int id){
        return "";
    }
    
}
