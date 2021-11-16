import java.util.Scanner;

public class CollegeList extends Person{
    public static void main(String[] args) {
        Employee emp = new Employee();
        Faculty fac = new Faculty();
        Student stu = new Student();

        Scanner sc = new Scanner(System.in);
        System.out.print("Press E for Employee, F for Faculty, or S for Student: ");
        String input = sc.nextLine();

        if (input.equalsIgnoreCase("E")) {
            System.out.println("Type employee's name, contact number, salary, and department.\nPress Enter after every input.");
            emp.setName(sc.nextLine());
            emp.setContactNum(sc.next());

            emp.setSalary(sc.nextDouble());
            emp.setDepartment(sc.next());

            System.out.println("------------------------------");
            System.out.println("Name: " + emp.getName() + "\nContact Number: " + emp.getContactNum() + "\nSalary: " + emp.getSalary() + "\nDepartment: " + emp.getDepartment());

        } else if (input.equalsIgnoreCase("F")) {
            System.out.print("Press Y for Regular and N for Tenured: ");
            char press = sc.nextLine().charAt(0);

            System.out.println("Type faculty's name, contact number, salary, and department.\nPress Enter after every input.");
            fac.setName(sc.nextLine());
            fac.setContactNum(sc.next());

            fac.setSalary(sc.nextDouble());
            fac.setDepartment(sc.next());

            if(press == 'Y' || press == 'y') {
                fac.isRegular(true);
                String Status = "Regular";
                System.out.println("------------------------------");
                System.out.println("Name: " + fac.getName() + "\nContact Number: " + fac.getContactNum() + "\nSalary: " + fac.getSalary() + "\nDepartment: " + fac.getDepartment() + "\nStatus: " + Status);
            } else if(press == 'N' || press == 'n') {
                fac.isRegular(false);
                String Status = "Tenured";
                System.out.println("------------------------------");
                System.out.println("Name: " + fac.getName() + "\nContact Number: " + fac.getContactNum() + "\nSalary: " + fac.getSalary() + "\nDepartment: " + fac.getDepartment() + "\nStatus: " + Status);
            } else {
                System.out.println("Invalid input.");
            }

        } else if (input.equalsIgnoreCase("S")) {
            System.out.println("Type student's name, contact number, enrolled program, and year level (1-4).\nPress Enter after every input.");

            stu.setName(sc.nextLine());
            stu.setContactNum(sc.next());

            stu.setProgram(sc.next());
            stu.setYearLevel(sc.nextInt());

            System.out.println("------------------------------");
            System.out.println("Name: " + stu.getName() + "\nContact Number: " + stu.getContactNum() + "\nProgram: " + stu.getProgram() + "\nYear Level: " + stu.getYearLevel());

        } else {
            System.out.println("Invalid input");
        }

    }
}
