package del3;

public class LoggingSomeService implements SomeService {

	private final SomeService delegate;
	private final Logger logger;

	/**
	 * Creates a LoggingSomeService object with the given delegate and logger
	 */
	public LoggingSomeService(SomeService delegate, Logger logger) {
		this.delegate = delegate;
		this.logger = logger;
	}

	@Override
	/**
	 * Delegates the job of calculating a magic string to the delegate, and logs the
	 * result before returning it
	 * 
	 * @return A string
	 */
	public String getAMagicString() {
		String magicString = delegate.getAMagicString();
		logger.log(magicString);

		return magicString;
	}

	/**
	 * Delegates the job of calculating a magic number to the delegate, and logs the
	 * result before returning it
	 * 
	 * @return An integer
	 */
	@Override
	public int getAMagicNumber() {
		int magicNumber = delegate.getAMagicNumber();
		logger.log(String.valueOf(magicNumber));

		return magicNumber;
	}
	
	public static void main(String [] args) {
		Logger logger = new Logger();
		SomeService loggingService = new LoggingSomeService(new SomeServiceImpl(), logger);
		// This should print 42 twice (one for the logger, one for the return) 
		System.out.println(loggingService.getAMagicNumber());
		// This should print [42]
		System.out.println(logger.hasLogged);
		
	}
}
