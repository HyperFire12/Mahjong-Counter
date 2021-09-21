import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;
import javafx.scene.text.*;
import javafx.stage.Stage;

public class MJ_Counter extends Application {
	public int wp1 = 0;
	public int wp2 = 1;
	public int wp3 = 2;
	public int wp4 = 3;
	public int tot = 0;
	public int totdir = 0;

	public int[] ps = new int[4];

	public Text p1dir;
	public Text p2dir;
	public Text p3dir;
	public Text p4dir;
	public Text totaldir;

	public String[] dir = { "東", "南", "西", "北" };
	public String[] rdir = { "東", "南", "西", "北" };

	public Pane pane2 = new Pane();
	public Scene scene2 = new Scene(new Group());

	public Text p1score = new Text();
	public Text p2score = new Text();
	public Text p3score = new Text();
	public Text p4score = new Text();

	public TextField pts = new TextField();
	public Button player = new Button();

	public boolean discarded;
	public boolean canChange;

	public static void main(String[] args) {
		launch(args);
	}

	public void reset() {
		p1score.setText(Integer.toString(ps[0]));
		p2score.setText(Integer.toString(ps[1]));
		p3score.setText(Integer.toString(ps[2]));
		p4score.setText(Integer.toString(ps[3]));
	}

	public void dpoints(int winner, int loser, int amt) {
		int[] k = { 0, 1, 2, 3 };
		for (int i = 0; i < 4; i++) {
			if (winner == k[i] || loser == k[i]) {
				k[i] = -1;
			}
		}
		ps[winner] += amt;
		ps[loser] -= amt / 2;
		for (int i = 0; i < 4; i++) {
			if (k[i] != -1) {
				ps[i] -= amt / 4;
			}
		}
		canChange = true;
	}

	public void rpoints(int winner, int amt) {
		int[] k = { 0, 1, 2, 3 };
		for (int i = 0; i < 4; i++) {
			if (winner == k[i]) {
				k[i] = -1;
			}
		}
		ps[winner] += amt;
		for (int i = 0; i < 4; i++) {
			if (k[i] != -1) {
				ps[i] -= amt / 3;
			}
		}
		canChange = true;
	}

