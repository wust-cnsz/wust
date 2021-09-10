package com.wust.structures;

public class ArrayQueueDemo {

    public static void main(String[] args) {
//        com.wust.structures.ArrayQueue queue = new com.wust.structures.ArrayQueue(3);
//        queue.addQueue(1);
//        queue.addQueue(4);
//        System.out.println("出队列 " + queue.getQueue());
//        queue.addQueue(6);
//        System.out.println("出队列 " + queue.getQueue());
//        queue.addQueue(7);


        CircleArrayQueue circleArrayQueue = new CircleArrayQueue(3);
        circleArrayQueue.addQueue(1);
        circleArrayQueue.addQueue(4);
        circleArrayQueue.addQueue(1);
        circleArrayQueue.addQueue(4);
        System.out.println("出队列 " + circleArrayQueue.getQueue());
        System.out.println("出队列 " + circleArrayQueue.getQueue());
        System.out.println("出队列 " + circleArrayQueue.getQueue());
        circleArrayQueue.addQueue(6);
        System.out.println("出队列 " + circleArrayQueue.getQueue());
        circleArrayQueue.addQueue(7);
    }
}

class CircleArrayQueue {
    private int[] arr;
    private int maxSize;
    private int front;
    private int rear;

    public CircleArrayQueue(int maxSize) {
        this.maxSize = maxSize;
        arr = new int[maxSize];
    }

    public boolean isFull(){
        return (rear + 1) % maxSize == front;
    }

    public boolean isEmpty(){
        return rear == front;
    }

    public void addQueue(int n){
        if(!isFull()){
            arr[rear] = n;
            rear = (rear + 1) % maxSize;
        }else{
            System.out.printf("队列满了");
        }
    }

    public int getQueue(){
        if(!isEmpty()){
            front++;
            return arr[front];
        }else {
            throw new RuntimeException("队列已经空了");
        }
    }

}
class ArrayQueue {
    private int[] arr;
    private int maxSize;
    private int front;
    private int rear;

    public ArrayQueue(int maxSize) {
        this.maxSize = maxSize;
        arr = new int[maxSize];
        front = -1;
        rear = -1;
    }

    public boolean isFull() {
        return rear == maxSize - 1;
    }

    public boolean isEmpty() {
        return rear == front;
    }

    public void addQueue(int n) {
        if (!isFull()) {
            rear++;
            arr[rear] = n;
        } else {
            System.out.printf("队列满了");
        }
    }

    public int getQueue() {
        if (!isEmpty()) {
            front++;
            return arr[front];
        } else {
            throw new RuntimeException("队列已经空了");
        }
    }
}