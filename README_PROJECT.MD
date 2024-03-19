1)Create repository and structure
2)Create layers (service, controller, repository, entity)
3)maven, spring-boot -> add dependency
----
4)Create entities :
  User,
  Product,
  Category,
  Order(id,delivery address, delivery method, state, createAt, updateAt, contact phone)
(for each -> entity, dto, repository, service, controller, 
learn about mapstruct to convert dto to entity and vice versa)
5) Add #create# method for each entity
6) Handle exception
7) Check fields
8) getAll - list all entity
9) PostgreSQL or MySQL

-------------------------------
SPRINT 2

1) Product - edit , delete
2) Category - edit, delete
3) user - edit
4) Products /id -detail info, 
5) order by id, delete
6) handle exceptions 
7) list with filter !!!
8) RELATIONSHIPS : @OneToOne

category as string :
-- 
private Category category;

SPRINT 3 part 1:
1) add swagger (as minimal for 1 method in controller)
2) add LB(init + data)
3) add test for service and controller
4) Relationships
--- order system ---
5) logs