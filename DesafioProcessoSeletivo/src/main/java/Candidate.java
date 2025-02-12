public class Candidate {
    private final String name;
    private final double salary;

    public Candidate(String candidateName, double salaryProposal){
        this.name = candidateName;
        this.salary = salaryProposal;
    }

    public String getName(){
        return this.name;
    }

    public double getSalary(){
        return this.salary;
    }
}
