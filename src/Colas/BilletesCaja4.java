package Colas;

import Estructuras.pilas.Pilas;

public class BilletesCaja4 {
    private Pilas monedasUnPeso;
    private Pilas monedasDosPesos;
    private Pilas monedasCincoPesos;
    private Pilas monedasDiezPesos;
    private Pilas billeteVeintePesos;
    private Pilas billeteCincuentaPesos;
    private Pilas billeteCienPesos;
    private Pilas billeteMilPesos;
    private Pilas billeteQuinientosPesos;
    private Pilas billeteDoscientosPesos;


    public BilletesCaja4 (Pilas monedasUnPeso, Pilas monedasDosPesos, Pilas monedasCincoPesos, Pilas monedasDiezPesos,
                    Pilas billeteVeintePesos, Pilas billeteCincuentaPesos, Pilas billeteCienPesos, Pilas billeteMilPesos,
                    Pilas billeteQuinientosPesos, Pilas billeteDoscientosPesos) {
        this.monedasUnPeso = monedasUnPeso;
        this.monedasDosPesos = monedasDosPesos;
        this.monedasCincoPesos = monedasCincoPesos;
        this.monedasDiezPesos = monedasDiezPesos;
        this.billeteVeintePesos = billeteVeintePesos;
        this.billeteCincuentaPesos = billeteCincuentaPesos;
        this.billeteCienPesos = billeteCienPesos;
        this.billeteMilPesos = billeteMilPesos;
        this.billeteQuinientosPesos = billeteQuinientosPesos;
        this.billeteDoscientosPesos = billeteDoscientosPesos;
        LlenarPila();
    }
 
	public void LlenarPila() {
		
			billeteDoscientosPesos.push(200.0);
			billeteDoscientosPesos.push(200.0);
			billeteDoscientosPesos.push(200.0);
			billeteDoscientosPesos.push(200.0);
			billeteDoscientosPesos.push(200.0);
			billeteDoscientosPesos.push(200.0);
			billeteDoscientosPesos.push(200.0);
			billeteDoscientosPesos.push(200.0);
			billeteDoscientosPesos.push(200.0);
			billeteDoscientosPesos.push(200.0);
			billeteQuinientosPesos.push(500.0);
			billeteQuinientosPesos.push(500.0);
			billeteQuinientosPesos.push(500.0);
			billeteQuinientosPesos.push(500.0);
			billeteQuinientosPesos.push(500.0);
			billeteQuinientosPesos.push(500.0);
			billeteQuinientosPesos.push(500.0);
			billeteQuinientosPesos.push(500.0);
			billeteQuinientosPesos.push(500.0);
			billeteQuinientosPesos.push(500.0);
			billeteMilPesos.push(1000.0);
			billeteMilPesos.push(1000.0);
			billeteMilPesos.push(1000.0);
			billeteMilPesos.push(1000.0);
			billeteMilPesos.push(1000.0);
			billeteMilPesos.push(1000.0);
			billeteMilPesos.push(1000.0);
			billeteMilPesos.push(1000.0);
			billeteMilPesos.push(1000.0);	   
			billeteMilPesos.push(1000.0);
			billeteCienPesos.push(100.0);
			billeteCienPesos.push(100.0);
			billeteCienPesos.push(100.0);
			billeteCienPesos.push(100.0);
			billeteCienPesos.push(100.0);
			billeteCienPesos.push(100.0);
			billeteCienPesos.push(100.0);
			billeteCienPesos.push(100.0);
			billeteCienPesos.push(100.0);
			billeteCienPesos.push(100.0);
			billeteCincuentaPesos.push(50.0);
			billeteCincuentaPesos.push(50.0);
			billeteCincuentaPesos.push(50.0);
			billeteCincuentaPesos.push(50.0);
			billeteCincuentaPesos.push(50.0);
			billeteCincuentaPesos.push(50.0);
			billeteCincuentaPesos.push(50.0);
			billeteCincuentaPesos.push(50.0);
			billeteCincuentaPesos.push(50.0);
			billeteCincuentaPesos.push(50.0);
			billeteVeintePesos.push(20.0);
			billeteVeintePesos.push(20.0);
			billeteVeintePesos.push(20.0);
			billeteVeintePesos.push(20.0);
			billeteVeintePesos.push(20.0);
			billeteVeintePesos.push(20.0);
			billeteVeintePesos.push(20.0);
			billeteVeintePesos.push(20.0);
			billeteVeintePesos.push(20.0);
			billeteVeintePesos.push(20.0);
			monedasUnPeso.push(1.0);
			monedasUnPeso.push(1.0);
			monedasUnPeso.push(1.0);
			monedasUnPeso.push(1.0);
			monedasUnPeso.push(1.0);
			monedasUnPeso.push(1.0);
			monedasUnPeso.push(1.0);
			monedasUnPeso.push(1.0);
			monedasUnPeso.push(1.0);
			monedasUnPeso.push(1.0);
			monedasDosPesos.push(2.0);
			monedasDosPesos.push(2.0);
			monedasDosPesos.push(2.0);
			monedasDosPesos.push(2.0);
			monedasDosPesos.push(2.0);
			monedasDosPesos.push(2.0);
			monedasDosPesos.push(2.0);
			monedasDosPesos.push(2.0);
			monedasDosPesos.push(2.0);
			monedasDosPesos.push(2.0);
			monedasCincoPesos.push(5.0);
			monedasCincoPesos.push(5.0);
			monedasCincoPesos.push(5.0);
			monedasCincoPesos.push(5.0);
			monedasCincoPesos.push(5.0);
			monedasCincoPesos.push(5.0);
			monedasCincoPesos.push(5.0);
			monedasCincoPesos.push(5.0);
			monedasCincoPesos.push(5.0);
			monedasCincoPesos.push(5.0);
			monedasDiezPesos.push(10.0);
			monedasDiezPesos.push(10.0);
			monedasDiezPesos.push(10.0);
			monedasDiezPesos.push(10.0);
			monedasDiezPesos.push(10.0);
			monedasDiezPesos.push(10.0);
			monedasDiezPesos.push(10.0);
			monedasDiezPesos.push(10.0);
			monedasDiezPesos.push(10.0);
			monedasDiezPesos.push(10.0);
			
		
	}
	
