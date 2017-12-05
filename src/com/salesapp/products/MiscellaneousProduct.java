/**
 * 
 */
package com.salesapp.products;

import com.salesapp.productfactories.MiscellaneousProductFactory;
import com.salesapp.productfactories.ProductFactory;
import com.salesapp.taxcalculations.LocalTaxValues;

/**
 * MiscellaneousProduct is an item belonging to the category 'Miscellaneous' in the shopping store.
 *
 * @author archugs
 */
public class MiscellaneousProduct extends Product {


	/**
	 * Default constructor to initialize a new miscellaneous product.
	 */
	public MiscellaneousProduct()
	{
		super();
	}

	/**
	 * Parameterized constructor to initialize the values of the <code>MiscellaneousProduct</code> attributes.
	 *
	 * @param name - the name of the miscellaneous product
	 * @param price - the price of the miscellaneous product
	 * @param imported - boolean value of whether the miscellaneous product imported or not
	 * @param quantity - quantity of miscellaneous product items
	 */	
	public MiscellaneousProduct(String name, double price, boolean imported, int quantity) 
	{
		super(name, price, imported, quantity);
		
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @return MiscellaneousProductFactory
	 */
	@Override
	public MiscellaneousProductFactory getFactory() 
	{
		
		return new MiscellaneousProductFactory();
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public double getTaxValue(String country)
	{
		if(country == "Local")
		{
		return LocalTaxValues.MISC_TAX.getTax();
		}
		else
		{
			return 0;
		}
	}
}
