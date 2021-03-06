
public class Filme {
	private Avaliacao avaliacao;
	private String titulo;
	private String diretor;
	private String atorPrincipal;
	private String produtor;
	private String sinopse;
	private String genero;
	private int idadeMinima;

	public Filme(String pTitulo, String pDiretor, String pAtorPrincipal, String pProdutor, String pSinopse, String pGenero,
			int pIdadeMinima) {
		titulo = pTitulo;
		diretor = pDiretor;
		atorPrincipal = pAtorPrincipal;
		produtor = pProdutor;
		sinopse = pSinopse;
		genero = pGenero;
		idadeMinima = pIdadeMinima;
	}

	public Avaliacao getAvaliacao() {
		return avaliacao;
	}

	public void setAvaliacao(Avaliacao avaliacao) {
		this.avaliacao = avaliacao;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDiretor() {
		return diretor;
	}

	public void setDiretor(String diretor) {
		this.diretor = diretor;
	}

	public String getAtorPrincipal() {
		return atorPrincipal;
	}

	public void setAtorPrincipal(String atorPrincipal) {
		this.atorPrincipal = atorPrincipal;
	}

	public String getProdutor() {
		return produtor;
	}

	public void setProdutor(String produtor) {
		this.produtor = produtor;
	}

	public String getSinopse() {
		return sinopse;
	}

	public void setSinopse(String sinopse) {
		this.sinopse = sinopse;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getIdadeMinima() {
		return idadeMinima;
	}

	public void setIdadeMinima(int idadeMinima) {
		this.idadeMinima = idadeMinima;
	}
}
