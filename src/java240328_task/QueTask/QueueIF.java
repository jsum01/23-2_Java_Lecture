package java240328_task.QueTask;

public interface QueueIF<E> {

    /**
     * 큐 가장 마지막에 요소를 추가
     * 추가할 때 ob가 어떤 자료형인지 파악하고 각 자료형에 맞는 Queue에 추가하고 해당 자료형의 count++를 한다.
     * @return 큐에 요소가 정상적으로 추가되었을 경우 true를 반환
     */
    boolean offer(E ob);

    /**
     * 큐 크기 측정
     *
     * @return 큐 리스트 내의 요소 개수를 반환
     */
    int size();

    boolean isEmpty();

    /**
     * 큐 첫 번째 요소 삭제 -> 삭제 된 요소를 반환
     * 반활할 때 어떤 자료형인지 판단하고, 해당 자료형의 count--를 한다.
     * @return 큐의 삭제 된 요소 반환
     */
    E poll();

    /**
     * 큐 첫 번째 요소 반환
     *
     * @return 큐의 첫 번째 요소 반환
     */
    E peek();
}