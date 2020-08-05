# FOREIGN KEY constraint
## Teachers 

Create a table forms with columns form_number INT, students_number INT and form_master VARCHAR(40). The form_master column should be a named foreign key fk_teacher pointed to the primary key column teacher in the table teachers. Specify the ON DELETE action (use set null) and ON UPDATE action (use cascade).