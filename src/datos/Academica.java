
package datos;

public class Academica {
    private int numReferencia ;
    private String nome;
    private int nota;     
    private String persoal;
    private String alum;
    public Academica(){
        }
    public Academica(int nf,String n,int no,String pe,String a){
        this.numReferencia=nf;
        this.nome=n;
        this.nota=no;
        this.persoal=pe;
        this.alum=a;
        }
    public void calcularNota(){
        
    }
    @Override
    public String toString(){
        return nome.concat("").concat("\nnota:"+nota);
        
    }
}
