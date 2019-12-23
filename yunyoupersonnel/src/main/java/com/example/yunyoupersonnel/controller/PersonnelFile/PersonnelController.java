package com.example.yunyoupersonnel.controller.PersonnelFile;
import com.example.yunyoupersonnel.MyException.DataException;
import com.example.yunyoupersonnel.common.PageResult;
import com.example.yunyoupersonnel.common.Result;
import com.example.yunyoupersonnel.entity.User;
import com.example.yunyoupersonnel.service.PersonnelFile.PersonnelService;
import com.github.pagehelper.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping( "/personnel" )
public class PersonnelController {

    @Autowired
    private PersonnelService addPersonnelService ;

    @RequestMapping( "/add" )
    public Result addPersonnel (@RequestBody Map<String,Object> haMap ) {
        try {
            //  增加员工
            addPersonnelService.addPersonnel(haMap);
            return new Result("添加成功", true);
        } catch ( DataException e) {
            return new Result( "每输入毕业时间或员工id输入错误" , false ) ;
        }catch ( Exception e ) {
            e.printStackTrace();
            return new Result( "添加失败" , false ) ;
        }
    }

    //    查询所有的员工（分页）
    @PostMapping( "/searchAllPeople" )
    public PageResult searchAllPeople ( String nowPage , String pageSize , @RequestBody Map<String,Object> condition ) {
        try {
            Page<User> searchPeopleList = addPersonnelService.searchAllPeople(pageSize, nowPage, condition);
            return new PageResult( nowPage , searchPeopleList.getTotal() , searchPeopleList , true ) ;
        } catch ( Exception e ) {
            e.printStackTrace();
            return new PageResult( false ) ;
        }
    }

    //    查询所有的员工（不分页）
    @GetMapping( "/searchAllPeopleId" )
    public Result searchAllPersonnel() {
        try {
            List<User> searchPeopleList = addPersonnelService.searchAllPeopleList() ;
            return new Result( searchPeopleList , "搜索成功"  , true ) ;
        } catch ( Exception e ) {
            e.printStackTrace();
            return new Result( "搜索失败"  , true ) ;
        }
    }


    @PostMapping( "/updateIdPeople" )
    public Result updateIdPeople ( @RequestBody Map<String,Object> user ) {
        try {
            addPersonnelService.update( user ) ;
            return new Result(  "修改成功" , true ) ;
        } catch ( Exception e ) {
            e.printStackTrace();
            return new Result( "修改失败" , true ) ;
        }
    }



    @GetMapping( "/deleteIdPeople" )
    public Result deleteIdPeople ( String id) {
        try {
            addPersonnelService.delete( id ) ;
            return new Result( "删除成功" , true ) ;
        } catch ( Exception e ) {
            e.printStackTrace();
            return new Result( "删除失败" , true ) ;
        }
    }


}
