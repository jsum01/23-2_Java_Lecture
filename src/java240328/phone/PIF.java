package java240328.phone;
// Phone Interface
public interface PIF {
    final int TIMEOUT = 1000;
    public abstract void sendCall();
    public abstract void receiveCall();
    public default void printLogo() {
        System.out.println("**phone**");
    }
}
