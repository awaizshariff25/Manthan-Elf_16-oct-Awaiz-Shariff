package com.manthan.resumesearch.test;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.manthan.resumebean.test.ResumeBean;
import com.manthan.resumereader.test.PdfDocRead;

@WebServlet("/searchServlet")
public class SearchResult extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		ResumeBean bean = null;
		PdfDocRead pdf=new PdfDocRead();

		ArrayList<ResumeBean> ls=new ArrayList<ResumeBean>();
		FileFilter logFilefilter = new FileFilter() {
			//Override accept method
			public boolean accept(File file) {
				//if the file extension is .pdf return true, else false
				if (file.getName().endsWith(".pdf")) {
					return true;
				}
				return false;
			}
		};
		String searchText = req.getParameter("searchText");
		String text=searchText.toLowerCase();
		String arr[] = null;
		if(searchText.contains(","))
		{
			arr = searchText.split(",");
		}

		String folder = "C:\\Users\\CBT\\Desktop\\resumetest";
		File filelist = new File(folder);

		if(filelist.isDirectory()) {
			File filearr[]= filelist.listFiles();  //logFilefilter

			for(File f: filearr) {
				
				bean=pdf.find(f,text);
				
				if(bean!=null) {
				
					if (bean.getFilename() != null && bean.getName() != null /* && bean.getEmail()!=null */) {
						ls.add(bean);
					}
				}
			}
			
			if(ls.isEmpty()) {
				req.setAttribute("msg", "no record found");
			}else {
				req.setAttribute("ls", ls);
			}
		}
		req.getRequestDispatcher("./SearchResult.jsp").forward(req, resp);
	}

}
