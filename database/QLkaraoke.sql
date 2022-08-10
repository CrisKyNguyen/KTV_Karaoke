create database QLKaraoke
------------------1-------------------------------------------------------------

use QLKaraoke
------------------2-------------------------------------------------------------

create table DichVu
(	maDV varchar(6) not null,
	tenDV nvarchar(20) not null,
	giaDV money not null
)

create table HoaDonDichVu
(	maHD varchar(6) not null,
	maDV varchar(6) not null,
	maPhong varchar(6)not null,
	soLuong int,
	gioDatDV datetime
)
create table KhachHang
(	maKH varchar(6) not null,
	tenKH nvarchar(20) not null,
	gioiTinh nvarchar(4) not null,
	ngaySinh date,
	soCMND varchar(12) not null,
	soDT varchar(10) not null
)
create table HoaDon
(	maHD varchar(6) not null,
	maNV varchar(6),
	maKH varchar(6) not null,
	ngayLapHD datetime,
	tinhTrang bit,
	tongThanhTien money,
	thueVAT money
)
create table NhanVien
(	maNV varchar(6) not null,
	tenNV nvarchar(20) not null,
	gioiTinh nvarchar(4) not null,
	ngaySinh date,
	soCMND varchar(12) not null,
	maCV varchar(6) not null,
	soDT varchar(10) not null,
	ngayVaoLam date not null,
	matKhau varchar(10),
	tinhTrang bit
)
create table ChucVu
(	maCV varchar(6) not null,
	tenCV nvarchar(20) not null
)
create table HoaDonPhong
(	maHD varchar(6) not null,
	maPhong varchar(6) not null,
	gioDatPhong datetime not null,
	gioTraPhong datetime
)
create table Phong
(	maPhong varchar(6) not null,
	tenPhong nvarchar(20) not null,
	maLP varchar(6) not null,
	tinhTrang int,
	ghiChu nvarchar(30)
)
create table LoaiPhong
(	maLP varchar(6) not null,
	tenLP nvarchar(20) not null,
	giaLP money not null
)


------------------3-------------------------------------------------------------

ALTER TABLE [dbo].[DichVu]
	ADD CONSTRAINT pk_MaDV  PRIMARY KEY ([maDV])

ALTER TABLE [dbo].[ChucVu]
	ADD CONSTRAINT pk_MaCV PRIMARY KEY ([maCV])

ALTER TABLE [dbo].[HoaDon]
	ADD CONSTRAINT pk_MaHD PRIMARY KEY ([maHD])

ALTER TABLE [dbo].[KhachHang]
	ADD CONSTRAINT pk_MaKH PRIMARY KEY ([maKH])

ALTER TABLE [dbo].[LoaiPhong]
	ADD CONSTRAINT pk_MaLP PRIMARY KEY ([maLP])

ALTER TABLE [dbo].[NhanVien]
	ADD CONSTRAINT pk_MaNV PRIMARY KEY ([maNV])

ALTER TABLE [dbo].[Phong]
	ADD CONSTRAINT pk_MaPhong PRIMARY KEY ([maPhong])


------------------4-------------------------------------------------------------

--Foreign Key
ALTER TABLE  [dbo].[HoaDonDichVu]
	ADD CONSTRAINT fk_MaDV FOREIGN KEY(maDV) 
	REFERENCES [dbo].[DichVu](maDV)

ALTER TABLE  [dbo].[HoaDonDichVu]
	ADD CONSTRAINT fk_MaHDdv FOREIGN KEY(maHD) 
	REFERENCES [dbo].[HoaDon](maHD)

ALTER TABLE [dbo].[HoaDonDichVu]
	ADD CONSTRAINT fk_MaPhonghddv FOREIGN KEY([maPhong]) 
	REFERENCES [dbo].[Phong]([maPhong])

ALTER TABLE [dbo].[Phong]
	ADD CONSTRAINT fk_MaLP FOREIGN KEY([maLP]) 
	REFERENCES [dbo].[LoaiPhong]([maLP])

