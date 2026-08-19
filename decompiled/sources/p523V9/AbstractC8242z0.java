package p523V9;

import android.os.Bundle;
import androidx.lifecycle.C11082S;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import p1004s4.C19447g;
import p1071w0.AbstractC20740b0;
import p492U1.C7536a;
import p530Vi.AbstractC8301I;
import p571X9.AbstractC9160K3;
import p571X9.AbstractC9388w4;

/* JADX INFO: renamed from: V9.z0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8242z0 {
    /* JADX INFO: renamed from: a */
    public static C11082S m8888a(Bundle bundle, Bundle bundle2) {
        if (bundle == null) {
            if (bundle2 == null) {
                return new C11082S();
            }
            HashMap map = new HashMap();
            for (String key : bundle2.keySet()) {
                AbstractC16544l.m18093f(key, "key");
                map.put(key, bundle2.get(key));
            }
            return new C11082S(map);
        }
        ClassLoader classLoader = C11082S.class.getClassLoader();
        AbstractC16544l.m18091d(classLoader);
        bundle.setClassLoader(classLoader);
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("keys");
        ArrayList parcelableArrayList2 = bundle.getParcelableArrayList("values");
        if (parcelableArrayList == null || parcelableArrayList2 == null || parcelableArrayList.size() != parcelableArrayList2.size()) {
            throw new IllegalStateException("Invalid bundle passed as restored state");
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int size = parcelableArrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            Object obj = parcelableArrayList.get(i10);
            AbstractC16544l.m18092e(obj, "null cannot be cast to non-null type kotlin.String");
            linkedHashMap.put((String) obj, parcelableArrayList2.get(i10));
        }
        return new C11082S(linkedHashMap);
    }

    /* JADX INFO: renamed from: b */
    public static final long m8889b(float f10, int i10, long j10, boolean z6) {
        int iM7854i = ((z6 || AbstractC9160K3.m9708a(i10, 2)) && C7536a.m7850e(j10)) ? C7536a.m7854i(j10) : Integer.MAX_VALUE;
        if (C7536a.m7856k(j10) != iM7854i) {
            iM7854i = AbstractC8301I.m8921l(AbstractC20740b0.m21275p(f10), C7536a.m7856k(j10), iM7854i);
        }
        int iM7853h = C7536a.m7853h(j10);
        int iMin = Math.min(0, 262142);
        int iMin2 = iM7854i == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(iM7854i, 262142);
        int iM9960c = AbstractC9388w4.m9960c(iMin2 == Integer.MAX_VALUE ? iMin : iMin2);
        return AbstractC9388w4.m9958a(iMin, iMin2, Math.min(iM9960c, 0), iM7853h != Integer.MAX_VALUE ? Math.min(iM9960c, iM7853h) : Integer.MAX_VALUE);
    }

    /* JADX INFO: renamed from: c */
    public static C19447g m8890c(C19447g c19447g, String[] strArr, Map map) {
        int i10 = 0;
        if (c19447g == null) {
            if (strArr == null) {
                return null;
            }
            if (strArr.length == 1) {
                return (C19447g) map.get(strArr[0]);
            }
            if (strArr.length > 1) {
                C19447g c19447g2 = new C19447g();
                int length = strArr.length;
                while (i10 < length) {
                    c19447g2.m20537a((C19447g) map.get(strArr[i10]));
                    i10++;
                }
                return c19447g2;
            }
        } else {
            if (strArr != null && strArr.length == 1) {
                c19447g.m20537a((C19447g) map.get(strArr[0]));
                return c19447g;
            }
            if (strArr != null && strArr.length > 1) {
                int length2 = strArr.length;
                while (i10 < length2) {
                    c19447g.m20537a((C19447g) map.get(strArr[i10]));
                    i10++;
                }
            }
        }
        return c19447g;
    }
}
