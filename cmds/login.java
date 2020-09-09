package cmds;



public class login {
//https://dev.to/awwsmm/how-to-encrypt-a-password-in-java-42dh
  public static void main(String[] args) {
    MongoClientURI dbToken = new MongoClientURI("mongodb+srv://OWPC:<password>@bidding.92wgv.mongodb.net/<dbname>?retryWrites=true&w=majority");
    MongoClient dbClient = new MongoClient(dbToken);
    MongoDatabase db = dbClient.getDatabase("test");
  }
}
