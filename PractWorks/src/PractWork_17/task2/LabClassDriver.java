package PractWork_17.task2;

public class LabClassDriver {
    private LabClassUI<String> application;
    public LabClassDriver(String id) {
        application = new LabClassUI<>(id);
    }
    public void show() {
        application.setVisible(true);
    }
    public void hide() {
        application.setVisible(false);
    }
}