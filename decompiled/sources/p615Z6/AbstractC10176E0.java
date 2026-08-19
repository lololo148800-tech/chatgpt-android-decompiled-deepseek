package p615Z6;

import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import java.util.HashMap;
import p1071w0.AbstractC20734X;

/* JADX INFO: renamed from: Z6.E0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC10176E0 {

    /* JADX INFO: renamed from: a */
    public static final HashMap f30124a;

    static {
        HashMap map = new HashMap(13);
        f30124a = map;
        Integer numValueOf = Integer.valueOf(RCHTTPStatusCodes.BAD_REQUEST);
        map.put("normal", numValueOf);
        map.put("bold", 700);
        AbstractC20734X.m21225B(1, map, "bolder", -1, "lighter");
        AbstractC20734X.m21225B(100, map, "100", RCHTTPStatusCodes.SUCCESS, "200");
        map.put("300", Integer.valueOf(RCHTTPStatusCodes.UNSUCCESSFUL));
        map.put("400", numValueOf);
        AbstractC20734X.m21225B(500, map, "500", 600, "600");
        AbstractC20734X.m21227D(map, "700", 700, 800, "800");
        map.put("900", 900);
    }
}
