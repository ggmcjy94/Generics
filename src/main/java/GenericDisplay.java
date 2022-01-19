
public class GenericDisplay {

    static <T> void Display (T element) {
        System.out.println(element.getClass().getName() + " = " + element);
    }



}
