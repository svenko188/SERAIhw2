package at.aau;

import org.junit.jupiter.api.Test;

    /* -1,0,1
     *
     * 448,449,450
     *
     * 599,600,601
     *
     * 1449,1500,1501
     * total: 12
     */

public class ComputerRecommenderTest {
    @Test
    void name() {
        RingBuffer<Integer> ringBuffer = new RingBuffer<Integer>(12);
        ringBuffer.push(-1);
        ringBuffer.push(0);
        ringBuffer.push(1);

        ringBuffer.push(448);
        ringBuffer.push(449);
        ringBuffer.push(450);

        ringBuffer.push(599);
        ringBuffer.push(600);
        ringBuffer.push(601);

        ringBuffer.push(1449);
        ringBuffer.push(1500);
        ringBuffer.push(1501);
    }
}
