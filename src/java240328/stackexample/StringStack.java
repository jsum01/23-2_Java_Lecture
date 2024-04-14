package java240328.stackexample;

public class StringStack implements StackIF {
    String[] Data = new String[5];
    int top = -1; // 기본 값 -1
    public int length() {
        return top + 1;
    }

    public String pop() {
        if(top < 0) { // 반환할 값이 없다.
            System.out.println("underflow");
            return null;
        } else {
//            String returnOb = Data[top];
//            top--;
//            return returnOb;
            return Data[top--]; // 위의 코드와 같은 역할
        }
    }

    public boolean push(String ob) {
        if(top == Data.length - 1) { // == 4
            System.out.println("overflow!");
            return false;
        } else {
            //top++; // top을 증가시키고
            Data[++top] = ob; // 해당 위치에 전달받은 값을 삽입
            System.out.println("complete");
            return true;
        }
    }
}
