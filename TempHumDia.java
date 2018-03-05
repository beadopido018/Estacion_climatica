package cinco;

public class TempHumDia extends TempDia{

	public int hum_max;
	public int hum_min;
	public int hum_media;
	

	public TempHumDia(int dia, int mes, int año, int temp_max, int temp_min, int hum_max, int hum_min) {
		super(dia, mes, año, temp_min, temp_max, hum_min, hum_min, hum_min, hum_min);
		this.hum_min=hum_min;
		hum_media=(this.hum_max+this.hum_min)/2;
	}
	
	public int getHum_max() {
		return hum_max;
	}

	public void setHum_max(int hum_max) {
		this.hum_max = hum_max;
	}

	public int getHum_min() {
		return hum_min;
	}

	public void setHum_min(int hum_min) {
		this.hum_min = hum_min;
	}

	public int getHum_media() {
		return hum_media;
	}

	public void setHum_media(int hum_media) {
		this.hum_media = hum_media;
	}

	public void ToString() {
			System.out.println("Fecha: "+dia+"/"+mes+"/"+año);
			System.out.println("Temperatura máxima: "+temp_max+" y la minima: "+temp_min);
			temp_media=(temp_max+temp_min)/2;
			System.out.println("Temperatura media: "+temp_media);
			System.out.println("La humedad media es: "+hum_media);
	}
}
