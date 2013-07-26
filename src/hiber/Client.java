package hiber;

import org.hibernate.Transaction;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class Client 
{
	public static void main(String[] args)
	{
		Transaction tx=null;
		try
		{
		SessionFactory factory=hibernateUtil.getSessionfactory();
		
		Session session=factory.openSession();
		tx=session.beginTransaction();
		
		
		Customer cust=new Customer("s","s@gcs.com");
        session.save(cust);	
        
		System.out.println("Session sev");
			
		tx.commit();
		session.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
			if(tx!=null)
			{
				tx.rollback();
			}
			
	}

	}
}
