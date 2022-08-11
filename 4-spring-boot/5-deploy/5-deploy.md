# Deploy

## Arquitectura de contenedores

- 2005 contenedores que cumplian con las especificaciones JEE.
    - Tomcat
    - Glassfish
    - Websphere
- Se tenia que crear un WAR y subirlo al contenedor

## Spring Boot

- Incrusto el contenedor en el framework Permitiendo ejecutar la aplicacion en modo independiente
- Soporte de contendores
    - Tomcat
    - Jetty
    - Undertow

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

## Soporte plataformas cloud

- Las plataformas en la nube que funcionan con Spring Boot
    - Cloud Foundry
    - Heroku
    - Google Cloud
    - Amazon Web Services
    - Microsoft Azure
- Si se requiere tener mayor flexibilidad. seria mejor dockerizar la aplicación porque la mayoria de las plataformas
  soportan docker.
- Si se decide usar un servicio cloud se tiene que tomar en cuenta:
    - Logging: El registro de los logs puede ser dificil de rastrear y usar dependiendo de la nube una mejor idea es
      utilizar un servicio de registro centralizado.
    - Integracion de servicios: Integración a la base de datos y otro servicio en la nube.
    - Firewall y seguridad: Esto es un dolor de cabeza. Dato que estan en la nube y las cosas son publicas ahi. Se debe
      manejar el tráfico de red y la comunicacion de manera adecuada.
    - 