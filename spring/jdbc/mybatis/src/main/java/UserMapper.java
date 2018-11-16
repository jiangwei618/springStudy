import java.util.List;

public interface UserMapper {
	void insertUser(User user);
	User getUser(int id);
	List<User> getAllUser();
}
