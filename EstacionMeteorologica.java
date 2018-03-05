package cinco;

import java.util.*;
public class EstacionMeteorologica{

	public String nombre;
	public int año; public int mes; public int dia;
	public TempHumDia[] mediciones_realizadas; //longitud 12, la media por cada mes
	public int num_mediciones;
	
	public EstacionMeteorologica() {
		this.nombre=" ";
		this.año=2000;
		this.mediciones_realizadas=new TempHumDia[366];
		this.num_mediciones=0;
	}
	
	public EstacionMeteorologica(String nombre, int año) {
		this();
		this.nombre=nombre;
		this.año=año;
	}

	public boolean AddDia(TempHumDia media) {
		boolean añadir=false;
		if(año==media.getAño()) {
			mediciones_realizadas[num_mediciones]=media;
			num_mediciones++;
			añadir=true;
		}else {
			System.out.print("ERROR");
			añadir=false;
		}
		
		return añadir;
		
			
	}
	
	public boolean delDia(TempHumDia media, int año, int mes, int dia) {
		boolean esta=true; //hay datos
		for(int i=0;i<mediciones_realizadas.length;i++) {
			if(this.año==año) {
				if(this.mes==mes) {
					if(this.dia==dia) {
						esta=false;
						mediciones_realizadas[i]=null;
					}
				}
			}
		}
		return esta;
	}
		
	
	
	public void ListarDias() {
		for(int i=0;i<mediciones_realizadas.length;i++) {
			if(this.mediciones_realizadas[i]!=null) {
			mediciones_realizadas[i].ToString();
			}
		}
	}
	
	

	public boolean delDia(TempHumDia medida1) {
		boolean esta=true; //hay datos
		for(int i=0;i<mediciones_realizadas.length;i++) {
			if(this.año==año) {
				if(this.mes==mes) {
					if(this.dia==dia) {
						esta=false;
						mediciones_realizadas[i]=null;
					}
				}
			}
		}
		return esta;
	} 
}




