package com.aplos.dao;

import java.util.List;

/**
 * Created by Aux072 on 18/04/2018.
 */
public interface BaseDao<T> {

    void create(T type);

    T merge(T type);

    T read(Long id);

    List<T> readAll();

    void update(T type);

    void delete(T type);

    T saveOrUpdate(T type);

}