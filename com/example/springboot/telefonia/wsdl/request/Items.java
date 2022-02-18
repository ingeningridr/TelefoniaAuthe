package com.example.springboot.telefonia.wsdl.request;
import com.example.springboot.telefonia.wsdl.request.Item;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.List;


@JacksonXmlRootElement(localName = "items")
public class Items {

@JacksonXmlProperty(localName = "item")
private List<Item> items;

    public List<Item> getItems() {

        return items;
    }

    public void setItems(List<Item> items) {

        this.items = items;
    }
}