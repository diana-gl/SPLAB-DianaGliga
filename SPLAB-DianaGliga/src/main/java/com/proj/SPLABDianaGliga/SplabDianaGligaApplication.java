package com.proj.SPLABDianaGliga;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SplabDianaGligaApplication {

	public static void main(String[] args) {
		//SpringApplication.run(SplabDianaGligaApplication.class, args);

		/*Book noapteBuna = new Book("Noapte buna, copii!");
		Author rpGheo = new Author("Radu Pavel Gheo");
		noapteBuna.addAuthor(rpGheo);
		Section cap1 = new Section("Capitolul 1");
		Section cap11 = new Section("Capitolul 1.1");
		Section cap111 = new Section("Capitolul 1.1.1");
		Section cap1111 = new Section("Subchapter 1.1.1.1");
		noapteBuna.addContent(new Paragraph("Multumesc celor care ..."));
		noapteBuna.addContent(cap1);
		cap1.add(new Paragraph("Moto capitol"));
		cap1.add(cap11);
		cap11.add(new Paragraph("Text from subchapter 1.1"));

		cap11.add(cap111);
		cap111.add(new Paragraph("Text from subchapter 1.1.1"));
		cap111.add(cap1111);
		cap1111.add(new Image("Image subchapter 1.1.1.1"));
		noapteBuna.print();*/

		//new RenderContentVisitor().visitBook(noapteBuna);
		//SAU
		//noapteBuna.accept(new RenderContentVisitor());

		//Section cap1 = new Section("Capitolul 1");
		/*Paragraph p1 = new Paragraph("Paragraph 1");
		cap1.add(p1);
		Paragraph p2 = new Paragraph("Paragraph 2");
		cap1.add(p2);
		Paragraph p3 = new Paragraph("Paragraph 3");
		cap1.add(p3);
		Paragraph p4 = new Paragraph("Paragraph 4");
		cap1.add(p4);
		cap1.add(new Image("ImageOne"));
		cap1.add(new Image("ImageTwo"));
		cap1.add(new Paragraph("Some text"));
		cap1.add(new Table("Table 1"));
		BookStatistics stats = new BookStatistics();
		cap1.accept(stats);
		stats.printStatistics();*/

		Book b = new Book("The book");
		Section cap1 = new Section("Chapter 1");
		Section cap11 = new Section("Subchapter 1.1");
		Section cap2 = new Section("Chapter 2");
		cap1.add(new Paragraph("Paragraph 1"));
		cap1.add(new Paragraph("Paragraph 2"));
		cap1.add(new Paragraph("Paragraph 3"));

		cap11.add(new Image("ImageOne"));
		cap11.add(new Image("ImageTwo"));

		Paragraph p4 = new Paragraph("Paragraph 4");
		cap2.add(new Paragraph("Paragraph 4"));
		cap2.add(p4);
		cap1.add(cap11);
		cap1.add(new Paragraph("Some text"));
		cap1.add(new Table("Table 1"));
		b.addContent(cap1);
		b.addContent(cap2);

		TableOfContentUpdate tocUpdate = new TableOfContentUpdate();
		b.accept(tocUpdate);
		tocUpdate.getTableOfContents().accept(new RenderContentVisitor());

	}

}
