package quiz;

public class Director extends Manager{
    public int stockOptions;

    public static void main(String[] args) {
        Employee employee = new Employee();
        Manager manager = new Manager();
        Director director = new Director();

        employee.salary = 50000;
        director.salary = 80000;
        manager.budget = 100000;
        director.stockOptions = 1000;
//        System.out.println(employee.salary + director.salary + manager.budget + director.stockOptions);

    }
}
