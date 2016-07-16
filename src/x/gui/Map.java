package x.gui;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Map extends JTable {

    private int mapSize = 100;
    private int cellSize = 5;

    public Map() {
        // Задаем кол-во ячеек mapSize x mapSize
        this.setModel(new DefaultTableModel(this.mapSize, this.mapSize));

        // Задаем высоту ячеек - cellSize = 5
        this.setRowHeight(this.cellSize);
        
        // Задаем ширину ячеек
        // Нужно перебрать все столбцы,
        // и для каждого столбца отдельно задать размер,
        // чтобы задать у всех столбцов одинаковую ширину.
        for (int i = 0; i < this.mapSize; i++) {
            this.getColumnModel().getColumn(i).setMinWidth(this.cellSize);
            this.getColumnModel().getColumn(i).setMaxWidth(this.cellSize);
        }
    }
}
