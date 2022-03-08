
import java.awt.List;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import java.awt.Menu;
import java.awt.MenuItem;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import org.omg.CORBA.Environment;
import org.omg.Messaging.SyncScopeHelper;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class POSUserInterface extends Application {

	// private static final char[] POSCustomerOrder = null;

	int userInput = 0;

	String concatUserInputAsString = "";
	int tableNumberInt = 0;
	String tableNumber = "";
	String numberOfGuests = "";
	String seatNumber = "";
	String str;
	String drink = "";
	String app = "";
	String antree = "";
	String side = "";
	String desert = "";
	static POSMenuItem newItem;
	Object myEvent;

	double orderItemCost = 0.0;
	static double myOrderTotal = 0.0;
	static double printOrderTotalHolder = 0.0;

	TextArea POSOrderTextArea = new TextArea();

	static int orderIndex = 0;
	static int orderNumberTextFieldIndex = 1;
	String orderNumberString = Integer.toString(orderNumberTextFieldIndex);
	static int seatNumberIndex = 99;

	ArrayList<POSCustomerOrder> POSCustomerOrders = new ArrayList<POSCustomerOrder>();

	public void TestMethod() {

	}

	@Override // Override the start method in the Application class
	public void start(Stage primaryStage) throws Exception {

		if (POSCustomerOrders.isEmpty()) {
			POSCustomerOrders.add(new POSCustomerOrder());
		}

		primaryStage.setTitle("Load Image");

		// Create Pane
		Pane root = new Pane();

		// Create ImageView
		Image homeScreenImage = new Image("logo.jpg");

		// Display ImageView
		ImageView imageView = new ImageView(homeScreenImage);

		// Resize image to have width of 800 and preserv the ratio
		imageView.setFitWidth(800);
		imageView.setPreserveRatio(true);

		// Add imageView
		root.getChildren().add(imageView);

		// Create openPosButton
		Button openPosButton = new Button();
		openPosButton.setText("LAUNCH \nSHELLS");
		// Set size for newCheckButton
		openPosButton.setPrefSize(100, 40);

		// Create recallCheckButton
		Button recallCheckButton = new Button();
		recallCheckButton.setText("Recall \nCheck");
		recallCheckButton.setVisible(false);

		// Create printCheckButton
		Button printCheckButton = new Button();
		printCheckButton.setText("Print \nCheck");
		printCheckButton.setVisible(false);
		// Set size for printCheckButton
		printCheckButton.setPrefSize(100, 40);
		// Set layout for printCheckButton
		printCheckButton.setLayoutX(320);
		printCheckButton.setLayoutY(700);

		// Create newOrderButton
		Button newOrderButton = new Button();
		newOrderButton.setText("New \nOrder");
		newOrderButton.setVisible(false);
		// Set size for newOrderButton
		newOrderButton.setPrefSize(50, 40);
		// Set layout for newOrderButton
		newOrderButton.setLayoutX(330);
		newOrderButton.setLayoutY(565);

		// Create prevOrderButton
		Button prevOrderButton = new Button();
		prevOrderButton.setText("Prev \nOrder");
		prevOrderButton.setVisible(false);
		// Set size for prevOrderButton
		prevOrderButton.setPrefSize(50, 40);
		// Set layout for prevOrderButton
		prevOrderButton.setLayoutX(100);
		prevOrderButton.setLayoutY(565);

		// Create nextOrderButton
		Button nextOrderButton = new Button();
		nextOrderButton.setText("Next \nOrder");
		nextOrderButton.setVisible(false);
		// Set size for nextOrderButton
		nextOrderButton.setPrefSize(50, 40);
		// Set layout for nextOrderButton
		nextOrderButton.setLayoutX(270);
		nextOrderButton.setLayoutY(565);

		// Create cash button
		Button cashButton = new Button();
		cashButton.setVisible(false);
		cashButton.setText("Cash");
		// Set size for cash button
		cashButton.setPrefSize(100, 40);
		cashButton.setLayoutX(100);
		cashButton.setLayoutY(700);

		// Create creditButton
		Button creditButton = new Button();
		creditButton.setVisible(false);
		creditButton.setText("Credit");
		// Set size for cash button
		creditButton.setPrefSize(100, 40);
		creditButton.setLayoutX(210);
		creditButton.setLayoutY(700);

		// Create VisaButton
		Button VisaButton = new Button();
		VisaButton.setVisible(false);
		VisaButton.setText("Visa");
		// Set size for visaButton
		VisaButton.setPrefSize(100, 40);
		VisaButton.setLayoutX(100);
		VisaButton.setLayoutY(700);

		// Create MasterCardButton
		Button MasterCardButton = new Button();
		MasterCardButton.setVisible(false);
		MasterCardButton.setText("Master \nCard");
		// Set size for masterCardButton
		MasterCardButton.setPrefSize(100, 40);
		MasterCardButton.setLayoutX(210);
		MasterCardButton.setLayoutY(700);

		// Create DiscoverButton
		Button DiscoverButton = new Button();
		DiscoverButton.setVisible(false);
		DiscoverButton.setText("Discover");
		// Set size for DiscoverButton
		DiscoverButton.setPrefSize(100, 40);
		DiscoverButton.setLayoutX(320);
		DiscoverButton.setLayoutY(700);

		// Create AmericanExpressButton
		Button AmericanExpressButton = new Button();
		AmericanExpressButton.setVisible(false);
		AmericanExpressButton.setText("American \nExpress");
		// Set size for AmericanExpressButton
		AmericanExpressButton.setPrefSize(100, 40);
		AmericanExpressButton.setLayoutX(210);
		AmericanExpressButton.setLayoutY(650);

		// Create preAuthButton
		Button preAuthButton = new Button();
		preAuthButton.setText("Pre \nAuth");
		preAuthButton.setVisible(false);
		// Set size for preAuthButton
		preAuthButton.setPrefSize(60, 40);
		// Set layout for preAuthButton
		preAuthButton.setLayoutX(30);
		preAuthButton.setLayoutY(700);

		// Create orderNumberTextField
		TextField orderNumberTextField = new TextField();
		orderNumberTextField.setVisible(false);
		// Set size of orderNumberTextField
		orderNumberTextField.setPrefSize(100, 25);
		// Set layout of orderNumberTextField
		orderNumberTextField.setLayoutX(160);
		orderNumberTextField.setLayoutY(565);
		// Set text of orderNumberTextField
		orderNumberTextField.setText(orderNumberString);

		// Create service sendCheckButton
		Button sendCheckButton = new Button();
		sendCheckButton.setText("Create/Send \n Order");
		sendCheckButton.setVisible(false);
		// Set size for sendCheckButton
		sendCheckButton.setPrefSize(100, 40);
		// Set layout for sendCheckButton
		sendCheckButton.setLayoutX(210);
		sendCheckButton.setLayoutY(650);

		// Create balanceCheckButton
		Button balanceCheckButton = new Button();
		balanceCheckButton.setText("Bal \nCheck");
		balanceCheckButton.setVisible(false);
		// Set size for balanceCheckButton
		balanceCheckButton.setPrefSize(60, 40);
		// Set layout for balanceCheckButton
		balanceCheckButton.setLayoutX(30);
		balanceCheckButton.setLayoutY(700);

		// Create sevenButton
		Button sevenButton = new Button();
		sevenButton.setText("7");
		sevenButton.setVisible(false);

		// Create eightButton
		Button eightButton = new Button();
		eightButton.setText("8");
		eightButton.setVisible(false);

		// Create nineButton
		Button nineButton = new Button();
		nineButton.setText("9");
		nineButton.setVisible(false);

		// Create fourButton
		Button fourButton = new Button();
		fourButton.setText("4");
		fourButton.setVisible(false);

		// Create fiveButton
		Button fiveButton = new Button();
		fiveButton.setText("5");
		fiveButton.setVisible(false);

		// Create sixButton
		Button sixButton = new Button();
		sixButton.setText("6");
		sixButton.setVisible(false);

		// Create oneButton
		Button oneButton = new Button();
		oneButton.setText("1");
		oneButton.setVisible(false);

		// Create twoButton
		Button twoButton = new Button();
		twoButton.setText("2");
		twoButton.setVisible(false);

		// Create threeButton
		Button threeButton = new Button();
		threeButton.setText("3");
		threeButton.setVisible(false);

		// Create decimalButton
		Button decimalButton = new Button();
		decimalButton.setText(".");
		decimalButton.setVisible(false);
		// Set size for decimalButton
		decimalButton.setPrefSize(50, 40);
		// Set layout for decimalButton
		decimalButton.setLayoutY(655);
		decimalButton.setLayoutX(670);

		// Create leftArrowButton
		Button leftArrowButton = new Button();
		leftArrowButton.setText("\u21E6");
		leftArrowButton.setVisible(false);
		leftArrowButton.setFont(Font.font("Verdana", FontWeight.BOLD, 20));

		// Create rightArrowButton
		Button rightArrowButton = new Button();
		rightArrowButton.setText("\u21E8");
		rightArrowButton.setVisible(false);
		rightArrowButton.setFont(Font.font("Verdana", FontWeight.BOLD, 20));

		// Create upArrowButton
		Button upArrowButton = new Button();
		upArrowButton.setText("\u21E7");
		upArrowButton.setVisible(false);
		upArrowButton.setFont(Font.font("Verdana", FontWeight.BOLD, 20));

		// Create downArrowButton
		Button downArrowButton = new Button();
		downArrowButton.setText("\u21E9");
		downArrowButton.setVisible(false);
		downArrowButton.setFont(Font.font("Verdana", FontWeight.BOLD, 20));

		// Create backSpaceButton
		Button backSpaceButton = new Button();
		backSpaceButton.setText("\u232B");
		backSpaceButton.setVisible(false);

		// Create deleteButton
		Button deleteButton = new Button();
		deleteButton.setText("\u2421");
		deleteButton.setVisible(false);
		deleteButton.setFont(Font.font("Verdana", FontWeight.BOLD, 21));

		// Create zeroButton
		Button zeroButton = new Button();
		zeroButton.setText("0");
		zeroButton.setVisible(false);

		// Create prevScreenHomeButton
		Button prevScreenHomeButton = new Button();
		prevScreenHomeButton.setText("Home");
		prevScreenHomeButton.setVisible(false);
		// Set layout for prevScreenDrinksButton
		prevScreenHomeButton.setLayoutY(100);
		prevScreenHomeButton.setLayoutX(30);
		// Set size for prevScreenHomeButton
		prevScreenHomeButton.setPrefSize(60, 40);

		// Create prevScreenMenuButton
		Button prevScreenMenuButton = new Button();
		prevScreenMenuButton.setText("Prev");
		prevScreenMenuButton.setVisible(false);
		// Set layout for prevScreenMenuButton
		prevScreenMenuButton.setLayoutY(100);
		prevScreenMenuButton.setLayoutX(30);
		// Set size for prevScreenMenuButton
		prevScreenMenuButton.setPrefSize(60, 40);

		// Create prevScreenDrinksButton
		Button prevScreenDrinksButton = new Button();
		prevScreenDrinksButton.setText("Prev");
		prevScreenDrinksButton.setVisible(false);
		// Set layout for prevScreenDrinksButton
		prevScreenDrinksButton.setLayoutY(100);
		prevScreenDrinksButton.setLayoutX(30);
		// Set size for prevScreenMenuButton
		prevScreenDrinksButton.setPrefSize(60, 40);

		// Create prevScreenCashCreditButton
		Button prevScreenCashCreditButton = new Button();
		prevScreenCashCreditButton.setText("Prev");
		prevScreenCashCreditButton.setVisible(false);
		// Set layout for prevScreenCashCreditButton
		prevScreenCashCreditButton.setLayoutY(100);
		prevScreenCashCreditButton.setLayoutX(30);
		// Set size for prevScreenCashCreditButton
		prevScreenCashCreditButton.setPrefSize(60, 40);

		// Create table number button & set to not visible
		Button tableNumberButton = new Button();
		tableNumberButton.setText("Table \nNumber");
		tableNumberButton.setVisible(false);

		// Create number of guests button
		Button numberOfGuestsButton = new Button();
		numberOfGuestsButton.setText("Number \nGuests");
		numberOfGuestsButton.setVisible(false);

		// Create seat number button
		Button seatNumberButton = new Button();
		seatNumberButton.setText("Seat \nNumber");
		seatNumberButton.setVisible(false);

		// Create tenderCheckButton
		Button tenderCheckButton = new Button();
		tenderCheckButton.setText("Tender \n Check");
		tenderCheckButton.setVisible(false);

		// Create clearButton
		Button clearButton = new Button();
		clearButton.setText("Clear");
		clearButton.setVisible(false);

		// Create orderTextArea
		TextArea orderTextArea = new TextArea();
		orderTextArea.setPrefRowCount(350);
		orderTextArea.setVisible(false);

		// Create userInputTextField
		TextField userInputTextField = new TextField();
		userInputTextField.setVisible(false);
		userInputTextField.setText("" + userInputTextField);

		// Create userInputFeedBackTextField
		TextField userInputFeedBackTextField = new TextField();
		userInputFeedBackTextField.setVisible(false);

		// Create drinks button & set to not visible
		Button drinkButton = new Button();
		drinkButton.setText("Drink \nMenu");
		drinkButton.setVisible(false);

		// Create sodaMiscButton button & set to not visible
		Button sodaMiscButton = new Button();
		sodaMiscButton.setText("Soda \nMisc");
		sodaMiscButton.setVisible(false);

		// Create cokeButton & set to not visible
		Button cokeButton = new Button();
		cokeButton.setText("Coke");
		cokeButton.setVisible(false);

		// Create spriteButton & set to not visible
		Button spriteButton = new Button();
		spriteButton.setText("Sprite");
		spriteButton.setVisible(false);

		// Create orangeButton & set to not visible
		Button orangeButton = new Button();
		orangeButton.setText("Orange \nSoda");
		orangeButton.setVisible(false);

		// Create rootBeerButton & set to not visible
		Button rootBeerButton = new Button();
		rootBeerButton.setText("Root \nBeer");
		rootBeerButton.setVisible(false);

		// Create dietCokeButton & set to not visible
		Button dietCokeButton = new Button();
		dietCokeButton.setText("Diet \nCoke");
		dietCokeButton.setVisible(false);

		// Create iceTeaButton & set to not visible
		Button iceTeaButton = new Button();
		iceTeaButton.setText("Ice \nTea");
		iceTeaButton.setVisible(false);

		// Create lemonadeButton & set to not visible
		Button lemonadeButton = new Button();
		lemonadeButton.setText("Lemonade");
		lemonadeButton.setVisible(false);

		// Create coffeeButton & set to not visible
		Button regCoffeeButton = new Button();
		regCoffeeButton.setText("Coffee");
		regCoffeeButton.setVisible(false);

		// Create decafCoffeeButton & set to not visible
		Button decafCoffeeButton = new Button();
		decafCoffeeButton.setText("Decaf \nCoffee");
		decafCoffeeButton.setVisible(false);

		// Create cappiccinoButton & set to not visible
		Button cappiccinoButton = new Button();
		cappiccinoButton.setText("Cappiccino");
		cappiccinoButton.setVisible(false);

		// Create latteButton & set to not visible
		Button latteButton = new Button();
		latteButton.setText("Latte");
		latteButton.setVisible(false);

		// Create espressoButton & set to not visible
		Button espressoButton = new Button();
		espressoButton.setText("Espresso");
		espressoButton.setVisible(false);

		// Create orangeJuiceButton & set to not visible
		Button orangeJuiceButton = new Button();
		orangeJuiceButton.setText("Orange \nJuice");
		orangeJuiceButton.setVisible(false);

		// Create appleJuiceButton & set to not visible
		Button appleJuiceButton = new Button();
		appleJuiceButton.setText("Apple \nJuice");
		appleJuiceButton.setVisible(false);

		// Create cranberryJuiceButton & set to not visible
		Button cranberryJuiceButton = new Button();
		cranberryJuiceButton.setText("Cranberry \nJuice");
		cranberryJuiceButton.setVisible(false);

		// Create pineappleJuiceButton & set to not visible
		Button pineappleJuiceButton = new Button();
		pineappleJuiceButton.setText("Pineapple \nJuice");
		pineappleJuiceButton.setVisible(false);

		// Create budButton & set to not visible
		Button budButton = new Button();
		budButton.setText("Bud");
		budButton.setVisible(false);

		// Create heinekenButton & set to not visible
		Button heinekenButton = new Button();
		heinekenButton.setText("Heineken");
		heinekenButton.setVisible(false);

		// Create coronaButton & set to not visible
		Button coronaButton = new Button();
		coronaButton.setText("Corona");
		coronaButton.setVisible(false);

		// Create chimayButton & set to not visible
		Button chimayButton = new Button();
		chimayButton.setText("Chimay \nBlue");
		chimayButton.setVisible(false);

		// Create sweetWaterButton & set to not visible
		Button sweetWaterButton = new Button();
		sweetWaterButton.setText("Sweet \nWater");
		sweetWaterButton.setVisible(false);

		// Create maduroButton & set to not visible
		Button maduroButton = new Button();
		maduroButton.setText("Maduro");
		maduroButton.setVisible(false);

		// Create samAdamsButton & set to not visible
		Button samAdamsButton = new Button();
		samAdamsButton.setText("Sam \nAdams");
		samAdamsButton.setVisible(false);

		// Create killiansButton & set to not visible
		Button killiansButton = new Button();
		killiansButton.setText("Killians \nRed");
		killiansButton.setVisible(false);

		// Create twoHeartedButton & set to not visible
		Button twoHeartedButton = new Button();
		twoHeartedButton.setText("Two \nHearted");
		twoHeartedButton.setVisible(false);

		// Create bigRedButton & set to not visible
		Button bigRedButton = new Button();
		bigRedButton.setText("Big Red \nCab");
		bigRedButton.setVisible(false);

		// Create merlButton & set to not visible
		Button merlButton = new Button();
		merlButton.setText("Merl \nMerlot");
		merlButton.setVisible(false);

		// Create softWaveButton & set to not visible
		Button softWaveButton = new Button();
		softWaveButton.setText("Soft Wave \nPinot");
		softWaveButton.setVisible(false);

		// Create swirlButton & set to not visible
		Button swirlButton = new Button();
		swirlButton.setText("Swirl \nChard");
		swirlButton.setVisible(false);

		// Create shoreButton & set to not visible
		Button shoreButton = new Button();
		shoreButton.setText("Shore \nSav Blanc");
		shoreButton.setVisible(false);

		// Create horizonButton & set to not visible
		Button horizonButton = new Button();
		horizonButton.setText("Horizon \nChenin");
		horizonButton.setVisible(false);

		// Create bigCapButton & set to not visible
		Button bigCapButton = new Button();
		bigCapButton.setText("Big Cap \nZin");
		bigCapButton.setVisible(false);

		// Create curlButton & set to not visible
		Button curlButton = new Button();
		curlButton.setText("Curl \nBlend");
		curlButton.setVisible(false);

		// Create sunriseButton & set to not visible
		Button sunriseButton = new Button();
		sunriseButton.setText("Sun Rise \nBlend");
		sunriseButton.setVisible(false);

		// Create juiceButton & set to not visible
		Button juiceButton = new Button();
		juiceButton.setText("Juice");
		juiceButton.setVisible(false);

		// Create beerButton button & set to not visible
		Button beerButton = new Button();
		beerButton.setText("Beer");
		beerButton.setVisible(false);

		// Create wineButton button & set to not visible
		Button wineButton = new Button();
		wineButton.setText("Wine");
		wineButton.setVisible(false);

		// Create coffeeButton button & set to not visible
		Button coffeeButton = new Button();
		coffeeButton.setText("Coffee");
		coffeeButton.setVisible(false);

		// Create appetizer button & set to not visible
		Button appetizerButton = new Button();
		appetizerButton.setText("App \nMenu");
		appetizerButton.setVisible(false);

		// Create scampiButton & set to not visible
		Button scampiButton = new Button();
		scampiButton.setText("Shrimp \nScampi");
		scampiButton.setVisible(false);
		// Set scampiButton size
		scampiButton.setPrefSize(100, 40);
		// Set scampiButton layout
		scampiButton.setLayoutY(100);
		scampiButton.setLayoutX(100);

		// Create calamariButton & set to not visible
		Button calamariButton = new Button();
		calamariButton.setText("Calamari");
		calamariButton.setVisible(false);
		// Set calamariButton size
		calamariButton.setPrefSize(100, 40);
		// Set calamariButton layout
		calamariButton.setLayoutY(200);
		calamariButton.setLayoutX(100);

		// Create bruschettaButton & set to not visible
		Button bruschettaButton = new Button();
		bruschettaButton.setText("Bruschetta");
		bruschettaButton.setVisible(false);
		// Set bruschettaButton size
		bruschettaButton.setPrefSize(100, 40);
		// Set bruschettaButton layout
		bruschettaButton.setLayoutY(150);
		bruschettaButton.setLayoutX(100);

		// Create musclesButton & set to not visible
		Button musclesButton = new Button();
		musclesButton.setText("Muscles");
		musclesButton.setVisible(false);
		// Set musclesButton size
		musclesButton.setPrefSize(100, 40);
		// Set musclesButton layout
		musclesButton.setLayoutY(200);
		musclesButton.setLayoutX(100);

		// Create crabCakesButton & set to not visible
		Button crabCakesButton = new Button();
		crabCakesButton.setText("Crab \nCakes");
		crabCakesButton.setVisible(false);
		// Set crabCakesButton size
		crabCakesButton.setPrefSize(100, 40);
		// Set crabCakesButton layout
		crabCakesButton.setLayoutY(250);
		crabCakesButton.setLayoutX(100);

		// Create coconutShrimpButton & set to not visible
		Button coconutShrimpButton = new Button();
		coconutShrimpButton.setText("Coconut \nShrimp");
		coconutShrimpButton.setVisible(false);
		// Set coconutShrimpButton size
		coconutShrimpButton.setPrefSize(100, 40);
		// Set coconutShrimpButton layout
		coconutShrimpButton.setLayoutY(300);
		coconutShrimpButton.setLayoutX(100);

		// Create entreeButton & set to not visible
		Button entreeButton = new Button();
		entreeButton.setText("Antree \nMenu");
		entreeButton.setVisible(false);
		// Set size for entreeButton
		entreeButton.setPrefSize(100, 40);

		// Create seafoodAlfredoButton & set to not visible
		Button seafoodAlfredoButton = new Button();
		seafoodAlfredoButton.setText("Seafood \nAlfredo");
		seafoodAlfredoButton.setVisible(false);
		// Set seafoodAlfredoButton size
		seafoodAlfredoButton.setPrefSize(100, 40);
		// Set seafoodAlfredoButton layout
		seafoodAlfredoButton.setLayoutY(100);
		seafoodAlfredoButton.setLayoutX(210);

		// Create scampiLinguiniButton & set to not visible
		Button scampiLinguiniButton = new Button();
		scampiLinguiniButton.setText("Scampi \nLinguini");
		scampiLinguiniButton.setVisible(false);
		// Set scampiLinguiniButton size
		scampiLinguiniButton.setPrefSize(100, 40);
		// Set scampiLinguiniButton layout
		scampiLinguiniButton.setLayoutY(150);
		scampiLinguiniButton.setLayoutX(210);

		// Create lobsterMacButton and set to not visible
		Button lobsterMacButton = new Button();
		lobsterMacButton.setText("Lobster \nMac");
		lobsterMacButton.setVisible(false);
		// Set lobsterMacButton size
		lobsterMacButton.setPrefSize(100, 40);
		// Set lobsterMacButton layout
		lobsterMacButton.setLayoutY(200);
		lobsterMacButton.setLayoutX(210);

		// Create salmonButton and set to not visible
		Button salmonButton = new Button();
		salmonButton.setText("Salmon");
		salmonButton.setVisible(false);
		// Set salmonButton size
		salmonButton.setPrefSize(100, 40);
		// Set salmonButton layout
		salmonButton.setLayoutY(100);
		salmonButton.setLayoutX(100);

		// Create mahiButton and set to not visible
		Button mahiButton = new Button();
		mahiButton.setText("Mahi");
		mahiButton.setVisible(false);
		// Set mahiButton size
		mahiButton.setPrefSize(100, 40);
		// Set mahiButton layout
		mahiButton.setLayoutY(150);
		mahiButton.setLayoutX(100);

		// Create troutButton and set to not visible
		Button troutButton = new Button();
		troutButton.setText("Trout");
		troutButton.setVisible(false);
		// Set troutButton size
		troutButton.setPrefSize(100, 40);
		// Set troutButton layout
		troutButton.setLayoutY(200);
		troutButton.setLayoutX(100);

		// Create tunaButton and set to not visible
		Button tunaButton = new Button();
		tunaButton.setText("Tuna");
		tunaButton.setVisible(false);
		// Set tunaButton size
		tunaButton.setPrefSize(100, 40);
		// Set tunaButton layout
		tunaButton.setLayoutY(250);
		tunaButton.setLayoutX(100);

		// create oysterButton and set to not visible
		Button oysterButton = new Button();
		oysterButton.setText("Oysters");
		oysterButton.setVisible(false);
		// Set oysterButton size
		oysterButton.setPrefSize(100, 40);
		// Set oysterButton layout
		oysterButton.setLayoutY(250);
		oysterButton.setLayoutX(210);

		// create lobsterButton and set to not visible
		Button lobsterButton = new Button();
		lobsterButton.setText("Lobster");
		lobsterButton.setVisible(false);
		// Set lobsterButton size
		lobsterButton.setPrefSize(100, 40);
		// Set lobsterButton layout
		lobsterButton.setLayoutY(300);
		lobsterButton.setLayoutX(210);

		// create crabButton and set to not visible
		Button crabButton = new Button();
		crabButton.setText("Crab \nLegs");
		crabButton.setVisible(false);
		// Set crabButton size
		crabButton.setPrefSize(100, 40);
		// Set crabButton layout
		crabButton.setLayoutY(350);
		crabButton.setLayoutX(210);

		// create sirloinButton and set to not visible
		Button sirloinButton = new Button();
		sirloinButton.setText("Sirloin");
		sirloinButton.setVisible(false);
		// Set sirloinButton size
		sirloinButton.setPrefSize(100, 40);
		// Set sirloinButton layout
		sirloinButton.setLayoutY(100);
		sirloinButton.setLayoutX(320);

		// create filejButton and set to not visible
		Button filejButton = new Button();
		filejButton.setText("Filet");
		filejButton.setVisible(false);
		// Set filejButton size
		filejButton.setPrefSize(100, 40);
		// Set filejButton layout
		filejButton.setLayoutY(150);
		filejButton.setLayoutX(320);

		// create tBoneButton and set to not visible
		Button tBoneButton = new Button();
		tBoneButton.setText("T Bone");
		tBoneButton.setVisible(false);
		// Set tBoneButton size
		tBoneButton.setPrefSize(100, 40);
		// Set tBoneButton layout
		tBoneButton.setLayoutY(200);
		tBoneButton.setLayoutX(320);

		// create stripButton and set to not visible
		Button stripButton = new Button();
		stripButton.setText("Strip");
		stripButton.setVisible(false);
		// Set stripButton size
		stripButton.setPrefSize(100, 40);
		// Set stripButton layout
		stripButton.setLayoutY(250);
		stripButton.setLayoutX(320);

		// Create sidesButton & set to not visible
		Button sidesButton = new Button();
		sidesButton.setText("Sides");
		sidesButton.setVisible(false);
		// Set sidesButton size
		sidesButton.setPrefSize(100, 40);
		// Set sidesButton layout
		sidesButton.setLayoutY(250);
		sidesButton.setLayoutX(100);

		// Create mPButton & set to not visible
		Button mPButton = new Button();
		mPButton.setText("Mashed \nPotato");
		mPButton.setVisible(false);
		// Set mPButton size
		mPButton.setPrefSize(100, 40);
		// Set mPButton layout
		mPButton.setLayoutY(100);
		mPButton.setLayoutX(100);

		// Create greenBeansButton & set to not visible
		Button greenBeansButton = new Button();
		greenBeansButton.setText("Green \nBeans");
		greenBeansButton.setVisible(false);
		// Set greenBeansButton size
		greenBeansButton.setPrefSize(100, 40);
		// Set greenBeansButton layout
		greenBeansButton.setLayoutY(150);
		greenBeansButton.setLayoutX(100);

		// Create broccoliButton & set to not visible
		Button broccoliButton = new Button();
		broccoliButton.setText("Broccoli");
		broccoliButton.setVisible(false);
		// Set broccoliButton size
		broccoliButton.setPrefSize(100, 40);
		// Set broccoliButton layout
		broccoliButton.setLayoutY(200);
		broccoliButton.setLayoutX(100);

		// Create sweetPotatoesButton & set to not visible
		Button sweetPotatoesButton = new Button();
		sweetPotatoesButton.setText("Sweet \nPotato");
		sweetPotatoesButton.setVisible(false);
		// Set sweetPotatoesButton size
		sweetPotatoesButton.setPrefSize(100, 40);
		// Set sweetPotatoesButton layout
		sweetPotatoesButton.setLayoutY(250);
		sweetPotatoesButton.setLayoutX(100);

		// Create asparagusButton & set to not visible
		Button asparagusButton = new Button();
		asparagusButton.setText("Asparagus");
		asparagusButton.setVisible(false);
		// Set asparagusButton size
		asparagusButton.setPrefSize(100, 40);
		// Set asparagusButton layout
		asparagusButton.setLayoutY(300);
		asparagusButton.setLayoutX(100);

		// Create desert button & set to not visible
		Button desertButton = new Button();
		desertButton.setText("Desert \nMenu");
		desertButton.setVisible(false);
		// Set size for desertButton
		desertButton.setPrefSize(100, 40);

		// Create sundaeButton & set to not visible
		Button sundaeButton = new Button();
		sundaeButton.setText("Sundae");
		sundaeButton.setVisible(false);
		// Set sundaeButton size
		sundaeButton.setPrefSize(100, 40);
		// Set sundaeButton layout
		sundaeButton.setLayoutY(100);
		sundaeButton.setLayoutX(100);

		// Create cheeseCakeButton & set to not visible
		Button cheeseCakeButton = new Button();
		cheeseCakeButton.setText("Cheese \nCake");
		cheeseCakeButton.setVisible(false);
		// Set cheeseCakeButton size
		cheeseCakeButton.setPrefSize(100, 40);
		// Set cheeseCakeButton layout
		cheeseCakeButton.setLayoutY(150);
		cheeseCakeButton.setLayoutX(100);

		// Create chocCakeButton & set to not visible
		Button chocCakeButton = new Button();
		chocCakeButton.setText("Choc \nCake");
		chocCakeButton.setVisible(false);
		// Set chocCakeButton size
		chocCakeButton.setPrefSize(100, 40);
		// Set chocCakeButton layout
		chocCakeButton.setLayoutY(200);
		chocCakeButton.setLayoutX(100);

		// Create tiramisuButton & set to not visible
		Button tiramisuButton = new Button();
		tiramisuButton.setText("Tiramisu");
		tiramisuButton.setVisible(false);
		// Set tiramisuButton size
		tiramisuButton.setPrefSize(100, 40);
		// Set tiramisuButton layout
		tiramisuButton.setLayoutY(200);
		tiramisuButton.setLayoutX(100);

		// Create cannoliButton & set to not visible
		Button cannoliButton = new Button();
		cannoliButton.setText("Cannoli");
		cannoliButton.setVisible(false);
		// Set cannoliButton size
		cannoliButton.setPrefSize(100, 40);
		// Set cannoliButton layout
		cannoliButton.setLayoutY(250);
		cannoliButton.setLayoutX(100);

		// Create crostataButton & set to not visible
		Button crostataButton = new Button();
		crostataButton.setText("Crostata");
		crostataButton.setVisible(false);
		// Set crostataButton size
		crostataButton.setPrefSize(100, 40);
		// Set crostataButton layout
		crostataButton.setLayoutY(300);
		crostataButton.setLayoutX(100);

		// Set layout for newCheckButton
		openPosButton.setLayoutY(650);
		openPosButton.setLayoutX(100);

		// Set layout for recallCheckButton
		recallCheckButton.setLayoutY(650);
		recallCheckButton.setLayoutX(320);

		// Set layout for leftArrowButton
		leftArrowButton.setLayoutY(700);
		leftArrowButton.setLayoutX(450);

		// Set layout for zeroButton
		zeroButton.setLayoutY(700);
		zeroButton.setLayoutX(505);

		// Set layout for rightArrow
		rightArrowButton.setLayoutY(700);
		rightArrowButton.setLayoutX(560);

		// Set layout for oneButton
		oneButton.setLayoutY(655);
		oneButton.setLayoutX(450);

		// Set layout for twoButton
		twoButton.setLayoutY(655);
		twoButton.setLayoutX(505);

		// Set layout for threeButton
		threeButton.setLayoutY(655);
		threeButton.setLayoutX(560);

		// Set layout for downArrowButton
		downArrowButton.setLayoutY(655);
		downArrowButton.setLayoutX(615);

		// Set layout for fourButton
		fourButton.setLayoutY(610);
		fourButton.setLayoutX(450);

		// Set layout for fiveButton
		fiveButton.setLayoutY(610);
		fiveButton.setLayoutX(505);

		// Set layout for sixButton
		sixButton.setLayoutY(610);
		sixButton.setLayoutX(560);

		// Set layout for backSpaceButton
		backSpaceButton.setLayoutY(610);
		backSpaceButton.setLayoutX(615);

		// Set layout for deleteButton
		deleteButton.setLayoutY(700);
		deleteButton.setLayoutX(615);

		// Set layout for sevenButton
		sevenButton.setLayoutY(565);
		sevenButton.setLayoutX(450);

		// Set layout for eightButton
		eightButton.setLayoutY(565);
		eightButton.setLayoutX(505);

		// Set layout for nineButton
		nineButton.setLayoutY(565);
		nineButton.setLayoutX(560);

		// Set layout for upArrowButton
		upArrowButton.setLayoutY(565);
		upArrowButton.setLayoutX(615);

		// Set layout for table number button
		tableNumberButton.setLayoutY(650);
		tableNumberButton.setLayoutX(100);

		// Set layout for number of guests button
		numberOfGuestsButton.setLayoutY(700);
		numberOfGuestsButton.setLayoutX(100);

		// Set layout for tenderCheckButton
		tenderCheckButton.setLayoutY(700);
		tenderCheckButton.setLayoutX(670);

		// Set layout for clearButton
		clearButton.setLayoutY(565);
		clearButton.setLayoutX(670);

		// Set layout for seat number button
		seatNumberButton.setLayoutY(700);
		seatNumberButton.setLayoutX(210);

		// Set layout for orderTextField
		orderTextArea.setLayoutY(100);
		orderTextArea.setLayoutX(450);

		// Set layout for userInputTextField
		userInputTextField.setLayoutY(505);
		userInputTextField.setLayoutX(450);

		// Set layout for userInputFeedBackField
		userInputFeedBackTextField.setLayoutY(535);
		userInputFeedBackTextField.setLayoutX(450);

		// Set layout for SodaMisc button
		sodaMiscButton.setLayoutY(100);
		sodaMiscButton.setLayoutX(100);

		// Set layout for juiceButton
		juiceButton.setLayoutY(150);
		juiceButton.setLayoutX(100);

		// Set layout for beerButton
		beerButton.setLayoutY(200);
		beerButton.setLayoutX(100);

		// Set layout for wineButton
		wineButton.setLayoutY(250);
		wineButton.setLayoutX(100);

		// Set layout for coffeeButton
		coffeeButton.setLayoutY(300);
		coffeeButton.setLayoutX(100);

		// Set layout for cokeButton
		cokeButton.setLayoutY(100);
		cokeButton.setLayoutX(100);

		// Set layout for spriteButton
		spriteButton.setLayoutY(150);
		spriteButton.setLayoutX(100);

		// Set layout for orangeButton
		orangeButton.setLayoutY(200);
		orangeButton.setLayoutX(100);

		// Set layout for rootBeerButton
		rootBeerButton.setLayoutY(250);
		rootBeerButton.setLayoutX(100);

		// Set layout for dietCokeButton
		dietCokeButton.setLayoutY(300);
		dietCokeButton.setLayoutX(100);

		// Set layout for iceTeaButton
		iceTeaButton.setLayoutY(350);
		iceTeaButton.setLayoutX(100);

		// Set layout for lemonadeButton
		lemonadeButton.setLayoutY(400);
		lemonadeButton.setLayoutX(100);

		// Set layout for coffeeButton
		regCoffeeButton.setLayoutY(100);
		regCoffeeButton.setLayoutX(100);

		// Set layout for decafCoffeeButton
		decafCoffeeButton.setLayoutY(150);
		decafCoffeeButton.setLayoutX(100);

		// Set layout for cappiccinoButton
		cappiccinoButton.setLayoutY(200);
		cappiccinoButton.setLayoutX(100);

		// Set layout for latteButton
		latteButton.setLayoutY(250);
		latteButton.setLayoutX(100);

		// Set layout for espressoButton
		espressoButton.setLayoutY(300);
		espressoButton.setLayoutX(100);

		// Set layout for orangeJuiceButton
		orangeJuiceButton.setLayoutY(100);
		orangeJuiceButton.setLayoutX(100);

		// Set layout for spriteButton
		appleJuiceButton.setLayoutY(150);
		appleJuiceButton.setLayoutX(100);

		// Set layout for orangeButton
		cranberryJuiceButton.setLayoutY(200);
		cranberryJuiceButton.setLayoutX(100);

		// Set layout for rootBeerButton
		pineappleJuiceButton.setLayoutY(250);
		pineappleJuiceButton.setLayoutX(100);

		// Set layout for budButton
		budButton.setLayoutY(100);
		budButton.setLayoutX(100);

		// Set layout for heinekenButton
		heinekenButton.setLayoutY(150);
		heinekenButton.setLayoutX(100);

		// Set layout for coronaButton
		coronaButton.setLayoutY(200);
		coronaButton.setLayoutX(100);

		// Set layout for chimayButton
		chimayButton.setLayoutY(250);
		chimayButton.setLayoutX(100);

		// Set layout for sweetWaterButton
		sweetWaterButton.setLayoutY(300);
		sweetWaterButton.setLayoutX(100);

		// Set layout for maduroButton
		maduroButton.setLayoutY(100);
		maduroButton.setLayoutX(210);

		// Set layout for samAdamsButton
		samAdamsButton.setLayoutY(150);
		samAdamsButton.setLayoutX(210);

		// Set layout for killiansButton
		killiansButton.setLayoutY(200);
		killiansButton.setLayoutX(210);

		// Set layout for twoHeartedButton
		twoHeartedButton.setLayoutY(250);
		twoHeartedButton.setLayoutX(210);

		// Set layout for bigRedButton
		bigRedButton.setLayoutY(100);
		bigRedButton.setLayoutX(100);

		// Set layout for merlButton
		merlButton.setLayoutY(150);
		merlButton.setLayoutX(100);

		// Set layout for softWaveButton
		softWaveButton.setLayoutY(200);
		softWaveButton.setLayoutX(100);

		// Set layout for swirlButton
		swirlButton.setLayoutY(250);
		swirlButton.setLayoutX(210);

		// Set layout for shoreButton
		shoreButton.setLayoutY(200);
		shoreButton.setLayoutX(210);

		// Set layout for horizonButton
		horizonButton.setLayoutY(150);
		horizonButton.setLayoutX(210);

		// Set layout for bigCapButton
		bigCapButton.setLayoutY(250);
		bigCapButton.setLayoutX(100);

		// Set layout for curlButton
		curlButton.setLayoutY(300);
		curlButton.setLayoutX(100);

		// Set layout for sunriseButton
		sunriseButton.setLayoutY(100);
		sunriseButton.setLayoutX(210);

		// Set layout for drinksButton
		drinkButton.setLayoutY(100);
		drinkButton.setLayoutX(100);

		// Set layout for appetizer button
		appetizerButton.setLayoutY(150);
		appetizerButton.setLayoutX(100);

		// Set layout for entreeButton
		entreeButton.setLayoutY(200);
		entreeButton.setLayoutX(100);

		// Set layout for desertButton
		desertButton.setLayoutY(300);
		desertButton.setLayoutX(100);

		// Set size for leftArrowButton
		leftArrowButton.setPrefSize(50, 40);

		// Set size for rightArrowButton
		rightArrowButton.setPrefSize(50, 40);

		// Set size for upButton
		upArrowButton.setPrefSize(50, 40);

		// Set size for downArrowButton
		downArrowButton.setPrefSize(50, 40);

		// Set size for backSpaceButton
		backSpaceButton.setPrefSize(50, 40);

		// Set size for deleteButton
		deleteButton.setPrefSize(50, 40);

		// Set size for sevenButton
		sevenButton.setPrefSize(50, 40);

		// Set size for eightButton
		eightButton.setPrefSize(50, 40);

		// Set size for nineButton
		nineButton.setPrefSize(50, 40);

		// Set size for fourButton
		fourButton.setPrefSize(50, 40);

		// Set size for fiveButton
		fiveButton.setPrefSize(50, 40);

		// Set size for sixButton
		sixButton.setPrefSize(50, 40);

		// Set size for oneButton
		oneButton.setPrefSize(50, 40);

		// Set size for twoButton
		twoButton.setPrefSize(50, 40);

		// Set size for threeButton
		threeButton.setPrefSize(50, 40);

		// Set size for zeroButton
		zeroButton.setPrefSize(50, 40);

		// Set size for table numberButton
		tableNumberButton.setPrefSize(100, 40);

		// Set size for number of guests button
		numberOfGuestsButton.setPrefSize(100, 40);

		// Set size for tenderCheckButton
		tenderCheckButton.setPrefSize(100, 40);

		// Set size for clearButton
		clearButton.setPrefSize(100, 40);

		// Set size for seat number button
		seatNumberButton.setPrefSize(100, 40);

		// Set size for recall check button
		recallCheckButton.setPrefSize(100, 40);

		// Set size for orderTextField
		orderTextArea.setPrefSize(325, 400);

		// Set size for userInputTextField
		userInputTextField.setPrefSize(325, 25);

		// Set size for userInputFeedBackTextField
		userInputFeedBackTextField.setPrefSize(325, 25);

		// Set size for drinksButton
		drinkButton.setPrefSize(100, 40);

		// Set size for sodaMiscButton
		sodaMiscButton.setPrefSize(100, 40);

		// Set size for juiceButton
		juiceButton.setPrefSize(100, 40);

		// Set size for beerButton
		beerButton.setPrefSize(100, 40);

		// Set size for wineButton
		wineButton.setPrefSize(100, 40);

		// Set size for coffeeButton
		coffeeButton.setPrefSize(100, 40);

		// Set size for cokeButton
		cokeButton.setPrefSize(100, 40);

		// Set size for spriteButton
		spriteButton.setPrefSize(100, 40);

		// Set size for orangeButton
		orangeButton.setPrefSize(100, 40);

		// Set size for rootBeerButton
		rootBeerButton.setPrefSize(100, 40);

		// Set size for dietCokeButton
		dietCokeButton.setPrefSize(100, 40);

		// Set size for iceTeaButton
		iceTeaButton.setPrefSize(100, 40);

		// Set size for lemonadeButton
		lemonadeButton.setPrefSize(100, 40);

		// Set size for coffeeButton
		regCoffeeButton.setPrefSize(100, 40);

		// Set size for decafCoffeeButton
		decafCoffeeButton.setPrefSize(100, 40);

		// Set size for cappiccinoButton
		cappiccinoButton.setPrefSize(100, 40);

		// Set size for latteButton
		latteButton.setPrefSize(100, 40);

		// Set size for espressoButton
		espressoButton.setPrefSize(100, 40);

		// Set size for orangeJuiceButton
		orangeJuiceButton.setPrefSize(100, 40);

		// Set size for appleJuiceButton
		appleJuiceButton.setPrefSize(100, 40);

		// Set size for cranberryJuiceButton
		cranberryJuiceButton.setPrefSize(100, 40);

		// Set size for pineappleJuiceButton
		pineappleJuiceButton.setPrefSize(100, 40);

		// Set size for budButton
		budButton.setPrefSize(100, 40);

		// Set size for heinekenButton
		heinekenButton.setPrefSize(100, 40);

		// Set size for coronaButton
		coronaButton.setPrefSize(100, 40);

		// Set size for chimayButton
		chimayButton.setPrefSize(100, 40);

		// Set size for sweetWaterButton
		sweetWaterButton.setPrefSize(100, 40);

		// Set size for maduroButton
		maduroButton.setPrefSize(100, 40);

		// Set size for samAdamsButton
		samAdamsButton.setPrefSize(100, 40);

		// Set size for killiansButton
		killiansButton.setPrefSize(100, 40);

		// Set size for twoHeartedButton
		twoHeartedButton.setPrefSize(100, 40);

		// Set size for bigRedButton
		bigRedButton.setPrefSize(100, 40);

		// Set size for merlButton
		merlButton.setPrefSize(100, 40);

		// Set size for softWaveButton
		softWaveButton.setPrefSize(100, 40);

		// Set size for swirlButton
		swirlButton.setPrefSize(100, 40);

		// Set size for shoreButton
		shoreButton.setPrefSize(100, 40);

		// Set size for horizonButton
		horizonButton.setPrefSize(100, 40);

		// Set size for bigCapButton
		bigCapButton.setPrefSize(100, 40);

		// Set size for curlButton
		curlButton.setPrefSize(100, 40);

		// Set size for sunriseButton
		sunriseButton.setPrefSize(100, 40);

		// Set size for appetizerButton
		appetizerButton.setPrefSize(100, 40);

		// Add buttons to scene
		root.getChildren().addAll(openPosButton, leftArrowButton, rightArrowButton, decimalButton, downArrowButton,
				upArrowButton, deleteButton, backSpaceButton, cashButton, preAuthButton, creditButton, VisaButton,
				MasterCardButton, DiscoverButton, AmericanExpressButton, sevenButton, eightButton, nineButton,
				fourButton, fiveButton, sixButton, oneButton, twoButton, threeButton, zeroButton, tableNumberButton,
				numberOfGuestsButton, sendCheckButton, tenderCheckButton, clearButton, newOrderButton, nextOrderButton,
				prevOrderButton, seatNumberButton, recallCheckButton, prevScreenHomeButton, prevScreenMenuButton,
				prevScreenDrinksButton, prevScreenCashCreditButton, balanceCheckButton, printCheckButton, orderTextArea,
				userInputTextField, userInputFeedBackTextField, orderNumberTextField, drinkButton, sodaMiscButton,
				spriteButton, orangeButton, rootBeerButton, dietCokeButton, iceTeaButton, lemonadeButton,
				regCoffeeButton, decafCoffeeButton, cappiccinoButton, latteButton, espressoButton, orangeJuiceButton,
				appleJuiceButton, cranberryJuiceButton, pineappleJuiceButton, scampiButton, bruschettaButton,
				crabCakesButton, musclesButton, coconutShrimpButton, calamariButton, seafoodAlfredoButton,
				scampiLinguiniButton, lobsterMacButton, salmonButton, mahiButton, troutButton, tunaButton, oysterButton,
				lobsterButton, crabButton, sirloinButton, filejButton, tBoneButton, stripButton, sidesButton, mPButton,
				greenBeansButton, broccoliButton, sweetPotatoesButton, asparagusButton, sundaeButton, cheeseCakeButton,
				chocCakeButton, tiramisuButton, cannoliButton, crostataButton, heinekenButton, budButton, coronaButton,
				chimayButton, sweetWaterButton, maduroButton, samAdamsButton, killiansButton, twoHeartedButton,
				juiceButton, bigRedButton, merlButton, softWaveButton, swirlButton, shoreButton, horizonButton,
				bigCapButton, curlButton, sunriseButton, beerButton, wineButton, coffeeButton, cokeButton,
				appetizerButton, entreeButton, desertButton);

		// Place the scene in the stage
		primaryStage.setScene(new Scene(root, 800, 800));

		// Set the stage title
		primaryStage.setTitle("Point Of Sale (POS)");

		// Display the stage
		primaryStage.show();

		// Set action for openPosButton
		openPosButton.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				recallCheckButton.setVisible(true);
				openPosButton.setVisible(false);
				tableNumberButton.setVisible(true);
				numberOfGuestsButton.setVisible(true);
				sendCheckButton.setVisible(true);
				seatNumberButton.setVisible(true);
				tenderCheckButton.setVisible(true);
				orderTextArea.setVisible(true);
				orderNumberTextField.setVisible(true);
				userInputTextField.setVisible(true);
				userInputFeedBackTextField.setVisible(true);
				sevenButton.setVisible(true);
				eightButton.setVisible(true);
				nineButton.setVisible(true);
				fourButton.setVisible(true);
				fiveButton.setVisible(true);
				sixButton.setVisible(true);
				oneButton.setVisible(true);
				twoButton.setVisible(true);
				threeButton.setVisible(true);
				zeroButton.setVisible(true);
				leftArrowButton.setVisible(true);
				rightArrowButton.setVisible(true);
				upArrowButton.setVisible(true);
				downArrowButton.setVisible(true);
				deleteButton.setVisible(true);
				backSpaceButton.setVisible(true);
				clearButton.setVisible(true);
				userInputTextField.setText("Enter Table Number");
				drinkButton.setVisible(true);
				appetizerButton.setVisible(true);
				entreeButton.setVisible(true);
				sidesButton.setVisible(true);
				desertButton.setVisible(true);
				prevOrderButton.setVisible(true);
				nextOrderButton.setVisible(true);
				balanceCheckButton.setVisible(true);
				prevScreenHomeButton.setVisible(true);
				newOrderButton.setVisible(true);
				openPosButton.setVisible(false);
				printCheckButton.setVisible(true);
				imageView.setVisible(false);
				decimalButton.setVisible(true);

			}
		});

		// Set action for prevHomeButton
		prevScreenHomeButton.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {

				openPosButton.setVisible(true);
				recallCheckButton.setVisible(false);
				orderTextArea.setVisible(false);
				userInputTextField.setVisible(false);
				userInputFeedBackTextField.setVisible(false);
				tenderCheckButton.setVisible(false);
				sevenButton.setVisible(false);
				eightButton.setVisible(false);
				nineButton.setVisible(false);
				fourButton.setVisible(false);
				fiveButton.setVisible(false);
				sixButton.setVisible(false);
				oneButton.setVisible(false);
				twoButton.setVisible(false);
				threeButton.setVisible(false);
				zeroButton.setVisible(false);
				leftArrowButton.setVisible(false);
				rightArrowButton.setVisible(false);
				upArrowButton.setVisible(false);
				downArrowButton.setVisible(false);
				deleteButton.setVisible(false);
				backSpaceButton.setVisible(false);
				clearButton.setVisible(false);
				drinkButton.setVisible(false);
				appetizerButton.setVisible(false);
				entreeButton.setVisible(false);
				sidesButton.setVisible(false);
				desertButton.setVisible(false);
				tableNumberButton.setVisible(false);
				numberOfGuestsButton.setVisible(false);
				seatNumberButton.setVisible(false);
				sendCheckButton.setVisible(false);
				balanceCheckButton.setVisible(false);
				prevOrderButton.setVisible(false);
				nextOrderButton.setVisible(false);
				prevScreenHomeButton.setVisible(false);
				newOrderButton.setVisible(false);
				orderNumberTextField.setVisible(false);
				printCheckButton.setVisible(false);
				imageView.setVisible(true);
				cashButton.setVisible(false);
				creditButton.setVisible(false);
				preAuthButton.setVisible(false);
				VisaButton.setVisible(false);
				AmericanExpressButton.setVisible(false);
				DiscoverButton.setVisible(false);
				MasterCardButton.setVisible(false);
				decimalButton.setVisible(false);
			}
		});

		// Set action for prevScreenMenuButton
		prevScreenMenuButton.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				drinkButton.setVisible(true);
				appetizerButton.setVisible(true);
				entreeButton.setVisible(true);
				desertButton.setVisible(true);
				tenderCheckButton.setVisible(true);
				sodaMiscButton.setVisible(false);
				juiceButton.setVisible(false);
				beerButton.setVisible(false);
				wineButton.setVisible(false);
				coffeeButton.setVisible(false);
				cokeButton.setVisible(false);
				spriteButton.setVisible(false);
				orangeButton.setVisible(false);
				rootBeerButton.setVisible(false);
				dietCokeButton.setVisible(false);
				iceTeaButton.setVisible(false);
				lemonadeButton.setVisible(false);
				regCoffeeButton.setVisible(false);
				decafCoffeeButton.setVisible(false);
				cappiccinoButton.setVisible(false);
				latteButton.setVisible(false);
				espressoButton.setVisible(false);
				budButton.setVisible(false);
				heinekenButton.setVisible(false);
				coronaButton.setVisible(false);
				chimayButton.setVisible(false);
				sweetWaterButton.setVisible(false);
				maduroButton.setVisible(false);
				samAdamsButton.setVisible(false);
				killiansButton.setVisible(false);
				twoHeartedButton.setVisible(false);
				bigRedButton.setVisible(false);
				merlButton.setVisible(false);
				softWaveButton.setVisible(false);
				swirlButton.setVisible(false);
				shoreButton.setVisible(false);
				horizonButton.setVisible(false);
				bigCapButton.setVisible(false);
				curlButton.setVisible(false);
				sunriseButton.setVisible(false);
				orangeJuiceButton.setVisible(false);
				appleJuiceButton.setVisible(false);
				cranberryJuiceButton.setVisible(false);
				pineappleJuiceButton.setVisible(false);
				prevScreenDrinksButton.setVisible(false);
				musclesButton.setVisible(false);
				calamariButton.setVisible(false);
				coconutShrimpButton.setVisible(false);
				crabCakesButton.setVisible(false);
				scampiButton.setVisible(false);
				bruschettaButton.setVisible(false);
				seafoodAlfredoButton.setVisible(false);
				scampiLinguiniButton.setVisible(false);
				lobsterMacButton.setVisible(false);
				salmonButton.setVisible(false);
				mahiButton.setVisible(false);
				troutButton.setVisible(false);
				tunaButton.setVisible(false);
				oysterButton.setVisible(false);
				lobsterButton.setVisible(false);
				crabButton.setVisible(false);
				sirloinButton.setVisible(false);
				filejButton.setVisible(false);
				tBoneButton.setVisible(false);
				stripButton.setVisible(false);
				sidesButton.setVisible(true);
				mPButton.setVisible(false);
				greenBeansButton.setVisible(false);
				broccoliButton.setVisible(false);
				sweetPotatoesButton.setVisible(false);
				asparagusButton.setVisible(false);
				sundaeButton.setVisible(false);
				cheeseCakeButton.setVisible(false);
				chocCakeButton.setVisible(false);
				tiramisuButton.setVisible(false);
				cannoliButton.setVisible(false);
				crostataButton.setVisible(false);
				prevScreenMenuButton.setVisible(false);
				prevScreenHomeButton.setVisible(true);
				tableNumberButton.setVisible(true);
				numberOfGuestsButton.setVisible(true);
				seatNumberButton.setVisible(true);
				sendCheckButton.setVisible(true);
				balanceCheckButton.setVisible(true);
				nextOrderButton.setVisible(true);
				prevOrderButton.setVisible(true);
				newOrderButton.setVisible(true);
				orderNumberTextField.setVisible(true);
				printCheckButton.setVisible(true);
				recallCheckButton.setVisible(true);
				cashButton.setVisible(false);
				creditButton.setVisible(false);
				userInputTextField.setText("");
			}
		});

		// Set action for prevScreenDrinksButton
		prevScreenDrinksButton.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				drinkButton.setVisible(false);
				appetizerButton.setVisible(false);
				entreeButton.setVisible(false);
				desertButton.setVisible(false);
				tenderCheckButton.setVisible(true);
				sodaMiscButton.setVisible(true);
				juiceButton.setVisible(true);
				beerButton.setVisible(true);
				wineButton.setVisible(true);
				coffeeButton.setVisible(true);
				cokeButton.setVisible(false);
				spriteButton.setVisible(false);
				orangeButton.setVisible(false);
				rootBeerButton.setVisible(false);
				dietCokeButton.setVisible(false);
				iceTeaButton.setVisible(false);
				lemonadeButton.setVisible(false);
				regCoffeeButton.setVisible(false);
				decafCoffeeButton.setVisible(false);
				cappiccinoButton.setVisible(false);
				latteButton.setVisible(false);
				espressoButton.setVisible(false);
				budButton.setVisible(false);
				heinekenButton.setVisible(false);
				coronaButton.setVisible(false);
				chimayButton.setVisible(false);
				sweetWaterButton.setVisible(false);
				maduroButton.setVisible(false);
				samAdamsButton.setVisible(false);
				killiansButton.setVisible(false);
				twoHeartedButton.setVisible(false);
				bigRedButton.setVisible(false);
				merlButton.setVisible(false);
				softWaveButton.setVisible(false);
				swirlButton.setVisible(false);
				shoreButton.setVisible(false);
				horizonButton.setVisible(false);
				bigCapButton.setVisible(false);
				curlButton.setVisible(false);
				sunriseButton.setVisible(false);
				orangeJuiceButton.setVisible(false);
				appleJuiceButton.setVisible(false);
				cranberryJuiceButton.setVisible(false);
				pineappleJuiceButton.setVisible(false);
				prevScreenDrinksButton.setVisible(false);
				prevScreenMenuButton.setVisible(true);
			}
		});

		// Set action for prevScreenCashCreditButton
		prevScreenCashCreditButton.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				cashButton.setVisible(true);
				creditButton.setVisible(true);
				printCheckButton.setVisible(true);
				VisaButton.setVisible(false);
				AmericanExpressButton.setVisible(false);
				MasterCardButton.setVisible(false);
				DiscoverButton.setVisible(false);
				preAuthButton.setVisible(false);
				prevScreenCashCreditButton.setVisible(false);
				prevScreenMenuButton.setVisible(true);
				userInputTextField.setText("Enter Cash Amount / Hit Cash or Press Credit");

			}
		});

		// Set action for tenderCheckButton
		tenderCheckButton.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				openPosButton.setVisible(false);
				recallCheckButton.setVisible(false);
				orderTextArea.setVisible(true);
				userInputTextField.setVisible(true);
				userInputFeedBackTextField.setVisible(true);
				tenderCheckButton.setVisible(true);
				sevenButton.setVisible(true);
				eightButton.setVisible(true);
				nineButton.setVisible(true);
				fourButton.setVisible(true);
				fiveButton.setVisible(true);
				sixButton.setVisible(true);
				oneButton.setVisible(true);
				twoButton.setVisible(true);
				threeButton.setVisible(true);
				zeroButton.setVisible(true);
				leftArrowButton.setVisible(true);
				rightArrowButton.setVisible(true);
				upArrowButton.setVisible(true);
				downArrowButton.setVisible(true);
				deleteButton.setVisible(true);
				backSpaceButton.setVisible(true);
				clearButton.setVisible(true);
				drinkButton.setVisible(false);
				sodaMiscButton.setVisible(false);
				cokeButton.setVisible(false);
				spriteButton.setVisible(false);
				orangeButton.setVisible(false);
				rootBeerButton.setVisible(false);
				dietCokeButton.setVisible(false);
				iceTeaButton.setVisible(false);
				lemonadeButton.setVisible(false);
				juiceButton.setVisible(false);
				beerButton.setVisible(false);
				wineButton.setVisible(false);
				coffeeButton.setVisible(false);
				appetizerButton.setVisible(false);
				musclesButton.setVisible(false);
				calamariButton.setVisible(false);
				coconutShrimpButton.setVisible(false);
				crabCakesButton.setVisible(false);
				scampiButton.setVisible(false);
				bruschettaButton.setVisible(false);
				seafoodAlfredoButton.setVisible(false);
				scampiLinguiniButton.setVisible(false);
				lobsterMacButton.setVisible(false);
				salmonButton.setVisible(false);
				mahiButton.setVisible(false);
				troutButton.setVisible(false);
				tunaButton.setVisible(false);
				oysterButton.setVisible(false);
				lobsterButton.setVisible(false);
				crabButton.setVisible(false);
				sirloinButton.setVisible(false);
				filejButton.setVisible(false);
				tBoneButton.setVisible(false);
				stripButton.setVisible(false);
				sidesButton.setVisible(true);
				mPButton.setVisible(false);
				greenBeansButton.setVisible(false);
				broccoliButton.setVisible(false);
				sweetPotatoesButton.setVisible(false);
				asparagusButton.setVisible(false);
				sundaeButton.setVisible(false);
				cheeseCakeButton.setVisible(false);
				chocCakeButton.setVisible(false);
				tiramisuButton.setVisible(false);
				cannoliButton.setVisible(false);
				crostataButton.setVisible(false);
				entreeButton.setVisible(false);
				sidesButton.setVisible(false);
				desertButton.setVisible(false);
				tableNumberButton.setVisible(false);
				numberOfGuestsButton.setVisible(false);
				seatNumberButton.setVisible(false);
				sendCheckButton.setVisible(false);
				balanceCheckButton.setVisible(false);
				nextOrderButton.setVisible(false);
				prevScreenMenuButton.setVisible(true);
				prevScreenDrinksButton.setVisible(false);
				prevOrderButton.setVisible(false);
				newOrderButton.setVisible(false);
				orderNumberTextField.setVisible(false);
				printCheckButton.setVisible(true);
				cashButton.setVisible(true);
				creditButton.setVisible(true);
				userInputTextField.setText("Enter Cash Amount / Hit Cash or Press Credit");
				prevScreenHomeButton.setVisible(false);
			}
		});

		// Set action for cashButton
		cashButton.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				double orderSubTotal = POSNewGuestOrder.orders.get(orderIndex).getOrderTotal();
				double totalTax = 0.0;
				totalTax = (orderSubTotal * .07);
				Double orderTotalWithTax = orderSubTotal + totalTax;

				double amountDue = 0.0;
				amountDue = orderTotalWithTax;
				double amountTendered = 0.0;

				amountTendered = Double.parseDouble(concatUserInputAsString);

				double amountChange = amountDue - amountTendered;

				POSOrderTextArea.appendText(String.format("CASH: $%.2f%n", amountTendered));
				if (amountChange >= 0) {
					POSOrderTextArea.appendText(String.format("\nAMOUNT DUE:  $%.2f%n", amountChange));
				} else if (amountChange <= 0) {
					POSOrderTextArea.appendText(String.format("\nAMOUNT CHANGE:  $%.2f%n", amountChange));
				}
			}
		});

		// Set action for creditButton
		creditButton.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				VisaButton.setVisible(true);
				MasterCardButton.setVisible(true);
				AmericanExpressButton.setVisible(true);
				DiscoverButton.setVisible(true);
				cashButton.setVisible(false);
				creditButton.setVisible(false);
				printCheckButton.setVisible(false);
				prevScreenHomeButton.setVisible(false);
				prevScreenCashCreditButton.setVisible(true);
				userInputTextField.setText("Enter Card Type");
			}
		});

		// Set action for VisaButton
		VisaButton.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				preAuthButton.setVisible(true);
				userInputTextField.setText("Visa");

			}
		});

		// Set action for MasterCardButton
		MasterCardButton.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				preAuthButton.setVisible(true);
				userInputTextField.setText("Master Card");

			}
		});

		// Set action for DiscoverButton
		DiscoverButton.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				preAuthButton.setVisible(true);
				userInputTextField.setText("Discover");
			}
		});

		// Set action for AmericanExpressButton
		AmericanExpressButton.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				preAuthButton.setVisible(true);
				userInputTextField.setText("American Express");
			}
		});

		// Set action for preAuthButton
		preAuthButton.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				preAuthButton.setVisible(true);
				userInputTextField.setText("Swip Card");
			}
		});

		// Set action for newOrderButton
		newOrderButton.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				// Clear order total
				myOrderTotal = 0.0;
				orderIndex++;
				orderNumberTextFieldIndex = orderIndex;
				seatNumberIndex = 99;

				// Create new order
				POSCustomerOrder myOrder = new POSCustomerOrder();

				// Set Customer Check to orderNumberInt value
				myOrder.setCustomerCheck(orderIndex + 1);

				// Add myOrder to POSCustomerOrders Array List
				POSCustomerOrders.add(myOrder);

				orderTextArea.setText("");
				String orderIndexString = Integer.toString(orderIndex + 1);
				orderNumberTextField.setText(orderIndexString);

				userInputTextField.setText("Enter table number");

			}
		});

		// Set action for prevOrderButton
		prevOrderButton.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				orderTextArea.setText("");

				orderNumberTextFieldIndex--;

				orderTextArea.setText(POSCustomerOrders.get(orderNumberTextFieldIndex).toString());

				int newTextField = orderNumberTextFieldIndex + 1;

				String orderNumber = Integer.toString(newTextField);
				orderNumberTextField.setText(orderNumber);

			}
		});

		// Set action for nextOrderButton
		nextOrderButton.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				orderTextArea.setText("");

				orderNumberTextFieldIndex++;

				orderTextArea.setText(POSNewGuestOrder.orders.get(orderNumberTextFieldIndex).toString());
			    POSNewGuestOrder.orders.get(orderNumberTextFieldIndex).getTableNumber();

				int newTextField = orderNumberTextFieldIndex + 1;

				String orderNumber = Integer.toString(newTextField);
				orderNumberTextField.setText(orderNumber);
			}
		});

		// Set action for tableNumberButton
		tableNumberButton.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				userInputTextField.setText("Enter Number of Guests");
				userInputFeedBackTextField.setText("");

				// Assign concatUserInputAsString to table number
				tableNumber = concatUserInputAsString;

				tableNumberInt = Integer.parseInt(tableNumber);

				// Clear concatUserInputAsString value
				concatUserInputAsString = "";

				try {
					// Create new text file
					BufferedWriter out = new BufferedWriter(new FileWriter("Table#" + tableNumber + ".txt"));
					// Write to text file
					out.write("TABLE# " + tableNumber);
					out.close();

					// Read Table # Text File
					BufferedReader in = new BufferedReader(new FileReader("Table#" + tableNumber + ".txt"));

					while ((str = in.readLine()) != null) {

						// Add text for TextArea
						orderTextArea.setText("CHECK #: " + (orderIndex + 1) + "  " + "TABLE #: " + tableNumber);

					}
					in.close();
				} catch (IOException e) {
					System.out.println("exception occurred" + e);
				}

			}
		});

		// Set action for numberOfGuestsButton
		numberOfGuestsButton.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {

				userInputTextField.setText("Enter Seat Number");
				userInputFeedBackTextField.setText("");

				numberOfGuests = concatUserInputAsString;

				// Clear concatUserInputAsString value
				concatUserInputAsString = "";

				try (FileWriter fw = new FileWriter("Table#" + tableNumber + ".txt", true);
						BufferedWriter bw = new BufferedWriter(fw);
						PrintWriter out = new PrintWriter(bw)) {

					{

					}
					// Append guest count to text file
					out.println("  GUEST COUNT: " + numberOfGuests);
				} catch (IOException e) {
					// exception handling left as an exercise for the reader
				}

				// Add number of guests text for TextArea
				orderTextArea.setText("CHECK #: " + (orderIndex + 1) + "  TABLE #: " + tableNumber + "  GUEST COUNT: "
						+ numberOfGuests + "\n************************************************");
			}
		});

		// Set action for sendCheckButton
		sendCheckButton.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {

				getServiceTotal();
				userInputTextField.setText("Print / Tender Check");

			}
		});

		// Set action for seatNumberButton
		seatNumberButton.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				userInputTextField.setText("Enter Seat Number");
				userInputFeedBackTextField.setText("");

				seatNumber = concatUserInputAsString;

				seatNumberIndex = Integer.parseInt(seatNumber);

				// Clear concatUserInputAsString value
				concatUserInputAsString = "";

				// Add seat number text for TextArea
				orderTextArea.appendText("\n\nSEAT #: " + seatNumber);

				// Add prompt to userInputField
				userInputTextField.setText("Enter Order Item");

				try (FileWriter fw = new FileWriter("Table#" + tableNumber + ".txt", true);
						BufferedWriter bw = new BufferedWriter(fw);
						PrintWriter out = new PrintWriter(bw)) {

					{

					}
					// Append blank line
					out.println("");
					// Append seat number to text file
					out.println("SEAT #: " + seatNumber);
				} catch (IOException e) {

				}
			}
		});

		// Set action for sevenButton
		sevenButton.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				userInput = 7;
				concatUserInputAsString = concatUserInputAsString + userInput;
				String userInputAsString = Integer.toString(userInput);
				String ConcatUserInputAsString = concatUserInputAsString + userInputAsString;

				userInputFeedBackTextField.setText(concatUserInputAsString);
			}
		});

		// Set action for eightButton
		eightButton.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				userInput = 8;
				concatUserInputAsString = concatUserInputAsString + userInput;
				String userInputAsString = Integer.toString(userInput);
				String ConcatUserInputAsString = concatUserInputAsString + userInputAsString;

				userInputFeedBackTextField.setText(concatUserInputAsString);
			}
		});

		// Set action for nineButton
		nineButton.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				userInput = 9;
				concatUserInputAsString = concatUserInputAsString + userInput;
				String userInputAsString = Integer.toString(userInput);
				String ConcatUserInputAsString = concatUserInputAsString + userInputAsString;

				userInputFeedBackTextField.setText(concatUserInputAsString);
			}
		});

		// Set action fourButton
		fourButton.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				userInput = 4;
				concatUserInputAsString = concatUserInputAsString + userInput;
				String userInputAsString = Integer.toString(userInput);
				String ConcatUserInputAsString = concatUserInputAsString + userInputAsString;

				userInputFeedBackTextField.setText(concatUserInputAsString);
			}
		});

		// Set action for fiveButton
		fiveButton.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				userInput = 5;
				concatUserInputAsString = concatUserInputAsString + userInput;
				String userInputAsString = Integer.toString(userInput);
				String ConcatUserInputAsString = concatUserInputAsString + userInputAsString;

				userInputFeedBackTextField.setText(concatUserInputAsString);
			}
		});

		// Set action for sixButton
		sixButton.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				userInput = 6;
				concatUserInputAsString = concatUserInputAsString + userInput;
				String userInputAsString = Integer.toString(userInput);
				String ConcatUserInputAsString = concatUserInputAsString + userInputAsString;

				userInputFeedBackTextField.setText(concatUserInputAsString);
			}
		});

		// Set action for oneButton
		oneButton.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				userInput = 1;
				myEvent = event;
				concatUserInputAsString = concatUserInputAsString + userInput;
				String userInputAsString = Integer.toString(userInput);
				String ConcatUserInputAsString = concatUserInputAsString + userInputAsString + "\n";

				userInputFeedBackTextField.setText(concatUserInputAsString);
			}
		});

		// Set action for twoButton
		twoButton.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				userInput = 2;
				concatUserInputAsString = concatUserInputAsString + userInput;
				String userInputAsString = Integer.toString(userInput);
				String ConcatUserInputAsString = concatUserInputAsString + userInputAsString;

				userInputFeedBackTextField.setText(concatUserInputAsString);
			}
		});

		// Set action for threeButton
		threeButton.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				userInput = 3;
				concatUserInputAsString = concatUserInputAsString + userInput;
				String userInputAsString = Integer.toString(userInput);
				String ConcatUserInputAsString = concatUserInputAsString + userInputAsString;

				userInputFeedBackTextField.setText(concatUserInputAsString);
			}
		});

		// Set action for zeroButton
		zeroButton.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				userInput = 0;
				concatUserInputAsString = concatUserInputAsString + userInput;
				String userInputAsString = Integer.toString(userInput);
				String ConcatUserInputAsString = concatUserInputAsString + userInputAsString;

				userInputFeedBackTextField.setText(concatUserInputAsString);
			}
		});

		// Set action for decimalButton
		decimalButton.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				String userInput = ".";
				concatUserInputAsString = concatUserInputAsString + userInput;
				String userInputAsString = userInput;
				String ConcatUserInputAsString = concatUserInputAsString + userInputAsString;
				userInputFeedBackTextField.setText(concatUserInputAsString);
			}
		});

		// Set action for clearButton
		clearButton.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				concatUserInputAsString = "";
				userInputFeedBackTextField.setText("");
			}
		});

		// Set action for recall check button
		recallCheckButton.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
			}
		});

		// Set action for printCheckButton
		printCheckButton.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {

				printCheckMethod();
			}
		});

		// Set action for drink button
		drinkButton.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				appetizerButton.setVisible(false);
				entreeButton.setVisible(false);
				desertButton.setVisible(false);
				drinkButton.setVisible(false);
				sodaMiscButton.setVisible(true);
				juiceButton.setVisible(true);
				beerButton.setVisible(true);
				wineButton.setVisible(true);
				coffeeButton.setVisible(true);
				prevScreenMenuButton.setVisible(true);
				// Add prompt to userInputField
				userInputTextField.setText("Enter Order Item");
			}
		});

		// Set action for soda/MiscButton
		sodaMiscButton.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				sodaMiscButton.setVisible(false);
				juiceButton.setVisible(false);
				beerButton.setVisible(false);
				wineButton.setVisible(false);
				coffeeButton.setVisible(false);
				cokeButton.setVisible(true);
				spriteButton.setVisible(true);
				orangeButton.setVisible(true);
				rootBeerButton.setVisible(true);
				dietCokeButton.setVisible(true);
				iceTeaButton.setVisible(true);
				lemonadeButton.setVisible(true);
				regCoffeeButton.setVisible(false);
				decafCoffeeButton.setVisible(false);
				cappiccinoButton.setVisible(false);
				latteButton.setVisible(false);
				espressoButton.setVisible(false);
				sidesButton.setVisible(false);
				prevScreenDrinksButton.setVisible(true);
			}
		});

		// Set action for cokeButton
		cokeButton.setOnAction(new EventHandler<ActionEvent>() {
			@SuppressWarnings("unchecked")
			public void handle(ActionEvent event) {

				getOrderTotal(event);
				BindOrder(event);

			}
		});

		// Set action for spriteButton
		spriteButton.setOnAction(new EventHandler<ActionEvent>() {
			@SuppressWarnings("unchecked")
			public void handle(ActionEvent event) {

				getOrderTotal(event);
				BindOrder(event);
			}
		});

		// Set action for orangeButton
		orangeButton.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {

				BindOrder(event);
				getOrderTotal(event);

			}
		});

		// Set action for rootBeerButton
		rootBeerButton.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {

				BindOrder(event);
				getOrderTotal(event);

			}
		});

		// Set action for dietCokeButton
		dietCokeButton.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {

				BindOrder(event);
				getOrderTotal(event);

			}
		});

		// Set action for iceTeaButton
		iceTeaButton.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {

				BindOrder(event);
				getOrderTotal(event);

			}
		});

		// Set action for lemonadeButton
		lemonadeButton.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {

				BindOrder(event);
				getOrderTotal(event);

			}
		});

		// Set action for coffeeButton
		coffeeButton.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				sodaMiscButton.setVisible(false);
				juiceButton.setVisible(false);
				beerButton.setVisible(false);
				wineButton.setVisible(false);
				coffeeButton.setVisible(false);
				cokeButton.setVisible(false);
				spriteButton.setVisible(false);
				orangeButton.setVisible(false);
				rootBeerButton.setVisible(false);
				dietCokeButton.setVisible(false);
				iceTeaButton.setVisible(false);
				lemonadeButton.setVisible(false);
				regCoffeeButton.setVisible(true);
				decafCoffeeButton.setVisible(true);
				cappiccinoButton.setVisible(true);
				latteButton.setVisible(true);
				espressoButton.setVisible(true);
				orangeJuiceButton.setVisible(false);
				appleJuiceButton.setVisible(false);
				pineappleJuiceButton.setVisible(false);
				cranberryJuiceButton.setVisible(false);
				sidesButton.setVisible(false);
				prevScreenDrinksButton.setVisible(true);

			}
		});

		// Set action for regCoffeeButton
		regCoffeeButton.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {

				BindOrder(event);
				getOrderTotal(event);

			}
		});

		// Set action for decafCoffeeButton
		decafCoffeeButton.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {

				BindOrder(event);
				getOrderTotal(event);

			}
		});

		// Set action for cappiccinoButton
		cappiccinoButton.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {

				BindOrder(event);
				getOrderTotal(event);

			}
		});

		// Set action for latteButton
		latteButton.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {

				BindOrder(event);
				getOrderTotal(event);

			}
		});

		// Set action for espressoButton
		espressoButton.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {

				BindOrder(event);
				getOrderTotal(event);

			}
		});

		// Set action for juiceButton
		juiceButton.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				sodaMiscButton.setVisible(false);
				juiceButton.setVisible(false);
				beerButton.setVisible(false);
				wineButton.setVisible(false);
				coffeeButton.setVisible(false);
				cokeButton.setVisible(false);
				spriteButton.setVisible(false);
				orangeButton.setVisible(false);
				rootBeerButton.setVisible(false);
				dietCokeButton.setVisible(false);
				iceTeaButton.setVisible(false);
				lemonadeButton.setVisible(false);
				regCoffeeButton.setVisible(false);
				decafCoffeeButton.setVisible(false);
				cappiccinoButton.setVisible(false);
				latteButton.setVisible(false);
				espressoButton.setVisible(false);
				orangeJuiceButton.setVisible(true);
				appleJuiceButton.setVisible(true);
				pineappleJuiceButton.setVisible(true);
				cranberryJuiceButton.setVisible(true);
				sidesButton.setVisible(false);
				prevScreenDrinksButton.setVisible(true);
				;
			}
		});

		// Set action for orangeJuiceButton
		orangeJuiceButton.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {

				BindOrder(event);
				getOrderTotal(event);

			}
		});

		// Set action for cranberryJuiceButton
		cranberryJuiceButton.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {

				BindOrder(event);
				getOrderTotal(event);

			}
		});

		// Set action for appleJuiceButton
		appleJuiceButton.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {

				BindOrder(event);
				getOrderTotal(event);

			}
		});

		// Set action for pineappleJuiceButton
		pineappleJuiceButton.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {

				BindOrder(event);
				getOrderTotal(event);

			}
		});

		// Set action for beerButton
		beerButton.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				sodaMiscButton.setVisible(false);
				juiceButton.setVisible(false);
				beerButton.setVisible(false);
				wineButton.setVisible(false);
				coffeeButton.setVisible(false);
				cokeButton.setVisible(false);
				spriteButton.setVisible(false);
				orangeButton.setVisible(false);
				rootBeerButton.setVisible(false);
				dietCokeButton.setVisible(false);
				iceTeaButton.setVisible(false);
				lemonadeButton.setVisible(false);
				regCoffeeButton.setVisible(false);
				decafCoffeeButton.setVisible(false);
				cappiccinoButton.setVisible(false);
				latteButton.setVisible(false);
				espressoButton.setVisible(false);
				budButton.setVisible(true);
				heinekenButton.setVisible(true);
				coronaButton.setVisible(true);
				chimayButton.setVisible(true);
				sweetWaterButton.setVisible(true);
				maduroButton.setVisible(true);
				samAdamsButton.setVisible(true);
				killiansButton.setVisible(true);
				twoHeartedButton.setVisible(true);
				prevScreenDrinksButton.setVisible(true);
			}
		});

		// Set action for budButton
		budButton.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {

				BindOrder(event);
				getOrderTotal(event);

			}
		});

		// Set action for heinekenButton
		heinekenButton.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {

				BindOrder(event);
				getOrderTotal(event);

			}
		});

		// Set action for coronaButton
		coronaButton.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {

				BindOrder(event);
				getOrderTotal(event);

			}
		});

		// Set action for chimayButton
		chimayButton.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {

				BindOrder(event);
				getOrderTotal(event);

			}
		});

		// Set action for sweetWaterButton
		sweetWaterButton.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {

				BindOrder(event);
				getOrderTotal(event);

			}
		});

		// Set action for maduroButton
		maduroButton.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {

				BindOrder(event);
				getOrderTotal(event);

			}
		});

		// Set action for samAdamsButton
		samAdamsButton.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {

				BindOrder(event);
				getOrderTotal(event);

			}
		});

		// Set action for killiansButton
		killiansButton.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {

				BindOrder(event);
				getOrderTotal(event);

			}
		});

		// Set action for twoHeartedButton
		twoHeartedButton.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {

				BindOrder(event);
				getOrderTotal(event);

			}
		});

		// Set action for wineButton
		wineButton.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				sodaMiscButton.setVisible(false);
				juiceButton.setVisible(false);
				beerButton.setVisible(false);
				wineButton.setVisible(false);
				coffeeButton.setVisible(false);
				cokeButton.setVisible(false);
				spriteButton.setVisible(false);
				orangeButton.setVisible(false);
				rootBeerButton.setVisible(false);
				dietCokeButton.setVisible(false);
				iceTeaButton.setVisible(false);
				lemonadeButton.setVisible(false);
				regCoffeeButton.setVisible(false);
				decafCoffeeButton.setVisible(false);
				cappiccinoButton.setVisible(false);
				latteButton.setVisible(false);
				espressoButton.setVisible(false);
				budButton.setVisible(false);
				heinekenButton.setVisible(false);
				coronaButton.setVisible(false);
				chimayButton.setVisible(false);
				sweetWaterButton.setVisible(false);
				maduroButton.setVisible(false);
				samAdamsButton.setVisible(false);
				killiansButton.setVisible(false);
				twoHeartedButton.setVisible(false);
				bigRedButton.setVisible(true);
				merlButton.setVisible(true);
				softWaveButton.setVisible(true);
				swirlButton.setVisible(true);
				shoreButton.setVisible(true);
				horizonButton.setVisible(true);
				bigCapButton.setVisible(true);
				curlButton.setVisible(true);
				sunriseButton.setVisible(true);
				prevScreenDrinksButton.setVisible(true);
			}
		});

		// Set action for bigRedButton
		bigRedButton.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {

				BindOrder(event);
				getOrderTotal(event);

			}
		});

		// Set action for merlButton
		merlButton.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {

				BindOrder(event);
				getOrderTotal(event);

			}
		});

		// Set action for softWaveButton
		softWaveButton.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {

				BindOrder(event);
				getOrderTotal(event);

			}
		});

		// Set action for swirlButton
		swirlButton.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {

				BindOrder(event);
				getOrderTotal(event);

			}
		});

		// Set action for shoreButton
		shoreButton.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {

				BindOrder(event);
				getOrderTotal(event);

			}
		});

		// Set action for horizonButton
		horizonButton.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {

				BindOrder(event);
				getOrderTotal(event);

			}
		});

		// Set action for bigCapButton
		bigCapButton.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {

				BindOrder(event);
				getOrderTotal(event);

			}
		});

		// Set action for curlButton
		curlButton.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {

				BindOrder(event);
				getOrderTotal(event);

			}
		});

		// Set action for sunriseButton
		sunriseButton.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {

				BindOrder(event);
				getOrderTotal(event);

			}
		});

		// Set action for appetizer button
		appetizerButton.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				scampiButton.setVisible(true);
				bruschettaButton.setVisible(true);
				crabCakesButton.setVisible(true);
				musclesButton.setVisible(true);
				coconutShrimpButton.setVisible(true);
				calamariButton.setVisible(true);
				drinkButton.setVisible(false);
				appetizerButton.setVisible(false);
				entreeButton.setVisible(false);
				sidesButton.setVisible(false);
				desertButton.setVisible(false);
				prevScreenMenuButton.setVisible(true);
				// Add prompt to userInputField
				userInputTextField.setText("Enter Order Item");
			}
		});

		// Set action for scampiButton
		scampiButton.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {

				BindOrder(event);
				getOrderTotal(event);

			}
		});

		// Set action for bruschettaButton
		bruschettaButton.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {

				BindOrder(event);
				getOrderTotal(event);

			}
		});

		// Set action for crabCakesButton
		crabCakesButton.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {

				BindOrder(event);
				getOrderTotal(event);

			}
		});

		// Set action for musclesButton
		musclesButton.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {

				BindOrder(event);
				getOrderTotal(event);

			}
		});

		// Set action for coconutShrimpButton
		coconutShrimpButton.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {

				BindOrder(event);
				getOrderTotal(event);

			}
		});

		// Set action for calamariButton
		calamariButton.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {

				BindOrder(event);
				getOrderTotal(event);

			}
		});

		// Set action for entreeButton
		entreeButton.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				seafoodAlfredoButton.setVisible(true);
				scampiLinguiniButton.setVisible(true);
				lobsterMacButton.setVisible(true);
				salmonButton.setVisible(true);
				mahiButton.setVisible(true);
				troutButton.setVisible(true);
				tunaButton.setVisible(true);
				oysterButton.setVisible(true);
				lobsterButton.setVisible(true);
				crabButton.setVisible(true);
				sirloinButton.setVisible(true);
				filejButton.setVisible(true);
				tBoneButton.setVisible(true);
				stripButton.setVisible(true);
				drinkButton.setVisible(false);
				appetizerButton.setVisible(false);
				entreeButton.setVisible(false);
				sidesButton.setVisible(false);
				desertButton.setVisible(false);
				prevScreenMenuButton.setVisible(true);
				// Add prompt to userInputField
				userInputTextField.setText("Enter Order Item");

			}
		});

		// Set action for seafoodAlfredoButton
		seafoodAlfredoButton.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {

				BindOrder(event);
				getOrderTotal(event);

			}
		});

		// Set action for scampiLinguiniButton
		scampiLinguiniButton.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {

				BindOrder(event);
				getOrderTotal(event);

			}
		});

		// Set action for lobsterMacButton
		lobsterMacButton.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {

				BindOrder(event);
				getOrderTotal(event);

			}
		});

		// Set action for salmonButton
		salmonButton.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {

				BindOrder(event);
				getOrderTotal(event);

			}
		});

		// Set action for mahiButton
		mahiButton.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {

				BindOrder(event);
				getOrderTotal(event);

			}
		});

		// Set action for troutButton
		troutButton.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {

				BindOrder(event);
				getOrderTotal(event);

			}
		});

		// Set action for tunaButton
		tunaButton.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {

				BindOrder(event);
				getOrderTotal(event);

			}
		});

		// Set action for oysterButton
		oysterButton.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {

				BindOrder(event);
				getOrderTotal(event);

			}
		});

		// Set action for lobsterButton
		lobsterButton.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {

				BindOrder(event);
				getOrderTotal(event);

			}
		});

		// Set action for crabButton
		crabButton.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {

				BindOrder(event);
				getOrderTotal(event);

			}
		});

		// Set action for sirloinButton
		sirloinButton.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {

				BindOrder(event);
				getOrderTotal(event);

			}
		});

		// Set action for filejButton
		filejButton.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {

				BindOrder(event);
				getOrderTotal(event);

			}
		});

		// Set action for tBoneButton
		tBoneButton.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {

				BindOrder(event);
				getOrderTotal(event);

			}
		});

		// Set action for stripButton
		stripButton.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {

				BindOrder(event);
				getOrderTotal(event);

			}
		});

		// Set action for sidesButton
		sidesButton.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {

				mPButton.setVisible(true);
				greenBeansButton.setVisible(true);
				broccoliButton.setVisible(true);
				sweetPotatoesButton.setVisible(true);
				asparagusButton.setVisible(true);
				drinkButton.setVisible(false);
				appetizerButton.setVisible(false);
				entreeButton.setVisible(false);
				sidesButton.setVisible(false);
				desertButton.setVisible(false);
				prevScreenMenuButton.setVisible(true);
				// Add prompt to userInputField
				userInputTextField.setText("Enter Order Item");

			}
		});

		// Set action for mPButton
		mPButton.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {

				BindOrder(event);
				getOrderTotal(event);

			}
		});

		// Set action for greenBeansButton
		greenBeansButton.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {

				BindOrder(event);
				getOrderTotal(event);

			}
		});

		// Set action for broccoliButton
		broccoliButton.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {

				BindOrder(event);
				getOrderTotal(event);

			}
		});

		// Set action for sweetPotatoesButton
		sweetPotatoesButton.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {

				BindOrder(event);
				getOrderTotal(event);

			}
		});

		// Set action for asparagusButton
		asparagusButton.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {

				BindOrder(event);
				getOrderTotal(event);

			}
		});

		// Set action for desertButton
		desertButton.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				sundaeButton.setVisible(true);
				cheeseCakeButton.setVisible(true);
				chocCakeButton.setVisible(true);
				tiramisuButton.setVisible(true);
				cannoliButton.setVisible(true);
				crostataButton.setVisible(true);
				drinkButton.setVisible(false);
				appetizerButton.setVisible(false);
				entreeButton.setVisible(false);
				desertButton.setVisible(false);
				prevScreenMenuButton.setVisible(true);
				// Add prompt to userInputField
				userInputTextField.setText("Enter Order Item");

			}
		});

		// Set action for sundaeButton
		sundaeButton.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {

				BindOrder(event);
				getOrderTotal(event);

			}
		});

		// Set action for cheeseCakeButton
		cheeseCakeButton.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {

				BindOrder(event);
				getOrderTotal(event);

			}
		});

		// Set action for chocCakeButton
		chocCakeButton.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {

				BindOrder(event);
				getOrderTotal(event);

			}
		});

		// Set action for tiramisuButton
		tiramisuButton.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {

				BindOrder(event);
				getOrderTotal(event);

			}
		});

		// Set action for cannoliButton
		cannoliButton.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {

				BindOrder(event);
				getOrderTotal(event);

			}
		});

		// Set action for crostataButton
		crostataButton.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {

				BindOrder(event);
				getOrderTotal(event);

			}
		});

		POSOrderTextArea = orderTextArea;

		primaryStage.show();
	}

	// Bind textArea order screen method
	public void BindOrder(ActionEvent event) {

		// Read through end of menuItems ArrayList and when found, add
		// object to orderItems ArrayList
		for (int i = 0; i < MyMenu.GetPOSMenuItems().size(); i++) {
			POSMenuItem myItem = MyMenu.GetPOSMenuItems().get(i);
			// Assign arrayList object name to itemNameString
			String itemNameString = myItem.getMenuItemName();
			// Assign arrayList object cost to itemCost
			Double itemCost = myItem.getMenuItemPrice();
			// Convert itemCost value from double to string and assign
			// to itemCost String variable
			String itemCostString = itemCost.toString();

			// Get Button Object name
			Object buttonObject = event.getSource();
			Button menuItemButton = (Button) buttonObject;

			// If item name in menuItems Array List matches
			// menuItemButton add to orderItems Array list
			if (itemNameString == menuItemButton.getText()) {

				POSOrderTextArea.setText(POSOrderTextArea.getText() + "\n" + itemNameString + ": " + itemCostString);

				// Add menu Item to orderItems Array List
				POSCustomerOrder currentOrder = POSCustomerOrders.get(orderIndex);
				currentOrder.getMenuItemList().add(myItem);

				POSNewGuestOrder.orders.add(currentOrder);
			}
		}
	}

	// getOrderTotal method
	public void getOrderTotal(ActionEvent event) {

		// Read through end of menuItems ArrayList and when found, add
		// object to orderItems ArrayList
		for (int i = 0; i < MyMenu.GetPOSMenuItems().size(); i++) {
			POSMenuItem myItem = MyMenu.GetPOSMenuItems().get(i);
			// Assign arrayList object name to itemNameString
			String itemNameString = myItem.getMenuItemName();
			// Assign arrayList object cost to itemCost
			Double orderItemCost = myItem.getMenuItemPrice();
		
			// Get Button Object name
			Object buttonObject = event.getSource();
			Button menuItemButton = (Button) buttonObject;

			// If item name in menuItems Array List matches
			// menuItemButton add to orderItems Array list
			if (itemNameString == menuItemButton.getText()) {

				// Add item cost to order sub total;
				myOrderTotal += orderItemCost;

				System.out.println(" This is order sub total: " + myOrderTotal);

			}

		}
	}

	public void printCheckMethod() {
		// Format
		DecimalFormat df = new DecimalFormat("0.");

		/// clear output
		char c = '\n';
		int length = 25;
		char[] chars = new char[length];
		Arrays.fill(chars, c);
		System.out.print(String.valueOf(chars));

		System.out.println("\n" + POSNewGuestOrder.orders.get(orderNumberTextFieldIndex));
		POSOrderTextArea.clear();
		POSOrderTextArea.appendText("" + POSNewGuestOrder.orders.get(orderNumberTextFieldIndex));
		Double orderSubTotal = POSNewGuestOrder.orders.get(orderNumberTextFieldIndex).getOrderTotal();
		double totalTax = 0.0;
		totalTax = (orderSubTotal * .07);
		Double orderTotalWithTax = orderSubTotal + totalTax;
		System.out.format("Tax (7%%): $%.2f%n", totalTax);
		System.out.format("ORDER TOTAL: $%.2f%n", orderTotalWithTax);

		POSOrderTextArea.appendText(String.format("\n+ Tax (7%%):  $%.2f%n", totalTax));
		POSOrderTextArea.appendText(String
				.format("************************************************\nORDER TOTAL:  $%.2f%n", orderTotalWithTax));

	}

	public void printAllChecksMethod() {

		for (POSCustomerOrder mi : POSNewGuestOrder.orders) {
			System.out.println("ORDERS ARRAY LIST: " + mi);
		}
	}

	// GetServiceTotal method
	public void getServiceTotal() {

		// Format
		DecimalFormat df = new DecimalFormat("0.");

		// Set check number
		POSNewGuestOrder.orders.get(orderIndex).setCustomerCheck(orderIndex + 1);
		// Set table number
		POSNewGuestOrder.orders.get(orderIndex).setTableNumber(Integer.parseInt(tableNumber));
		// Set order total
		POSNewGuestOrder.orders.get(orderIndex).setOrderTotal(myOrderTotal);

		System.out.println("\n\n" + POSNewGuestOrder.orders.get(orderIndex));
		Double orderTotal = POSNewGuestOrder.orders.get(orderIndex).getOrderTotal();

		double totalTax = 0.0;
		totalTax = (myOrderTotal * .07);
		Double orderTotalWithTax = orderTotal + totalTax;
		System.out.format("Tax (7%%): $%.2f%n", totalTax);
		System.out.format("ORDER TOTAL: $%.2f%n", orderTotalWithTax);

		POSOrderTextArea
				.appendText(String.format("\n\n********************************\nORDER SUBTOTAL: $%.2f%n", orderTotal));
		POSOrderTextArea.appendText(String.format("\n+ Tax (7%%):  $%.2f%n", totalTax));
		POSOrderTextArea.appendText(
				String.format("********************************\nORDER TOTAL:  $%.2f%n", orderTotalWithTax));

		// Hold order total for print method
		printOrderTotalHolder = myOrderTotal;

		System.out.println(" This is order total: " + myOrderTotal);
	}

	// getButtonObjectName method
	public Button getButtonObjectName(ActionEvent event) {
		Object buttonObject = event.getSource();
		Button menuItemButton = (Button) buttonObject;
		return menuItemButton;
	}

	public void HandleMenuItemClicked(ActionEvent event) {

		Object buttonObject = event.getSource();
		Button menuItemButton = (Button) buttonObject;
		System.out.println(menuItemButton.getText());
	}

	// concatinateNumberButtonsInput method
	public void concatinateNumberButtonsInput(int inputEntered) {
		int Input = 0;
		int userInputEntered = 0;

	}

	public static void main(String[] args) {
		launch(args);

	}
}
