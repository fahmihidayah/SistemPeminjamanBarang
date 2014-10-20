# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table admin (
  id                        bigint not null,
  nama                      varchar(255) not null,
  user_id                   bigint,
  constraint pk_admin primary key (id))
;

create table auth (
  id_auth                   bigint not null,
  auth_token                varchar(255),
  constraint pk_auth primary key (id_auth))
;

create table barang (
  id                        bigint not null,
  nama_barang               varchar(255) not null,
  status_barang             varchar(255) not null,
  peminjam_id               bigint,
  constraint pk_barang primary key (id))
;

create table pegawai (
  id                        bigint not null,
  nama_pegawai              varchar(255) not null,
  alamat                    varchar(255) not null,
  telepon                   varchar(255) not null,
  user_id                   bigint,
  constraint pk_pegawai primary key (id))
;

create table peminjam (
  id                        bigint not null,
  nama_peminjam             varchar(255) not null,
  alamat_peminjam           varchar(255) not null,
  telepon_peminjam          varchar(255) not null,
  constraint pk_peminjam primary key (id))
;

create table user (
  id                        bigint not null,
  user_name                 varchar(255) not null,
  password                  varchar(255) not null,
  constraint uq_user_user_name unique (user_name),
  constraint pk_user primary key (id))
;

create sequence admin_seq;

create sequence auth_seq;

create sequence barang_seq;

create sequence pegawai_seq;

create sequence peminjam_seq;

create sequence user_seq;

alter table admin add constraint fk_admin_user_1 foreign key (user_id) references user (id) on delete restrict on update restrict;
create index ix_admin_user_1 on admin (user_id);
alter table barang add constraint fk_barang_peminjam_2 foreign key (peminjam_id) references peminjam (id) on delete restrict on update restrict;
create index ix_barang_peminjam_2 on barang (peminjam_id);
alter table pegawai add constraint fk_pegawai_user_3 foreign key (user_id) references user (id) on delete restrict on update restrict;
create index ix_pegawai_user_3 on pegawai (user_id);



# --- !Downs

SET REFERENTIAL_INTEGRITY FALSE;

drop table if exists admin;

drop table if exists auth;

drop table if exists barang;

drop table if exists pegawai;

drop table if exists peminjam;

drop table if exists user;

SET REFERENTIAL_INTEGRITY TRUE;

drop sequence if exists admin_seq;

drop sequence if exists auth_seq;

drop sequence if exists barang_seq;

drop sequence if exists pegawai_seq;

drop sequence if exists peminjam_seq;

drop sequence if exists user_seq;

