# Discap Training

## ¿Cuál es el objetivo del proyecto?

El objetivo del proyecto es poder realizar una aplicación confiable y de calidad en la cual las personas que presenten algún tipo de discapacidad puedan acceder a ella para realizar un entrenamiento físico de acuerdo a sus capacidades.

## ¿Cuál es el problema a resolver?

Ya que la población a la cual se enfoca nuestra aplicación, son personas con alguna discapacidad física, muchas veces presentan problemas para desplazarse hasta un lugar físico para realizar sus debidos procedimientos, por lo cual gracias a la aplicación discap training lo podran hacer desde el lugar de su preferencia y con la confianza de que a pesar de no ir presencialmente van a poder tener los resultados esperados.

## ¿Por qué un producto de software?

Como se planteó en el punto anterior, un producto de software sería demasiado útil y facilita mucho el proceso de los entrenamientos a personas que presentan algún tipo de discapacidad, ya que son más propensas a tener algún tipo de dificultad al desplazarse hasta un punto físico para poder realizar sus entrenamientos.

## ¿Qué otros productos existen similares al producto a construir y por qué no seleccionar uno de ellos?

Después de realizar una búsqueda encontramos que existen aplicacion para discapacitados, pero se enfocan en otros tipos, por ejemplo esta Braiilac, que está destinada para personas con discapacidad visual, Otra encontrada fue TUR4all que permite encontrar sitios públicos y de interés con una fácil accesibilidad para personas con discapacidad, y encontramos mas asi por el estilo, pero no una que se centre en el ejercicio de acuerdo a las capacidades físicas de las personas.

## ¿Cuál es el público objetivo?

Personas con movilidad reducida que quieran tener un aplicativo guía para realizar ejercicios según su necesidad.
Instructores especializados que quieran mejorar la calidad de vida de otros y expandir su conocimiento.
familias que tengan personas con discapacidad y no puedan hacer solos el entrenamiento.

## ¿Qué se sueña el cliente cuando el software esté funcionando?

El cliente sueña con poder realizar ejercicios físicos confiables que le son asignados por un especialista y que le ayuden tanto a ejercitarse como a mejorar algún tipo de problema en caso de que lo presente desde el lugar que él lo desee sin necesidad de acudir presencialmente a un lugar físico.

## ¿Cuáles son las principales funcionalidades que tendrá el producto?

- Información y recolección de datos del usuario para dar una posiblemente adecuada rutina que pueda realizar ejercicios según su condición.
- ver videos de los ejercicios
- algunas imágenes representativas del ejercicio
- guia entrenamiento
- planes de entrenamiento personalizado 
- que el usuario tenga su plan de entrenamiento
- Registro de persona saber su discapacidad 
- registrar usuarios (cliente)
- registrar instructores 
- registrar planes de entrenamiento

## ¿Qué tipo de producto se construirá?

Aplicativo móvil Y/O web deportivo enfocado a personas que presenten algún tipo de  discapacidad

## ¿Existen condiciones o restricciones de negocio especiales?

- Solo aplica para discapacidades físicas
- No aplica para discapacidades cognitivas
- No aplica discapacidad visual, auditiva, del habla ni del olfato.
- Un Plan tendrá máximo 10 guías de entrenamiento 
- Una guia de entrenamiento será máximo de 1 hora
- Una guia de entrenamiento tendrá máximo 7 ejercicios
- Cada ejercicio tendrá máximo 5 repeticiones

## ¿Existen otras condiciones o restricciones que se deban tener en cuenta?

Al ser un tema clínico, la información deberá de estar segura y no podrá ser consultada por cualquier persona, a menos de que esta se encuentre autorizada por el cliente.

## Funcionalidades críticas

Poder crear planes de entrenamiento
Poder asignar guías de entrenamiento al plan de entrenamiento
Cómo incorporar los videos pertenecientes a las guías de entrenamiento

### Spikes:

