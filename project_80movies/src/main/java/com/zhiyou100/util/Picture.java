package com.zhiyou100.util;

import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;

/**
 * @Author:li
 * @Date:2019/10/10 16:40
 */
public class Picture {
    public static String picture(MultipartFile file, HttpServletRequest request,String address ) {
        if (!file.isEmpty()){
            HttpSession session = request.getSession();
            String path = request.getSession().getServletContext().getRealPath(address);
            String fileName = "";
            fileName+=System.currentTimeMillis();
            fileName+=session.getId();
            fileName+=file.getOriginalFilename();
            try {
                file.transferTo(new File(path+fileName));
                System.out.println(path);
                System.out.println(fileName);
                return fileName;
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}
