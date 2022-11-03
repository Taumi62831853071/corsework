public class Main {
    static class DoSomething {
        public static byte lengthCount(Employee[] arr) {
            byte k = 0;
            for (byte i = 0; i < arr.length; i++) {
                if (arr[i] != null) {
                    k++;
                }
            }
            return k;
        }

        public static void employeesCout(Employee[] arr) {
            for (byte i = 0; i < arr.length; i++) {
                System.out.println(arr[i]);
            }
        }

        public static float sumSalary(Employee[] arr) {
            float sum = 0f;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] != null) {
                    sum += arr[i].getSalary();
                }
            }
            System.out.println("Сумма затрат на зарплаты в месяц: " + sum);
            return sum;
        }

        public static void minSalary(Employee[] arr) {
            float min = arr[0].getSalary();
            byte k = 0;
            for (byte i = 1; i < arr.length; i++) {
                if (arr[i] != null) {
                    {
                        if (min > arr[i].getSalary()) {
                            min = arr[i].getSalary();
                            k = i;
                        }
                    }
                }
            }
            System.out.println("Сотрудник с минимальной зарплатой: " + arr[k]);
        }

        public static void maxSalary(Employee[] arr) {
            float max = 0f;
            byte k = 0;
            for (byte i = 0; i < arr.length; i++) {
                if (arr[i] != null) {
                    if (max < arr[i].getSalary()) {
                        max = arr[i].getSalary();
                        k = i;
                    }
                }
            }
            System.out.println("Сотрудник с максимальной зарплатой: " + arr[k]);
        }

        public static void avarageSalary(Employee[] arr) {
            var l = lengthCount(arr);
            var averageSalary = DoSomething.sumSalary(arr) / l;
            System.out.println("Средняя зарплата: " + averageSalary);
        }
    }

    public static void main(String[] args) {

        Employee[] Employees = new Employee[10];
        Employees[0] = new Employee("Павел", "Алексеевич", "Веселов", 42000, 1);
        Employees[1] = new Employee("Петр", "Степанович", "Иванов", 41000, 5);
        Employees[2] = new Employee("Леонид", "Петрович", "Рыжов", 32000, 2);
        Employees[3] = new Employee("Елизавета", "Юрьевна", "Степанова", 45000, 4);
        Employees[4] = new Employee("Екатерина", "Петровна", "Федорова", 41500, 3);
        Employees[5] = new Employee("Лариса", "Ивановна", "Медведева", 45000, 3);
        Employees[6] = new Employee("Андрей", "Владимирович", "Дубинин", 51500, 4);
        Employees[7] = new Employee("Ольга", "Алексеевна", "Меньшова", 51000, 2);
        Employees[8] = new Employee("Оксана", "Андреевна", "Котова", 42500, 5);
        Employees[9] = new Employee("Владимир", "Александрович", "Румянцев", 35200, 1);

        DoSomething.employeesCout(Employees);
        DoSomething.sumSalary(Employees);
        DoSomething.maxSalary(Employees);
        DoSomething.minSalary(Employees);
        DoSomething.avarageSalary(Employees);

    }

}