package _02_leetcodes;
//https://leetcode.com/problems/excel-sheet-column-number/
public class ExcelSheetColumnNumber {
    public int titleToNumber(String columnTitle) {
        //chartAt 26 symbols and each with pow is the number it returns to it has to minus A which is 10
        int counter = -1, res = 0;
        for (int i = columnTitle.length() -1; i >=0 ; i--) {
            counter++;
            res += (columnTitle.charAt(i) - 'A' +1) * Math.pow(26,counter);
        }
        return res;

    }
}
