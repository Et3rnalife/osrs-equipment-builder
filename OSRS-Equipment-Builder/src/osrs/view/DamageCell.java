package osrs.view;

import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import osrs.MainApp;
import osrs.model.npc.ArmorSet;

public class DamageCell extends ListCell<ArmorSet> {


	private AnchorPane pane;
	private SetCompactViewController controller;
	private ListView<ArmorSet> listView;

	public DamageCell( ListView<ArmorSet> listView ) {
		super();

		this.listView = listView;

		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MainApp.class.getResource("view/SetCompactView.fxml"));
			pane = (AnchorPane) loader.load();

			controller = loader.getController();
			controller.setCell(this);
			controller.setList(listView);
		} catch (Exception e) {
			e.printStackTrace();
			pane = null;
		}
//		pane = new GridPane();
//
//		pane.add(name, 0, 0);
//		pane.add(edit, 0, 1);
//		pane.add(delete, 0, 2);
//
//		pane.add(maxhit, 1, 0);
//		pane.add(accuracy, 1, 1);
//		pane.add(dps, 1, 2);
		setText(null);
	}

	@Override
	public void updateItem(ArmorSet item, boolean empty) {
		super.updateItem(item, empty);
		setEditable(false);
		if(item != null) {
			setGraphic(pane);
		} else {
			setGraphic(null);
		}
	}

	private void editItem() {
		try {

		} catch (Exception e) {

		}
	}
}