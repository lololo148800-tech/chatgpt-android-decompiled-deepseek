package p232J3;

import android.util.SparseArray;
import io.sentry.internal.debugmeta.C15384c;
import java.io.EOFException;
import java.util.ArrayList;
import p013Ab.C0420b;
import p054C0.C1497j;
import p1016t3.AbstractC19754D;
import p1016t3.C19785l;
import p1016t3.C19787n;
import p1016t3.C19788o;
import p1016t3.InterfaceC19782i;
import p1073w3.AbstractC20800b;
import p1073w3.AbstractC20817s;
import p1073w3.C20811m;
import p117Eb.C2385o;
import p133F3.C2658d;
import p133F3.C2660f;
import p133F3.InterfaceC2661g;
import p158G3.C2988g;
import p165G9.C3024j;
import p305M3.C5281a;
import p305M3.C5285e;
import p372P3.C6315G;
import p372P3.InterfaceC6316H;
import p477Tb.C7296c;

/* JADX INFO: renamed from: J3.T */
/* JADX INFO: loaded from: classes.dex */
public final class C4219T implements InterfaceC6316H {

    /* JADX INFO: renamed from: B */
    public boolean f13766B;

    /* JADX INFO: renamed from: a */
    public final C4217Q f13767a;

    /* JADX INFO: renamed from: d */
    public final InterfaceC2661g f13770d;

    /* JADX INFO: renamed from: e */
    public final C2658d f13771e;

    /* JADX INFO: renamed from: f */
    public C4213M f13772f;

    /* JADX INFO: renamed from: g */
    public C19788o f13773g;

    /* JADX INFO: renamed from: h */
    public C7296c f13774h;

    /* JADX INFO: renamed from: p */
    public int f13782p;

    /* JADX INFO: renamed from: q */
    public int f13783q;

    /* JADX INFO: renamed from: r */
    public int f13784r;

    /* JADX INFO: renamed from: s */
    public int f13785s;

    /* JADX INFO: renamed from: w */
    public boolean f13789w;

    /* JADX INFO: renamed from: z */
    public C19788o f13792z;

    /* JADX INFO: renamed from: b */
    public final C2988g f13768b = new C2988g();

    /* JADX INFO: renamed from: i */
    public int f13775i = 1000;

    /* JADX INFO: renamed from: j */
    public long[] f13776j = new long[1000];

    /* JADX INFO: renamed from: k */
    public long[] f13777k = new long[1000];

    /* JADX INFO: renamed from: n */
    public long[] f13780n = new long[1000];

    /* JADX INFO: renamed from: m */
    public int[] f13779m = new int[1000];

    /* JADX INFO: renamed from: l */
    public int[] f13778l = new int[1000];

    /* JADX INFO: renamed from: o */
    public C6315G[] f13781o = new C6315G[1000];

    /* JADX INFO: renamed from: c */
    public final C0420b f13769c = new C0420b(new C2385o(10));

    /* JADX INFO: renamed from: t */
    public long f13786t = Long.MIN_VALUE;

    /* JADX INFO: renamed from: u */
    public long f13787u = Long.MIN_VALUE;

    /* JADX INFO: renamed from: v */
    public long f13788v = Long.MIN_VALUE;

    /* JADX INFO: renamed from: y */
    public boolean f13791y = true;

    /* JADX INFO: renamed from: x */
    public boolean f13790x = true;

    /* JADX INFO: renamed from: A */
    public boolean f13765A = true;

