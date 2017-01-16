package momentum_aml.transferfunctions;

import momentum_aml.TransferFunction;

public class SigmoidalTransfer implements TransferFunction 
{
	@Override
	public double evalute(double value) 
	{
		return 1 / (1 + Math.pow(Math.E, - value));
	}

	@Override
	public double evaluteDerivate(double value) 
	{
		return (value - Math.pow(value, 2));
	}
}

