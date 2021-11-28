package household;


public class PriceVisitor implements Visitor{

	@Override
	public void ElectronicVisitor(Electronic d) {
		String Name=d.getName();
		boolean fragile=d.getFragile();
		double Weight=d.getWeight();
		double Preis=0;
		if(!fragile) {Preis=(5*(Weight/15));}
		if(fragile) {Preis=(5*(Weight/10));}
		System.out.println("Total Cost for "+Name+" is: "+Preis+" Euro");
		
		
	}

	@Override
	public void FurnitureVisitor(Furniture d) {
		String FurnitureName=d.getName();
		double Preis=0;
		double Weight=d.getWeight();
		Preis=(5*(Weight/20));
		System.out.println("Total Cost for "+FurnitureName+" is: "+Preis+" Euro");
		
		
	}

	@Override
	public void GlassVisitor(Glass d) {
		double Preis=0;
		String GlassName=d.getName();
		double Centimeter=d.getLenght();
		 Centimeter=(Centimeter/100);
		if(d.getTickness()==1) {Preis=(2*Centimeter);}
		if(d.getTickness()==2) {Preis=(1.2*Centimeter);}
		if(d.getTickness()==3) {Preis=(0.7*Centimeter);}
		System.out.println("Total Cost for "+GlassName+" is: "+Preis+" Euro");
	}

}
