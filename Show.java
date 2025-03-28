public class Show {
	private String type;
	private String name;
	private String genre;
	private float ranking;

	public Show(String type, String name, String genre, float ranking){
		this.type = type;
		this.name = name;
		this.genre = genre;
		this.ranking = ranking;
	}

	public String getType(){
		return this.type;
	}

	public String getName(){
		return this.name;
	}

	public String getGenre(){
		return this.genre;
	}

	public float getRanking(){
		return this.ranking;
	}

	public void setType(String type){
		this.type = type;
	}

	public void setName(String name){
		this.name = name;
	}

	public void setGenre(String genre){
		this.genre = genre;
	}

	public void setRanking(float ranking){
		this.ranking = ranking;
	}

	@Override
  	public String toString() {
    	return "|name: "+this.name + " |type: " + this.type + " |genre: " + this.genre + " |ranking: " + this.ranking;
  	}
}