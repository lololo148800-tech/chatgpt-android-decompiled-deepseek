package p615Z6;

import java.util.HashMap;

/* JADX INFO: renamed from: Z6.D0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC10174D0 {

    /* JADX INFO: renamed from: a */
    public static final HashMap f30119a;

    static {
        HashMap map = new HashMap(9);
        f30119a = map;
        map.put("xx-small", new C10173D(7, 0.694f));
        map.put("x-small", new C10173D(7, 0.833f));
        map.put("small", new C10173D(7, 10.0f));
        map.put("medium", new C10173D(7, 12.0f));
        map.put("large", new C10173D(7, 14.4f));
        map.put("x-large", new C10173D(7, 17.3f));
        map.put("xx-large", new C10173D(7, 20.7f));
        map.put("smaller", new C10173D(9, 83.33f));
        map.put("larger", new C10173D(9, 120.0f));
    }
}
