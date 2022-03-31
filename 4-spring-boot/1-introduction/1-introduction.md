# Spring boot
## Que es Spring Boot
- Un proyecto basado en Spring
- Muchas opciones para desarrollar con spring boot
- Se puede desarrollar rapidamente.
- Configuraciones minimas a nivel de properties
-   
- No se necesita un servidor de aplicaciones para ejecutarlo(No es necesario Tomcat) se puede ejecutar con un comando.

## Caracteristicas 
- Independiente porque no tiene una realacion directa con el proyecto Spring
- Servidores embebidos
    - Tomcat
    - Jetty
    - Undertow
- Sin generacion de archivos xml.
- Metricas de salud de la aplicación
    - Validar estado de los servicios que se ejecutaron
    - Validar las dependencias e inyeccion de dependencias para los servicios
    - Verificar el estado de la memoria

## Autoconfiguration y runtine
- Configura automáticamente tus aplicaciones de las dependencias que se añadieron mediente maven o gradle.
- Siempre podemos personalizar la configuración
Ejemplo
  - **Database H2:** Autoconfigura spring boot la base de datos pero podemos añadir nuestra propia
  configuracion de conexion.
    
## Anotaciones
- Una anotacion es una forma de añadir metadatos al codigo fuente de java que estan disponibles
para la aplicacion en tiempo de ejecucion y compilacion.
- Una alternativa al uso de XML.  
- Tipo de anotaciones
  - @Controller: Una clase con esta anotacion gestionar las peticiones HTTP get,post, put, delete, etc.
  - @Repository: Una clase o interfaz con esta anotacion sera utilizada para el acceso a la base de datos.
  - @Service Una clase o interfaz con esta anotacion se encargara a la llamada de APIs externas, calculos, logica de negocios.
  - @Component Se utiliza cuando en las clase de utilidad se podria decir en clase mas genericas

```java
@Service
public class CourseServiceImpl implements CourseService {
         
    @Autowired
    private TeacherService teacherService;

    @Autowired
    private StudentService studentService;
} 
```
## Dependencia
- Son objetos definidos que tiene una funcionalidad
- Sin esta funcionalidad los otros objetos no podran trabajar porque dependen de ellas.
- Las dependencias se utilizan para que nos ayuden a cumplir un objetivo

## Create project
- Spring Initializr.
- IDE 
- Spring Boot CLI

### Spring Initializr
- [http://start.spring.io](http://start.spring.io)

### IDE
- IntelliJ IDEA Ultime PRO tiene incluido el Spring Initializr para poder crear projectos

### Spring Boot CLI
- Instalar SDKMan
