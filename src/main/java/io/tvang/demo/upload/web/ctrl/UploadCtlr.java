package io.tvang.demo.upload.web.ctrl;

import org.apache.commons.io.IOUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

@RestController
public class UploadCtlr extends AbstractCtrl {
  @RequestMapping(path="/api/upload", method = RequestMethod.POST)
  public String handleFileUpload(@RequestParam("file") MultipartFile file) {
    File output = new File("C:/tmp/" + file.getOriginalFilename());
    try (FileOutputStream os = new FileOutputStream(output)) {
      IOUtils.copy(file.getInputStream(), os);
    } catch (IOException e) {
      e.printStackTrace();
    }

    return "good";
  }
}
