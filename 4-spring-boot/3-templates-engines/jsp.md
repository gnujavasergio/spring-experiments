# Jsp

## Dependencia
- Añadir la dependencia en pom.xml
```xml

<dependency>
    <groupId>org.apache.tomcat.embed</groupId>
    <artifactId>tomcat-embed-jasper</artifactId>
</dependency>
```

## Ubicación archivos jsp
- La ubicación de los archivos jsp es:
> webapps
>   WEB-INF
>       jsp
>           hello.jsp

## Configuracion 
- Configuracion en la propiedades
```properties
spring.mvc.view.prefix = /WEB-INF/jsp/
spring.mvc.view.suffix = .jsp
```