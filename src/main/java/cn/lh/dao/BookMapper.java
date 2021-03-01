package cn.lh.dao;

import cn.lh.pojo.Books;
import java.util.List;

/**
 * BookMapper
 *
 * @author 欢
 * @version 1.0
 * 2021/2/28 20:56
 **/
public interface BookMapper {

    /**
     * 增加一个Book
     */
 int addBook(Books book);

    /**
     * 根据id删除一个Book
     * @param id
     * @return
     */
         int deleteBookById(int id);

 //更新Book
         int updateBook(Books books);

 //根据id查询,返回一个Book
         Books queryBookById(int id);

 //查询全部Book,返回list集合
         List<Books> queryAllBook();

}
