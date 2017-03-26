package flinn.old.dao.beans;

import javax.xml.bind.JAXBException;
import java.io.IOException;

public interface BeanInterface
{
	String toJsonString(float version);

	String toJavaXmlString(float verion);

	String toStandardXmlString(float version) throws JAXBException, IOException;
}
