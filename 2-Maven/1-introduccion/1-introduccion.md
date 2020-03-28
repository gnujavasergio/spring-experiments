## Que es Maven?
- Maven es una herramienta de construcción
    - Maven siempre genera una salida llamada artefacto.
    - Administrar las dependencias. Por Ejemplo si utilizas Hibernate tiene como 13 dependencias y hacerlo de forma manual seria un dolor de cabeza, con maven te facilita todo esto.
- Herramienta de gestión de proyectos
    - Maneja las version y los lanzamientos (releases) de los projectos.
    - Describe el projecto 
    - Produce la información del JavaDocs y Site
    - El codigo fuente
    - Genera archivos jar, war

## Quien es el propietario de maven.
- Apache Software Foundation
- Maven es construido por Maven
- Es Open Source.

## Porque usar Maven
Hay un monton de razones porque usar maven:
- Construcción repetible.
- Dependencias transitivas
- Entorno: Tiene todo lo que necesita para construir nuestro codigo.
- Repositorio Local
    - El repositorio se descarga en el directorio .m2
    - Siempre se tendra todos los archivo descargados para todos los proyectos.
    - Siempre tienen una estructura para que todos los proyetos puedan leer las dependencias.
    - Con un solo repositoria se soluciona el problema del espacio.
- Funciona muy bien en un IDE(Netbeans, Eclipse, Spring STS, IntelliJ IDEA) o con soporte independientemente.
- Maven es la opcion mas recomendada para trabajar con Jenkins o herramientas de Integración Continua.

## Ant vs Maven
### Ant
- Creado para remplazar make
- Multiplataforma
- Esta construido con java y XML.
- Es procedural
```xml
<!-- Puede llamarse clean -->
<target name="clean" description="clean up">
    <delete dir="${build}" />
</target>

<!-- Puede llamarse clear -->
<target name="clear" description="clean up">
    <delete dir="${build}" />
</target>
```

- No tiene herencia
- No se pude reutilizar
- No tiene un estandar varian entre proyectos.


### Maven
- Muchas funcionalidades
- Implicita: obtienes por debajo muchas funcionalidades echas por expertos.
- Consistencia en los proyectos
- Herencia
- Dependencias transitivas
- Versionado

## Pros y contras
### Maven  
- Caja Negra
- Curva de aprendisaje mas pronunciada.
- Estandares sobre la configuración
- Integración con IDE
- Menos gastos generales

### Ant
- Siempre tenemos que descargar todos los archivos para cada proyecto.
- Claro y muy sencillo
- Rapido de aprender
- Copiar y pegar
- Ocurren errores cuando son proyectos de gran tamaño.

## Codigo
- ANT
```xml
<project>
    <target name="delete_everything" description="clean up">
        <delete dir="build"/>
    </target>

    <target name="compile_code" depends="init" description="compile the source">
        <mkdir dir="build/classes"/>
        <javac srcdir="src" destdir="build"/>
    </target>
    <target name="wrap">
        <mkdir dir="build/jar"/>
        <jar destfile="build/jar/HelloWorld.jar" basedir="build/classes" />
    </target>
</project>
```
- Maven
```xml
<project>
    <modelVersion>4.0.0</modelVersion>
    <groupId>com.pluralsight</groupId>
    <artifactId>FitnessTracker</artifactId>
    <version>0.0.1-SNAPSHOT</version>
    <name>HelloWorld</name>
</project>
```






