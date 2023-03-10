package application;

import generic.CountArrayHelper;
import generic.MyData;
import generic.Pair;

public class GenericApp {
    public static void main(String[] args) {
        // 1. instance generic class
        // Generic cannot use primitive value
        MyData<String> stringMyData = new MyData<String>("name");
        MyData<Integer> intMyData = new MyData<>(1);

        // 2. multi parameter type
        Pair<Integer,String> myPair  = new Pair<>(1, "my pair");

        // 3. generic method
        Integer[] ints = {1,2,3};
        CountArrayHelper.<Integer>count(ints);
        CountArrayHelper.count(ints);

        // 4. invariant : anti polymorfisme
        // we cannot subtitute one type to other event their is super class and last class
        MyData<String> str = new MyData<>("data");
        MyData<Object> str1 = str; // error invariant

        MyData<Object> integer = new MyData<>(1);
        MyData<Integer> integer1 = integer; //error invariant

        // 5. covariant :
        // we can subtitute generic with supertype class
        // but covariant is just read only
        MyData<String> str2 = new MyData<>("abc");
        covariant(str2);

        // 6. contravariant
        // we can subtitue generic with child class
        // contravariant can write(safe) and read (unsafe)
        MyData<Object> str3 = new MyData<>("str3");
        MyData<? super String> str4 = str3;
        contravariant(str3);

        // 7. Wildcard
        wildcart(new MyData<Integer>(1));
        wildcart(new MyData<String>("123"));
    }

    // covariant just can receive subtitute as super class
    // and just read only
    public static void covariant(MyData<? extends Object> mydata) {
        System.out.println(mydata.getData()); // we can read the data

        mydata.setData("acc"); // error we cannot set the data
    }

    // Whilecard is allow us to passing all type data
    // it will be threat it as Object class
    public static void wildcart(MyData<?> mydata) {
        System.out.println(mydata.getData());
    }


    // contravariant receive super class of a type
    // write operation is safe, but read can be danger
    public static void contravariant(MyData<? super String> mydata) {
        mydata.setData("eko"); // safe to set data

    }
}
