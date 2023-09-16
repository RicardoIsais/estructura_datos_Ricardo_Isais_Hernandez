package Estructuras.nodos;

public class booleanNodo {
		private Object dato;
		private booleanNodo enlace;
		private boolean prioridad;
		public Object getDato() {
			return dato;
		}
		public void setDato(Object dato) {
			this.dato = dato;
		}
		public booleanNodo getEnlace() {
			return enlace;
		}
		public void setEnlace(booleanNodo enlace) {
			this.enlace = enlace;
		}
		public boolean getPrioridad() {
			return prioridad;
		}
		public void setPrioridad(boolean prioridad) {
			this.prioridad = prioridad;
		}

}

