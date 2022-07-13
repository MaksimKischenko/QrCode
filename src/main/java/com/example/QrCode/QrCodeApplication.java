package com.example.QrCode;

import com.example.QrCode.model.QrConverter;
import com.example.QrCode.model.QrEntity;
import net.glxn.qrgen.android.QRCode;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

@SpringBootApplication

public class QrCodeApplication {

	public static void main(String[] args) {

		SpringApplication.run(QrCodeApplication.class, args);


	}




}
