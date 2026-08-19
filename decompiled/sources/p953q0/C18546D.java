package p953q0;

import p025An.AbstractC0575H;
import p025An.InterfaceC0571F;
import p349O0.C5975S;
import p349O0.C5997d;
import p349O0.C6002f0;
import p492U1.C7543h;
import p571X9.AbstractC9101A4;
import p758g0.AbstractC13785r0;
import p758g0.C13756d;
import p758g0.InterfaceC13726B;
import p774h1.InterfaceC14324B;
import p843k1.C16308b;
import p887m7.C17176b;

/* JADX INFO: renamed from: q0.D */
/* JADX INFO: loaded from: classes.dex */
public final class C18546D {

    /* JADX INFO: renamed from: s */
    public static final long f59079s = AbstractC9101A4.m9631a(Integer.MAX_VALUE, Integer.MAX_VALUE);

    /* JADX INFO: renamed from: t */
    public static final /* synthetic */ int f59080t = 0;

    /* JADX INFO: renamed from: a */
    public final InterfaceC0571F f59081a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC14324B f59082b;

    /* JADX INFO: renamed from: c */
    public final C17176b f59083c;

    /* JADX INFO: renamed from: d */
    public InterfaceC13726B f59084d;

    /* JADX INFO: renamed from: e */
    public InterfaceC13726B f59085e;

    /* JADX INFO: renamed from: f */
    public InterfaceC13726B f59086f;

    /* JADX INFO: renamed from: g */
    public boolean f59087g;

    /* JADX INFO: renamed from: h */
    public final C6002f0 f59088h;

    /* JADX INFO: renamed from: i */
    public final C6002f0 f59089i;

    /* JADX INFO: renamed from: j */
    public final C6002f0 f59090j;

    /* JADX INFO: renamed from: k */
    public final C6002f0 f59091k;

    /* JADX INFO: renamed from: l */
    public long f59092l;

    /* JADX INFO: renamed from: m */
    public long f59093m;

    /* JADX INFO: renamed from: n */
    public C16308b f59094n;

    /* JADX INFO: renamed from: o */
    public final C13756d f59095o;

    /* JADX INFO: renamed from: p */
    public final C13756d f59096p;

    /* JADX INFO: renamed from: q */
    public final C6002f0 f59097q;

    /* JADX INFO: renamed from: r */
    public long f59098r;

    public C18546D(InterfaceC0571F interfaceC0571F, InterfaceC14324B interfaceC14324B, C17176b c17176b) {
        this.f59081a = interfaceC0571F;
        this.f59082b = interfaceC14324B;
        this.f59083c = c17176b;
        Boolean bool = Boolean.FALSE;
        C5975S c5975s = C5975S.f19448r0;
        this.f59088h = C5997d.m6430Q(bool, c5975s);
        this.f59089i = C5997d.m6430Q(bool, c5975s);
        this.f59090j = C5997d.m6430Q(bool, c5975s);
        this.f59091k = C5997d.m6430Q(bool, c5975s);
        long j10 = f59079s;
        this.f59092l = j10;
        this.f59093m = 0L;
        this.f59094n = interfaceC14324B != null ? interfaceC14324B.mo14860b() : null;
        this.f59095o = new C13756d(new C7543h(0L), AbstractC13785r0.f43534g, null, 12);
        this.f59096p = new C13756d(Float.valueOf(1.0f), AbstractC13785r0.f43528a, null, 12);
        this.f59097q = C5997d.m6430Q(new C7543h(0L), c5975s);
        this.f59098r = j10;
    }

    /* JADX INFO: renamed from: a */
    public final void m19911a() {
        C16308b c16308b = this.f59094n;
        InterfaceC13726B interfaceC13726B = this.f59084d;
        boolean zBooleanValue = ((Boolean) this.f59089i.getValue()).booleanValue();
        InterfaceC0571F interfaceC0571F = this.f59081a;
        if (zBooleanValue || interfaceC13726B == null || c16308b == null) {
            if (m19912b()) {
                if (c16308b != null) {
                    c16308b.m17836f(1.0f);
                }
                AbstractC0575H.m1156D(interfaceC0571F, null, null, new C18600u(this, null), 3);
                return;
            }
            return;
        }
        m19914d(true);
        boolean zM19912b = m19912b();
        boolean z6 = !zM19912b;
        if (!zM19912b) {
            c16308b.m17836f(0.0f);
        }
        AbstractC0575H.m1156D(interfaceC0571F, null, null, new C18602w(z6, this, interfaceC13726B, c16308b, null), 3);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m19912b() {
        return ((Boolean) this.f59090j.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: c */
    public final void m19913c() {
        InterfaceC14324B interfaceC14324B;
        boolean zBooleanValue = ((Boolean) this.f59088h.getValue()).booleanValue();
        InterfaceC0571F interfaceC0571F = this.f59081a;
        if (zBooleanValue) {
            m19916f(false);
            AbstractC0575H.m1156D(interfaceC0571F, null, null, new C18543A(this, null), 3);
        }
        if (((Boolean) this.f59089i.getValue()).booleanValue()) {
            m19914d(false);
            AbstractC0575H.m1156D(interfaceC0571F, null, null, new C18544B(this, null), 3);
        }
        if (m19912b()) {
            m19915e(false);
            AbstractC0575H.m1156D(interfaceC0571F, null, null, new C18545C(this, null), 3);
        }
        this.f59087g = false;
        m19917g(0L);
        this.f59092l = f59079s;
        C16308b c16308b = this.f59094n;
        if (c16308b != null && (interfaceC14324B = this.f59082b) != null) {
            interfaceC14324B.mo14859a(c16308b);
        }
        this.f59094n = null;
        this.f59084d = null;
        this.f59086f = null;
        this.f59085e = null;
    }

    /* JADX INFO: renamed from: d */
    public final void m19914d(boolean z6) {
        this.f59089i.setValue(Boolean.valueOf(z6));
    }

    /* JADX INFO: renamed from: e */
    public final void m19915e(boolean z6) {
        this.f59090j.setValue(Boolean.valueOf(z6));
    }

    /* JADX INFO: renamed from: f */
    public final void m19916f(boolean z6) {
        this.f59088h.setValue(Boolean.valueOf(z6));
    }

    /* JADX INFO: renamed from: g */
    public final void m19917g(long j10) {
        this.f59097q.setValue(new C7543h(j10));
    }
}
