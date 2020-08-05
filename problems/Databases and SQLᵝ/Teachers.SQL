CREATE TABLE forms (
    form_number INT,
    students_number INT,
    form_master VARCHAR(40),
    CONSTRAINT fk_teacher
        FOREIGN KEY (form_master)
        REFERENCES teachers(teacher)
    ON DELETE SET NULL
    ON UPDATE CASCADE
)
