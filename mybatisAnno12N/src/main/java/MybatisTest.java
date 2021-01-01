import mapper.CategoryMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import pojo.Category;
import pojo.Product;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MybatisTest {
    public static void main(String[] args) throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession session = sqlSessionFactory.openSession();

        CategoryMapper mapper = session.getMapper(CategoryMapper.class);

        listAll(mapper);

        session.commit();
        session.close();
    }

    public static void listAll(CategoryMapper mapper) {
        List<Category> categoryList = mapper.list();
        for (Category c :
                categoryList) {
            System.out.println(c.getName());
            for (Product p :
                    c.getProducts()) {
                System.out.println("\t" + p.getName());
            }
        }
    }
}
