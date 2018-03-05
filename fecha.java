package cinco;

public class fecha {
	
	private int dia;
	private int mes;
	private int año;
	
	public fecha(int nuevoDia, int nuevoMes, int nuevoAño) {
		dia=nuevoDia;
		mes=nuevoMes;
		año=nuevoAño;
	}

	public void ver() {
		System.out.print(dia+"/"+mes+"/"+año);
	}
	
	public int getDia() {
		return dia;
	}
	
	public int getMes() {
		return mes;
	}
	
	public int getAño() {
		return año;
	}
	
	public void setDia(int nuevoDia) {
		dia=nuevoDia;
	}
	
	public void setMes(int nuevoMes) {
		mes=nuevoMes;
	}
	
	public void setAño(int nuevoAño) {
		año=nuevoAño;
	}
	
	
	
}
