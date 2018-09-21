# MuverProjectSchool
This is a project that allows others to schedule a person to help them move stuff.  It gives a layout of what the company is about (marketing section/about).  It allows each user to be both a partner and a customer.  Everyone needs to move somethiing sometime.  It has a dashboard for each user that allows them to edit, delete, and modify their date.  

This is a wireframe url: https://marvelapp.com/16gf5g86

The sql tables are below.  I had a hard time with the database, so I had to autoincrement manually:

CREATE SEQUENCE set_value
MINVALUE 6
START WITH 6
INCREMENT BY 1
CACHE 100;

--insert into creditcardinfo(cid,ccnumber,secid,zip)
--values(CUSTOMERS_SEQ.nextval, 234324356,435, 11102);

--1
create table reguser(
userid number(10) not null primary key,
uname varchar2(15) not null ,
pass varchar2(15) not null,
passw2 varchar2(15) not null,
city varchar(15) not null,
email varchar2(15) not null,
fname varchar2(15) null,
lname varchar2(15) null
)
;
--2
create table customers(
custid number(10) primary key not null,
userid number(10) references reguser(userid) not null,
city varchar(15) not null
)
;
--3
create table creditcardinfo(
ccid number(10) primary key not null,
cid number(10) not null references customers(cid),
ccnumber number(10) not null,
secId number(3) not null,
zip number(5) not null
);
--4
create table custschedule(
sid number(10) primary key not null,
ampm varchar2(2) not null,
sched date not null,
city varchar2(20) not null,
state varchar2(2) not null,
ccid number(10) not null references creditcardinfo(ccid)

);
--5
create table custcartype(
carreqno number(10) primary key not null,
needcar number(1)not null,
carpref varchar2(15) not null,
ccid number(10) not null references creditcardinfo(ccid)
);
--6
create table partners(
partid number(10) not null primary key,
userid number(10) not null references reguser(userid),
city varchar2(20) not null,
state varchar2(2) not null,
gotcar number(1) not null,
cartype varchar2(15) not null
);
--cartype is going to be a boolean where true = 1
--give values via radio buttons, etc for carpref
--7
create table partnerschedule(
scheduleid number(10) primary key not null,
ampm varchar2(2) not null,
partid number(10) not null,
schedule date not null,
city varchar2(20) not null,
state varchar2(2) not null,
sid number(10) not null,
constraint partschfk foreign key (partid) references partners(partid),
constraint partschfk2 foreign key (sid) references custschedule(sid)
)

--if null, it is not booked
--8
create table payments(
payid number(10) not null primary key, 
ccid number(10) not null, 
sid number(10) not null, 
carreqno number(10) not null,
constraint payfk1 foreign key (ccid) references creditcardinfo(ccid),
constraint payfk2 foreign key (sid) references custschedule(sid),
constraint payfk3 foreign key(carreqno) references custcartype(carreqno)
)
