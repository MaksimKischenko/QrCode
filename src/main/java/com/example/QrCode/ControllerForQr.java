package com.example.QrCode;

import com.example.QrCode.model.QrConverter;
import com.example.QrCode.model.QrEntity;

import com.example.QrCode.repos.XMLRepositiry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RestController
public class ControllerForQr {

    @Autowired
    private XMLRepositiry xmlRepositiry;

    @GetMapping(value = "/", produces = MediaType.APPLICATION_XML_VALUE)
    public Iterable generateXML(Model model) {
        Iterable<QrEntity> entities = xmlRepositiry.findAll();
        model.addAttribute("posts", entities);
        entities.forEach(x->QrConverter.ConvertToQR(x.getText()));
        xmlRepositiry.deleteAll();
        return  entities;
    }

}
