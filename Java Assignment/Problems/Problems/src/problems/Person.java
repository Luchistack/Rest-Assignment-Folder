package problems;

import java.util.ArrayList;
import java.util.List;

public class Person {

    private String name;
    private List<Problem> problems;

    public Person(String name){

        this.name = name;
        problems = new ArrayList<>();
    }
    public void addProblem(Problem problem){

        problems.add(problem);

    }
    public void solveProblem(String problemName){

        for(Problem problem : problems){
            if(problem.getName().equalsIgnoreCase(problemName)){
                problem.solve();
            }
        }

    }
    public void unsolvedProblem(){

        for(Problem problem : problems){
            if(!problem.isSolved()){
                System.out.println(problem);
            }
        }

    }

}
