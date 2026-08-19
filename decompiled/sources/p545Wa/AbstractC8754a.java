package p545Wa;

import java.util.HashMap;

/* JADX INFO: renamed from: Wa.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8754a {

    /* JADX INFO: renamed from: a */
    public static final HashMap f26674a;

    /* JADX INFO: renamed from: b */
    public static final HashMap f26675b;

    static {
        HashMap map = new HashMap();
        f26674a = map;
        HashMap map2 = new HashMap();
        f26675b = map2;
        map.put(-1, "The Play Store app is either not installed or not the official version.");
        map.put(-2, "Call first requestReviewFlow to get the ReviewInfo.");
        map.put(-100, "Retry with an exponential backoff. Consider filing a bug if fails consistently.");
        map2.put(-1, "PLAY_STORE_NOT_FOUND");
        map2.put(-2, "INVALID_REQUEST");
        map2.put(-100, "INTERNAL_ERROR");
    }
}
