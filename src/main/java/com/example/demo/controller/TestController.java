package com.example.demo.controller;

import com.example.demo.models.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    Integer numeroVociNavbar = 1;
    Integer numeroRigheTabella = 2;
    Integer numeroImmagini = 2;

    @GetMapping(value="/prova")
    public String prova(){
        //Pagina html da popolare con replace()
        String paginaHTML = "";

        HtmlPage pagina = new HtmlPage();
        paginaHTML += pagina.getBASE();

        String imports = pagina.getHEAD_IMPORTS();
        String bodyTop = creaBodyTop(numeroVociNavbar);
        String bodyMid =  creaBodyMid(numeroRigheTabella, numeroImmagini);

        paginaHTML = paginaHTML.replace("$HEADIMPORTS$", imports);
        paginaHTML = paginaHTML.replace("$BODY_TOP$", bodyTop);
        paginaHTML = paginaHTML.replace("$BODY_MID$", bodyMid);

        return paginaHTML;
    }

    private String creaBodyTop(Integer numeroVociNavbar){
        return NavbarGenerator.generaNavbar(numeroVociNavbar);
    }

    private String creaBodyMid(Integer numeroRigheTabella, Integer numeroImmagini){
        String bodyMid = "";

        bodyMid += TableGenerator.generaTabella(numeroRigheTabella);

        Image img = new Image();
        for(int i=0; i<numeroImmagini; i++)
            bodyMid += img.getBASE();

        return bodyMid;
    }

}
