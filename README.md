
# Microservicio-ibm-proyecto1


Esta API realiza una busqueda del perfil de tarjeta más adecuado para la el usuario según 
pasión, salario y edad 

Todo desde el puerto: 8080

Ejemplo: localhost:8080/user/shopping

ventasparsot@gmail.com

## API Reference

#### Obtener el perfil de tarjeta con la pasión help

```http
  POST /user/help
```

| Parameter | Type     | Description                |
| :-------- | :------- | :------------------------- |
| `salary` | `String` | Salario del usuario|
| `age` | `Integer` | Edad del usuario|

#### Obtener el perfil de tarjeta con la pasión my business
```http
  POST /user/mybusiness
```

| Parameter | Type     | Description                |
| :-------- | :------- | :------------------------- |
| `salary` | `String` | Salario del usuario|
| `age` | `Integer` | Edad del usuario|

#### Obtener el perfil de tarjeta con la pasión my style
```http
  POST /user/mystyle
```

| Parameter | Type     | Description                |
| :-------- | :------- | :------------------------- |
| `salary` | `String` | Salario del usuario|
| `age` | `Integer` | Edad del usuario|

#### Obtener el perfil de tarjeta con la pasión shopping
```http
  POST /user/shopping
```

| Parameter | Type     | Description                |
| :-------- | :------- | :------------------------- |
| `salary` | `String` | Salario del usuario|
| `age` | `Integer` | Edad del usuario|

#### Obtener el perfil de tarjeta con la pasión travels
```http
  POST /user/travels
```

| Parameter | Type     | Description                |
| :-------- | :------- | :------------------------- |
| `salary` | `String` | Salario del usuario|
| `age` | `Integer` | Edad del usuario|

#### Obtener el perfil de tarjeta con la pasión sports
```http
  POST /user/sports
```

| Parameter | Type     | Description                |
| :-------- | :------- | :------------------------- |
| `salary` | `String` | Salario del usuario|
| `age` | `Integer` | Edad del usuario|








  
## Capturas de POSTMAN

![App Screenshot](https://i.postimg.cc/L8RPKtLm/Screenshot-1.png)
