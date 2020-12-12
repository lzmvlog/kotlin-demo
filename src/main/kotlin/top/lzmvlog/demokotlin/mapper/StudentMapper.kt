package top.lzmvlog.demokotlin.mapper

import com.baomidou.mybatisplus.core.mapper.BaseMapper
import org.apache.ibatis.annotations.Mapper
import top.lzmvlog.demokotlin.model.Student

/**
 * @author ShaoJie zhang1591313226@163.com
 * @Date 2020年12月10日 18:13
 * @Description:
 */
@Mapper
interface StudentMapper : BaseMapper<Student> {

}