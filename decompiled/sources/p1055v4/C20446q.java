package p1055v4;

import java.util.Collections;
import p1016t3.AbstractC19754D;
import p1016t3.C19755E;
import p1016t3.C19787n;
import p1016t3.C19788o;
import p1073w3.AbstractC20800b;
import p1073w3.C20811m;
import p372P3.AbstractC6320b;
import p372P3.C6318J;
import p372P3.C6319a;
import p372P3.InterfaceC6316H;
import p372P3.InterfaceC6335q;
import p734ep.C13458b;

/* JADX INFO: renamed from: v4.q */
/* JADX INFO: loaded from: classes.dex */
public final class C20446q implements InterfaceC20435f {

    /* JADX INFO: renamed from: a */
    public final String f64827a;

    /* JADX INFO: renamed from: b */
    public final int f64828b;

    /* JADX INFO: renamed from: c */
    public final C20811m f64829c;

    /* JADX INFO: renamed from: d */
    public final C6318J f64830d;

    /* JADX INFO: renamed from: e */
    public InterfaceC6316H f64831e;

    /* JADX INFO: renamed from: f */
    public String f64832f;

    /* JADX INFO: renamed from: g */
    public C19788o f64833g;

    /* JADX INFO: renamed from: h */
    public int f64834h;

    /* JADX INFO: renamed from: i */
    public int f64835i;

    /* JADX INFO: renamed from: j */
    public int f64836j;

    /* JADX INFO: renamed from: k */
    public int f64837k;

    /* JADX INFO: renamed from: l */
    public long f64838l;

    /* JADX INFO: renamed from: m */
    public boolean f64839m;

    /* JADX INFO: renamed from: n */
    public int f64840n;

    /* JADX INFO: renamed from: o */
    public int f64841o;

    /* JADX INFO: renamed from: p */
    public int f64842p;

    /* JADX INFO: renamed from: q */
    public boolean f64843q;

    /* JADX INFO: renamed from: r */
    public long f64844r;

    /* JADX INFO: renamed from: s */
    public int f64845s;

    /* JADX INFO: renamed from: t */
    public long f64846t;

    /* JADX INFO: renamed from: u */
    public int f64847u;

    /* JADX INFO: renamed from: v */
    public String f64848v;

    public C20446q(String str, int i10) {
        this.f64827a = str;
        this.f64828b = i10;
        C20811m c20811m = new C20811m(1024);
        this.f64829c = c20811m;
        byte[] bArr = c20811m.f66092a;
        this.f64830d = new C6318J(bArr.length, bArr);
        this.f64838l = -9223372036854775807L;
    }

