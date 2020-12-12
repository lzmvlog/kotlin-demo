package top.lzmvlog.demokotlin.controller

import com.baomidou.mybatisplus.core.metadata.IPage
import com.baomidou.mybatisplus.extension.plugins.pagination.Page
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import top.lzmvlog.demokotlin.model.Student
import top.lzmvlog.demokotlin.service.impl.StudentServiceImpl

/**
 * @author ShaoJie zhang1591313226@163.com
 * @Date 2020年12月10日 18:18
 * @Description:
 */
@RestController
class StudentController {

    @Autowired
    lateinit var studentServiceImpl: StudentServiceImpl

    /**
     * 查询学生信息
     */
    @GetMapping("select")
    fun select(): List<Student> {
        return studentServiceImpl.selectList()
    }

    /**
     * 保存学生信息
     */
    @PostMapping("save")
    fun save(@RequestBody student: Student): String {
        val save = studentServiceImpl.save(student)
        if (save == 1) {
            return "保存成功"
        }
        return "保存失败"
    }

    /**
     * 根据学生id删除学生信息
     */
    @DeleteMapping("delete/{id}")
    fun delete(@PathVariable id: Int): String {
        val delete = studentServiceImpl.delete(id)
        if (delete == 1) {
            return "删除成功"
        }
        return "删除失败"
    }

    /**
     * 修改学生信息
     */
    @PostMapping("update")
    fun update(@RequestBody student: Student): String {
        val update = studentServiceImpl.update(student)
        if (update == 1) {
            return "修改成功"
        }
        return "修改失败"
    }

    /**
     * 修改学生信息
     */
    @PostMapping("selectPage")
    fun selectPage(page: Page<Student>): IPage<Student> {
        return studentServiceImpl.selectPage(page);
    }

}