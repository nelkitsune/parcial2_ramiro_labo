
import java.util.ArrayList;

public class funciones {
    public Boolean is_mutant(String[] adn){
        int counter =0;
        System.out.println("verificando horizontal ");
        counter = counter + horizontal(adn);
        if (counter >= 2){
            return true;
        }
        System.out.println("verificando vertical ");
        counter = counter + vertical(adn);
        if (counter >= 2){
            return true;
        }
        System.out.println("verificando diagonal principal ");
        counter = counter + diagonal_principal(adn);
        if (counter >= 2){
            return true;
        }
        System.out.println("verificando diagonal secundaria");
        counter = counter + diagonal_secundaria(adn);
        if (counter >= 2){
            return true;
        }
        System.out.println("verificando diagonal de 5");
        counter = counter + diagonal_5_a(adn);
        if (counter >= 2){
            return true;
        }
        counter = counter + diagonal_5_b(adn);
        if (counter >= 2){
            return true;
        }
        counter = counter + diagonal_5_c(adn);
        if (counter >= 2){
            return true;
        }
        counter = counter + diagonal_5_d(adn);
        if (counter >= 2){
            return true;
        }
        System.out.println("verificando diagonal de 4");
        counter = counter + diagonal_4(adn);
        if (counter >= 2){
            return true;
        }
        return false;
    }
    public int horizontal(String[] adn){
        int counter = 0;
        for (int i = 0; i < 6 ; i++){
            int match = 0;
            for (int j = 0; j < 3; j++) {
               if (adn[i].charAt(j) == adn[i].charAt(j+1) && adn[i].charAt(j+1) == adn[i].charAt(j+2) && (adn[i].charAt(j+2) == adn[i].charAt(j+3))){
                    match +=1;
                    if (match == 1){
                        counter+=1;
                        break;
                    }
                }

            }
        }
        return counter;
    }
    public int vertical(String[] adn){
        int counter = 0;
        for (int i = 0; i < 6 ; i++){
            int match = 0;
            for (int j = 0; j < 3; j++) {
                if (adn[j].charAt(i) == adn[j+1].charAt(i) && adn[j+1].charAt(i) == adn[j+2].charAt(i) && (adn[j+2].charAt(i) == adn[j+3].charAt(i))){
                    match +=1;
                    if (match == 1){
                        counter+=1;
                        break;
                    }
                }

            }
        }
        return counter;
    }
    public int diagonal_principal(String[]adn){
        int match = 0;
        for (int j = 0; j < 3; j++) {
           match = 0;
           char elem = adn[j].charAt(j);
            for (int i = j; i < 6; i++) {
                if (adn[i].charAt(i) ==elem){
                    match +=1;

                }else {
                    break;
                }
            }
            if (match >= 4){
                return 1;

            }
        }
        if (match >= 4) {
            return 1;
        }else {
            return 0;
        }
    }
    public int diagonal_secundaria(String[]adn){
        int match = 0;
        for (int j = 0; j < 3; j++) {
            match = 0;
            char elem = adn[j].charAt(5-j);
            for (int i = j; i < 4; i++) {
                if (adn[i+j].charAt(5-j-i) ==elem){
                    match +=1;

                }else {
                    break;
                }
            }
            if (match >= 4){
                return 1;

            }
        }
        if (match >= 4) {
            return 1;
        }else {
            return 0;
        }
    }
    public int diagonal_5_a(String []adn){
        int match = 0;
        for (int j = 0; j < 3; j++) {
            match = 0;
            char elem = adn[j].charAt(j+1);
            for (int i = j; i < 5; i++) {
                if (adn[i].charAt(i+1) ==elem){
                    match +=1;

                }else {
                    break;
                }
            }
            if (match >= 4){
                return 1;

            }
        }
        if (match >= 4) {
            return 1;
        }else {
            return 0;
        }
    }
    public int diagonal_5_b(String []adn){
        int match = 0;
        for (int j = 0; j < 2; j++) {
            match = 0;
            char elem = adn[j+1].charAt(j);
            for (int i = j; i < 5; i++) {
                if (adn[i+1].charAt(i) ==elem){
                    match +=1;

                }else {
                    break;
                }
            }
            if (match >= 4){
                return 1;

            }
        }
        if (match >= 4) {
            return 1;
        }else {
            return 0;
        }
    }
    public int diagonal_5_c(String []adn) {
        int match = 0;
        for (int j = 0; j < 2; j++) {
            match = 0;
            char elem = adn[j].charAt(4-j);
            for (int i = 0; i < 4; i++) {
                if (adn[i + i].charAt(4-j-i) == elem) {
                    match += 1;

                } else {
                    break;
                }
            }
            if (match >= 4) {
                return 1;

            }
        }
        if (match >= 4) {
            return 1;
        } else {
            return 0;
        }
    }
    public int diagonal_5_d(String []adn) {
        int match = 0;
        for (int j = 1; j < 3; j++) {
            match = 0;
            char elem = adn[j].charAt(6-j);
            for (int i = 0; i < 4; i++) {
                if (adn[i + i].charAt(6-j-i) == elem) {
                    match += 1;

                } else {
                    break;
                }
            }
            if (match >= 4) {
                return 1;

            }
        }
        if (match >= 4) {
            return 1;
        } else {
            return 0;
        }
    }
    public static int diagonal_4(String[] adn) {
        int counter = 0;

        if (adn[0].equals(adn[3]) && adn[3].equals(adn[6]) && adn[6].equals(adn[9])) {
            counter++;
        }
        if (adn[1].equals(adn[4]) && adn[4].equals(adn[7]) && adn[7].equals(adn[10])) {
            counter++;
        }
        if (adn[2].equals(adn[5]) && adn[5].equals(adn[8]) && adn[8].equals(adn[11])) {
            counter++;
        }

        return counter;
    }

}