	public void points(String winner) {
		switch (pts.getText()) {
		case "1":
			if (discarded) {
				int x = 8;
				if (!(player.getText().equals(winner))) {
					switch (player.getText()) {
					case "1":
						dpoints(Integer.parseInt(winner) - 1, 0, x);
						break;
					case "2":
						dpoints(Integer.parseInt(winner) - 1, 1, x);
						break;
					case "3":
						dpoints(Integer.parseInt(winner) - 1, 2, x);
						break;
					case "4":
						dpoints(Integer.parseInt(winner) - 1, 3, x);
						break;
					}
				}
			} else {
				int y = 12;
				rpoints(Integer.parseInt(winner) - 1, y);
			}
			reset();
			player.setText("1");
			pts.clear();
			break;
		case "2":
			if (discarded) {
				int x = 16;
				if (!(player.getText().equals(winner))) {
					switch (player.getText()) {
					case "1":
						dpoints(Integer.parseInt(winner) - 1, 0, x);
						break;
					case "2":
						dpoints(Integer.parseInt(winner) - 1, 1, x);
						break;
					case "3":
						dpoints(Integer.parseInt(winner) - 1, 2, x);
						break;
					case "4":
						dpoints(Integer.parseInt(winner) - 1, 3, x);
						break;
					}
				}
			} else {
				int y = 24;
				rpoints(Integer.parseInt(winner) - 1, y);
			}
			reset();
			player.setText("1");
			pts.clear();
			break;
		case "3":
			if (discarded) {
				int x = 32;
				if (!(player.getText().equals(winner))) {
					switch (player.getText()) {
					case "1":
						dpoints(Integer.parseInt(winner) - 1, 0, x);
						break;
					case "2":
						dpoints(Integer.parseInt(winner) - 1, 1, x);
						break;
					case "3":
						dpoints(Integer.parseInt(winner) - 1, 2, x);
						break;
					case "4":
						dpoints(Integer.parseInt(winner) - 1, 3, x);
						break;
					}
				}
			} else {
				int y = 48;
				rpoints(Integer.parseInt(winner) - 1, y);
			}
			reset();
			player.setText("1");
			pts.clear();
			break;
		case "4":
			if (discarded) {
				int x = 64;
				if (!(player.getText().equals(winner))) {
					switch (player.getText()) {
					case "1":
						dpoints(Integer.parseInt(winner) - 1, 0, x);
						break;
					case "2":
						dpoints(Integer.parseInt(winner) - 1, 1, x);
						break;
					case "3":
						dpoints(Integer.parseInt(winner) - 1, 2, x);
						break;
					case "4":
						dpoints(Integer.parseInt(winner) - 1, 3, x);
						break;
					}
				}
			} else {
				int y = 96;
				rpoints(Integer.parseInt(winner) - 1, y);
			}
			reset();
			player.setText("1");
			pts.clear();
			break;
		case "5":
			if (discarded) {
				int x = 64;
				if (!(player.getText().equals(winner))) {
					switch (player.getText()) {
					case "1":
						dpoints(Integer.parseInt(winner) - 1, 0, x);
						break;
					case "2":
						dpoints(Integer.parseInt(winner) - 1, 1, x);
						break;
					case "3":
						dpoints(Integer.parseInt(winner) - 1, 2, x);
						break;
					case "4":
						dpoints(Integer.parseInt(winner) - 1, 3, x);
						break;
					}
				}
			} else {
				int y = 96;
				rpoints(Integer.parseInt(winner) - 1, y);
			}
			reset();
			player.setText("1");
			pts.clear();
			break;
		case "6":
			if (discarded) {
				int x = 64;
				if (!(player.getText().equals(winner))) {
					switch (player.getText()) {
					case "1":
						dpoints(Integer.parseInt(winner) - 1, 0, x);
						break;
					case "2":
						dpoints(Integer.parseInt(winner) - 1, 1, x);
						break;
					case "3":
						dpoints(Integer.parseInt(winner) - 1, 2, x);
						break;
					case "4":
						dpoints(Integer.parseInt(winner) - 1, 3, x);
						break;
					}
				}
			} else {
				int y = 96;
				rpoints(Integer.parseInt(winner) - 1, y);
			}
			reset();
			player.setText("1");
			pts.clear();
			break;
		case "7":
			if (discarded) {
				int x = 128;
				if (!(player.getText().equals(winner)))
					switch (player.getText()) {
					case "1":
						dpoints(Integer.parseInt(winner) - 1, 0, x);
						break;
					case "2":
						dpoints(Integer.parseInt(winner) - 1, 1, x);
						break;
					case "3":
						dpoints(Integer.parseInt(winner) - 1, 2, x);
						break;
					case "4":
						dpoints(Integer.parseInt(winner) - 1, 3, x);
						break;
					}
				reset();
				player.setText("1");
				pts.clear();
			} else {
				int y = 192;
				rpoints(Integer.parseInt(winner) - 1, y);
			}
			break;
		case "8":
			if (discarded) {
				int x = 128;
				if (!(player.getText().equals(winner))) {
					switch (player.getText()) {
					case "1":
						dpoints(Integer.parseInt(winner) - 1, 0, x);
						break;
					case "2":
						dpoints(Integer.parseInt(winner) - 1, 1, x);
						break;
					case "3":
						dpoints(Integer.parseInt(winner) - 1, 2, x);
						break;
					case "4":
						dpoints(Integer.parseInt(winner) - 1, 3, x);
						break;
					}
				}
			} else {
				int y = 192;
				rpoints(Integer.parseInt(winner) - 1, y);
			}
			reset();
			player.setText("1");
			pts.clear();
			break;
		case "9":
			if (discarded) {
				int x = 128;
				if (!(player.getText().equals(winner))) {
					switch (player.getText()) {
					case "1":
						dpoints(Integer.parseInt(winner) - 1, 0, x);
						break;
					case "2":
						dpoints(Integer.parseInt(winner) - 1, 1, x);
						break;
					case "3":
						dpoints(Integer.parseInt(winner) - 1, 2, x);
						break;
					case "4":
						dpoints(Integer.parseInt(winner) - 1, 3, x);
						break;
					}
				}
			} else {
				int y = 192;
				rpoints(Integer.parseInt(winner) - 1, y);
			}
			break;
		case "10":
			if (discarded) {
				int x = 256;
				if (!(player.getText().equals(winner))) {
					switch (player.getText()) {
					case "1":
						dpoints(Integer.parseInt(winner) - 1, 0, x);
						break;
					case "2":
						dpoints(Integer.parseInt(winner) - 1, 1, x);
						break;
					case "3":
						dpoints(Integer.parseInt(winner) - 1, 2, x);
						break;
					case "4":
						dpoints(Integer.parseInt(winner) - 1, 3, x);
						break;
					}
				}
			} else {
				int y = 384;
				rpoints(Integer.parseInt(winner) - 1, y);
			}
			reset();
			player.setText("1");
			pts.clear();
			break;
		case "11":
			if (discarded) {
				int x = 512;
				if (!(player.getText().equals(winner))) {
					switch (player.getText()) {
					case "1":
						dpoints(Integer.parseInt(winner) - 1, 0, x);
						break;
					case "2":
						dpoints(Integer.parseInt(winner) - 1, 1, x);
						break;
					case "3":
						dpoints(Integer.parseInt(winner) - 1, 2, x);
						break;
					case "4":
						dpoints(Integer.parseInt(winner) - 1, 3, x);
						break;
					}
				}
			} else {
				int y = 768;
				rpoints(Integer.parseInt(winner) - 1, y);
			}
			reset();
			player.setText("1");
			pts.clear();
			break;
		case "12":
			if (discarded) {
				int x = 1024;
				if (!(player.getText().equals(winner))) {
					switch (player.getText()) {
					case "1":
						dpoints(Integer.parseInt(winner) - 1, 0, x);
						break;
					case "2":
						dpoints(Integer.parseInt(winner) - 1, 1, x);
						break;
					case "3":
						dpoints(Integer.parseInt(winner) - 1, 2, x);
						break;
					case "4":
						dpoints(Integer.parseInt(winner) - 1, 3, x);
						break;
					}
				}
			} else {
				int y = 1536;
				rpoints(Integer.parseInt(winner) - 1, y);
			}
			reset();
			player.setText("1");
			pts.clear();
			break;
		}
	}

