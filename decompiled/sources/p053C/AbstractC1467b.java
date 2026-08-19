package p053C;

import android.hardware.camera2.params.DynamicRangeProfiles;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import p178H.C3175v;

/* JADX INFO: renamed from: C.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1467b {

    /* JADX INFO: renamed from: a */
    public static final HashMap f3876a;

    /* JADX INFO: renamed from: b */
    public static final HashMap f3877b;

    static {
        C3175v c3175v;
        HashMap map = new HashMap();
        f3876a = map;
        HashMap map2 = new HashMap();
        f3877b = map2;
        C3175v c3175v2 = C3175v.f9575d;
        map.put(1L, c3175v2);
        map2.put(c3175v2, Collections.singletonList(1L));
        map.put(2L, C3175v.f9576e);
        map2.put((C3175v) map.get(2L), Collections.singletonList(2L));
        C3175v c3175v3 = C3175v.f9577f;
        map.put(4L, c3175v3);
        map2.put(c3175v3, Collections.singletonList(4L));
        C3175v c3175v4 = C3175v.f9578g;
        map.put(8L, c3175v4);
        map2.put(c3175v4, Collections.singletonList(8L));
        List listAsList = Arrays.asList(64L, 128L, 16L, 32L);
        Iterator it = listAsList.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            c3175v = C3175v.f9579h;
            if (!zHasNext) {
                break;
            } else {
                f3876a.put((Long) it.next(), c3175v);
            }
        }
        f3877b.put(c3175v, listAsList);
        List listAsList2 = Arrays.asList(1024L, 2048L, 256L, 512L);
        Iterator it2 = listAsList2.iterator();
        while (true) {
            boolean zHasNext2 = it2.hasNext();
            C3175v c3175v5 = C3175v.f9580i;
            if (!zHasNext2) {
                f3877b.put(c3175v5, listAsList2);
                return;
            }
            f3876a.put((Long) it2.next(), c3175v5);
        }
    }

    /* JADX INFO: renamed from: a */
    public static Long m2107a(C3175v c3175v, DynamicRangeProfiles dynamicRangeProfiles) {
        List<Long> list = (List) f3877b.get(c3175v);
        if (list == null) {
            return null;
        }
        Set supportedProfiles = dynamicRangeProfiles.getSupportedProfiles();
        for (Long l4 : list) {
            if (supportedProfiles.contains(l4)) {
                return l4;
            }
        }
        return null;
    }
}
