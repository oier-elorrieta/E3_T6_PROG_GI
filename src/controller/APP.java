package controller;

import org.mindrot.jbcrypt.BCrypt;

import model.*;

public class APP {

	public static void main(String[] args) {

        String a = "1234";
        String hashedPassword = BCrypt.hashpw("1234", BCrypt.gensalt());
        
        System.out.println(hashedPassword);
        

        // Genera un hash Bcrypt
        String p2 = BCrypt.hashpw("1234", BCrypt.gensalt());
        
        System.out.println(p2);
        
        System.out.println(BCrypt.checkpw(a, p2));
        


	}

}
