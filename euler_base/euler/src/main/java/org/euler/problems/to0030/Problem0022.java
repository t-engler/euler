package org.euler.problems.to0030;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

import org.euler.common.Strings;

/**
 * Using names.txt (right click and 'Save Link/Target As...'), a 46K text file
 * containing over five-thousand first names, begin by sorting it into
 * alphabetical order. Then working out the alphabetical value for each name,
 * multiply this value by its alphabetical position in the list to obtain a name
 * score.
 * 
 * For example, when the list is sorted into alphabetical order, COLIN, which is
 * worth 3 + 15 + 12 + 9 + 14 = 53, is the 938th name in the list. So, COLIN
 * would obtain a score of 938 × 53 = 49714.
 * 
 * What is the total of all the name scores in the file?
 * 
 * @author User
 *
 */
public class Problem0022 {
	public static void main(String[] args) throws IOException {
		long result = 0;
		String basepath = System.getProperty("user.dir")+"\\src\\\\main\\\\java\\\\org\\\\euler\\\\problems\\\\to0030\\";
		String filename = "names.txt";
		String textString = "";
		String[] textArray;

		File textFile = new File(basepath + filename);
		FileReader textReader = new FileReader(textFile);
		BufferedReader bufferedTextReader = new BufferedReader(textReader);

		for (String subTextString = bufferedTextReader
				.readLine(); subTextString != null; subTextString = bufferedTextReader.readLine()) {
			textString += subTextString;
		}

		if (bufferedTextReader != null) {
			bufferedTextReader.close();
		}
		
		textString = Strings.removeStringCharacter(textString, "\"");
		textArray = textString.split(",");
		Arrays.sort(textArray);

		long position = 1;
		for(String s:textArray) {
			long stringValue = 0;
			for(char n:s.toCharArray()) {
				stringValue += n-'A'+1;
			}
			result += stringValue * position;
			position++;
		}
		System.out.println(result);
	}
}
