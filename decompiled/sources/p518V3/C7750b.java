package p518V3;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import bb.AbstractC11278C;
import bb.C11276A;
import bb.C11294T;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p1016t3.AbstractC19754D;
import p1016t3.C19755E;
import p1016t3.C19787n;
import p1016t3.C19788o;
import p1073w3.AbstractC20800b;
import p1073w3.C20811m;
import p232J3.C4229b0;
import p372P3.AbstractC6320b;
import p372P3.C6318J;
import p372P3.C6319a;
import p372P3.C6321c;
import p372P3.C6330l;
import p372P3.C6332n;
import p372P3.C6337s;
import p372P3.C6338t;
import p372P3.C6343y;
import p372P3.InterfaceC6316H;
import p372P3.InterfaceC6333o;
import p372P3.InterfaceC6334p;
import p372P3.InterfaceC6335q;

/* JADX INFO: renamed from: V3.b */
/* JADX INFO: loaded from: classes.dex */
public final class C7750b implements InterfaceC6333o {

    /* JADX INFO: renamed from: a */
    public final C20811m f24430a = new C20811m(4);

    /* JADX INFO: renamed from: b */
    public final C20811m f24431b = new C20811m(9);

    /* JADX INFO: renamed from: c */
    public final C20811m f24432c = new C20811m(11);

    /* JADX INFO: renamed from: d */
    public final C20811m f24433d = new C20811m();

    /* JADX INFO: renamed from: e */
    public final C7751c f24434e;

    /* JADX INFO: renamed from: f */
    public InterfaceC6335q f24435f;

    /* JADX INFO: renamed from: g */
    public int f24436g;

    /* JADX INFO: renamed from: h */
    public boolean f24437h;

    /* JADX INFO: renamed from: i */
    public long f24438i;

    /* JADX INFO: renamed from: j */
    public int f24439j;

    /* JADX INFO: renamed from: k */
    public int f24440k;

    /* JADX INFO: renamed from: l */
    public int f24441l;

    /* JADX INFO: renamed from: m */
    public long f24442m;

    /* JADX INFO: renamed from: n */
    public boolean f24443n;

    /* JADX INFO: renamed from: o */
    public C7749a f24444o;

    /* JADX INFO: renamed from: p */
    public C7752d f24445p;

    public C7750b() {
        C7751c c7751c = new C7751c(new C6332n(), 5);
        c7751c.f24446o0 = -9223372036854775807L;
        c7751c.f24447p0 = new long[0];
        c7751c.f24448q0 = new long[0];
        this.f24434e = c7751c;
        this.f24436g = 1;
    }

    @Override // p372P3.InterfaceC6333o
    /* JADX INFO: renamed from: a */
    public final InterfaceC6333o mo6855a() {
        return this;
    }

    /* JADX INFO: renamed from: b */
    public final C20811m m8009b(C6330l c6330l) {
        int i10 = this.f24441l;
        C20811m c20811m = this.f24433d;
        byte[] bArr = c20811m.f66092a;
        if (i10 > bArr.length) {
            c20811m.m21342D(0, new byte[Math.max(bArr.length * 2, i10)]);
        } else {
            c20811m.m21344F(0);
        }
        c20811m.m21343E(this.f24441l);
        c6330l.mo3046b(c20811m.f66092a, 0, this.f24441l, false);
        return c20811m;
    }

    @Override // p372P3.InterfaceC6333o
    /* JADX INFO: renamed from: c */
    public final boolean mo6856c(InterfaceC6334p interfaceC6334p) throws EOFException, InterruptedIOException {
        C20811m c20811m = this.f24430a;
        C6330l c6330l = (C6330l) interfaceC6334p;
        c6330l.mo3047d(c20811m.f66092a, 0, 3, false);
        c20811m.m21344F(0);
        if (c20811m.m21368w() != 4607062) {
            return false;
        }
        c6330l.mo3047d(c20811m.f66092a, 0, 2, false);
        c20811m.m21344F(0);
        if ((c20811m.m21371z() & 250) != 0) {
            return false;
        }
        c6330l.mo3047d(c20811m.f66092a, 0, 4, false);
        c20811m.m21344F(0);
        int iM21352g = c20811m.m21352g();
        c6330l.f20550r0 = 0;
        c6330l.m6941g(iM21352g, false);
        c6330l.mo3047d(c20811m.f66092a, 0, 4, false);
        c20811m.m21344F(0);
        return c20811m.m21352g() == 0;
    }

