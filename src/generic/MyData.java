package generic;

/**
 * Background issue :
 * when we have a variable that we suspect that variable can store any kind of data, can be integer, can be string, etc
 * we will make it as Object type, and we will do type check and casting in runtime to use that variable
 * Generic is a way to do it with better, while class or interface receive parameter type (class or method level)
 * and type checking is executed
 * while compile time
 *
 * Notes :
 * Generic just can receive Object type, it cannot use primitive type
 * Because when runtime generic is converted to be Object, and primitive type is not inheritance from Object class
 *
 * Naming Convention :
 * E - Element usually collection
 * K - Key
 * N - Number
 * T - Type
 * V -  Value
 */
public class MyData<T> {
    private T data;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public MyData(T data) {
        this.data = data;
    }
}
