package list;


public class FavoritaLinguagem
{
	public static void main(String[] args)
	{
		
	}
}



class LinguagemFavorita
{
	private String nome ;
	private String ide;
	private Integer anoCriacao;
	
	public LinguagemFavorita(String nome, String ide, Integer anoCriacao)
	{
		super();
		this.nome = nome;
		this.ide = ide;
		this.anoCriacao = anoCriacao;
	}

	public String getNome() {
		return nome;
	}

	public String getIde() {
		return ide;
	}


	public Integer getAnoCriacao() {
		return anoCriacao;
	}

	@Override
	public String toString() 
	{
		return "LinguagemFavorita [nome=" + nome + ", ide=" + ide + ", anoCriacao=" + anoCriacao + "]";
	}

	
	
	
	
	
}