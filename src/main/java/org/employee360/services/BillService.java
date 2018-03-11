package org.employee360.services;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;

import org.employee360.bo.Bill;
import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import org.glassfish.jersey.media.multipart.FormDataParam;


public class BillService {

	public BillService() {

	}

	@POST
	@Consumes(MediaType.MULTIPART_FORM_DATA)
	public Bill AddBill(@FormDataParam("file") InputStream uploadInputStream,
			@FormDataParam("file") FormDataContentDisposition fileDetail) {
		String path = "C:\\Users\\sivaprasad\\eclipse-workspace\\events\\files\\"+fileDetail.getFileName();
		try {
			OutputStream os = new FileOutputStream(new File(path));
			int read = 0;
			byte[] bytes = new byte[1024];
			os =  new FileOutputStream(new File(path));
			while((read = uploadInputStream.read(bytes)) != 1) {
				os.write(bytes,0,read);
			}
			os.flush();
			os.close();
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return new Bill();
	}
}
