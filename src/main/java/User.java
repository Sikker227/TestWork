public class User {
     String login;
     String e_mail;

    public User(String login, String e_mail) {
        this.login = login;
        this.e_mail = e_mail;
    }

    public User() {
    }

    public String getE_mail(String e_mail) {
        char[] emailToArray = e_mail.toCharArray();
        for (int i = 0; i < emailToArray.length; i++) {
            if ((emailToArray[i] == '@') || (emailToArray[i] == '.')) {
                this.e_mail = e_mail;
            }
        }
        return e_mail;
    }

    public String getLogin(String login) {
        char[] loginToArray = login.toCharArray();
        if(loginToArray.length < 5) {
            login = null;
        }
        return login;
    }
}


