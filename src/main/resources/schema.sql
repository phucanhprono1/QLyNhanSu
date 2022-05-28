create table if not exists bang_luong
(
    maluong    varchar(255) not null
        primary key,
    luongcoban int          not null,
    tienphucap int          not null
);

create table if not exists chuc_vu
(
    macv         varchar(255) not null
        primary key,
    motacongviec varchar(255) null,
    tencv        varchar(255) null
);

create table if not exists ngay_nghi
(
    mangaynghi int auto_increment
        primary key,
    ngaynghi   date null
);

create table if not exists phong_ban
(
    mapb  varchar(255) not null
        primary key,
    sdtpb varchar(255) null,
    tenpb varchar(255) null
);

create table if not exists trinh_do_hoc_van
(
    matdhv      varchar(255) not null
        primary key,
    chuyennganh varchar(255) null,
    tentdhv     varchar(255) null
);

create table if not exists nhan_vien
(
    manv            varchar(255) not null
        primary key,
    anh             varchar(255) null,
    bacluong        float        not null,
    bacphucap       float        not null,
    cmnd            varchar(255) null,
    dantoc          varchar(255) null,
    diachithuongtru varchar(255) null,
    diemmanh        varchar(255) null,
    diemyeu         varchar(255) null,
    email           varchar(255) null,
    gioitinh        varchar(255) null,
    honv            varchar(255) null,
    ngaysinh        date         null,
    ngayvaocongty   date         null,
    quequan         varchar(255) null,
    sdt             varchar(255) null,
    tennv           varchar(255) null,
    maluong         varchar(255) null,
    macv            varchar(255) null,
    maphong         varchar(255) null,
    matdhv          varchar(255) null,
    constraint FK194l95o5jo8wd5cxs3g9h8i0a
        foreign key (maluong) references bang_luong (maluong),
    constraint FK8ntwry8d0b9jsh58q5fa270oa
        foreign key (maphong) references phong_ban (mapb),
    constraint FKlp0ixj95nymtvb4eor0q3plr
        foreign key (macv) references chuc_vu (macv),
    constraint FKrb2t95r7e2x5xlfunv9sjuqlb
        foreign key (matdhv) references trinh_do_hoc_van (matdhv)
);

create table if not exists hop_dong_lao_dong
(
    mahopdong   varchar(255) not null
        primary key,
    denngay     date         null,
    loaihopdong varchar(255) null,
    thoigian    int          not null,
    tungay      date         null,
    manv        varchar(255) null,
    constraint FK55b1mh8jrt7fouq7js4tjcxck
        foreign key (manv) references nhan_vien (manv)
);

create table if not exists ngay_nghi_nhan_vien
(
    manv       varchar(255) not null,
    mangaynghi int          not null,
    primary key (mangaynghi, manv),
    constraint FKcu6cx2wwa955oey97pa1f8wiu
        foreign key (manv) references nhan_vien (manv),
    constraint FKfinqeapvof74f8vvhrdkl5kkw
        foreign key (mangaynghi) references ngay_nghi (mangaynghi)
);

create table if not exists tai_khoan
(
    tentaikhoan varchar(255) not null
        primary key,
    matkhau     varchar(255) null,
    quyen       varchar(255) null,
    manv        varchar(255) null,
    constraint FK1ny8yw7np8c8mlg2aw7t3solu
        foreign key (manv) references nhan_vien (manv)
);


