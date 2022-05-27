create table if not exists bangluong
(
    maluong    varchar(8) not null
        primary key,
    tienphucap int        not null,
    luongcoban int        not null
);

create table if not exists chucvu
(
    macv   varchar(8)                not null
        primary key,
    tencv  varchar(50) charset utf8  not null,
    motacv varchar(100) charset utf8 not null
);

create table if not exists ngaynghi
(
    mangaynghi int  not null
        primary key,
    ngaynghi   date null
);

create table if not exists phongban
(
    mapb  varchar(8)  not null
        primary key,
    tenpb varchar(50) not null,
    sdtpb varchar(11) not null
);

create table if not exists trinhdohocvan
(
    matdhv      varchar(8)  not null
        primary key,
    tentdhv     varchar(20) not null,
    chuyennganh varchar(30) not null
);

create table if not exists nhanvien
(
    manv          varchar(8)                not null
        primary key,
    anh           varchar(50) charset utf8  not null,
    ho            varchar(30) charset utf8  null,
    ten           varchar(30) charset utf8  not null,
    ngaysinh      date                      not null,
    quequan       varchar(200) charset utf8 not null,
    diachitc      varchar(200) charset utf8 not null,
    gioitinh      varchar(5) charset utf8   not null,
    dantoc        varchar(20) charset utf8  not null,
    sdt           varchar(11)               not null,
    email         varchar(40) charset utf8  not null,
    maphong       varchar(8)                not null,
    macv          varchar(8)                not null,
    ngayvaocongty date                      not null,
    matdhv        varchar(8)                not null,
    cmnd          varchar(12)               not null,
    maluong       varchar(8)                not null,
    constraint nhanvien_bangluong_maluong_fk
        foreign key (maluong) references bangluong (maluong),
    constraint nhanvien_chucvu_macv_fk
        foreign key (macv) references chucvu (macv),
    constraint nhanvien_phongban_mapb_fk
        foreign key (maphong) references phongban (mapb),
    constraint nhanvien_trinhdohocvan_matdhv_fk
        foreign key (matdhv) references trinhdohocvan (matdhv)
);

create table if not exists hopdonglaodong
(
    mahopdong   varchar(8)               not null
        primary key,
    manv        varchar(8)               not null,
    loaihopdong varchar(20) charset utf8 not null,
    thoigian    int                      not null,
    tungay      date                     not null,
    denngay     date                     not null,
    constraint hopdonglaodong_nhanvien_manv_fk
        foreign key (manv) references nhanvien (manv)
);

create table if not exists ngaynhanviennghi
(
    mangaynghi int        not null
        primary key,
    manv       varchar(8) not null,
    constraint ngaynhanviennghi_ngaynghi_mangaynghi_fk
        foreign key (mangaynghi) references ngaynghi (mangaynghi),
    constraint ngaynhanviennghi_nhanvien_manv_fk
        foreign key (manv) references nhanvien (manv)
);

create table if not exists taikhoan
(
    username varchar(50) not null
        primary key,
    password varchar(24) null,
    manv     varchar(8)  not null,
    quyen    varchar(30) null,
    constraint taikhoan_nhanvien_manv_fk
        foreign key (manv) references nhanvien (manv)
);