ALTER TABLE [dbo].[HoaDonPhong]
	ADD CONSTRAINT fk_MaPhong FOREIGN KEY([maPhong]) 
	REFERENCES [dbo].[Phong]([maPhong])

ALTER TABLE [dbo].[HoaDonPhong]
	ADD CONSTRAINT fk_MaHDp FOREIGN KEY([maHD]) 
	REFERENCES [dbo].[HoaDon]([maHD])

ALTER TABLE [dbo].[NhanVien]
	ADD CONSTRAINT fk_MaCV FOREIGN KEY([maCV]) 
	REFERENCES [dbo].[ChucVu]([maCV])

ALTER TABLE [dbo].[HoaDon]
	ADD CONSTRAINT fk_MaNV FOREIGN KEY([maNV]) 
	REFERENCES [dbo].[NhanVien]([maNV])

ALTER TABLE [dbo].[HoaDon]
	ADD CONSTRAINT fk_MaKH FOREIGN KEY([maKH]) 
	REFERENCES [dbo].[KhachHang]([maKH])


------------------5-------------------------------------------------------------	

INSERT into [LoaiPhong]
	VALUES  ('LP001', N'V.I.P',200000),
			('LP002', N'Thường',100000)



INSERT into [Phong]
	VALUES	('PH001',	N'Cá Heo'		,(SELECT [maLP] from [LoaiPhong] WHERE maLP = 'LP002'),	0,	Null),
			('PH002',	N'Cá Mập'		,(SELECT [maLP] from [LoaiPhong] WHERE maLP = 'LP001'),	0,	NULL),
			('PH003',	N'San Hô'		,(SELECT [maLP] from [LoaiPhong] WHERE maLP = 'LP002'),	0,	NULL),
			('PH004',	N'Sao Biển'		,(SELECT [maLP] from [LoaiPhong] WHERE maLP = 'LP002'),	0,	NULL),
			('PH005',	N'Cá Đuối'		,(SELECT [maLP] from [LoaiPhong] WHERE maLP = 'LP002'),	0,	NULL),
			('PH006',	N'Cá Voi Xanh'	,(SELECT [maLP] from [LoaiPhong] WHERE maLP = 'LP001'),	0,	NULL),
			('PH007',	N'Đại Dương'	,(SELECT [maLP] from [LoaiPhong] WHERE maLP = 'LP001'),	0,	NULL),
			('PH008',	N'Sóng Biển'	,(SELECT [maLP] from [LoaiPhong] WHERE maLP = 'LP002'),	0,	NULL),
			('PH009',	N'Hải Cẩu'		,(SELECT [maLP] from [LoaiPhong] WHERE maLP = 'LP002'),	0,	NULL),
			('PH010',	N'Cá Ngựa'		,(SELECT [maLP] from [LoaiPhong] WHERE maLP = 'LP002'),	0,	NULL),
			('PH011',	N'Cá Hề'		,(SELECT [maLP] from [LoaiPhong] WHERE maLP = 'LP002'),	0,	Null),
			('PH012',	N'Cua Đá'		,(SELECT [maLP] from [LoaiPhong] WHERE maLP = 'LP001'),	0,	NULL),
			('PH013',	N'Bọt Biển'		,(SELECT [maLP] from [LoaiPhong] WHERE maLP = 'LP002'),	0,	NULL),
			('PH014',	N'Hải Sâm'		,(SELECT [maLP] from [LoaiPhong] WHERE maLP = 'LP002'),	0,	NULL),
			('PH015',	N'Nhím Biển'	,(SELECT [maLP] from [LoaiPhong] WHERE maLP = 'LP002'),	0,	NULL),
			('PH016',	N'Cát Trắng'	,(SELECT [maLP] from [LoaiPhong] WHERE maLP = 'LP001'),	0,	NULL),
			('PH017',	N'Thủy Tinh'	,(SELECT [maLP] from [LoaiPhong] WHERE maLP = 'LP001'),	0,	NULL),
			('PH018',	N'Nàng Tiên Cá'	,(SELECT [maLP] from [LoaiPhong] WHERE maLP = 'LP001'),	0,	NULL),
			('PH019',	N'Thủy Cung'	,(SELECT [maLP] from [LoaiPhong] WHERE maLP = 'LP001'),	0,	NULL),
			('PH020',	N'Sóng Thần'	,(SELECT [maLP] from [LoaiPhong] WHERE maLP = 'LP001'),	0,	NULL)



