
DROP TABLE IF EXISTS t_temp_order;
create table t_temp_order
(
   id bigint(50) not NULL AUTO_INCREMENT,
   order_no             varchar(100)                   not null comment '保存名称',
   goods_id             varchar(8)                     null comment '存储类型',
   user_id              varchar(8)                     null comment '存储类型',
   data_state           varchar(1)                     not null comment '存储状态',
   date_flag            varchar(1)                     null comment '数据状态',
   modify_time          varchar(8)                     not null comment '修改时间',
   make_time            varchar(8)                     not null comment '创建时间',
   PRIMARY KEY (id)
 ) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;