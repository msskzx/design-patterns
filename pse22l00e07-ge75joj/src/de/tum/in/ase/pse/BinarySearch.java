package de.tum.in.ase.pse;

import java.util.List;

public class BinarySearch implements SearchStrategy {

	public int performSearch(List<Chapter> chapters, String chapterName) {
		int low = 0;
		int high = chapters.size() - 1;
		int mid;
		Chapter chapter;

		while (low <= high) {
			mid = low + (high - low) / 2;
			chapter = chapters.get(mid);
			switch (chapter.getName().compareTo(chapterName)) {
			case 0:
				return chapter.getPageNumber();
			case 1:
				high = mid - 1;
				break;
			default:
				low = mid + 1;
			}
		}
		return -1;
	}

}
