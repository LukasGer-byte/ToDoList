import java.util.Scanner;

public class Main {

    static void MainMenu() {
        System.out.println("\nMain Menu");
        System.out.println("===========\n");
        System.out.println("Pick a option:");
        System.out.println("(1) Show Task List");
        System.out.println("(2) Add new Task");
        System.out.println("(3) Edit Task");
        System.out.println("(4) Mark Task as Completed");
        System.out.println("(5) Quit\n");
        System.out.println("Enter your Choice:");
    }
    public static void main(String[] args) {

        String menu = "";
        TodoList todoList = new TodoList();
        Scanner input = new Scanner(System.in);

        do {
            MainMenu();
            menu = input.nextLine();

                switch (menu) {
                    case "1" -> {
                        System.out.println("1");
                        todoList.showTasks();
                    }
                    case "2" -> {
                        System.out.println("2");
                        todoList.addTask();
                    }
                    case "3" -> {
                        System.out.println("3");
                        todoList.editTask();
                    }
                    case "4" -> {
                        System.out.println("4");
                        todoList.markTaskAsCompleted();
                    }
                    case "5" -> {
                    }
                    default -> System.out.println(">> Incorrect Choice: Please Enter a Number from above.");
                }

        } while (!menu.equals("5"));
    }

}
