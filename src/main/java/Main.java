import com.google.gson.Gson;

public class Main {

    public static void main(String[] args){
        System.out.println("Welcome to my app 01");

 //       serializeUsersimple();
        deserializeUserSimple();
    }

    private static void serializeUsersimple(){

        UserSimple user = new UserSimple(
                "Gleb",
                "gleb123@gmail.com",
                19,
                true
        );

        Gson gson = new Gson();
        String json = gson.toJson(user);

    }

    private static void deserializeUserSimple(){
        String userJson = "{'age':22,'email':'gleb123@gmail.com','isDeveloper':true,'name':Gleb'}";

        Gson gson = new Gson();
        UserSimple userSimple = gson.fromJson(userJson, UserSimple.class);
    }
}
