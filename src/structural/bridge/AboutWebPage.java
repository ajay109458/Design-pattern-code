package structural.bridge;

public class AboutWebPage implements IWebPage {
	
	private ITheme theme;
	
	public AboutWebPage(ITheme theme) {
		// TODO Auto-generated constructor stub
		this.theme = theme;
	}

	@Override
	public void printContent() {
		System.out.println("About web page in theme " + theme.getColor());
	}

}
