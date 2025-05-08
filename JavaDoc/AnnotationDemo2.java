package JavaDoc;

import java.lang.annotation.Annotation;

@interface MyAnno{ //if any of the following values are not mandatory, we can use default as shown in version
    String name(); //metadata
    String project(); //metadata
    String date(); //metadata
    String version() default "13"; //metadata
}

@MyAnno(name="John", project = "Demo", date = "01/01/2025", version = "13") //We could remove the version here because it is default, as w eshow above
public class AnnotationDemo2 {

    int data;
    public static void main(String args[]){
        int x;
    }
    
}

/**
 * Other Annotations
 * 
 * Retention: Available within a class, at runtime, or source code
 * 
 * Documented: Means this annotation will be available in java documents (JavaDoc)
 * 
 * Target: Define the target of this annotation (Constructor, Field, Local Variable, Method, Module)
 * 
 * Inherited: If used upon one of the class, then the annotation is also applicable on child clasess
 * 
 * Repeatable
 */
