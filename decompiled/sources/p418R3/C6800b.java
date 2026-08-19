package p418R3;

import bb.AbstractC11278C;
import bb.C11276A;
import bb.C11294T;
import fo.C13711h;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p1016t3.AbstractC19754D;
import p1016t3.C19755E;
import p1016t3.C19787n;
import p1016t3.C19788o;
import p1073w3.AbstractC20800b;
import p1073w3.AbstractC20817s;
import p1073w3.C20811m;
import p165G9.C3018d;
import p372P3.C6330l;
import p372P3.C6337s;
import p372P3.C6338t;
import p372P3.InterfaceC6316H;
import p372P3.InterfaceC6333o;
import p372P3.InterfaceC6334p;
import p372P3.InterfaceC6335q;
import p499U9.C7591u;
import p885m4.C17155e;

/* JADX INFO: renamed from: R3.b */
/* JADX INFO: loaded from: classes.dex */
public final class C6800b implements InterfaceC6333o {

    /* JADX INFO: renamed from: a */
    public final C20811m f21809a;

    /* JADX INFO: renamed from: b */
    public final C3018d f21810b;

    /* JADX INFO: renamed from: c */
    public final boolean f21811c;

    /* JADX INFO: renamed from: d */
    public final C17155e f21812d;

    /* JADX INFO: renamed from: e */
    public int f21813e;

    /* JADX INFO: renamed from: f */
    public InterfaceC6335q f21814f;

    /* JADX INFO: renamed from: g */
    public C6801c f21815g;

    /* JADX INFO: renamed from: h */
    public long f21816h;

    /* JADX INFO: renamed from: i */
    public C6803e[] f21817i;

    /* JADX INFO: renamed from: j */
    public long f21818j;

    /* JADX INFO: renamed from: k */
    public C6803e f21819k;

    /* JADX INFO: renamed from: l */
    public int f21820l;

    /* JADX INFO: renamed from: m */
    public long f21821m;

    /* JADX INFO: renamed from: n */
    public long f21822n;

    /* JADX INFO: renamed from: o */
    public int f21823o;

    /* JADX INFO: renamed from: p */
    public boolean f21824p;

    public C6800b(int i10, C17155e c17155e) {
        this.f21812d = c17155e;
        this.f21811c = (i10 & 1) == 0;
        this.f21809a = new C20811m(12);
        this.f21810b = new C3018d();
        this.f21814f = new C7591u(14);
        this.f21817i = new C6803e[0];
        this.f21821m = -1L;
        this.f21822n = -1L;
        this.f21820l = -1;
        this.f21816h = -9223372036854775807L;
    }

    @Override // p372P3.InterfaceC6333o
    /* JADX INFO: renamed from: a */
    public final InterfaceC6333o mo6855a() {
        return this;
    }

    @Override // p372P3.InterfaceC6333o
    /* JADX INFO: renamed from: c */
    public final boolean mo6856c(InterfaceC6334p interfaceC6334p) {
        C20811m c20811m = this.f21809a;
        ((C6330l) interfaceC6334p).mo3047d(c20811m.f66092a, 0, 12, false);
        c20811m.m21344F(0);
        if (c20811m.m21354i() != 1179011410) {
            return false;
        }
        c20811m.m21345G(4);
        return c20811m.m21354i() == 541677121;
    }

    @Override // p372P3.InterfaceC6333o
    /* JADX INFO: renamed from: f */
    public final void mo6857f(long j10, long j11) {
        this.f21818j = -1L;
        this.f21819k = null;
        for (C6803e c6803e : this.f21817i) {
            if (c6803e.f21842j == 0) {
                c6803e.f21840h = 0;
            } else {
                c6803e.f21840h = c6803e.f21844l[AbstractC20817s.m21404e(c6803e.f21843k, j10, true)];
            }
        }
        if (j10 != 0) {
            this.f21813e = 6;
        } else if (this.f21817i.length == 0) {
            this.f21813e = 0;
        } else {
            this.f21813e = 3;
        }
    }

    @Override // p372P3.InterfaceC6333o
    /* JADX INFO: renamed from: g */
    public final List mo6858g() {
        C11276A c11276a = AbstractC11278C.f34162Z;
        return C11294T.f34185q0;
    }

