﻿ALTER TABLE encaminhamento RENAME TO origem_encaminhamento_detalhado;
ALTER TABLE usuario_encaminhamento RENAME TO usuario_origem_encaminhamento_detalhado;
ALTER TABLE usuario_origem_encaminhamento_detalhado RENAME COLUMN id_encaminhamento TO id_origem_encaminhamento_detalhado;
