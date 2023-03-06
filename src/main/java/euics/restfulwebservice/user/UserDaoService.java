package euics.restfulwebservice.user;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
@Transactional
public class UserDaoService {
    private static List<User> users = new ArrayList<>();

    private static int usersCount = 3;

    // 고정적으로 List에 저장할 User 3개를 만들어준다.
    static {
        users.add(new User(1, "Euics", new Date()));
        users.add(new User(2, "Boonms", new Date()));
        users.add(new User(3, "DukGun", new Date()));
    }

    // findAll() method를 통해 List에 있는 모든 User들을 반환한다.
    public List<User> findAll(){
        return users;
    }

    // save() method를 통해 List<User>에 user를 저장한다.
    public User save(User user){
        if(user.getId() == null)
            user.setId(++usersCount);

        users.add(user);
        return user;
    }

    // findOne() method를 통해 id의 일치 여부를 확인해 확인된 id를 가진 user를 반환한다.
    public User findOne(int id){
        for(User user: users){
            if(user.getId() == id)
                return user;
        }

        return null;
    }
}
