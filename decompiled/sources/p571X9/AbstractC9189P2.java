package p571X9;

import java.util.ArrayList;
import java.util.Iterator;
import p025An.C0644w;
import p1098x5.EnumC21128g;

/* JADX INFO: renamed from: X9.P2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9189P2 {
    /* JADX INFO: renamed from: a */
    public static final double m9749a(int i10, int i11, int i12, int i13, EnumC21128g enumC21128g) {
        double d10 = ((double) i12) / ((double) i10);
        double d11 = ((double) i13) / ((double) i11);
        int iOrdinal = enumC21128g.ordinal();
        if (iOrdinal == 0) {
            return Math.max(d10, d11);
        }
        if (iOrdinal == 1) {
            return Math.min(d10, d11);
        }
        throw new C0644w();
    }

    /* JADX INFO: renamed from: b */
    public static String m9750b(int i10) {
        ArrayList arrayList = new ArrayList();
        if ((i10 & 4) != 0) {
            arrayList.add("IMAGE_CAPTURE");
        }
        if ((i10 & 1) != 0) {
            arrayList.add("PREVIEW");
        }
        if ((i10 & 2) != 0) {
            arrayList.add("VIDEO_CAPTURE");
        }
        StringBuilder sb2 = new StringBuilder();
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            while (true) {
                sb2.append((CharSequence) it.next());
                if (!it.hasNext()) {
                    break;
                }
                sb2.append((CharSequence) "|");
            }
        }
        return sb2.toString();
    }
}
