package tp22;

public class Robot {
	
		private String nom;
		private int x, y;
		private String direction;
		public Robot(String nom) {
		this.nom = nom;
		this.x = this.y = 0;
		this.direction = "Nord";
		}
		public void avance(){
		switch(this.direction){
		case "Nord":this.y++;break;
		case "Est":this.x++;break;
		case "Sud":this.y--;break;
		case "Ouest":this.x--;break;
		}
		}
		public void droite(){
		switch(direction){
		case "Nord": direction="Est"; break;
		case "Est":direction="sud"; break;
		case "Sud":direction="Ouest"; break;
		case "ouest":direction="Nord"; break;
		}
		}
		
		public String getNom() {
			return nom;
		}
		public void setNom(String nom) {
			this.nom = nom;
		}
		public int getX() {
			return x;
		}
		public void setX(int x) {
			this.x = x;
		}
		public int getY() {
			return y;
		}
		public void setY(int y) {
			this.y = y;
		}
		public String getDirection() {
			return direction;
		}
		public void setDirection(String direction) {
			this.direction = direction;
		}
		// ajouter les getters & setters
		public String getPosition() {
		return
		"("+this.getX()+","+this.getY()+")"+this.direction;
		}
	}


