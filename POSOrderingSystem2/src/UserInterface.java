

import java.awt.List;
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
import java.util.ArrayList;


import org.omg.CORBA.Environment;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class UserInterface extends Application{
	int gitTest = 1;
	
	int userInput = 0;

	String concatUserInputAsString = "";

	String tableNumber = "";
	String numberOfGuests = "";
	String seatNumber = "";
	String str;
	String drink = "";
	String app = "";
	String antree = "";
	String side = "";
	String desert = "";
    Menu newItem;
	
	
	
	
	
	

	@Override // Override the start method in the Application class
	public void start(Stage primaryStage) {

		// Create Pane
		Pane root = new Pane();
		
		// Create new check button
		Button newCheckButton = new Button();
		newCheckButton.setText("New \nCheck");

		// Create recall check button
		Button recallCheckButton = new Button();
		recallCheckButton.setText("Recall \nCheck");

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

		// Create prevScreenMenuButton
		Button prevScreenMenuButton = new Button();
		prevScreenMenuButton.setText("Prev");
		prevScreenMenuButton.setVisible(false);

		// Create prevScreenDrinksButton
		Button prevScreenDrinksButton = new Button();
		prevScreenDrinksButton.setText("Prev");
		prevScreenDrinksButton.setVisible(false);

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

		// Create enterButton
		Button enterButton = new Button();
		enterButton.setText("Enter");
		enterButton.setVisible(false);

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
		bigRedButton.setText("Big Red  \nCab");
		bigRedButton.setVisible(false);

		// Create merlButton & set to not visible
		Button merlButton = new Button();
		merlButton.setText("Merl    \nMerlot");
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
		shoreButton.setText("Shore Sav \nBlanc");
		shoreButton.setVisible(false);

		// Create horizonButton & set to not visible
		Button horizonButton = new Button();
		horizonButton.setText("Horizon  \nChenin");
		horizonButton.setVisible(false);

		// Create bigCapButton & set to not visible
		Button bigCapButton = new Button();
		bigCapButton.setText("Big Cap  \nZin");
		bigCapButton.setVisible(false);

		// Create curlButton & set to not visible
		Button curlButton = new Button();
		curlButton.setText("Curl     \nBlend");
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
		scampiButton.setText("Scampi");
		scampiButton.setVisible(false);
		// Set scampiButton size
		scampiButton.setPrefSize(100, 40);
		// Set scampiButton layout
		scampiButton.setLayoutY(100);
		scampiButton.setLayoutX(100);

		// Create calamariButton & set to not visible
		Button calamariButton = new Button();
		calamariButton.setText("Muscles");
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
		coconutShrimpButton.setText("Shrimp");
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
		lobsterMacButton.setText("Lobsster \nMac");
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
		crabButton.setText("Crab");
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
		filejButton.setText("Filej");
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
		sweetPotatoesButton.setText("Sweet \nPotatoe");
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
		newCheckButton.setLayoutY(650);
		newCheckButton.setLayoutX(100);

		// Set layout for recallCheckButton
		recallCheckButton.setLayoutY(700);
		recallCheckButton.setLayoutX(100);

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

		// Set layout for enterButton
		enterButton.setLayoutY(700);
		enterButton.setLayoutX(670);

		// Set layout for clearButton
		clearButton.setLayoutY(565);
		clearButton.setLayoutX(670);

		// Set layout for prevScreenMenuButton
		prevScreenMenuButton.setLayoutY(665);
		prevScreenMenuButton.setLayoutX(50);

		// Set layout for prevScreenDrinksButton
		prevScreenDrinksButton.setLayoutY(665);
		prevScreenDrinksButton.setLayoutX(50);

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
		maduroButton.setLayoutY(350);
		maduroButton.setLayoutX(100);

		// Set layout for samAdamsButton
		samAdamsButton.setLayoutY(400);
		samAdamsButton.setLayoutX(100);

		// Set layout for killiansButton
		killiansButton.setLayoutY(450);
		killiansButton.setLayoutX(100);

		// Set layout for twoHeartedButton
		twoHeartedButton.setLayoutY(500);
		twoHeartedButton.setLayoutX(100);

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
		swirlButton.setLayoutX(100);

		// Set layout for shoreButton
		shoreButton.setLayoutY(300);
		shoreButton.setLayoutX(100);

		// Set layout for horizonButton
		horizonButton.setLayoutY(350);
		horizonButton.setLayoutX(100);

		// Set layout for bigCapButton
		bigCapButton.setLayoutY(400);
		bigCapButton.setLayoutX(100);

		// Set layout for curlButton
		curlButton.setLayoutY(450);
		curlButton.setLayoutX(100);

		// Set layout for sunriseButton
		sunriseButton.setLayoutY(500);
		sunriseButton.setLayoutX(100);

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

		// Set size for new checkButton
		newCheckButton.setPrefSize(100, 40);

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

		// Set size for enterButton
		enterButton.setPrefSize(100, 40);

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

		// Set size for entreeButton
		entreeButton.setPrefSize(100, 40);

		// Set size for deserts button
		desertButton.setPrefSize(100, 40);

		// Add buttons to scene
		root.getChildren().addAll(newCheckButton, leftArrowButton, rightArrowButton, downArrowButton, upArrowButton,
				deleteButton, backSpaceButton, sevenButton, eightButton, nineButton, fourButton, fiveButton, sixButton,
				oneButton, twoButton, threeButton, zeroButton, tableNumberButton, numberOfGuestsButton, enterButton,
				clearButton, seatNumberButton, recallCheckButton, prevScreenMenuButton, prevScreenDrinksButton,
				orderTextArea, userInputTextField, userInputFeedBackTextField, drinkButton, sodaMiscButton,
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

		// Set action for newCheckButton
		newCheckButton.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				recallCheckButton.setVisible(false);
				newCheckButton.setVisible(false);
				tableNumberButton.setVisible(true);
				numberOfGuestsButton.setVisible(true);
				seatNumberButton.setVisible(true);
				enterButton.setVisible(true);
				orderTextArea.setVisible(true);
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

			}
		});

		// Set action for enterButton
		enterButton.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				enterButton.setVisible(true);
				drinkButton.setVisible(true);
				appetizerButton.setVisible(true);
				entreeButton.setVisible(true);
				desertButton.setVisible(true);
			}
		});

		// Set action for tableNumberButton
		tableNumberButton.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				userInputTextField.setText("Enter Number of Guests");
				userInputFeedBackTextField.setText("");

				// Assign concatuserInputAsString to table number
				tableNumber = concatUserInputAsString;

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

						// Print to console
						System.out.println("TABLE #: " + tableNumber);
						
						// Add text for TextArea
						orderTextArea.setText("TABLE #: " + tableNumber);
						
					}			
					in.close();
				} catch (IOException e) {
					System.out.println("exception occoured" + e);
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

				// try(FileWriter fw = new FileWriter("Table # 1.txt", true); //
				// Works

				try(FileWriter fw = new FileWriter("Table#" + tableNumber + ".txt", true);
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
				orderTextArea.setText("TABLE #: " + tableNumber + " GUEST COUNT: " + numberOfGuests);

				System.out.println("Guest count: " + numberOfGuests);

			}
		});

		// Set action for seatNumberButton
		seatNumberButton.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				userInputTextField.setText("Enter Seat Number");
				userInputFeedBackTextField.setText("");

				seatNumber = concatUserInputAsString;

				// Clear concatUserInputAsString value
				concatUserInputAsString = "";

				// Add seat number text for TextArea
				orderTextArea.appendText("\n\nSEAT #: " + seatNumber);
				
				try(FileWriter fw = new FileWriter("Table#" + tableNumber + ".txt", true);
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
				
				System.out.println("Seat #: " + seatNumber);
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

		// Set action for recall check button
		recallCheckButton.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {

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
			public void handle(ActionEvent event) {
				
		
					
				// call menuitmeclicked
				HandleMenuItemClicked(event);
					
                  
			    // Display in text area
				orderTextArea.setText("Table #: " + tableNumber + "  Guest count: " + numberOfGuests + "\n\nSeat #: "
						+ seatNumber + "\nCoke ");

			}
		});

		// Set action for spriteButton
		spriteButton.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {

				// call menuitmeclicked
				HandleMenuItemClicked(event);

			}
		});

		// Set action for orangeButton
		orangeButton.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {

				// call menuitmeclicked
				HandleMenuItemClicked(event);
			}
		});

		// Set action for rootBeerButton
		rootBeerButton.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {

				// call menuitmeclicked
				HandleMenuItemClicked(event);
			}
		});

		// Set action for dietCokeButton
		dietCokeButton.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {

				// call menuitmeclicked
				HandleMenuItemClicked(event);
			}
		});

		// Set action for orangeButton
		orangeButton.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {

				// call menuitmeclicked
				HandleMenuItemClicked(event);
			}
		});

		// Set action for rootBeerButton
		rootBeerButton.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {

				// call menuitmeclicked
				HandleMenuItemClicked(event);
			}
		});

		// Set action for dietCokeButton
		dietCokeButton.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {

				// call menuitmeclicked
				HandleMenuItemClicked(event);
			}
		});

		// Set action for iceTeaButton
		iceTeaButton.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {

				// call menuitmeclicked
				HandleMenuItemClicked(event);
			}
		});

		// Set action for lemonadeButton
		lemonadeButton.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {

				// call menuitmeclicked
				HandleMenuItemClicked(event);
			}
		});

		// Set action for regCoffeeButton
		regCoffeeButton.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {

				// call menuitmeclicked
				HandleMenuItemClicked(event);
			}
		});

		// Set action for decafCoffeeButton
		decafCoffeeButton.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {

				// call menuitmeclicked
				HandleMenuItemClicked(event);
			}
		});

		// Set action for cappiccinoButton
		cappiccinoButton.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {

				// call menuitmeclicked
				HandleMenuItemClicked(event);
			}
		});

		// Set action for latteButton
		latteButton.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {

				// call menuitmeclicked
				HandleMenuItemClicked(event);
			}
		});

		// Set action for espressoButton
		espressoButton.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {

				// call menuitmeclicked
				HandleMenuItemClicked(event);
			}
		});

		// Set action for orangeJuiceButton
		orangeJuiceButton.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {

				// call menuitmeclicked
				HandleMenuItemClicked(event);
			}
		});

		// Set action for cranberryJuiceButton
		cranberryJuiceButton.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {

				// call menuitmeclicked
				HandleMenuItemClicked(event);
			}
		});

		// Set action for appleJuiceButton
		appleJuiceButton.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {

				// call menuitmeclicked
				HandleMenuItemClicked(event);
			}
		});

		// Set action for pineappleJuiceButton
		pineappleJuiceButton.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {

				// call menuitmeclicked
				HandleMenuItemClicked(event);
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
				prevScreenDrinksButton.setVisible(true);
				;
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

		// Set action for budButton
		budButton.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {

				// call menuitmeclicked
				HandleMenuItemClicked(event);
			}
		});

		// Set action for heinekenButton
		heinekenButton.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {

				// call menuitmeclicked
				HandleMenuItemClicked(event);
			}
		});

		// Set action for coronaButton
		coronaButton.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {

				// call menuitmeclicked
				HandleMenuItemClicked(event);
			}
		});

		// Set action for chimayButton
		chimayButton.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {

				// call menuitmeclicked
				HandleMenuItemClicked(event);
			}
		});

		// Set action for sweetWaterButton
		sweetWaterButton.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {

				// call menuitmeclicked
				HandleMenuItemClicked(event);
			}
		});

		// Set action for maduroButton
		maduroButton.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {

				// call menuitmeclicked
				HandleMenuItemClicked(event);
			}
		});

		// Set action for samAdamsButton
		samAdamsButton.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {

				// call menuitmeclicked
				HandleMenuItemClicked(event);
			}
		});

		// Set action for killiansButton
		killiansButton.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {

				// call menuitmeclicked
				HandleMenuItemClicked(event);
			}
		});

		// Set action for twoHeartedButton
		twoHeartedButton.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {

				// call menuitmeclicked
				HandleMenuItemClicked(event);
			}
		});

		// Set action for bigRedButton
		bigRedButton.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {

				// call menuitmeclicked
				HandleMenuItemClicked(event);
			}
		});

		// Set action for merlButton
		merlButton.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {

				// call menuitmeclicked
				HandleMenuItemClicked(event);
			}
		});

		// Set action for softWaveButton
		softWaveButton.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {

				// call menuitmeclicked
				HandleMenuItemClicked(event);
			}
		});

		// Set action for swirlButton
		swirlButton.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {

				// call menuitmeclicked
				HandleMenuItemClicked(event);
			}
		});

		// Set action for shoreButton
		shoreButton.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {

				// call menuitmeclicked
				HandleMenuItemClicked(event);
			}
		});

		// Set action for horizonButton
		horizonButton.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {

				// call menuitmeclicked
				HandleMenuItemClicked(event);
			}
		});

		// Set action for bigCapButton
		bigCapButton.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {

				// call menuitmeclicked
				HandleMenuItemClicked(event);
			}
		});

		// Set action for curlButton
		curlButton.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {

				// call menuitmeclicked
				HandleMenuItemClicked(event);
			}
		});

		// Set action for sunriseButton
		sunriseButton.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {

				// call menuitmeclicked
				HandleMenuItemClicked(event);
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

		// Set action for desert button
		desertButton.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {

			}
		});

		// Set action for prevScreenDrinksButton
		prevScreenDrinksButton.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				drinkButton.setVisible(false);
				appetizerButton.setVisible(false);
				entreeButton.setVisible(false);
				desertButton.setVisible(false);
				enterButton.setVisible(true);
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
				System.out.println("This is the PrevScreenDrinksMenu");
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
			}
		});

		// Set action for scampiButton
		scampiButton.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {

				// call menuitmeclicked
				HandleMenuItemClicked(event);
			}
		});

		// Set action for bruschettaButton
		bruschettaButton.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {

				// call menuitmeclicked
				HandleMenuItemClicked(event);
			}
		});

		// Set action for crabCakesButton
		crabCakesButton.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {

				// call menuitmeclicked
				HandleMenuItemClicked(event);
			}
		});

		// Set action for musclesButton
		musclesButton.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {

				// call menuitmeclicked
				HandleMenuItemClicked(event);
			}
		});

		// Set action for coconutShrimpButton
		coconutShrimpButton.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {

				// call menuitmeclicked
				HandleMenuItemClicked(event);
			}
		});

		// Set action for calamariButton
		calamariButton.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {

				// call menuitmeclicked
				HandleMenuItemClicked(event);
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

			}
		});

		// Set action for seafoodAlfredoButton
		seafoodAlfredoButton.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {

				// call menuitmeclicked
				HandleMenuItemClicked(event);
			}
		});

		// Set action for scampiLinguiniButton
		scampiLinguiniButton.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {

				// call menuitmeclicked
				HandleMenuItemClicked(event);
			}
		});

		// Set action for lobsterMacButton
		lobsterMacButton.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {

				// call menuitmeclicked
				HandleMenuItemClicked(event);
			}
		});

		// Set action for salmonButton
		salmonButton.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {

				// call menuitmeclicked
				HandleMenuItemClicked(event);
			}
		});

		// Set action for mahiButton
		mahiButton.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {

				// call menuitmeclicked
				HandleMenuItemClicked(event);
			}
		});

		// Set action for troutButton
		troutButton.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {

				// call menuitmeclicked
				HandleMenuItemClicked(event);
			}
		});

		// Set action for tunaButton
		tunaButton.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {

				// call menuitmeclicked
				HandleMenuItemClicked(event);
			}
		});

		// Set action for oysterButton
		oysterButton.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {

				// call menuitmeclicked
				HandleMenuItemClicked(event);
			}
		});

		// Set action for lobsterButton
		lobsterButton.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {

				// call menuitmeclicked
				HandleMenuItemClicked(event);
			}
		});

		// Set action for crabButton
		crabButton.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {

				// call menuitmeclicked
				HandleMenuItemClicked(event);
			}
		});

		// Set action for sirloinButton
		sirloinButton.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {

				// call menuitmeclicked
				HandleMenuItemClicked(event);
			}
		});

		// Set action for filejButton
		filejButton.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {

				// call menuitmeclicked
				HandleMenuItemClicked(event);
			}
		});

		// Set action for tBoneButton
		tBoneButton.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {

				// call menuitmeclicked
				HandleMenuItemClicked(event);
			}
		});

		// Set action for stripButton
		stripButton.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {

				// call menuitmeclicked
				HandleMenuItemClicked(event);
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

			}
		});

		// Set action for mPButton
		mPButton.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {

				// call menuitmeclicked
				HandleMenuItemClicked(event);
			}
		});

		// Set action for greenBeansButton
		greenBeansButton.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {

				// call menuitmeclicked
				HandleMenuItemClicked(event);
			}
		});

		// Set action for broccoliButton
		broccoliButton.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {

				// call menuitmeclicked
				HandleMenuItemClicked(event);
			}
		});

		// Set action for sweetPotatoesButton
		sweetPotatoesButton.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {

				// call menuitmeclicked
				HandleMenuItemClicked(event);
			}
		});

		// Set action for asparagusButton
		asparagusButton.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {

				// call menuitmeclicked
				HandleMenuItemClicked(event);
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

			}
		});

		// Set action for sundaeButton
		sundaeButton.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {

				// call menuitmeclicked
				HandleMenuItemClicked(event);
			}
		});

		// Set action for cheeseCakeButton
		cheeseCakeButton.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {

				// call menuitmeclicked
				HandleMenuItemClicked(event);
			}
		});

		// Set action for chocCakeButton
		chocCakeButton.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {

				// call menuitmeclicked
				HandleMenuItemClicked(event);
			}
		});

		// Set action for tiramisuButton
		tiramisuButton.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {

				// call menuitmeclicked
				HandleMenuItemClicked(event);
			}
		});

		// Set action for cannoliButton
		cannoliButton.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {

				// call menuitmeclicked
				HandleMenuItemClicked(event);
			}
		});

		// Set action for crostataButton
		crostataButton.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {

				// call menuitmeclicked
				HandleMenuItemClicked(event);
			}
		});

		// Set action for prevScreenMenuButton
		prevScreenMenuButton.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				drinkButton.setVisible(true);
				appetizerButton.setVisible(true);
				entreeButton.setVisible(true);
				desertButton.setVisible(true);
				enterButton.setVisible(true);
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
				prevScreenMenuButton.setVisible(true);
				System.out.println("This is the PrevScreenMenuButton");
			}
		});

	}

	public void HandleMenuItemClicked(ActionEvent event) {

		Object buttonObject = event.getSource();
		Button menuItemButton = (Button) buttonObject;
		System.out.println(menuItemButton.getText());
	}

	public void concatinateNumberButtonsInput(int inputEntered) {
		int Input = 0;
		int userInputEntered = 0;

	}

	public static void main(String[] args) {
		launch(args);


		
	}
}
