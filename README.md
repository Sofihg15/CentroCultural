# Descripción
Sistema local de gestión para Centro Cultural que permite administrar alumnos, actividades, instructores, pagos, áreas físicas y equipos.

# Características Principales
- Aplicación local (no web)
- Gestión de Actividades, Alumnos y expedientes
- Control de Instructores
- Gestión de Pagos
- Administración de Áreas físicas y Equipos
- Interfaz para perfiles definidos (Administración/Contabilidad)
- Impresión de listas y consulta de estados
- Sistema de autenticación con usuarios y contraseñas
- **Listas de asistencia con alumnos vigentes (máx. 1 mes atraso)**
- **Gestión especializada de espacios físicos**

## Usuarios del Sistema
- **admin** / **admin123** (Perfil: ADMINISTRACION)
- **contador** / **cont123** (Perfil: CONTABILIDAD)

# Funcionalidades por Módulo

### 1. Gestión de Alumnos
- Registrar nuevos alumnos
- Buscar alumnos por expediente
- Listar todos los alumnos
- Control de mayoría de edad y tutores

### 2. Gestión de Actividades
- Visualizar actividades disponibles
- Control de espacios asignados
- Gestión de instructores por actividad

### 3. Gestión de Pagos (Solo Contabilidad/Administración)
- Registrar pagos (mensual/quincenal)
- Consultar estado de pagos por alumno
- Control de comprobantes

### 4. Gestión de Instructores
- Listar instructores registrados
- Información de contacto

### 5. Gestión de Áreas Físicas
- **Salones**: Con mesas y sillas
- **Áreas de Taller**: Con equipos/máquinas
- **Canchas**: Deportivas (techadas/abiertas)
- **Áreas Verdes**: Con jardines y metraje
- Identificación flexible por nombre o número

### 6. Reportes e Impresión
- Lista completa de alumnos
- Lista de actividades
- Lista de instructores
- Estado de pagos por alumno
- **Lista de asistencia (solo alumnos vigentes)**
- Lista detallada de áreas físicas

## Estructura del Proyecto
- `centroCultural.java` - Punto de entrada principal
- `SistemaCentroCultural.java` - Interfaz principal del sistema
- `GestorDatos.java` - Gestor central de datos
- `GeneradorReportes.java` - Generación de reportes
- `Usuario.java` - Sistema de autenticación
- `alumno.java` - Clase alumno
- `actividad.java` - Clase base para actividades
- `instructor.java` - Clase instructor
- `pago.java` - Clase pago
- Otras clases de soporte (persona, documento, equipo, etc.)

## Notas Importantes
- Los instructores NO acceden directamente al sistema
- Solo perfiles de Administración y Contabilidad tienen acceso
- El sistema es completamente local
- Incluye datos de prueba para testing inicial
