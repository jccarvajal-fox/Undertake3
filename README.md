# Undertake3
Para ayudar al emprendimiento personal


# Este comando en cmd o terminal para arreglar error de puerto
# Abre una terminal (CMD o PowerShell) como administrador y ejecuta:

cmdnetstat -ano | findstr :8080

# Te dará algo como:
TCP    0.0.0.0:8080    0.0.0.0:0    LISTENING    12345
# Ese último número es el PID. Mátalo con:
cmdtaskkill /PID 12345 /F
# Luego vuelve a iniciar tu app normalmente.