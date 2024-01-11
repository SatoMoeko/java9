package java9;

public class Hero {
	String name; //名前の宣言
	int hp; //HPの宣言
	Sword sword;

	public void attack() {
	System.out.println(this.name+"は"+this.sword.name+"で攻撃した");//この武器の名前
	System.out.println("敵に"+(5+this.sword.damage)+"ポイントのダメージを与えた！");//この武器のダメージ
	}
	
	public Hero(String name) {
		this.hp = 100; //hpフィールドを100で初期化
		this.name = name; //引数の値でnameフィールドを初期化
	}
	
	public Hero() {
		this("ダミー");
	}
	
	
	
	
}

