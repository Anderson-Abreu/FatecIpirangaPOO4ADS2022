package Collection;

public class Aula {
	private String titulo;
	private int tempo;
	
	public Aula(String t, int x)
	{
		this.titulo=t;
		this.tempo=x;
	}
	
	public String toString()
	{
		return"Aulas: "+this.titulo+", "+this.tempo+" min";
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getTempo() {
		return tempo;
	}

	public void setTempo(int tempo) {
		this.tempo = tempo;
	}
	
}
