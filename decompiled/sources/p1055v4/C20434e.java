package p1055v4;

import java.util.Collections;
import java.util.List;
import p1016t3.AbstractC19754D;
import p1016t3.C19787n;
import p1016t3.C19788o;
import p1073w3.AbstractC20800b;
import p1073w3.C20811m;
import p372P3.InterfaceC6316H;
import p372P3.InterfaceC6335q;
import p734ep.C13458b;

/* JADX INFO: renamed from: v4.e */
/* JADX INFO: loaded from: classes.dex */
public final class C20434e implements InterfaceC20435f {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f64695a;

    /* JADX INFO: renamed from: b */
    public boolean f64696b;

    /* JADX INFO: renamed from: c */
    public long f64697c;

    /* JADX INFO: renamed from: d */
    public int f64698d;

    /* JADX INFO: renamed from: e */
    public int f64699e;

    /* JADX INFO: renamed from: f */
    public final Object f64700f;

    /* JADX INFO: renamed from: g */
    public Object f64701g;

    public C20434e(List list) {
        this.f64695a = 0;
        this.f64700f = list;
        this.f64701g = new InterfaceC6316H[list.size()];
        this.f64697c = -9223372036854775807L;
    }

    @Override // p1055v4.InterfaceC20435f
    /* JADX INFO: renamed from: b */
    public final void mo21088b(C20811m c20811m) {
        boolean z6;
        boolean z10;
        switch (this.f64695a) {
            case 0:
                if (this.f64696b) {
                    if (this.f64698d == 2) {
                        if (c20811m.m21346a() == 0) {
                            z10 = false;
                        } else {
                            if (c20811m.m21365t() != 32) {
                                this.f64696b = false;
                            }
                            this.f64698d--;
                            z10 = this.f64696b;
                        }
                        if (!z10) {
                        }
                    }
                    if (this.f64698d == 1) {
                        if (c20811m.m21346a() == 0) {
                            z6 = false;
                        } else {
                            if (c20811m.m21365t() != 0) {
                                this.f64696b = false;
                            }
                            this.f64698d--;
                            z6 = this.f64696b;
                        }
                        if (!z6) {
                        }
                    }
                    int i10 = c20811m.f66093b;
                    int iM21346a = c20811m.m21346a();
                    for (InterfaceC6316H interfaceC6316H : (InterfaceC6316H[]) this.f64701g) {
                        c20811m.m21344F(i10);
                        interfaceC6316H.mo4970c(iM21346a, c20811m);
                    }
                    this.f64699e += iM21346a;
                }
                break;
            default:
                AbstractC20800b.m21321i((InterfaceC6316H) this.f64701g);
                if (this.f64696b) {
                    int iM21346a2 = c20811m.m21346a();
                    int i11 = this.f64699e;
                    if (i11 < 10) {
                        int iMin = Math.min(iM21346a2, 10 - i11);
                        byte[] bArr = c20811m.f66092a;
                        int i12 = c20811m.f66093b;
                        C20811m c20811m2 = (C20811m) this.f64700f;
                        System.arraycopy(bArr, i12, c20811m2.f66092a, this.f64699e, iMin);
                        if (this.f64699e + iMin == 10) {
                            c20811m2.m21344F(0);
                            if (73 == c20811m2.m21365t() && 68 == c20811m2.m21365t() && 51 == c20811m2.m21365t()) {
                                c20811m2.m21345G(3);
                                this.f64698d = c20811m2.m21364s() + 10;
                            } else {
                                AbstractC20800b.m21332t("Id3Reader", "Discarding invalid ID3 tag");
                                this.f64696b = false;
                            }
                        }
                    }
                    int iMin2 = Math.min(iM21346a2, this.f64698d - this.f64699e);
                    ((InterfaceC6316H) this.f64701g).mo4970c(iMin2, c20811m);
                    this.f64699e += iMin2;
                    break;
                }
                break;
        }
    }

