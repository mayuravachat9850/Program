package Home_Encapsulation;


public class Table_Source {
    public static void main(String[] args) {
        Table table = new Table();

        Table.Row row0 = new Table.Row(0, "Name");
        Table.Row row1 = new Table.Row(1, "Name");
        Table.Row row2 = new Table.Row(2, "Name");

        /*
         * TODO 5: Create two more objects of Table.Row type and name them row1 and row2.
         * For these two objects, give rowNumber as 1 and 2 for row1 and row2 objects, respectively.
         * For the data attribute, you can give names of your friends.
         */


        table.addRow(row0);
        table.addRow(row1);
        table.addRow(row2);

        Table.Row row;

        row = table.getRow(0);
        System.out.println("Row Number: " + row.getRowNumber() + ", Row Data: " + row.getData());

        row = table.getRow(1);
        System.out.println("Row Number: " + row.getRowNumber() + ", Row Data: " + row.getData());

        row = table.getRow(2);
        System.out.println("Row Number: " + row.getRowNumber() + ", Row Data: " + row.getData());
    }
}
