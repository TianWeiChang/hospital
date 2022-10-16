package com.tian.controller;

import com.tian.entity.*;
import com.tian.service.DepartmentService;
import com.tian.service.PrjectTypeService;
import com.tian.service.UnitService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("prjectType")
public class PrjectTypeController {
    @Autowired
    private PrjectTypeService prjectTypeService;
    /*
     * 查询生产项目大类
     * */
    @RequestMapping("findAllProjecttype")
    @ResponseBody
    public Object ProjecttypeList(Projecttype projecttype, Integer page, Integer limit){

        PageHelper.startPage(page, limit);
        List<Projecttype> listAll = prjectTypeService.findAllProjecttype(projecttype);
        PageInfo pageInfo = new PageInfo(listAll);
        Map<String, Object> tableData = new HashMap<String, Object>();
        //这是layui要求返回的json数据格式
        tableData.put("code", 0);
        tableData.put("msg", "");
        //将全部数据的条数作为count传给前台（一共多少条）
        tableData.put("count", pageInfo.getTotal());
        //将分页后的数据返回（每页要显示的数据）
        tableData.put("data", pageInfo.getList());

        return tableData;
    }
    /*
     * 添加生产项目大类
     * */
    @RequestMapping("addProjecttype")
    @ResponseBody
    public Object addProjecttype(Projecttype projecttype){
        int i1 = prjectTypeService.count1(projecttype);
        if(i1==0){
            int i = prjectTypeService.addProjecttype(projecttype);
            if(i==1){
                return "添加成功";
            }else{
                return "添加失败";
            }
        }else{
            return projecttype.getProjectName()+"已存在";
        }

    }
    /*
     * 删除生产项目大类
     * */
    @RequestMapping("deleteProjecttype")
    @ResponseBody
    public Object deleteProjecttype(Integer projectId){
        int i = prjectTypeService.deleteProjecttype(projectId);
        if(i==1){
            return "删除成功";
        }else{
            return "删除失败";
        }
    }
    /*------------------------------------------------------------*/
    /*
     * 查询收费类型
     * */
    @RequestMapping("findAllMoneytype")
    @ResponseBody
    public Object MoneytypeList(Moneytype moneytype, Integer page, Integer limit){
        PageHelper.startPage(page, limit);
        List<Moneytype> listAll = prjectTypeService.findAllMoneytype(moneytype);
        PageInfo pageInfo = new PageInfo(listAll);
        Map<String, Object> tableData = new HashMap<String, Object>();
        //这是layui要求返回的json数据格式
        tableData.put("code", 0);
        tableData.put("msg", "");
        //将全部数据的条数作为count传给前台（一共多少条）
        tableData.put("count", pageInfo.getTotal());
        //将分页后的数据返回（每页要显示的数据）
        tableData.put("data", pageInfo.getList());

        return tableData;
    }
    /*
     * 添加收费类型
     * */
    @RequestMapping("addMoneytype")
    @ResponseBody
    public Object addMoneytype(Moneytype moneytype){
        int i1 = prjectTypeService.count4(moneytype);
        if(i1==0){
            int i = prjectTypeService.addMoneytype(moneytype);
            if(i==1){
                return "添加成功";
            }else{
                return "添加失败";
            }
        }else{
            return moneytype.getMoneytype()+"已存在";
        }

    }
    /*
     * 修改收费类型
     * */
    @RequestMapping("editMoneytype")
    @ResponseBody
    public Object editMoneytype(Moneytype moneytype){
        int i = prjectTypeService.editMoneytype(moneytype);
        if(i==1){
            return "修改成功";
        }else{
            return "修改失败";
        }

    }
    /*
     * 删除收费类型
     * */
    @RequestMapping("deleteMoneytype")
    @ResponseBody
    public Object deleteMoneytype(Integer moneyId){
        int i = prjectTypeService.deleteMoneytype(moneyId);
        if(i==1){
            return "删除成功";
        }else{
            return "删除失败";
        }
    }
    /*--------------------------------------------------------------*/
    /*
     * 查询门诊收费项
     * */
    @RequestMapping("findAllOutpatienttype")
    @ResponseBody
    public Object OutpatienttypeList(Outpatienttype outpatienttype, Integer page, Integer limit){

        PageHelper.startPage(page, limit);
        List<Outpatienttype> listAll = prjectTypeService.findAllOutpatienttype(outpatienttype);
        PageInfo pageInfo = new PageInfo(listAll);
        Map<String, Object> tableData = new HashMap<String, Object>();
        //这是layui要求返回的json数据格式
        tableData.put("code", 0);
        tableData.put("msg", "");
        //将全部数据的条数作为count传给前台（一共多少条）
        tableData.put("count", pageInfo.getTotal());
        //将分页后的数据返回（每页要显示的数据）
        tableData.put("data", pageInfo.getList());

        return tableData;
    }
    @Autowired
    private UnitService unitService;
    /*
     * 查询计量单位
     * */
    @RequestMapping("findAllUnit")
    @ResponseBody
    public Object UnitList(){
        List<Unit> listAll = unitService.findAllUnit(null);
        return listAll;
    }
    @RequestMapping("findAllProjecttype1")
    @ResponseBody
    public Object ProjecttypeList(){

        List<Projecttype> listAll = prjectTypeService.findAllProjecttype(null);

        return listAll;
    }
    /*

     * 添加门诊收费项
     * */
    @RequestMapping("addOutpatienttype")
    @ResponseBody
    public Object addOutpatienttype(Outpatienttype outpatienttype,Integer projectId,Integer unitId){
        outpatienttype.setBigprojectId(projectId);
        outpatienttype.setUnit(unitId);
        int i1 = prjectTypeService.count2(outpatienttype);
        if(i1==0){
            int i = prjectTypeService.addOutpatienttype(outpatienttype);
            if(i==1){
                return "添加成功";
            }else{
                return "添加失败";
            }
        }else {
            return outpatienttype.getProjectName()+"已存在";
        }

    }
    /*
     * 修改门诊收费项
     * */
    @RequestMapping("editOutpatienttype")
    @ResponseBody
    public Object editOutpatienttype(Outpatienttype outpatienttype,Integer projectId,Integer unitId){
        outpatienttype.setBigprojectId(projectId);
        outpatienttype.setUnit(unitId);
            int i = prjectTypeService.editOutpatienttype(outpatienttype);
            if(i==1){
                return "修改成功";
            }else{
                return "修改失败";
            }


    }
    /*
     * 删除门诊收费项
     * */
    @RequestMapping("deleteOutpatienttype")
    @ResponseBody
    public Object deleteOutpatienttype(Integer outpatientId){
        int i = prjectTypeService.deleteOutpatienttype(outpatientId);
        if(i==1){
            return "删除成功";
        }else{
            return "删除失败";
        }
    }
    /*------------------------------------------------------------------------*/
    /*
     * 查询住院收费项
     * */
    @RequestMapping("findAllInoutpatienttype")
    @ResponseBody
    public Object InoutpatienttypeList(Inoutpatienttype inoutpatienttype, Integer page, Integer limit){

        PageHelper.startPage(page, limit);
        List<Inoutpatienttype> listAll = prjectTypeService.findAllInoutpatienttype(inoutpatienttype);
        PageInfo pageInfo = new PageInfo(listAll);
        Map<String, Object> tableData = new HashMap<String, Object>();
        //这是layui要求返回的json数据格式
        tableData.put("code", 0);
        tableData.put("msg", "");
        //将全部数据的条数作为count传给前台（一共多少条）
        tableData.put("count", pageInfo.getTotal());
        //将分页后的数据返回（每页要显示的数据）
        tableData.put("data", pageInfo.getList());

        return tableData;
    }
    /*
     * 查询计量单位
     * */
    @RequestMapping("findAllUnit1")
    @ResponseBody
    public Object findAllUnit1(){
        List<Unit> listAll = unitService.findAllUnit(null);
        return listAll;
    }
    @RequestMapping("findAllProjecttype2")
    @ResponseBody
    public Object findAllProjecttype2(){

        List<Projecttype> listAll = prjectTypeService.findAllProjecttype(null);

        return listAll;
    }
    /*
     * 添加住院收费项
     * */
    @RequestMapping("addInoutpatienttype")
    @ResponseBody
    public Object addInoutpatienttype(Inoutpatienttype inoutpatienttype,Integer projectId,Integer unitId){

        inoutpatienttype.setBigprojectId(projectId);
        inoutpatienttype.setUnit(unitId);
        int i1 = prjectTypeService.count3(inoutpatienttype);
        if(i1==0){
            int i = prjectTypeService.addInoutpatienttype(inoutpatienttype);
            if(i==1){
                return "添加成功";
            }else{
                return "添加失败";
            }
        }else {
            return inoutpatienttype.getProjectName()+"已存在";
        }

    }
    /*
     * 修改住院收费项
     * */
    @RequestMapping("editInoutpatienttype")
    @ResponseBody
    public Object editInoutpatienttype(Inoutpatienttype inoutpatienttype,Integer projectId,Integer unitId){
        inoutpatienttype.setBigprojectId(projectId);
        inoutpatienttype.setUnit(unitId);

            int i = prjectTypeService.editInoutpatienttype(inoutpatienttype);
            if(i==1){
                return "修改成功";
            }else{
                return "修改失败";
            }

    }
    /*
     * 删除住院收费项
     * */
    @RequestMapping("deleteInoutpatienttype")
    @ResponseBody
    public Object deleteInoutpatienttype(Integer inoutpatientId){
        int i = prjectTypeService.deleteInoutpatienttype(inoutpatientId);
        if(i==1){
            return "删除成功";
        }else{
            return "删除失败";
        }
    }
    /*------------------------------------------------------------*/
    /*
     * 查询床位
     * */
    @RequestMapping("findAllBed")
    @ResponseBody
    public Object BedList(Bed bed, Integer page, Integer limit){
        System.out.println(bed.getBedname());
        PageHelper.startPage(page, limit);
        List<Bed> listAll = prjectTypeService.findAllBed(bed);
        PageInfo pageInfo = new PageInfo(listAll);
        Map<String, Object> tableData = new HashMap<String, Object>();
        //这是layui要求返回的json数据格式
        tableData.put("code", 0);
        tableData.put("msg", "");
        //将全部数据的条数作为count传给前台（一共多少条）
        tableData.put("count", pageInfo.getTotal());
        //将分页后的数据返回（每页要显示的数据）
        tableData.put("data", pageInfo.getList());

        return tableData;
    }
    /*
     * 添加床位
     * */
    @RequestMapping("addBed")
    @ResponseBody
    public Object addBed(Bed bed){

        int i1 = prjectTypeService.count5(bed);
        if(i1==0){
            int i = prjectTypeService.addBed(bed);
            if(i==1){
                return "添加成功";
            }else{
                return "添加失败";
            }
        }else {
            return bed.getBedname()+"已存在";
        }

    }
    /*
     * 修改床位
     * */
    @RequestMapping("editBed")
    @ResponseBody
    public Object editBed(Bed bed){

            int i = prjectTypeService.editBed(bed);
            if(i==1){
                return "修改成功";
            }else{
                return "修改失败";
            }
        }


    /*
     * 删除床位
     * */
    @RequestMapping("deleteBed")
    @ResponseBody
    public Object deleteBed(Integer bedId){
        int i1 = prjectTypeService.checkCount(bedId);
        if(i1==1){
           return "该床位还有病人" ;
        }else {
            int i = prjectTypeService.deleteBed(bedId);
            if(i==1){
                return "删除成功";
            }else{
                return "删除失败";
            }
        }

    }
    @Autowired
    private DepartmentService departmentService;
    /*
     * 查询科室
     * */
    @RequestMapping("departmentList")
    @ResponseBody
    public Object DepartmentList(){
        List<Departments> listAll = departmentService.departmentList(null);
        return listAll;
    }
}
