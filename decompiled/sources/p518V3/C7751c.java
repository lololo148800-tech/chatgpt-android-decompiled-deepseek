package p518V3;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import p1073w3.C20811m;
import p228J.AbstractC3812N;

/* JADX INFO: renamed from: V3.c */
/* JADX INFO: loaded from: classes.dex */
public final class C7751c extends AbstractC3812N {

    /* JADX INFO: renamed from: o0 */
    public long f24446o0;

    /* JADX INFO: renamed from: p0 */
    public long[] f24447p0;

    /* JADX INFO: renamed from: q0 */
    public long[] f24448q0;

    /* JADX INFO: renamed from: Q */
    public static Serializable m8010Q(int i10, C20811m c20811m) {
        if (i10 == 0) {
            return Double.valueOf(Double.longBitsToDouble(c20811m.m21359n()));
        }
        if (i10 == 1) {
            return Boolean.valueOf(c20811m.m21365t() == 1);
        }
        if (i10 == 2) {
            return m8012S(c20811m);
        }
        if (i10 != 3) {
            if (i10 == 8) {
                return m8011R(c20811m);
            }
            if (i10 != 10) {
                if (i10 != 11) {
                    return null;
                }
                Date date = new Date((long) Double.longBitsToDouble(c20811m.m21359n()));
                c20811m.m21345G(2);
                return date;
            }
            int iM21369x = c20811m.m21369x();
            ArrayList arrayList = new ArrayList(iM21369x);
            for (int i11 = 0; i11 < iM21369x; i11++) {
                Serializable serializableM8010Q = m8010Q(c20811m.m21365t(), c20811m);
                if (serializableM8010Q != null) {
                    arrayList.add(serializableM8010Q);
                }
            }
            return arrayList;
        }
        HashMap map = new HashMap();
        while (true) {
            String strM8012S = m8012S(c20811m);
            int iM21365t = c20811m.m21365t();
            if (iM21365t == 9) {
                return map;
            }
            Serializable serializableM8010Q2 = m8010Q(iM21365t, c20811m);
            if (serializableM8010Q2 != null) {
                map.put(strM8012S, serializableM8010Q2);
            }
        }
    }

    /* JADX INFO: renamed from: R */
    public static HashMap m8011R(C20811m c20811m) {
        int iM21369x = c20811m.m21369x();
        HashMap map = new HashMap(iM21369x);
        for (int i10 = 0; i10 < iM21369x; i10++) {
            String strM8012S = m8012S(c20811m);
            Serializable serializableM8010Q = m8010Q(c20811m.m21365t(), c20811m);
            if (serializableM8010Q != null) {
                map.put(strM8012S, serializableM8010Q);
            }
        }
        return map;
    }

    /* JADX INFO: renamed from: S */
    public static String m8012S(C20811m c20811m) {
        int iM21371z = c20811m.m21371z();
        int i10 = c20811m.f66093b;
        c20811m.m21345G(iM21371z);
        return new String(c20811m.f66092a, i10, iM21371z);
    }
}
