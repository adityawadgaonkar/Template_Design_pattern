abstract class Game {
    public void play(){
        initialize();
        startPlay();
        endPlay();
    }

    abstract void initialize();

    abstract void startPlay();

    abstract void endPlay();
}

class FootBall extends Game {
    void initialize() {
        System.out.println("Initialize the FootBall Game");
    }

    void startPlay() {
        System.out.println("Start playing the FootBall Game");
    }

    void endPlay() {
        System.out.println("Stop playing the FootBall Game");
    }
}

class Cricket extends Game {
    public void initialize() {
        System.out.println("Initialize the Cricket Game");
    }

    public void startPlay() {
        System.out.println("Start playing the Cricket Game");
    }

    public void endPlay() {
        System.out.println("Stop playing the Cricket Game");
    }
}

class Demo {
    public static void main(String args[]) {
        FootBall fb = new FootBall();
        System.out.println("------------FootBall Game------------");
        fb.play();

        Cricket c = new Cricket();
        System.out.println("------------Cricket Game------------");
        c.play();
        
    }
}