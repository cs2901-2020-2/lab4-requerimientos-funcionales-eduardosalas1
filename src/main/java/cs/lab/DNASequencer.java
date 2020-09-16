package cs.lab;

import java.util.List;
import java.util.logging.Logger;

public class  DNASequencer {

    static final Logger logger = Logger.getLogger(DNASequencer.class.getName());
    public DNASequencer() {
        logger.info("Starting sequencer...");
    }

    public String calculate(List<String> part){

        for(int i = 0 ; i < part.size() ; i++){
            Sring subsequence1 = part.get(i);
            for(int j = i+1 ; j < part.size() ; j++){
                String subsequence2 = part.get(j);
                    for(int k = 0 ; k < subsequence1.length() ; k++){

                        
                    }

            }
        }


        return "AGATTACAGA";
    }

    public static void main(String args[]){



    }
}
