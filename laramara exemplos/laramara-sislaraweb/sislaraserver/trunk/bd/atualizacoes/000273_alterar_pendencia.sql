﻿CREATE TABLE DIA_SEMANA_E_HORARIO
(
	ID BIGSERIAL NOT NULL,
	DIA_SEMANA VARCHAR(10) NOT NULL,
	HORA_INICIO TIME NOT NULL,
	HORA_TERMINO TIME NOT NULL,
	PRIMARY KEY (ID)
) WITHOUT OIDS;
CREATE TABLE MODULO_PERIODO_DIA_SEMANA_E_HORARIO
(
	ID_DIA_SEMANA_E_HORARIO BIGINT NOT NULL,
	ID_MODULO_PERIODO BIGINT NOT NULL
) WITHOUT OIDS;
ALTER TABLE MODULO_PERIODO_DIA_SEMANA_E_HORARIO
	ADD FOREIGN KEY (ID_DIA_SEMANA_E_HORARIO)
	REFERENCES DIA_SEMANA_E_HORARIO (ID)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;
ALTER TABLE MODULO_PERIODO_DIA_SEMANA_E_HORARIO
	ADD FOREIGN KEY (ID_MODULO_PERIODO)
	REFERENCES MODULO_PERIODO (ID)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;

insert into dia_semana_e_horario(id, dia_semana, hora_inicio, hora_termino)
select id, dia_semana, hora_inicio, hora_termino from modulo_periodo order by id;
insert into modulo_periodo_dia_semana_e_horario(id_dia_semana_e_horario, id_modulo_periodo)
select id, id from modulo_periodo order by id;

ALTER SEQUENCE dia_semana_e_horario_id_seq RESTART WITH 1058;

ALTER TABLE modulo_periodo DROP COLUMN dia_semana;
ALTER TABLE modulo_periodo DROP COLUMN hora_inicio;
ALTER TABLE modulo_periodo DROP COLUMN hora_termino;
