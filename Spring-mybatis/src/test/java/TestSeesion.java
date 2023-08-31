import com.Husky.spring.mapper.UserMapper;
import com.Husky.spring.pojo.User;
import com.Husky.spring.utils.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class TestSeesion {
    SqlSession sqlSession= MybatisUtil.getSqlSession();
    UserMapper mapper = sqlSession.getMapper(UserMapper.class);
    User user=new User("囧太郎",3,'男');
    @Test
    public void testInsert(){
        int count= mapper.insertUser(user);
        System.out.println(count);
        sqlSession.commit();
        sqlSession.close();
    }
    @Test
    public void testDelete(){
        int count=mapper.deleteByUserName(user);
        System.out.println(count);
        sqlSession.commit();
        sqlSession.close();
    }
    @Test
    public void testDeleteNull(){
        int count= mapper.deleteNull();
        System.out.println(count);
        sqlSession.commit();
        sqlSession.close();
    }
    @Test
    public void testSelectAll(){
        List<User> users = mapper.selectAll();
        System.out.println(users);
        sqlSession.commit();
        sqlSession.close();
    }
}
