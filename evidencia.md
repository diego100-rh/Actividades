Análisis de código dependencias 

 

i. Identifique las clases y lo que éstas representan. Luego, establezca una descripción textual breve del contexto problema. 

Clases: Calculadora – CarroCompra (almacena info en un arreglo privado llamado producto) 

Se simula un sistema de compras básico que necesita procesar una lista de productos (cantidades y precios) para emitir un valor total final 

 
ii. Analice los atributos y métodos de cada clase, luego, identifique las relaciones existentes entre las clases identificadas y establezca una descripción textual breve del contexto problema... 

Métodos en calculadora, suma o multiplica dos enteros. (atributos privados int n1 y n2), (atributos private productos, dependecias o parametros int  cant y precio para el subtotal depende de ellos para ejecutar su accion puntual en el carrito) 

Métodos en CarroCompra, calculareltotal, subtotal y ademas muestra la tabla, dentro del método privado subTotal(int cant, int precio) de la clase CarroCompra 

relación de Dependencia que va desde CarroCompra hacia Calculadora 

<img width="941" height="705" alt="image" src="https://github.com/user-attachments/assets/2ee6e6dd-1811-4a17-a8a7-f2cfb17c7d18" />

<img width="999" height="766" alt="image" src="https://github.com/user-attachments/assets/dae5acd8-a95f-425b-95fc-c543a72d4603" />
[evidenciacrrito.pdf](https://github.com/user-attachments/files/33503383/evidenciacrrito.pdf)
