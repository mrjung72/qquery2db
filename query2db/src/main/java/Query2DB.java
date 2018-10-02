import java.io.File;
import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;
import java.util.List;

import javax.xml.bind.JAXBException;

import com.query2db.jaxb.DataTransportType;
import com.query2db.jaxb.db.DBConnectInfo;
import com.query2db.jaxb.db.DatabaseDefine;
import com.query2db.utils.LoggingObjectValue;
import com.query2db.utils.XmlBinder;

public class Query2DB {
	
	private List<DBConnectInfo> DB_CONN_INFO;
	private DataTransportType DATA_TRAN_INFO;
	
	public Query2DB(List<DBConnectInfo> dbConList, DataTransportType dataTran) {
		this.DB_CONN_INFO = dbConList;
		this.DATA_TRAN_INFO = dataTran;
	}
	

	public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, JAXBException, ClassNotFoundException {
		// TODO Auto-generated method stub
		
		if(args.length == 0) {
			
			printHelpMessage();
			return;
		}
		
		String dirPath = args[0];
		
		// Database서버정보를 읽어온다.
		XmlBinder dbXmlBinder = new XmlBinder(
				new File("conf/database.xsd"), new File("conf/database.xml"));
		DatabaseDefine dbDefine = (DatabaseDefine) dbXmlBinder.bindingXmltoObject();
		
		
		// 데이터베이스 서버정보를 로깅한다.
		LoggingObjectValue logValue = new LoggingObjectValue("com.query2db.jaxb.db");
		logValue.loggingByCategory(dbDefine.getDatabase(), 0, "");
		
		
		
		
		

	}


	public static void printHelpMessage() {
		// TODO Auto-generated method stub
		
		System.out.println("===================================================================");
		System.out.println("Input target directory path and xml filename in query/ directory!");
		System.out.println("Query2DB {target directory} [xml filename]");
		System.out.println("===================================================================");
		System.out.println("usage");
		System.out.println("Query2DB sample");
		System.out.println("or");
		System.out.println("Query2DB sample sample.xml");
		
		
	}

}
