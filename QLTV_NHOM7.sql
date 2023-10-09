create database QuanLyThuVien3
go
use QuanLyThuVien3
GO
CREATE TABLE NhaXuatBan (
	MaNhaXuatBan nvarchar(12),
	TenNhaXuatBan nvarchar(20) primary key,
	 
)
select * from NhaXuatBan
insert into NhaXuatBan values
('NXB1','Khoa Hoc'),
('NXB2','Giao Duc'),
('NXB3','Thanh Nien')
INSERT INTO NhaXuatBan (MaNhaXuatBan, TenNhaXuatBan) 
VALUES 
('NXB4', 'Văn Học'),
('NXB5', 'Lịch Sử'),
('NXB6', 'Nghệ Thuật'),
('NXB7', 'Y Học'),
('NXB8', 'Kỹ Thuật'),
('NXB9', 'Âm Nhạc'),
('NXB10', 'Thể Thao'),
('NXB11', 'Thiếu Nhi'),
('NXB12', 'Tâm Lý'),
('NXB13', 'Tôn Giáo');
INSERT INTO NhaXuatBan (MaNhaXuatBan, TenNhaXuatBan) 
VALUES 
('NXB14', 'Du Lịch'),
('NXB15', 'Thiên Nhiên'),
('NXB16', 'Kỹ Năng Sống'),
('NXB17', 'Tiểu Thuyết'),
('NXB18', 'Tài Chính'),
('NXB19', 'Khoa Học Xã Hội'),
('NXB20', 'Truyện Tranh'),
('NXB21', 'Làm Đẹp'),
('NXB22', 'Thực Phẩm'),
('NXB23', 'Tự Truyện');


CREATE Table TacGia(
	MaTacGia nvarchar(12),
	TenTacGia nvarchar(50) primary key ,
	
)
insert into TacGia values
( 'T01','Nguyen Van Minh '),
( 'T02','Nguyen Duc Hung'),
( 'T03','Tran Duc Bo'),
( 'T04','Pham Van Manh')
INSERT INTO TacGia (MaTacGia, TenTacGia) 
VALUES 
('T05', 'Le Thi Anh'),
('T06', 'Hoang Minh Tuan'),
('T07', 'Nguyen Thanh Huyen'),
('T08', 'Trinh Van Tu'),
('T09', 'Pham Thi Thao'),
('T10', 'Vo Duc Long'),
('T11', 'Tran Thi Mai'),
('T12', 'Nguyen Van Hoang'),
('T13', 'Le Van Quan'),
('T14', 'Bui Thi Nga');
INSERT INTO TacGia (MaTacGia, TenTacGia) 
VALUES 
('T15', 'Phan Thi My'),
('T16', 'Nguyen Xuan Huy'),
('T17', 'Tran Thanh Dat'),
('T18', 'Le Van Nam'),
('T19', 'Nguyen Thi Lan'),
('T20', 'Hoang Minh Anh'),
('T21', 'Trinh Van Tung'),
('T22', 'Nguyen Huu Thang'),
('T23', 'Pham Thi Hue'),
('T24', 'Tran Van Phuong');






CREATE TABLE TheLoai (
	MaTheLoai nvarchar(12) ,
	TenTheLoai nvarchar(20) primary key,
)
insert into TheLoai values
('LTL1','Giao trinh'),
('LTL2','Tieu thuyet'),
('LTL3','Truyen ngan')
INSERT INTO TheLoai (MaTheLoai, TenTheLoai) 
VALUES 
('LTL4', 'Tiểu sử'),
('LTL5', 'Thiếu nhi'),
('LTL6', 'Kỹ năng'),
('LTL7', 'Tâm lý'),
('LTL8', 'Tự lập'),
('LTL9', 'Khoa học'),
('LTL10', 'Kỹ thuật'),
('LTL11', 'Lịch sử'),
('LTL12', 'Văn học'),
('LTL13', 'Nghệ thuật');


select * from TheLoai

CREATE table TaiLieu(
	MaTaiLieu nvarchar(12) PRIMARY KEY,
	TenTaiLieu nvarchar(30),
	TenNhaXuatBan nvarchar(20),
	CONSTRAINT fk_NhaXuatBan FOREIGN KEY(TenNhaXuatBan) REFERENCES NhaXuatBan(TenNhaXuatBan),
	TenTacGia nvarchar(50),
	CONSTRAINT fk_TacGia FOREIGN KEY(TenTacGia) REFERENCES TacGia(TenTacGia),
	SoLuongCo int,
	TenTheLoai nvarchar(20),
	CONSTRAINT fk_TheLoai FOREIGN KEY(TenTheLoai) REFERENCES TheLoai(TenTheLoai),
	NamXuatBan int,
	ViTri nvarchar(6),
	Gia MONEY)
