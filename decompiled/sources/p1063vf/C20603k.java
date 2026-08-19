package p1063vf;

import android.app.Application;
import android.net.Uri;
import java.util.HashMap;
import ni.C17627a;
import ni.C17628b;
import p001A.C0042V0;
import p025An.AbstractC0575H;
import p025An.AbstractC0593T;
import p057C3.C1526D;
import p057C3.C1568m;
import p057C3.C1572q;
import p1016t3.C19797x;
import p103Dn.AbstractC2124C;
import p103Dn.C2127D0;
import p103Dn.C2153Q0;
import p1061vb.C20513d;
import p1073w3.AbstractC20800b;
import p1142z3.InterfaceC21739g;
import p153Fn.AbstractC2935m;
import p195Hh.C3430e;
import p201Hn.C3516e;
import p232J3.C4241m;
import p372P3.C6331m;
import p427Rc.C6844a;
import p523V9.AbstractC8168p6;
import p644ab.InterfaceC10536i;
import p849k7.C16349b;
import pf.C18402r;

/* JADX INFO: renamed from: vf.k */
/* JADX INFO: loaded from: classes3.dex */
public final class C20603k {

    /* JADX INFO: renamed from: a */
    public final C20513d f65367a;

    /* JADX INFO: renamed from: b */
    public final C17627a f65368b;

    /* JADX INFO: renamed from: c */
    public final C20608p f65369c;

    /* JADX INFO: renamed from: d */
    public final C3430e f65370d = AbstractC8168p6.m8749b("AudioStreamPlayer", null);

    /* JADX INFO: renamed from: e */
    public final C2153Q0 f65371e;

    /* JADX INFO: renamed from: f */
    public final C2153Q0 f65372f;

    /* JADX INFO: renamed from: g */
    public final C2127D0 f65373g;

    /* JADX INFO: renamed from: h */
    public final C2127D0 f65374h;

    /* JADX INFO: renamed from: i */
    public final C6844a f65375i;

    /* JADX INFO: renamed from: j */
    public final C6844a f65376j;

    /* JADX INFO: renamed from: k */
    public final C1526D f65377k;

    public C20603k(final Application application, C20513d c20513d, C17627a c17627a, C17628b c17628b, C20608p c20608p) {
        this.f65367a = c20513d;
        this.f65368b = c17627a;
        this.f65369c = c20608p;
        C2153Q0 c2153q0M3204c = AbstractC2124C.m3204c(C18402r.f58700a);
        this.f65371e = c2153q0M3204c;
        this.f65372f = c2153q0M3204c;
        C2127D0 c2127d0M3203b = AbstractC2124C.m3203b(0, 0, null, 7);
        this.f65373g = c2127d0M3203b;
        this.f65374h = c2127d0M3203b;
        this.f65375i = new C6844a();
        this.f65376j = new C6844a();
        final int i10 = 0;
        final int i11 = 1;
        C1572q c1572q = new C1572q(application, new InterfaceC10536i() { // from class: C3.n
            @Override // p644ab.InterfaceC10536i
            public final Object get() {
                switch (i10) {
                    case 0:
                        return new C1566k(application);
                    default:
                        return new C4241m(application, new C6331m());
                }
            }
        }, new InterfaceC10536i() { // from class: C3.n
            @Override // p644ab.InterfaceC10536i
            public final Object get() {
                switch (i11) {
                    case 0:
                        return new C1566k(application);
                    default:
                        return new C4241m(application, new C6331m());
                }
            }
        });
        C4241m c4241m = new C4241m(application, new C16349b(17));
        c4241m.f13857b = c20608p;
        C0042V0 c0042v0 = c4241m.f13856a;
        if (c20608p != ((InterfaceC21739g) c0042v0.f208q0)) {
            c0042v0.f208q0 = c20608p;
            ((HashMap) c0042v0.f206o0).clear();
            ((HashMap) c0042v0.f207p0).clear();
        }
        AbstractC20800b.m21320h(!c1572q.f4415s);
        c1572q.f4400d = new C1568m(c4241m, 0);
        AbstractC20800b.m21320h(!c1572q.f4415s);
        c1572q.f4415s = true;
        C1526D c1526d = new C1526D(c1572q);
        this.f65377k = c1526d;
        c17628b.m19237b(new C20594b(this, null));
        c1526d.f4100y0.m10690a(new C20595c(this));
    }

    /* JADX INFO: renamed from: a */
    public final void m21193a() {
        C3516e c3516e = AbstractC0593T.f1824a;
        this.f65376j.m7281a(AbstractC0575H.m1156D(this.f65368b, AbstractC2935m.f8797a, null, new C20596d(this, null), 2));
    }

    /* JADX INFO: renamed from: b */
    public final void m21194b(boolean z6, Uri uri) {
        if (z6) {
            uri = uri.buildUpon().appendQueryParameter("noauth", "true").build();
        }
        C3516e c3516e = AbstractC0593T.f1824a;
        this.f65375i.m7281a(AbstractC0575H.m1156D(this.f65368b, AbstractC2935m.f8797a, null, new C20601i(this, null), 2));
        C19797x c19797xM20752a = C19797x.m20752a(uri);
        C1526D c1526d = this.f65377k;
        c1526d.m4523N(c19797xM20752a);
        c1526d.m2246g0();
        c1526d.m2250k0(true);
    }
}
