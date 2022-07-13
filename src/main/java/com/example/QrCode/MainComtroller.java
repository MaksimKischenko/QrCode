package com.example.QrCode;


import com.example.QrCode.model.QrConverter;
import com.example.QrCode.model.QrEntity;
import com.example.QrCode.repos.XMLRepositiry;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.File;
import java.util.HashMap;
import java.util.Map;


@Controller
public class MainComtroller {

    @Autowired
    private XMLRepositiry xmlRepositiry;

    @GetMapping("/add")
    public String blogAdd(Model model){
        return "xml";
    }

    @PostMapping("/add")
    public String blogPostAdd(@RequestParam String text) {
        QrEntity entity = new QrEntity(text);
        xmlRepositiry.save(entity);
        return "redirect:/";
    }


}
