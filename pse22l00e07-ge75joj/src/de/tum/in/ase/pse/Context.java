package de.tum.in.ase.pse;

import java.util.List;

public class Context {

	private List<Chapter> book;
	private SearchStrategy searchAlgorithm;

	public Context() {
	}

	public boolean isChaptersSortedByName() {
		Chapter prevChapter = book.get(0);
		for (Chapter chapter : book) {
			if (prevChapter.getName().compareTo(chapter.getName()) > 1) {
				return false;
			}
		}
		return true;
	}

	public int search(String name) {
		return searchAlgorithm.performSearch(book, name);
	}

	public List<Chapter> getBook() {
		return book;
	}

	public void setBook(List<Chapter> book) {
		this.book = book;
	}

	public SearchStrategy getSearchAlgorithm() {
		return searchAlgorithm;
	}

	public void setSearchAlgorithm(SearchStrategy searchAlgorithm) {
		this.searchAlgorithm = searchAlgorithm;
	}

}
