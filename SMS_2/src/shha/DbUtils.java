/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shha;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.Vector;


import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
/**
 *
 * @author MooseMoose
 */
public class DbUtils {


     /**
         * A converter which helps filling the JTable from the
         * JDBC drivers ResultSet;
         * 
         * @param rs - the ResultSet from the JDBC
         * @return a TableModel for the JTable
         */
    public static TableModel resultSetToTableModel(ResultSet rs) {
        try {
            ResultSetMetaData metaData = rs.getMetaData();
            int numberOfColumns = metaData.getColumnCount();
            Vector<String> columnNames = new Vector<String>();

            // Get the column names
            for (int column = 0; column < numberOfColumns; column++) {
                columnNames.addElement(metaData.getColumnLabel(column + 1));
            }

            // Get all rows.
            Vector<Vector<Object>> rows = new Vector<Vector<Object>>();
            rs.beforeFirst();
            while (rs.next()) {
                Vector<Object> newRow = new Vector<Object>();

                for (int i = 1; i <= numberOfColumns; i++) {
                    newRow.addElement(rs.getObject(i));
                }
                rows.addElement(newRow);
            }
            return new DefaultTableModel(rows, columnNames){
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }};
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
