package Entities;

import java.util.ArrayList;
import java.util.List;

public class BoardColumn {
	private List<Cell> cells;

	public BoardColumn()
	{
		cells = new ArrayList<Cell>();
	}
	
	public BoardColumn(List<Cell> cellsValue)
	{
		cells = cellsValue;
	}
	
	public void AddCell(Cell newCell)
	{
		cells.add(newCell);
	}
	
	public List<Cell> getCells() {
		return cells;
	}

	public void setCells(List<Cell> cells) {
		this.cells = cells;
	}
}
