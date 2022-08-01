package com.uts.demo.Model;

public class WatchList {
    public int getIdWatch() {
        return idWatch;
    }

    public void setIdWatch(int idWatch) {
        this.idWatch = idWatch;
    }

    public int getLastWatch() {
        return LastWatch;
    }

    public void setLastWatch(int lastWatch) {
        LastWatch = lastWatch;
    }

    public int getFavorite() {
        return favorite;
    }

    public void setFavorite(int favorite) {
        this.favorite = favorite;
    }

    private int idWatch;
    private int LastWatch;
    private int favorite;
}
