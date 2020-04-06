class Formula1 extends Thread{
	private Piloto p;
	private int tempo, totVoltas;
	private boolean chegou = false;
	private Terminada list;

	public Formula1(Piloto p, int tempo, int totVoltas, Terminada t){
		this.p = p;
		this.tempo = tempo;
		this.totVoltas = totVoltas;
		this.list = t;
	}
	public void comecar(){
		this.start();
	}

	public void run(){
		for(int i = 0; i <= this.totVoltas; i++){
			try{
				System.out.println(this.p.getNome() + " está na pista " + i);
				this.sleep(this.tempo);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
		
		this.list.setVencedor(this.p.getNome());
		this.chegou = true;
	}

	public boolean getChegada(){
		return this.chegou;
	}
}
