package com.getsong.readinglist.daos;

import java.util.List;

/**
 * Data Abstraction Object general interface
 *
 * @author getsong
 * @since 2/11/2019 8:22 PM
 */
public interface Dao<T> {
  List<T> getAll();
  void save(T t);
}
