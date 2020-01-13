package com.zhiyou100.service.impl;

import com.zhiyou100.mapper.MovieMapper;
import com.zhiyou100.model.Movie;
import com.zhiyou100.service.MovieService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author:li
 * @Date:2019/10/9 21:19
 */
@Service
public class MovieServiceImpl implements MovieService {
    @Resource
    private MovieMapper movieMapper;

    @Override
    public List<Movie> queryAll() {
        return movieMapper.queryAll();
    }

    @Override
    public Movie findById(Integer id) {
        return movieMapper.findById(id);
    }

    @Override
    public int add(Movie movie) {
        return movieMapper.add(movie);
    }

    @Override
    public int deleteById(Integer id) {
        return movieMapper.deleteById(id);
    }

    @Override
    public int update(Movie movie) {
        return movieMapper.update(movie);
    }

    @Override
    public Movie findByName(String name) {
        return null;
    }

    @Override
    public List<Movie> findQueryAll() {
        return movieMapper.findQueryAll();
    }

    @Override
    public Movie findQueryAllById(Integer id) {
        return movieMapper.findQueryAllById(id);
    }
}
