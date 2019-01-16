/* Delete the tables if they already exist */
drop table if exists Applicants;
drop table if exists Countries;

/* Create the schema for our tables */
create table Applicants(id int, name text, country_id int, age int);
create table Countries(id int, country text);

/* Populate the tables with our data */
insert into Applicants values(0, 'Bořivoj Souček', 0, 24);
insert into Applicants values(1, 'Papp Patrícia', 1, 33);
insert into Applicants values(2, 'Kocsis Ivett', 1, 37);
insert into Applicants values(3, 'Slavomír Vykukal', 0, 20);
insert into Applicants values(4, 'Bruno Malík', 0, 31);
insert into Applicants values(5, 'Veronika Lukešová', 0, 18);
insert into Applicants values(6, 'Székely Miklós', 1, 29);
insert into Applicants values(7, 'Hegedüs Benjámin', 1, 37);
insert into Applicants values(8, 'Nela Machová', 0, 20);
insert into Applicants values(9, 'Balog Rajmund', 1, 39);
insert into Applicants values(10, 'Major Borbála', 1, 35);
insert into Applicants values(11, 'Evelína Horváthová', 0, 23);
insert into Applicants values(12, 'Vászoly Vivien', 1, 40);
insert into Applicants values(13, 'Lada Stýskalová', 0, 27);
insert into Applicants values(14, 'Dagmar Benešová', 0, 33);


insert into Countries values(0, 'Czech Republic');
insert into Countries values(1, 'Hungary');



SELECT name, country
FROM Applicants
JOIN Countries
ON Applicants.country_id=Countries.id
WHERE country_id=1
AND age=40;