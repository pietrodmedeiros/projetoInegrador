package universidade;

public class Curso {
	private String nome;
	private Integer id_curso;
	private Integer id_aluno[];
	private Integer id_professor;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getId_curso() {
		return id_curso;
	}
	public void setId_curso(Integer id_curso) {
		this.id_curso = id_curso;
	}
	public Integer[] getId_aluno() {
		return id_aluno;
	}
	public void setId_aluno(Integer[] id_aluno) {
		this.id_aluno = id_aluno;
	}
	public Integer getId_professor() {
		return id_professor;
	}
	public void setId_professor(Integer id_professor) {
		this.id_professor = id_professor;
	}
	
}
