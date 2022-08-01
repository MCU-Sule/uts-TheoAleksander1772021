package com.uts.demo.Controller;

import com.uts.demo.Dao.UserDAO;
import com.uts.demo.Model.User;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.scene.control.TableView;

public class UTSController1 {
    public ComboBox cmbGenre;
    public ListView lvUser;
    public TableView table1;
    public TableView table2;

    public void Initialize(){
        UserDAO uDao = new UserDAO();
        ObservableList<User> uList = uDao.showData();
        lvUser.setItems(uList);
    }

    public void changeCombo(ActionEvent actionEvent) {
    }

    public void AddUserAction(ActionEvent actionEvent) {
        User selected;
        selected = (User) table1.getSelectionModel().getSelectedItem();
        System.out.println(selected);

        UserDAO dao = new UserDAO();
        int result = dao.delData(selected);
        if(result !=0){
            System.out.println("Delete Berhasil");
        }
        ObservableList<User> uList = dao.showData();
        table1.setItems(uList);
    }

    public void DelUserAction(ActionEvent actionEvent) {
        User selected;
        selected = (User) table1.getSelectionModel().getSelectedItem();
        System.out.println(selected);

        UserDAO dao = new UserDAO();
        int result = dao.delData(selected);
        if(result !=0){
            System.out.println("Delete Berhasil");
        }
        ObservableList<User> uList = dao.showData();
        table1.setItems(uList);
    }

    public void printReport(ActionEvent actionEvent) {
    }
}
