package aplicacion;

import java.util.Scanner;
public class aula {
	Scanner entrada= new Scanner(System.in);
	private boolean internet; 
	private int numAula;
	private int numAlumnos;
        private String nomProfesor;
        private int numCarpetas;
	public aula(boolean internet,int numAula,int numAlumnos, String nomProfesor, int numCarpetas) {
		this.internet = internet;
		this.numAula = numAula;
		this.numAlumnos=numAlumnos;
                this.nomProfesor=nomProfesor;
                this.numCarpetas=numCarpetas;
	}
	public boolean isInternet() {
		return internet;
	}
	public void setInternet(boolean internet) {
		this.internet = internet;
	}
	public int getNumAula() {
		return numAula;
	}
	public void setNumAula(int numAula) {
		this.numAula = numAula;
	}
	public int getNumAlumnos() {
		return numAlumnos;
	}
	public void setNumAlumnos(int numAlumnos) {
		this.numAlumnos=numAlumnos;
	}
        public String getNomProfesor() {
		return nomProfesor;
	}
	public void setNomProfesor(String nomProfesor) {
		this.nomProfesor = nomProfesor;
	}
        
        public int getNumCarpetas() {
		return numCarpetas;
	}
	public void setNumCarpetas(int numCarpetas) {
		this.numCarpetas = numCarpetas;
	}
        
	public boolean verificarConexion() {
		if(internet) {
			System.out.println("Hay internet");
			return true;
		}
		else {
			mandarAlerta("ADVERTENCIA NO HAY CONEXIÓN DE INTERNET");
			return false;
		}
	}
	public void nombreProfesor() {
		System.out.println("Digite el nombre del profesor");
                nomProfesor = entrada.next();
	}
	public String mandarAlerta(String mensaje) {
		return "ALERTA!"+mensaje;
	}
	public void verificarEquipos() {
	    // Verificar la conexión a Internet
	    if (!internet) {
	        System.out.println(mandarAlerta("No hay conexión a internet en el aula"));
	    } else {
	        System.out.println("El aula cuenta con conexión a internet.");
	    }
	}
        // Método para verificar si hay suficientes carpetas
    public void verificarCarpetas(int carpetas) {
        if (getNumCarpetas() >= carpetas) {
            System.out.println("Hay suficientes carpetas para los alumnos.");
        } else {
            mandarAlerta("Faltan carpetas para los alumnos.");
        }
    }
	public void volverMenu() {
		System.out.println("Volviendo a la 3era pantalla");
	}
	
}       