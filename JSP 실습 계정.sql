--ȸ�� ������ ���̺� ����
create table t_member(
    id varchar2(10) primary key,
    pwd varchar2(10),
    name varchar2(50),
    email varchar2(50),
    joinDate date default sysdate
);
    
--ȸ�� ���� �߰�
insert into t_member
values('owl','1223','��','hoho@birdy.com',sysdate);

insert into t_member
values('latte','1225','�����ƶ�','coffee@bitter.com',sysdate);

insert into t_member
values('Eom','1234','���μ�','lol@lmfao.com',sysdate);

commit;

select * from t_member;