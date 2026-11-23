# bodegas-backend

API local de bodegas y productos. Cada producto pertenece a una bodega. Al iniciar, la aplicación crea las tablas en H2 y guarda dos bodegas y tres productos mediante los repositorios. Los datos se reinician al detener el proceso.

## Ejecutar

Requiere un JDK 21 o compatible y la variable `JAVA_HOME` apuntando al JDK. El proyecto incluye Maven Wrapper.

```powershell
git clone https://github.com/Segiraldo0610/ParcialBackDW.git
cd ParcialBackDW
.\mvnw.cmd spring-boot:run
```

En Linux o macOS se usa `./mvnw spring-boot:run`. La primera ejecución descarga las dependencias. Deja abierta la terminal y visita <http://localhost:8080/bodegas>.

## Probar las operaciones

- `GET /bodegas` devuelve cada bodega con su lista de productos. El portátil y el monitor pertenecen a Bodega Norte y la impresora a Bodega Sur.
- `POST /bodegas` recibe nombre y ubicación. Devuelve HTTP 201 con el identificador y una lista de productos inicialmente vacía. Un campo vacío produce HTTP 400.

Ejemplo desde una segunda terminal PowerShell:

```powershell
Invoke-RestMethod -Method Post -Uri http://localhost:8080/bodegas -ContentType 'application/json' -Body '{"nombre":"Bodega Centro","ubicacion":"Centro"}'
Invoke-RestMethod http://localhost:8080/bodegas | ConvertTo-Json -Depth 5
```

La interfaz se ejecuta por separado siguiendo el [README del frontend](https://github.com/Segiraldo0610/ParcialFrontDW).
