package com.getsong.readinglist.daos;

import com.getsong.readinglist.models.ReadingItem;
import org.springframework.stereotype.Repository;

/**
 * Reading Item DAO
 *
 * @author getsong
 * @since 2/11/2019 8:25 PM
 */
@Repository
public class ReadingItemDao implements Dao<ReadingItem> {

  private ReadingItemRepo readingItemRepo;

  public ReadingItemDao(ReadingItemRepo readingItemRepo) {
    this.readingItemRepo = readingItemRepo;
  }

  @Override
  public void save(ReadingItem readingItem) {
    readingItemRepo.save(readingItem);
  }
}
