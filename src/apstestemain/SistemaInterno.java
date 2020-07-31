
package apstestemain;


public class SistemaInterno {
    
    public boolean login(Autenticavel a){
        
        int senha = 123;
        
        boolean ok = a.autentica(senha);
        
        return ok;
    }
    
    
    
}
