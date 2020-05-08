////////////////////////////////////////////////////////////////////////
//
// DataValueSubCodeListValidator.java
//
// This file was generated by MapForce 2020r2.
//
// YOU SHOULD NOT MODIFY THIS FILE, BECAUSE IT WILL BE
// OVERWRITTEN WHEN YOU RE-RUN CODE GENERATION.
//
// Refer to the MapForce Documentation for further details.
// http://www.altova.com/mapforce
//
////////////////////////////////////////////////////////////////////////

package com.altova.text.edi;

public class DataValueSubCodeListValidator extends DataValueCodeListValidator {
	int mPosOffset;
	int mPosLength;
	
	public DataValueSubCodeListValidator(boolean complete, int posOffset, int posLength, String[] codeList) {
		super(complete, codeList);
		mPosOffset = posOffset;
		mPosLength = posLength;
	}

	public boolean hasValue(String value) {
		if (mCodeList != null) {
			if (mPosOffset > 0) {
				value = value.substring( mPosOffset - 1, mPosOffset - 1 + mPosLength );
			}
			for (int i = 0; i < mCodeList.length; i++) {
				if (value.equals( mCodeList[i]))
					return true;
			}
		} else
			return true;
		
		return false;
	}

}