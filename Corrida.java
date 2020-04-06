class Corrida extends Thread {
	private Terminada t;
	private Formula1 []f;

	public Corrida(Formula1[] f, Terminada t){
		this.f = f;
		this.t = t;
	}

	private boolean checkChegadasTerminadas(){
		int totChegada = 0;
		for(int i = 0; i < this.f.length; i++){
			if(f[i].getChegada()){
				totChegada++;
			}
		}
		return totChegada == f.length;
	}

	public void correr(){
		new Thread(this).start();
		for(int i = 0; i < this.f.length; i++){
			this.f[i].comecar();
		}
		
		while(!this.checkChegadasTerminadas()); // Fica travado neste loop
		System.out.println("====== RANKING =======");
		System.out.println(this.t.getListagem());
	}
}