    public C4219T(C5285e c5285e, InterfaceC2661g interfaceC2661g, C2658d c2658d) {
        this.f13770d = interfaceC2661g;
        this.f13771e = c2658d;
        this.f13767a = new C4217Q(c5285e);
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00c6 A[Catch: all -> 0x0065, TryCatch #0 {all -> 0x0065, blocks: (B:23:0x0045, B:25:0x004b, B:29:0x0061, B:32:0x0068, B:36:0x0070, B:41:0x00ab, B:64:0x0127, B:66:0x0130, B:43:0x00c6, B:45:0x00cf, B:47:0x00d8, B:49:0x00ed, B:53:0x00f6, B:54:0x00fb, B:56:0x0101, B:60:0x010f, B:62:0x0114, B:63:0x0124, B:46:0x00d6), top: B:71:0x0045 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00cf A[Catch: all -> 0x0065, TryCatch #0 {all -> 0x0065, blocks: (B:23:0x0045, B:25:0x004b, B:29:0x0061, B:32:0x0068, B:36:0x0070, B:41:0x00ab, B:64:0x0127, B:66:0x0130, B:43:0x00c6, B:45:0x00cf, B:47:0x00d8, B:49:0x00ed, B:53:0x00f6, B:54:0x00fb, B:56:0x0101, B:60:0x010f, B:62:0x0114, B:63:0x0124, B:46:0x00d6), top: B:71:0x0045 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00d6 A[Catch: all -> 0x0065, TryCatch #0 {all -> 0x0065, blocks: (B:23:0x0045, B:25:0x004b, B:29:0x0061, B:32:0x0068, B:36:0x0070, B:41:0x00ab, B:64:0x0127, B:66:0x0130, B:43:0x00c6, B:45:0x00cf, B:47:0x00d8, B:49:0x00ed, B:53:0x00f6, B:54:0x00fb, B:56:0x0101, B:60:0x010f, B:62:0x0114, B:63:0x0124, B:46:0x00d6), top: B:71:0x0045 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x00ed A[Catch: all -> 0x0065, TryCatch #0 {all -> 0x0065, blocks: (B:23:0x0045, B:25:0x004b, B:29:0x0061, B:32:0x0068, B:36:0x0070, B:41:0x00ab, B:64:0x0127, B:66:0x0130, B:43:0x00c6, B:45:0x00cf, B:47:0x00d8, B:49:0x00ed, B:53:0x00f6, B:54:0x00fb, B:56:0x0101, B:60:0x010f, B:62:0x0114, B:63:0x0124, B:46:0x00d6), top: B:71:0x0045 }] */
    /* JADX WARN: Code duplicated, block: B:51:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:52:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:56:0x0101 A[Catch: all -> 0x0065, TryCatch #0 {all -> 0x0065, blocks: (B:23:0x0045, B:25:0x004b, B:29:0x0061, B:32:0x0068, B:36:0x0070, B:41:0x00ab, B:64:0x0127, B:66:0x0130, B:43:0x00c6, B:45:0x00cf, B:47:0x00d8, B:49:0x00ed, B:53:0x00f6, B:54:0x00fb, B:56:0x0101, B:60:0x010f, B:62:0x0114, B:63:0x0124, B:46:0x00d6), top: B:71:0x0045 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x010c  */
    /* JADX WARN: Code duplicated, block: B:59:0x010e  */
    /* JADX WARN: Code duplicated, block: B:62:0x0114 A[Catch: all -> 0x0065, TryCatch #0 {all -> 0x0065, blocks: (B:23:0x0045, B:25:0x004b, B:29:0x0061, B:32:0x0068, B:36:0x0070, B:41:0x00ab, B:64:0x0127, B:66:0x0130, B:43:0x00c6, B:45:0x00cf, B:47:0x00d8, B:49:0x00ed, B:53:0x00f6, B:54:0x00fb, B:56:0x0101, B:60:0x010f, B:62:0x0114, B:63:0x0124, B:46:0x00d6), top: B:71:0x0045 }] */
    @Override // p372P3.InterfaceC6316H
    /* JADX INFO: renamed from: a */
    public final void mo4968a(long j10, int i10, int i11, int i12, C6315G c6315g) {
        C19788o c19788o;
        InterfaceC2661g interfaceC2661g;
        C2660f c2660fMo3636g;
        C0420b c0420b;
        int i13;
        int i14;
        SparseArray sparseArray;
        int iKeyAt;
        boolean z6;
        boolean z10;
        int i15 = i10 & 1;
        boolean z11 = i15 != 0;
        if (this.f13790x) {
            if (!z11) {
                return;
            } else {
                this.f13790x = false;
            }
        }
        if (this.f13765A) {
            if (j10 < this.f13786t) {
                return;
            }
            if (i15 == 0) {
                if (!this.f13766B) {
                    AbstractC20800b.m21332t("SampleQueue", "Overriding unexpected non-sync sample for format: " + this.f13792z);
                    this.f13766B = true;
                }
                i10 |= 1;
            }
        }
        long j11 = (this.f13767a.f13762g - ((long) i11)) - ((long) i12);
        synchronized (this) {
            try {
                int i16 = this.f13782p;
                if (i16 > 0) {
                    int iM4978k = m4978k(i16 - 1);
                    AbstractC20800b.m21316d(this.f13777k[iM4978k] + ((long) this.f13778l[iM4978k]) <= j11);
                }
                this.f13789w = (536870912 & i10) != 0;
                this.f13788v = Math.max(this.f13788v, j10);
                int iM4978k2 = m4978k(this.f13782p);
                this.f13780n[iM4978k2] = j10;
                this.f13777k[iM4978k2] = j11;
                this.f13778l[iM4978k2] = i11;
                this.f13779m[iM4978k2] = i10;
                this.f13781o[iM4978k2] = c6315g;
                this.f13776j[iM4978k2] = 0;
                if (((SparseArray) this.f13769c.f1382o0).size() == 0) {
                    c19788o = this.f13792z;
                    c19788o.getClass();
                    interfaceC2661g = this.f13770d;
                    if (interfaceC2661g != null) {
                        c2660fMo3636g = interfaceC2661g.mo3636g(this.f13771e, c19788o);
                    } else {
                        c2660fMo3636g = C2660f.f8171a;
                    }
                    c0420b = this.f13769c;
                    i13 = this.f13783q + this.f13782p;
                    C4218S c4218s = new C4218S(c19788o, c2660fMo3636g);
                    i14 = c0420b.f1381Z;
                    sparseArray = (SparseArray) c0420b.f1382o0;
                    if (i14 == -1) {
                        if (sparseArray.size() == 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        AbstractC20800b.m21320h(z10);
                        c0420b.f1381Z = 0;
                    }
                    if (sparseArray.size() > 0) {
                        iKeyAt = sparseArray.keyAt(sparseArray.size() - 1);
                        if (i13 >= iKeyAt) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        AbstractC20800b.m21316d(z6);
                        if (iKeyAt == i13) {
                            ((C2385o) c0420b.f1383p0).accept(sparseArray.valueAt(sparseArray.size() - 1));
                        }
                    }
                    sparseArray.append(i13, c4218s);
                } else {
                    SparseArray sparseArray2 = (SparseArray) this.f13769c.f1382o0;
                    if (!((C4218S) sparseArray2.valueAt(sparseArray2.size() - 1)).f13763a.equals(this.f13792z)) {
                        c19788o = this.f13792z;
                        c19788o.getClass();
                        interfaceC2661g = this.f13770d;
                        if (interfaceC2661g != null) {
                            c2660fMo3636g = interfaceC2661g.mo3636g(this.f13771e, c19788o);
                        } else {
                            c2660fMo3636g = C2660f.f8171a;
                        }
                        c0420b = this.f13769c;
                        i13 = this.f13783q + this.f13782p;
                        C4218S c4218s2 = new C4218S(c19788o, c2660fMo3636g);
                        i14 = c0420b.f1381Z;
                        sparseArray = (SparseArray) c0420b.f1382o0;
                        if (i14 == -1) {
                            if (sparseArray.size() == 0) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            AbstractC20800b.m21320h(z10);
                            c0420b.f1381Z = 0;
                        }
                        if (sparseArray.size() > 0) {
                            iKeyAt = sparseArray.keyAt(sparseArray.size() - 1);
                            if (i13 >= iKeyAt) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            AbstractC20800b.m21316d(z6);
                            if (iKeyAt == i13) {
                                ((C2385o) c0420b.f1383p0).accept(sparseArray.valueAt(sparseArray.size() - 1));
                            }
                        }
                        sparseArray.append(i13, c4218s2);
                    }
                }
                int i17 = this.f13782p + 1;
                this.f13782p = i17;
                int i18 = this.f13775i;
                if (i17 == i18) {
                    int i19 = i18 + 1000;
                    long[] jArr = new long[i19];
                    long[] jArr2 = new long[i19];
                    long[] jArr3 = new long[i19];
                    int[] iArr = new int[i19];
                    int[] iArr2 = new int[i19];
                    C6315G[] c6315gArr = new C6315G[i19];
                    int i20 = this.f13784r;
                    int i21 = i18 - i20;
                    System.arraycopy(this.f13777k, i20, jArr2, 0, i21);
                    System.arraycopy(this.f13780n, this.f13784r, jArr3, 0, i21);
                    System.arraycopy(this.f13779m, this.f13784r, iArr, 0, i21);
                    System.arraycopy(this.f13778l, this.f13784r, iArr2, 0, i21);
                    System.arraycopy(this.f13781o, this.f13784r, c6315gArr, 0, i21);
                    System.arraycopy(this.f13776j, this.f13784r, jArr, 0, i21);
                    int i22 = this.f13784r;
                    System.arraycopy(this.f13777k, 0, jArr2, i21, i22);
                    System.arraycopy(this.f13780n, 0, jArr3, i21, i22);
                    System.arraycopy(this.f13779m, 0, iArr, i21, i22);
                    System.arraycopy(this.f13778l, 0, iArr2, i21, i22);
                    System.arraycopy(this.f13781o, 0, c6315gArr, i21, i22);
                    System.arraycopy(this.f13776j, 0, jArr, i21, i22);
                    this.f13777k = jArr2;
                    this.f13780n = jArr3;
                    this.f13779m = iArr;
                    this.f13778l = iArr2;
                    this.f13781o = c6315gArr;
                    this.f13776j = jArr;
                    this.f13784r = 0;
                    this.f13775i = i19;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // p372P3.InterfaceC6316H
    /* JADX INFO: renamed from: b */
    public final int mo4969b(InterfaceC19782i interfaceC19782i, int i10, boolean z6) throws EOFException {
        C4217Q c4217q = this.f13767a;
        int iM4967b = c4217q.m4967b(i10);
        C1497j c1497j = c4217q.f13761f;
        C5281a c5281a = (C5281a) c1497j.f3972o0;
        int i11 = interfaceC19782i.read(c5281a.f17394a, ((int) (c4217q.f13762g - c1497j.f3970Y)) + c5281a.f17395b, iM4967b);
        if (i11 == -1) {
            if (z6) {
                return -1;
            }
            throw new EOFException();
        }
        long j10 = c4217q.f13762g + ((long) i11);
        c4217q.f13762g = j10;
        C1497j c1497j2 = c4217q.f13761f;
        if (j10 != c1497j2.f3971Z) {
            return i11;
        }
        c4217q.f13761f = (C1497j) c1497j2.f3973p0;
        return i11;
    }

    @Override // p372P3.InterfaceC6316H
    /* JADX INFO: renamed from: c */
    public final void mo4970c(int i10, C20811m c20811m) {
        mo4972e(c20811m, i10, 0);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0054 A[Catch: all -> 0x0051, TryCatch #0 {all -> 0x0051, blocks: (B:4:0x0003, B:8:0x0011, B:13:0x0022, B:15:0x003b, B:19:0x0056, B:81:0x010c, B:73:0x00f9, B:76:0x0101, B:18:0x0054), top: B:90:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:21:0x0062  */
    /* JADX WARN: Code duplicated, block: B:80:0x010b  */
    @Override // p372P3.InterfaceC6316H
    /* JADX INFO: renamed from: d */
    public final void mo4971d(C19788o c19788o) {
        boolean z6;
        C3024j c3024jM20705c;
        int iM3880c;
        boolean z10 = true;
        synchronized (this) {
            try {
                this.f13791y = false;
                if (AbstractC20817s.m21400a(c19788o, this.f13792z)) {
                    z10 = false;
                } else {
                    if (((SparseArray) this.f13769c.f1382o0).size() == 0) {
                        this.f13792z = c19788o;
                    } else {
                        SparseArray sparseArray = (SparseArray) this.f13769c.f1382o0;
                        if (((C4218S) sparseArray.valueAt(sparseArray.size() - 1)).f13763a.equals(c19788o)) {
                            SparseArray sparseArray2 = (SparseArray) this.f13769c.f1382o0;
                            this.f13792z = ((C4218S) sparseArray2.valueAt(sparseArray2.size() - 1)).f13763a;
                        } else {
                            this.f13792z = c19788o;
                        }
                    }
                    boolean z11 = this.f13765A;
                    C19788o c19788o2 = this.f13792z;
                    String str = c19788o2.f62752m;
                    String str2 = c19788o2.f62749j;
                    ArrayList arrayList = AbstractC19754D.f62557a;
                    if (str != null) {
                        switch (str) {
                            case "audio/eac3-joc":
                            case "audio/mpeg-L1":
                            case "audio/mpeg-L2":
                            case "audio/ac3":
                            case "audio/raw":
                            case "audio/eac3":
                            case "audio/flac":
                            case "audio/mpeg":
                            case "audio/g711-alaw":
                            case "audio/g711-mlaw":
                                z6 = true;
                                break;
                            case "audio/mp4a-latm":
                                if (str2 != null && (c3024jM20705c = AbstractC19754D.m20705c(str2)) != null && (iM3880c = c3024jM20705c.m3880c()) != 0 && iM3880c != 16) {
                                    z6 = true;
                                    break;
                                } else {
                                    z6 = false;
                                    break;
                                }
                                break;
                            default:
                                z6 = false;
                                break;
                        }
                    } else {
                        z6 = false;
                    }
                    this.f13765A = z11 & z6;
                    this.f13766B = false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        C4213M c4213m = this.f13772f;
        if (c4213m == null || !z10) {
            return;
        }
        c4213m.f13702B0.post(c4213m.f13739z0);
    }

    @Override // p372P3.InterfaceC6316H
    /* JADX INFO: renamed from: e */
    public final void mo4972e(C20811m c20811m, int i10, int i11) {
        while (true) {
            C4217Q c4217q = this.f13767a;
            if (i10 <= 0) {
                c4217q.getClass();
                return;
            }
            int iM4967b = c4217q.m4967b(i10);
            C1497j c1497j = c4217q.f13761f;
            C5281a c5281a = (C5281a) c1497j.f3972o0;
            c20811m.m21350e(c5281a.f17394a, ((int) (c4217q.f13762g - c1497j.f3970Y)) + c5281a.f17395b, iM4967b);
            i10 -= iM4967b;
            long j10 = c4217q.f13762g + ((long) iM4967b);
            c4217q.f13762g = j10;
            C1497j c1497j2 = c4217q.f13761f;
            if (j10 == c1497j2.f3971Z) {
                c4217q.f13761f = (C1497j) c1497j2.f3973p0;
            }
        }
    }

    @Override // p372P3.InterfaceC6316H
    /* JADX INFO: renamed from: f */
    public final int mo4973f(InterfaceC19782i interfaceC19782i, int i10, boolean z6) {
        return mo4969b(interfaceC19782i, i10, z6);
    }

    /* JADX INFO: renamed from: g */
    public final long m4974g(int i10) {
        long j10 = this.f13787u;
        long jMax = Long.MIN_VALUE;
        if (i10 != 0) {
            int iM4978k = m4978k(i10 - 1);
            for (int i11 = 0; i11 < i10; i11++) {
                jMax = Math.max(jMax, this.f13780n[iM4978k]);
                if ((this.f13779m[iM4978k] & 1) != 0) {
                    break;
                }
                iM4978k--;
                if (iM4978k == -1) {
                    iM4978k = this.f13775i - 1;
                }
            }
        }
        this.f13787u = Math.max(j10, jMax);
        this.f13782p -= i10;
        int i12 = this.f13783q + i10;
        this.f13783q = i12;
        int i13 = this.f13784r + i10;
        this.f13784r = i13;
        int i14 = this.f13775i;
        if (i13 >= i14) {
            this.f13784r = i13 - i14;
        }
        int i15 = this.f13785s - i10;
        this.f13785s = i15;
        int i16 = 0;
        if (i15 < 0) {
            this.f13785s = 0;
        }
        while (true) {
            C0420b c0420b = this.f13769c;
            SparseArray sparseArray = (SparseArray) c0420b.f1382o0;
            if (i16 >= sparseArray.size() - 1) {
                break;
            }
            int i17 = i16 + 1;
            if (i12 < sparseArray.keyAt(i17)) {
                break;
            }
            ((C2385o) c0420b.f1383p0).accept(sparseArray.valueAt(i16));
            sparseArray.removeAt(i16);
            int i18 = c0420b.f1381Z;
            if (i18 > 0) {
                c0420b.f1381Z = i18 - 1;
            }
            i16 = i17;
        }
        if (this.f13782p != 0) {
            return this.f13777k[this.f13784r];
        }
        int i19 = this.f13784r;
        if (i19 == 0) {
            i19 = this.f13775i;
        }
        int i20 = i19 - 1;
        return this.f13777k[i20] + ((long) this.f13778l[i20]);
    }

    /* JADX INFO: renamed from: h */
    public final void m4975h() {
        long jM4974g;
        C4217Q c4217q = this.f13767a;
        synchronized (this) {
            int i10 = this.f13782p;
            jM4974g = i10 == 0 ? -1L : m4974g(i10);
        }
        c4217q.m4966a(jM4974g);
    }

    /* JADX INFO: renamed from: i */
    public final int m4976i(int i10, int i11, long j10, boolean z6) {
        int i12 = -1;
        for (int i13 = 0; i13 < i11; i13++) {
            long j11 = this.f13780n[i10];
            if (j11 > j10) {
                break;
            }
            if (!z6 || (this.f13779m[i10] & 1) != 0) {
                i12 = i13;
                if (j11 == j10) {
                    break;
                }
            }
            i10++;
            if (i10 == this.f13775i) {
                i10 = 0;
            }
        }
        return i12;
    }

    /* JADX INFO: renamed from: j */
    public final synchronized long m4977j() {
        return this.f13788v;
    }

    /* JADX INFO: renamed from: k */
    public final int m4978k(int i10) {
        int i11 = this.f13784r + i10;
        int i12 = this.f13775i;
        return i11 < i12 ? i11 : i11 - i12;
    }

    /* JADX INFO: renamed from: l */
    public final synchronized C19788o m4979l() {
        return this.f13791y ? null : this.f13792z;
    }

    /* JADX INFO: renamed from: m */
    public final synchronized boolean m4980m(boolean z6) {
        C19788o c19788o;
        int i10 = this.f13785s;
        boolean z10 = false;
        if (i10 != this.f13782p) {
            if (((C4218S) this.f13769c.m1061q(this.f13783q + i10)).f13763a != this.f13773g) {
                return true;
            }
            return m4981n(m4978k(this.f13785s));
        }
        if (z6 || this.f13789w || ((c19788o = this.f13792z) != null && c19788o != this.f13773g)) {
            z10 = true;
        }
        return z10;
    }

    /* JADX INFO: renamed from: n */
    public final boolean m4981n(int i10) {
        C7296c c7296c = this.f13774h;
        if (c7296c == null || c7296c.m7749A() == 4) {
            return true;
        }
        if ((this.f13779m[i10] & 1073741824) == 0) {
            this.f13774h.getClass();
        }
        return false;
    }

    /* JADX INFO: renamed from: o */
    public final void m4982o(C19788o c19788o, C15384c c15384c) {
        C19788o c19788o2;
        C19788o c19788o3 = this.f13773g;
        boolean z6 = c19788o3 == null;
        C19785l c19785l = c19788o3 == null ? null : c19788o3.f62756q;
        this.f13773g = c19788o;
        C19785l c19785l2 = c19788o.f62756q;
        InterfaceC2661g interfaceC2661g = this.f13770d;
        if (interfaceC2661g != null) {
            int iMo3638j = interfaceC2661g.mo3638j(c19788o);
            C19787n c19787nM20747a = c19788o.m20747a();
            c19787nM20747a.f62702I = iMo3638j;
            c19788o2 = new C19788o(c19787nM20747a);
        } else {
            c19788o2 = c19788o;
        }
        c15384c.f47968o0 = c19788o2;
        c15384c.f47967Z = this.f13774h;
        if (interfaceC2661g == null) {
            return;
        }
        if (z6 || !AbstractC20817s.m21400a(c19785l, c19785l2)) {
            C7296c c7296c = this.f13774h;
            C2658d c2658d = this.f13771e;
            C7296c c7296cMo3635f = interfaceC2661g.mo3635f(c2658d, c19788o);
            this.f13774h = c7296cMo3635f;
            c15384c.f47967Z = c7296cMo3635f;
            if (c7296c != null) {
                c7296c.m7754F(c2658d);
            }
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m4983p(boolean z6) {
        SparseArray sparseArray;
        C4217Q c4217q = this.f13767a;
        C1497j c1497j = c4217q.f13759d;
        if (((C5281a) c1497j.f3972o0) != null) {
            C5285e c5285e = c4217q.f13756a;
            synchronized (c5285e) {
                C1497j c1497j2 = c1497j;
                while (c1497j2 != null) {
                    try {
                        C5281a[] c5281aArr = c5285e.f17408f;
                        int i10 = c5285e.f17407e;
                        c5285e.f17407e = i10 + 1;
                        C5281a c5281a = (C5281a) c1497j2.f3972o0;
                        c5281a.getClass();
                        c5281aArr[i10] = c5281a;
                        c5285e.f17406d--;
                        c1497j2 = (C1497j) c1497j2.f3973p0;
                        if (c1497j2 == null || ((C5281a) c1497j2.f3972o0) == null) {
                            c1497j2 = null;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                c5285e.notifyAll();
            }
            c1497j.f3972o0 = null;
            c1497j.f3973p0 = null;
        }
        C1497j c1497j3 = c4217q.f13759d;
        int i11 = c4217q.f13757b;
        int i12 = 0;
        AbstractC20800b.m21320h(((C5281a) c1497j3.f3972o0) == null);
        c1497j3.f3970Y = 0L;
        c1497j3.f3971Z = i11;
        C1497j c1497j4 = c4217q.f13759d;
        c4217q.f13760e = c1497j4;
        c4217q.f13761f = c1497j4;
        c4217q.f13762g = 0L;
        c4217q.f13756a.m5824b();
        this.f13782p = 0;
        this.f13783q = 0;
        this.f13784r = 0;
        this.f13785s = 0;
        this.f13790x = true;
        this.f13786t = Long.MIN_VALUE;
        this.f13787u = Long.MIN_VALUE;
        this.f13788v = Long.MIN_VALUE;
        this.f13789w = false;
        C0420b c0420b = this.f13769c;
        while (true) {
            sparseArray = (SparseArray) c0420b.f1382o0;
            if (i12 >= sparseArray.size()) {
                break;
            }
            ((C2385o) c0420b.f1383p0).accept(sparseArray.valueAt(i12));
            i12++;
        }
        c0420b.f1381Z = -1;
        sparseArray.clear();
        if (z6) {
            this.f13792z = null;
            this.f13791y = true;
            this.f13765A = true;
        }
    }

    /* JADX INFO: renamed from: q */
    public final synchronized void m4984q() {
        this.f13785s = 0;
        C4217Q c4217q = this.f13767a;
        c4217q.f13760e = c4217q.f13759d;
    }

    /* JADX INFO: renamed from: r */
    public final synchronized boolean m4985r(long j10, boolean z6) {
        int iM4976i;
        m4984q();
        int iM4978k = m4978k(this.f13785s);
        int i10 = this.f13785s;
        int i11 = this.f13782p;
        if ((i10 != i11) && j10 >= this.f13780n[iM4978k] && (j10 <= this.f13788v || z6)) {
            if (this.f13765A) {
                int i12 = i11 - i10;
                iM4976i = 0;
                while (true) {
                    if (iM4976i >= i12) {
                        if (!z6) {
                            i12 = -1;
                        }
                        iM4976i = i12;
                        break;
                    }
                    if (this.f13780n[iM4978k] >= j10) {
                        break;
                    }
                    iM4978k++;
                    if (iM4978k == this.f13775i) {
                        iM4978k = 0;
                    }
                    iM4976i++;
                }
            } else {
                iM4976i = m4976i(iM4978k, i11 - i10, j10, true);
            }
            if (iM4976i == -1) {
                return false;
            }
            this.f13786t = j10;
            this.f13785s += iM4976i;
            return true;
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x000e  */
    /* JADX INFO: renamed from: s */
    public final synchronized void m4986s(int i10) {
        boolean z6;
        if (i10 >= 0) {
            try {
                if (this.f13785s + i10 <= this.f13782p) {
                    z6 = true;
                } else {
                    z6 = false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        } else {
            z6 = false;
        }
        AbstractC20800b.m21316d(z6);
        this.f13785s += i10;
    }
}
