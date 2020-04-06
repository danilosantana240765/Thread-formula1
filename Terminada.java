class Terminada{
	private String vencedores[];
	int pos, tot;

	public Terminada(int totPos){
		this.pos = 0;
		this.tot = totPos;
		this.vencedores = new String[totPos];
	}

	public synchronized void setVencedor(String vencedor){
		this.vencedores[this.pos] = vencedor;
		this.pos++;
	}

	public String getListagem(){
		String str = "";
		for(int i = 0; i < this.pos; i++){
			str += (i + 1) + "º posicao = " + this.vencedores[i] + "\n";
		}

		return str;
	}

}
