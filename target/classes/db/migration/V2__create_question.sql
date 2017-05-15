  CREATE TABLE question
  (
  Id INT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
  Q_Text VARCHAR(500) NOT NULL,
  Q_Type INT UNSIGNED NOT NULL,
  Q_Score INT NOT NULL,
  FOREIGN KEY (Q_Type) REFERENCES question_type(Id)
  );
