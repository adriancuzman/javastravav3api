package test.api.model;

import stravajava.api.v3.model.StravaClub;
import test.utils.BeanTest;

/**
 * @author dshannon
 *
 */
public class StravaClubTest extends BeanTest<StravaClub> {

	@Override
	protected Class<StravaClub> getClassUnderTest() {
		return StravaClub.class;
	}
}