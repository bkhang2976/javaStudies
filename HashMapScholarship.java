import java.util.*;

class Info{
    private String name="";
    private double grades=0.0;

	public double getGrades() {
		return grades;
	}

	public void setGrades(double grades) {
		this.grades=grades;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}
    
    public Info(String name, double grades){
        this.name=name;
        this.grades=grades;
    }

    
}

public class HashMapScholarship {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        HashMap<String, Double> gpa = new HashMap<String, Double>();
        boolean determiner = true;
        String information="";
        for(int i=0; i<5; i++){
            System.out.println("이름과 학점>>");
            information=input.nextLine();

            
        }

    }
    
}
