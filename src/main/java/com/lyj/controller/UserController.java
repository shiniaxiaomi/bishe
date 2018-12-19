package com.lyj.controller;

import com.lyj.model.Result;
import com.lyj.model.User;
import com.lyj.service.UserService;
import com.lyj.util.ResultUtil;
import com.lyj.util.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

/**
 * Created by 陆英杰
 * 2018/9/17 0:41
 */

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;



    /**
     * 注册用户
     * @return 返回一个json对象
     */
    @ResponseBody
    @RequestMapping("/add")
    public Result add(User user){
        if(!StringUtil.isEmpty(user.getUserName()) && !StringUtil.isEmpty(user.getPassword())){
            if(!userService.isExists(user)){//判断是否已经存在该用户名
                if(userService.addUser(user)) {//保存成功

                    return ResultUtil.success("注册成功");
                }
            }else{
                return ResultUtil.error("该用户名已存在");
            }
        }

        return ResultUtil.error("注册失败");
    }


//    @ResponseBody
//    @RequestMapping("/updateCustomFolder")
//    public Result updateCustomFolder(int customFolderId,String customFolderName,HttpSession session){
//
//        User user = (User) session.getAttribute("user");
//
//        if(userService.updateCustomFolder(customFolderId,customFolderName,user.getId())){
//            return ResultUtil.success("自定义文件夹成功");
//        }else{
//            return ResultUtil.error("自定义文件夹失败");
//        }
//    }

//    @ResponseBody
//    @RequestMapping("/getCustomFolder")
//    public Result getCustomFolder(HttpSession session){
//
//        User user = (User) session.getAttribute("user");
//
//        User user1=userService.getCustomFolder(user.getId());
//
//        if(user1.getCustomFolderName()!=null){
//            return ResultUtil.success(user1);
//        }else{
//            return ResultUtil.error("你还没有自定文件夹",user1);
//        }
//    }















}
