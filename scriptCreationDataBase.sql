drop table Place_Reservee;
drop table Panier;
drop table Nb_Places;
drop table Parler;
drop table Qualification;
drop table Affectation_Hotesse;
drop table Affectation_Pilote;
drop table Vol;
drop table Place;
drop table Avion;
drop table Modele_Avion;
drop table Hotesse;
drop table Pilote;
drop table Constructeur;
drop table Langue;
drop table Reservation;
drop table Client;
drop table Position;
drop table Classe;


create table CLASSE (
	idClasse integer not null,
	nomClasse carchar(20) not null,
	
	constraint pk_CLASSE_id primary key(idClasse)
	);
	
create table POSITION (
	idPosition integer not null,
	nomPosition varchar(20) not null,

	constraint pk_POSITION_id primary key(idPosition)
	);

create table CLIENT (
	idClient integer not null,
	nom varchar(24) not null,
	prenom varchar(24) not null,
	numero_adr varchar(5) not null,
	rue_adr varchar(50) not null,
	codeP_adr varchar(5) not null, --Expression régulière à faire
	ville varchar(24) not null,
	pays varchar(24) not null, --Liste des pays
	noPasseport varchar(50) not null,
	heuresVol integer not null,
	ptsFidelite integer not null,
	reductionImm integer not null,
	constraint pk_CLIENT_id primary key (idClient)
	);

create table RESERVATION (
	idReservation integer not null,
	dateRes date not null,
	idClient integer not null
	
	constraint pk_RESERVATION_id primary key (idReservation)
	);
	
create table LANGUE (
	idLangue integer not null,
	nom varchar(40) not null,
	
	constraint pk_LANGUE_id primary key (idLangue)
	);
	
create table CONSTRUCTEUR (
	idConstructeur integer not null,
	nom varchar(30) not null;
	
	constraint pk_CONSTRUCTEUR_id primary key (idConstructeur)
	);
	
create table PILOTE (
	idPilote integer not null,
	nom varchar(30) not null,
	prenom varchar(30) not null,
	numero_Adr varchar(5) not null,
	rue_adr varchar(50) not null,
	codeP_adr varchar(5) not null, --Expression régulière à faire
	ville varchar(24) not null,
	pays varchar(24) not null, --Liste des pays
	nbHeures integer not null,
	
	constraint pk_PILOTE_id primary key (idPilote)
	);
	
create table HOTESSE (
	idHotesse integer not null,
	nom varchar(30) not null,
	prenom varchar(30) not null,
	numero_Adr varchar(5) not null,
	rue_adr varchar(50) not null,
	codeP_adr varchar(5) not null, --Expression régulière à faire
	ville varchar(24) not null,
	pays varchar(24) not null, --Liste des pays
	nbHeures integer not null,
	
	constraint pk_HOTESSE_id primary key (idHotesse)
	);
	

create table MODELE_AVION (
	idModele integer not null,
	nomModele varchar(20) not null,
	nbHeuresNecessairesPilotage integer not null,
	nbPilotesNecessaires integer not null,
	idConstructeur integer not null,
	
	constraint pk_MODELE_AVION_id primary key (idModele)
	);
	
create table AVION (
	idAvion integer not null,
	nbHotesses integer not null,
	idModele integer not null,
	
	constraint pk_AVION_id primary key (idavion)
	);
	
create table PLACE (
	idPlace integer not null,
	idClasse integer not null,
	idPosition integer not null,
	idAvion integer not null,
	
	constraint pk_PLACE_id primary key (idPlace, idAvion)
	);	

create table VOL (
	idVol integer not null,
	villeD varchar(30),
	villeA varchar(30),
	heureD integer not null,--Attention decoupage heures,float
	heureA integer not null,--Attention decoupage heures,float
	duree float not null,
	distance integer not null,
	
	CONSTRAINT pk_VOL_id PRIMARY KEY (idVol)
	);