select * from TaiLieu
insert into TaiLieu values
('TL1','Toan cao cap','Khoa Hoc','Nguyen Van Minh',20,'Giao trinh','2015','Khu A', 50000),
('TL2','Toan roi rac','Thanh Nien','Nguyen Duc Hung',20,'Tieu thuyet','2016','Khu B', 45000),
('TL3','Tuoi Tre','Giao Duc','Tran Duc Bo',20,'Truyen ngan','2015','Khu B',30000),
('TL4','Lap trinh can ban','Giao Duc','Pham Van Manh',20,'Giao trinh','2014','Khu C', 25000)
INSERT INTO TaiLieu 
VALUES 
('TL5', 'Toan cao cap phan tich', 'Khoa Hoc', 'Nguyen Van Minh', 15, 'Giao trinh', '2015', 'Khu A', 55000),
('TL6', 'Nhung chuyen la the gioi', 'Thanh Nien', 'Nguyen Van Minh', 10, 'Giao trinh', '2015', 'Khu B', 48000),
('TL7', 'Thien nhien ky thu', 'Thanh Nien', 'Nguyen Van Minh', 25, 'Giao trinh','2015', 'Khu B', 32000),
('TL8', 'Lap trinh Python', 'Thanh Nien', 'Nguyen Van Minh', 18, 'Giao trinh', '2015', 'Khu C', 28000),
('TL9', 'Toan cho tieu hoc', 'Giao Duc', 'Nguyen Van Minh', 30, 'Giao trinh', '2015', 'Khu C', 22000),
('TL10', 'Tieu su cac nha khoa hoc', 'Giao Duc', 'Nguyen Van Minh', 12, 'Giao trinh', '2015', 'Khu C', 36000),
('TL11', 'Tu hoc ve tranh', 'Giao Duc', 'Nguyen Duc Hung', 22, 'Giao trinh', '2015', 'Khu C', 40000),
('TL12', 'Thi trac nghiem vat ly', 'Giao Duc', 'Nguyen Duc Hung', 20, 'Giao trinh', '2015', 'Khu C', 42000),
('TL13', 'Co tuong co ban', 'Giao Duc', 'Nguyen Duc Hung', 15, 'Giao trinh', '2015', 'Khu C', 26000),
('TL14', 'Viec lam voi Excel', 'Giao Duc', 'Nguyen Duc Hung', 18, 'Giao trinh', '2015', 'Khu C', 30000);


CREATE table NhanVienQLMT
(
	MaNhanVien nvarchar(12) PRIMARY KEY,
	TenNhanVien nvarchar(30),
	DienThoai int,
	DiaChi nvarchar(30),
	NgaySinh date,
	GioiTinh nvarchar(5),
	TenDangNhap nvarchar(15),
	MatKhau nvarchar(12)
)
select * from NhanVienQLMT
insert into NhanVienQLMT values 
('NVQLMT1','Hoang Van Anh','0936846124','Hai Phong','1995-03-04','Nam','anhhv','1'),
('NVQLMT2','Tran Thi Tam','0936846125','Ha Noi','1995-05-04','Nu','tamtt','1'),
('NVQLMT3','Nguyen Duc Quan','0936846126','Bac Ninh','1998-08-14','Nam','quannd','1')


CREATE table NhanVienQLTL
(
	MaNhanVien nvarchar(12) PRIMARY KEY,
	TenNhanVien nvarchar(30),
	DienThoai int,
	DiaChi nvarchar(30),
	NgaySinh date,
	GioiTinh nvarchar(5),
	TenDangNhap nvarchar(15),
	MatKhau nvarchar(12)
)
select * from NhanVienQLTL
insert into NhanVienQLTL values 
('NVQLTL1','Tran Trong Duc','0836846124','Hai Phong','1996-03-04','Nam','ductt','1'),
('NVQLTL2','Phan Van Tam','0836846125','Bac Ninh','1997-05-04','Nam','tampv','1'),
('NVQLTL3','Nguyen Dac Quang','0836846126','Dien Bien','1994-08-04','Nam','quangnd','1')


CREATE table ADmin
(
	TenDangNhap nvarchar(15),
	MatKhau nvarchar(12)
)

SELECT * FROM dbo.ADmin WHERE TenDangNhap = '@admin' OR 1='1'

