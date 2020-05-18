package question2;

/**
 * D�crivez votre classe FahrenheitCelsius ici.
 * 
 * @author (votre nom) 
 * @version (un num�ro de version ou une date)
 */
public class FahrenheitCelsius{

     /** le point d'entr�e de cette application, 
      * dont le commentaire est � compl�ter
      *
      *  @param args ...
      */
     public static void main(String[] args){
         int f = 0;
         float c = 0.0f;
       /*try{
           for(int i = 0; i<args.length; i++)
           {
                f =  Integer.parseInt(args[i]);
                c = fahrenheitEnCelsius(f);
                System.out.println("f: "+f+"  c: "+c);
           }
      
       }catch(NumberFormatException nfe){
           System.out.println("error : " + nfe.getMessage());  // en cas d'erreur 
       }*/
       
       for(int i = 0; i<args.length; i++)
       {
           try
           {
               f = Integer.parseInt(args[i]);
         
           }catch(NumberFormatException nfe){
           System.out.println("error : " + nfe.getMessage());  // en cas d'erreur 
           
            c = fahrenheitEnCelsius(f);
                 System.out.println(f + "\u00B0F -> " + c + "\u00B0C");
       }
               
       }
       
     }
     
     /** 
      * la m�thode � compl�ter. 
      *   @param f la valeur en degr� Fahrenheit
      *   @return  la conversion en degr� Celsius
      */
     public static float fahrenheitEnCelsius( int f){
      float res = (5.0f/9.0f)*(f-32);
		float newRes = ((int)(res*10))/10f;
		return (newRes);
     }

}
