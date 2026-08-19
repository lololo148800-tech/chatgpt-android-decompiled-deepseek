package p1055v4;

import p1016t3.AbstractC19754D;
import p1016t3.C19787n;
import p1016t3.C19788o;
import p1073w3.AbstractC20800b;
import p1073w3.C20811m;
import p372P3.C6344z;
import p372P3.InterfaceC6316H;
import p372P3.InterfaceC6335q;
import p734ep.C13458b;

/* JADX INFO: renamed from: v4.r */
/* JADX INFO: loaded from: classes.dex */
public final class C20447r implements InterfaceC20435f {

    /* JADX INFO: renamed from: a */
    public final C20811m f64849a;

    /* JADX INFO: renamed from: b */
    public final C6344z f64850b;

    /* JADX INFO: renamed from: c */
    public final String f64851c;

    /* JADX INFO: renamed from: d */
    public final int f64852d;

    /* JADX INFO: renamed from: e */
    public InterfaceC6316H f64853e;

    /* JADX INFO: renamed from: f */
    public String f64854f;

    /* JADX INFO: renamed from: g */
    public int f64855g = 0;

    /* JADX INFO: renamed from: h */
    public int f64856h;

    /* JADX INFO: renamed from: i */
    public boolean f64857i;

    /* JADX INFO: renamed from: j */
    public boolean f64858j;

    /* JADX INFO: renamed from: k */
    public long f64859k;

    /* JADX INFO: renamed from: l */
    public int f64860l;

    /* JADX INFO: renamed from: m */
    public long f64861m;

    public C20447r(String str, int i10) {
        C20811m c20811m = new C20811m(4);
        this.f64849a = c20811m;
        c20811m.f66092a[0] = -1;
        this.f64850b = new C6344z();
        this.f64861m = -9223372036854775807L;
        this.f64851c = str;
        this.f64852d = i10;
    }

    @Override // p1055v4.InterfaceC20435f
    /* JADX INFO: renamed from: b */
    public final void mo21088b(C20811m c20811m) {
        AbstractC20800b.m21321i(this.f64853e);
        while (c20811m.m21346a() > 0) {
            int i10 = this.f64855g;
            C20811m c20811m2 = this.f64849a;
            if (i10 == 0) {
                byte[] bArr = c20811m.f66092a;
                int i11 = c20811m.f66093b;
                int i12 = c20811m.f66094c;
                while (true) {
                    if (i11 >= i12) {
                        c20811m.m21344F(i12);
                        break;
                    }
                    byte b = bArr[i11];
                    boolean z6 = (b & 255) == 255;
                    boolean z10 = this.f64858j && (b & 224) == 224;
                    this.f64858j = z6;
                    if (z10) {
                        c20811m.m21344F(i11 + 1);
                        this.f64858j = false;
                        c20811m2.f66092a[1] = bArr[i11];
                        this.f64856h = 2;
                        this.f64855g = 1;
                        break;
                    }
                    i11++;
                }
            } else if (i10 == 1) {
                int iMin = Math.min(c20811m.m21346a(), 4 - this.f64856h);
                c20811m.m21350e(c20811m2.f66092a, this.f64856h, iMin);
                int i13 = this.f64856h + iMin;
                this.f64856h = i13;
                if (i13 >= 4) {
                    c20811m2.m21344F(0);
                    int iM21352g = c20811m2.m21352g();
                    C6344z c6344z = this.f64850b;
                    if (c6344z.m6959a(iM21352g)) {
                        this.f64860l = c6344z.f20596b;
                        if (!this.f64857i) {
                            this.f64859k = (((long) c6344z.f20600f) * 1000000) / ((long) c6344z.f20597c);
                            C19787n c19787n = new C19787n();
                            c19787n.f62703a = this.f64854f;
                            c19787n.f62714l = AbstractC19754D.m20711i((String) c6344z.f20601g);
                            c19787n.f62715m = 4096;
                            c19787n.f62728z = c6344z.f20598d;
                            c19787n.f62694A = c6344z.f20597c;
                            c19787n.f62706d = this.f64851c;
                            c19787n.f62708f = this.f64852d;
                            this.f64853e.mo4971d(new C19788o(c19787n));
                            this.f64857i = true;
                        }
                        c20811m2.m21344F(0);
                        this.f64853e.mo4970c(4, c20811m2);
                        this.f64855g = 2;
                    } else {
                        this.f64856h = 0;
                        this.f64855g = 1;
                    }
                }
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException();
                }
                int iMin2 = Math.min(c20811m.m21346a(), this.f64860l - this.f64856h);
                this.f64853e.mo4970c(iMin2, c20811m);
                int i14 = this.f64856h + iMin2;
                this.f64856h = i14;
                if (i14 >= this.f64860l) {
                    AbstractC20800b.m21320h(this.f64861m != -9223372036854775807L);
                    this.f64853e.mo4968a(this.f64861m, 1, this.f64860l, 0, null);
                    this.f64861m += this.f64859k;
                    this.f64856h = 0;
                    this.f64855g = 0;
                }
            }
        }
    }

    @Override // p1055v4.InterfaceC20435f
    /* JADX INFO: renamed from: c */
    public final void mo21089c() {
        this.f64855g = 0;
        this.f64856h = 0;
        this.f64858j = false;
        this.f64861m = -9223372036854775807L;
    }

    @Override // p1055v4.InterfaceC20435f
    /* JADX INFO: renamed from: d */
    public final void mo21090d(InterfaceC6335q interfaceC6335q, C13458b c13458b) {
        c13458b.m14981c();
        c13458b.m14986h();
        this.f64854f = (String) c13458b.f42596e;
        c13458b.m14986h();
        this.f64853e = interfaceC6335q.mo3044D(c13458b.f42594c, 1);
    }

    @Override // p1055v4.InterfaceC20435f
    /* JADX INFO: renamed from: f */
    public final void mo21092f(int i10, long j10) {
        this.f64861m = j10;
    }

    @Override // p1055v4.InterfaceC20435f
    /* JADX INFO: renamed from: e */
    public final void mo21091e(boolean z6) {
    }
}