INSERT into [ChucVu]
	VALUES  ('CV001', N'Quản Lý'),
			('CV002', N'Nhân Viên')



INSERT into [NhanVien]
	VALUES	('NV001', N'Nguyễn Phúc Thịnh'	, N'Nam'	, '1999-06-17',	'192174374',(SELECT [maCV] from [ChucVu] WHERE maCV = 'CV001'),	'0934348847', '2020-09-01', '12345', 0),
			('NV002', N'Nguyễn Chí Khang'	, N'Nam'	, '2000-12-11',	'194583220',(SELECT [maCV] from [ChucVu] WHERE maCV = 'CV002'),	'0933665489', '2021-11-12', '12345', 0),
			('NV003', N'Nguyễn Phúc Văn'	, N'Nam'	, '1999-11-10',	'194335253',(SELECT [maCV] from [ChucVu] WHERE maCV = 'CV002'),	'0395674553', '2021-02-22', '12345', 0),
			('NV004', N'Nguyễn Ngọc Linh'	, N'Nữ'		, '2001-09-10',	'194645634',(SELECT [maCV] from [ChucVu] WHERE maCV = 'CV002'),	'0345676352', '2021-11-11', '12345', 0),
			('NV005', N'Mai Thị Kiều'		, N'Nữ'		, '2002-03-19',	'195734733',(SELECT [maCV] from [ChucVu] WHERE maCV = 'CV002'),	'0945734542', '2021-10-10', '12345', 0),
			('NV006', N'Châu Kim Xuân'		, N'Nữ'		, '2000-10-26',	'197457452',(SELECT [maCV] from [ChucVu] WHERE maCV = 'CV002'),	'0578337984', '2021-10-20', '12345', 0),
			('NV007', N'Bùi Thúy Loan'		, N'Nữ'		, '1996-01-01',	'195685366',(SELECT [maCV] from [ChucVu] WHERE maCV = 'CV002'),	'0906048855', '2021-09-23', '12345', 0),
			('NV008', N'Nguyễn Tú Hân'		, N'Nữ'		, '2002-05-14',	'197345379',(SELECT [maCV] from [ChucVu] WHERE maCV = 'CV002'),	'0364578568', '2021-11-30', '12345', 0),
			('NV009', N'Võ Minh Nhật'		, N'Nam'	, '2000-07-31',	'193757345',(SELECT [maCV] from [ChucVu] WHERE maCV = 'CV002'),	'0909004367', '2021-07-27', '12345', 0),
			('NV010', N'Bùi Hoàng Sang'		, N'Nam'	, '2003-08-03',	'195867456',(SELECT [maCV] from [ChucVu] WHERE maCV = 'CV002'),	'0378484566', '2021-05-06', '12345', 0)


