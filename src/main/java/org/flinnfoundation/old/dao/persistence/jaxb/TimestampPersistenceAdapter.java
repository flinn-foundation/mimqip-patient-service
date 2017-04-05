package org.flinnfoundation.old.dao.persistence.jaxb;

import javax.xml.bind.annotation.adapters.XmlAdapter;
import java.sql.Timestamp;

public class TimestampPersistenceAdapter extends XmlAdapter<String, Timestamp>
{
	public Timestamp unmarshal(final String val) throws NumberFormatException
	{
		final long time = Long.parseLong(val);

		return new Timestamp(time);
	}

	public String marshal(final Timestamp timestamp)
	{
		if (timestamp != null)
		{
			final long time = timestamp.getTime();

			return Long.toString(time);
		}
		return "0";
	}
}