create table BanDoc
(
	MaBanDoc nvarchar(12) PRIMARY KEY,
	TenBanDoc nvarchar(30),
	NgaySinh DATE,
	Khoa nvarchar(12),
	DienThoai int,
	GioiTinh nvarchar(5)
)
select * from BanDoc
insert into BanDoc Values
('BD001','Nam','1999-07-01','CNTT-K12','0847295731','Nam'),
('BD002','Hung','1999-07-03','CNTT-K13','0847295732','Nam'),
('BD003','Lan','1999-07-07','CNTT-K12','0847295733',N'Nữ')
INSERT INTO BanDoc (MaBanDoc, TenBanDoc, NgaySinh, Khoa, DienThoai, GioiTinh) 
VALUES 
('BD011', 'Tuan', '2000-08-25', 'CNTT-K13', '0847295741', 'Nam'),
('BD012', 'Linh', '2000-09-30', 'CNTT-K14', '0847295742', N'Nữ'),
('BD013', 'Huong', '1999-12-10', 'CNTT-K12', '0847295743', N'Nữ'),
('BD014', 'Nam', '2001-03-18', 'CNTT-K13', '0847295744', 'Nam'),
('BD015', 'Kien', '2000-11-27', 'CNTT-K14', '0847295745', 'Nam'),
('BD016', 'Hoa', '2000-01-03', 'CNTT-K12', '0847295746', N'Nữ'),
('BD017', 'Long', '2001-06-09', 'CNTT-K14', '0847295747', 'Nam'),
('BD018', 'Mai', '2000-04-21', 'CNTT-K13', '0847295748', N'Nữ'),
('BD019', 'Tien', '1999-02-15', 'CNTT-K14', '0847295749', 'Nam'),
('BD020', 'Thao', '2001-09-07', 'CNTT-K12', '0847295750', N'Nữ');


CREATE table Phieu
(
	MaPhieu nvarchar(12) PRIMARY KEY,
	MaTaiLieu nvarchar(12),
	NgayMuon date,
	NgayThucTra date,
	MaBanDoc nvarchar(12),
	HoVaTen CHAR(30),
	NgayTra date,
	CONSTRAINT fk_TaiLieu FOREIGN KEY(MaTaiLieu) REFERENCES TaiLieu(MaTaiLieu),
	CONSTRAINT fk_BanDoc FOREIGN KEY(MaBanDoc) REFERENCES BanDoc(MaBanDoc),
)
select * from Phieu
insert into Phieu values 
('P1','TL1','2020-01-06','2020-01-12','BD001','Nam','2020-01-10'),
('P2','TL3','2020-03-14','2020-03-21','BD003','Lan','2020-03-24'),
('P3','TL3','2020-04-20','2020-05-01','BD001','Nam','2020-04-28'),
('P4','TL2','2020-05-08','2020-05-15','BD002','Hung','2020-05-24'),
('P5','TL4','2020-06-14','2020-06-18','BD001','Nam','2020-06-20')
INSERT INTO Phieu (MaPhieu, MaTaiLieu, NgayMuon, NgayThucTra, MaBanDoc, HoVaTen, NgayTra)
VALUES 
('P13', 'TL12', '2021-03-16', '2021-03-23', 'BD011', 'Tuan', '2021-03-28'),
('P14', 'TL13', '2021-04-18', '2021-04-25', 'BD012', 'Linh', '2021-04-30'),
('P15', 'TL14', '2021-05-20', '2021-05-27', 'BD013', 'Huong', '2021-06-02');



INSERT INTO dbo.ADmin VALUES
('admin' , '1'),
('tuvu2k3x14' , '1')
INSERT INTO dbo.ADmin VALUES
('admin' , '1'),
('nhom7' , '123')

create table TraSach(
MaMuon  nvarchar(200) primary key,
MaPhieu nvarchar(12) FOREIGN KEY REFERENCES Phieu(MaPhieu),
SoLuong int,
NgayMuon date,
NgayTra date, 
)
insert into TraSach values 
( 'E1','P1',2,'2020-01-06','2020-01-12'),
( 'E2','P2',3,'2020-03-14','2020-03-21'),
( 'E3','P3',1,'2020-04-20','2020-05-01')
INSERT INTO TraSach (MaMuon, MaPhieu, SoLuong, NgayMuon, NgayTra)
VALUES 
('E11', 'P15', 3, '2020-12-24', '2020-12-31'),
('E12', 'P14', 1, '2021-01-29', '2021-02-05'),
('E13', 'P13', 2, '2021-03-16', '2021-03-23');


create table XuLyPhieu (
	MaXuLy nvarchar(5) primary key,
	MaPhieu nvarchar(12) FOREIGN KEY REFERENCES dbo.Phieu(MaPhieu),
	LyDo nvarchar(25),
	TienPhat money,
	TrangThai nvarchar(20)
)
insert into XuLyPhieu values
('PXL1','P2',N'Quá hạn',20000,N'Đã nộp'),
('PXL2','P4',N'Quá hạn',20000,N'Chưa nộp')
INSERT INTO XuLyPhieu (MaXuLy, MaPhieu, LyDo, TienPhat, TrangThai)
VALUES 
('PXL6', 'P15', N'Quá hạn', 26000, N'Đã nộp'),
('PXL7', 'P14', N'Quá hạn', 21000, N'Chưa nộp');


