package com.atguigu.test1;

public class Master {
    public void command(Teacher teacher){

        if(teacher instanceof EnglishTeacher){
            EnglishTeacher et = (EnglishTeacher)teacher;
            et.teach();
            et.listen();
        }else{
            teacher.teach();
        }
    }
}
