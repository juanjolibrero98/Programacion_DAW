public class LibreriaCadenasEj3 {

    public static String[] invertir(String cadena){

        int a=0;
        String[] cadenaConver= new String[cadena.length()];
        String[] resultado = new String[cadenaConver.length];
        for(int i=0;i<cadena.length();i++){
            cadenaConver[i]= String.valueOf(cadena.charAt(i));//hemos introducido el String en este array, ya tenenos encadenaConver "hola"
        }

        for(int i=cadenaConver.length-1;i>=0;i--){
            if(a<resultado.length){
                resultado[a] = cadenaConver[i].toUpperCase();
                a++;
            }
        }
        return resultado;
    }

    public static String[] desplazarVocales(String cadena2){
        int z=0;
        String[] cadenaConvert= new String[cadena2.length()];

        for(int i=0;i<cadena2.length();i++){
            if(cadena2.charAt(i) == 'a'){
                cadenaConvert[i] = "e";
            }else if(cadena2.charAt(i) == 'e'){
                cadenaConvert[i] = "i";
            }else if(cadena2.charAt(i) == 'i'){
                cadenaConvert[i] = "o";
            }else if(cadena2.charAt(i) == 'o'){
                cadenaConvert[i] = "u";
            }else if(cadena2.charAt(i) == 'u'){
                cadenaConvert[i] = "a";
            }else{
                cadenaConvert[i]= String.valueOf(cadena2.charAt(i));
            }

        }

        return cadenaConvert;
    }

}
