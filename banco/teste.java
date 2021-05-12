package lista;

public class teste {
	public static void main(String[] args) {
		
		bd in = new bd("harry potter e os piratas do caribe", "tolkien", "didatico", "1", "2025");
		
		in.setLivros();
		
		in = new bd("percy jackson e o grande roubo", "hplovecraft", "romance", "5", "2025");
		
		in.setLivros();
		in.getLivros();
		
	}
}
