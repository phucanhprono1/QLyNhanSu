create table chucvu
(
    macv   varchar(8)                not null
        primary key,
    tencv  varchar(50) charset utf8  not null,
    motacv varchar(100) charset utf8 not null
);

INSERT INTO qlynhansu.chucvu (macv, tencv, motacv) VALUES ('CV1', 'Quản lý', 'quản lý');
INSERT INTO qlynhansu.chucvu (macv, tencv, motacv) VALUES ('CV2', 'Nhân viên', 'Nhân Viên');
INSERT INTO qlynhansu.chucvu (macv, tencv, motacv) VALUES ('CV3', 'Giám Đốc', 'giám đốc');
INSERT INTO qlynhansu.chucvu (macv, tencv, motacv) VALUES ('CV4', 'Bảo vệ', 'Bảo vệ an ninh công ty');
INSERT INTO qlynhansu.chucvu (macv, tencv, motacv) VALUES ('CV5', 'Thư ký', 'ghi chép sổ sách, hỗ trợ giám đốc');
