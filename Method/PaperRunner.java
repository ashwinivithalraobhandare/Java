class PaperRunner
{
	public static void main(String[] args)
	{
	Paper  paper=new Paper("A4");
	paper.setThickness(5);
	paper.thickness();
	
	Paper  paper1=new Paper("A5");
	paper1.setThickness(10);
	paper1.thickness();
	
	Paper  paper2=new Paper("A6");
	paper2.setThickness(20);
	paper2.thickness();
	}
}