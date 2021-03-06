insert into CLASSE values (1, 'premiere');
insert into CLASSE values (2, 'affaire');
insert into CLASSE values (3, 'economique');


insert into POSITION values (1, 'hublot');
insert into POSITION values (2, 'couloir');
insert into POSITION values (3, 'centre');


insert into CLIENT values (1, 'Da silva', 'Robinho', '14', 'rue du pont', '75000', 'Paris', 'France', '00001', '0', '0', '0');
insert into CLIENT values (2, 'Guimares', 'Bruno', '2', 'rue de la rivière', '48000', 'Mende', 'France', '00002', '0', '0', '0');
insert into CLIENT values (3, 'Abdou', 'Zakari', '11', 'rue du grand chevalier', '91000', 'Evry', 'France', '00003', '0', '0', '0');
insert into CLIENT values (4, 'Duff', 'Julian', '20', 'rue du cheval blanc', '13000', 'Marseille', 'France', '00004', '0', '0', '0');
insert into CLIENT values (5, 'Mauvais', 'Jack', '3', 'rue du gland', '69000', 'Lyon', 'France', '00005', '0', '0', '0');


insert into RESERVATION values (1, to_date('20200313', 'yyyymmdd'), 1);
insert into RESERVATION values (2, to_date('20200315', 'yyyymmdd'), 4);
insert into RESERVATION values (3, to_date('20200320', 'yyyymmdd'), 4);


insert into LANGUE values (1, 'français');
insert into LANGUE values (2, 'anglais');
insert into LANGUE values (3, 'espagnol');
insert into LANGUE values (4, 'arabe');
insert into LANGUE values (5, 'chinois');
insert into LANGUE values (6, 'portugais');


insert into CONSTRUCTEUR values (1, 'airbus');
insert into CONSTRUCTEUR values (2, 'boeing');


insert into PILOTE values (1, 'Valjean', 'Jean', '5 bis', 'rue du marais', '89000', 'Auxerre', 'France', 100);
insert into PILOTE values (2, 'Delavega', 'Juan', '10', 'calle de la margarita', '28000', 'Madrid', 'Espagne', 200);
insert into PILOTE values (3, 'Coronavus', 'Vladimir', '44', 'stantsiya ulitsa', '101000', 'Moscou', 'Russie', 150); 


insert into HOTESSE values (1, 'Transi', 'Bernard', '69', 'rue du changement', '42000', 'Saint-Etienne', 'France', 45);
insert into HOTESSE values (2, 'De Monaco', 'Stephanie', '1', 'rue du Prince', '98000', 'Monaco', 'Monaco', 240);
insert into HOTESSE values(3, 'Al Pretronas', 'Yasmina', '101', 'rue du pétrole', '3263', 'Doha', 'Qatar', 150);


insert into MODELE_AVION values (1, 'A380', '15000', '2', 1);
insert into MODELE_AVION values (2, 'Beluga', '30000', '4', 1);
insert into MODELE_AVION values (3, '737', '20000', '2', 2);


insert into AVION values (1, 8, 3);
insert into AVION values (2, 0, 2);
insert into AVION values (3, 15, 1);


insert into PLACE values (1, 1, 1, 1);
insert into PLACE values (2, 3, 2, 3);
insert into PLACE values (3, 2, 2, 2);


insert into VOL values (1, 'Paris', 'Tanger', '15', '18', 3, '2010', 2, 0); 
insert into VOL values (2, 'Madrid', 'Milan', '23', '2', 3, '450', 3, 0);
insert into VOL values (3, 'Paris', 'Pekin', '19', '20', 25, '8212', 1, 0);


insert into AFFECTATION_PILOTE values (1, 2);
insert into AFFECTATION_PILOTE values (2, 1);
insert into AFFECTATION_PILOTE values (3, 2);


insert into AFFECTATION_HOTESSE values (2, 1);
insert into AFFECTATION_HOTESSE values (1, 2);
insert into AFFECTATION_HOTESSE values (3, 3);


insert into QUALIFICATION values (1, 2, 3); 
insert into QUALIFICATION values (2, 3, 50);
insert into QUALIFICATION values (3, 1, 50);


insert into PARLER values (1, 1);
insert into PARLER values (1, 2);
insert into PARLER values (2, 3);
insert into PARLER values (3, 4);
insert into PARLER values (3, 6);


insert into NB_PLACES values (1, 1, 150);
insert into NB_PLACES values (1, 2, 20);
insert into NB_PLACES values (1, 3, 10);
insert into NB_PLACES values (2, 1, 200);
insert into NB_PLACES values (3, 1, 150);
insert into NB_PLACES values (3, 2, 150);


insert into PANIER values (1, 1, 1);
insert into PANIER values (2, 2, 2);
insert into PANIER values (3, 3, 3);


insert into PLACE_RESERVEE values (1, 1, 150);
insert into PLACE_RESERVEE values (2, 2, 50);
insert into PLACE_RESERVEE values (3, 3, 10);