	public Pilas getMonedasUnPeso() {
		return monedasUnPeso;
	}
	public Pilas getMonedasDosPesos() {
		return monedasDosPesos;
	}
	public Pilas getMonedasCincoPesos() {
		return monedasCincoPesos;
	}
	public Pilas getMonedasDiezPesos() {
		return monedasDiezPesos;
	}
	public Pilas getBilleteVeintePesos() {
		return billeteVeintePesos;
	}
	public Pilas getBilleteCincuentaPesos() {
		return billeteCincuentaPesos;
	}
	public Pilas getBilleteCienPesos() {
		return billeteCienPesos;
	}
	public Pilas getBilleteMilPesos() {
		return billeteMilPesos;
	}
	public Pilas getBilleteQuinientosPesos() {
		return billeteQuinientosPesos;
	}
	public Pilas getBilleteDoscientosPesos() {
		return billeteDoscientosPesos;
	}

	public void setMonedasUnPeso(Pilas monedasUnPeso) {
	    this.monedasUnPeso = monedasUnPeso;
	}
	public void setMonedasDosPesos(Pilas monedasDosPesos) {
	    this.monedasDosPesos = monedasDosPesos;
	}

	public void setMonedasCincoPesos(Pilas monedasCincoPesos) {
	    this.monedasCincoPesos = monedasCincoPesos;
	}

	public void setMonedasDiezPesos(Pilas monedasDiezPesos) {
	    this.monedasDiezPesos = monedasDiezPesos;
	}

	public void setBilleteVeintePesos(Pilas billeteVeintePesos) {
	    this.billeteVeintePesos = billeteVeintePesos;
	}

	public void setBilleteCincuentaPesos(Pilas billeteCincuentaPesos) {
	    this.billeteCincuentaPesos = billeteCincuentaPesos;
	}

	public void setBilleteCienPesos(Pilas billeteCienPesos) {
	    this.billeteCienPesos = billeteCienPesos;
	}

	public void setBilleteMilPesos(Pilas billeteMilPesos) {
	    this.billeteMilPesos = billeteMilPesos;
	}

	public void setBilleteQuinientosPesos(Pilas billeteQuinientosPesos) {
	    this.billeteQuinientosPesos = billeteQuinientosPesos;
	}

	public void setBilleteDoscientosPesos(Pilas billeteDoscientosPesos) {
	    this.billeteDoscientosPesos = billeteDoscientosPesos;
	}



}



