package com.zhiyou100.service;

import com.zhiyou100.model.Movie;

import java.util.List;

/**
 * @Author:li
 * @Date:2019/9/26 11:32
 */

public interface MovieService {
    List<Movie> queryAll();
    Movie findById(Integer id);
    int add(Movie movie);
    int deleteById(Integer id);
    int update(Movie movie);
    Movie findByName(String name);
    List<Movie> findQueryAll();
    Movie findQueryAllById(Integer id);
}
