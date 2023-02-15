package com.example.demo.models;

import lombok.Data;

@Data
public class HtmlPage {

    private String BASE = "<!DOCTYPE html>" +
            "<html lang=\"en\">" +
            "<head> " +
            "    <meta charset=\"UTF-8\"> " +
            "    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\"> " +
            "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\"> " +
            "    <title>Document</title> " +
            "    $HEADIMPORTS$ " +
            "</head> " +
            "<body> " +
            "    $BODY_TOP$ " +
            "    <div class=\"container\"> " +
            "        $BODY_MID$ " +
            "    </div> " +
            "</body> " +
            "</html>";

    private String HEAD_IMPORTS  = "<link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css\" integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">";

}
