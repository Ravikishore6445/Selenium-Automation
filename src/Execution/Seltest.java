package Execution;

public class Seltest {
	
	public static void main(String args[])
	{
		
		testexecute t = new testexecute();
		
		t.setup("http://172.26.180.17/helpsicrm/Common/Default.aspx");
		t.runtcase("http://172.26.180.17/helpsicrm/Common/Default.aspx", "Login");
		t.runtcase("http://172.26.180.17/helpsicrm/Common/Default.aspx", "PlayerSearch");
		
		t.teardown();
		
		
	}

}
