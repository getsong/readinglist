package com.getsong.readinglist.daos;

import com.getsong.readinglist.models.ReadingItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Spring data repository that is used to implement ReadingItem DAO
 *
 * @author getsong
 * @since 2/11/2019 8:24 PM
 */
@Repository
public interface ReadingItemRepo extends JpaRepository<ReadingItem, Long> {
}