	public void change() {
		wp1--;
		if (wp1 == -1)
			wp1 = 3;
		wp2--;
		if (wp2 == -1)
			wp2 = 3;
		wp3--;
		if (wp3 == -1)
			wp3 = 3;
		wp4--;
		if (wp4 == -1)
			wp4 = 3;
		p1dir.setText(dir[wp1]);
		p2dir.setText(dir[wp2]);
		p3dir.setText(dir[wp3]);
		p4dir.setText(dir[wp4]);
		tot++;
		if (tot == 4) {
			totdir++;
			if (totdir == 4) {
				totdir = 0;
			}
			totaldir.setText(rdir[totdir]);
			tot = 0;
		}
	}

	public void start(Stage stage) {
		Scene scene = new Scene(new Group());
		stage.setTitle("Mahjong Counter");
		stage.setWidth(800);
		stage.setHeight(600);

		// Section 1
		Pane pane = new Pane();

		Text text = new Text();
		text.setTranslateX(10);
		text.setTranslateY(30);
		text.setText("東");
		text.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 20));

		TextField textfield = new TextField();
		textfield.setTranslateX(50);
		textfield.setTranslateY(10);

		Text text2 = new Text();
		text2.setTranslateX(10);
		text2.setTranslateY(80);
		text2.setText("南");
		text2.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 20));

		TextField textfield2 = new TextField();
		textfield2.setTranslateX(50);
		textfield2.setTranslateY(60);

		Text text3 = new Text();
		text3.setTranslateX(10);
		text3.setTranslateY(130);
		text3.setText("西");
		text3.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 20));

		TextField textfield3 = new TextField();
		textfield3.setTranslateX(50);
		textfield3.setTranslateY(110);

		Text text4 = new Text();
		text4.setTranslateX(10);
		text4.setTranslateY(180);
		text4.setText("北");
		text4.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 20));

		TextField textfield4 = new TextField();
		textfield4.setTranslateX(50);
		textfield4.setTranslateY(160);

		Text names = new Text();
		names.setTranslateX(270);
		names.setTranslateY(60);
		names.setText("Enter Player Names");

		Button button = new Button();
		button.setTranslateX(300);
		button.setTranslateY(80);
		button.setText("Start");

		// Section 2
		p1dir = new Text();
		p1dir.setTranslateX(350);
		p1dir.setTranslateY(100);
		p1dir.setText("東");
		p1dir.setFont(Font.font("verdana", FontPosture.REGULAR, 25));

		p2dir = new Text();
		p2dir.setTranslateX(350);
		p2dir.setTranslateY(155);
		p2dir.setText("南");
		p2dir.setFont(Font.font("verdana", FontPosture.REGULAR, 25));

		p3dir = new Text();
		p3dir.setTranslateX(350);
		p3dir.setTranslateY(210);
		p3dir.setText("西");
		p3dir.setFont(Font.font("verdana", FontPosture.REGULAR, 25));

		p4dir = new Text();
		p4dir.setTranslateX(350);
		p4dir.setTranslateY(265);
		p4dir.setText("北");
		p4dir.setFont(Font.font("verdana", FontPosture.REGULAR, 25));

		p1score.setTranslateX(550);
		p1score.setTranslateY(100);
		p1score.setText(Integer.toString(ps[0]));
		p1score.setFont(Font.font("verdana", FontPosture.REGULAR, 25));

		p2score.setTranslateX(550);
		p2score.setTranslateY(155);
		p2score.setText(Integer.toString(ps[1]));
		p2score.setFont(Font.font("verdana", FontPosture.REGULAR, 25));

		p3score.setTranslateX(550);
		p3score.setTranslateY(210);
		p3score.setText(Integer.toString(ps[2]));
		p3score.setFont(Font.font("verdana", FontPosture.REGULAR, 25));

		p4score.setTranslateX(550);
		p4score.setTranslateY(265);
		p4score.setText(Integer.toString(ps[3]));
		p4score.setFont(Font.font("verdana", FontPosture.REGULAR, 25));

		pts.setTranslateX(200);
		pts.setTranslateY(30);

		Button how = new Button();
		how.setTranslateX(400);
		how.setTranslateY(30);
		how.setText("Drawn");

		player.setTranslateX(500);
		player.setTranslateY(30);
		player.setText("1");

		Button p1button = new Button();
		p1button.setTranslateX(50);
		p1button.setTranslateY(85);
		p1button.setText("Win");

		Button p2button = new Button();
		p2button.setTranslateX(50);
		p2button.setTranslateY(140);
		p2button.setText("Win");

		Button p3button = new Button();
		p3button.setTranslateX(50);
		p3button.setTranslateY(195);
		p3button.setText("Win");

		Button p4button = new Button();
		p4button.setTranslateX(50);
		p4button.setTranslateY(250);
		p4button.setText("Win");

		button.setOnAction(action -> {
			String p1 = textfield.getText();
			String p2 = textfield2.getText();
			String p3 = textfield3.getText();
			String p4 = textfield4.getText();

			Text p1text = new Text();
			p1text.setTranslateX(100);
			p1text.setTranslateY(100);
			p1text.setText("1: " + p1);
			p1text.setFont(Font.font("verdana", FontPosture.REGULAR, 25));

			Line line = new Line(100, 117.5, 600, 117.5);

			Text p2text = new Text();
			p2text.setTranslateX(100);
			p2text.setTranslateY(155);
			p2text.setText("2: " + p2);
			p2text.setFont(Font.font("verdana", FontPosture.REGULAR, 25));

			Line line2 = new Line(100, 172.5, 600, 172.5);

			Text p3text = new Text();
			p3text.setTranslateX(100);
			p3text.setTranslateY(210);
			p3text.setText("3: " + p3);
			p3text.setFont(Font.font("verdana", FontPosture.REGULAR, 25));

			Line line3 = new Line(100, 227.5, 600, 227.5);

			Text p4text = new Text();
			p4text.setTranslateX(100);
			p4text.setTranslateY(265);
			p4text.setText("4: " + p4);
			p4text.setFont(Font.font("verdana", FontPosture.REGULAR, 25));

			Line line4 = new Line(100, 282.5, 600, 282.5);

			Text p5text = new Text();
			p5text.setTranslateX(100);
			p5text.setTranslateY(425);
			p5text.setText("Round Direction: ");
			p5text.setFont(Font.font("verdana", FontPosture.REGULAR, 25));

			totaldir = new Text();
			totaldir.setTranslateX(350);
			totaldir.setTranslateY(425);
			totaldir.setText(rdir[totdir]);
			totaldir.setFont(Font.font("verdana", FontPosture.REGULAR, 25));

			pane2.getChildren().addAll(p1dir, p2dir, p3dir, p4dir, p1text, p2text, p3text, p4text, p5text, totaldir,
					line, line2, line3, line4, p1score, p2score, p3score, p4score, pts, how, p1button, p2button,
					p3button, p4button);
			((Group) scene2.getRoot()).getChildren().addAll(pane2);
			stage.setScene(scene2);
		});

		how.setOnAction(action -> {
			if (how.getText().equals("Drawn")) {
				pane2.getChildren().addAll(player);
				how.setText("Discarded");
				discarded = true;
			} else {
				pane2.getChildren().remove(player);
				how.setText("Drawn");
				player.setText("1");
				discarded = false;
			}
		});

		player.setOnAction(action -> {
			switch (player.getText()) {
			case "1":
				player.setText("2");
				break;
			case "2":
				player.setText("3");
				break;
			case "3":
				player.setText("4");
				break;
			case "4":
				player.setText("1");
				break;
			}
		});
		p1button.setOnAction(action -> {
			if (p1dir.getText().equals("東") || player.getText().equals("1")) {
				points("1");
				canChange = false;
			} else {
				points("1");
				if (canChange) {
					change();
				}
				canChange = false;
			}
		});

		p2button.setOnAction(action -> {
			if (p2dir.getText().equals("東") || player.getText().equals("2")) {
				points("2");
				canChange = false;
			} else {
				points("2");
				if (canChange) {
					change();
				}
				canChange = false;
			}
		});

		p3button.setOnAction(action -> {
			if (p3dir.getText().equals("東") || player.getText().equals("3")) {
				points("3");
				canChange = false;
			} else {
				points("3");
				if (canChange) {
					change();
				}
				canChange = false;
			}
		});

		p4button.setOnAction(action -> {
			if (p4dir.getText().equals("東") || player.getText().equals("4")) {
				points("4");
				canChange = false;
			} else {
				points("4");
				if (canChange) {
					change();
				}
				canChange = false;
			}
		});

		pane.getChildren().addAll(text, textfield, text2, textfield2, text3, textfield3, text4, textfield4, names,
				button);

		((Group) scene.getRoot()).getChildren().addAll(pane);
		stage.setScene(scene);
		stage.show();
	}
}