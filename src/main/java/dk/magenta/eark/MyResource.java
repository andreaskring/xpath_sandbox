package dk.magenta.eark;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

import javax.xml.XMLConstants;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.SchemaFactory;

import org.xml.sax.SAXException;

public class MyResource {

	public void method() {
		
		System.out.println("Inside method...");
		URL res = this.getClass().getResource("/tableIndex.xsd");
		InputStream in = this.getClass().getResourceAsStream("/tableIndex.xsd");
		
//		try {
//			System.out.println(res.getContent());
//		} catch (IOException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}

		File file = new File(res.getFile());
		
		
		// System.out.println(file.getPath());
		
		SchemaFactory factory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
		try {
			// InputStream in = (InputStream) res.getContent();
			factory.newSchema(new StreamSource(in));
			System.out.println("SUCCESS");
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
