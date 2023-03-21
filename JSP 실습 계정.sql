--회원 데이터 테이블 생성
create table t_member(
    id varchar2(10) primary key,
    pwd varchar2(10),
    name varchar2(50),
    email varchar2(50),
    joinDate date default sysdate
);
    
--회원 정보 추가
insert into t_member
values('owl','1223','붱','hoho@birdy.com',sysdate);

insert into t_member
values('latte','1225','마끼아또','coffee@bitter.com',sysdate);

insert into t_member
values('Eom','1234','엄민서','lol@lmfao.com',sysdate);

commit;

select * from t_member;