    /* JADX WARN: Code duplicated, block: B:157:0x037e  */
    /* JADX WARN: Code duplicated, block: B:62:0x0108  */
    /* JADX WARN: Code duplicated, block: B:63:0x010f  */
    @Override // p372P3.InterfaceC6333o
    /* JADX INFO: renamed from: h */
    public final int mo6859h(InterfaceC6334p interfaceC6334p, C6337s c6337s) throws C19755E {
        boolean z6;
        C6803e c6803e;
        long j10;
        C6803e c6803e2;
        long j11 = this.f21818j;
        int i10 = 0;
        if (j11 != -1) {
            long j12 = ((C6330l) interfaceC6334p).f20548p0;
            if (j11 < j12 || j11 > 262144 + j12) {
                c6337s.f20561a = j11;
                z6 = true;
            } else {
                ((C6330l) interfaceC6334p).mo3052j((int) (j11 - j12));
                z6 = false;
            }
        } else {
            z6 = false;
        }
        this.f21818j = -1L;
        if (z6) {
            return 1;
        }
        int i11 = this.f21813e;
        C6803e c6803e3 = null;
        C3018d c3018d = this.f21810b;
        C20811m c20811m = this.f21809a;
        switch (i11) {
            case 0:
                if (!mo6856c(interfaceC6334p)) {
                    throw C19755E.m20712a(null, "AVI Header List not found");
                }
                ((C6330l) interfaceC6334p).mo3052j(12);
                this.f21813e = 1;
                return 0;
            case 1:
                ((C6330l) interfaceC6334p).mo3046b(c20811m.f66092a, 0, 12, false);
                c20811m.m21344F(0);
                c3018d.getClass();
                c3018d.f9092a = c20811m.m21354i();
                c3018d.f9093b = c20811m.m21354i();
                c3018d.f9094c = 0;
                if (c3018d.f9092a != 1414744396) {
                    throw C19755E.m20712a(null, "LIST expected, found: " + c3018d.f9092a);
                }
                int iM21354i = c20811m.m21354i();
                c3018d.f9094c = iM21354i;
                if (iM21354i == 1819436136) {
                    this.f21820l = c3018d.f9093b;
                    this.f21813e = 2;
                    return 0;
                }
                throw C19755E.m20712a(null, "hdrl expected, found: " + c3018d.f9094c);
            case 2:
                int i12 = this.f21820l - 4;
                C20811m c20811m2 = new C20811m(i12);
                ((C6330l) interfaceC6334p).mo3046b(c20811m2.f66092a, 0, i12, false);
                C6804f c6804fM7238b = C6804f.m7238b(1819436136, c20811m2);
                int i13 = c6804fM7238b.f21846b;
                if (i13 != 1819436136) {
                    throw C19755E.m20712a(null, "Unexpected header list type " + i13);
                }
                C6801c c6801c = (C6801c) c6804fM7238b.m7239a(C6801c.class);
                if (c6801c == null) {
                    throw C19755E.m20712a(null, "AviHeader not found");
                }
                this.f21815g = c6801c;
                this.f21816h = ((long) c6801c.f21827c) * ((long) c6801c.f21825a);
                ArrayList arrayList = new ArrayList();
                C11276A c11276aListIterator = c6804fM7238b.f21845a.listIterator(0);
                int i14 = 0;
                while (c11276aListIterator.hasNext()) {
                    InterfaceC6799a interfaceC6799a = (InterfaceC6799a) c11276aListIterator.next();
                    if (interfaceC6799a.getType() == 1819440243) {
                        C6804f c6804f = (C6804f) interfaceC6799a;
                        int i15 = i14 + 1;
                        C6802d c6802d = (C6802d) c6804f.m7239a(C6802d.class);
                        C6805g c6805g = (C6805g) c6804f.m7239a(C6805g.class);
                        if (c6802d == null) {
                            AbstractC20800b.m21332t("AviExtractor", "Missing Stream Header");
                        } else if (c6805g == null) {
                            AbstractC20800b.m21332t("AviExtractor", "Missing Stream Format");
                        } else {
                            long j13 = c6802d.f21831d;
                            long j14 = ((long) c6802d.f21829b) * 1000000;
                            long j15 = c6802d.f21830c;
                            int i16 = AbstractC20817s.f66106a;
                            long jM21396J = AbstractC20817s.m21396J(j13, j14, j15, RoundingMode.FLOOR);
                            C19788o c19788o = c6805g.f21847a;
                            C19787n c19787nM20747a = c19788o.m20747a();
                            c19787nM20747a.f62703a = Integer.toString(i14);
                            int i17 = c6802d.f21832e;
                            if (i17 != 0) {
                                c19787nM20747a.f62715m = i17;
                            }
                            C6806h c6806h = (C6806h) c6804f.m7239a(C6806h.class);
                            if (c6806h != null) {
                                c19787nM20747a.f62704b = c6806h.f21848a;
                            }
                            int iM20707e = AbstractC19754D.m20707e(c19788o.f62752m);
                            if (iM20707e == 1 || iM20707e == 2) {
                                InterfaceC6316H interfaceC6316HMo3044D = this.f21814f.mo3044D(i14, iM20707e);
                                interfaceC6316HMo3044D.mo4971d(new C19788o(c19787nM20747a));
                                c6803e = new C6803e(i14, iM20707e, jM21396J, c6802d.f21831d, interfaceC6316HMo3044D);
                                this.f21816h = jM21396J;
                            }
                            if (c6803e != null) {
                                arrayList.add(c6803e);
                            }
                            i14 = i15;
                        }
                        c6803e = null;
                        if (c6803e != null) {
                            arrayList.add(c6803e);
                        }
                        i14 = i15;
                    }
                }
                this.f21817i = (C6803e[]) arrayList.toArray(new C6803e[0]);
                this.f21814f.mo3061s();
                this.f21813e = 3;
                return 0;
            case 3:
                long j16 = this.f21821m;
                if (j16 != -1 && ((C6330l) interfaceC6334p).f20548p0 != j16) {
                    this.f21818j = j16;
                    return 0;
                }
                ((C6330l) interfaceC6334p).mo3047d(c20811m.f66092a, 0, 12, false);
                C6330l c6330l = (C6330l) interfaceC6334p;
                c6330l.f20550r0 = 0;
                c20811m.m21344F(0);
                c3018d.getClass();
                c3018d.f9092a = c20811m.m21354i();
                c3018d.f9093b = c20811m.m21354i();
                c3018d.f9094c = 0;
                int iM21354i2 = c20811m.m21354i();
                int i18 = c3018d.f9092a;
                if (i18 == 1179011410) {
                    c6330l.mo3052j(12);
                    return 0;
                }
                if (i18 != 1414744396 || iM21354i2 != 1769369453) {
                    this.f21818j = c6330l.f20548p0 + ((long) c3018d.f9093b) + 8;
                    return 0;
                }
                long j17 = c6330l.f20548p0;
                this.f21821m = j17;
                this.f21822n = j17 + ((long) c3018d.f9093b) + 8;
                if (!this.f21824p) {
                    C6801c c6801c2 = this.f21815g;
                    c6801c2.getClass();
                    if ((c6801c2.f21826b & 16) == 16) {
                        this.f21813e = 4;
                        this.f21818j = this.f21822n;
                        return 0;
                    }
                    this.f21814f.mo3045F(new C6338t(this.f21816h));
                    this.f21824p = true;
                }
                this.f21818j = c6330l.f20548p0 + 12;
                this.f21813e = 6;
                return 0;
            case 4:
                ((C6330l) interfaceC6334p).mo3046b(c20811m.f66092a, 0, 8, false);
                c20811m.m21344F(0);
                int iM21354i3 = c20811m.m21354i();
                int iM21354i4 = c20811m.m21354i();
                if (iM21354i3 != 829973609) {
                    this.f21818j = ((C6330l) interfaceC6334p).f20548p0 + ((long) iM21354i4);
                    return 0;
                }
                this.f21813e = 5;
                this.f21823o = iM21354i4;
                return 0;
            case 5:
                C20811m c20811m3 = new C20811m(this.f21823o);
                ((C6330l) interfaceC6334p).mo3046b(c20811m3.f66092a, 0, this.f21823o, false);
                if (c20811m3.m21346a() < 16) {
                    j10 = 0;
                } else {
                    int i19 = c20811m3.f66093b;
                    c20811m3.m21345G(8);
                    long jM21354i = c20811m3.m21354i();
                    long j18 = this.f21821m;
                    j10 = jM21354i > j18 ? 0L : j18 + 8;
                    c20811m3.m21344F(i19);
                }
                while (c20811m3.m21346a() >= 16) {
                    int iM21354i5 = c20811m3.m21354i();
                    int iM21354i6 = c20811m3.m21354i();
                    long jM21354i2 = ((long) c20811m3.m21354i()) + j10;
                    c20811m3.m21354i();
                    C6803e[] c6803eArr = this.f21817i;
                    int length = c6803eArr.length;
                    while (true) {
                        if (i10 < length) {
                            c6803e2 = c6803eArr[i10];
                            if (c6803e2.f21834b != iM21354i5 && c6803e2.f21835c != iM21354i5) {
                                i10++;
                            }
                        } else {
                            c6803e2 = null;
                        }
                    }
                    if (c6803e2 != null) {
                        if ((iM21354i6 & 16) == 16) {
                            if (c6803e2.f21842j == c6803e2.f21844l.length) {
                                long[] jArr = c6803e2.f21843k;
                                c6803e2.f21843k = Arrays.copyOf(jArr, (jArr.length * 3) / 2);
                                int[] iArr = c6803e2.f21844l;
                                c6803e2.f21844l = Arrays.copyOf(iArr, (iArr.length * 3) / 2);
                            }
                            long[] jArr2 = c6803e2.f21843k;
                            int i20 = c6803e2.f21842j;
                            jArr2[i20] = jM21354i2;
                            c6803e2.f21844l[i20] = c6803e2.f21841i;
                            c6803e2.f21842j = i20 + 1;
                        }
                        c6803e2.f21841i++;
                    }
                    i10 = 0;
                }
                for (C6803e c6803e4 : this.f21817i) {
                    c6803e4.f21843k = Arrays.copyOf(c6803e4.f21843k, c6803e4.f21842j);
                    c6803e4.f21844l = Arrays.copyOf(c6803e4.f21844l, c6803e4.f21842j);
                }
                this.f21824p = true;
                this.f21814f.mo3045F(new C6338t(this, this.f21816h, 2));
                this.f21813e = 6;
                this.f21818j = this.f21821m;
                return 0;
            case 6:
                if (((C6330l) interfaceC6334p).f20548p0 >= this.f21822n) {
                    return -1;
                }
                C6803e c6803e5 = this.f21819k;
                if (c6803e5 != null) {
                    int i21 = c6803e5.f21839g;
                    int iMo4973f = i21 - c6803e5.f21833a.mo4973f(interfaceC6334p, i21, false);
                    c6803e5.f21839g = iMo4973f;
                    boolean z10 = iMo4973f == 0;
                    if (z10) {
                        if (c6803e5.f21838f > 0) {
                            int i22 = c6803e5.f21840h;
                            c6803e5.f21833a.mo4968a((c6803e5.f21836d * ((long) i22)) / ((long) c6803e5.f21837e), Arrays.binarySearch(c6803e5.f21844l, i22) >= 0 ? 1 : 0, c6803e5.f21838f, 0, null);
                        }
                        c6803e5.f21840h++;
                    }
                    if (!z10) {
                        return 0;
                    }
                    this.f21819k = null;
                    return 0;
                }
                C6330l c6330l2 = (C6330l) interfaceC6334p;
                if ((c6330l2.f20548p0 & 1) == 1) {
                    c6330l2.mo3052j(1);
                }
                c6330l2.mo3047d(c20811m.f66092a, 0, 12, false);
                c20811m.m21344F(0);
                int iM21354i7 = c20811m.m21354i();
                if (iM21354i7 == 1414744396) {
                    c20811m.m21344F(8);
                    c6330l2.mo3052j(c20811m.m21354i() == 1769369453 ? 12 : 8);
                    c6330l2.f20550r0 = 0;
                    return 0;
                }
                int iM21354i8 = c20811m.m21354i();
                if (iM21354i7 == 1263424842) {
                    this.f21818j = c6330l2.f20548p0 + ((long) iM21354i8) + 8;
                    return 0;
                }
                c6330l2.mo3052j(8);
                c6330l2.f20550r0 = 0;
                for (C6803e c6803e6 : this.f21817i) {
                    if (c6803e6.f21834b == iM21354i7 || c6803e6.f21835c == iM21354i7) {
                        c6803e3 = c6803e6;
                        if (c6803e3 == null) {
                            this.f21818j = c6330l2.f20548p0 + ((long) iM21354i8);
                            return 0;
                        }
                        c6803e3.f21838f = iM21354i8;
                        c6803e3.f21839g = iM21354i8;
                        this.f21819k = c6803e3;
                        return 0;
                    }
                }
                if (c6803e3 == null) {
                    this.f21818j = c6330l2.f20548p0 + ((long) iM21354i8);
                    return 0;
                }
                c6803e3.f21838f = iM21354i8;
                c6803e3.f21839g = iM21354i8;
                this.f21819k = c6803e3;
                return 0;
            default:
                throw new AssertionError();
        }
    }

    @Override // p372P3.InterfaceC6333o
    /* JADX INFO: renamed from: i */
    public final void mo6860i(InterfaceC6335q interfaceC6335q) {
        this.f21813e = 0;
        if (this.f21811c) {
            interfaceC6335q = new C13711h(interfaceC6335q, this.f21812d);
        }
        this.f21814f = interfaceC6335q;
        this.f21818j = -1L;
    }

    @Override // p372P3.InterfaceC6333o
    public final void release() {
    }
}
