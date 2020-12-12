package top.lzmvlog.demokotlin.service

import com.baomidou.mybatisplus.core.metadata.IPage
import com.baomidou.mybatisplus.extension.plugins.pagination.Page
import top.lzmvlog.demokotlin.model.Student

/**
 * @author ShaoJie zhang1591313226@163.com
 * @Date 2020年12月10日 18:14
 * @Description:
 */
interface StudentService {

    /**
     * 查询学生集合
     */
    fun selectList(): List<Student>

    /**
     * 保存学生信息
     */
    fun save(student: Student): Int

    /**
     * 根据学生id删除
     */
    fun delete(id: Int): Int

    /**
     * 更新学生信息
     */
    fun update(student: Student): Int

    /**
     * 分页查询学生信息
     */
    fun selectPage(page: Page<Student>): IPage<Student>

}