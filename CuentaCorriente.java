package Herenciaypolimorfimo;


public class CuentaCorriente extends CuentaBancaria {

    @Override
    double getinteresDeposito() {
        return 0.02;
    }// get interes Deposito
    
    /*@Override
    public void deposito(double deposito){
        double interes=0;
        if(deposito<1000)
            interes=deposito*0.01;
        
        this.Saldo=this.Saldo+deposito+interes;    
    }*/
    
}// de Cuenta Corriente 
