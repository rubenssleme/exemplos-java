﻿CREATE TABLE CONTA_ACESSO_PERMISSOES
(
	ID_CONTA_ACESSO BIGINT NOT NULL,
	PERMISSAO VARCHAR(100)
) WITHOUT OIDS;

ALTER TABLE CONTA_ACESSO_PERMISSOES
	ADD FOREIGN KEY (ID_CONTA_ACESSO)
	REFERENCES CONTA_ACESSO (ID)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;