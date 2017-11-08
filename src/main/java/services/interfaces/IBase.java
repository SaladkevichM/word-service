package services.interfaces;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.POIXMLProperties;
import org.apache.poi.POIXMLProperties.CustomProperties;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.openxml4j.opc.OPCPackage;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.openxmlformats.schemas.officeDocument.x2006.customProperties.CTProperty;

/**
 * Hello world!
 *
 */
public interface IBase {
    
    /*
    public static void main(String[] args) throws InvalidFormatException, IOException {

        System.out.println("Working Directory = " + System.getProperty("user.dir"));

        String docIn = System.getProperty("user.dir").concat("\\").concat("RKK.docx");
        String docOut = System.getProperty("user.dir").concat("\\").concat("RKK_out.docx");

        XWPFDocument doc = new XWPFDocument(OPCPackage.open(docIn));
        POIXMLProperties props = doc.getProperties();
        CustomProperties cp = props.getCustomProperties();

        if (cp != null) {

            List<CTProperty> ctProperties = cp.getUnderlyingProperties().getPropertyList();
            for (CTProperty ctp : ctProperties) {

                System.out.println(ctp.getName());

                if (ctp.getName().equals("regnum")) {
                    ctp.setLpwstr("Test123321qweqwezzzzz");
                }


            }
        }

        doc.enforceUpdateFields();

        doc.write(new FileOutputStream(docOut));
        doc.close();
        
    
    }
     */
}
