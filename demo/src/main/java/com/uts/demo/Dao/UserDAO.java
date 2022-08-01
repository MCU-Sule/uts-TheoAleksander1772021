package com.uts.demo.Dao;

import com.uts.demo.Model.User;
import com.uts.demo.Utility.JDBCConnection;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class UserDAO implements daoInterface<User> {
    @Override
    public int getData(User data) {
        return 0;
    }

    @Override
    public int addData(User data) {
        return 0;
    }

    @Override
    public int delData(User data) {
        return 0;
    }

    @Override
    public int updateData(User data) {
        return 0;
    }

    @Override
    public ObservableList<User> showData(User data) {
        ObservableList<User> uList = FXCollections.observableArrayList();
        try {
            String query = "Select * From User;";
            PreparedStatement ps;
            ps = JDBCConnection.getConnection().prepareStatement(query);
            ResultSet res = ps.executeQuery();
            while (res.next()) {
                int id = res.getInt("id");
                String name = res.getString("Username");
                String password = res.getString("Password");
                User s = new User(id, name, password);
                uList.add(s);
            }


        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }


        return uList;
    }

    public ObservableList<User> showData() {
        ObservableList<User> uList = FXCollections.observableArrayList();
        try {
            String query = "Select * From User;";
            PreparedStatement ps;
            ps = JDBCConnection.getConnection().prepareStatement(query);
            ResultSet res = ps.executeQuery();
            while (res.next()) {
                int id = res.getInt("id");
                String name = res.getString("Username");
                String password = res.getString("Password");
                User s = new User(id, name, password);
                uList.add(s);
            }


        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }


        return uList;
    }

}