INSERT into [KhachHang]
	VALUES	('KH001',N'Đinh Trọng Tú'	, N'Nam', '1990-12-31', '194356643', '0904636447' ),
			('KH002',N'Phan Nhân'		, N'Nam', '1996-09-24', '193467375', '0578456333' ),
			('KH003',N'Nguyễn Đình Tuấn', N'Nam', '1988-10-16', '195648943', '0902352345' ),
			('KH004',N'Trương Văn Nghĩa', N'Nam', '1989-11-18', '192346347', '0315347455' ),
			('KH005',N'Bùi Gia Long'	, N'Nam', '1993-05-04', '191145346', '0907568345' ),
			('KH006',N'Lý Mai Ninh'		, N'Nam', '1999-03-30', '193477457', '0526547457' ),
			('KH007',N'Lưu Gia Bảo'		, N'Nam', '1992-08-31', '198844333', '0734583434' ),
			('KH008',N'Nguyễn Ngọc Thảo', N'Nữ' , '2001-03-05', '198956742', '0903467345' ),
			('KH009',N'Lý Mai Quốc Khánh',N'Nam', '2000-11-26', '192355567', '0363464574' ),
			('KH010',N'Ngô Gia Bình'	, N'Nam', '1995-12-30', '195956756', '0985685673' ),
			('KH011',N'Nguyễn Mạnh Hà'	, N'Nam', '1990-10-20', '190945834344', '0746789889' ),
			('KH012',N'Phùng Tuấn Kha'	, N'Nam', '1999-10-18', '195347484', '0906367858' ),
			('KH013',N'Bùi Kim Lý'		, N'Nam', '2003-05-26', '198568569', '0903735655' ),
			('KH014',N'Ngô Quang Nhật'	, N'Nam', '1994-01-17', '156896578546', '0933657445' ),
			('KH015',N'Nguyễn Phúc Chu'	, N'Nam', '1997-03-31', '193476348', '0526346344' ),
			('KH016',N'Võ Văn Thái'		, N'Nam', '1997-05-20', '195685674', '0967433555' ),
			('KH017',N'Kiều Gia Thịnh'	, N'Nam', '1997-06-17', '193575884', '0900995477' ),
			('KH018',N'Nguyễn Hoàng Thông',N'Nam','1995-04-11', '194686348', '0523534635' ),
			('KH019',N'Nguyễn Ngọc Minh', N'Nam', '2000-12-04', '190957456', '0555324675' ),
			('KH020',N'Quách Đình Chính', N'Nam', '1994-11-01', '192756967', '0845745745' ),
			('KH021',N'Bùi Thị Kim Thoa', N'Nữ',  '1998-10-23', '193478564', '0859043468' ),
			('KH022',N'Cao Văn Hải'		, N'Nam', '2001-10-30', '190967845', '0901223411' ),
			('KH023',N'Trần Minh Long'	, N'Nam', '2002-10-24', '193465732', '0956734556' ),
			('KH024',N'Hồ Thị Trúc An'	, N'Nữ',  '1989-09-12', '199865745634', '0904568674' ),
			('KH025',N'Võ Gia Kiệt'		, N'Nam', '1995-04-24', '198956730', '0356889442' ),
			('KH026',N'Bùi Quý'			, N'Nam', '1997-09-12', '192365477', '0334789997' ),
			('KH027',N'Dương Tấn Châu'	, N'Nam', '1993-04-22', '198393956', '0537889898' ),
			('KH028',N'Nguyễn Bảo Lộc'	, N'Nam', '1992-03-01', '198568456', '0945678456' )

INSERT into [dbo].[DichVu]
	VALUES	('DV001',N'Khăn lạnh'			,5000),
			('DV002',N'Snack các loại'		,15000),
			('DV003',N'Bia Heineken lon'	,30000),
			('DV004',N'Bia Tiger lon'		,20000),
			('DV005',N'Bia 333 lon'			,15000),
			('DV006',N'Khô mực gói'			,50000),
			('DV007',N'Khô bò gói'			,60000),
			('DV008',N'Đậu phộng Tân Tân'	,20000),
			('DV009',N'Coca Cola'			,20000),
			('DV010',N'Pepsi'				,20000),
			('DV011',N'7Up'					,20000),
			('DV012',N'Sprite'				,20000),
			('DV013',N'Nước suối'			,15000),
			('DV014',N'Mít sấy Đà Lạt'		,35000),
			('DV015',N'Sting'				,20000),
			('DV016',N'Mirinda'				,20000),
			('DV017',N'Thuốc Jet'			,30000),
			('DV018',N'Thuốc lá 555'		,70000),
			('DV019',N'Thuốc lá Craven A'	,30000),
			('DV020',N'Thuốc lào'			,100000),
			('DV021',N'Xì Gà'				,200000)

--select maPhong, tenPhong, tenLP, giaPhong, tinhTrang, ghiChu from Phong p
--join LoaiPhong l On p.maLP = l.maLP

--lấy giờ
--SELECT  CONVERT(VARCHAR(5), GETDATE(), 108)