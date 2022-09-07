
public class ProfessorHorista extends Professor{

	float valorHora;
	int totalHoras;
	
	public ProfessorHorista(String nmProf, int matrProf, float valorHora, int totalHoras) {
		super(nmProf, matrProf);
		this.valorHora = valorHora;
		this.totalHoras = totalHoras;
	}

}
