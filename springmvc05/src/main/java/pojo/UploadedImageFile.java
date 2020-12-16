package pojo;

import org.springframework.web.multipart.MultipartFile;
import lombok.Data;

@Data
public class UploadedImageFile {

    MultipartFile image;
}
