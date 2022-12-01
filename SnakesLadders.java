
class Game{
    int[][] board ={{5, 17},{14,2},{36,54},{53,97},{99,30},{93,47},{91,71}};
    int nextTurn=1;
    boolean playing;
    boolean isRunning = false;
    int noOfPlayers=0;
    int diceValue;
    public int getDice(){
        return ((int)(Math.random()*50))%6 +1;
    }
    public synchronized void throwDice(Player p)throws Exception{
        if(!isRunning && p.turn==1){
            isRunning = true;
        }
        if(p.turn!=nextTurn || playing==true){
            wait();
        }else {
            playing = true;
            System.out.println(p.name+"'s current position is "+p.currPos);
            this.diceValue = getDice();
            System.out.println("Dice value - "+diceValue);
            p.currPos = makeAMove(p.currPos,diceValue);
            System.out.println(p.name+"'s final position is "+p.currPos+"\n");
            nextTurn = (nextTurn%noOfPlayers)+1;
            playing = false;
            notifyAll();
        }
    }

    public int makeAMove(int currPos,int diceValue){
        int temp = currPos;
        currPos += diceValue;
        if(currPos<=100) {
            for (int i = 0; i < board.length; i++) {
                if (board[i][0] == currPos) {
                    if (board[i][0] > board[i][1]) {
                        System.out.println("Sneak Encountered!!");
                    } else {
                        System.out.println("Ladder Encountered!!");
                    }
                    currPos = board[i][1];
                }
            }

            return currPos;
        }else {
            return temp;
        }
    }


}

class Player implements Runnable{
    Game g;
    int currPos=0;
    String name;
    int turn;
    Thread t;

    Player(String name,Game g){
        this.name = name;
        this.g = g;
        t = new Thread(this,this.name);
        turn = ++this.g.noOfPlayers;
        System.out.println("No of Players " + this.g.noOfPlayers);
        t.start();
    }

    @Override
    public void run() {
        do{
            try {
                g.throwDice(this);
                if(this.currPos>=100){
                    g.isRunning = false;
                    System.out.println(this.name+" is Winner!!!!!!!");
                }
//                Thread.sleep(10);
            } catch (Exception e) {
                System.out.println(e);
                e.printStackTrace();
            }
        }while (g.isRunning);
    }
}




public class SnakesLadders {

    public static void main(String[] args) {
       Game g = new Game();
       Player p1 = new Player("Karm",g);
       Player p2 = new Player("Zalak",g);
       Player p3 = new Player("Aadhya",g);
       Player p4 = new Player("Bhaumik",g);
    }

}
