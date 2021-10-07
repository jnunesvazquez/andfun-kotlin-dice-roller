###Primera aplicacion de Android

##Strings con diferentes idiomas

Al *string.xml* creado por defecto en el proyecto le hacemos los cambios que necesitemos y luego creamos los nuevos segun los idiomas que queramos añadir
1. Creamos uno nuevo y le añadimos un calificativo de _Locale_
2. Escogemos el idioma que nos interese, en mi caso he añadido **Afrikaans** y **Egipcio**
3. Por ultimo, cambiamos el idioma manualmente o con el editor que nos proporciona el Android Studio
   
[Commit](https://github.com/jnunesvazquez/andfun-kotlin-dice-roller/commit/e4a1504086d9f96ad7d69b9979443bb67a4b7a7b)

##Cambiar Strings en el layout

1. Cambiamos el *activity_main.xml* del ***layout*** cambiando la base por un _LinearLayout_, simplificando el _TextView_ y añadiendo el _Button_ [Commit](https://github.com/jnunesvazquez/andfun-kotlin-dice-roller/commit/4fc779f35ca84796257a155ce449a65c8dc3d3ef)
2. Añadimos la _id_ al _Button_ para luego acceder a él [Commit](https://github.com/jnunesvazquez/andfun-kotlin-dice-roller/commit/87d0a4c5b3ad98d64a3f9abd9165ab5dd098acdf)
3. Cambiamos el _TextView_ por un _ImageView_ para que se vea una imagen [Commit](https://github.com/jnunesvazquez/andfun-kotlin-dice-roller/commit/e57d98f46f07597247b1883f1402d17bc0cc72f5)

##Añadiendo imagenes

1. Cambiamos el _TextView_ por un _ImageView_ para que se vea una imagen
2. Añadimos las imagenes en formato png
3. Cambiamos la funcion del *MainActivity* para poder acceder a las imagenes
   
   [Commit](https://github.com/jnunesvazquez/andfun-kotlin-dice-roller/commit/e57d98f46f07597247b1883f1402d17bc0cc72f5)

##Cambiando la funcion random

Simplemente buscamos otra de las que se pueda utilizar en nuestro caso y las cambiamos
~~~
randomInt = (0 until 6).random()
~~~
En mi caso le doy un rango (sin contar el 0) y que el valor cambie cuando pulso el boton en la aplicacion

[Commit](https://github.com/jnunesvazquez/andfun-kotlin-dice-roller/commit/441d98664b30a46d4ebc84c1f476f182f4a83b00)

##Añadir la huella al boton

1. Implementamos en el *build.gradle* el material que utilizaremos para que la huella sea visible sobre un fondo blanco  [Commit](https://github.com/jnunesvazquez/andfun-kotlin-dice-roller/commit/3133da3e46ace550d5adf1c57f7392a2f8a87837)
2. Cambiamos el atributo _parent_ en el *styles.xml*  [Commit](https://github.com/jnunesvazquez/andfun-kotlin-dice-roller/commit/24037e4583d92fbb93be419dc20cda29457b9db3)
3. Añadimos un nuevo drawable con el _path_ del dibujo de la huella (Despues de ajustar su tamaño y posicion)  [Commit](https://github.com/jnunesvazquez/andfun-kotlin-dice-roller/commit/7f2e1ec20eab5e938fb247ad091bbccb0d652211)
4. Añadir al boton el _icon_ de la huella y el _style_ del material que añadimos previamente  [Commit](https://github.com/jnunesvazquez/andfun-kotlin-dice-roller/commit/3b50ee5d4ba3bd256a82582357f90b09298dbf20)

[Commit con todos los pasos](https://github.com/jnunesvazquez/andfun-kotlin-dice-roller/commit/2abe33b9c0d247006076cdda98b961ed3f9a66ad)