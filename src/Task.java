import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        while (true) {
            System.out.println("Выберите действие введя цифру:" +
                    "\n1. Добавить информацию о сотруднике" +
                    "\n2. Вывод списка сотрудников " +
                    "\n3. Изменить данные сотрудников");
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    addEmployee(list);
                    break;
                case 2:
                    System.out.println(list.toString());
                    break;
                case 3:
                    changeData(list);
                    break;
            }
        }
    }

    // Добавляем информацию о сотруднике
    public static void addEmployee(List<Employee> list) {
        while (true) {
            System.out.println("Введите информацию о сотруднике (фамилия, имя, возраст, пол, образование, должность, отдел)");
            Scanner scanner = new Scanner(System.in);
            //
            System.out.print("Введите фамилию ");
            String surname = scanner.next();
            System.out.print("Введите имю ");
            String name = scanner.next();
            System.out.print("Введите возраст ");
            String age = scanner.next();
            System.out.print("Введите пол ");
            String gender = scanner.next();
            System.out.print("Введите образованию ");
            String education = scanner.next();
            System.out.print("Введите должность ");
            String position = scanner.next();
            System.out.print("Введите отдел ");
            String department = scanner.next();
            System.out.println("Если хотите закончить ввод данных, введите end");
            String input = scanner.next();
            list.add(new Employee(surname, name, age, gender, education, position, department));
            if (input.equalsIgnoreCase("end")) {
                for (int i = 0; i < list.size(); i++) {
                    System.out.println(list.get(i).getSurname());
                    System.out.println(list.get(i).getName());
                    System.out.println(list.get(i).getAge());
                    System.out.println(list.get(i).getGender());
                    System.out.println(list.get(i).getEducation());
                    System.out.println(list.get(i).getPosition());
                    System.out.println(list.get(i).getDepartment());
                }
                break;
            }
        }
    }

    // Меняем данные о сотруднике
    public static void changeData(List<Employee> list) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Если не хотите менять данные, введите end или нажмите enter!");
            String input = scanner.nextLine();
            if ("end".equals(input)) {
                break;
            }
            System.out.println("Введите фамилию работника, для которого хотите изменить данные");
            String surname = scanner.nextLine();
            System.out.println("Введите имю работника, для которого хотите изменить данные");
            String name = scanner.nextLine();

            int empIndex = searchBySurname(surname, name, list);
            if (empIndex != -1) {
                System.out.println("Меняем фамилию? (Введите yes или no)");
                String choice = scanner.next();
                if ("yes".equalsIgnoreCase(choice)) {
                    System.out.print("Введите новую фамилию: ");
                    String newSurname = scanner.next();
                    list.get(empIndex).setSurname(newSurname);
                }
                System.out.println("Меняем имю? (Введите yes или no)");
                choice = scanner.next();
                if ("yes".equalsIgnoreCase(choice)) {
                    System.out.print("Введите новое имя: ");
                    String newName = scanner.next();
                    list.get(empIndex).setName(newName);
                }
                System.out.println("Меняем возраст? (Введите yes или no)");
                choice = scanner.next();
                if ("yes".equalsIgnoreCase(choice)) {
                    System.out.print("Введите новый возраст: ");
                    String newAge = scanner.next();
                    list.get(empIndex).setAge(newAge);
                }
                System.out.println("Меняем пол? (Введите yes или no)");
                choice = scanner.next();
                if ("yes".equalsIgnoreCase(choice)) {
                    System.out.print("Введите новый пол: ");
                    String newSex = scanner.next();
                    list.get(empIndex).setGender(newSex);
                }
                System.out.println("Меняем образованию? (Введите yes или no)");
                choice = scanner.next();
                if ("yes".equalsIgnoreCase(choice)) {
                    System.out.print("Введите новое образованию: ");
                    String newEducation = scanner.next();
                    list.get(empIndex).setEducation(newEducation);
                }
                System.out.println("Меняем должность? (Введите yes или no)");
                choice = scanner.next();
                if ("yes".equalsIgnoreCase(choice)) {
                    System.out.print("Введите новую должность: ");
                    String newPosition = scanner.next();
                    list.get(empIndex).setPosition(newPosition);
                }
                System.out.println("Меняем отдел? (Введите yes или no)");
                choice = scanner.next();
                if ("yes".equalsIgnoreCase(choice)) {
                    System.out.print("Введите новый отдел: ");
                    String newDepartment = scanner.next();
                    list.get(empIndex).setDepartment(newDepartment);
                }
                System.out.println("Если хотите закончить изменение данных, введите end");
                input = scanner.next();

                if (input.equalsIgnoreCase("end")) {
                    break;
                }
            } else {
                System.out.println("Не найден");
            }
        }
        System.out.println(list);
    }

    public static int searchBySurname(String surname, String name, List<Employee> employeeList) {
        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).getSurname().equalsIgnoreCase(surname) && employeeList.get(i).getName().equalsIgnoreCase(name)) {
                System.out.println("Сотрудник найден!");
                return employeeList.indexOf(employeeList.get(i));
            }
        }
        return -1;
    }
}
