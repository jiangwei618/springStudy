import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper {
	@Select("insert into user(name,age) values(#{name},#{age})")
	void insertUser(User user);

	@Select("select * from user where id=#{id}")
	User getUser(int id);

	@Select({"select userName , age from user"})
	@ResultMap(value = "BaseResultMap")
	List<User> getAllUser();
}
