package p824j4;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import android.util.Pair;
import android.util.SparseArray;
import bb.AbstractC11278C;
import bb.C11276A;
import bb.C11294T;
import fo.C13711h;
import io.sentry.util.C15504i;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.math.RoundingMode;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import p031B3.AbstractC0797a;
import p1016t3.AbstractC19754D;
import p1016t3.C19755E;
import p1016t3.C19784k;
import p1016t3.C19785l;
import p1016t3.C19787n;
import p1016t3.C19788o;
import p1071w0.AbstractC20734X;
import p1073w3.AbstractC20800b;
import p1073w3.AbstractC20817s;
import p1073w3.C20811m;
import p1097x3.AbstractC21121g;
import p372P3.AbstractC6320b;
import p372P3.C6328j;
import p372P3.C6330l;
import p372P3.C6337s;
import p372P3.C6338t;
import p372P3.C6341w;
import p372P3.InterfaceC6310B;
import p372P3.InterfaceC6314F;
import p372P3.InterfaceC6316H;
import p372P3.InterfaceC6333o;
import p372P3.InterfaceC6334p;
import p372P3.InterfaceC6335q;
import p588Y2.C9642z;
import p658b5.C11248s;
import p817j$.util.DesugarCollections;
import p885m4.InterfaceC17161k;

/* JADX INFO: renamed from: j4.i */
/* JADX INFO: loaded from: classes.dex */
public final class C16113i implements InterfaceC6333o {

