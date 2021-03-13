public interface LambdaInterface {
    void tellMe();
    default void sayHello(){
        System.out.println("Hello!");
    }
}
