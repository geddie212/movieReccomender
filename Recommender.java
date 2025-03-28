public class Recommender {
	private Show[] shows;

	public Recommender(int size){
		this.shows = new Show[size];
	}

	public void addShow(String type, String name, String genre, float ranking){
		for (int i = 0; i < shows.length; i++){
			if (this.shows[i] == null){
				this.shows[i] = new Show(type, name, genre, ranking);
				break;
			}
		}
	}

	public String getTopShows(String type, String genre){
		StringBuilder s = new StringBuilder();
		for (int i = 0; i < this.shows.length; i++){
			if (this.shows[i] != null && this.shows[i].getType().equalsIgnoreCase(type) && this.shows[i].getGenre().equalsIgnoreCase(genre)){
				s.append("|Title: "+this.shows[i].getName()+" |Ranking: " +  this.shows[i].getRanking()+"\n");
			}
		}
		return s.toString();
	}

	@Override
	  public String toString() {
	    StringBuilder s = new StringBuilder();
	    for(Show i : this.shows){
	      if(i == null){
	        continue;
	      }
	      s.append(i.toString());
	      s.append("\n");
	    }
	    return s.toString();
	  }
}