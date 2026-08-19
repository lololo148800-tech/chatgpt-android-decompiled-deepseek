package p1071w0;

import p003A1.InterfaceC0300w1;
import p049Bm.InterfaceC1436k;
import p1095x1.InterfaceC21098s;
import p204I1.AbstractC3591g;
import p204I1.C3581L;
import p204I1.C3590f;
import p349O0.C5975S;
import p349O0.C5997d;
import p349O0.C6002f0;
import p349O0.C6018n0;
import p350O1.C6045C;
import p350O1.C6049G;
import p350O1.C6061j;
import p492U1.C7540e;
import p774h1.AbstractC14334L;
import p774h1.C14365u;
import p813ij.C15026j;
import p985r9.C18903m;

/* JADX INFO: renamed from: w0.g0 */
/* JADX INFO: loaded from: classes.dex */
public final class C20750g0 {

    /* JADX INFO: renamed from: a */
    public C20770q0 f65810a;

    /* JADX INFO: renamed from: b */
    public final C6018n0 f65811b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC0300w1 f65812c;

    /* JADX INFO: renamed from: d */
    public final C15026j f65813d;

    /* JADX INFO: renamed from: e */
    public C6049G f65814e;

    /* JADX INFO: renamed from: f */
    public final C6002f0 f65815f;

    /* JADX INFO: renamed from: g */
    public final C6002f0 f65816g;

    /* JADX INFO: renamed from: h */
    public InterfaceC21098s f65817h;

    /* JADX INFO: renamed from: i */
    public final C6002f0 f65818i;

    /* JADX INFO: renamed from: j */
    public C3590f f65819j;

    /* JADX INFO: renamed from: k */
    public final C6002f0 f65820k;

    /* JADX INFO: renamed from: l */
    public final C6002f0 f65821l;

    /* JADX INFO: renamed from: m */
    public final C6002f0 f65822m;

    /* JADX INFO: renamed from: n */
    public final C6002f0 f65823n;

    /* JADX INFO: renamed from: o */
    public final C6002f0 f65824o;

    /* JADX INFO: renamed from: p */
    public boolean f65825p;

    /* JADX INFO: renamed from: q */
    public final C6002f0 f65826q;

    /* JADX INFO: renamed from: r */
    public final C20742c0 f65827r;

    /* JADX INFO: renamed from: s */
    public InterfaceC1436k f65828s;

    /* JADX INFO: renamed from: t */
    public final C20709G f65829t;

    /* JADX INFO: renamed from: u */
    public final C20709G f65830u;

    /* JADX INFO: renamed from: v */
    public final C18903m f65831v;

    /* JADX INFO: renamed from: w */
    public long f65832w;

    /* JADX INFO: renamed from: x */
    public final C6002f0 f65833x;

    /* JADX INFO: renamed from: y */
    public final C6002f0 f65834y;

    public C20750g0(C20770q0 c20770q0, C6018n0 c6018n0, InterfaceC0300w1 interfaceC0300w1) {
        this.f65810a = c20770q0;
        this.f65811b = c6018n0;
        this.f65812c = interfaceC0300w1;
        C15026j c15026j = new C15026j();
        C3590f c3590f = AbstractC3591g.f10938a;
        long j10 = C3581L.f10906b;
        C6045C c6045c = new C6045C(c3590f, j10, (C3581L) null);
        c15026j.f46724Y = c6045c;
        c15026j.f46725Z = new C6061j(c3590f, c6045c.f19683b);
        this.f65813d = c15026j;
        Boolean bool = Boolean.FALSE;
        C5975S c5975s = C5975S.f19448r0;
        this.f65815f = C5997d.m6430Q(bool, c5975s);
        this.f65816g = C5997d.m6430Q(new C7540e(0), c5975s);
        this.f65818i = C5997d.m6430Q(null, c5975s);
        this.f65820k = C5997d.m6430Q(EnumC20730T.f65728Y, c5975s);
        this.f65821l = C5997d.m6430Q(bool, c5975s);
        this.f65822m = C5997d.m6430Q(bool, c5975s);
        this.f65823n = C5997d.m6430Q(bool, c5975s);
        this.f65824o = C5997d.m6430Q(bool, c5975s);
        this.f65825p = true;
        this.f65826q = C5997d.m6430Q(Boolean.TRUE, c5975s);
        this.f65827r = new C20742c0(interfaceC0300w1);
        this.f65828s = C20745e.f65763s0;
        this.f65829t = new C20709G(this, 5);
        this.f65830u = new C20709G(this, 4);
        this.f65831v = AbstractC14334L.m15630h();
        this.f65832w = C14365u.f45060j;
        this.f65833x = C5997d.m6430Q(new C3581L(j10), c5975s);
        this.f65834y = C5997d.m6430Q(new C3581L(j10), c5975s);
    }

    /* JADX INFO: renamed from: a */
    public final EnumC20730T m21291a() {
        return (EnumC20730T) this.f65820k.getValue();
    }

    /* JADX INFO: renamed from: b */
    public final boolean m21292b() {
        return ((Boolean) this.f65815f.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: c */
    public final InterfaceC21098s m21293c() {
        InterfaceC21098s interfaceC21098s = this.f65817h;
        if (interfaceC21098s == null || !interfaceC21098s.mo21522h()) {
            return null;
        }
        return interfaceC21098s;
    }

    /* JADX INFO: renamed from: d */
    public final C20710G0 m21294d() {
        return (C20710G0) this.f65818i.getValue();
    }

    /* JADX INFO: renamed from: e */
    public final void m21295e(long j10) {
        this.f65834y.setValue(new C3581L(j10));
    }

    /* JADX INFO: renamed from: f */
    public final void m21296f(long j10) {
        this.f65833x.setValue(new C3581L(j10));
    }
}
