/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mum.cs472;

import java.io.IOException;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

/**
 *
 * @author yafen
 */
public class ColorWord extends SimpleTagSupport{
String thecolor;
String words;

    public String getThecolor() {
        return thecolor;
    }

    public void setThecolor(String thecolor) {
        this.thecolor = thecolor;
    }

    public String getWords() {
        return words;
    }

    public void setWords(String words) {
        this.words = words;
    }
    @Override
    public void doTag() throws JspException, IOException {
        JspWriter out=getJspContext().getOut();
      
          getJspBody().invoke(out);
        if(thecolor!=null){
        out.write(String.format("<h1 style='color:%s'>%s</h1>", this.thecolor,this.words));
        }else{
         out.write(String.format("<h1>%s</h1>",this.words));
        }
        out.print("<span>shit</span>");
     
        out.print("<span>shit2</span>");
    }
    
}
