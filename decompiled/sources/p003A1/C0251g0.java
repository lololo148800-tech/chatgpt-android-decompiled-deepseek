package p003A1;

import mm.C17296C;
import p002A0.C0120T;
import p025An.AbstractC0575H;
import p025An.C0624m;
import p080D0.C1803f0;
import p080D0.C1837w0;
import p229J0.C3899D4;
import p229J0.DialogC4038d2;
import p349O0.InterfaceC5948E;
import p474T8.C7265c;
import p523V9.AbstractC7841A0;
import p553Wh.C8865a;
import p553Wh.C8870f;
import p587Y1.C9592r;
import p587Y1.DialogC9590p;
import p795i.C14887a;
import p795i.C14889c;
import p841k.C16288h;
import p893n.AbstractActivityC17375g;
import p953q0.C18552J;
import p953q0.C18562U;
import p953q0.C18566Y;

/* JADX INFO: renamed from: A1.g0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0251g0 implements InterfaceC5948E {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f942a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f943b;

    public /* synthetic */ C0251g0(Object obj, int i10) {
        this.f942a = i10;
        this.f943b = obj;
    }

    @Override // p349O0.InterfaceC5948E
    public final void dispose() {
        C17296C c17296c;
        switch (this.f942a) {
            case 0:
                ((C0196P0) this.f943b).f733a.invoke();
                return;
            case 1:
                C1803f0 c1803f0 = (C1803f0) this.f943b;
                c1803f0.m2597i();
                c1803f0.f5186i.setValue(Boolean.FALSE);
                return;
            case 2:
                DialogC4038d2 dialogC4038d2 = (DialogC4038d2) this.f943b;
                dialogC4038d2.dismiss();
                dialogC4038d2.f12716s0.m734e();
                return;
            case 3:
                C0624m c0624m = ((C3899D4) this.f943b).f11884d;
                if (c0624m != null) {
                    c0624m.mo1244b(null);
                    return;
                }
                return;
            case 4:
                ((C7265c) this.f943b).f23042r0 = null;
                return;
            case 5:
                ((AbstractActivityC17375g) this.f943b).getWindow().clearFlags(128);
                return;
            case 6:
                DialogC9590p dialogC9590p = (DialogC9590p) this.f943b;
                dialogC9590p.dismiss();
                dialogC9590p.f28857s0.m734e();
                return;
            case 7:
                C9592r c9592r = (C9592r) this.f943b;
                c9592r.m734e();
                AbstractC7841A0.m8092d(c9592r, null);
                c9592r.f28865B0.removeViewImmediate(c9592r);
                return;
            case 8:
                C16288h c16288h = ((C14887a) this.f943b).f46373a;
                if (c16288h != null) {
                    c16288h.m17824d();
                    c17296c = C17296C.f55119a;
                } else {
                    c17296c = null;
                }
                if (c17296c == null) {
                    throw new IllegalStateException("Launcher has not been initialized");
                }
                return;
            case 9:
                ((C14889c) this.f943b).m15540b();
                return;
            case 10:
                ((C18552J) this.f943b).f59115d = null;
                return;
            case 11:
                ((C18566Y) this.f943b).f59147d = null;
                return;
            case 12:
                C18562U c18562u = (C18562U) this.f943b;
                int iM6412g = c18562u.f59138d.m6412g();
                for (int i10 = 0; i10 < iM6412g; i10++) {
                    c18562u.m19941b();
                }
                return;
            case 13:
                C8870f c8870f = (C8870f) this.f943b;
                c8870f.getClass();
                AbstractC0575H.m1156D(c8870f.f27153f, null, null, new C8865a(c8870f, null), 3);
                return;
            case 14:
                C0120T c0120t = (C0120T) this.f943b;
                c0120t.m414s();
                c0120t.f507i = null;
                c0120t.f508j = null;
                c0120t.f506h = null;
                return;
            default:
                ((C1837w0) this.f943b).m2687k();
                return;
        }
    }
}
