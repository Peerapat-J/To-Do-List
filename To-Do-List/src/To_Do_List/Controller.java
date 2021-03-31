package To_Do_List;

import datamodel.ToDoItem;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TextArea;

import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;
import java.util.function.ToDoubleFunction;

public class Controller {
    public TextArea itemTextArea;
    private List<ToDoItem> ToDoItems;
    @FXML
    private ListView<ToDoItem> ToDoItemsView;
    @FXML
    private TextArea itemDetailTextArea;
    @FXML
    private Label deadLineLabel;

    public void initialize(){
        ToDoItem item1 = new ToDoItem("myTask1", "My task detail 1", LocalDate.of(2020,3,31));
        ToDoItem item2 = new ToDoItem("myTask2", "My task detail 2", LocalDate.of(2020,3,31));
        ToDoItem item3 = new ToDoItem("myTask3", "My task detail 3", LocalDate.of(2020,3,31));
        ToDoItem item4 = new ToDoItem("myTask4", "My task detail 4", LocalDate.of(2020,3,31));
        ToDoItem item5 = new ToDoItem("myTask5", "My task detail 5", LocalDate.of(2020,3,31));

        ToDoItems = new ArrayList<ToDoItem>();
        ToDoItems.add(item1);
        ToDoItems.add(item2);
        ToDoItems.add(item3);
        ToDoItems.add(item4);
        ToDoItems.add(item5);

        ToDoItemsView.getItems().setAll(ToDoItems);
        ToDoItemsView.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);

    }

    @FXML
    public void handleClickView(){
        ToDoItem item = ToDoItemsView.getSelectionModel().getSelectedItem();
        itemDetailTextArea.setText(item.getDetails());
        deadLineLabel.setText(item.getDeadLine().toString());
//        //itemTextArea.setText(item.getDetail());
//        StringBuilder StringBuilder = new StringBuilder(item.getDetail());
//        StringBuilder.append("\n\n");
//        StringBuilder.append("Due date: ");
//        StringBuilder.append(item.getDeadLine().toString());
//        //System.out.println(item);
//        itemTextArea.setText(StringBuilder.toString());
    }
}
