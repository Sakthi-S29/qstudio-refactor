package com.timestored.qstudio.open;

/**
 * Interface to allow retrieving connection details from somewhere external to qStudio. 
 */
public interface DatabaseAuthenticationService {

	/**
	 * @param connectionDetails The connection details as stored in qStudio.
	 * @return Whatever you return will be the details used for connecting to kdb.
	 */
	public ConnectionDetails getonConnectionDetails(ConnectionDetails connectionDetails);

}
