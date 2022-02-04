# laboratorio numero 2
* ### Cuál es su mayor utilidad
    permitir que un desarrollador comprenda el estado completo de un esfuerzo de desarrollo en el menor tiempo posible.
* ### Fases de Maven

* ### Ciclo de vida
    1. compile: Genera los ficheros .class compilando los fuentes .java
    2. test: Ejecuta los test automáticos de JUnit existentes, abortando el proceso si alguno de ellos falla.
    3. package: Genera el fichero .jar con los .class compilados
    4. install: Copia el fichero .jar a un directorio de nuestro ordenador donde maven deja todos los .jar. De esta forma esos .jar pueden utilizarse en otros proyectos maven en el mismo ordenador.
    5. deploy: Copia el fichero .jar a un servidor remoto, poniéndolo disponible para cualquier proyecto maven con acceso a ese servidor remoto.
* ### Para qué sirven los plugins
    Sirven para agregar funcionalidades nuevas y especificas, su manejo consiste en relacionar aplicaciones entre si para crear estos.
* ### Qué es y para qué sirve el repositorio central de maven
  Maven tiene dos tipos de repositorios, uno local y uno central; El repositorio central es la ubicación predeterminada para que Maven descargue todas las bibliotecas de dependencia del proyecto para su uso, Maven primero busca en la carpeta .m2 del Repositorio local, y si no encuentra la biblioteca necesaria, busca en el Repositorio central y carga la biblioteca en el repositorio local.
