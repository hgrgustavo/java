// A simple annotation type
@interface MyAnno { // '@' means annotation is being declared
  String str();   // Annotations only have empty-methods
  int val();      // Should precede any declarition
}                // Even annotations can be annotaded ~_^


// Annotate a method
@MyAnno(str = "Annotation Example", val = 100)
public static void myMeth() { // ... 
}


// When an Override happen, it SHOULD BE annotated.
@Override
void mySuperMethod() { ... }


// Annotations can include elements, WITH or WITHOUT a value.
@Author (
  name = "Benjamin Franklin",
  date = "3/27/2003"
)
class MyClass { ... }


// Annotations elements can be ommited, if he is singular in the class.
@SuppressWarnings(value = "unchecked")
void myMethod() { ... }

@SuppressWarnings("unchecked")
void myMethod() { ... }


// Annotations WITHOUT elements do not require ().
@Override
void myMethod() { ... }


// Multiple Annotations can be declared!
@Author(name = "Jane Doe")
@EBook
class MyClass() { ... }


// Annotation is a java.lang type. They are defined in java.lang.annotation

// Java has its own predefined annotations
@Override
@SuppressWarnings


// Annotations can be used to create
new @Interned MyObject();


// Annotations can be used to casting
myString = (@NonNull String) str;


// Annotations can be used in implementations
class UnmodifiableList<T> implements
  @Readonly List<@Readonly T> { ... }


// Annotations can be used in exception throwing
void monitorTemperature() throws
  @Critical TemperatureExcpetion { ... }
  
  
// Annotations can be repeated. Repeated annotations are stored in his own container.
@Schedule(dayOfMonth = "last")
@Schedule(dayOfWeek = "Fri", hour = "23")
public void doPeriodicCleanup() { ... }

@Alert(role = "Manager")
@Alert(role = "Admin")
public class UnauthorizedAccessException extends SecurityException { ... }

// Repeating an Annotation Type.
import java.lang.annoation.Repeatable;

@Repeatable(Schedules.class)             // @Repeatable is a meta-annotation, meaning that ALL @Schedule will be stored in @Schedules.
public @interface Schedule {
  String dayOfMonth() default "first";
  String dayOfWeek() default "mon";
  int hour() default 12;
}

public @interface Schedules {            // Declaring @Schedules. All @Schedule will be stored in an array of type Schedule.
  Schedule[] value();
}


// Annotations can be retrieved
AnnotatedElement.getAnnotation(Class<T>);
AnnotadedElement.getAnnotationByType(Class<T>);


// Annotations can be restricted
@Target                           // @Target is a meta-annotation


