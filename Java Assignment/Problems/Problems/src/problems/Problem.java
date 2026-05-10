package problems;

public class Problem {

    private String name;
    private String description;
    private ProblemTypes problemType;
    private boolean solved;


    public Problem(String name, String description, ProblemTypes problemType) {

        this.name = name;
        this.description = description;
        this.problemType = problemType;
        this.solved = false;

    }

    public void solve(){
        solved = true;
    }

    public boolean isSolved() {
        return solved;
    }

    public String getName(){
        return name;
    }

    public String getDescription(){
        return description;

    }

    public ProblemTypes getType(){
        return problemType;
    }

    @Override
    public String toString(){
        return "Problem{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", solved=" + solved +
                '}';
    }
}

