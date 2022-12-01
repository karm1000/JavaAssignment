import java.util.Random;

class Queue{
    int[] a;
    int size = 50;
    int front = -1;
    int rear = -1;
    boolean operationRunning = false;
    boolean firstOp = false;

    public Queue(int size){
        this.size = size;
        a = new int[this.size];
    }

    public Queue(){
        a = new int[this.size];
    }

    public synchronized void enQueue(int n){
        try {
            if(operationRunning){
                wait();
            }else {
                operationRunning = true;
                if(full()){
                    System.out.println("Queue is Full");
                    operationRunning = false;
                    wait();
                }
                if(front==-1){
                    front = 0;
                }
                rear = (rear+1)%size;
                a[rear] = n;
                System.out.println(n + " enQueued");
                operationRunning = false;
                notify();

            }

        }catch (Exception e){
            System.out.println(e);
        }
    }
    public synchronized void deQueue(){
        try {
            if(operationRunning){
                wait();
            }else {
                operationRunning = true;
                if(empty()){
                    System.out.println("Queue is Empty!!");
                    operationRunning = false;
                    wait();
                }
                int temp = a[front];
                if(front==rear){
                    front = -1;
                    rear = -1;
                }else {
                    front = (front+1)%size;
                }
                System.out.println(temp + " deQueued!!");
                operationRunning = false;
                notify();

            }
        }catch (Exception e){
            System.out.println(e);
        }
    }

    public boolean empty(){
        if(front==-1 && rear==-1)return true;
        return false;
    }
    public boolean full(){
        if((rear+1)%size == front) return true;
        return false;
    }

    public void printQueue(){
        for(int i=front;i<=rear;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
}

class OperationQ extends Thread
{
    static int noOfOperations = 0;
    Queue q;
    String op;
    Random ran = new Random();
    OperationQ(String op,Queue q){
        super(op);
        this.op = op;
        this.q = q;
        start();
    }
    private static synchronized void noOfOperationsPlusPlus(){
        noOfOperations++;
    }
    @Override
    public void run() {
        try {
            while (noOfOperations<200 && op=="en"){
                q.enQueue(ran.nextInt(100));
                noOfOperationsPlusPlus();
            }
            while (noOfOperations<200 && op=="de"){
                q.deQueue();
                noOfOperationsPlusPlus();
            }
        }catch (Exception e) {
            System.out.println(e);
        }
    }
}

public class QueueSimulation {
    public static void main(String[] args) throws InterruptedException {
        Queue q1 = new Queue(10);


        OperationQ en = new OperationQ("en",q1);
        OperationQ de = new OperationQ("de",q1);

        en.join();
        de.join();

        q1.printQueue();

    }
}
