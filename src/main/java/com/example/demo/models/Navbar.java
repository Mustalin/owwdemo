package com.example.demo.models;

import lombok.Data;

@Data
public class Navbar {

    private String BASE = "<nav class=\"navbar navbar-expand-lg navbar-light bg-light\">" +
            "        <a class=\"navbar-brand\" href=\"#\">Navbar</a>" +
            "        <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">" +
            "          <span class=\"navbar-toggler-icon\"></span>" +
            "        </button>" +
            "        $LINKLIST$" +
            "      </nav>";

    private String LINK_LIST = "<div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">" +
            "          <ul class=\"navbar-nav mr-auto\">" +
            "            $LI$           " +
            "          </ul>" +
            "          <form class=\"form-inline my-2 my-lg-0\">" +
            "            <input class=\"form-control mr-sm-2\" type=\"search\" placeholder=\"Search\" aria-label=\"Search\">" +
            "            <button class=\"btn btn-outline-success my-2 my-sm-0\" type=\"submit\">Search</button>\n" +
            "          </form>" +
            "        </div>";

    private String LI = "<li class=\"nav-item active\">" +
            "              <a class=\"nav-link\" href=\"#\"> $TITOLO$ <span class=\"sr-only\">(current)</span></a>" +
            "            </li>";

}
