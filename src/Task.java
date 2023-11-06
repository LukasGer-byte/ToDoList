
public class Task {

    private String title;
    private String description;
    private String dueDate;
    private boolean completed;

    public Task(String title, String description, String dueDate) {
        this.title = title;
        this.description = description;
        this.dueDate = dueDate;
        this.completed = false;
    }

    public String getTitle() {

        return title;
    }

    public String getDescription() {

        return description;
    }

    public String getDueDate() {

        return dueDate;
    }

    public boolean isCompleted() {

        return completed;
    }

    public void setDescription(String description) {

        this.description = description;
    }

    public void setCompleted(boolean completed) {

        this.completed = completed;
    }

}
