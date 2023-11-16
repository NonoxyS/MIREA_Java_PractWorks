package PractWork_15.task3;

import java.util.ArrayList;
import java.util.List;

public class User {
    private List<String> users;

    public User() {
        users = new ArrayList<>();
    }

    public void addUser(String user) {
        users.add(user);
    }

    public void deleteUserAtIndex(int index) {
        if (index >= 0 && index < users.size()) {
            users.remove(index);
        }
    }

    public void renameUserAtIndex(int index, String newName) {
        if (index >= 0 && index < users.size()) {
            users.set(index, newName);
        }
    }
    public List<String> getUsers() {
        return users;
    }
}