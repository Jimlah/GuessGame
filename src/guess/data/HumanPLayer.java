package src.guess.data;

public class HumanPLayer extends Player {

    public HumanPLayer(String name) {
        super(name);
    }

    @Override
    public StringBuilder getName(String name) {

        return (new StringBuilder())
                .append("Human ")
                .append(name);
    }
}
