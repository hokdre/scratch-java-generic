package generic;

/**
 *
 * BoundedContext can use to constraint type of data that generic expected.
 * we can use multi constraint but just 1 extends, else constraint must be interface
 * <T extends Class1 & Interface1 & Interface2> :
 * generic just receive object that child class from class 1 and implement interface1 and interface2
 */
public class BoundedContext <T extends Number > {
    private T data;

    void Try(){
        // we get number method
        this.data.byteValue();
    }
}
