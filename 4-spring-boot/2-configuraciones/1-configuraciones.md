## Configuraciones
## Puerto
application.properties
```bash
server.port=8081
```

## Cambiar el path
```bash
server.servlet.context-path=/app
```

## Configuración Banner
- https://docs.spring.io/spring-boot/docs/current/reference/html/features.html#features.spring-application.banner

## Personalizar y sobreescribir Spring boot
- Codigo externo
  - Parametros con linea de comandos
  - JNDI
  - Variables de plataforma
- Codigo interno
  - Parametros de servidor
  - Archivos de propiedades
  - Configuración de Java
- Orden de precedencia
  - Command line arg
  - SPRING_APPLICATION_JSON args
  - Servlet parameters
  - JNDI
  - java System Properties
  - OS evvironment variable
  - Profile properties
  - Application properteies
  - @PropertySource Annotations
  - Default properties
- https://docs.spring.io/spring-boot/docs/current/reference/html/application-properties.html

## Manejar perfiles
- https://refactorizando.com/perfiles-spring-boot/
- application-{profile}.properties
  - application-dev.properties
  - application-prod.properties

```bash
# En application.properties
spring.profiles.active=dev,hsqldb
# VM Options
-Dspring.profiles.active=dev
-Dspring.profiles.active=prod

# Maven
mvn spring-boot:run  -Dspring-boot.run.profiles=dev
```

## Archivo de configuración application.yml
- Solo añadiendo el archivo .yml automáticamente spring boot lo reconocera
- Puede utilizarse los dos tipos de archivos al mismo tiempo tanto .properties y .yml

