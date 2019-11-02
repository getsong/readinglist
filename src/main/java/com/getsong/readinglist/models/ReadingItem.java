package com.getsong.readinglist.models;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

/**
 * Model for an item in the reading list
 *
 * @author getsong
 * @since 2/11/2019 11:11 AM
 */
@Data
@NoArgsConstructor
@Entity
@Table(name = "READING_ITEMS")
public class ReadingItem {
  @Id
  private long id;
  private String url;

  @Column(name = "CREATION_TIME")
  @Temporal(TemporalType.TIMESTAMP)
  private Date creationTime;
}
