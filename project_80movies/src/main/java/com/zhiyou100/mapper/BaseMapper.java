package com.zhiyou100.mapper;

import java.util.List;

public interface BaseMapper<E>{
	
	List<E> queryAll();
	int add(E e);
	int deleteById(int id);
	E findById(int id);
	int update(E e);
}