    @Override // p1055v4.InterfaceC20435f
    /* JADX INFO: renamed from: b */
    public final void mo21088b(C20811m c20811m) throws C19755E {
        int iM6872i;
        boolean zM6871h;
        AbstractC20800b.m21321i(this.f64831e);
        while (c20811m.m21346a() > 0) {
            int i10 = this.f64834h;
            if (i10 != 0) {
                if (i10 != 1) {
                    C20811m c20811m2 = this.f64829c;
                    C6318J c6318j = this.f64830d;
                    if (i10 == 2) {
                        int iM21365t = ((this.f64837k & (-225)) << 8) | c20811m.m21365t();
                        this.f64836j = iM21365t;
                        if (iM21365t > c20811m2.f66092a.length) {
                            c20811m2.m21341C(iM21365t);
                            byte[] bArr = c20811m2.f66092a;
                            c6318j.getClass();
                            c6318j.m6878o(bArr.length, bArr);
                        }
                        this.f64835i = 0;
                        this.f64834h = 3;
                    } else {
                        if (i10 != 3) {
                            throw new IllegalStateException();
                        }
                        int iMin = Math.min(c20811m.m21346a(), this.f64836j - this.f64835i);
                        c20811m.m21350e(c6318j.f20467d, this.f64835i, iMin);
                        int i11 = this.f64835i + iMin;
                        this.f64835i = i11;
                        if (i11 == this.f64836j) {
                            c6318j.m6880q(0);
                            if (c6318j.m6871h()) {
                                if (this.f64839m) {
                                }
                                this.f64834h = 0;
                            } else {
                                this.f64839m = true;
                                int iM6872i2 = c6318j.m6872i(1);
                                int iM6872i3 = iM6872i2 == 1 ? c6318j.m6872i(1) : 0;
                                this.f64840n = iM6872i3;
                                if (iM6872i3 != 0) {
                                    throw C19755E.m20712a(null, null);
                                }
                                if (iM6872i2 == 1) {
                                    c6318j.m6872i((c6318j.m6872i(2) + 1) * 8);
                                }
                                if (!c6318j.m6871h()) {
                                    throw C19755E.m20712a(null, null);
                                }
                                this.f64841o = c6318j.m6872i(6);
                                int iM6872i4 = c6318j.m6872i(4);
                                int iM6872i5 = c6318j.m6872i(3);
                                if (iM6872i4 != 0 || iM6872i5 != 0) {
                                    throw C19755E.m20712a(null, null);
                                }
                                if (iM6872i2 == 0) {
                                    int iM6870g = c6318j.m6870g();
                                    int iM6865b = c6318j.m6865b();
                                    C6319a c6319aM6898n = AbstractC6320b.m6898n(c6318j, true);
                                    this.f64848v = c6319aM6898n.f20469a;
                                    this.f64845s = c6319aM6898n.f20470b;
                                    this.f64847u = c6319aM6898n.f20471c;
                                    int iM6865b2 = iM6865b - c6318j.m6865b();
                                    c6318j.m6880q(iM6870g);
                                    byte[] bArr2 = new byte[(iM6865b2 + 7) / 8];
                                    c6318j.m6873j(iM6865b2, bArr2);
                                    C19787n c19787n = new C19787n();
                                    c19787n.f62703a = this.f64832f;
                                    c19787n.f62714l = AbstractC19754D.m20711i("audio/mp4a-latm");
                                    c19787n.f62711i = this.f64848v;
                                    c19787n.f62728z = this.f64847u;
                                    c19787n.f62694A = this.f64845s;
                                    c19787n.f62717o = Collections.singletonList(bArr2);
                                    c19787n.f62706d = this.f64827a;
                                    c19787n.f62708f = this.f64828b;
                                    C19788o c19788o = new C19788o(c19787n);
                                    if (!c19788o.equals(this.f64833g)) {
                                        this.f64833g = c19788o;
                                        this.f64846t = 1024000000 / ((long) c19788o.f62730B);
                                        this.f64831e.mo4971d(c19788o);
                                    }
                                } else {
                                    int iM6872i6 = c6318j.m6872i((c6318j.m6872i(2) + 1) * 8);
                                    int iM6865b3 = c6318j.m6865b();
                                    C6319a c6319aM6898n2 = AbstractC6320b.m6898n(c6318j, true);
                                    this.f64848v = c6319aM6898n2.f20469a;
                                    this.f64845s = c6319aM6898n2.f20470b;
                                    this.f64847u = c6319aM6898n2.f20471c;
                                    c6318j.m6883t(iM6872i6 - (iM6865b3 - c6318j.m6865b()));
                                }
                                int iM6872i7 = c6318j.m6872i(3);
                                this.f64842p = iM6872i7;
                                if (iM6872i7 == 0) {
                                    c6318j.m6883t(8);
                                } else if (iM6872i7 == 1) {
                                    c6318j.m6883t(9);
                                } else if (iM6872i7 == 3 || iM6872i7 == 4 || iM6872i7 == 5) {
                                    c6318j.m6883t(6);
                                } else {
                                    if (iM6872i7 != 6 && iM6872i7 != 7) {
                                        throw new IllegalStateException();
                                    }
                                    c6318j.m6883t(1);
                                }
                                boolean zM6871h2 = c6318j.m6871h();
                                this.f64843q = zM6871h2;
                                this.f64844r = 0L;
                                if (zM6871h2) {
                                    if (iM6872i2 == 1) {
                                        this.f64844r = c6318j.m6872i((c6318j.m6872i(2) + 1) * 8);
                                    } else {
                                        do {
                                            zM6871h = c6318j.m6871h();
                                            this.f64844r = (this.f64844r << 8) + ((long) c6318j.m6872i(8));
                                        } while (zM6871h);
                                    }
                                }
                                if (c6318j.m6871h()) {
                                    c6318j.m6883t(8);
                                }
                            }
                            if (this.f64840n != 0) {
                                throw C19755E.m20712a(null, null);
                            }
                            if (this.f64841o != 0) {
                                throw C19755E.m20712a(null, null);
                            }
                            if (this.f64842p != 0) {
                                throw C19755E.m20712a(null, null);
                            }
                            int i12 = 0;
                            do {
                                iM6872i = c6318j.m6872i(8);
                                i12 += iM6872i;
                            } while (iM6872i == 255);
                            int iM6870g2 = c6318j.m6870g();
                            if ((iM6870g2 & 7) == 0) {
                                c20811m2.m21344F(iM6870g2 >> 3);
                            } else {
                                c6318j.m6873j(i12 * 8, c20811m2.f66092a);
                                c20811m2.m21344F(0);
                            }
                            this.f64831e.mo4970c(i12, c20811m2);
                            AbstractC20800b.m21320h(this.f64838l != -9223372036854775807L);
                            this.f64831e.mo4968a(this.f64838l, 1, i12, 0, null);
                            this.f64838l += this.f64846t;
                            if (this.f64843q) {
                                c6318j.m6883t((int) this.f64844r);
                            }
                            this.f64834h = 0;
                        } else {
                            continue;
                        }
                    }
                } else {
                    int iM21365t2 = c20811m.m21365t();
                    if ((iM21365t2 & 224) == 224) {
                        this.f64837k = iM21365t2;
                        this.f64834h = 2;
                    } else if (iM21365t2 != 86) {
                        this.f64834h = 0;
                    }
                }
            } else if (c20811m.m21365t() == 86) {
                this.f64834h = 1;
            }
        }
    }

    @Override // p1055v4.InterfaceC20435f
    /* JADX INFO: renamed from: c */
    public final void mo21089c() {
        this.f64834h = 0;
        this.f64838l = -9223372036854775807L;
        this.f64839m = false;
    }

    @Override // p1055v4.InterfaceC20435f
    /* JADX INFO: renamed from: d */
    public final void mo21090d(InterfaceC6335q interfaceC6335q, C13458b c13458b) {
        c13458b.m14981c();
        c13458b.m14986h();
        this.f64831e = interfaceC6335q.mo3044D(c13458b.f42594c, 1);
        c13458b.m14986h();
        this.f64832f = (String) c13458b.f42596e;
    }

    @Override // p1055v4.InterfaceC20435f
    /* JADX INFO: renamed from: f */
    public final void mo21092f(int i10, long j10) {
        this.f64838l = j10;
    }

    @Override // p1055v4.InterfaceC20435f
    /* JADX INFO: renamed from: e */
    public final void mo21091e(boolean z6) {
    }
}
