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
- Solo añadiendo el archivo .yml automaticamente spring boot lo reconocera
- Puede utilizarse los dos tipos de archivos al mismo tiempo tanto .properties y .yml

## Cambiar de servidor de aplicaciones
- https://docs.spring.io/spring-boot/docs/1.5.9.RELEASE/reference/html/howto-embedded-servlet-containers.html
## Usa Jetty en lugar de Tomcat
```xml
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-web</artifactId>
    <exclusions>
        <exclusion>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-tomcat</artifactId>
        </exclusion>
    </exclusions>
</dependency>
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-jetty</artifactId>
</dependency>
```

### Usa undertow en lugar de tomcat
- Undertow es el motor de servidor web el cual es utilizado por WildFly en antiguo JBOSS es la version software libre.
- Se puede generar un WAR y puede añadirse en el servidor de aplicaciones que se seleccione.
- 