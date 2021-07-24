package Home_Encapsulation;

public class Table {
    /*
     * TODO 1: Provide a Row class and make it public and static.
     *
     * TODO 2: Provide two attributes inside the Row class as shown below:
     * 		- rowNumber: int
     * 		- data: String
     * 		Here '-' represent that these attributes are private.
     *
     * TODO 3: Provide a public constructor which takes two argument, first one of
     * type int and second one type String. Use these two arguments to initialize
     * the rowNumber and data attributes of the Row class.
     *
     * TODO 4:Provide getters and setters for the rowNumber and data attributes.
     */
    //public static class Row{
    //	//uncomment this class to solve this assessment.
    //}
    public static  class Row{
        private int rowNumber;
        private String data;

        public Row(int rowNumber,String data){
            this.rowNumber = rowNumber;
            this.data = data;
        }

        public int getRowNumber() {
            return rowNumber;
        }

        public void setRowNumber(int rowNumber) {
            this.rowNumber = rowNumber;
        }

        public String getData() {
            return data;
        }

        public void setData(String data) {
            this.data = data;
        }
    }
    private Row[] rows;
    private int currentRow;

    public Table() {
        this.rows = new Row[100];
        this.currentRow = 0;
    }

    public void addRow(Row row) {
        this.rows[currentRow++] = row;
    }

    public Row getRow(int rowNumber) {
        return this.rows[rowNumber];
    }

}
