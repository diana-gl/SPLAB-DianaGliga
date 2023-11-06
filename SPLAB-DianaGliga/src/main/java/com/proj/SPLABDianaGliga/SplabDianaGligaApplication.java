package com.proj.SPLABDianaGliga;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SplabDianaGligaApplication {

	public static void main(String[] args) {
		//SpringApplication.run(SplabDianaGligaApplication.class, args);

		Book discoTitanic = new Book("Disco Titanic");
		Author author = new Author("Radu Pavel Gheo");
		discoTitanic.addAuthor(author);

		int indexChapterOne = discoTitanic.createChapter("Capitolul 1");
		Chapter chp1 = discoTitanic.getChapter(indexChapterOne);
		int indexSubChapterOneOne = chp1.createSubChapter("Subcapitolul 1.1");
		SubChapter scOneOne = chp1.getSubChapter(indexSubChapterOneOne);

		scOneOne.createNewElement(new Paragraph("Paragraph 1"));
		scOneOne.createNewElement(new Paragraph("Paragraph 2"));
		scOneOne.createNewElement(new Paragraph("Paragraph 3"));
		scOneOne.createNewElement(new Image("Image 1"));
		scOneOne.createNewElement(new Paragraph("Paragraph 4"));
		scOneOne.createNewElement(new Table("Table 1"));
		scOneOne.createNewElement(new Paragraph("Paragraph 5"));
		
		scOneOne.print();
	}

}
