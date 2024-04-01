public class Master implements Observer{

    private String name;
    private int salary;
    private String profession;
    private String qualification;

    public Master(String name, String profession){
        this.name = name;
        salary = 80000;
        this.profession = profession;
        this.qualification = "A";
    }

    public String getQualification(){
        return qualification;
    }

    public String getProfession(){
        return profession;
    }

    public void hiredStatus(){
        this.name = this.name + " трудоустроен";
    }

    @Override
    public void receiveOffer(String nameCompany, int salary) {
        if (this.salary <= salary){
            System.out.printf("Специалист %s: Мне нужна эта работа! (компания: %s; заработная плата: %d)\n",
                    name, nameCompany, salary);
            this.salary = salary;
        }
        else {
            System.out.printf("Специалист %s: Я найду работу получше! (компания: %s; заработная плата: %d)\n",
                    name, nameCompany, salary);
        }
    }

    public void receiveOffer(Vacancy vacancy) {
        if (this.salary <= vacancy.getSalary() && this.profession == vacancy.getProfession()){
            System.out.printf("Соискатель-%s %s: Мне нужна эта работа! (компания: %s; заработная плата: %d)\n",
                    this.profession, name, vacancy.getName(), vacancy.getSalary());
            vacancy.addCandidates(this);
            //this.salary = salary;
        }
        else if (this.profession == vacancy.getProfession()) {
            System.out.printf("Соискатель-%s %s: Я найду работу получше! (компания: %s; заработная плата: %d)\n",
                    this.profession, name, vacancy.getName(), vacancy.getSalary());
        }
    }

    public String toString() {
        return String.format("Соискатель-%s %s; требование к зарплате - %d ; квалификация:%s\n" , this.profession, this.name, this.salary, this.qualification);
     }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int size() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'size'");
    }

    @Override
    public Observer getLast() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getLast'");
    }

    @Override
    public void remove(Observer j) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'remove'");
    }

    @Override
    public void hireCandidates() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'hireCandidates'");
    }
 
}