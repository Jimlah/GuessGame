package src.guess.data;

public class RobotPLayer extends Player {

    public RobotPLayer(String name) {
        super(name);
    }

    @Override
    public StringBuilder getName(String name) {

        return (new StringBuilder())
                .append("Human ")
                .append(name);
    }
}
