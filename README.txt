Una vez realizados las soluciones para ambos casos se procede a respoder las preguntas propuestas:

1. La clase Persona puede optar por un rol de superclase abstracta que contenga los atributos y comportamientos comunes de cualquier persona.
Para mejorarla, se crean subclases más específicas que representen distintos roles o tipos de personas según el contexto del problema.
Gracias a esto mejora el diseño permitiendo la reutilizar código y especializar comportamiento en las subclases.

2. Se puede crear una superclase abstracta Animal que represente a todos los animales, y de ella derivar clases más específicas como Pero y Gato.
Esto hace que el modelo sea más genérico y extensible. Si más adelante se requieren agregar otros animales (como por ejemplo, un pez o un conejo), 
solo se crean nuevas subclases sin modificar el resto del sistema.

3. El cambio presente es la relación de composición entre Universidad y Facultad, y entre Facultad y Departamento, refleja que si una Facultad se elimina, 
sus Departamentos también desaparecen.
Esto hace el modelo adopte una vista más parecida a lo que vemos en la realidad.

4. Para la generalizacion del caso2 bastanría con eliminar las SuperClases "Persona", "Vehiculo" y "Empresa" y limitar el funcionamiento a las SubClases "Moto",
"EmpresaNaviera" y "Empleado", con la diferencia que los atributos y métodos correspondientes a las SuperClases ya no seran herados si no que conformarían
parte en si de las SubClases.
