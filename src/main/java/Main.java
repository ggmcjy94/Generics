

public class Main {

    public static void main(String[] args) {
        // integer generic
        Test<Integer> iObj = new Test<Integer>(15);
        Test<Integer> iObj2 = new Test<>(17);
        System.out.println("iObj.getObj() = " + iObj.getObj());

        // string generic
        Test<String> sObj = new Test<String>("Generic in Java");
        System.out.println("sObj.getObj() = " + sObj.getObj());

        // double generic
        DoubleTest<String, Integer> stringIntegerDoubleTest = new DoubleTest<>("hello generics", 15);
        stringIntegerDoubleTest.print();


        GenericDisplay.Display(11);
        GenericDisplay.Display("GeeksForGeeks");
        GenericDisplay.Display(1.0);
    }
}




