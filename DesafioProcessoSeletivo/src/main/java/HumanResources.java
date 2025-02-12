import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class HumanResources {
    private ArrayList<Candidate> aproveCandidate = new ArrayList<>();

    public boolean candidateAvaliation(Candidate proposal){

        if(proposal.getSalary() > 2000){
            System.out.println("\n--------------------------------\nCandidate: " + proposal.getName() +
                    "\nSalary proposal: " + proposal.getSalary() +
                    "\nResult: Awaiting for others candidates\n--------------------------------\n");
            return false;
        } else if(proposal.getSalary() == 2000){
            System.out.println("\n--------------------------------\nCandidate: " + proposal.getName() +
                    "\nSalary proposal: " + proposal.getSalary() +
                    "\nResult: Call the candidate with a counter propose\n--------------------------------\n");
            this.aproveCandidate.add(proposal);
            return true;
        } else {
            System.out.println("\n--------------------------------\nCandidate: " + proposal.getName() +
                    "\nSalary proposal: " + proposal.getSalary() +
                    "\nResult: Call the candidate \n--------------------------------\n");
            this.aproveCandidate.add(proposal);
            return true;
        }

    }

    public void selectedCandidates(){
        System.out.println("Selected candidates");
        for(Candidate validated : aproveCandidate){
            System.out.println("\n--------------------------------\nCandidate: " + validated.getName() +
                    "\nSalary proposal: " + validated.getSalary());
        }
    }

    public void tryCall(){
        for(Candidate validated : aproveCandidate){
            int attempts = 1, limit = 0;
            boolean validCall = false;

            System.out.println("Calling now: " + validated.getName());

            do{
                int randomNumber = ThreadLocalRandom.current().nextInt(1, 3);
                if(1 == randomNumber) {
                    System.out.println("We were able to contact " + validated.getName() + " after " + attempts + " attempts\n");
                    validCall = true;
                    limit++;
                }
                else
                    System.out.println("Trying to contact " + validated.getName() + " again...");
                attempts++;
            }while(attempts < 3 && !validCall);

            if(limit == 0)
                System.out.println("We Were unable to contact " + validated.getName() + "\n");
        }
    }
}
