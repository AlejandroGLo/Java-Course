public class GenericDemo<T> { //<T> makes the class generic

    T data[] =(T[]) new Object[3]
    public static void main(String args[]){

        //CLASS OBJECT
        Object obj = new String("Hello");
        obj = new Integer(10);
        //String str = (String)obj; Can only be done using type casting (string) is type casting

        //ARRAY OF OBJECT
        Object obj1[] = new Object[3];

        String s[]=new String[3];

        obj1[0] = "hi";
        obj1[1] = "bye";
        obj1[2] = new Integer(10);

        String str;
        for(int i=0; i<3; i++){
            str=(String)obj1[i];
            System.out.println(str);
        }

        //gE
        GenericDemo<String> gd=new GenericDemo(); //T outside of the main method takes whatever type is written here <String> 
        gd.data[0]="hi";
        gd.data[1]="bye";
        //gd.data[2]=new Integer(10); // Since we are using String type this gives error

        String str1=gd.data[0];

    }
    
}
