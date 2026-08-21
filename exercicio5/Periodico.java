package exercicio5;


    public class Periodico extends Publicacao{
         private int numeroVolume;

         public Periodico(String titulo,int numerovolume){
            super(titulo);
            this.numeroVolume = numeroVolume;
         }
         public int getNumeroVolume(){
            return numeroVolume;
         }
    }
          
