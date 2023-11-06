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
