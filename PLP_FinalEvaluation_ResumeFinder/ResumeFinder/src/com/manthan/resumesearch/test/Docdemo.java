package com.manthan.resumesearch.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.pdfbox.pdmodel.encryption.InvalidPasswordException;
import org.apache.poi.openxml4j.opc.OPCPackage;
import org.apache.poi.xwpf.extractor.XWPFWordExtractor;
import org.apache.poi.xwpf.usermodel.XWPFDocument;

import com.manthan.resumebean.test.ResumeBean;

public class Docdemo {
	public ResumeBean find1(File f, String text) throws InvalidPasswordException, IOException {

		ResumeBean bean=null;
		try {
			FileInputStream fis = new FileInputStream("C:\\Users\\CBT\\Desktop\\resumetest\\College_Possible_Resume_Template.docx");
			XWPFDocument xdoc = new XWPFDocument((OPCPackage.open(fis)));
			XWPFWordExtractor extractor = new XWPFWordExtractor(xdoc);

			String wordFileInText = extractor.getText().replaceAll("\n", " ").replaceAll("\r", " ").toLowerCase();

			System.out.println( wordFileInText);

			if(wordFileInText.contains(text)) {
				bean=new ResumeBean();
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
		return bean;
	}
}
