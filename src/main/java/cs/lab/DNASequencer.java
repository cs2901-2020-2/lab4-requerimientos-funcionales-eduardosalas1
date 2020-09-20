package cs.lab;

import java.util.List;
import java.util.logging.Logger;

public class  DNASequencer {

    private static final Logger logger = Logger.getLogger(DNASequencer.class.getName());
    
    public DNASequencer() {
        logger.info("Starting sequencer...");
    }

    public String calculate(List<String> parts){

        if(parts.size() > 160000){
            throw new SubSizeEx("Too many subsequences.");
        }        
        
        for(String word:parts){
            if(word.length() > 200)
                throw new SubLenEx("The lenght of a subsequence is too large.");
        }

        
        StringBuilder Resultado = new StringBuilder();
        Resultado.append(parts.get(0));

        for (int itrStr = 1; itrStr < parts.size(); itrStr++) {
            String elementoDeLista = parts.get(itrStr);
            StringBuilder sumOfChars = new StringBuilder();

            for (int j = 0; j < elementoDeLista.length(); j++){
                char caracter = elementoDeLista.charAt(j);
                String cStr = Character.toString(caracter);
                sumOfChars.append(cStr);

                if(!(Resultado.toString()).contains(sumOfChars)){
                    Resultado.append(cStr);
                }
            }
        }
        return Resultado.toString();
    }

    public static void main(String args[]){



    }
}
