/*
Copyright  © Trustonic Limited 2013

All rights reserved.

Redistribution and use in source and binary forms, with or without modification, 
are permitted provided that the following conditions are met:

  1. Redistributions of source code must retain the above copyright notice, this 
     list of conditions and the following disclaimer.

  2. Redistributions in binary form must reproduce the above copyright notice, 
     this list of conditions and the following disclaimer in the documentation 
     and/or other materials provided with the distribution.

  3. Neither the name of the Trustonic Limited nor the names of its contributors 
     may be used to endorse or promote products derived from this software 
     without specific prior written permission.

THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND 
ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED 
WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. 
IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, 
INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, 
BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, 
DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF 
LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE 
OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED 
OF THE POSSIBILITY OF SUCH DAMAGE.
*/

package com.gd.mobicore.pa.ifc;

import android.os.Parcel;

/**
 * Lifecycle states of SP containers.
 */
public class SPContainerStateParcel extends AbstractEnumParcel<SPContainerState> {
	/**
	 * Reads the enumerated value from the given parcel.
	 * @param source parcel containing a single string value representing the enumeration
	 * @throws IllegalArgumentException if the parcel contains a string that does not resolve to an enumeration
	 */
	public void readFromParcel(final Parcel source) {
		final String value = source.readString();
		if (value != null)
			setEnumeratedValue(SPContainerState.valueOf(value));
	}

	public static final Creator<SPContainerStateParcel> CREATOR = new Creator<SPContainerStateParcel>() {
		@Override
		public SPContainerStateParcel createFromParcel(Parcel source) {
			final SPContainerStateParcel cs = new SPContainerStateParcel();
			cs.readFromParcel(source);
			return cs;
		}

		@Override
		public SPContainerStateParcel[] newArray(int size) {
			return new SPContainerStateParcel[size];
		}
	};
}
