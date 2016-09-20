package dao;

import model.Flag;

public class DAOFlag
{
	private Flag flag;

	public DAOFlag(Flag flag)
	{
		super();
		this.flag = flag;
	}

	public Flag getFlag()
	{
		return flag;
	}

	public void setFlag(Flag flag)
	{
		this.flag = flag;
	}

}
