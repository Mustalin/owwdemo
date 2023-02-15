package com.example.demo.models;

import lombok.Data;

@Data
public class Table {

    private String BASE = "<table class=\"table\">" +
            "            <thead>" +
            "                $ROW_HEAD$" +
            "            </thead>" +
            "            <tbody>" +
            "              $ROWS$" +
            "            </tbody>" +
            "          </table>";

    private String ROW_HEAD = "<tr>" +
            "                <th scope=\"col\">$NRROW$</th>" +
            "                <th scope=\"col\">$ROW_FIELD1$</th>" +
            "                <th scope=\"col\">$ROW_FIELD1$</th>" +
            "                <th scope=\"col\">$ROW_FIELD1$</th>" +
            "              </tr>";

    private String ROW = "<tr>" +
            "                <th scope=\"row\">$NRROW$</th>" +
            "                <td>$ROW_FIELD1$</td>" +
            "                <td>$ROW_FIELD2$</td>" +
            "                <td>$ROW_FIELD3$</td>" +
            "              </tr>";
}