    @Override // p372P3.InterfaceC6333o
    /* JADX INFO: renamed from: f */
    public final void mo6857f(long j10, long j11) {
        if (j10 == 0) {
            this.f24436g = 1;
            this.f24437h = false;
        } else {
            this.f24436g = 3;
        }
        this.f24439j = 0;
    }

    @Override // p372P3.InterfaceC6333o
    /* JADX INFO: renamed from: g */
    public final List mo6858g() {
        C11276A c11276a = AbstractC11278C.f34162Z;
        return C11294T.f34185q0;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0299  */
    /* JADX WARN: Code duplicated, block: B:138:0x037b  */
    /* JADX WARN: Code duplicated, block: B:144:0x0394  */
    /* JADX WARN: Code duplicated, block: B:145:0x0398  */
    /* JADX WARN: Code duplicated, block: B:184:0x03a4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:194:0x0007 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:0x0148  */
    /* JADX WARN: Code duplicated, block: B:59:0x016d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:60:0x016f  */
    /* JADX WARN: Code duplicated, block: B:95:0x0286  */
    @Override // p372P3.InterfaceC6333o
    /* JADX INFO: renamed from: h */
    public final int mo6859h(InterfaceC6334p interfaceC6334p, C6337s c6337s) throws C19755E {
        long j10;
        long j11;
        int i10;
        boolean z6;
        boolean z10;
        long j12;
        AbstractC20800b.m21321i(this.f24435f);
        while (true) {
            int i11 = this.f24436g;
            if (i11 == 1) {
                C20811m c20811m = this.f24431b;
                if (!((C6330l) interfaceC6334p).mo3046b(c20811m.f66092a, 0, 9, true)) {
                    return -1;
                }
                c20811m.m21344F(0);
                c20811m.m21345G(4);
                int iM21365t = c20811m.m21365t();
                boolean z11 = (iM21365t & 4) != 0;
                boolean z12 = (iM21365t & 1) != 0;
                if (z11 && this.f24444o == null) {
                    this.f24444o = new C7749a(this.f24435f.mo3044D(8, 1), 5);
                }
                if (z12 && this.f24445p == null) {
                    this.f24445p = new C7752d(this.f24435f.mo3044D(9, 2));
                }
                this.f24435f.mo3061s();
                this.f24439j = c20811m.m21352g() - 5;
                this.f24436g = 2;
            } else if (i11 == 2) {
                ((C6330l) interfaceC6334p).mo3052j(this.f24439j);
                this.f24439j = 0;
                this.f24436g = 3;
            } else if (i11 == 3) {
                C20811m c20811m2 = this.f24432c;
                if (!((C6330l) interfaceC6334p).mo3046b(c20811m2.f66092a, 0, 11, true)) {
                    return -1;
                }
                c20811m2.m21344F(0);
                this.f24440k = c20811m2.m21365t();
                this.f24441l = c20811m2.m21368w();
                this.f24442m = c20811m2.m21368w();
                this.f24442m = (((long) (c20811m2.m21365t() << 24)) | this.f24442m) * 1000;
                c20811m2.m21345G(3);
                this.f24436g = 4;
            } else {
                if (i11 != 4) {
                    throw new IllegalStateException();
                }
                boolean z13 = this.f24437h;
                C7751c c7751c = this.f24434e;
                if (z13) {
                    j10 = this.f24438i + this.f24442m;
                } else {
                    if (c7751c.f24446o0 == -9223372036854775807L) {
                        j11 = 0;
                    } else {
                        j10 = this.f24442m;
                    }
                    i10 = this.f24440k;
                    if (i10 != 8 && this.f24444o != null) {
                        if (!this.f24443n) {
                            this.f24435f.mo3045F(new C6338t(-9223372036854775807L));
                            this.f24443n = true;
                        }
                        C7749a c7749a = this.f24444o;
                        C20811m c20811mM8009b = m8009b((C6330l) interfaceC6334p);
                        if (c7749a.f24427o0) {
                            c20811mM8009b.m21345G(1);
                        } else {
                            int iM21365t2 = c20811mM8009b.m21365t();
                            int i12 = (iM21365t2 >> 4) & 15;
                            c7749a.f24429q0 = i12;
                            InterfaceC6316H interfaceC6316H = (InterfaceC6316H) c7749a.f11539Z;
                            if (i12 == 2) {
                                int i13 = C7749a.f24426r0[(iM21365t2 >> 2) & 3];
                                C19787n c19787n = new C19787n();
                                c19787n.f62714l = AbstractC19754D.m20711i("audio/mpeg");
                                c19787n.f62728z = 1;
                                c19787n.f62694A = i13;
                                interfaceC6316H.mo4971d(new C19788o(c19787n));
                                c7749a.f24428p0 = true;
                            } else if (i12 == 7 || i12 == 8) {
                                String str = i12 == 7 ? "audio/g711-alaw" : "audio/g711-mlaw";
                                C19787n c19787n2 = new C19787n();
                                c19787n2.f62714l = AbstractC19754D.m20711i(str);
                                c19787n2.f62728z = 1;
                                c19787n2.f62694A = 8000;
                                interfaceC6316H.mo4971d(new C19788o(c19787n2));
                                c7749a.f24428p0 = true;
                            } else if (i12 != 10) {
                                throw new C4229b0("Audio format not supported: " + c7749a.f24429q0);
                            }
                            c7749a.f24427o0 = true;
                        }
                        int i14 = c7749a.f24429q0;
                        InterfaceC6316H interfaceC6316H2 = (InterfaceC6316H) c7749a.f11539Z;
                        z10 = true;
                        if (i14 == 2) {
                            int iM21346a = c20811mM8009b.m21346a();
                            interfaceC6316H2.mo4970c(iM21346a, c20811mM8009b);
                            ((InterfaceC6316H) c7749a.f11539Z).mo4968a(j11, 1, iM21346a, 0, null);
                        } else {
                            int iM21365t3 = c20811mM8009b.m21365t();
                            if (iM21365t3 == 0 && !c7749a.f24428p0) {
                                int iM21346a2 = c20811mM8009b.m21346a();
                                byte[] bArr = new byte[iM21346a2];
                                c20811mM8009b.m21350e(bArr, 0, iM21346a2);
                                C6319a c6319aM6898n = AbstractC6320b.m6898n(new C6318J(iM21346a2, bArr), false);
                                C19787n c19787n3 = new C19787n();
                                c19787n3.f62714l = AbstractC19754D.m20711i("audio/mp4a-latm");
                                c19787n3.f62711i = c6319aM6898n.f20469a;
                                c19787n3.f62728z = c6319aM6898n.f20471c;
                                c19787n3.f62694A = c6319aM6898n.f20470b;
                                c19787n3.f62717o = Collections.singletonList(bArr);
                                interfaceC6316H2.mo4971d(new C19788o(c19787n3));
                                c7749a.f24428p0 = true;
                            } else if (c7749a.f24429q0 != 10 || iM21365t3 == 1) {
                                int iM21346a3 = c20811mM8009b.m21346a();
                                interfaceC6316H2.mo4970c(iM21346a3, c20811mM8009b);
                                ((InterfaceC6316H) c7749a.f11539Z).mo4968a(j11, 1, iM21346a3, 0, null);
                            }
                            z10 = false;
                        }
                        z6 = true;
                    } else if (i10 == 9 || this.f24445p == null) {
                        if (i10 == 18 || this.f24443n) {
                            ((C6330l) interfaceC6334p).mo3052j(this.f24441l);
                            z6 = false;
                        } else {
                            C20811m c20811mM8009b2 = m8009b((C6330l) interfaceC6334p);
                            c7751c.getClass();
                            c7751c.getClass();
                            if (c20811mM8009b2.m21365t() == 2 && "onMetaData".equals(C7751c.m8012S(c20811mM8009b2)) && c20811mM8009b2.m21346a() != 0 && c20811mM8009b2.m21365t() == 8) {
                                HashMap mapM8011R = C7751c.m8011R(c20811mM8009b2);
                                Object obj = mapM8011R.get("duration");
                                if (obj instanceof Double) {
                                    double dDoubleValue = ((Double) obj).doubleValue();
                                    if (dDoubleValue > 0.0d) {
                                        c7751c.f24446o0 = (long) (dDoubleValue * 1000000.0d);
                                    }
                                }
                                Object obj2 = mapM8011R.get("keyframes");
                                if (obj2 instanceof Map) {
                                    Map map = (Map) obj2;
                                    Object obj3 = map.get("filepositions");
                                    Object obj4 = map.get("times");
                                    if ((obj3 instanceof List) && (obj4 instanceof List)) {
                                        List list = (List) obj3;
                                        List list2 = (List) obj4;
                                        int size = list2.size();
                                        c7751c.f24447p0 = new long[size];
                                        c7751c.f24448q0 = new long[size];
                                        int i15 = 0;
                                        while (i15 < size) {
                                            Object obj5 = list.get(i15);
                                            Object obj6 = list2.get(i15);
                                            if (!(obj6 instanceof Double) || !(obj5 instanceof Double)) {
                                                c7751c.f24447p0 = new long[0];
                                                c7751c.f24448q0 = new long[0];
                                                break;
                                            }
                                            c7751c.f24447p0[i15] = (long) (((Double) obj6).doubleValue() * 1000000.0d);
                                            c7751c.f24448q0[i15] = ((Double) obj5).longValue();
                                            i15++;
                                            list = list;
                                        }
                                    }
                                }
                            }
                            long j13 = c7751c.f24446o0;
                            if (j13 != -9223372036854775807L) {
                                this.f24435f.mo3045F(new C6343y(j13, c7751c.f24448q0, c7751c.f24447p0));
                                this.f24443n = true;
                            }
                            z6 = true;
                        }
                        z10 = false;
                    } else {
                        if (!this.f24443n) {
                            this.f24435f.mo3045F(new C6338t(-9223372036854775807L));
                            this.f24443n = true;
                        }
                        C7752d c7752d = this.f24445p;
                        C20811m c20811mM8009b3 = m8009b((C6330l) interfaceC6334p);
                        c7752d.getClass();
                        int iM21365t4 = c20811mM8009b3.m21365t();
                        int i16 = (iM21365t4 >> 4) & 15;
                        int i17 = iM21365t4 & 15;
                        if (i17 != 7) {
                            throw new C4229b0(AbstractC10763a.m11048f(i17, "Video format not supported: "));
                        }
                        c7752d.f24454t0 = i16;
                        if (i16 != 5) {
                            int iM21365t5 = c20811mM8009b3.m21365t();
                            byte[] bArr2 = c20811mM8009b3.f66092a;
                            int i18 = c20811mM8009b3.f66093b;
                            int i19 = i18 + 1;
                            c20811mM8009b3.f66093b = i19;
                            int i20 = ((bArr2[i18] & 255) << 24) >> 8;
                            int i21 = i18 + 2;
                            c20811mM8009b3.f66093b = i21;
                            int i22 = ((bArr2[i19] & 255) << 8) | i20;
                            c20811mM8009b3.f66093b = i18 + 3;
                            long j14 = (((long) ((bArr2[i21] & 255) | i22)) * 1000) + j11;
                            boolean z14 = true;
                            InterfaceC6316H interfaceC6316H3 = (InterfaceC6316H) c7752d.f11539Z;
                            if (iM21365t5 != 0 || c7752d.f24452r0) {
                                if (iM21365t5 == 1 && c7752d.f24452r0) {
                                    int i23 = c7752d.f24454t0 == 1 ? 1 : 0;
                                    if (c7752d.f24453s0 || i23 != 0) {
                                        C20811m c20811m3 = c7752d.f24450p0;
                                        byte[] bArr3 = c20811m3.f66092a;
                                        bArr3[0] = 0;
                                        bArr3[1] = 0;
                                        bArr3[2] = 0;
                                        int i24 = 4 - c7752d.f24451q0;
                                        int i25 = 0;
                                        while (c20811mM8009b3.m21346a() > 0) {
                                            c20811mM8009b3.m21350e(c20811m3.f66092a, i24, c7752d.f24451q0);
                                            c20811m3.m21344F(0);
                                            int iM21369x = c20811m3.m21369x();
                                            C20811m c20811m4 = c7752d.f24449o0;
                                            c20811m4.m21344F(0);
                                            interfaceC6316H3.mo4970c(4, c20811m4);
                                            interfaceC6316H3.mo4970c(iM21369x, c20811mM8009b3);
                                            i25 = i25 + 4 + iM21369x;
                                        }
                                        ((InterfaceC6316H) c7752d.f11539Z).mo4968a(j14, i23, i25, 0, null);
                                        c7752d.f24453s0 = true;
                                    }
                                }
                                if (z14) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                            } else {
                                byte[] bArr4 = new byte[c20811mM8009b3.m21346a()];
                                C20811m c20811m5 = new C20811m(bArr4);
                                c20811mM8009b3.m21350e(bArr4, 0, c20811mM8009b3.m21346a());
                                C6321c c6321cM6905a = C6321c.m6905a(c20811m5);
                                c7752d.f24451q0 = c6321cM6905a.f20498b;
                                C19787n c19787n4 = new C19787n();
                                c19787n4.f62714l = AbstractC19754D.m20711i("video/avc");
                                c19787n4.f62711i = c6321cM6905a.f20508l;
                                c19787n4.f62720r = c6321cM6905a.f20499c;
                                c19787n4.f62721s = c6321cM6905a.f20500d;
                                c19787n4.f62724v = c6321cM6905a.f20507k;
                                c19787n4.f62717o = c6321cM6905a.f20497a;
                                interfaceC6316H3.mo4971d(new C19788o(c19787n4));
                                c7752d.f24452r0 = true;
                            }
                            z14 = false;
                            if (z14) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                        } else {
                            z10 = false;
                        }
                        z6 = true;
                    }
                    if (!this.f24437h && z10) {
                        this.f24437h = true;
                        if (c7751c.f24446o0 == -9223372036854775807L) {
                            j12 = -this.f24442m;
                        } else {
                            j12 = 0;
                        }
                        this.f24438i = j12;
                    }
                    this.f24439j = 4;
                    this.f24436g = 2;
                    if (z6) {
                        return 0;
                    }
                }
                j11 = j10;
                i10 = this.f24440k;
                if (i10 != 8) {
                    if (i10 == 9) {
                    }
                    if (i10 == 18) {
                        ((C6330l) interfaceC6334p).mo3052j(this.f24441l);
                        z6 = false;
                    } else {
                        ((C6330l) interfaceC6334p).mo3052j(this.f24441l);
                        z6 = false;
                    }
                    z10 = false;
                } else {
                    if (i10 == 9) {
                    }
                    if (i10 == 18) {
                        ((C6330l) interfaceC6334p).mo3052j(this.f24441l);
                        z6 = false;
                    } else {
                        ((C6330l) interfaceC6334p).mo3052j(this.f24441l);
                        z6 = false;
                    }
                    z10 = false;
                }
                if (!this.f24437h) {
                    this.f24437h = true;
                    if (c7751c.f24446o0 == -9223372036854775807L) {
                        j12 = -this.f24442m;
                    } else {
                        j12 = 0;
                    }
                    this.f24438i = j12;
                }
                this.f24439j = 4;
                this.f24436g = 2;
                if (z6) {
                    return 0;
                }
            }
        }
    }

    @Override // p372P3.InterfaceC6333o
    /* JADX INFO: renamed from: i */
    public final void mo6860i(InterfaceC6335q interfaceC6335q) {
        this.f24435f = interfaceC6335q;
    }

    @Override // p372P3.InterfaceC6333o
    public final void release() {
    }
}
