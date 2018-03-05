package cinco;

import java.util.*;
public class EstacionMeteorologica{

	public String nombre;
	public int a�o; public int mes; public int dia;
	public TempHumDia[] mediciones_realizadas; //longitud 12, la media por cada mes
	public int num_mediciones;
	
	public EstacionMeteorologica() {
		this.nombre=" ";
		this.a�o=2000;
		this.mediciones_realizadas=new TempHumDia[366];
		this.num_mediciones=0;
	}
	
	public EstacionMeteorologica(String nombre, int a�o) {
		this();
		this.nombre=nombre;
		this.a�o=a�o;
	}

	public boolean AddDia(TempHumDia media) {
		boolean a�adir=false;
		if(a�o==media.getA�o()) {
			mediciones_realizadas[num_mediciones]=media;
			num_mediciones++;
			a�adir=true;
		}else {
			System.out.print("ERROR");
			a�adir=false;
		}
		
		return a�adir;
		
			
	}
	
	public boolean delDia(TempHumDia media, int a�o, int mes, int dia) {
		boolean esta=true; //hay datos
		for(int i=0;i<mediciones_realizadas.length;i++) {
			if(this.a�o==a�o) {
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
			if(this.a�o==a�o) {
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




