package cinco;

public class TempDia{

	public int temp_max;
	public int temp_media;
	public int temp_min;
	public int a�o;
	public int mes;
	public int dia;
	
	public TempDia(int nuevoTemp_max, int nuevoTemp_media,int nuevoTemp_min,int a�o, int mes, int dia, int hum_max, int hum_min, int hum_media) {
		temp_max=nuevoTemp_max;
		temp_media=nuevoTemp_media;
		temp_min=nuevoTemp_min;
		
	}

	public TempDia(int hum_max,int hum_min,int hum_media) {
		temp_max=0;
		temp_media=0;
		a�o=2018;
		mes=2;
		dia=26;
	}
	
	
	public int getTemp_max() {
		return temp_max;
	}




	public void setTemp_max(int temp_max) {
		this.temp_max = temp_max;
	}




	public int getTemp_media() {
		return temp_media;
	}




	public void setTemp_media(int temp_media) {
		this.temp_media = temp_media;
	}




	public int getTemp_min() {
		return temp_min;
	}




	public void setTemp_min(int temp_min) {
		this.temp_min = temp_min;
	}




	public  int getA�o() {
		return a�o;
	}




	public void setA�o(int a�o) {
		this.a�o = a�o;
	}




	public int getMes() {
		return mes;
	}




	public void setMes(int mes) {
		this.mes = mes;
	}




	public int getDia() {
		return dia;
	}




	public void setDia(int dia) {
		this.dia = dia;
	}

	
	
}
