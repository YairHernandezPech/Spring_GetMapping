###Mensaje por de fault Get

    http://localhost:8080/producto/hello

[![https://i.postimg.cc/L5ZLt3kw/1.jpg](https://i.postimg.cc/L5ZLt3kw/1.jpg "https://i.postimg.cc/L5ZLt3kw/1.jpg")](https://i.postimg.cc/L5ZLt3kw/1.jpg "https://i.postimg.cc/L5ZLt3kw/1.jpg")

###Se requiere los siguientes parametros

`nombre=""
mensaje= ""`

###Agregar el siguiente link para poder hacer el get por medio de la url/query
http://localhost:8080/producto/hello?nombre=Yair&mensaje=SoyProgramador

[![https://i.postimg.cc/76hg6k5x/2.jpg](https://i.postimg.cc/76hg6k5x/2.jpg "https://i.postimg.cc/76hg6k5x/2.jpg")](https://i.postimg.cc/76hg6k5x/2.jpg "https://i.postimg.cc/76hg6k5x/2.jpg")

###Resultado

[![https://i.postimg.cc/L8kkQvdM/3.jpg](https://i.postimg.cc/L8kkQvdM/3.jpg "https://i.postimg.cc/L8kkQvdM/3.jpg")](https://i.postimg.cc/L8kkQvdM/3.jpg "https://i.postimg.cc/L8kkQvdM/3.jpg")

##Post
###Insertamos datos con Postman

    http://localhost:8080/producto

se requiere pasar estos datos en el body

{
"id":Int,
"nombre":String,
"tipo":String,
"precio":Int
}

###Ejemplo
[![https://i.postimg.cc/tgvHP34h/4.jpg](https://i.postimg.cc/tgvHP34h/4.jpg "https://i.postimg.cc/tgvHP34h/4.jpg")](https://i.postimg.cc/tgvHP34h/4.jpg "https://i.postimg.cc/tgvHP34h/4.jpg")

###Le damos en send y nos debe responder con un status 200 y el resultado se devuelve en formato json

[![https://i.postimg.cc/YSCHhnMr/6.jpg](https://i.postimg.cc/YSCHhnMr/6.jpg "https://i.postimg.cc/YSCHhnMr/6.jpg")](https://i.postimg.cc/YSCHhnMr/6.jpg "https://i.postimg.cc/YSCHhnMr/6.jpg")
