import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;

public class Vacancy {

    private int salary;
    private String profession;
    private String companyName;
    private ArrayList<Observer>candidates = new ArrayList<>();
    private String status;

    public Vacancy(String companyName, int salary, String profession){
        this.companyName = companyName;
        this.salary = salary;
        this.profession = profession;
        this.status = "открытая";
    }

    public Observer getCandidates() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getCandidates'");
    }

    public String getName() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getName'");
    }

    public void setClose() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setClose'");
    }

    public int getSalary() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getSalary'");
    }

    public String getProfession() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getProfession'");
    }

    public void addCandidates(Student student) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addCandidates'");
    }

    public void addCandidates(Master master) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addCandidates'");
    }

    public void addCandidates(Specialist specialist) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addCandidates'");
    }
}