Cómo realizar un programa multiplataforma.
Cómo conectar dos bases de datos diferentes a un mismo proyecto
Como tener varios FrontEnd para un solo BackEnd
No se tiene conocimiento de los lenguajes de programación a usar
Guardar videos en una BD.

### Retos desconocidos

Para el usuario es crítico que su información sensible no sea compartida con otros usuarios.
Para el usuario es crítico que pueda acceder a sus guías de entrenamiento en el momento que él lo desee
El paciente realice lo mejor posible las guías que se le asignen ya que al no contar con un acompañamiento presencial, los resultados dependen de él.

### Experimentación

#### Spikes:
Reconocer la discapacidad del paciente y mirar sus capacidades para asi poder asignar una guia que sea adecuada(Especialista)


#### PoC
Aquello que un usuario considera que es crítico en su negocio


## Restricciones técnicas

Tecnología base: Componentes, lenguajes, arquitectura y/o algún tipo de tecnología de obligatorio cumplimiento
Base de dados: AmazonDocumentDB(MongoDB).- Oracle
Lenguaje Dllo: Angular, React, Polymer, Ember
Servidores cloud: AWS-Dropbox
Línea base gráfica: Identidad corpotativa.

Arquetipos de referencia:
Capas.

Lineamientos, metodologías y práctica
Práctica de clean code.
Metodología Scrum.

## Restricciones de negocio

- Solo aplica para discapacidades físicas
- No aplica para discapacidades cognitivas
- Un Plan tendrá máximo 10 guías de entrenamiento 
- Una guia de entrenamiento será máximo de 1 hora
- Una guia de entrenamiento tendrá máximo 7 ejercicios
- Cada ejercicio tendrá máximo 5 repeticiones
- Restricciones impuestas por el negocio, no son negociables.
- No se cuenta con un presupuesto inicial 
- 2 meses .
- 98% de disponibilidad.
- 1 mes.

## Modelo de Dominio

[Modelo de Dominio](http://drive.google.com/file/d/1KeyAYfgLd4tEBmlZkyQaaSfYr6C2cHKT/view?usp=share_link "Modelo de Dominio")


## Event Storming

[Event Storming](http://miro.com/app/board/uXjVOhaLZIc=/ "Event Storming")

## Diagrama de Clases

[Diagrama de Clases](https://drive.google.com/file/d/1s1lJKtjOOKdEEQy5rsaepnKyLDdJ-CX3/view?usp=share_link "Diagrama de Clases")

## Modelo Entidad Relacion

[Modelo Entidad Relacion](https://drive.google.com/file/d/1_vYzeeIcJ1OgHSxNlL1V-4pLpIXbc9Bb/view?usp=share_link "Modelo Entidad Relacion")

## Modelo de Componentes

[Modelo de Componentes](https://drive.google.com/file/d/1BrTOlbJ71VWx6sA18jFaX8MxpL0Gt5oa/view?usp=share_link "Modelo de Componentes")

## Modelo de Paquetes

[Modelo de Paquetes](https://drive.google.com/file/d/1voj93snVe_TcBfIdV9PU9h_7GU2iOvl5/view?usp=share_link "Modelo de Paquetes")

## Diagrama de Actividad

[Diagrama de Actividad](https://drive.google.com/file/d/1YUqGnDwSwliFRmMY6M0Wo1yi3ybTz5b3/view?usp=share_link "Diagrama de Actividad")

## Diagrama de Secuencia

[Diagrama de Secuencia](https://drive.google.com/file/d/19-L2e5BvgUw-cQHT0mOvY_MkDAwCtbXm/view?usp=share_link "Diagrama de Secuencia")

## Diagrama de Estado

[Diagrama de Estado](https://drive.google.com/file/d/1mlw7AzJnDIh9ohNvEm8wnOIBdS7_A2PB/view?usp=share_link "Diagrama de Estado")

## Modelo de despliegue

[Modelo de Despliegue](https://drive.google.com/file/d/1qDDoLIB4iaN_9n7zdWsj6psYZ6IA06tL/view?usp=share_link "Modelo de Despliegue")
