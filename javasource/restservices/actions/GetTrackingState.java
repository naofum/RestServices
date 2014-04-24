// This file was generated by Mendix Business Modeler.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package restservices.actions;

import restservices.consume.ChangeLogListener;
import com.mendix.systemwideinterfaces.core.UserAction;
import com.mendix.systemwideinterfaces.core.IMendixObject;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.webui.CustomJavaAction;

/**
 * 
 */
public class GetTrackingState extends CustomJavaAction<String>
{
	private IMendixObject __feed;
	private restservices.proxies.DataSyncState feed;

	public GetTrackingState(IContext context, IMendixObject feed)
	{
		super(context);
		this.__feed = feed;
	}

	@Override
	public String executeAction() throws Exception
	{
		this.feed = __feed == null ? null : restservices.proxies.DataSyncState.initialize(getContext(), __feed);

		// BEGIN USER CODE
		return ChangeLogListener.getTrackingState(feed.getCollectionUrl()).toString();
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@Override
	public String toString()
	{
		return "GetTrackingState";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
