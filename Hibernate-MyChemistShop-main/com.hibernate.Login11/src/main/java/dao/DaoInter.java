package dao;

public interface DaoInter {
    boolean signIn(int userId, String password);
    boolean signUp(int userId, String password, String email);
    boolean removeAccount(int userId);
    boolean updatePassword(int userId, String newPassword);
}