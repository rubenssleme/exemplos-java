﻿ALTER TABLE ATENDIMENTO_INDIVIDUAL ALTER COLUMN INTEGRACAO TYPE VARCHAR(50);
UPDATE ATENDIMENTO_INDIVIDUAL SET integracao = 'INTEGRACAO' where integracao = 'SIM';
UPDATE ATENDIMENTO_INDIVIDUAL SET integracao = 'NAO_INTEGRACAO' where integracao = 'NAO';
