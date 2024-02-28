import java.util.*;

class Workers {
    public String FIO;
    public String post;
    public int yearAdmission;
    public int salary;

    Workers(String FIO, String post, int yearAdmission, int salary){
        this.FIO = FIO;
        this.post = post;
        this.yearAdmission = yearAdmission;
        this.salary = salary;
    }
}

class Program{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Workers[] workers = {
                new Workers("Петрова И.И.", "Инженер", 2015, 50000),
                new Workers("Парвадов П.Ю.", "Бухгалтер", 2017, 45000),
                new Workers("Сидоров С.С.", "Инженер", 2016, 48000),
                new Workers("Степанин О.В.", "Программист", 2014, 60000),
                new Workers("Никитин А.П.", "Администратор", 2018, 42000),
                new Workers("Миронова Е.А.", "Инженер", 2019, 48000),
                new Workers("Антонов Д.В.", "Программист", 2015, 40000),
                new Workers("Мелькин Н.С.", "Маркетолог", 2016, 52000),
                new Workers("Андреев П.Н.", "Инженер", 2017, 55000),
                new Workers("Панин М.И.", "Программист", 2018, 46000)
        };

        System.out.print("Введите зарплату: ");
        int setSalary = input.nextInt();
        printBySalary(setSalary, workers);

        System.out.print("Введите должность: ");
        String setPost = input.next();
        printByPost(setPost, workers);
    }

    public static void printBySalary(int setSalary, Workers[] workers){
        for (Workers worker : workers) {
            if (worker.salary < setSalary) continue;

            System.out.printf("%s | %s | %d | %d\n",
                    worker.FIO, worker.post, worker.salary, worker.yearAdmission);
        }
        System.out.println();
    }

    public static void printByPost(String setPost, Workers[] workers) {
        for(int i = 0; i < workers.length; i++){
            if (workers[i].post.contains(setPost)){
                System.out.printf("%s | %s | %d | %d\n",
                        workers[i].FIO, workers[i].post, workers[i].salary, workers[i].yearAdmission);
            }
        }
    }
}
