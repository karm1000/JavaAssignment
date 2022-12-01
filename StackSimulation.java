
import java.lang.reflect.Array;
import java.util.Random;

class Stack{
    private int[] a;
    private int index=-1;
    private int size = 50;
    boolean firstOp = false;
    boolean operationRunning = false;

    public Stack(int size){
        this.size = size;
        a = new int[this.size];
    }
    public Stack(){
        a = new int[this.size];
    }

    public synchronized void push(int n){
        try {
            if(!operationRunning && !firstOp){
                firstOp = true;
                operationRunning = false;
            }
            if(operationRunning){
                System.out.println("sdffd"+operationRunning);
                wait();
            }else {
                operationRunning = true;
                if (full()) {
                    System.out.println("Stack is Full!!");
                    System.out.println(this);
                    operationRunning = false;
                    wait();
                }
//                operationRunning = true;
                a[++index] = n;
                System.out.println(n + " pushed");
                operationRunning = false;
                notify();
            }

        }catch (Exception e){
            System.out.println(e);
        }
    }
    public synchronized void pop(){
        try {

            if(!operationRunning && !firstOp){
                operationRunning = false;
                firstOp = true;
            }
            if(operationRunning){
                wait();
            }else {
                operationRunning = true;
                if (empty()) {
                    System.out.println("Stack is empty!!");
                    operationRunning = false;
                    wait();
                }
//                operationRunning = true;
                System.out.println(a[index--] + " popped");
                operationRunning = false;
                notify();
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }
    public boolean full(){
        if(index==size-1)return true;
        return false;
    }
    public boolean empty(){
        if(index==-1)return true;
        return false;
    }

    @Override
    public String toString() {
        String s = new String("");
        for (int n = 0;n<=index;n++){
            s+= (String.valueOf(a[n]) + " ");
        }
        return s;
    }

    public synchronized void printStack(){
        if(index==-1) System.out.println("Nothing To Show");
        System.out.println(this);
    }
}

class Operation extends Thread
{
    static int noOfOperations = 0;
    Stack s;
    String op;
    Random ran = new Random();
    Operation(String op,Stack s){
        super(op);
        this.op = op;
        this.s = s;
        start();
    }
    private static synchronized void noOfOperationsPlusPlus(){
        noOfOperations++;
    }
    @Override
    public void run() {
        try {
            while (noOfOperations<200 && op=="push"){
                s.push(ran.nextInt(100));
                noOfOperationsPlusPlus();
            }
            while (noOfOperations<200 && op=="pop"){
                s.pop();
                noOfOperationsPlusPlus();
            }
        }catch (Exception e) {
            System.out.println(e);
        }
    }
}

class StackSimulation {
    public static void main(String[] args) throws InterruptedException {
        Stack s1 = new Stack(50);
        Operation push = new Operation("push",s1);
        Operation pop = new Operation("pop",s1);

        push.join();
        pop.join();

        s1.printStack();

    }
}
