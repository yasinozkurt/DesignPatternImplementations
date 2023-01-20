package com.company.Template;


// to perform log in to a website, there are three possible ways : as an admin, mod or simple user
public abstract class PersonAbstract {

    boolean signedUp(){return true;}
    boolean admin(){return true;}
    boolean mod(){return true;}
    boolean user(){return true;}

    public final  void tryToAccess(){
        request();

        if(!signedUp()){
            signUp();
            fillCredentials();
        }
        else{

            logIn();
        }
        if(admin()){
            performAdministration();
        }
       if(mod()){
            performModeration();
        }
       if(user()){
           performSimpleSurf();
       }




        logOut();
    }


    abstract void performAdministration();
    abstract void performModeration();
    abstract void performSimpleSurf();



    public void request(){
        System.out.println("Request has been sent to target website");
    }

    public void logIn(){
        System.out.println("Logged in ..");
    }

    public void logOut(){
        System.out.println("Logged out ..");
    }
    public void signUp(){
        System.out.println("Signed up ..");

    }
    public void fillCredentials(){
        System.out.println("succesfully filled ..");
    }

}
