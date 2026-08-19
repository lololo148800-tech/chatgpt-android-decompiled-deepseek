package p229J0;

import p001A.AbstractC0010F;
import p025An.C0644w;
import p1051v0.AbstractC20417e;
import p1051v0.C20414b;
import p1051v0.C20416d;
import p349O0.C5984W0;
import p349O0.C6021p;
import p774h1.AbstractC14334L;
import p774h1.InterfaceC14339Q;

/* JADX INFO: renamed from: J0.u3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4141u3 {

    /* JADX INFO: renamed from: a */
    public static final C5984W0 f13417a = new C5984W0(C3954N0.f12268w0);

    /* JADX INFO: renamed from: a */
    public static final InterfaceC14339Q m4770a(int i10, C6021p c6021p) {
        C4135t3 c4135t3 = (C4135t3) c6021p.m6548k(f13417a);
        switch (AbstractC0010F.m24h(i10)) {
            case 0:
                return c4135t3.f13381e;
            case 1:
                return m4771b(c4135t3.f13381e);
            case 2:
                return c4135t3.f13377a;
            case 3:
                return m4771b(c4135t3.f13377a);
            case 4:
                return AbstractC20417e.f64539a;
            case 5:
                return c4135t3.f13380d;
            case 6:
                float f10 = (float) 0.0d;
                return C20416d.m21078a(c4135t3.f13380d, new C20414b(f10), null, null, new C20414b(f10), 6);
            case 7:
                return m4771b(c4135t3.f13380d);
            case 8:
                return c4135t3.f13379c;
            case 9:
                return AbstractC14334L.f44973a;
            case 10:
                return c4135t3.f13378b;
            default:
                throw new C0644w();
        }
    }

    /* JADX INFO: renamed from: b */
    public static final C20416d m4771b(C20416d c20416d) {
        float f10 = (float) 0.0d;
        return C20416d.m21078a(c20416d, null, null, new C20414b(f10), new C20414b(f10), 3);
    }
}
