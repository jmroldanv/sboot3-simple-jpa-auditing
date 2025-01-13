# sboot3-simple-jpa-auditing
## https://danielme.com/2023/11/10/curso-spring-data-jpa-auditoria-de-entidades-entitylisteners-enablejpaauditing/
Ejemplo simple de auditoria con JPA en Spring Boot. Si no agregamos las librerías de seguridad, no se puede auditar el usuario (null) 
que realiza la operación.

En properties:
# desactivamos la generación automática de tablas
spring.jpa.hibernate.ddl-auto=none

# activamos la ejecución de scripts de Flyway
spring.flyway.enabled=true

# aplicamos auditoría automática solo a la entidad Customer
# no tenemos activada la auditoría de usuario (spring security, login, ...)

## sql drop
drop table customers;
drop table products;
drop table flyway_schema_history;