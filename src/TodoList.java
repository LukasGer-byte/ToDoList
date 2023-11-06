import java.util.ArrayList;
import java.util.Scanner;

public class TodoList {

    private ArrayList<Task> tasks = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public void addTask() {
        while (true) {
            System.out.println("option 2: Add a Task.");
            System.out.print("Enter the task title: ");
            String title = scanner.nextLine();
            System.out.print("Enter the task description: ");
            String description = scanner.nextLine();
            System.out.print("Enter the task due date: ");
            String dueDate = scanner.nextLine();

            Task task = new Task(title, description, dueDate);
            tasks.add(task);

            System.out.println("Task added successfully.");

            System.out.print("Enter 'M' to return to the Main Menu or press Enter to continue: ");
            String choice = scanner.nextLine().toUpperCase();

            if (choice.equals("M")) {
                break; //? return to the main menu
            }
        }
    }

    public void markTaskAsCompleted() {

        while (true) {
            if (tasks.isEmpty()) {
                System.out.println("No tasks to mark as completed.");
                return;
            }

            System.out.println("Option 4: Mark a Task as completed.");
            showTasks();

            System.out.print("Enter the task number to mark as completed: ");
            int taskNumber = scanner.nextInt();
            scanner.nextLine();

            if (taskNumber >= 1 && taskNumber <= tasks.size()) {
                Task task = tasks.get(taskNumber - 1);
                task.setCompleted(true);
                System.out.println("Task marked as completed.");
            } else {
                System.out.println("Invalid task number.");
            }

            System.out.print("Enter 'M' to return to the Main Menu or press Enter to continue: ");
            String choice = scanner.nextLine().toUpperCase();

            if (choice.equals("M")) {
                break; //? return to the main menu
            }
        }
    }

    public void editTask() {

        while (true) {

            if (tasks.isEmpty()) {
                System.out.println("No tasks to edit.");
                return;
            }

            System.out.println("option 3: Edit a Task.");
            showTasks();


            System.out.print("Enter the task number to edit or mark as completed: ");
            int taskNumber = scanner.nextInt();
            scanner.nextLine();

            if (taskNumber >= 1 && taskNumber <= tasks.size()) {
                System.out.println("Choose an action:");
                System.out.println("1. Edit task");
                System.out.println("2. Mark task as completed");
                System.out.print("Enter your choice: ");
                int action = scanner.nextInt();
                scanner.nextLine();

                if (action == 1) {
                    System.out.print("Enter the new description: ");
                    String newDescription = scanner.nextLine();
                    tasks.get(taskNumber - 1).setDescription(newDescription);
                    System.out.println("Task edited successfully.");
                } else if (action == 2) {
                    tasks.get(taskNumber - 1).setCompleted(true);
                    System.out.println("Task marked as completed.");
                } else {
                    System.out.println("Invalid action choice.");
                }
            } else {
                System.out.println("Invalid task number.");
            }

            System.out.print("Enter 'M' to return to the Main Menu or press Enter to continue: ");
            String choice = scanner.nextLine().toUpperCase();

            if (choice.equals("M")) {
                break; //? return to the main menu
            }
        }
    }

    public void showTasks() {
        while (true) {
            if (tasks.isEmpty()) {
                System.out.println("No tasks in the list.");
            } else {
                System.out.println("Option 1: Show all Tasks.");
                System.out.println("Tasks:");
                for (int i = 0; i < tasks.size(); i++) {
                    Task task = tasks.get(i);
                    String completedStatus = task.isCompleted() ? "Completed" : "Not Completed";
                    System.out.println((i + 1) + ". " + task.getTitle() + " - " + task.getDescription() + " [" + completedStatus + "]");
                }
            }

            System.out.print("Enter 'M' to return to the Main Menu or press Enter to continue: ");
            String choice = scanner.nextLine().toUpperCase();

            if (choice.equals("M")) {
                break; //? return to the main menu
            }
        }
    }


}





















































/*

    private Task[] tasks = new Task[20];


    public void viewTask() {

    String displayFormat = "%-5s %-20s %-15s %-10s %-10s";

    if (tasks.length > 0) {
        System.out.println(String.format(displayFormat, "Num", "TITLE", "PROJECT", "DUE DATE", "COMPLETED"));
        System.out.println(String.format(displayFormat, "===", "=====", "=======", "========", "========="));

        for (int i = 0; i < tasks.length; i++) {
            Task task = tasks[i];

            if (task != null) {
                int num = i + 1; // Task numbers start from 1, not 0
                String title = task.getTitle();
                String project = task.getProject();
                String dueDate = task.getDueDate();
                boolean completed = task.isCompleted();

                // Print the task information using the updated displayFormat
                System.out.println(String.format(displayFormat, num, title, project, dueDate, completed));
            }
        }
    } else {
    System.out.println("No Tasks to show");
    }

    }
    public void taskAdd() {
        Scanner scn = new Scanner(System.in);

        System.out.println("Fill the following Form to add a task:");
        System.out.println(">> Task Title: ");
        String title = scn.nextLine();
        System.out.println(">> Project Name: ");
        String project = scn.nextLine();
        System.out.println(">> Due Date [example: 21.11.2021]");
        LocalDate dueDate = LocalDate.parse(scn.nextLine());

        Task task = new Task(title, project, dueDate);
        for (int i = 0; i<tasks.length; i++) {
            Task t = tasks[i];
            if (t == null) {
                t = task;
            }
        }
    }
*/