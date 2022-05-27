create table bangluong
(
    maluong    varchar(8) not null
        primary key,
    tienphucap int        not null,
    luongcoban int        not null
);

INSERT INTO qlynhansu.bangluong (maluong, tienphucap, luongcoban) VALUES ('ML1', 1200000, 4000000);
INSERT INTO qlynhansu.bangluong (maluong, tienphucap, luongcoban) VALUES ('ML2', 1500000, 5000000);
