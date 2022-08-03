package src.guess.data;

public abstract class Player {

    public StringBuilder name;
    public Score score;

    public Player(String name)
    {
        this.name = this.getName(name);
        this.score = new Score();
    }

    public abstract StringBuilder getName(String name);

}


