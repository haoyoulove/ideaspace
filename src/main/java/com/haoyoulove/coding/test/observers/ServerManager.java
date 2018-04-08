package com.haoyoulove.coding.test.observers;

import java.util.Observable;

/**
 * @author yangjing
 */
public class ServerManager extends Observable {

	private int data = 0;
	public int getData(){         return data;    }

	public void setData(int i){
		if(this.data != i){
			this.data = i;
			setChanged();
		}
		notifyObservers(this);  //只有在setChange()被调用后，notifyObservers()才会去调用update()，否则什么都不干。  } }
	}
}
