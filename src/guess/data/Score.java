package src.guess.data;

public class Score {
    protected int initial = 0;

    public void add()
    {
        this.initial ++;
    }

    public int get()
    {
        return this.initial;
    }

    public boolean reset()
    {
        this.initial = 0;
        return true;
    }
}
