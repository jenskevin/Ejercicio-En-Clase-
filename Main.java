
package Herenciaypolimorfimo;


public class Main {
    
    public static void main(String[] args) {
        
        CuentaBancaria cta1=new CuentaCorriente();
        CuentaBancaria cta2=new CuentaAhorro();
        CuentaAhorro cta3=new CuentaAhorro();
        
        cta1.setNombre("cta1");
        cta2.setNombre("cta2");
        cta3.setNombre("cta3");
        
        cta1.setSaldo(100);
        cta2.setSaldo(200);
        cta3.setSaldo(300);
        
        
        
        imprimirSaldo(cta1);
        imprimirSaldo(cta2);
        imprimirSaldo(cta3);
        
        CuentaCorriente cta4=new CuentaCorriente();
        cta4.setNombre("cta4");
        cta4.setSaldo(10);
        cta4.deposito(100);
        imprimirSaldo(cta4);
        
        CuentaBancaria cta5=new CuentaAhorro();
        cta5.setNombre("cta5");
        cta5.setSaldo(10);
        cta5.deposito(100);
        imprimirSaldo(cta5);
    }// del main
    
    public static void imprimirSaldo(CuentaBancaria cta){
            System.out.println("Cuenta: "+cta.getNombre()+"Saldo: "+cta.getSaldo());
    }// de imprimir Saldo
    
} // clase main