    @Override // p1055v4.InterfaceC20435f
    /* JADX INFO: renamed from: c */
    public final void mo21089c() {
        switch (this.f64695a) {
            case 0:
                this.f64696b = false;
                this.f64697c = -9223372036854775807L;
                break;
            default:
                this.f64696b = false;
                this.f64697c = -9223372036854775807L;
                break;
        }
    }

    @Override // p1055v4.InterfaceC20435f
    /* JADX INFO: renamed from: d */
    public final void mo21090d(InterfaceC6335q interfaceC6335q, C13458b c13458b) {
        switch (this.f64695a) {
            case 0:
                int i10 = 0;
                while (true) {
                    InterfaceC6316H[] interfaceC6316HArr = (InterfaceC6316H[]) this.f64701g;
                    if (i10 < interfaceC6316HArr.length) {
                        C20428B c20428b = (C20428B) ((List) this.f64700f).get(i10);
                        c13458b.m14981c();
                        c13458b.m14986h();
                        InterfaceC6316H interfaceC6316HMo3044D = interfaceC6335q.mo3044D(c13458b.f42594c, 3);
                        C19787n c19787n = new C19787n();
                        c13458b.m14986h();
                        c19787n.f62703a = (String) c13458b.f42596e;
                        c19787n.f62714l = AbstractC19754D.m20711i("application/dvbsubs");
                        c19787n.f62717o = Collections.singletonList(c20428b.f64629b);
                        c19787n.f62706d = c20428b.f64628a;
                        interfaceC6316HMo3044D.mo4971d(new C19788o(c19787n));
                        interfaceC6316HArr[i10] = interfaceC6316HMo3044D;
                        i10++;
                    }
                    break;
                }
                break;
            default:
                c13458b.m14981c();
                c13458b.m14986h();
                InterfaceC6316H interfaceC6316HMo3044D2 = interfaceC6335q.mo3044D(c13458b.f42594c, 5);
                this.f64701g = interfaceC6316HMo3044D2;
                C19787n c19787n2 = new C19787n();
                c13458b.m14986h();
                c19787n2.f62703a = (String) c13458b.f42596e;
                c19787n2.f62714l = AbstractC19754D.m20711i("application/id3");
                interfaceC6316HMo3044D2.mo4971d(new C19788o(c19787n2));
                break;
        }
    }

    @Override // p1055v4.InterfaceC20435f
    /* JADX INFO: renamed from: e */
    public final void mo21091e(boolean z6) {
        int i10;
        switch (this.f64695a) {
            case 0:
                if (this.f64696b) {
                    AbstractC20800b.m21320h(this.f64697c != -9223372036854775807L);
                    for (InterfaceC6316H interfaceC6316H : (InterfaceC6316H[]) this.f64701g) {
                        interfaceC6316H.mo4968a(this.f64697c, 1, this.f64699e, 0, null);
                    }
                    this.f64696b = false;
                }
                break;
            default:
                AbstractC20800b.m21321i((InterfaceC6316H) this.f64701g);
                if (this.f64696b && (i10 = this.f64698d) != 0 && this.f64699e == i10) {
                    AbstractC20800b.m21320h(this.f64697c != -9223372036854775807L);
                    ((InterfaceC6316H) this.f64701g).mo4968a(this.f64697c, 1, this.f64698d, 0, null);
                    this.f64696b = false;
                    break;
                }
                break;
        }
    }

    @Override // p1055v4.InterfaceC20435f
    /* JADX INFO: renamed from: f */
    public final void mo21092f(int i10, long j10) {
        switch (this.f64695a) {
            case 0:
                if ((i10 & 4) != 0) {
                    this.f64696b = true;
                    this.f64697c = j10;
                    this.f64699e = 0;
                    this.f64698d = 2;
                    break;
                }
                break;
            default:
                if ((i10 & 4) != 0) {
                    this.f64696b = true;
                    this.f64697c = j10;
                    this.f64698d = 0;
                    this.f64699e = 0;
                    break;
                }
                break;
        }
    }

    public C20434e() {
        this.f64695a = 1;
        this.f64700f = new C20811m(10);
        this.f64697c = -9223372036854775807L;
    }
}
