package it.dontesta.liferay.portal.hook.events;

import com.liferay.portal.kernel.events.SimpleAction;
import com.liferay.portal.kernel.events.ActionException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

/**
* @author amusarra
*
*/
public class AddUserCustomFieldsStartupAction extends SimpleAction {

  @Override
  public void run(String[] ids) throws ActionException {
    if (_log.isInfoEnabled()) {
      _log.info("### Inside run method of AddUserCustomFieldsStartupAction... ###");
      for(String id: ids) {
        _log.info("Ids value: " + id);
      }
    }
  }

  private static Log _log = LogFactoryUtil.getLog(AddUserCustomFieldsStartupAction.class);
}
