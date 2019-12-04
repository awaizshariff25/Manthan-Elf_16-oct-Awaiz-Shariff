package com.manthan.resumereader.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.encryption.InvalidPasswordException;
import org.apache.pdfbox.text.PDFTextStripper;
import org.apache.pdfbox.text.PDFTextStripperByArea;
import org.apache.poi.openxml4j.opc.OPCPackage;
import org.apache.poi.xwpf.extractor.XWPFWordExtractor;
import org.apache.poi.xwpf.usermodel.XWPFDocument;

import com.manthan.resumebean.test.ResumeBean;

public class PdfDocRead {

	public ResumeBean find(File f, String text) throws InvalidPasswordException, IOException {

		ResumeBean bean=new ResumeBean();
		if(f.getName().endsWith(".pdf")) {
			
		try (PDDocument pdfDocument = PDDocument.load(f)) {

			pdfDocument.getClass();

			PDFTextStripper pdfTextStripper = new PDFTextStripper();

			String pdfFileInText = pdfTextStripper.getText(pdfDocument).replaceAll("\n", " ").replaceAll("\r", " ").toLowerCase();


			if(pdfFileInText.contains(text)) {
				bean.setFilename(f.getName());
				bean.setName(f.getName());
				Pattern pattern=Pattern.compile("([a-zA-Z0-9_.,!$-]+)@([a-z.]+[a-z])");
				Matcher match = pattern.matcher(pdfFileInText);
				if(match.find()) {
					bean.setEmail(match.group());
				}
			}					
		}
		catch(Exception e) {
			System.out.println(e);
		}


		}
		else if(f.getName().endsWith(".doc")||f.getName().endsWith(".docx")) {
			
		
			try {
				FileInputStream fis = new FileInputStream("C:\\Users\\CBT\\Desktop\\resumetest\\"+f.getName());
				XWPFDocument xdoc = new XWPFDocument((OPCPackage.open(fis)));
				XWPFWordExtractor extractor = new XWPFWordExtractor(xdoc);

				String fileiInText = extractor.getText();
				String wordFileInText=fileiInText.replaceAll("\n", " ").replaceAll("\r", " ").toLowerCase();

				

				if(wordFileInText.contains(text)) {
					
					bean.setFilename(f.getName());
					bean.setName(f.getName());
					Pattern pattern=Pattern.compile("([a-zA-Z0-9_.,!$-]+)@([a-z.]+[a-z])");
					Matcher match = pattern.matcher(wordFileInText);
					if(match.find()) {
						bean.setEmail(match.group());
					}
				}					
			} catch(Exception ex) {
				ex.printStackTrace();
			}
			

		}
		return bean;
	}
}

