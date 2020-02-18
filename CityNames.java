import java.util.Scanner;
import java.util.Arrays;

public class CityNames {

	private static Scanner cityDefinition;

	public static void main(String[] args) {
		
//FASE 1	
		
		//Crea seis variables tipo string vacías.
		
		String city1;
		String city2;
		String city3;
		String city4;
		String city5;
		String city6;
		

		//Pide por consola que se introducen los nombres y estos vayan a cada variable creada.
				
		    Scanner askCity = new Scanner(System.in);  
		    System.out.println("Enter 6 city names");
		    String cities = askCity.nextLine();  
		     
		    
		    city1= "Barcelona";
		    city2= "Madrid";
		    city3= "Valencia";
		    city4= "Malaga";
		    city5= "Cadis";
		    city6= "Santander";
		    
		    System.out.println("The selected cities are " + city1 + " " + city2 + " " + city3 + " " + city4 + " " + city5 + " " + city6); 
		
		
		 //Introduce los siguientes nombres de ciudades (Barcelona, Madrid, Valencia, Malaga, Cadis, Santander) por teclado.
		 //RESULTADO EN CONSOLA   
		
		 //Muestra por consola el nombre de les 6 ciudades.  
		 // RESULTADO EN CONSOLA
		    
		    
		    System.out.println(" ");
		    
		    
//FASE 2 
		    
		    
// una vez tengamos los nombres de las ciudades guardadas tenemos que pasar la info a un array (arrayCities).
		    
		    String[] selectedCities = {city1, city2, city3, city4, city5, city6};
		    
		    
		    
// Cuando tengamos el array lleno tenemos que mostrar por consola el nombre de las ciudades ordenadas por orden alfabético.
		    Arrays.sort(selectedCities);
	        for(int i = 0; i < selectedCities.length; i++)
	            System.out.println(selectedCities[i]);	    
		    
		 
	        System.out.println(" ");
//FASE 3
	        
//Cambia las vocales “a” de los nombres de las ciudades por el número 4 i guarda los nombres modificados en un nuevo array(ArrayCiutatsModificades).
	        String[] modifiedSelectedCities = new String[6];

	        //selectedCities.replace( "a", "f");
	        for(int i = 0; i < selectedCities.length; i++){
	        	modifiedSelectedCities[i]=selectedCities[i].replace('a', '4');
	        }
	        for(int i = 0; i < selectedCities.length; i++)
	            System.out.println(modifiedSelectedCities[i]);	  
	       
	        
	       
	        
	        
//Mostreu per consola l’array modificat i ordenat per ordre alfabetic.	
	        Arrays.sort(modifiedSelectedCities);
	        for(int i = 0; i < modifiedSelectedCities.length; i++)
	            System.out.println(modifiedSelectedCities[i]);  
	        
	        
	        System.out.println(" ");
	        

// FASE 4
//Crea un nuevo array por cada una de las ciudades que tenemos. La medida de los nuevos arrays será del tamaño de cada string (string cityName.Length).
	        
	        
	        String newcity1 = "Barcelona"; 
	        
	        char[] ch1 = new char[newcity1.length()]; 
	        
	        String newcity2 = "Madrid"; 
	        
	        char[] ch2 = new char[newcity2.length()]; 
	        
	        String newcity3 = "Valencia"; 
	        
	        char[] ch3 = new char[newcity3.length()];
	        
	        String newcity4 = "Malaga"; 
	        
	        char[] ch4 = new char[newcity4.length()];
	        
	        String newcity5 = "Cadis"; 
	        
	        char[] ch5 = new char[newcity5.length()];
	        
	        String newcity6 = "Santander"; 
	        
	        char[] ch6 = new char[newcity6.length()]; 
	        
	  
	      
	        

// Rellena el nuevo array letra por letra.
	        
	     
	        for (int i = 0; i < newcity1.length(); i++) { 
	            ch1[i] = newcity1.charAt(i); 
	        } 
	        
	        for (int i = 0; i < newcity2.length(); i++) { 
	            ch2[i] = newcity2.charAt(i); 
	        } 
	        
	        for (int i = 0; i < newcity3.length(); i++) { 
	            ch3[i] = newcity3.charAt(i); 
	        } 
	        
	        for (int i = 0; i < newcity4.length(); i++) { 
	            ch4[i] = newcity4.charAt(i); 
	        } 
	        
	        for (int i = 0; i < newcity5.length(); i++) { 
	            ch5[i] = newcity5.charAt(i); 
	        } 
	        
	        for (int i = 0; i < newcity6.length(); i++) { 
	            ch6[i] = newcity6.charAt(i); 
	        } 
	        
	        
	        
	  

		        
// Muestra por consola los nuevos arrays con los nombres invertidos (Ej: Barcelona - anolecraB).
	        
	        for(int i=ch1.length -1; i>=0;i--){
	        	
	        	System.out.println(ch1[i]);
	        }
	        
	        
	        for (char c1 : ch1) { 
	            System.out.println(c1); 
	        } 
	       
	        
	        
	       System.out.println(" ");
	       
	       	
	       	for (char c2 : ch2) { 
	            System.out.println(c2); 
	        } 
	        
	        for(int i=ch2.length -1; i>=0;i--){
	        	
	        	System.out.println(ch2[i]);
	        }
	        
	        
	        
	        
	        System.out.println(" ");

	        for (char c3 : ch3) { 
	            System.out.println(c3); 
	        } 
	        
	        for(int i=ch3.length -1; i>=0;i--){
	        	
	        	System.out.println(ch3[i]);
	        }
	        
	        
	        
	        
	        System.out.println(" ");
	        
	        for (char c4 : ch4) { 
	            System.out.println(c4); 
	        } 
	        
	        for(int i=ch4.length -1; i>=0;i--){
	        	
	        	System.out.println(ch4[i]);
	        }
	        
	        
	        
	        
	        System.out.println(" ");
	        
	        for (char c5 : ch5) { 
	            System.out.println(c5); 
	        } 
	        
	        for(int i=ch5.length -1; i>=0;i--){
	        	
	        	System.out.println(ch5[i]);
	        }	        
	        
	        
	        
	        
	        System.out.println(" ");

	        for (char c6 : ch6) { 
	            System.out.println(c6); 
	        } 
	        
	        for(int i=ch6.length -1; i>=0;i--){
	        	
	        	System.out.println(ch6[i]);
	        }	        
	        System.out.println(" ");
	        
	      

	        
	        
	        
	        
	}

}
