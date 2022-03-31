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

## Template
### Cambiar de servidor de aplicaciones
- https://docs.spring.io/spring-boot/docs/1.5.9.RELEASE/reference/html/howto-embedded-servlet-containers.html
### Usa Jetty en lugar de Tomcat
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