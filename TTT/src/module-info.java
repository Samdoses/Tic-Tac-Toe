/**
 * 
 */
/**
 * 
 */
module TTT {
	// Requires the JavaFX controls module
    requires javafx.controls;
    
    // (Optional) If you plan to use FXML
    requires javafx.fxml;
	requires javafx.graphics;

    // You must export your 'main' package so JavaFX can access your Application class
    exports main;
}