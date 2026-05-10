package problems;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Luchi");

        Problem firstProblem = new Problem("Food", "No Money to Get Food", ProblemTypes.FINANCIAL);
        Problem secondProblem = new Problem("Light", "Nigeria and Light Issue", ProblemTypes.TECHNICAL);
        Problem thirdProblem = new Problem("Housing", "Agents greediness in getting hostel in school", ProblemTypes.EDUCATION);

        person1.addProblem(firstProblem);
        person1.addProblem(secondProblem);
        person1.addProblem(thirdProblem);

        person1.solveProblem("Food");

        person1.unsolvedProblem();



    }
}