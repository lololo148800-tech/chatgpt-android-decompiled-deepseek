package p003A1;

import java.util.List;
import p156G1.C2963j;
import p156G1.C2968o;
import p692d0.AbstractC12973l;
import p692d0.C12982u;
import p692d0.C12983v;

/* JADX INFO: renamed from: A1.u1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0294u1 {

    /* JADX INFO: renamed from: a */
    public final C2963j f1064a;

    /* JADX INFO: renamed from: b */
    public final C12983v f1065b;

    public C0294u1(C2968o c2968o, C12982u c12982u) {
        this.f1064a = c2968o.f8889d;
        int[] iArr = AbstractC12973l.f41183a;
        this.f1065b = new C12983v();
        List listM3790h = C2968o.m3790h(c2968o, true, 4);
        int size = listM3790h.size();
        for (int i10 = 0; i10 < size; i10++) {
            C2968o c2968o2 = (C2968o) listM3790h.get(i10);
            if (c12982u.m14690b(c2968o2.f8892g)) {
                this.f1065b.m14698a(c2968o2.f8892g);
            }
        }
    }
}
