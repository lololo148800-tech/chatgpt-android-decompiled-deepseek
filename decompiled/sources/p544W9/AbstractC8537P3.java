package p544W9;

import java.util.Set;
import p1155zi.C22038o;
import p1155zi.EnumC22026l;
import p327N0.C5571a;
import p948pi.C18418a;

/* JADX INFO: renamed from: W9.P3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8537P3 {
    /* JADX INFO: renamed from: a */
    public static float m9200a(int i10) {
        int i11;
        if (C5571a.m5978a(i10, 2)) {
            i11 = 900;
        } else {
            i11 = C5571a.m5978a(i10, 1) ? 480 : 0;
        }
        return i11;
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m9201b(C18418a c18418a) {
        C22038o c22038o;
        Set set;
        return c18418a.f58773a.f58783b && ((c22038o = c18418a.f58774b.f69415a) == null || (set = c22038o.f69717g) == null || !set.contains(EnumC22026l.NoAuthTrainingEnabled));
    }
}
