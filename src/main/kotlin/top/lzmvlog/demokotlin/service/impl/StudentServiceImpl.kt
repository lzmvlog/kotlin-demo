package top.lzmvlog.demokotlin.service.impl

import com.baomidou.mybatisplus.core.metadata.IPage
import com.baomidou.mybatisplus.core.toolkit.Wrappers
import com.baomidou.mybatisplus.extension.plugins.pagination.Page
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import top.lzmvlog.demokotlin.mapper.StudentMapper
import top.lzmvlog.demokotlin.model.Student
import top.lzmvlog.demokotlin.service.StudentService

/**
 * @author ShaoJie zhang1591313226@163.com
 * @Date 2020年12月10日 18:14
 * @Description:
 */
@Service
class StudentServiceImpl : StudentService {

    @Autowired
    lateinit var studentMapper: StudentMapper

    /**
     * 查询所有学生
     */
    override fun selectList(): List<Student> {
        return studentMapper.selectList(Wrappers.query())
    }

    /**
     * 保存学生信息
     */
    override fun save(student: Student): Int {
        return studentMapper.insert(student)
    }

    /**
     * 根据学生id删除
     */
    override fun delete(id: Int): Int {
        return studentMapper.deleteById(id)
    }

    /**
     * 更新学生信息
     */
    override fun update(student: Student): Int {
        return studentMapper.updateById(student)
    }

    /**
     * 分页查询学生信息
     */
    override fun selectPage(page: Page<Student>): IPage<Student> {
        return studentMapper.selectPage(page, Wrappers.query())
    }
}