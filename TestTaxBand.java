/* This program tests the functionality of the TaxBand class. It creates two instances of TaxBand and calls the equal method to compare them. */
//the test class
public class TestTaxBand{
	public static void main(String[] args){
		TaxBand a = new TaxBand(4,9);
		TaxBand b = new TaxBand(4,9);
		
		a.equal(b);
	}
}

//a class called taxband
class TaxBand{
	//a(i)maximum value
	private	int max;

	//a(ii)tax applicable to tak band
	private	int percent;
	
	//a(iv)
	public TaxBand(int max, int percent){
		this.max = max;
		this.percent = percent;
	}

	//a(iii)beginig
	public int getMax(){
		return max;
	}
	public int getPercent(){
		return percent;
	}
	public void setMax(int max){
        	this.max = max;
	}
	public void setPercent(int max){
		this.max = max;
	}//a(iii)ends

	//a(v)
	public void equal(TaxBand obj){
		System.out.println(((max == obj.max)&&(percent == obj.percent))? "True":"False");
	}
}

