module kont2020 {
	requires javafx.fxml;
	requires javafx.graphics;
	requires javafx.controls;
	requires junit;

	exports food;
	exports food.def;
	exports stuff;

	opens stuff to javafx.fxml;
}