package com.example.demo.vip;

import lombok.Data;
import javax.persistence.*;
import java.io.Serializable;


@Table(name ="vip_user", schema = "test1")
@Entity
@Data
public class User implements Serializable {

  private static final long serialVersionUID =  5549727067582195108L;

  @Column(name = "id")
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(name = "user_map_id")
  private Long userMapId;

  @Column(name = "user_name")
  private String userName;

  @Column(name = "user_sex")
  private Long userSex;

  @Column(name = "user_email")
  private String userEmail;

  @Column(name = "data_reserve")
  private String dataReserve;

  @Column(name = "update_time", insertable = false, updatable = false)
  private java.sql.Timestamp updateTime;

  @Column(name = "create_time", insertable = false, updatable = false)
  private java.sql.Timestamp createTime;

}
