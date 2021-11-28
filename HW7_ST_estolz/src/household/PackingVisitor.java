package household;

public class PackingVisitor implements Visitor{

	@Override
	public void ElectronicVisitor(Electronic d) {
		int Height=d.getHeight();
		int length=d.getLenght();
		int Width=d.getWidth();
		Height++;length++;Width++;
		String Name=d.getName();
		System.out.println(Name+":"+"\n"+"> Should be covered in Polyethylene foam and packed in a Box with Dimension "+Height+"*"+length+"*"+Width);
		
		
		
	}

	@Override
	public void FurnitureVisitor(Furniture d) {
		int Height=d.getHeight();
		int length=d.getLenght();
		int Width=d.getWidth();
		String Name=d.getName();
		System.out.println(Name+":"+"\n"+"> Should be covered with waterproof covers with area of "+Height+"*"+length+"*"+Width);
		
		
	}

	@Override
	public void GlassVisitor(Glass d) {
		int Height=d.getHeight();
		int length=d.getLenght();
		int Width=d.getWidth();
		Height++;length++;Width++;
		String Name=d.getName();
		System.out.println(Name+":"+"\n"+"> Should be packed in a Box with Dimension "+Height+"*"+length+"*"+Width+" and filled with Bubble wraps");
		
	}

}
