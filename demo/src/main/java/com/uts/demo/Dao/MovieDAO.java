package com.uts.demo.Dao;

import com.uts.demo.Model.Movie;
import com.uts.demo.Utility.JDBCConnection;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class MovieDAO implements daoInterface<Movie>{
    @Override
    public int getData(Movie data) {
        return 0;
    }

    @Override
    public int addData(Movie data) {
        int result = 0;
        try {
            String query = "Insert Into Movies(Title,Genre,Durasi) value (?,?,?)";
            PreparedStatement ps;
            ps = JDBCConnection.getConnection().prepareStatement(query);
            ps.setString(1, data.getTitle());
            ps.setString(2, data.getGenre());
            ps.setString(3, data.getDurasi());
            result = ps.executeUpdate();

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return result;
    }

    @Override
    public int delData(Movie data) {
        int result = 0;

        try {
            String query = "Delete From Movie where id=?";
            PreparedStatement ps = JDBCConnection.getConnection().prepareStatement(query);
            ps.setInt(1,data.getIdmovie());
            return 0;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return result;
    }


    @Override
    public int updateData(Movie data) {
        return 0;
    }

    @Override
    public List<Movie> showData(Movie data) {
        return null;
    }
}
