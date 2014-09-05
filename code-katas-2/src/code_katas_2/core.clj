(ns code-katas-2.core)

(defn unpartial
  "Escribir una funcion que acepte una funcion parcial con cantidad de argumentos desconocida,
   retornar una funcion equivalente de n argumentos"
  [f]
  
  "funcion que recibe una funcion como parametro"
  )


(defn search
  "Dado un numero cualquiera de secuencias, cada una ya ordenada de menor a mayor, encontrar el numero
   mas chico que aparezca en todas las secuencias, las secuencias pueden ser infinitas."
  [& seqs]
  
  
  "primero tengo que ver los cabezales si son igules, si no lo son encontrar el menor"
  "con el map first veo el cabezal de cada secuencia"
 
 (if (apply =(map first seqs))"pongo map first para tomar los primeros elementos de cada lista, luego le aplico apply para que cada elemento resultante de la lista (obtenida por map)sea un parametro y lo comparo si son igualess"
  (first(map first seqs))"si se cumple la condicion , que son iguales todas las cabeceras de las listas, elijo el primero y lo imprimo(ej de (1 1 1) queda 1"
  
  (recur((drop 1(take 1(sort(map first seqs))))))))"else: ordeno los elementos de la lista con sort, tomo el primero(el menor de la lista) y lo borro"


(defn intercalar
  "Escriba una funcion que tome un predicado de 2 argumentos, un valor y una coleccion, y
   retorne una nueva coleccion donde el valor es insertado intercalado cada dos argumentos
   que cumplan el predicado"
  [predicado valor secuencia]
    "recibe funcion elemento a intercalar y lista"
    
    (cons(first secuencia)"concateno el primero de la secuncia"
         (if (predicado (rest secuencia)(valor))"si se cumple el predicado(funcion) entre el resto de secuencia y valor"
           (cons valor 
 


  
  )


(defn tartamudeo
  "Escriba una funcion que retorne una secuencia lazy que comprima el tartamudeo de una secuencia de numeros.
   Comprimir el tartamudeo se refiere a que [1 1 1] se exprese como [3 1] y a su vez [3 1] se exprese como [1 3 1 1].

   La funcion debe aceptar una secuencia inicial de numeros, y devolver una secuencia infinita de compresiones, donde
   cada nuevo elemento es el elemento anterior comprimido."
  [secuencia]
  )
