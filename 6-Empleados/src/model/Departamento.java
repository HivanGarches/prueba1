package model;

import java.util.ArrayList;

public class Departamento {
	
		private String nombre, ubicacion;
		private int telefono;
		private ArrayList<Empleado> listaEmpleados = new ArrayList<Empleado>();
		private Empleado director;
		
		public Departamento(){
			
		}
		public Departamento(String nombre,String ubicacion, int telefono){
			this.nombre=nombre;
			this.ubicacion=ubicacion;
			this.telefono=telefono;
		}
		
		public void contratarEmpleado(Empleado emp){
			listaEmpleados.add(emp);
		}
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public String getUbicacion() {
			return ubicacion;
		}
		public void setUbicacion(String ubicacion) {
			this.ubicacion = ubicacion;
		}
		public int getTelefono() {
			return telefono;
		}
		public void setTelefono(int telefono) {
			this.telefono = telefono;
		}
		@Override
		public String toString() {
			return "Departamento [nombre=" + nombre + ", ubicacion=" + ubicacion + ", telefono=" + telefono + "]";
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
			return result;
		}
		
		
}
