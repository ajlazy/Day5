package factorial;

public class Factorial {public static int getFactorial(int num) throws InvalidInputException, FactorialException {
	int result = 1;
	if(num<2)
		throw new InvalidInputException("number less than two");
	

	for(int i=1;i<=num;i++)
	{
		if(result>result+result)
			throw new FactorialException("number too long for int");
		else
			result*=i;
		
	}
	
	return result;
}

}






