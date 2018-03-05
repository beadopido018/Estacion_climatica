package cinco;

public class TempDia{

	public int temp_max;
	public int temp_media;
	public int temp_min;
	public int año;
	public int mes;
	public int dia;
	
	public TempDia(int nuevoTemp_max, int nuevoTemp_media,int nuevoTemp_min,int año, int mes, int dia, int hum_max, int hum_min, int hum_media) {
		temp_max=nuevoTemp_max;
		temp_media=nuevoTemp_media;
		temp_min=nuevoTemp_min;
		
	}

	public TempDia(int hum_max,int hum_min,int hum_media) {
		temp_max=0;
		temp_media=0;
		año=2018;
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




	public  int getAño() {
		return año;
	}




	public void setAño(int año) {
		this.año = año;
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
