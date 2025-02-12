import java.util.ArrayList;
import java.util.Scanner;

public class SalaryJavaFoundations {
    public static void main(String[] args) {
        ArrayList<Candidate> candidateAplicationArray = new ArrayList<>();
        HumanResources hr = new HumanResources();
        int option, candidateLimitPass = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("----CANDIDATE BANK----");
        do{
            System.out.print("Candidate Name: ");
            String name = scanner.nextLine();
            System.out.print("Candidate Proposal: ");
            double salary = scanner.nextDouble();
            scanner.nextLine();
            Candidate currentCandidate = new Candidate(name, salary);
            candidateAplicationArray.add(currentCandidate);

            if(hr.candidateAvaliation(currentCandidate)){
                candidateLimitPass++;
            }
            if(candidateLimitPass == 5){
                break;
            }

            System.out.println("\nDo you want to add one more candidate: 1 - yes / 2 - no");
            option = scanner.nextInt();
            scanner.nextLine();
            System.out.println("\n");
        }while(option == 1);

        hr.selectedCandidates();
        System.out.println("\n");
        hr.tryCall();

    }
}
