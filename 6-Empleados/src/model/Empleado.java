package model;

public class Empleado {

			private String nombre , apellidos , email;
			private int dni; 
			private Departamento dep;
			
			public Empleado(){
				
			}
			public Empleado(String nombre, String apellidos,String email,int dni){
				this.nombre=nombre;
				this.apellidos=apellidos;
				this.email=email;
				this.dni=dni;
				
			}
			
			public Empleado(String nombre, String apellidos,String email,int dni,Departamento dep){
				this.nombre=nombre;
				this.apellidos=apellidos;
				this.email=email;
				this.dni=dni;
				this.dep=dep;
			}

			public Departamento getDep() {
				return dep;
			}
			public void setDep(Departamento dep) {
				this.dep = dep;
			}
			public String getNombre() {
				return nombre;
			}

			public void setNombre(String nombre) {
				this.nombre = nombre;
			}

			public String getApellidos() {
				return apellidos;
			}

			public void setApellidos(String apellidos) {
				this.apellidos = apellidos;
			}

			public String getEmail() {
				return email;
			}

			public void setEmail(String email) {
				this.email = email;
			}

			public int getDni() {
				return dni;
			}

			public void setDni(int dni) {
				this.dni = dni;
			}
			
			@Override
			public String toString() {
				return "Empleado [nombre=" + nombre + ", apellidos=" + apellidos + ", email=" + email + ", dni=" + dni
						+ "]";
			}
			@Override
			public int hashCode() {
				final int prime = 31;
				int result = 1;
				result = prime * result + ((apellidos == null) ? 0 : apellidos.hashCode());
				result = prime * result + ((dep == null) ? 0 : dep.hashCode());
				result = prime * result + dni;
				result = prime * result + ((email == null) ? 0 : email.hashCode());
				result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
				return result;
			}
			@Override
			public boolean equals(Object obj) {
				if (this == obj)
					return true;
				if (obj == null)
					return false;
				if (getClass() != obj.getClass())
					return false;
				Empleado other = (Empleado) obj;
				if (apellidos == null) {
					if (other.apellidos != null)
						return false;
				} else if (!apellidos.equals(other.apellidos))
					return false;
				if (dep == null) {
					if (other.dep != null)
						return false;
				} else if (!dep.equals(other.dep))
					return false;
				if (dni != other.dni)
					return false;
				if (email == null) {
					if (other.email != null)
						return false;
				} else if (!email.equals(other.email))
					return false;
				if (nombre == null) {
					if (other.nombre != null)
						return false;
				} else if (!nombre.equals(other.nombre))
					return false;
				return true;
			}
			
}
