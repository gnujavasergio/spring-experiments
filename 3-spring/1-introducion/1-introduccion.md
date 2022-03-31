# Spring

## Que es Spring

- Es una inversion de contenedor de control esta tecnica que es conocida como Inyeccion por dependencia.
- Fue creado para reemplazar los EJB(Enterprise JavaBeans) configuraciones muy complejas
- Para simplificar las configuraciones complejas que se realizan en JEE.
- Basado en POJO con esto spring hace que todo sea simple
- Discreto que te debe hacer más fácil todo y no complicarte la vida si te esta complicando es que lo estas utilizando
  mal.
- AOP/Proxies con esto te facilita el utilizar transacciones con todo esto el codigo es mas simple.
- Mejores practicas y sin darnos cuenta implementamos varios patrones de diseño
    - Singleton
    - Factory
    - Abstract Factory
    - Template method

## Lo que se busca en un Framework

- Testeabilidad
- Mantenibilidad
- Escalabilidad
- Complejidad
- Enfoque comercial

## Lo que ofrece Spring

- **Configuracion** mas simple
- Al desarrollador solo le interesara la **logica de negocios**
- **Testing** centrarse en las pruebas
- Anotaciones o xml para facilitar las configuraciones
- Spring impulsa el desarrolo en **basado en interfaces**.

## Ejemplo

![Comparación](images/image1.png)

## Porque Spring

- Patrones de diseño implementados de Jakarta EE
- WORA(Write Once, Run Anywhere)
- Porque se escribira mucho menos codigo

## Empezar con Spring

- No se puede descargar directamente
- Solo se puede utilizar Maven o Gradle
- Se obtiene Source, JavaDocs, Binaries
- Se utiliza maven o gradle por las Dependencias Transitivas.
- Spring Boot una caja negra se puede desarrollar rapidamente.

## Empezar con Spring

- [Repositorio maven](https://mvnrepository.com/artifact/org.springframework)
- Spring ya no existe una descarga directa de Spring y por eso se utiliza maven o gradle.
- Utilizar maven
    - Maven descargara Source, Javadocs, Binaries
    - Manejara las dependencias transitivas
- [ejemplo1](../projects/conferene-spring)

## Spring Configuration usando Java

- No hay archivo xml para el contexto de la aplicacion.
- En las primeras versiones de Spring todas las configuraciones se realizaba con XML.
    - Los desarrolladores bromeaban diciendo que se tiene que ser Desarrollador XML en lugar de ser un desarrollador
      Java.
- Versiones superiores se añadio los namespace que ayudo algo y aun asi se requeria que sea mas simple el desarrollo
- Por este motivo ahora se añadio la configuracion solo con puro java.
- Utilizando el archivo de configuracion Spring instancias las clases una solo vez como un patron singleton.
- [Ejemplo con java](../projects/conference-java)

## Scopes

Hay cinco Scopes disponibles dentro de Spring para que podamos configurar nuestra aplicación.
eso l
- Valido en cualquier configuración
    - Singleton
    - Prototype
- válido solo en proyectos Spring compatibles con la web.
    - Request
    - Session: Para mantener esa session de usuario este viva 10, 20, 30 min. en la aplicacion web
    - Global: Una session global que puede durar mientras la aplicacion este viva y desaparecera cuando ser reinicie la
      aplciacion

### Scope Singleton

- Una sola instancia
- Una instancia por contenedor o contexto de aplicación.
- Anotación `@Scope`
- Requiere AOP.jar

```java

@Service("speakerService")
@Scope(value = BeanDefinition.SCOPE_SINGLETON)
public class SpeakerServiceImpl implements SpeakerService {

}
```

### Scope prototype

- Garantiza una sola instancia por solicitud
- Se garantiza la instancia unica

```java

@Service("speakerService")
@Scope(value = BeanDefinition.SCOPE_PROTOTYPE)
public class SpeakerServiceImpl implements SpeakerService {

}
```

## Stereotypes
- @Component 
- @Repository - Anotacion para una clase Repositorio
- @Service
  - No es para un servicio web
  - No es para un microservicio
  - Más bien es donde se pondría la logica de negocios
  
> Nota: `@Bean` anotacion a nivel de metodo y los StereoType a nivel de clase.

## Spring Configuration usando XML
- Es elprimer metodo que se utilizo
- Algunos aspectos siguen siendo simples con XML
- Seperacion entre el codigo y las configuraciones

### ApplicationContext.xml
Este archivo es necesario para configurar nuestros beans con xml
  - No importa el nombre pero como estandar se utiliza applicationContext.xml.
  - Spring Context es una especio de HashMap practicamente lo que se configura en xml son llaves y valores.
  - Puede usarse como un registro simple
  - La configuración XML comienza en este archivo.
```xml
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xsi:schemaLocation="http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd">
  
</beans>
```

### Autowiring xml
- Hay cuatro tipos de conectar los beans
  - byType: Solo verificara el tipo de clase
  - byName: Verificara la sintaxis del nombre y el tipo de clase.
  - contructor: Verificara si tiene un constructor
  - no

## Advanced Configuration
- Bean lifecycle: Asignado a un metodo que puede realizar una accion despues del constructor 
- FactoryBean
  - Basado en metodo Factory
  - Legacy code: una buena forma de heredar codigo
  - Contrato sin un constructor
  - Static methods: Se puede manejar metodos estaticos
- SpEL: Spring Expresión Language
  - Manipular el objecto que se creo
  - Evaluar valores en tiempo de Ejecución y cambiar el comportamiento de su codigo
  - Evaluar y manipular la configuración
```java
@Value("#{ T(java.lang.Math).random() * 100.0 }")
private double seedNum;
```
- Proxies: Los proxies ofrecen una excelente manera de inyectar comportamiento en la base de codigo sin modificar el codigo subyacente
  > Se lo puedo usar con la anotacion @Transactional
  
- Bean Profiles: 
  - Con el que se permite configurar un codigo especifico para un entorno de desarrollo o produccion y se pueda intercambiar en ellos
  - Configuraciones en tiempo de ejecucion 