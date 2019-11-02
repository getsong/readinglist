package com.getsong.readinglist.daos;

/**
 * Data Abstraction Object general interface
 *
 * @author getsong
 * @since 2/11/2019 8:22 PM
 */
public interface Dao<T> {
  void save(T t);
}
