### **Solución Técnica para Exámen Trainee**

**Problemática**:

¿Puede un número X formarse usando la suma de 2 elementos de un array?

**Tecnologías**:

- Lenguaje: Java 21.0.7 (OracleJDK u OpenJDK)
- JRE: No se requiere ya que el JDK incluye todo lo necesario 
- Dependencias: ninguna

**Estructura del código**:

```plaintext
src/
|---pigmalion/
|-------------soluciones/
|------------------------Recursos_infinitos.java  //Solución O(n^2)
|------------------------Recursos_limitados.java  //Solución O(n)
|------------------------Main                     //Pruebas
```

**Como ejecutar**:

```bash
#Compilar desde la raiz del proyecto
javac src/pigmalion/soluciones/*.java -d bin/

#Ejecutar:
java -cp bin pigmalion.soluciones.Main
```

**Resultado esperado**
```
false
true
false
true
```

