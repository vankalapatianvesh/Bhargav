package hiber;


	import org.hibernate.SessionFactory;
	import org.hibernate.cfg.Configuration;

	public class hibernateUtil {
		public static SessionFactory factory=null;
		static
		{
			Configuration cfg=new Configuration();
			cfg=cfg.configure();
		factory=cfg.buildSessionFactory();	
		}
			public static SessionFactory getSessionfactory()
			{
				return factory;
			}
			
			
		}

