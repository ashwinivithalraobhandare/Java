class PaintRunner{
	public static void main(String[] args){
		Paint.sketch("Asian paints");
		Paint.sketch("Asian paints","Red");
		Paint.sketch("Asian paints",1500);
		Paint.sketch("red","water proof",2500);
		
		
		Train.book("kalaburgi","bangalore");
		Train.book("kalaburgi","bangalore","ac");
		Train.book("kalaburgi","bangalore","ac",1000);
		Train.cancel(118765);
		Train.cancel("kalaburgi","bangalore");
		
		Sandal.walk("Heels");
		Sandal.walk("Red");
		Sandal.walk(2999);
		Sandal.walk('M');
		Sandal.walk("Heels","5star");
	}
}