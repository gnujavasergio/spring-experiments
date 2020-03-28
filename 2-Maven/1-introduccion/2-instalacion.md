## Instalación
- [http://maven.apache.org/](http://maven.apache.org/)
- [Descargar](http://maven.apache.org/download.cgi)
- Maven 3.3+ requiere minimo el sdk 1.7
- Disco 10 MB
- Cualquier Sistema operativo

## Configurar
### Windows
- En windows configurar los binarios en las variables de entorno.
- Crear nuevas variables de entorno
    - JAVA_HOME => C:\dev\tools\jdk-12.0.1
    - MAVEN_HOME => C:\dev\tools\apache-maven-3.6.3
- Editar la variable path y añadir los binarios
    - %JAVA_HOME%\bin
    - %MAVEN_HOME%\bin
### Linux
#### Linux Mint
- **Primera Forma** [https://linuxize.com/post/how-to-install-apache-maven-on-ubuntu-18-04/] (https://linuxize.com/post/how-to-install-apache-maven-on-ubuntu-18-04/)

- **Segunda Forma**: Editar el archivo .bashrc para que siempre lo tengas disponible
```bash
export PATH="$PATH:/home/gnujavasergio/dev/tools/apache-maven-3.6.3/bin"
```
- **Nota:** Para hacerlo permanentemente se tiene que añadirlo en .bashrc o /etc/enviroment(ubuntu)
- Leer esto como complemento [http://blockdeubuntu.blogspot.com/2009/01/cmo-modificar-la-variable-path.html](http://blockdeubuntu.blogspot.com/2009/01/cmo-modificar-la-variable-path.html)




