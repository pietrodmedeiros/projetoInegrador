package universidade;

public class Boletim {
	private Aluno id_aluno;
	private Curso id_curso;
	private Double notaP1;
	private Double notaP2;
	private Double notaP3;

	public Aluno getId_aluno() {
		return id_aluno;
	}

	public void setId_aluno(Aluno id_aluno) {
		this.id_aluno = id_aluno;
	}

	public Curso getId_curso() {
		return id_curso;
	}

	public void setId_curso(Curso id_curso) {
		this.id_curso = id_curso;
	}

	public Double getNotaP1() {
		return notaP1;
	}

	public void setNotaP1(Double notaP1) {
		this.notaP1 = notaP1;
	}

	public Double getNotaP2() {
		return notaP2;
	}

	public void setNotaP2(Double notaP2) {
		this.notaP2 = notaP2;
	}

	public Double getNotaP3() {
		return notaP3;
	}

	public void setNotaP3(Double notaP3) {
		this.notaP3 = notaP3;
	}

	public Boletim(Aluno id_aluno, Curso id_curso, Double notaP1, Double notaP2, Double notaP3) {
		this.id_aluno = id_aluno;
		this.id_curso = id_curso;
		this.notaP1 = notaP1;
		this.notaP2 = notaP2;
		this.notaP3 = notaP3;
	}
}
