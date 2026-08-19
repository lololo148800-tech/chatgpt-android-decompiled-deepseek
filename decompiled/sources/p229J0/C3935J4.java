package p229J0;

import p1139z0.C21585H;
import p349O0.C5994b0;
import p349O0.C5997d;
import p530Vi.AbstractC8301I;
import p594Y9.AbstractC9828W3;

/* JADX INFO: renamed from: J0.J4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3935J4 {

    /* JADX INFO: renamed from: d */
    public static final C21585H f12114d = AbstractC9828W3.m10471b(C3929I4.f12085Z, C4161y.f13492F0);

    /* JADX INFO: renamed from: a */
    public final C5994b0 f12115a;

    /* JADX INFO: renamed from: b */
    public final C5994b0 f12116b;

    /* JADX INFO: renamed from: c */
    public final C5994b0 f12117c;

    public C3935J4(float f10, float f11, float f12) {
        this.f12115a = C5997d.m6428O(f10);
        this.f12116b = C5997d.m6428O(f12);
        this.f12117c = C5997d.m6428O(f11);
    }

    /* JADX INFO: renamed from: a */
    public final float m4635a() {
        C5994b0 c5994b0 = this.f12115a;
        if (c5994b0.m6409g() == 0.0f) {
            return 0.0f;
        }
        return this.f12117c.m6409g() / c5994b0.m6409g();
    }

    /* JADX INFO: renamed from: b */
    public final void m4636b(float f10) {
        this.f12117c.m6410h(AbstractC8301I.m8920k(f10, this.f12115a.m6409g(), 0.0f));
    }
}
