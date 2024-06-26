public class Task {
    protected String title;
    protected String description;
    protected ProgressStatus progressStatus;
    protected Integer id;

    public Task(String title, String description, ProgressStatus progressStatus, Integer id) {
        this.title = title;
        this.description = description;
        this.progressStatus = progressStatus;
        this.id = id;
    }

    public Task(String title, String description, ProgressStatus progressStatus) {
        this.title = title;
        this.description = description;
        this.progressStatus = progressStatus;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setProgressStatus(ProgressStatus progressStatus) {
        this.progressStatus = progressStatus;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public Integer getId() {
        return id;
    }

    public ProgressStatus getProgressStatus() {
        return progressStatus;
    }

    @Override
    public String toString() {
        return "Task{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", progressStatus=" + progressStatus +
                ", id=" + id +
                '}';
    }
}
