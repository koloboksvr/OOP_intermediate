public class Program {

    /**
     * TODO: Доработать приложение, которое разрабатывалось на семинаре,
     *  поработать с шаблоном проектирования Observer,
     *  добавить новый тип соискателя.
     *  Добавить новую сущность "Вакансия", компания должна рассылать вакансии.
     *  Только после этого вы можете усложнить ваше приложение (при желании), например,
     *  добавить тип вакансии (enum),
     *  учитывать тип вакансии при отправке предложения соискателю.
     *  *** воспользоваться методом removeObserver для удаления соискателя после получения работы
     * @param args
     */
    public static void main(String[] args) {
        Publisher publisher = new JobAgency();
        Company google = new Company("Google", publisher, 120000);
        Company yandex = new Company("Yandex", publisher, 95000);
        Company geekBrains = new Company("GeekBrains", publisher, 98000);

        Student student = new Student("Student #1", "Программист");
        Master master1 = new Master("Master #1", "Программист");
        Master master2 = new Master("Master #2", "Бухгалтер");
        Specialist specialist1 = new Specialist("Specialist #1", "Программист");
        Specialist specialist2 = new Specialist("Specialist #2", "Бухгалтер");
        Specialist specialist3 = new Specialist("Specialist #3", "Электрик");

        publisher.registerObserver(student);
        publisher.registerObserver(master1);
        publisher.registerObserver(master2);
        publisher.registerObserver(specialist1);
        publisher.registerObserver(specialist2);
        publisher.registerObserver(specialist3);

        System.out.println("Все cоискатели и вакансии у компании:");
        System.out.println("*******");
        publisher.showJobSeekers();
        google.showOpenVacancies();

       
        System.out.println(" Делается  рассылка вакансий");
        System.out.println("*******");
        google.needEmployee();
        yandex.needEmployee();
        geekBrains.needEmployee();
        

        google.showOpenVacancies();
        
        System.out.println("Компания нанимает  соискателя " +"\n");
       
        System.out.println("********");
        google.hireAndRemove();

        publisher.showJobSeekers();
        google.showOpenVacancies();
    }

}