    /* JADX INFO: renamed from: H */
    public static final byte[] f49916H = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};

    /* JADX INFO: renamed from: I */
    public static final C19788o f49917I;

    /* JADX INFO: renamed from: A */
    public int f49918A;

    /* JADX INFO: renamed from: B */
    public int f49919B;

    /* JADX INFO: renamed from: C */
    public boolean f49920C;

    /* JADX INFO: renamed from: D */
    public InterfaceC6335q f49921D;

    /* JADX INFO: renamed from: E */
    public InterfaceC6316H[] f49922E;

    /* JADX INFO: renamed from: F */
    public InterfaceC6316H[] f49923F;

    /* JADX INFO: renamed from: G */
    public boolean f49924G;

    /* JADX INFO: renamed from: a */
    public final InterfaceC17161k f49925a;

    /* JADX INFO: renamed from: b */
    public final int f49926b;

    /* JADX INFO: renamed from: c */
    public final List f49927c;

    /* JADX INFO: renamed from: d */
    public final SparseArray f49928d;

    /* JADX INFO: renamed from: e */
    public final C20811m f49929e;

    /* JADX INFO: renamed from: f */
    public final C20811m f49930f;

    /* JADX INFO: renamed from: g */
    public final C20811m f49931g;

    /* JADX INFO: renamed from: h */
    public final byte[] f49932h;

    /* JADX INFO: renamed from: i */
    public final C20811m f49933i;

    /* JADX INFO: renamed from: j */
    public final C11248s f49934j;

    /* JADX INFO: renamed from: k */
    public final C20811m f49935k;

    /* JADX INFO: renamed from: l */
    public final ArrayDeque f49936l;

    /* JADX INFO: renamed from: m */
    public final ArrayDeque f49937m;

    /* JADX INFO: renamed from: n */
    public C11294T f49938n;

    /* JADX INFO: renamed from: o */
    public int f49939o;

    /* JADX INFO: renamed from: p */
    public int f49940p;

    /* JADX INFO: renamed from: q */
    public long f49941q;

    /* JADX INFO: renamed from: r */
    public int f49942r;

    /* JADX INFO: renamed from: s */
    public C20811m f49943s;

    /* JADX INFO: renamed from: t */
    public long f49944t;

    /* JADX INFO: renamed from: u */
    public int f49945u;

    /* JADX INFO: renamed from: v */
    public long f49946v;

    /* JADX INFO: renamed from: w */
    public long f49947w;

    /* JADX INFO: renamed from: x */
    public long f49948x;

    /* JADX INFO: renamed from: y */
    public C16112h f49949y;

    /* JADX INFO: renamed from: z */
    public int f49950z;

    static {
        C19787n c19787n = new C19787n();
        c19787n.f62714l = AbstractC19754D.m20711i("application/x-emsg");
        f49917I = new C19788o(c19787n);
    }

    public C16113i(InterfaceC17161k interfaceC17161k, int i10) {
        C11276A c11276a = AbstractC11278C.f34162Z;
        C11294T c11294t = C11294T.f34185q0;
        this.f49925a = interfaceC17161k;
        this.f49926b = i10;
        this.f49927c = DesugarCollections.unmodifiableList(c11294t);
        this.f49934j = new C11248s(18);
        this.f49935k = new C20811m(16);
        this.f49929e = new C20811m(AbstractC21121g.f67114a);
        this.f49930f = new C20811m(5);
        this.f49931g = new C20811m();
        byte[] bArr = new byte[16];
        this.f49932h = bArr;
        this.f49933i = new C20811m(bArr);
        this.f49936l = new ArrayDeque();
        this.f49937m = new ArrayDeque();
        this.f49928d = new SparseArray();
        this.f49938n = c11294t;
        this.f49947w = -9223372036854775807L;
        this.f49946v = -9223372036854775807L;
        this.f49948x = -9223372036854775807L;
        this.f49921D = InterfaceC6335q.f20560e0;
        this.f49922E = new InterfaceC6316H[0];
        this.f49923F = new InterfaceC6316H[0];
    }

    /* JADX INFO: renamed from: b */
    public static C19785l m17666b(ArrayList arrayList) {
        int i10;
        int size = arrayList.size();
        int i11 = 0;
        ArrayList arrayList2 = null;
        while (i11 < size) {
            C16106b c16106b = (C16106b) arrayList.get(i11);
            if (c16106b.f2213Z == 1886614376) {
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                byte[] bArr = c16106b.f49886o0.f66092a;
                C20811m c20811m = new C20811m(bArr);
                C9642z c9642z = null;
                if (c20811m.f66094c < 32) {
                    i10 = i11;
                } else {
                    c20811m.m21344F(0);
                    int iM21346a = c20811m.m21346a();
                    int iM21352g = c20811m.m21352g();
                    if (iM21352g != iM21346a) {
                        AbstractC20800b.m21332t("PsshAtomUtil", "Advertised atom size (" + iM21352g + ") does not match buffer size: " + iM21346a);
                    } else {
                        int iM21352g2 = c20811m.m21352g();
                        if (iM21352g2 != 1886614376) {
                            AbstractC20734X.m21224A(iM21352g2, "Atom type is not pssh: ", "PsshAtomUtil");
                        } else {
                            int iM1822m = AbstractC0797a.m1822m(c20811m.m21352g());
                            if (iM1822m > 1) {
                                AbstractC20734X.m21224A(iM1822m, "Unsupported pssh version: ", "PsshAtomUtil");
                            } else {
                                i10 = i11;
                                UUID uuid = new UUID(c20811m.m21359n(), c20811m.m21359n());
                                if (iM1822m == 1) {
                                    int iM21369x = c20811m.m21369x();
                                    UUID[] uuidArr = new UUID[iM21369x];
                                    int i12 = 0;
                                    while (i12 < iM21369x) {
                                        uuidArr[i12] = new UUID(c20811m.m21359n(), c20811m.m21359n());
                                        i12++;
                                        iM21369x = iM21369x;
                                        iM1822m = iM1822m;
                                    }
                                }
                                int i13 = iM1822m;
                                int iM21369x2 = c20811m.m21369x();
                                int iM21346a2 = c20811m.m21346a();
                                if (iM21369x2 != iM21346a2) {
                                    AbstractC20800b.m21332t("PsshAtomUtil", "Atom data size (" + iM21369x2 + ") does not match the bytes left: " + iM21346a2);
                                } else {
                                    byte[] bArr2 = new byte[iM21369x2];
                                    c20811m.m21350e(bArr2, 0, iM21369x2);
                                    c9642z = new C9642z(uuid, i13, bArr2);
                                }
                            }
                        }
                    }
                    i10 = i11;
                }
                UUID uuid2 = c9642z == null ? null : (UUID) c9642z.f29064Z;
                if (uuid2 == null) {
                    AbstractC20800b.m21332t("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList2.add(new C19784k(uuid2, null, "video/mp4", bArr));
                }
            } else {
                i10 = i11;
            }
            i11 = i10 + 1;
        }
        if (arrayList2 == null) {
            return null;
        }
        return new C19785l(null, false, (C19784k[]) arrayList2.toArray(new C19784k[0]));
    }

    /* JADX INFO: renamed from: d */
    public static void m17667d(C20811m c20811m, int i10, C16122r c16122r) throws C19755E {
        c20811m.m21344F(i10 + 8);
        int iM21352g = c20811m.m21352g();
        if ((iM21352g & 1) != 0) {
            throw C19755E.m20713b("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z6 = (iM21352g & 2) != 0;
        int iM21369x = c20811m.m21369x();
        if (iM21369x == 0) {
            Arrays.fill(c16122r.f50021l, 0, c16122r.f50014e, false);
            return;
        }
        if (iM21369x != c16122r.f50014e) {
            StringBuilder sbM11057o = AbstractC10763a.m11057o(iM21369x, "Senc sample count ", " is different from fragment sample count");
            sbM11057o.append(c16122r.f50014e);
            throw C19755E.m20712a(null, sbM11057o.toString());
        }
        Arrays.fill(c16122r.f50021l, 0, iM21369x, z6);
        int iM21346a = c20811m.m21346a();
        C20811m c20811m2 = c16122r.f50023n;
        c20811m2.m21341C(iM21346a);
        c16122r.f50020k = true;
        c16122r.f50024o = true;
        c20811m.m21350e(c20811m2.f66092a, 0, c20811m2.f66094c);
        c20811m2.m21344F(0);
        c16122r.f50024o = false;
    }

    @Override // p372P3.InterfaceC6333o
    /* JADX INFO: renamed from: a */
    public final InterfaceC6333o mo6855a() {
        return this;
    }

    @Override // p372P3.InterfaceC6333o
    /* JADX INFO: renamed from: c */
    public final boolean mo6856c(InterfaceC6334p interfaceC6334p) {
        C11294T c11294tM12695y;
        InterfaceC6314F interfaceC6314FM17677h = AbstractC16119o.m17677h(interfaceC6334p, true, false);
        if (interfaceC6314FM17677h != null) {
            c11294tM12695y = AbstractC11278C.m12695y(interfaceC6314FM17677h);
        } else {
            C11276A c11276a = AbstractC11278C.f34162Z;
            c11294tM12695y = C11294T.f34185q0;
        }
        this.f49938n = c11294tM12695y;
        return interfaceC6314FM17677h == null;
    }

    /* JADX WARN: Code duplicated, block: B:160:0x039f  */
    /* JADX WARN: Code duplicated, block: B:163:0x03b5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:164:0x03b7  */
    /* JADX WARN: Code duplicated, block: B:165:0x03c6  */
    /* JADX WARN: Code duplicated, block: B:168:0x03d4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:169:0x03d6  */
    /* JADX WARN: Code duplicated, block: B:170:0x03df  */
    /* JADX WARN: Code duplicated, block: B:172:0x03e5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:173:0x03e7  */
    /* JADX WARN: Code duplicated, block: B:174:0x03ec  */
    /* JADX WARN: Code duplicated, block: B:177:0x03f3  */
    /* JADX WARN: Code duplicated, block: B:179:0x03f7  */
    /* JADX WARN: Code duplicated, block: B:180:0x0404  */
    /* JADX WARN: Code duplicated, block: B:183:0x0422  */
    /* JADX WARN: Code duplicated, block: B:184:0x0432  */
    /* JADX WARN: Code duplicated, block: B:190:0x044a  */
    /* JADX WARN: Code duplicated, block: B:309:0x06f2  */
    /* JADX WARN: Code duplicated, block: B:344:0x047b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:345:0x0469 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:99:0x0287  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e */
    public final void m17668e(long j10) throws C19755E {
        C16113i c16113i;
        int i10;
        C16113i c16113i2;
        ArrayList arrayList;
        SparseArray sparseArray;
        int i11;
        int i12;
        ArrayList arrayList2;
        int i13;
        int i14;
        int i15;
        boolean z6;
        ArrayList arrayList3;
        int i16;
        int i17;
        C16112h c16112h;
        C16110f c16110f;
        boolean z10;
        boolean z11;
        int[] iArr;
        long[] jArr;
        boolean[] zArr;
        boolean z12;
        int i18;
        C16112h c16112h2;
        int i19;
        long j11;
        int i20;
        C16110f c16110f2;
        int iM21352g;
        int iM21352g2;
        int iM21352g3;
        int iM21352g4;
        long jM21396J;
        C16112h c16112h3;
        boolean z13;
        long[] jArr2;
        char c9;
        int i21;
        C16110f c16110f3;
        C16110f c16110f4;
        ArrayList arrayList4;
        C16113i c16113i3 = this;
        int i22 = 1;
        while (true) {
            ArrayDeque arrayDeque = c16113i3.f49936l;
            if (arrayDeque.isEmpty() || ((C16105a) arrayDeque.peek()).f49883o0 != j10) {
                break;
            }
            C16105a c16105a = (C16105a) arrayDeque.pop();
            int i23 = c16105a.f2213Z;
            SparseArray sparseArray2 = c16113i3.f49928d;
            ArrayList arrayList5 = c16105a.f49884p0;
            int i24 = c16113i3.f49926b;
            int i25 = 12;
            if (i23 == 1836019574) {
                C19785l c19785lM17666b = m17666b(arrayList5);
                C16105a c16105aM17653n = c16105a.m17653n(1836475768);
                c16105aM17653n.getClass();
                SparseArray sparseArray3 = new SparseArray();
                ArrayList arrayList6 = c16105aM17653n.f49884p0;
                int size = arrayList6.size();
                long jM21367v = -9223372036854775807L;
                int i26 = 0;
                while (i26 < size) {
                    C16106b c16106b = (C16106b) arrayList6.get(i26);
                    int i27 = c16106b.f2213Z;
                    C20811m c20811m = c16106b.f49886o0;
                    if (i27 == 1953654136) {
                        c20811m.m21344F(i25);
                        arrayList4 = arrayList6;
                        Pair pairCreate = Pair.create(Integer.valueOf(c20811m.m21352g()), new C16110f(c20811m.m21352g() - i22, c20811m.m21352g(), c20811m.m21352g(), c20811m.m21352g()));
                        sparseArray3.put(((Integer) pairCreate.first).intValue(), (C16110f) pairCreate.second);
                    } else {
                        arrayList4 = arrayList6;
                        if (i27 == 1835362404) {
                            c20811m.m21344F(8);
                            jM21367v = AbstractC0797a.m1822m(c20811m.m21352g()) == 0 ? c20811m.m21367v() : c20811m.m21370y();
                        }
                    }
                    i26++;
                    i22 = 1;
                    arrayList6 = arrayList4;
                    i25 = 12;
                }
                int i28 = i22;
                ArrayList arrayListM17661f = AbstractC16109e.m17661f(c16105a, new C6341w(), jM21367v, c19785lM17666b, (i24 & 16) != 0 ? i28 : 0, false, new C15504i(c16113i3, i28));
                int size2 = arrayListM17661f.size();
                if (sparseArray2.size() == 0) {
                    for (int i29 = 0; i29 < size2; i29++) {
                        C16123s c16123s = (C16123s) arrayListM17661f.get(i29);
                        C16120p c16120p = c16123s.f50027a;
                        InterfaceC6316H interfaceC6316HMo3044D = c16113i3.f49921D.mo3044D(i29, c16120p.f49995b);
                        int size3 = sparseArray3.size();
                        int i30 = c16120p.f49994a;
                        if (size3 == 1) {
                            c16110f4 = (C16110f) sparseArray3.valueAt(0);
                        } else {
                            c16110f4 = (C16110f) sparseArray3.get(i30);
                            c16110f4.getClass();
                        }
                        sparseArray2.put(i30, new C16112h(interfaceC6316HMo3044D, c16123s, c16110f4));
                        c16113i3.f49947w = Math.max(c16113i3.f49947w, c16120p.f49998e);
                    }
                    c16113i3.f49921D.mo3061s();
                } else {
                    AbstractC20800b.m21320h(sparseArray2.size() == size2);
                    for (int i31 = 0; i31 < size2; i31++) {
                        C16123s c16123s2 = (C16123s) arrayListM17661f.get(i31);
                        C16120p c16120p2 = c16123s2.f50027a;
                        C16112h c16112h4 = (C16112h) sparseArray2.get(c16120p2.f49994a);
                        if (sparseArray3.size() == 1) {
                            c16110f3 = (C16110f) sparseArray3.valueAt(0);
                        } else {
                            c16110f3 = (C16110f) sparseArray3.get(c16120p2.f49994a);
                            c16110f3.getClass();
                        }
                        c16112h4.f49907d = c16123s2;
                        c16112h4.f49908e = c16110f3;
                        c16112h4.f49904a.mo4971d(c16123s2.f50027a.f49999f);
                        c16112h4.m17665d();
                    }
                }
                c16113i = c16113i3;
                i10 = 1;
            } else {
                SparseArray sparseArray4 = sparseArray2;
                if (i23 == 1836019558) {
                    ArrayList arrayList7 = c16105a.f49885q0;
                    int size4 = arrayList7.size();
                    int i32 = 0;
                    while (i32 < size4) {
                        C16105a c16105a2 = (C16105a) arrayList7.get(i32);
                        if (c16105a2.f2213Z == 1953653094) {
                            C16106b c16106bM17654o = c16105a2.m17654o(1952868452);
                            c16106bM17654o.getClass();
                            C20811m c20811m2 = c16106bM17654o.f49886o0;
                            c20811m2.m21344F(8);
                            int iM21352g5 = c20811m2.m21352g();
                            C16112h c16112h5 = (C16112h) sparseArray4.get(c20811m2.m21352g());
                            if (c16112h5 == null) {
                                c16112h5 = null;
                            } else {
                                int i33 = iM21352g5 & 1;
                                C16122r c16122r = c16112h5.f49905b;
                                if (i33 != 0) {
                                    long jM21370y = c20811m2.m21370y();
                                    c16122r.f50011b = jM21370y;
                                    c16122r.f50012c = jM21370y;
                                }
                                C16110f c16110f5 = c16112h5.f49908e;
                                c16122r.f50010a = new C16110f((iM21352g5 & 2) != 0 ? c20811m2.m21352g() - 1 : c16110f5.f49897a, (iM21352g5 & 8) != 0 ? c20811m2.m21352g() : c16110f5.f49898b, (iM21352g5 & 16) != 0 ? c20811m2.m21352g() : c16110f5.f49899c, (iM21352g5 & 32) != 0 ? c20811m2.m21352g() : c16110f5.f49900d);
                            }
                            if (c16112h5 != null) {
                                C16122r c16122r2 = c16112h5.f49905b;
                                long j12 = c16122r2.f50025p;
                                boolean z14 = c16122r2.f50026q;
                                c16112h5.m17665d();
                                c16112h5.f49915l = true;
                                C16106b c16106bM17654o2 = c16105a2.m17654o(1952867444);
                                if (c16106bM17654o2 == null || (i24 & 2) != 0) {
                                    c16122r2.f50025p = j12;
                                    c16122r2.f50026q = z14;
                                } else {
                                    C20811m c20811m3 = c16106bM17654o2.f49886o0;
                                    c20811m3.m21344F(8);
                                    c16122r2.f50025p = AbstractC0797a.m1822m(c20811m3.m21352g()) == 1 ? c20811m3.m21370y() : c20811m3.m21367v();
                                    c16122r2.f50026q = true;
                                }
                                ArrayList arrayList8 = c16105a2.f49884p0;
                                int size5 = arrayList8.size();
                                int i34 = 0;
                                int i35 = 0;
                                int i36 = 0;
                                while (true) {
                                    i14 = 1953658222;
                                    if (i34 >= size5) {
                                        break;
                                    }
                                    ArrayList arrayList9 = arrayList7;
                                    C16106b c16106b2 = (C16106b) arrayList8.get(i34);
                                    int i37 = size4;
                                    if (c16106b2.f2213Z == 1953658222) {
                                        C20811m c20811m4 = c16106b2.f49886o0;
                                        c20811m4.m21344F(12);
                                        int iM21369x = c20811m4.m21369x();
                                        if (iM21369x > 0) {
                                            i36 += iM21369x;
                                            i21 = 1;
                                            i35++;
                                        } else {
                                            i21 = 1;
                                        }
                                    } else {
                                        i21 = 1;
                                    }
                                    i34 += i21;
                                    size4 = i37;
                                    arrayList7 = arrayList9;
                                }
                                arrayList = arrayList7;
                                i11 = size4;
                                c16112h5.f49911h = 0;
                                c16112h5.f49910g = 0;
                                c16112h5.f49909f = 0;
                                c16122r2.f50013d = i35;
                                c16122r2.f50014e = i36;
                                if (c16122r2.f50016g.length < i35) {
                                    c16122r2.f50015f = new long[i35];
                                    c16122r2.f50016g = new int[i35];
                                }
                                if (c16122r2.f50017h.length < i36) {
                                    int i38 = (i36 * 125) / 100;
                                    c16122r2.f50017h = new int[i38];
                                    c16122r2.f50018i = new long[i38];
                                    c16122r2.f50019j = new boolean[i38];
                                    c16122r2.f50021l = new boolean[i38];
                                }
                                int i39 = 0;
                                int i40 = 0;
                                int i41 = 0;
                                while (true) {
                                    long j13 = 0;
                                    if (i39 >= size5) {
                                        sparseArray = sparseArray4;
                                        ArrayList arrayList10 = arrayList8;
                                        i12 = i32;
                                        C16105a c16105a3 = c16105a2;
                                        arrayList2 = arrayList5;
                                        i13 = i24;
                                        C16123s c16123s3 = c16112h5.f49907d;
                                        C16110f c16110f6 = c16122r2.f50010a;
                                        c16110f6.getClass();
                                        C16121q c16121q = c16123s3.f50027a.f50004k[c16110f6.f49897a];
                                        C16106b c16106bM17654o3 = c16105a3.m17654o(1935763834);
                                        if (c16106bM17654o3 != null) {
                                            c16121q.getClass();
                                            C20811m c20811m5 = c16106bM17654o3.f49886o0;
                                            c20811m5.m21344F(8);
                                            if ((c20811m5.m21352g() & 1) == 1) {
                                                c20811m5.m21345G(8);
                                            }
                                            int iM21365t = c20811m5.m21365t();
                                            int iM21369x2 = c20811m5.m21369x();
                                            if (iM21369x2 > c16122r2.f50014e) {
                                                StringBuilder sbM11057o = AbstractC10763a.m11057o(iM21369x2, "Saiz sample count ", " is greater than fragment sample count");
                                                sbM11057o.append(c16122r2.f50014e);
                                                throw C19755E.m20712a(null, sbM11057o.toString());
                                            }
                                            int i42 = c16121q.f50008d;
                                            if (iM21365t == 0) {
                                                boolean[] zArr2 = c16122r2.f50021l;
                                                i15 = 0;
                                                for (int i43 = 0; i43 < iM21369x2; i43++) {
                                                    int iM21365t2 = c20811m5.m21365t();
                                                    i15 += iM21365t2;
                                                    zArr2[i43] = iM21365t2 > i42;
                                                }
                                                z6 = false;
                                            } else {
                                                boolean z15 = iM21365t > i42;
                                                i15 = iM21365t * iM21369x2;
                                                z6 = false;
                                                Arrays.fill(c16122r2.f50021l, 0, iM21369x2, z15);
                                            }
                                            Arrays.fill(c16122r2.f50021l, iM21369x2, c16122r2.f50014e, z6);
                                            if (i15 > 0) {
                                                c16122r2.f50023n.m21341C(i15);
                                                c16122r2.f50020k = true;
                                                c16122r2.f50024o = true;
                                            }
                                        }
                                        C16106b c16106bM17654o4 = c16105a3.m17654o(1935763823);
                                        if (c16106bM17654o4 != null) {
                                            C20811m c20811m6 = c16106bM17654o4.f49886o0;
                                            c20811m6.m21344F(8);
                                            int iM21352g6 = c20811m6.m21352g();
                                            if ((iM21352g6 & 1) == 1) {
                                                c20811m6.m21345G(8);
                                            }
                                            int iM21369x3 = c20811m6.m21369x();
                                            if (iM21369x3 != 1) {
                                                throw C19755E.m20712a(null, "Unexpected saio entry count: " + iM21369x3);
                                            }
                                            c16122r2.f50012c += AbstractC0797a.m1822m(iM21352g6) == 0 ? c20811m6.m21367v() : c20811m6.m21370y();
                                        }
                                        byte[] bArr = null;
                                        C16106b c16106bM17654o5 = c16105a3.m17654o(1936027235);
                                        if (c16106bM17654o5 != null) {
                                            m17667d(c16106bM17654o5.f49886o0, 0, c16122r2);
                                        }
                                        String str = c16121q != null ? c16121q.f50006b : null;
                                        C20811m c20811m7 = null;
                                        C20811m c20811m8 = null;
                                        int i44 = 0;
                                        while (i44 < arrayList10.size()) {
                                            ArrayList arrayList11 = arrayList10;
                                            C16106b c16106b3 = (C16106b) arrayList11.get(i44);
                                            C20811m c20811m9 = c16106b3.f49886o0;
                                            int i45 = c16106b3.f2213Z;
                                            if (i45 == 1935828848) {
                                                c20811m9.m21344F(12);
                                                if (c20811m9.m21352g() == 1936025959) {
                                                    c20811m7 = c20811m9;
                                                }
                                            } else if (i45 == 1936158820) {
                                                c20811m9.m21344F(12);
                                                if (c20811m9.m21352g() == 1936025959) {
                                                    c20811m8 = c20811m9;
                                                }
                                            }
                                            i44++;
                                            arrayList10 = arrayList11;
                                        }
                                        ArrayList arrayList12 = arrayList10;
                                        if (c20811m7 != null && c20811m8 != null) {
                                            c20811m7.m21344F(8);
                                            int iM1822m = AbstractC0797a.m1822m(c20811m7.m21352g());
                                            c20811m7.m21345G(4);
                                            if (iM1822m == 1) {
                                                c20811m7.m21345G(4);
                                            }
                                            if (c20811m7.m21352g() != 1) {
                                                throw C19755E.m20713b("Entry count in sbgp != 1 (unsupported).");
                                            }
                                            c20811m8.m21344F(8);
                                            int iM1822m2 = AbstractC0797a.m1822m(c20811m8.m21352g());
                                            c20811m8.m21345G(4);
                                            if (iM1822m2 == 1) {
                                                if (c20811m8.m21367v() == 0) {
                                                    throw C19755E.m20713b("Variable length description in sgpd found (unsupported)");
                                                }
                                            } else if (iM1822m2 >= 2) {
                                                c20811m8.m21345G(4);
                                            }
                                            if (c20811m8.m21367v() != 1) {
                                                throw C19755E.m20713b("Entry count in sgpd != 1 (unsupported).");
                                            }
                                            c20811m8.m21345G(1);
                                            int iM21365t3 = c20811m8.m21365t();
                                            int i46 = (iM21365t3 & 240) >> 4;
                                            int i47 = iM21365t3 & 15;
                                            boolean z16 = c20811m8.m21365t() == 1;
                                            if (z16) {
                                                int iM21365t4 = c20811m8.m21365t();
                                                byte[] bArr2 = new byte[16];
                                                c20811m8.m21350e(bArr2, 0, 16);
                                                if (iM21365t4 == 0) {
                                                    int iM21365t5 = c20811m8.m21365t();
                                                    bArr = new byte[iM21365t5];
                                                    c20811m8.m21350e(bArr, 0, iM21365t5);
                                                }
                                                c16122r2.f50020k = true;
                                                c16122r2.f50022m = new C16121q(z16, str, iM21365t4, bArr2, i46, i47, bArr);
                                            }
                                        }
                                        int size6 = arrayList12.size();
                                        for (int i48 = 0; i48 < size6; i48++) {
                                            C16106b c16106b4 = (C16106b) arrayList12.get(i48);
                                            if (c16106b4.f2213Z == 1970628964) {
                                                C20811m c20811m10 = c16106b4.f49886o0;
                                                c20811m10.m21344F(8);
                                                byte[] bArr3 = this.f49932h;
                                                c20811m10.m21350e(bArr3, 0, 16);
                                                if (Arrays.equals(bArr3, f49916H)) {
                                                    m17667d(c20811m10, 16, c16122r2);
                                                }
                                            }
                                        }
                                        c16113i2 = this;
                                        break;
                                    }
                                    C16106b c16106b5 = (C16106b) arrayList8.get(i39);
                                    if (c16106b5.f2213Z == i14) {
                                        int i49 = i40 + 1;
                                        C20811m c20811m11 = c16106b5.f49886o0;
                                        c20811m11.m21344F(8);
                                        int iM21352g7 = c20811m11.m21352g();
                                        C16123s c16123s4 = c16112h5.f49907d;
                                        C16110f c16110f7 = c16122r2.f50010a;
                                        int i50 = AbstractC20817s.f66106a;
                                        c16122r2.f50016g[i40] = c20811m11.m21369x();
                                        long[] jArr3 = c16122r2.f50015f;
                                        long j14 = c16122r2.f50011b;
                                        jArr3[i40] = j14;
                                        if ((iM21352g7 & 1) != 0) {
                                            jArr3[i40] = j14 + ((long) c20811m11.m21352g());
                                        }
                                        boolean z17 = (iM21352g7 & 4) != 0;
                                        int iM21352g8 = c16110f7.f49900d;
                                        if (z17) {
                                            iM21352g8 = c20811m11.m21352g();
                                        }
                                        boolean z18 = (iM21352g7 & 256) != 0;
                                        boolean z19 = (iM21352g7 & 512) != 0;
                                        boolean z20 = (iM21352g7 & 1024) != 0;
                                        boolean z21 = (iM21352g7 & 2048) != 0;
                                        C16120p c16120p3 = c16123s4.f50027a;
                                        long[] jArr4 = c16120p3.f50001h;
                                        int i51 = iM21352g8;
                                        if (jArr4 != null) {
                                            i16 = i32;
                                            if (jArr4.length == 1 && (jArr2 = c16120p3.f50002i) != null) {
                                                long j15 = jArr4[0];
                                                if (j15 == 0) {
                                                    c16110f = c16110f7;
                                                    z10 = z20;
                                                    z11 = z21;
                                                } else {
                                                    long j16 = j15 + jArr2[0];
                                                    z11 = z21;
                                                    z10 = z20;
                                                    c16110f = c16110f7;
                                                    c9 = AbstractC20817s.m21396J(j16, 1000000L, c16120p3.f49997d, RoundingMode.FLOOR) >= c16120p3.f49998e ? (char) 0 : (char) 0;
                                                }
                                                j13 = jArr2[c9];
                                            }
                                            iArr = c16122r2.f50017h;
                                            jArr = c16122r2.f50018i;
                                            zArr = c16122r2.f50019j;
                                            if (c16120p3.f49995b == 2 || (i24 & 1) == 0) {
                                                z12 = false;
                                            } else {
                                                z12 = true;
                                            }
                                            i18 = i41 + c16122r2.f50016g[i40];
                                            boolean z22 = z12;
                                            c16112h2 = c16112h5;
                                            i19 = i24;
                                            j11 = c16122r2.f50025p;
                                            i20 = i41;
                                            while (i20 < i18) {
                                                if (z18) {
                                                    c16110f2 = c16110f;
                                                    iM21352g = c20811m11.m21352g();
                                                } else {
                                                    c16110f2 = c16110f;
                                                    iM21352g = c16110f2.f49898b;
                                                }
                                                if (iM21352g >= 0) {
                                                    throw C19755E.m20712a(null, "Unexpected negative value: " + iM21352g);
                                                }
                                                if (z19) {
                                                    iM21352g2 = c20811m11.m21352g();
                                                } else {
                                                    iM21352g2 = c16110f2.f49899c;
                                                }
                                                if (iM21352g2 >= 0) {
                                                    throw C19755E.m20712a(null, "Unexpected negative value: " + iM21352g2);
                                                }
                                                if (z10) {
                                                    iM21352g3 = c20811m11.m21352g();
                                                } else if (i20 == 0 || !z17) {
                                                    iM21352g3 = c16110f2.f49900d;
                                                } else {
                                                    iM21352g3 = i51;
                                                }
                                                if (z11) {
                                                    iM21352g4 = c20811m11.m21352g();
                                                } else {
                                                    iM21352g4 = 0;
                                                }
                                                jM21396J = AbstractC20817s.m21396J((((long) iM21352g4) + j11) - j13, 1000000L, c16120p3.f49996c, RoundingMode.FLOOR);
                                                jArr[i20] = jM21396J;
                                                if (c16122r2.f50026q) {
                                                    c16112h3 = c16112h2;
                                                } else {
                                                    c16112h3 = c16112h2;
                                                    jArr[i20] = jM21396J + c16112h3.f49907d.f50034h;
                                                }
                                                iArr[i20] = iM21352g2;
                                                if (((iM21352g3 >> 16) & 1) == 0 || (z22 && i20 != 0)) {
                                                    z13 = false;
                                                } else {
                                                    z13 = true;
                                                }
                                                zArr[i20] = z13;
                                                j11 += (long) iM21352g;
                                                i20++;
                                                i18 = i18;
                                                c16110f = c16110f2;
                                                z18 = z18;
                                                i19 = i19;
                                                z19 = z19;
                                                arrayList8 = arrayList8;
                                                c16120p3 = c16120p3;
                                                z11 = z11;
                                                c16112h2 = c16112h3;
                                                z17 = z17;
                                            }
                                            arrayList3 = arrayList8;
                                            int i52 = i18;
                                            i17 = i19;
                                            c16112h = c16112h2;
                                            c16122r2.f50025p = j11;
                                            i40 = i49;
                                            i41 = i52;
                                        } else {
                                            i16 = i32;
                                        }
                                        c16110f = c16110f7;
                                        z10 = z20;
                                        z11 = z21;
                                        iArr = c16122r2.f50017h;
                                        jArr = c16122r2.f50018i;
                                        zArr = c16122r2.f50019j;
                                        if (c16120p3.f49995b == 2) {
                                            z12 = false;
                                        } else {
                                            z12 = false;
                                        }
                                        i18 = i41 + c16122r2.f50016g[i40];
                                        boolean z23 = z12;
                                        c16112h2 = c16112h5;
                                        i19 = i24;
                                        j11 = c16122r2.f50025p;
                                        i20 = i41;
                                        while (i20 < i18) {
                                            if (z18) {
                                                c16110f2 = c16110f;
                                                iM21352g = c20811m11.m21352g();
                                            } else {
                                                c16110f2 = c16110f;
                                                iM21352g = c16110f2.f49898b;
                                            }
                                            if (iM21352g >= 0) {
                                                throw C19755E.m20712a(null, "Unexpected negative value: " + iM21352g);
                                            }
                                            if (z19) {
                                                iM21352g2 = c20811m11.m21352g();
                                            } else {
                                                iM21352g2 = c16110f2.f49899c;
                                            }
                                            if (iM21352g2 >= 0) {
                                                throw C19755E.m20712a(null, "Unexpected negative value: " + iM21352g2);
                                            }
                                            if (z10) {
                                                iM21352g3 = c20811m11.m21352g();
                                            } else if (i20 == 0) {
                                                iM21352g3 = c16110f2.f49900d;
                                            } else {
                                                iM21352g3 = c16110f2.f49900d;
                                            }
                                            if (z11) {
                                                iM21352g4 = c20811m11.m21352g();
                                            } else {
                                                iM21352g4 = 0;
                                            }
                                            jM21396J = AbstractC20817s.m21396J((((long) iM21352g4) + j11) - j13, 1000000L, c16120p3.f49996c, RoundingMode.FLOOR);
                                            jArr[i20] = jM21396J;
                                            if (c16122r2.f50026q) {
                                                c16112h3 = c16112h2;
                                                jArr[i20] = jM21396J + c16112h3.f49907d.f50034h;
                                            } else {
                                                c16112h3 = c16112h2;
                                            }
                                            iArr[i20] = iM21352g2;
                                            if (((iM21352g3 >> 16) & 1) == 0) {
                                                z13 = false;
                                            } else {
                                                z13 = false;
                                            }
                                            zArr[i20] = z13;
                                            j11 += (long) iM21352g;
                                            i20++;
                                            i18 = i18;
                                            c16110f = c16110f2;
                                            z18 = z18;
                                            i19 = i19;
                                            z19 = z19;
                                            arrayList8 = arrayList8;
                                            c16120p3 = c16120p3;
                                            z11 = z11;
                                            c16112h2 = c16112h3;
                                            z17 = z17;
                                        }
                                        arrayList3 = arrayList8;
                                        int i53 = i18;
                                        i17 = i19;
                                        c16112h = c16112h2;
                                        c16122r2.f50025p = j11;
                                        i40 = i49;
                                        i41 = i53;
                                    } else {
                                        arrayList3 = arrayList8;
                                        i16 = i32;
                                        c16105a2 = c16105a2;
                                        arrayList5 = arrayList5;
                                        i17 = i24;
                                        c16112h = c16112h5;
                                    }
                                    c16112h5 = c16112h;
                                    i39++;
                                    size5 = size5;
                                    sparseArray4 = sparseArray4;
                                    arrayList5 = arrayList5;
                                    c16105a2 = c16105a2;
                                    i32 = i16;
                                    i24 = i17;
                                    arrayList8 = arrayList3;
                                    i14 = 1953658222;
                                }
                            } else {
                                c16113i2 = c16113i3;
                                arrayList = arrayList7;
                                sparseArray = sparseArray4;
                                i11 = size4;
                                i12 = i32;
                                arrayList2 = arrayList5;
                                i13 = i24;
                            }
                        } else {
                            c16113i2 = c16113i3;
                            arrayList = arrayList7;
                            sparseArray = sparseArray4;
                            i11 = size4;
                            i12 = i32;
                            arrayList2 = arrayList5;
                            i13 = i24;
                        }
                        i32 = i12 + 1;
                        c16113i3 = c16113i2;
                        size4 = i11;
                        arrayList7 = arrayList;
                        sparseArray4 = sparseArray;
                        arrayList5 = arrayList2;
                        i24 = i13;
                    }
                    c16113i = c16113i3;
                    SparseArray sparseArray5 = sparseArray4;
                    C19785l c19785lM17666b2 = m17666b(arrayList5);
                    if (c19785lM17666b2 != null) {
                        int size7 = sparseArray5.size();
                        int i54 = 0;
                        while (i54 < size7) {
                            SparseArray sparseArray6 = sparseArray5;
                            C16112h c16112h6 = (C16112h) sparseArray6.valueAt(i54);
                            C16123s c16123s5 = c16112h6.f49907d;
                            C16110f c16110f8 = c16112h6.f49905b.f50010a;
                            int i55 = AbstractC20817s.f66106a;
                            C16121q c16121q2 = c16123s5.f50027a.f50004k[c16110f8.f49897a];
                            C19785l c19785lM20744a = c19785lM17666b2.m20744a(c16121q2 != null ? c16121q2.f50006b : null);
                            C19787n c19787nM20747a = c16112h6.f49907d.f50027a.f49999f.m20747a();
                            c19787nM20747a.f62718p = c19785lM20744a;
                            c16112h6.f49904a.mo4971d(new C19788o(c19787nM20747a));
                            i54++;
                            sparseArray5 = sparseArray6;
                        }
                    }
                    SparseArray sparseArray7 = sparseArray5;
                    if (c16113i.f49946v != -9223372036854775807L) {
                        int size8 = sparseArray7.size();
                        for (int i56 = 0; i56 < size8; i56++) {
                            C16112h c16112h7 = (C16112h) sparseArray7.valueAt(i56);
                            long j17 = c16113i.f49946v;
                            int i57 = c16112h7.f49909f;
                            while (true) {
                                C16122r c16122r3 = c16112h7.f49905b;
                                if (i57 >= c16122r3.f50014e || c16122r3.f50018i[i57] > j17) {
                                    break;
                                }
                                if (c16122r3.f50019j[i57]) {
                                    c16112h7.f49912i = i57;
                                }
                                i57++;
                            }
                        }
                        i10 = 1;
                        c16113i.f49946v = -9223372036854775807L;
                    } else {
                        i10 = 1;
                    }
                } else {
                    c16113i = c16113i3;
                    i10 = 1;
                    if (!arrayDeque.isEmpty()) {
                        ((C16105a) arrayDeque.peek()).f49885q0.add(c16105a);
                    }
                }
            }
            c16113i3 = c16113i;
            i22 = i10;
        }
        C16113i c16113i4 = c16113i3;
        c16113i4.f49939o = 0;
        c16113i4.f49942r = 0;
    }

    @Override // p372P3.InterfaceC6333o
    /* JADX INFO: renamed from: f */
    public final void mo6857f(long j10, long j11) {
        SparseArray sparseArray = this.f49928d;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((C16112h) sparseArray.valueAt(i10)).m17665d();
        }
        this.f49937m.clear();
        this.f49945u = 0;
        this.f49946v = j11;
        this.f49936l.clear();
        this.f49939o = 0;
        this.f49942r = 0;
    }

    @Override // p372P3.InterfaceC6333o
    /* JADX INFO: renamed from: g */
    public final List mo6858g() {
        return this.f49938n;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // p372P3.InterfaceC6333o
    /* JADX INFO: renamed from: h */
    public final int mo6859h(InterfaceC6334p interfaceC6334p, C6337s c6337s) throws C19755E {
        InterfaceC6334p interfaceC6334p2;
        int i10;
        ArrayDeque arrayDeque;
        ArrayDeque arrayDeque2;
        String strM21360o;
        long jM21396J;
        long j10;
        long jM21396J2;
        String str;
        long jM21367v;
        long jM21370y;
        long jM21370y2;
        C16112h c16112h;
        int iMo4973f;
        C20811m c20811m;
        boolean z6;
        loop0: while (true) {
            interfaceC6334p2 = interfaceC6334p;
            while (true) {
                i10 = 1;
                while (true) {
                    int i11 = this.f49939o;
                    arrayDeque = this.f49936l;
                    SparseArray sparseArray = this.f49928d;
                    if (i11 != 0) {
                        arrayDeque2 = this.f49937m;
                        if (i11 != i10) {
                            long j11 = Long.MAX_VALUE;
                            if (i11 != 2) {
                                c16112h = this.f49949y;
                                if (c16112h != null) {
                                    break loop0;
                                }
                                int size = sparseArray.size();
                                long j12 = Long.MAX_VALUE;
                                C16112h c16112h2 = null;
                                for (int i12 = 0; i12 < size; i12 += i10) {
                                    C16112h c16112h3 = (C16112h) sparseArray.valueAt(i12);
                                    boolean z10 = c16112h3.f49915l;
                                    if (z10 || c16112h3.f49909f != c16112h3.f49907d.f50028b) {
                                        C16122r c16122r = c16112h3.f49905b;
                                        if (!z10 || c16112h3.f49911h != c16122r.f50013d) {
                                            long j13 = !z10 ? c16112h3.f49907d.f50029c[c16112h3.f49909f] : c16122r.f50015f[c16112h3.f49911h];
                                            if (j13 < j12) {
                                                j12 = j13;
                                                c16112h2 = c16112h3;
                                            }
                                        }
                                    }
                                }
                                if (c16112h2 != null) {
                                    int i13 = (int) ((!c16112h2.f49915l ? c16112h2.f49907d.f50029c[c16112h2.f49909f] : c16112h2.f49905b.f50015f[c16112h2.f49911h]) - ((C6330l) interfaceC6334p2).f20548p0);
                                    if (i13 < 0) {
                                        AbstractC20800b.m21332t("FragmentedMp4Extractor", "Ignoring negative offset to sample data.");
                                        i13 = 0;
                                    }
                                    ((C6330l) interfaceC6334p2).mo3052j(i13);
                                    this.f49949y = c16112h2;
                                    c16112h = c16112h2;
                                    break loop0;
                                }
                                int i14 = (int) (this.f49944t - ((C6330l) interfaceC6334p2).f20548p0);
                                if (i14 < 0) {
                                    throw C19755E.m20712a(null, "Offset to end of mdat was negative.");
                                }
                                ((C6330l) interfaceC6334p2).mo3052j(i14);
                                this.f49939o = 0;
                                this.f49942r = 0;
                            } else {
                                int size2 = sparseArray.size();
                                C16112h c16112h4 = null;
                                for (int i15 = 0; i15 < size2; i15++) {
                                    C16122r c16122r2 = ((C16112h) sparseArray.valueAt(i15)).f49905b;
                                    if (c16122r2.f50024o) {
                                        long j14 = c16122r2.f50012c;
                                        if (j14 < j11) {
                                            c16112h4 = (C16112h) sparseArray.valueAt(i15);
                                            j11 = j14;
                                        }
                                    }
                                }
                                if (c16112h4 == null) {
                                    this.f49939o = 3;
                                } else {
                                    int i16 = (int) (j11 - ((C6330l) interfaceC6334p2).f20548p0);
                                    if (i16 < 0) {
                                        throw C19755E.m20712a(null, "Offset to encryption data was negative.");
                                    }
                                    C6330l c6330l = (C6330l) interfaceC6334p2;
                                    c6330l.mo3052j(i16);
                                    C16122r c16122r3 = c16112h4.f49905b;
                                    C20811m c20811m2 = c16122r3.f50023n;
                                    c6330l.mo3046b(c20811m2.f66092a, 0, c20811m2.f66094c, false);
                                    c20811m2.m21344F(0);
                                    c16122r3.f50024o = false;
                                }
                            }
                        }
                    } else {
                        int i17 = this.f49942r;
                        C20811m c20811m3 = this.f49935k;
                        if (i17 == 0) {
                            if (!((C6330l) interfaceC6334p).mo3046b(c20811m3.f66092a, 0, 8, true)) {
                                return -1;
                            }
                            this.f49942r = 8;
                            c20811m3.m21344F(0);
                            this.f49941q = c20811m3.m21367v();
                            this.f49940p = c20811m3.m21352g();
                        }
                        long j15 = this.f49941q;
                        if (j15 == 1) {
                            ((C6330l) interfaceC6334p).mo3046b(c20811m3.f66092a, 8, 8, false);
                            this.f49942r += 8;
                            this.f49941q = c20811m3.m21370y();
                        } else if (j15 == 0) {
                            long j16 = ((C6330l) interfaceC6334p).f20547o0;
                            if (j16 == -1 && !arrayDeque.isEmpty()) {
                                j16 = ((C16105a) arrayDeque.peek()).f49883o0;
                            }
                            if (j16 != -1) {
                                this.f49941q = (j16 - ((C6330l) interfaceC6334p).f20548p0) + ((long) this.f49942r);
                            }
                        }
                        long j17 = this.f49941q;
                        int i18 = this.f49942r;
                        if (j17 < i18) {
                            throw C19755E.m20713b("Atom size less than header length (unsupported).");
                        }
                        long j18 = ((C6330l) interfaceC6334p).f20548p0 - ((long) i18);
                        int i19 = this.f49940p;
                        if ((i19 == 1836019558 || i19 == 1835295092) && !this.f49924G) {
                            this.f49921D.mo3045F(new C6338t(this.f49947w, j18));
                            this.f49924G = true;
                        }
                        if (this.f49940p == 1836019558) {
                            int size3 = sparseArray.size();
                            for (int i20 = 0; i20 < size3; i20++) {
                                C16122r c16122r4 = ((C16112h) sparseArray.valueAt(i20)).f49905b;
                                c16122r4.getClass();
                                c16122r4.f50012c = j18;
                                c16122r4.f50011b = j18;
                            }
                        }
                        int i21 = this.f49940p;
                        if (i21 == 1835295092) {
                            this.f49949y = null;
                            this.f49944t = j18 + this.f49941q;
                            this.f49939o = 2;
                            i10 = 1;
                        } else if (i21 == 1836019574 || i21 == 1953653099 || i21 == 1835297121 || i21 == 1835626086 || i21 == 1937007212 || i21 == 1836019558 || i21 == 1953653094 || i21 == 1836475768 || i21 == 1701082227) {
                            i10 = 1;
                            long j19 = (((C6330l) interfaceC6334p).f20548p0 + this.f49941q) - 8;
                            arrayDeque.push(new C16105a(i21, j19));
                            if (this.f49941q == this.f49942r) {
                                m17668e(j19);
                            } else {
                                this.f49939o = 0;
                                this.f49942r = 0;
                            }
                        } else if (i21 == 1751411826 || i21 == 1835296868 || i21 == 1836476516 || i21 == 1936286840 || i21 == 1937011556 || i21 == 1937011827 || i21 == 1668576371 || i21 == 1937011555 || i21 == 1937011578 || i21 == 1937013298 || i21 == 1937007471 || i21 == 1668232756 || i21 == 1937011571 || i21 == 1952867444 || i21 == 1952868452 || i21 == 1953196132 || i21 == 1953654136 || i21 == 1953658222 || i21 == 1886614376 || i21 == 1935763834 || i21 == 1935763823 || i21 == 1936027235 || i21 == 1970628964 || i21 == 1935828848 || i21 == 1936158820 || i21 == 1701606260 || i21 == 1835362404 || i21 == 1701671783) {
                            if (this.f49942r != 8) {
                                throw C19755E.m20713b("Leaf atom defines extended atom size (unsupported).");
                            }
                            if (this.f49941q > 2147483647L) {
                                throw C19755E.m20713b("Leaf atom with length > 2147483647 (unsupported).");
                            }
                            C20811m c20811m4 = new C20811m((int) this.f49941q);
                            System.arraycopy(c20811m3.f66092a, 0, c20811m4.f66092a, 0, 8);
                            this.f49943s = c20811m4;
                            i10 = 1;
                            this.f49939o = 1;
                        } else {
                            if (this.f49941q > 2147483647L) {
                                throw C19755E.m20713b("Skipping atom with length > 2147483647 (unsupported).");
                            }
                            this.f49943s = null;
                            this.f49939o = 1;
                            i10 = 1;
                        }
                        interfaceC6334p2 = interfaceC6334p;
                    }
                }
            }
            int i22 = ((int) this.f49941q) - this.f49942r;
            C20811m c20811m5 = this.f49943s;
            if (c20811m5 != null) {
                ((C6330l) interfaceC6334p2).mo3046b(c20811m5.f66092a, 8, i22, false);
                int i23 = this.f49940p;
                C16106b c16106b = new C16106b(i23, c20811m5);
                long j20 = ((C6330l) interfaceC6334p2).f20548p0;
                if (!arrayDeque.isEmpty()) {
                    ((C16105a) arrayDeque.peek()).f49884p0.add(c16106b);
                } else if (i23 == 1936286840) {
                    c20811m5.m21344F(8);
                    int iM1822m = AbstractC0797a.m1822m(c20811m5.m21352g());
                    c20811m5.m21345G(4);
                    long jM21367v2 = c20811m5.m21367v();
                    if (iM1822m == 0) {
                        jM21370y = c20811m5.m21367v();
                        jM21370y2 = c20811m5.m21367v();
                    } else {
                        jM21370y = c20811m5.m21370y();
                        jM21370y2 = c20811m5.m21370y();
                    }
                    long j21 = jM21370y2 + j20;
                    int i24 = AbstractC20817s.f66106a;
                    long jM21396J3 = AbstractC20817s.m21396J(jM21370y, 1000000L, jM21367v2, RoundingMode.FLOOR);
                    c20811m5.m21345G(2);
                    int iM21371z = c20811m5.m21371z();
                    int[] iArr = new int[iM21371z];
                    long[] jArr = new long[iM21371z];
                    long[] jArr2 = new long[iM21371z];
                    long[] jArr3 = new long[iM21371z];
                    long jM21396J4 = jM21396J3;
                    long j22 = j21;
                    long j23 = jM21370y;
                    int i25 = 0;
                    while (i25 < iM21371z) {
                        int iM21352g = c20811m5.m21352g();
                        if ((iM21352g & Integer.MIN_VALUE) != 0) {
                            throw C19755E.m20712a(null, "Unhandled indirect reference");
                        }
                        long jM21367v3 = c20811m5.m21367v();
                        iArr[i25] = iM21352g & Integer.MAX_VALUE;
                        jArr[i25] = j22;
                        jArr3[i25] = jM21396J4;
                        j23 += jM21367v3;
                        jM21396J4 = AbstractC20817s.m21396J(j23, 1000000L, jM21367v2, RoundingMode.FLOOR);
                        jArr2[i25] = jM21396J4 - jArr3[i25];
                        c20811m5.m21345G(4);
                        j22 += (long) iArr[i25];
                        i25++;
                        jM21367v2 = jM21367v2;
                    }
                    Pair pairCreate = Pair.create(Long.valueOf(jM21396J3), new C6328j(iArr, jArr, jArr2, jArr3));
                    this.f49948x = ((Long) pairCreate.first).longValue();
                    this.f49921D.mo3045F((InterfaceC6310B) pairCreate.second);
                    this.f49924G = true;
                } else if (i23 == 1701671783 && this.f49922E.length != 0) {
                    c20811m5.m21344F(8);
                    int iM1822m2 = AbstractC0797a.m1822m(c20811m5.m21352g());
                    if (iM1822m2 == 0) {
                        strM21360o = c20811m5.m21360o();
                        strM21360o.getClass();
                        String strM21360o2 = c20811m5.m21360o();
                        strM21360o2.getClass();
                        long jM21367v4 = c20811m5.m21367v();
                        long jM21367v5 = c20811m5.m21367v();
                        RoundingMode roundingMode = RoundingMode.FLOOR;
                        long jM21396J5 = AbstractC20817s.m21396J(jM21367v5, 1000000L, jM21367v4, roundingMode);
                        long j24 = this.f49948x;
                        long j25 = j24 != -9223372036854775807L ? j24 + jM21396J5 : -9223372036854775807L;
                        jM21396J = AbstractC20817s.m21396J(c20811m5.m21367v(), 1000L, jM21367v4, roundingMode);
                        j10 = jM21396J5;
                        jM21396J2 = j25;
                        str = strM21360o2;
                        jM21367v = c20811m5.m21367v();
                    } else if (iM1822m2 != 1) {
                        AbstractC20734X.m21224A(iM1822m2, "Skipping unsupported emsg version: ", "FragmentedMp4Extractor");
                    } else {
                        long jM21367v6 = c20811m5.m21367v();
                        long jM21370y3 = c20811m5.m21370y();
                        RoundingMode roundingMode2 = RoundingMode.FLOOR;
                        jM21396J2 = AbstractC20817s.m21396J(jM21370y3, 1000000L, jM21367v6, roundingMode2);
                        jM21396J = AbstractC20817s.m21396J(c20811m5.m21367v(), 1000L, jM21367v6, roundingMode2);
                        long jM21367v7 = c20811m5.m21367v();
                        strM21360o = c20811m5.m21360o();
                        strM21360o.getClass();
                        String strM21360o3 = c20811m5.m21360o();
                        strM21360o3.getClass();
                        str = strM21360o3;
                        jM21367v = jM21367v7;
                        j10 = -9223372036854775807L;
                    }
                    byte[] bArr = new byte[c20811m5.m21346a()];
                    c20811m5.m21350e(bArr, 0, c20811m5.m21346a());
                    C11248s c11248s = this.f49934j;
                    ByteArrayOutputStream byteArrayOutputStream = (ByteArrayOutputStream) c11248s.f34081Z;
                    byteArrayOutputStream.reset();
                    DataOutputStream dataOutputStream = (DataOutputStream) c11248s.f34082o0;
                    try {
                        dataOutputStream.writeBytes(strM21360o);
                        dataOutputStream.writeByte(0);
                        dataOutputStream.writeBytes(str);
                        dataOutputStream.writeByte(0);
                        dataOutputStream.writeLong(jM21396J);
                        dataOutputStream.writeLong(jM21367v);
                        dataOutputStream.write(bArr);
                        dataOutputStream.flush();
                        C20811m c20811m6 = new C20811m(byteArrayOutputStream.toByteArray());
                        int iM21346a = c20811m6.m21346a();
                        for (InterfaceC6316H interfaceC6316H : this.f49922E) {
                            c20811m6.m21344F(0);
                            interfaceC6316H.mo4970c(iM21346a, c20811m6);
                        }
                        if (jM21396J2 == -9223372036854775807L) {
                            arrayDeque2.addLast(new C16111g(iM21346a, j10, true));
                            this.f49945u += iM21346a;
                        } else if (arrayDeque2.isEmpty()) {
                            for (InterfaceC6316H interfaceC6316H2 : this.f49922E) {
                                interfaceC6316H2.mo4968a(jM21396J2, 1, iM21346a, 0, null);
                            }
                        } else {
                            arrayDeque2.addLast(new C16111g(iM21346a, jM21396J2, false));
                            this.f49945u += iM21346a;
                        }
                    } catch (IOException e10) {
                        throw new RuntimeException(e10);
                    }
                }
            } else {
                ((C6330l) interfaceC6334p).mo3052j(i22);
            }
            m17668e(((C6330l) interfaceC6334p).f20548p0);
        }
        int i26 = this.f49939o;
        C16122r c16122r5 = c16112h.f49905b;
        if (i26 == 3) {
            int i27 = !c16112h.f49915l ? c16112h.f49907d.f50030d[c16112h.f49909f] : c16122r5.f50017h[c16112h.f49909f];
            this.f49950z = i27;
            if (c16112h.f49909f < c16112h.f49912i) {
                ((C6330l) interfaceC6334p2).mo3052j(i27);
                C16121q c16121qM17662a = c16112h.m17662a();
                if (c16121qM17662a != null) {
                    C20811m c20811m7 = c16122r5.f50023n;
                    int i28 = c16121qM17662a.f50008d;
                    if (i28 != 0) {
                        c20811m7.m21345G(i28);
                    }
                    int i29 = c16112h.f49909f;
                    if (c16122r5.f50020k && c16122r5.f50021l[i29]) {
                        c20811m7.m21345G(c20811m7.m21371z() * 6);
                    }
                }
                if (!c16112h.m17663b()) {
                    this.f49949y = null;
                }
                this.f49939o = 3;
                return 0;
            }
            if (c16112h.f49907d.f50027a.f50000g == i10) {
                this.f49950z = i27 - 8;
                ((C6330l) interfaceC6334p2).mo3052j(8);
            }
            if ("audio/ac4".equals(c16112h.f49907d.f50027a.f49999f.f62752m)) {
                this.f49918A = c16112h.m17664c(this.f49950z, 7);
                int i30 = this.f49950z;
                C20811m c20811m8 = this.f49933i;
                AbstractC6320b.m6891g(i30, c20811m8);
                c16112h.f49904a.mo4970c(7, c20811m8);
                this.f49918A += 7;
            } else {
                this.f49918A = c16112h.m17664c(this.f49950z, 0);
            }
            this.f49950z += this.f49918A;
            this.f49939o = 4;
            this.f49919B = 0;
        }
        C16123s c16123s = c16112h.f49907d;
        long j26 = c16112h.f49915l ? c16122r5.f50018i[c16112h.f49909f] : c16123s.f50032f[c16112h.f49909f];
        C16120p c16120p = c16123s.f50027a;
        int i31 = c16120p.f50003j;
        InterfaceC6316H interfaceC6316H3 = c16112h.f49904a;
        if (i31 == 0) {
            while (true) {
                int i32 = this.f49918A;
                int i33 = this.f49950z;
                if (i32 >= i33) {
                    break;
                }
                this.f49918A += interfaceC6316H3.mo4973f(interfaceC6334p2, i33 - i32, false);
            }
        } else {
            C20811m c20811m9 = this.f49930f;
            byte[] bArr2 = c20811m9.f66092a;
            bArr2[0] = 0;
            bArr2[i10] = 0;
            bArr2[2] = 0;
            int i34 = i31 + 1;
            int i35 = 4 - i31;
            while (this.f49918A < this.f49950z) {
                int i36 = this.f49919B;
                C19788o c19788o = c16120p.f49999f;
                if (i36 == 0) {
                    C16120p c16120p2 = c16120p;
                    ((C6330l) interfaceC6334p2).mo3046b(bArr2, i35, i34, false);
                    c20811m9.m21344F(0);
                    int iM21352g2 = c20811m9.m21352g();
                    if (iM21352g2 < 1) {
                        throw C19755E.m20712a(null, "Invalid NAL length");
                    }
                    this.f49919B = iM21352g2 - 1;
                    C20811m c20811m10 = this.f49929e;
                    c20811m10.m21344F(0);
                    interfaceC6316H3.mo4970c(4, c20811m10);
                    interfaceC6316H3.mo4970c(1, c20811m9);
                    if (this.f49923F.length > 0) {
                        String str2 = c19788o.f62752m;
                        byte b = bArr2[4];
                        if ("video/avc".equals(str2)) {
                            c20811m = c20811m9;
                            if ((b & 31) != 6) {
                            }
                            z6 = true;
                            this.f49920C = z6;
                            this.f49918A += 5;
                            this.f49950z += i35;
                            c16120p = c16120p2;
                            c20811m9 = c20811m;
                        } else {
                            c20811m = c20811m9;
                        }
                        if ("video/hevc".equals(str2) && ((b & 126) >> 1) == 39) {
                            z6 = true;
                        }
                        this.f49920C = z6;
                        this.f49918A += 5;
                        this.f49950z += i35;
                        c16120p = c16120p2;
                        c20811m9 = c20811m;
                    } else {
                        c20811m = c20811m9;
                    }
                    z6 = false;
                    this.f49920C = z6;
                    this.f49918A += 5;
                    this.f49950z += i35;
                    c16120p = c16120p2;
                    c20811m9 = c20811m;
                } else {
                    C16120p c16120p3 = c16120p;
                    C20811m c20811m11 = c20811m9;
                    if (this.f49920C) {
                        C20811m c20811m12 = this.f49931g;
                        c20811m12.m21341C(i36);
                        ((C6330l) interfaceC6334p2).mo3046b(c20811m12.f66092a, 0, this.f49919B, false);
                        interfaceC6316H3.mo4970c(this.f49919B, c20811m12);
                        iMo4973f = this.f49919B;
                        int iM21589f = AbstractC21121g.m21589f(c20811m12.f66094c, c20811m12.f66092a);
                        c20811m12.m21344F("video/hevc".equals(c19788o.f62752m) ? 1 : 0);
                        c20811m12.m21343E(iM21589f);
                        AbstractC6320b.m6888d(j26, c20811m12, this.f49923F);
                    } else {
                        iMo4973f = interfaceC6316H3.mo4973f(interfaceC6334p2, i36, false);
                    }
                    this.f49918A += iMo4973f;
                    this.f49919B -= iMo4973f;
                    c16120p = c16120p3;
                    c20811m9 = c20811m11;
                    i35 = i35;
                    bArr2 = bArr2;
                }
            }
        }
        int i37 = c16112h.f49915l ? c16122r5.f50019j[c16112h.f49909f] ? 1 : 0 : c16112h.f49907d.f50033g[c16112h.f49909f];
        if (c16112h.m17662a() != null) {
            i37 |= 1073741824;
        }
        int i38 = i37;
        C16121q c16121qM17662a2 = c16112h.m17662a();
        interfaceC6316H3.mo4968a(j26, i38, this.f49950z, 0, c16121qM17662a2 != null ? c16121qM17662a2.f50007c : null);
        while (!arrayDeque2.isEmpty()) {
            C16111g c16111g = (C16111g) arrayDeque2.removeFirst();
            this.f49945u -= c16111g.f49903c;
            boolean z11 = c16111g.f49902b;
            long j27 = c16111g.f49901a;
            if (z11) {
                j27 += j26;
            }
            for (InterfaceC6316H interfaceC6316H4 : this.f49922E) {
                interfaceC6316H4.mo4968a(j27, 1, c16111g.f49903c, this.f49945u, null);
            }
        }
        if (!c16112h.m17663b()) {
            this.f49949y = null;
        }
        this.f49939o = 3;
        return 0;
    }

    @Override // p372P3.InterfaceC6333o
    /* JADX INFO: renamed from: i */
    public final void mo6860i(InterfaceC6335q interfaceC6335q) {
        int i10;
        int i11 = this.f49926b;
        if ((i11 & 32) == 0) {
            interfaceC6335q = new C13711h(interfaceC6335q, this.f49925a);
        }
        this.f49921D = interfaceC6335q;
        int i12 = 0;
        this.f49939o = 0;
        this.f49942r = 0;
        InterfaceC6316H[] interfaceC6316HArr = new InterfaceC6316H[2];
        this.f49922E = interfaceC6316HArr;
        int i13 = 100;
        if ((i11 & 4) != 0) {
            interfaceC6316HArr[0] = interfaceC6335q.mo3044D(100, 5);
            i10 = 1;
            i13 = 101;
        } else {
            i10 = 0;
        }
        InterfaceC6316H[] interfaceC6316HArr2 = (InterfaceC6316H[]) AbstractC20817s.m21392F(i10, this.f49922E);
        this.f49922E = interfaceC6316HArr2;
        for (InterfaceC6316H interfaceC6316H : interfaceC6316HArr2) {
            interfaceC6316H.mo4971d(f49917I);
        }
        List list = this.f49927c;
        this.f49923F = new InterfaceC6316H[list.size()];
        while (i12 < this.f49923F.length) {
            InterfaceC6316H interfaceC6316HMo3044D = this.f49921D.mo3044D(i13, 3);
            interfaceC6316HMo3044D.mo4971d((C19788o) list.get(i12));
            this.f49923F[i12] = interfaceC6316HMo3044D;
            i12++;
            i13++;
        }
    }

    @Override // p372P3.InterfaceC6333o
    public final void release() {
    }
}
