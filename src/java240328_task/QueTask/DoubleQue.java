package java240328_task.QueTask;

public class DoubleQue implements QueueIF<Double> {
    Double[] data = new Double[5];
    int rear = 0;
    int count = 0;

    @Override
    public boolean offer(Double ob) {
        if (rear == data.length) {
            System.out.println("overflow");
            return false;
        } else {
            data[rear++] = ob;
            count++;
            System.out.println("complete");
            return true;
        }
    }

    @Override
    public int size() {
        return count;
    }

    @Override
    public boolean isEmpty() {
        return count == 0;
    }

    @Override
    public Double poll() {
        if (count == 0) {
            System.out.println("underflow");
            return null;
        } else {
            Double removedItem = data[0];
            for (int i = 0; i < rear - 1; i++) {
                data[i] = data[i + 1];
            }
            data[--rear] = null;
            count--;
            return removedItem;
        }
    }

    @Override
    public Double peek() {
        if (count == 0) {
            System.out.println("underflow");
            return null;
        } else {
            return data[0];
        }
    }
}