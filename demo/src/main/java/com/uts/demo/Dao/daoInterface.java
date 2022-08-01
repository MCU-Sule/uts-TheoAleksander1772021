package com.uts.demo.Dao;

import java.util.List;

public interface daoInterface<E> {

    public int getData(E data);
    public int addData(E data);
    public int delData(E data);
    public int updateData(E data);

    public List<E> showData(E data);

}
