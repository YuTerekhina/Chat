package rugb.chat.server;

public interface AuthService {

    String getNickByLoginAndPassword(String login, String password);
}
