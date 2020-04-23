

CREATE TABLE IF NOT EXISTS "TIPOS_PREGUNTAS" (
  "TIPO_PREGUNTA_ID" NUMBER PRIMARY KEY,
  "TITULO" varchar(255) DEFAULT NULL
);

DELETE FROM "TIPOS_PREGUNTAS";

INSERT INTO "TIPOS_PREGUNTAS" (TIPO_PREGUNTA_ID, TITULO) VALUES (1,'Titulo1');
COMMIT;
INSERT INTO "TIPOS_PREGUNTAS" (TIPO_PREGUNTA_ID, TITULO) VALUES (2,'Titulo2');
COMMIT;