create table AFFECTATION_PILOTE (
	idPilote integer not null,
	idVol integer not null,
	
	constraint pk_AFFECTATION_PILOTE_id (idPilote, idVol)
	);
	
create table AFFECTATION_HOTESSE (
	idHotesse integer not null,
	idVol integer not null,
	
	constraint pk_AFFECTATION_PILOTE_id (idHotesse, idVol)
	);

create table QUALIFICATION (
	idPilote integer not null,
	idModele integer not null,
	nbHeures integer not null,
	
	constraint pk_QUALIFICATION_id (idPilote, idModele)
	);
	
create table PARLER (
	idHotesse integer not null,
	idLangue integer not null,
	
	constraint pk_PARLER_id primary key (idHotesse, idLangue)
	);
	
create table NB_PLACES (
	idAvion integer not null,
	idClasse integer not null,
	nbPlaces integer not null,
	
	constraint pk_NB_PLACES_id primary key (idAvion, idClasse)
	);
	
create table PANIER (
	idPanier integer not null,
	idVol integer not null,
	idReservation integer not null,
	
	constraint pk_PANIER_id primary key (idPanier)
	-- il faudrait un moyen de préciser que le couple idVol, idRes est unique
	);

create table PLACE_RESERVEE(
	idPlace integer not null,
	idPanier integer not null,
	prix integer not null,
	
	constraint pk_PLACE_RESERVEE_id primary key (idPlace)
	);
	
alter table AVION
add constraint fk_AVION_to_MODELE_AVION foreign key (idModele) references MODELE_AVION (idModele);
	
alter table PLACE
add constraint fk_PLACE_to_POSITION foreign key (idPosition) references POSITION(idPosition)
add constraint fk_PLACE_to_CLASSE foreign key (idClasse) references CLASSE(idClasse);
add constraint fk_PLACE_to_AVION foreign key(idAvion) references AVION(idAvion);

alter table NB_PLACES
add constraint fk_NB_PLACE_to_POSITION foreign key (idAvion) references AVION(idAvion)
add constraint fk_NB_PLACE_to_CLASSE foreign key (idClasse) references CLASSE(idClasse);

alter table VOL
add constraint fk_VOL_to_AVION foreign key (idAvion) references AVION(idAvion);

alter table RESERVATION
add constraint fk_RESERVATION_to_CLIENT foreign key (idClient) references CLIENT(idClient);

alter table PANIER
add constraint fk_PANIER_to_RESERVATION foreign key (idReservation) references RESERVATION (idReservation)
add constraint fk_PANIER_to_VOL foreign key (idVol) references VOL (idVol);

alter table PLACE_RESERVEE
add constraint fk_PLACE_RESERVEE_to_PLACE foreign key (idPlace) references PLACE (idPlace)
add constraint fk_PLACE_RESERVEE_to_PANIER foreign key (idPanier) references PANIER (idPanier);

alter table QUALIFICATION
add constraint fk_QUALIFICATION_to_PILOTE foreign key (idPilote) references PILOTE (idPilote)
add constraint fk_QUALIFICATION_to_MODELE_AVION foreign key (idModele) references MODELE_AVION (idModele);

alter table AFFECTATION_PILOTE
add constraint fk_AFFECTATION_PILOTE_to_VOL foreign key (idVol) references VOL (idVol)
add constraint fk_AFFECTATION_PILOTE_to_PILOTE foreign key (idPilote) references PILOTE (idPilote);

alter table AFFECTATION_HOTESSE
add constraint fk_AFFECTATION_HOTESSE_to_VOL foreign key (idVol) references VOL (idVol)
add constraint fk_AFFECTATION_HOTESSE_to_HOTESSE foreign key (idHotesse) references PILOTE (idHotesse);

alter table PARLER
add constraint fk_PARLER_to_HOTESSE foreign key (idHotesse) references HOTESSE (idHotesse)
add constraint fk_PARLER_to_LANGUE foreign key (idLangue) references LANGUE (idLangue);
