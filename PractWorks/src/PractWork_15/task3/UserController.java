package PractWork_15.task3;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;


public class UserController {
    private User model;
    private UserView view;

    public UserController(User model, UserView view) {
        this.model = model;
        this.view = view;

        view.setAddButtonListener(new AddUserListener());
        view.setUserDeleteListener(new DeleteUserListener());
        view.setUserRenameListener(new RenameUserListener());
    }

    class AddUserListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String user = view.getUserInput();
            if (!user.isEmpty()) {
                model.addUser(user);
                view.setUserList(model.getUsers());
            }
        }
    }
    class RenameUserListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            int selected = view.getSelectedUserIndex();
            if (selected != -1) {
                String newName = JOptionPane.showInputDialog(view.getFrame(), "Enter new name");
                if (newName != null && !newName.trim().isEmpty()) {
                    model.renameUserAtIndex(selected, newName);
                    view.setUserList(model.getUsers());
                }
            }
        }
    }

    class DeleteUserListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            int selectedIndex = view.getSelectedUserIndex();
            model.deleteUserAtIndex(selectedIndex);
            view.setUserList(model.getUsers());
        }
    }
}