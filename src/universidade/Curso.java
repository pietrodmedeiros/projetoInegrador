package universidade;

public class Curso {
	private String nome_curso;
	private Integer id_curso;
	private Aluno id_aluno[];
	private Professor id_professor;

	public String getNome() {
		return nome_curso;
	}

	public void setNome(String nome_curso) {
		this.nome_curso = nome_curso;
	}

	public Integer getId_curso() {
		return id_curso;
	}

	public void setId_curso(Integer id_curso) {
		this.id_curso = id_curso;
	}

	public Aluno[] getId_aluno() {
		return id_aluno;
	}

	public void setId_aluno(Aluno[] id_aluno) {
		this.id_aluno = id_aluno;
	}

	public Professor getId_professor() {
		return id_professor;
	}

	public void setId_professor(Professor id_professor) {
		this.id_professor = id_professor;
	}

	public Curso(String nome_curso, Integer id_curso, Aluno[] id_aluno, Professor id_professor) {
		this.nome_curso = nome_curso;
		this.id_curso = id_curso;
		this.id_aluno = id_aluno;
		this.id_professor = id_professor;
	}
}
