import net.glxn.qrgen.QRCode;
import net.glxn.qrgen.image.ImageType;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;

public class QRCodeGeneratorExample {

    public static void main(String[] args) throws Exception {
        String details = "https://github.com/saurabharch";
        ByteArrayOutputStream out = QRCode.from(details).to(ImageType.PNG).withSize(460,460).stream(); // ByteArrayOutputStream only takes stream
        File f = new  File("D:\\SpringTest_Source\\JavaPrep\\lib\\MyQRCode.png");
        FileOutputStream fos = new FileOutputStream(f);
        fos.write(out.toByteArray());
        fos.flush();

    }
}
