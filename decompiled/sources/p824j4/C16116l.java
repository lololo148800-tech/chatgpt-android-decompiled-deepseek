package p824j4;

import bb.AbstractC11278C;
import bb.C11276A;
import bb.C11294T;
import fo.C13711h;
import java.nio.charset.Charset;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import p031B3.AbstractC0797a;
import p1016t3.C19753C;
import p1016t3.C19755E;
import p1016t3.C19787n;
import p1016t3.C19788o;
import p1016t3.InterfaceC19752B;
import p1071w0.AbstractC20734X;
import p1073w3.AbstractC20800b;
import p1073w3.AbstractC20817s;
import p1073w3.C20811m;
import p1097x3.AbstractC21121g;
import p1097x3.C21115a;
import p1097x3.C21116b;
import p372P3.AbstractC6320b;
import p372P3.C6309A;
import p372P3.C6311C;
import p372P3.C6317I;
import p372P3.C6337s;
import p372P3.C6338t;
import p372P3.C6341w;
import p372P3.InterfaceC6310B;
import p372P3.InterfaceC6314F;
import p372P3.InterfaceC6316H;
import p372P3.InterfaceC6333o;
import p372P3.InterfaceC6334p;
import p372P3.InterfaceC6335q;
import p561X.C8990d;
import p644ab.AbstractC10531d;
import p696d4.AbstractC13011i;
import p696d4.AbstractC13012j;
import p696d4.C13013k;
import p696d4.C13016n;
import p718e4.C13281b;
import p718e4.C13282c;
import p718e4.C13283d;
import p718e4.C13284e;
import p885m4.InterfaceC17161k;

/* JADX INFO: renamed from: j4.l */
/* JADX INFO: loaded from: classes.dex */
public final class C16116l implements InterfaceC6333o, InterfaceC6310B {

    /* JADX INFO: renamed from: A */
    public C13281b f49959A;

    /* JADX INFO: renamed from: a */
    public final InterfaceC17161k f49960a;

    /* JADX INFO: renamed from: b */
    public final int f49961b;

    /* JADX INFO: renamed from: c */
    public final C20811m f49962c;

    /* JADX INFO: renamed from: d */
    public final C20811m f49963d;

    /* JADX INFO: renamed from: e */
    public final C20811m f49964e;

    /* JADX INFO: renamed from: f */
    public final C20811m f49965f;

    /* JADX INFO: renamed from: g */
    public final ArrayDeque f49966g;

    /* JADX INFO: renamed from: h */
    public final C16118n f49967h;

    /* JADX INFO: renamed from: i */
    public final ArrayList f49968i;

    /* JADX INFO: renamed from: j */
    public C11294T f49969j;

    /* JADX INFO: renamed from: k */
    public int f49970k;

    /* JADX INFO: renamed from: l */
    public int f49971l;

    /* JADX INFO: renamed from: m */
    public long f49972m;

    /* JADX INFO: renamed from: n */
    public int f49973n;

    /* JADX INFO: renamed from: o */
    public C20811m f49974o;

    /* JADX INFO: renamed from: p */
    public int f49975p;

    /* JADX INFO: renamed from: q */
    public int f49976q;

    /* JADX INFO: renamed from: r */
    public int f49977r;

    /* JADX INFO: renamed from: s */
    public int f49978s;

    /* JADX INFO: renamed from: t */
    public boolean f49979t;

    /* JADX INFO: renamed from: u */
    public InterfaceC6335q f49980u;

    /* JADX INFO: renamed from: v */
    public C16115k[] f49981v;

    /* JADX INFO: renamed from: w */
    public long[][] f49982w;

    /* JADX INFO: renamed from: x */
    public int f49983x;

    /* JADX INFO: renamed from: y */
    public long f49984y;

    /* JADX INFO: renamed from: z */
    public int f49985z;

    public C16116l(InterfaceC17161k interfaceC17161k, int i10) {
        this.f49960a = interfaceC17161k;
        this.f49961b = i10;
        C11276A c11276a = AbstractC11278C.f34162Z;
        this.f49969j = C11294T.f34185q0;
        this.f49970k = (i10 & 4) != 0 ? 3 : 0;
        this.f49967h = new C16118n();
        this.f49968i = new ArrayList();
        this.f49965f = new C20811m(16);
        this.f49966g = new ArrayDeque();
        this.f49962c = new C20811m(AbstractC21121g.f67114a);
        this.f49963d = new C20811m(4);
        this.f49964e = new C20811m();
        this.f49975p = -1;
        this.f49980u = InterfaceC6335q.f20560e0;
        this.f49981v = new C16115k[0];
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
        InterfaceC6314F interfaceC6314FM17677h = AbstractC16119o.m17677h(interfaceC6334p, false, (this.f49961b & 2) != 0);
        if (interfaceC6314FM17677h != null) {
            c11294tM12695y = AbstractC11278C.m12695y(interfaceC6314FM17677h);
        } else {
            C11276A c11276a = AbstractC11278C.f34162Z;
            c11294tM12695y = C11294T.f34185q0;
        }
        this.f49969j = c11294tM12695y;
        return interfaceC6314FM17677h == null;
    }

    @Override // p372P3.InterfaceC6310B
    /* JADX INFO: renamed from: d */
    public final boolean mo6853d() {
        return true;
    }

    @Override // p372P3.InterfaceC6333o
    /* JADX INFO: renamed from: f */
    public final void mo6857f(long j10, long j11) {
        this.f49966g.clear();
        this.f49973n = 0;
        this.f49975p = -1;
        this.f49976q = 0;
        this.f49977r = 0;
        this.f49978s = 0;
        if (j10 == 0) {
            if (this.f49970k != 3) {
                this.f49970k = 0;
                this.f49973n = 0;
                return;
            } else {
                C16118n c16118n = this.f49967h;
                c16118n.f49990a.clear();
                c16118n.f49991b = 0;
                this.f49968i.clear();
                return;
            }
        }
        for (C16115k c16115k : this.f49981v) {
            C16123s c16123s = c16115k.f49955b;
            int iM21404e = AbstractC20817s.m21404e(c16123s.f50032f, j11, false);
            while (true) {
                if (iM21404e < 0) {
                    iM21404e = -1;
                    break;
                } else if ((c16123s.f50033g[iM21404e] & 1) != 0) {
                    break;
                } else {
                    iM21404e--;
                }
            }
            if (iM21404e == -1) {
                iM21404e = c16123s.m17678a(j11);
            }
            c16115k.f49958e = iM21404e;
            C6317I c6317i = c16115k.f49957d;
            if (c6317i != null) {
                c6317i.f20458b = false;
                c6317i.f20459c = 0;
            }
        }
    }

    @Override // p372P3.InterfaceC6333o
    /* JADX INFO: renamed from: g */
    public final List mo6858g() {
        return this.f49969j;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:22:0x0081  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
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
        ArrayDeque arrayDeque;
        C20811m c20811m;
        C16105a c16105a;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        char c9;
        boolean z6;
        int i15 = 3;
        int i16 = 0;
        int i17 = 2;
        int i18 = 4;
        while (true) {
            boolean z10 = true;
            while (true) {
                int i19 = this.f49970k;
                arrayDeque = this.f49966g;
                c20811m = this.f49964e;
                if (i19 != 0) {
                    if (i19 != z10) {
                        if (i19 == i17) {
                            long position = interfaceC6334p.getPosition();
                            if (this.f49975p == -1) {
                                int i20 = -1;
                                int i21 = -1;
                                boolean z11 = true;
                                boolean z12 = true;
                                int i22 = 0;
                                long j10 = Long.MAX_VALUE;
                                long j11 = Long.MAX_VALUE;
                                long j12 = Long.MAX_VALUE;
                                while (true) {
                                    C16115k[] c16115kArr = this.f49981v;
                                    if (i22 >= c16115kArr.length) {
                                        break;
                                    }
                                    C16115k c16115k = c16115kArr[i22];
                                    int i23 = c16115k.f49958e;
                                    C16123s c16123s = c16115k.f49955b;
                                    if (i23 != c16123s.f50028b) {
                                        long j13 = c16123s.f50029c[i23];
                                        long[][] jArr = this.f49982w;
                                        int i24 = AbstractC20817s.f66106a;
                                        long j14 = jArr[i22][i23];
                                        long j15 = j13 - position;
                                        boolean z13 = j15 < 0 || j15 >= 262144;
                                        if ((!z13 && z12) || (z13 == z12 && j15 < j12)) {
                                            z12 = z13;
                                            j11 = j14;
                                            i21 = i22;
                                            j12 = j15;
                                        }
                                        if (j14 < j10) {
                                            z11 = z13;
                                            j10 = j14;
                                            i20 = i22;
                                        }
                                    }
                                    i22++;
                                }
                                if (j10 == Long.MAX_VALUE || !z11 || j11 < j10 + 10485760) {
                                    i20 = i21;
                                }
                                this.f49975p = i20;
                                if (i20 == -1) {
                                    return -1;
                                }
                            }
                            C16115k c16115k2 = this.f49981v[this.f49975p];
                            InterfaceC6316H interfaceC6316H = c16115k2.f49956c;
                            int i25 = c16115k2.f49958e;
                            C16123s c16123s2 = c16115k2.f49955b;
                            long j16 = c16123s2.f50029c[i25];
                            int i26 = c16123s2.f50030d[i25];
                            long j17 = (j16 - position) + ((long) this.f49976q);
                            if (j17 < 0 || j17 >= 262144) {
                                c6337s.f20561a = j16;
                                return 1;
                            }
                            C16120p c16120p = c16115k2.f49954a;
                            if (c16120p.f50000g == 1) {
                                j17 += 8;
                                i26 -= 8;
                            }
                            interfaceC6334p.mo3052j((int) j17);
                            int i27 = c16120p.f50003j;
                            C6317I c6317i = c16115k2.f49957d;
                            if (i27 == 0) {
                                if ("audio/ac4".equals(c16120p.f49999f.f62752m)) {
                                    if (this.f49977r == 0) {
                                        AbstractC6320b.m6891g(i26, c20811m);
                                        i12 = 7;
                                        interfaceC6316H.mo4970c(7, c20811m);
                                        this.f49977r += 7;
                                    } else {
                                        i12 = 7;
                                    }
                                    i26 += i12;
                                } else if (c6317i != null) {
                                    c6317i.m6863c(interfaceC6334p);
                                }
                                while (true) {
                                    int i28 = this.f49977r;
                                    if (i28 >= i26) {
                                        break;
                                    }
                                    int iMo4973f = interfaceC6316H.mo4973f(interfaceC6334p, i26 - i28, false);
                                    this.f49976q += iMo4973f;
                                    this.f49977r += iMo4973f;
                                    this.f49978s -= iMo4973f;
                                }
                            } else {
                                C20811m c20811m2 = this.f49963d;
                                byte[] bArr = c20811m2.f66092a;
                                boolean z14 = false;
                                bArr[0] = 0;
                                bArr[1] = 0;
                                bArr[2] = 0;
                                int i29 = 4 - i27;
                                while (this.f49977r < i26) {
                                    int i30 = this.f49978s;
                                    if (i30 == 0) {
                                        interfaceC6334p.readFully(bArr, i29, i27);
                                        this.f49976q += i27;
                                        c20811m2.m21344F(z14 ? 1 : 0);
                                        int iM21352g = c20811m2.m21352g();
                                        if (iM21352g < 0) {
                                            throw C19755E.m20712a(null, "Invalid NAL length");
                                        }
                                        this.f49978s = iM21352g;
                                        C20811m c20811m3 = this.f49962c;
                                        c20811m3.m21344F(z14 ? 1 : 0);
                                        interfaceC6316H.mo4970c(4, c20811m3);
                                        this.f49977r += 4;
                                        i26 += i29;
                                    } else {
                                        int iMo4973f2 = interfaceC6316H.mo4973f(interfaceC6334p, i30, z14);
                                        this.f49976q += iMo4973f2;
                                        this.f49977r += iMo4973f2;
                                        this.f49978s -= iMo4973f2;
                                        z14 = false;
                                    }
                                }
                            }
                            int i31 = i26;
                            long j18 = c16123s2.f50032f[i25];
                            int i32 = c16123s2.f50033g[i25];
                            if (c6317i != null) {
                                c6317i.m6862b(interfaceC6316H, j18, i32, i31, 0, null);
                                if (i25 + 1 == c16123s2.f50028b) {
                                    c6317i.m6861a(interfaceC6316H, null);
                                }
                            } else {
                                interfaceC6316H.mo4968a(j18, i32, i31, 0, null);
                            }
                            c16115k2.f49958e++;
                            this.f49975p = -1;
                            this.f49976q = 0;
                            this.f49977r = 0;
                            this.f49978s = 0;
                            return 0;
                        }
                        if (i19 != i15) {
                            throw new IllegalStateException();
                        }
                        ArrayList arrayList = this.f49968i;
                        C16118n c16118n = this.f49967h;
                        int i33 = c16118n.f49991b;
                        if (i33 != 0) {
                            if (i33 != z10) {
                                ArrayList arrayList2 = c16118n.f49990a;
                                short s10 = 2192;
                                if (i33 == i17) {
                                    long length = interfaceC6334p.getLength();
                                    int i34 = c16118n.f49992c - 20;
                                    C20811m c20811m4 = new C20811m(i34);
                                    interfaceC6334p.readFully(c20811m4.f66092a, 0, i34);
                                    int i35 = 0;
                                    while (i35 < i34 / 12) {
                                        c20811m4.m21345G(2);
                                        byte[] bArr2 = c20811m4.f66092a;
                                        int i36 = c20811m4.f66093b;
                                        int i37 = i36 + 1;
                                        c20811m4.f66093b = i37;
                                        int i38 = bArr2[i36] & 255;
                                        c20811m4.f66093b = i36 + 2;
                                        short s11 = (short) (((bArr2[i37] & 255) << 8) | i38);
                                        if (s11 != s10 && s11 != 2816) {
                                            if (s11 != 2817) {
                                                if (s11 != 2819 && s11 != 2820) {
                                                    c20811m4.m21345G(8);
                                                }
                                                i35++;
                                                length = length;
                                                s10 = 2192;
                                            }
                                            arrayList2.add(new C16117m((length - ((long) c16118n.f49992c)) - ((long) c20811m4.m21354i()), c20811m4.m21354i()));
                                            i35++;
                                            length = length;
                                            s10 = 2192;
                                        }
                                        arrayList2.add(new C16117m((length - ((long) c16118n.f49992c)) - ((long) c20811m4.m21354i()), c20811m4.m21354i()));
                                        i35++;
                                        length = length;
                                        s10 = 2192;
                                    }
                                    if (arrayList2.isEmpty()) {
                                        c6337s.f20561a = 0L;
                                    } else {
                                        c16118n.f49991b = 3;
                                        c6337s.f20561a = ((C16117m) arrayList2.get(0)).f49986a;
                                    }
                                } else {
                                    if (i33 != i15) {
                                        throw new IllegalStateException();
                                    }
                                    long position2 = interfaceC6334p.getPosition();
                                    int length2 = (int) ((interfaceC6334p.getLength() - interfaceC6334p.getPosition()) - ((long) c16118n.f49992c));
                                    C20811m c20811m5 = new C20811m(length2);
                                    interfaceC6334p.readFully(c20811m5.f66092a, i16, length2);
                                    int i39 = i16;
                                    while (i39 < arrayList2.size()) {
                                        C16117m c16117m = (C16117m) arrayList2.get(i39);
                                        c20811m5.m21344F((int) (c16117m.f49986a - position2));
                                        c20811m5.m21345G(i18);
                                        int iM21354i = c20811m5.m21354i();
                                        Charset charset = AbstractC10531d.f31242c;
                                        String strM21363r = c20811m5.m21363r(iM21354i, charset);
                                        switch (strM21363r.hashCode()) {
                                            case -1711564334:
                                                if (strM21363r.equals("SlowMotion_Data")) {
                                                    i14 = 0;
                                                } else {
                                                    i14 = -1;
                                                }
                                                break;
                                            case -1332107749:
                                                if (strM21363r.equals("Super_SlowMotion_Edit_Data")) {
                                                    i14 = 1;
                                                } else {
                                                    i14 = -1;
                                                }
                                                break;
                                            case -1251387154:
                                                if (strM21363r.equals("Super_SlowMotion_Data")) {
                                                    i14 = 2;
                                                } else {
                                                    i14 = -1;
                                                }
                                                break;
                                            case -830665521:
                                                if (strM21363r.equals("Super_SlowMotion_Deflickering_On")) {
                                                    i14 = i15;
                                                } else {
                                                    i14 = -1;
                                                }
                                                break;
                                            case 1760745220:
                                                if (strM21363r.equals("Super_SlowMotion_BGM")) {
                                                    i14 = 4;
                                                } else {
                                                    i14 = -1;
                                                }
                                                break;
                                            default:
                                                i14 = -1;
                                                break;
                                        }
                                        switch (i14) {
                                            case 0:
                                                c9 = 2192;
                                                break;
                                            case 1:
                                                c9 = 2819;
                                                break;
                                            case 2:
                                                c9 = 2816;
                                                break;
                                            case 3:
                                                c9 = 2820;
                                                break;
                                            case 4:
                                                c9 = 2817;
                                                break;
                                            default:
                                                throw C19755E.m20712a(null, "Invalid SEF name");
                                        }
                                        int i40 = c16117m.f49987b - (iM21354i + 8);
                                        if (c9 == 2192) {
                                            ArrayList arrayList3 = new ArrayList();
                                            List listM1042E = C16118n.f49989e.m1042E(c20811m5.m21363r(i40, charset));
                                            for (int i41 = 0; i41 < listM1042E.size(); i41++) {
                                                List listM1042E2 = C16118n.f49988d.m1042E((CharSequence) listM1042E.get(i41));
                                                if (listM1042E2.size() != i15) {
                                                    throw C19755E.m20712a(null, null);
                                                }
                                                try {
                                                    arrayList3.add(new C13282c(Long.parseLong((String) listM1042E2.get(0)), 1 << (Integer.parseInt((String) listM1042E2.get(2)) - 1), Long.parseLong((String) listM1042E2.get(1))));
                                                } catch (NumberFormatException e10) {
                                                    throw C19755E.m20712a(e10, null);
                                                }
                                            }
                                            arrayList.add(new C13283d(arrayList3));
                                        } else if (c9 != 2816 && c9 != 2817 && c9 != 2819 && c9 != 2820) {
                                            throw new IllegalStateException();
                                        }
                                        i39++;
                                        i18 = 4;
                                    }
                                    c6337s.f20561a = 0L;
                                }
                            } else {
                                C20811m c20811m6 = new C20811m(8);
                                interfaceC6334p.readFully(c20811m6.f66092a, i16, 8);
                                c16118n.f49992c = c20811m6.m21354i() + 8;
                                if (c20811m6.m21352g() != 1397048916) {
                                    c6337s.f20561a = 0L;
                                } else {
                                    c6337s.f20561a = interfaceC6334p.getPosition() - ((long) (c16118n.f49992c - 12));
                                    c16118n.f49991b = 2;
                                }
                            }
                            i13 = 1;
                        } else {
                            long length3 = interfaceC6334p.getLength();
                            c6337s.f20561a = (length3 == -1 || length3 < 8) ? 0L : length3 - 8;
                            i13 = 1;
                            c16118n.f49991b = 1;
                        }
                        if (c6337s.f20561a == 0) {
                            this.f49970k = 0;
                            this.f49973n = 0;
                        }
                        return i13;
                    }
                    long j19 = this.f49972m - ((long) this.f49973n);
                    long position3 = interfaceC6334p.getPosition() + j19;
                    C20811m c20811m7 = this.f49974o;
                    if (c20811m7 != null) {
                        interfaceC6334p.readFully(c20811m7.f66092a, this.f49973n, (int) j19);
                        if (this.f49971l == 1718909296) {
                            this.f49979t = true;
                            c20811m7.m21344F(8);
                            int iM21352g2 = c20811m7.m21352g();
                            int i42 = iM21352g2 != 1751476579 ? iM21352g2 != 1903435808 ? 0 : 1 : 2;
                            if (i42 == 0) {
                                c20811m7.m21345G(4);
                                do {
                                    if (c20811m7.m21346a() <= 0) {
                                        i42 = 0;
                                        break;
                                    }
                                    int iM21352g3 = c20811m7.m21352g();
                                    i42 = iM21352g3 != 1751476579 ? iM21352g3 != 1903435808 ? 0 : 1 : 2;
                                } while (i42 == 0);
                            }
                            this.f49985z = i42;
                        } else if (!arrayDeque.isEmpty()) {
                            ((C16105a) arrayDeque.peek()).f49884p0.add(new C16106b(this.f49971l, c20811m7));
                        }
                    } else {
                        if (!this.f49979t && this.f49971l == 1835295092) {
                            this.f49985z = 1;
                        }
                        if (j19 < 262144) {
                            interfaceC6334p.mo3052j((int) j19);
                        } else {
                            c6337s.f20561a = interfaceC6334p.getPosition() + j19;
                            z6 = true;
                        }
                        m17669m(position3);
                        if (!z6 && this.f49970k != 2) {
                            return 1;
                        }
                        z10 = true;
                        i16 = 0;
                        i17 = 2;
                        i18 = 4;
                    }
                    z6 = false;
                    m17669m(position3);
                    if (!z6) {
                    }
                    z10 = true;
                    i16 = 0;
                    i17 = 2;
                    i18 = 4;
                }
            }
            boolean z15 = z10;
            int i43 = this.f49973n;
            C20811m c20811m8 = this.f49965f;
            if (i43 == 0) {
                if (!interfaceC6334p.mo3046b(c20811m8.f66092a, 0, 8, z15)) {
                    if (this.f49985z != 2 || (this.f49961b & 2) == 0) {
                        return -1;
                    }
                    InterfaceC6316H interfaceC6316HMo3044D = this.f49980u.mo3044D(0, 4);
                    C13281b c13281b = this.f49959A;
                    C19753C c19753c = c13281b == null ? null : new C19753C(c13281b);
                    C19787n c19787n = new C19787n();
                    c19787n.f62712j = c19753c;
                    interfaceC6316HMo3044D.mo4971d(new C19788o(c19787n));
                    this.f49980u.mo3061s();
                    this.f49980u.mo3045F(new C6338t(-9223372036854775807L));
                    return -1;
                }
                this.f49973n = 8;
                c20811m8.m21344F(0);
                this.f49972m = c20811m8.m21367v();
                this.f49971l = c20811m8.m21352g();
            }
            long j20 = this.f49972m;
            if (j20 == 1) {
                interfaceC6334p.readFully(c20811m8.f66092a, 8, 8);
                this.f49973n += 8;
                this.f49972m = c20811m8.m21370y();
            } else if (j20 == 0) {
                long length4 = interfaceC6334p.getLength();
                if (length4 == -1 && (c16105a = (C16105a) arrayDeque.peek()) != null) {
                    length4 = c16105a.f49883o0;
                }
                if (length4 != -1) {
                    this.f49972m = (length4 - interfaceC6334p.getPosition()) + ((long) this.f49973n);
                }
            }
            long j21 = this.f49972m;
            int i44 = this.f49973n;
            if (j21 < i44) {
                throw C19755E.m20713b("Atom size less than header length (unsupported).");
            }
            int i45 = this.f49971l;
            if (i45 == 1836019574 || i45 == 1953653099 || i45 == 1835297121 || i45 == 1835626086 || i45 == 1937007212 || i45 == 1701082227 || i45 == 1835365473) {
                long position4 = interfaceC6334p.getPosition();
                long j22 = this.f49972m;
                long j23 = this.f49973n;
                long j24 = (position4 + j22) - j23;
                if (j22 == j23 || this.f49971l != 1835365473) {
                    i10 = 4;
                } else {
                    c20811m.m21341C(8);
                    interfaceC6334p.mo3053k(c20811m.f66092a, 0, 8);
                    byte[] bArr3 = AbstractC16109e.f49896a;
                    int i46 = c20811m.f66093b;
                    i10 = 4;
                    c20811m.m21345G(4);
                    if (c20811m.m21352g() != 1751411826) {
                        i46 += 4;
                    }
                    c20811m.m21344F(i46);
                    interfaceC6334p.mo3052j(c20811m.f66093b);
                    interfaceC6334p.mo3051i();
                }
                arrayDeque.push(new C16105a(this.f49971l, j24));
                if (this.f49972m == this.f49973n) {
                    m17669m(j24);
                    i11 = 0;
                } else {
                    i11 = 0;
                    this.f49970k = 0;
                    this.f49973n = 0;
                }
            } else {
                if (i45 == 1835296868 || i45 == 1836476516 || i45 == 1751411826 || i45 == 1937011556 || i45 == 1937011827 || i45 == 1937011571 || i45 == 1668576371 || i45 == 1701606260 || i45 == 1937011555 || i45 == 1937011578 || i45 == 1937013298 || i45 == 1937007471 || i45 == 1668232756 || i45 == 1953196132 || i45 == 1718909296 || i45 == 1969517665 || i45 == 1801812339 || i45 == 1768715124) {
                    AbstractC20800b.m21320h(i44 == 8);
                    AbstractC20800b.m21320h(this.f49972m <= 2147483647L);
                    C20811m c20811m9 = new C20811m((int) this.f49972m);
                    System.arraycopy(c20811m8.f66092a, 0, c20811m9.f66092a, 0, 8);
                    this.f49974o = c20811m9;
                    this.f49970k = 1;
                } else {
                    long position5 = interfaceC6334p.getPosition();
                    long j25 = this.f49973n;
                    long j26 = position5 - j25;
                    if (this.f49971l == 1836086884) {
                        this.f49959A = new C13281b(0L, j26, -9223372036854775807L, j26 + j25, this.f49972m - j25);
                    }
                    this.f49974o = null;
                    this.f49970k = 1;
                }
                i11 = 0;
                i10 = 4;
            }
            i16 = i11;
            i18 = i10;
            i15 = 3;
            i17 = 2;
        }
    }

    @Override // p372P3.InterfaceC6333o
    /* JADX INFO: renamed from: i */
    public final void mo6860i(InterfaceC6335q interfaceC6335q) {
        if ((this.f49961b & 16) == 0) {
            interfaceC6335q = new C13711h(interfaceC6335q, this.f49960a);
        }
        this.f49980u = interfaceC6335q;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0071  */
    /* JADX WARN: Code duplicated, block: B:33:0x0075  */
    /* JADX WARN: Code duplicated, block: B:36:0x0083  */
    /* JADX WARN: Code duplicated, block: B:39:0x008c A[LOOP:2: B:34:0x007f->B:39:0x008c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:42:0x0092  */
    /* JADX WARN: Code duplicated, block: B:46:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:49:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:51:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:54:0x00ba A[LOOP:3: B:50:0x00b0->B:54:0x00ba, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:57:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:60:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:61:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:62:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:68:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:72:0x00df A[EDGE_INSN: B:72:0x00df->B:64:0x00df BREAK  A[LOOP:1: B:29:0x006c->B:63:0x00d7], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:76:0x00d7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:77:0x008f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:78:0x0089 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x00bd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:80:0x00b8 A[SYNTHETIC] */
    @Override // p372P3.InterfaceC6310B
    /* JADX INFO: renamed from: j */
    public final C6309A mo6854j(long j10) {
        long j11;
        long j12;
        long j13;
        long jMin;
        int i10;
        long jMin2;
        C16115k[] c16115kArr;
        C6311C c6311c;
        C6309A c6309a;
        boolean z6;
        int i11;
        C16123s c16123s;
        long[] jArr;
        int iM21404e;
        int[] iArr;
        int iM17678a;
        long[] jArr2;
        int iM21404e2;
        int iM17678a2;
        C16115k[] c16115kArr2 = this.f49981v;
        int length = c16115kArr2.length;
        C6311C c6311c2 = C6311C.f20443c;
        if (length == 0) {
            return new C6309A(c6311c2, c6311c2);
        }
        int i12 = this.f49983x;
        boolean z10 = false;
        int i13 = -1;
        if (i12 != -1) {
            C16123s c16123s2 = c16115kArr2[i12].f49955b;
            long[] jArr3 = c16123s2.f50032f;
            int iM21404e3 = AbstractC20817s.m21404e(jArr3, j10, false);
            while (true) {
                if (iM21404e3 < 0) {
                    iM21404e3 = -1;
                    break;
                }
                if ((c16123s2.f50033g[iM21404e3] & 1) != 0) {
                    break;
                }
                iM21404e3--;
            }
            if (iM21404e3 == -1) {
                iM21404e3 = c16123s2.m17678a(j10);
            }
            if (iM21404e3 == -1) {
                return new C6309A(c6311c2, c6311c2);
            }
            j12 = jArr3[iM21404e3];
            long[] jArr4 = c16123s2.f50029c;
            j11 = jArr4[iM21404e3];
            if (j12 < j10 && iM21404e3 < c16123s2.f50028b - 1 && (iM17678a2 = c16123s2.m17678a(j10)) != -1 && iM17678a2 != iM21404e3) {
                j13 = jArr3[iM17678a2];
                jMin = jArr4[iM17678a2];
            }
            i10 = 0;
            jMin2 = j11;
            while (true) {
                c16115kArr = this.f49981v;
                if (i10 < c16115kArr.length) {
                    break;
                }
                if (i10 != this.f49983x) {
                    c16123s = c16115kArr[i10].f49955b;
                    jArr = c16123s.f50032f;
                    iM21404e = AbstractC20817s.m21404e(jArr, j12, z10);
                    while (true) {
                        iArr = c16123s.f50033g;
                        if (iM21404e >= 0) {
                            iM17678a = i13;
                            break;
                        }
                        if ((iArr[iM21404e] & 1) != 0) {
                            iM17678a = iM21404e;
                            break;
                        }
                        iM21404e--;
                    }
                    if (iM17678a == i13) {
                        iM17678a = c16123s.m17678a(j12);
                    }
                    jArr2 = c16123s.f50029c;
                    if (iM17678a != i13) {
                        jMin2 = Math.min(jArr2[iM17678a], jMin2);
                    }
                    if (j13 != -9223372036854775807L) {
                        z6 = false;
                        iM21404e2 = AbstractC20817s.m21404e(jArr, j13, false);
                        while (true) {
                            if (iM21404e2 >= 0) {
                                i11 = -1;
                                iM21404e2 = -1;
                                break;
                            }
                            if ((iArr[iM21404e2] & 1) != 0) {
                                i11 = -1;
                                break;
                            }
                            iM21404e2--;
                        }
                        if (iM21404e2 == i11) {
                            iM21404e2 = c16123s.m17678a(j13);
                        }
                        if (iM21404e2 == i11) {
                            jMin = Math.min(jArr2[iM21404e2], jMin);
                        }
                    } else {
                        i11 = -1;
                        z6 = false;
                    }
                } else {
                    int i14 = i13;
                    z6 = z10;
                    i11 = i14;
                }
                i10++;
                boolean z11 = z6;
                i13 = i11;
                z10 = z11;
            }
            c6311c = new C6311C(j12, jMin2);
            if (j13 == -9223372036854775807L) {
                c6309a = new C6309A(c6311c, c6311c);
            } else {
                c6309a = new C6309A(c6311c, new C6311C(j13, jMin));
            }
            return c6309a;
        }
        j11 = Long.MAX_VALUE;
        j12 = j10;
        j13 = -9223372036854775807L;
        jMin = -1;
        i10 = 0;
        jMin2 = j11;
        while (true) {
            c16115kArr = this.f49981v;
            if (i10 < c16115kArr.length) {
                break;
                break;
            }
            if (i10 != this.f49983x) {
                c16123s = c16115kArr[i10].f49955b;
                jArr = c16123s.f50032f;
                iM21404e = AbstractC20817s.m21404e(jArr, j12, z10);
                while (true) {
                    iArr = c16123s.f50033g;
                    if (iM21404e >= 0) {
                        iM17678a = i13;
                        break;
                    }
                    if ((iArr[iM21404e] & 1) != 0) {
                        iM17678a = iM21404e;
                        break;
                    }
                    iM21404e--;
                }
                if (iM17678a == i13) {
                    iM17678a = c16123s.m17678a(j12);
                }
                jArr2 = c16123s.f50029c;
                if (iM17678a != i13) {
                    jMin2 = Math.min(jArr2[iM17678a], jMin2);
                }
                if (j13 != -9223372036854775807L) {
                    z6 = false;
                    iM21404e2 = AbstractC20817s.m21404e(jArr, j13, false);
                    while (true) {
                        if (iM21404e2 >= 0) {
                            i11 = -1;
                            iM21404e2 = -1;
                            break;
                        }
                        if ((iArr[iM21404e2] & 1) != 0) {
                            i11 = -1;
                            break;
                        }
                        iM21404e2--;
                    }
                    if (iM21404e2 == i11) {
                        iM21404e2 = c16123s.m17678a(j13);
                    }
                    if (iM21404e2 == i11) {
                        jMin = Math.min(jArr2[iM21404e2], jMin);
                    }
                } else {
                    i11 = -1;
                    z6 = false;
                }
            } else {
                int i15 = i13;
                z6 = z10;
                i11 = i15;
            }
            i10++;
            boolean z12 = z6;
            i13 = i11;
            z10 = z12;
        }
        c6311c = new C6311C(j12, jMin2);
        if (j13 == -9223372036854775807L) {
            c6309a = new C6309A(c6311c, c6311c);
        } else {
            c6309a = new C6309A(c6311c, new C6311C(j13, jMin));
        }
        return c6309a;
    }

    @Override // p372P3.InterfaceC6310B
    /* JADX INFO: renamed from: l */
    public final long mo4938l() {
        return this.f49984y;
    }

    /* JADX WARN: Code duplicated, block: B:201:0x036b  */
    /* JADX WARN: Code duplicated, block: B:262:0x050b  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: m */
    public final void m17669m(long j10) {
        int i10;
        int i11;
        ArrayDeque arrayDeque;
        C19753C c19753c;
        C19753C c19753c2;
        long j11;
        ArrayList arrayList;
        C19753C c19753c3;
        int i12;
        C19753C c19753c4;
        C19753C c19753c5;
        int i13;
        int i14;
        int i15;
        int i16;
        C21115a c21115a;
        ArrayDeque arrayDeque2;
        C19753C c19753c6;
        C19753C c19753cM20702b;
        C19753C c19753c7;
        int iM21366u;
        int i17;
        C19753C c19753c8;
        ArrayDeque arrayDeque3;
        AbstractC13011i abstractC13011iM17676g;
        ArrayDeque arrayDeque4;
        AbstractC13011i abstractC13011iM17675f;
        int i18 = 4;
        int i19 = 8;
        int i20 = 0;
        int i21 = 1;
        while (true) {
            ArrayDeque arrayDeque5 = this.f49966g;
            if (arrayDeque5.isEmpty() || ((C16105a) arrayDeque5.peek()).f49883o0 != j10) {
                break;
            }
            C16105a c16105a = (C16105a) arrayDeque5.pop();
            if (c16105a.f2213Z == 1836019574) {
                ArrayList arrayList2 = new ArrayList();
                boolean z6 = this.f49985z == i21 ? i21 : i20;
                C6341w c6341w = new C6341w();
                C16106b c16106bM17654o = c16105a.m17654o(1969517665);
                int i22 = 1751411826;
                int i23 = 1768715124;
                int i24 = 1835365473;
                if (c16106bM17654o != null) {
                    byte[] bArr = AbstractC16109e.f49896a;
                    C20811m c20811m = c16106bM17654o.f49886o0;
                    c20811m.m21344F(i19);
                    c19753c = new C19753C(new InterfaceC19752B[i20]);
                    while (c20811m.m21346a() >= i19) {
                        int i25 = c20811m.f66093b;
                        int iM21352g = c20811m.m21352g();
                        int iM21352g2 = c20811m.m21352g();
                        if (iM21352g2 == i24) {
                            c20811m.m21344F(i25);
                            int i26 = i25 + iM21352g;
                            c20811m.m21345G(i19);
                            int i27 = c20811m.f66093b;
                            c20811m.m21345G(i18);
                            if (c20811m.m21352g() != i22) {
                                i27 += i18;
                            }
                            c20811m.m21344F(i27);
                            while (true) {
                                int i28 = c20811m.f66093b;
                                if (i28 < i26) {
                                    int iM21352g3 = c20811m.m21352g();
                                    if (c20811m.m21352g() == i23) {
                                        c20811m.m21344F(i28);
                                        int i29 = i28 + iM21352g3;
                                        c20811m.m21345G(i19);
                                        ArrayList arrayList3 = new ArrayList();
                                        while (true) {
                                            int i30 = c20811m.f66093b;
                                            if (i30 >= i29) {
                                                break;
                                            }
                                            int iM21352g4 = c20811m.m21352g() + i30;
                                            int iM21352g5 = c20811m.m21352g();
                                            int i31 = (iM21352g5 >> 24) & 255;
                                            int i32 = i29;
                                            if (i31 == 169 || i31 == 253) {
                                                arrayDeque3 = arrayDeque5;
                                                int i33 = 16777215 & iM21352g5;
                                                if (i33 == 6516084) {
                                                    abstractC13011iM17676g = AbstractC16119o.m17671b(iM21352g5, c20811m);
                                                } else if (i33 == 7233901 || i33 == 7631467) {
                                                    abstractC13011iM17676g = AbstractC16119o.m17676g(iM21352g5, "TIT2", c20811m);
                                                } else if (i33 == 6516589 || i33 == 7828084) {
                                                    abstractC13011iM17676g = AbstractC16119o.m17676g(iM21352g5, "TCOM", c20811m);
                                                } else if (i33 == 6578553) {
                                                    abstractC13011iM17676g = AbstractC16119o.m17676g(iM21352g5, "TDRC", c20811m);
                                                } else if (i33 == 4280916) {
                                                    abstractC13011iM17676g = AbstractC16119o.m17676g(iM21352g5, "TPE1", c20811m);
                                                } else if (i33 == 7630703) {
                                                    abstractC13011iM17676g = AbstractC16119o.m17676g(iM21352g5, "TSSE", c20811m);
                                                } else if (i33 == 6384738) {
                                                    abstractC13011iM17676g = AbstractC16119o.m17676g(iM21352g5, "TALB", c20811m);
                                                } else if (i33 == 7108978) {
                                                    abstractC13011iM17676g = AbstractC16119o.m17676g(iM21352g5, "USLT", c20811m);
                                                } else if (i33 == 6776174) {
                                                    abstractC13011iM17676g = AbstractC16119o.m17676g(iM21352g5, "TCON", c20811m);
                                                } else if (i33 == 6779504) {
                                                    abstractC13011iM17676g = AbstractC16119o.m17676g(iM21352g5, "TIT1", c20811m);
                                                } else {
                                                    AbstractC20800b.m21323k("MetadataUtil", "Skipped unknown metadata entry: " + AbstractC0797a.m1821c(iM21352g5));
                                                    c20811m.m21344F(iM21352g4);
                                                    abstractC13011iM17676g = null;
                                                }
                                                c20811m.m21344F(iM21352g4);
                                            } else {
                                                if (iM21352g5 == 1735291493) {
                                                    try {
                                                        String strM14759a = AbstractC13012j.m14759a(AbstractC16119o.m17674e(c20811m) - 1);
                                                        if (strM14759a != null) {
                                                            abstractC13011iM17676g = new C13016n("TCON", null, AbstractC11278C.m12695y(strM14759a));
                                                        } else {
                                                            AbstractC20800b.m21332t("MetadataUtil", "Failed to parse standard genre code");
                                                            abstractC13011iM17676g = null;
                                                        }
                                                    } catch (Throwable th2) {
                                                        c20811m.m21344F(iM21352g4);
                                                        throw th2;
                                                    }
                                                } else if (iM21352g5 == 1684632427) {
                                                    abstractC13011iM17676g = AbstractC16119o.m17673d(iM21352g5, "TPOS", c20811m);
                                                } else if (iM21352g5 == 1953655662) {
                                                    abstractC13011iM17676g = AbstractC16119o.m17673d(iM21352g5, "TRCK", c20811m);
                                                } else {
                                                    if (iM21352g5 == 1953329263) {
                                                        abstractC13011iM17675f = AbstractC16119o.m17675f(iM21352g5, "TBPM", c20811m, true, false);
                                                    } else if (iM21352g5 == 1668311404) {
                                                        abstractC13011iM17676g = AbstractC16119o.m17675f(iM21352g5, "TCMP", c20811m, true, true);
                                                    } else if (iM21352g5 == 1668249202) {
                                                        abstractC13011iM17676g = AbstractC16119o.m17672c(c20811m);
                                                    } else if (iM21352g5 == 1631670868) {
                                                        abstractC13011iM17676g = AbstractC16119o.m17676g(iM21352g5, "TPE2", c20811m);
                                                    } else if (iM21352g5 == 1936682605) {
                                                        abstractC13011iM17676g = AbstractC16119o.m17676g(iM21352g5, "TSOT", c20811m);
                                                    } else if (iM21352g5 == 1936679276) {
                                                        abstractC13011iM17676g = AbstractC16119o.m17676g(iM21352g5, "TSOA", c20811m);
                                                    } else if (iM21352g5 == 1936679282) {
                                                        abstractC13011iM17676g = AbstractC16119o.m17676g(iM21352g5, "TSOP", c20811m);
                                                    } else if (iM21352g5 == 1936679265) {
                                                        abstractC13011iM17676g = AbstractC16119o.m17676g(iM21352g5, "TSO2", c20811m);
                                                    } else if (iM21352g5 == 1936679791) {
                                                        abstractC13011iM17676g = AbstractC16119o.m17676g(iM21352g5, "TSOC", c20811m);
                                                    } else if (iM21352g5 == 1920233063) {
                                                        abstractC13011iM17676g = AbstractC16119o.m17675f(iM21352g5, "ITUNESADVISORY", c20811m, false, false);
                                                    } else if (iM21352g5 == 1885823344) {
                                                        abstractC13011iM17675f = AbstractC16119o.m17675f(iM21352g5, "ITUNESGAPLESS", c20811m, false, true);
                                                    } else if (iM21352g5 == 1936683886) {
                                                        abstractC13011iM17676g = AbstractC16119o.m17676g(iM21352g5, "TVSHOWSORT", c20811m);
                                                    } else if (iM21352g5 == 1953919848) {
                                                        abstractC13011iM17676g = AbstractC16119o.m17676g(iM21352g5, "TVSHOW", c20811m);
                                                    } else if (iM21352g5 == 757935405) {
                                                        String strM21361p = null;
                                                        String strM21361p2 = null;
                                                        int i34 = -1;
                                                        int i35 = -1;
                                                        while (true) {
                                                            int i36 = c20811m.f66093b;
                                                            if (i36 >= iM21352g4) {
                                                                break;
                                                            }
                                                            int iM21352g6 = c20811m.m21352g();
                                                            int iM21352g7 = c20811m.m21352g();
                                                            c20811m.m21345G(4);
                                                            if (iM21352g7 == 1835360622) {
                                                                strM21361p = c20811m.m21361p(iM21352g6 - 12);
                                                                arrayDeque4 = arrayDeque5;
                                                            } else {
                                                                arrayDeque4 = arrayDeque5;
                                                                if (iM21352g7 == 1851878757) {
                                                                    strM21361p2 = c20811m.m21361p(iM21352g6 - 12);
                                                                } else {
                                                                    if (iM21352g7 == 1684108385) {
                                                                        i35 = iM21352g6;
                                                                        i34 = i36;
                                                                    }
                                                                    c20811m.m21345G(iM21352g6 - 12);
                                                                }
                                                            }
                                                            arrayDeque5 = arrayDeque4;
                                                        }
                                                        arrayDeque3 = arrayDeque5;
                                                        if (strM21361p == null || strM21361p2 == null || i34 == -1) {
                                                            abstractC13011iM17676g = null;
                                                        } else {
                                                            c20811m.m21344F(i34);
                                                            c20811m.m21345G(16);
                                                            abstractC13011iM17676g = new C13013k(strM21361p, strM21361p2, c20811m.m21361p(i35 - 16));
                                                        }
                                                        c20811m.m21344F(iM21352g4);
                                                    } else {
                                                        arrayDeque3 = arrayDeque5;
                                                        AbstractC20800b.m21323k("MetadataUtil", "Skipped unknown metadata entry: " + AbstractC0797a.m1821c(iM21352g5));
                                                        c20811m.m21344F(iM21352g4);
                                                        abstractC13011iM17676g = null;
                                                    }
                                                    c20811m.m21344F(iM21352g4);
                                                    abstractC13011iM17676g = abstractC13011iM17675f;
                                                    arrayDeque3 = arrayDeque5;
                                                }
                                                c20811m.m21344F(iM21352g4);
                                                arrayDeque3 = arrayDeque5;
                                            }
                                            if (abstractC13011iM17676g != null) {
                                                arrayList3.add(abstractC13011iM17676g);
                                            }
                                            i29 = i32;
                                            arrayDeque5 = arrayDeque3;
                                        }
                                        arrayDeque2 = arrayDeque5;
                                        if (!arrayList3.isEmpty()) {
                                            c19753c8 = new C19753C(arrayList3);
                                            break;
                                        }
                                        break;
                                    }
                                    c20811m.m21344F(i28 + iM21352g3);
                                    i19 = 8;
                                    i23 = 1768715124;
                                } else {
                                    arrayDeque2 = arrayDeque5;
                                }
                                c19753c8 = null;
                                break;
                            }
                            c19753cM20702b = c19753c.m20702b(c19753c8);
                        } else {
                            arrayDeque2 = arrayDeque5;
                            if (iM21352g2 == 1936553057) {
                                c20811m.m21344F(i25);
                                int i37 = i25 + iM21352g;
                                c20811m.m21345G(12);
                                while (true) {
                                    int i38 = c20811m.f66093b;
                                    if (i38 < i37) {
                                        int iM21352g8 = c20811m.m21352g();
                                        if (c20811m.m21352g() == 1935766900) {
                                            if (iM21352g8 >= 16) {
                                                c20811m.m21345G(4);
                                                int i39 = -1;
                                                int i40 = 0;
                                                int i41 = 0;
                                                while (i40 < 2) {
                                                    int iM21365t = c20811m.m21365t();
                                                    int iM21365t2 = c20811m.m21365t();
                                                    if (iM21365t == 0) {
                                                        i39 = iM21365t2;
                                                        i17 = 1;
                                                    } else {
                                                        i17 = 1;
                                                        if (iM21365t == 1) {
                                                            i41 = iM21365t2;
                                                        }
                                                    }
                                                    i40 += i17;
                                                }
                                                if (i39 == 12) {
                                                    iM21366u = 240;
                                                } else if (i39 == 13) {
                                                    iM21366u = 120;
                                                } else if (i39 == 21 && c20811m.m21346a() >= 8 && c20811m.f66093b + 8 <= i37) {
                                                    int iM21352g9 = c20811m.m21352g();
                                                    int iM21352g10 = c20811m.m21352g();
                                                    if (iM21352g9 < 12 || iM21352g10 != 1936877170) {
                                                        iM21366u = -2147483647;
                                                    } else {
                                                        iM21366u = c20811m.m21366u();
                                                    }
                                                } else {
                                                    iM21366u = -2147483647;
                                                }
                                                if (iM21366u != -2147483647) {
                                                    c19753c7 = new C19753C(new C13284e(i41, iM21366u));
                                                    break;
                                                }
                                                break;
                                            }
                                            break;
                                        }
                                        c20811m.m21344F(i38 + iM21352g8);
                                    }
                                    c19753c7 = null;
                                    break;
                                }
                                c19753cM20702b = c19753c.m20702b(c19753c7);
                            } else {
                                if (iM21352g2 == -1451722374) {
                                    short sM21362q = c20811m.m21362q();
                                    c20811m.m21345G(2);
                                    String strM21363r = c20811m.m21363r(sM21362q, AbstractC10531d.f31242c);
                                    int iMax = Math.max(strM21363r.lastIndexOf(43), strM21363r.lastIndexOf(45));
                                    try {
                                        c19753c6 = new C19753C(new C21116b(Float.parseFloat(strM21363r.substring(0, iMax)), Float.parseFloat(strM21363r.substring(iMax, strM21363r.length() - 1))));
                                    } catch (IndexOutOfBoundsException | NumberFormatException unused) {
                                        c19753c6 = null;
                                    }
                                    c19753cM20702b = c19753c.m20702b(c19753c6);
                                }
                                c20811m.m21344F(i25 + iM21352g);
                                arrayDeque5 = arrayDeque2;
                                i24 = 1835365473;
                                i18 = 4;
                                i19 = 8;
                                i23 = 1768715124;
                                i22 = 1751411826;
                            }
                        }
                        c19753c = c19753cM20702b;
                        c20811m.m21344F(i25 + iM21352g);
                        arrayDeque5 = arrayDeque2;
                        i24 = 1835365473;
                        i18 = 4;
                        i19 = 8;
                        i23 = 1768715124;
                        i22 = 1751411826;
                    }
                    arrayDeque = arrayDeque5;
                    c6341w.m6957b(c19753c);
                    i24 = 1835365473;
                } else {
                    arrayDeque = arrayDeque5;
                    c19753c = null;
                }
                C16105a c16105aM17653n = c16105a.m17653n(i24);
                if (c16105aM17653n != null) {
                    byte[] bArr2 = AbstractC16109e.f49896a;
                    C16106b c16106bM17654o2 = c16105aM17653n.m17654o(1751411826);
                    C16106b c16106bM17654o3 = c16105aM17653n.m17654o(1801812339);
                    C16106b c16106bM17654o4 = c16105aM17653n.m17654o(1768715124);
                    if (c16106bM17654o2 == null || c16106bM17654o3 == null || c16106bM17654o4 == null) {
                        c19753c2 = null;
                    } else {
                        C20811m c20811m2 = c16106bM17654o2.f49886o0;
                        c20811m2.m21344F(16);
                        if (c20811m2.m21352g() != 1835299937) {
                            c19753c2 = null;
                        } else {
                            C20811m c20811m3 = c16106bM17654o3.f49886o0;
                            c20811m3.m21344F(12);
                            int iM21352g11 = c20811m3.m21352g();
                            String[] strArr = new String[iM21352g11];
                            for (int i42 = 0; i42 < iM21352g11; i42++) {
                                int iM21352g12 = c20811m3.m21352g();
                                c20811m3.m21345G(4);
                                strArr[i42] = c20811m3.m21363r(iM21352g12 - 8, AbstractC10531d.f31242c);
                            }
                            C20811m c20811m4 = c16106bM17654o4.f49886o0;
                            c20811m4.m21344F(8);
                            ArrayList arrayList4 = new ArrayList();
                            for (int i43 = 8; c20811m4.m21346a() > i43; i43 = 8) {
                                int i44 = c20811m4.f66093b;
                                int iM21352g13 = c20811m4.m21352g();
                                int iM21352g14 = c20811m4.m21352g() - 1;
                                if (iM21352g14 < 0 || iM21352g14 >= iM21352g11) {
                                    iM21352g11 = iM21352g11;
                                    AbstractC20734X.m21224A(iM21352g14, "Skipped metadata with unknown key index: ", "AtomParsers");
                                } else {
                                    String str = strArr[iM21352g14];
                                    int i45 = i44 + iM21352g13;
                                    while (true) {
                                        int i46 = c20811m4.f66093b;
                                        if (i46 >= i45) {
                                            c21115a = null;
                                            break;
                                        }
                                        int iM21352g15 = c20811m4.m21352g();
                                        if (c20811m4.m21352g() == 1684108385) {
                                            int iM21352g16 = c20811m4.m21352g();
                                            int iM21352g17 = c20811m4.m21352g();
                                            int i47 = iM21352g15 - 16;
                                            byte[] bArr3 = new byte[i47];
                                            c20811m4.m21350e(bArr3, 0, i47);
                                            c21115a = new C21115a(str, bArr3, iM21352g17, iM21352g16);
                                            break;
                                        }
                                        c20811m4.m21344F(i46 + iM21352g15);
                                    }
                                    if (c21115a != null) {
                                        arrayList4.add(c21115a);
                                    }
                                }
                                c20811m4.m21344F(i44 + iM21352g13);
                                iM21352g11 = iM21352g11;
                            }
                            if (arrayList4.isEmpty()) {
                                c19753c2 = null;
                            } else {
                                c19753c2 = new C19753C(arrayList4);
                            }
                        }
                    }
                } else {
                    c19753c2 = null;
                }
                C16106b c16106bM17654o5 = c16105a.m17654o(1836476516);
                c16106bM17654o5.getClass();
                C19753C c19753c9 = new C19753C(AbstractC16109e.m17658c(c16106bM17654o5.f49886o0));
                int i48 = this.f49961b;
                ArrayList arrayListM17661f = AbstractC16109e.m17661f(c16105a, c6341w, -9223372036854775807L, null, (i48 & 1) != 0, z6, new C8990d(24));
                int size = -1;
                int i49 = 0;
                int i50 = 0;
                long j12 = -9223372036854775807L;
                while (true) {
                    j11 = 0;
                    if (i49 >= arrayListM17661f.size()) {
                        break;
                    }
                    C16123s c16123s = (C16123s) arrayListM17661f.get(i49);
                    if (c16123s.f50028b == 0) {
                        c19753c4 = c19753c2;
                        arrayList = arrayList2;
                    } else {
                        C16120p c16120p = c16123s.f50027a;
                        arrayList = arrayList2;
                        long j13 = c16120p.f49998e;
                        if (j13 == -9223372036854775807L) {
                            j13 = c16123s.f50034h;
                        }
                        long jMax = Math.max(j12, j13);
                        InterfaceC6335q interfaceC6335q = this.f49980u;
                        int i51 = i50 + 1;
                        int i52 = c16120p.f49995b;
                        C16115k c16115k = new C16115k(c16120p, c16123s, interfaceC6335q.mo3044D(i50, i52));
                        C19788o c19788o = c16120p.f49999f;
                        boolean zEquals = "audio/true-hd".equals(c19788o.f62752m);
                        int i53 = c16123s.f50031e;
                        int i54 = zEquals ? i53 * 16 : i53 + 30;
                        C19787n c19787nM20747a = c19788o.m20747a();
                        c19787nM20747a.f62715m = i54;
                        if (i52 == 2) {
                            if ((i48 & 8) != 0) {
                                c19787nM20747a.f62708f = c19788o.f62745f | (size == -1 ? 1 : 2);
                            }
                            if (j13 > 0 && (i16 = c16123s.f50028b) > 0) {
                                c19787nM20747a.f62722t = i16 / (j13 / 1000000.0f);
                            }
                        }
                        if (i52 == 1 && (i14 = c6341w.f20579a) != -1 && (i15 = c6341w.f20580b) != -1) {
                            c19787nM20747a.f62696C = i14;
                            c19787nM20747a.f62697D = i15;
                        }
                        ArrayList arrayList5 = this.f49968i;
                        if (arrayList5.isEmpty()) {
                            i12 = 3;
                            c19753c3 = null;
                        } else {
                            c19753c3 = new C19753C(arrayList5);
                            i12 = 3;
                        }
                        C19753C[] c19753cArr = new C19753C[i12];
                        c19753cArr[0] = c19753c3;
                        c19753cArr[1] = c19753c;
                        c19753cArr[2] = c19753c9;
                        C19753C c19753c10 = new C19753C(new InterfaceC19752B[0]);
                        if (c19753c2 != null) {
                            int i55 = 0;
                            while (true) {
                                InterfaceC19752B[] interfaceC19752BArr = c19753c2.f62555Y;
                                if (i55 >= interfaceC19752BArr.length) {
                                    break;
                                }
                                InterfaceC19752B interfaceC19752B = interfaceC19752BArr[i55];
                                if (interfaceC19752B instanceof C21115a) {
                                    C21115a c21115a2 = (C21115a) interfaceC19752B;
                                    c19753c5 = c19753c2;
                                    if (!c21115a2.f67069Y.equals("com.android.capture.fps")) {
                                        i13 = 1;
                                        c19753c10 = c19753c10.m20701a(c21115a2);
                                    } else if (i52 == 2) {
                                        i13 = 1;
                                        c19753c10 = c19753c10.m20701a(c21115a2);
                                    }
                                    i55 += i13;
                                    c19753c2 = c19753c5;
                                } else {
                                    c19753c5 = c19753c2;
                                }
                                i13 = 1;
                                i55 += i13;
                                c19753c2 = c19753c5;
                            }
                        }
                        c19753c4 = c19753c2;
                        for (int i56 = 0; i56 < 3; i56++) {
                            c19753c10 = c19753c10.m20702b(c19753cArr[i56]);
                        }
                        if (c19753c10.f62555Y.length > 0) {
                            c19787nM20747a.f62712j = c19753c10;
                        }
                        c16115k.f49956c.mo4971d(new C19788o(c19787nM20747a));
                        if (i52 == 2 && size == -1) {
                            size = arrayList.size();
                        }
                        arrayList.add(c16115k);
                        i50 = i51;
                        j12 = jMax;
                    }
                    i49++;
                    arrayList2 = arrayList;
                    arrayListM17661f = arrayListM17661f;
                    c19753c2 = c19753c4;
                }
                i10 = 8;
                this.f49983x = size;
                this.f49984y = j12;
                C16115k[] c16115kArr = (C16115k[]) arrayList2.toArray(new C16115k[0]);
                this.f49981v = c16115kArr;
                long[][] jArr = new long[c16115kArr.length][];
                int[] iArr = new int[c16115kArr.length];
                long[] jArr2 = new long[c16115kArr.length];
                boolean[] zArr = new boolean[c16115kArr.length];
                for (int i57 = 0; i57 < c16115kArr.length; i57++) {
                    jArr[i57] = new long[c16115kArr[i57].f49955b.f50028b];
                    jArr2[i57] = c16115kArr[i57].f49955b.f50032f[0];
                }
                int i58 = 0;
                while (i58 < c16115kArr.length) {
                    long j14 = Long.MAX_VALUE;
                    int i59 = -1;
                    for (int i60 = 0; i60 < c16115kArr.length; i60++) {
                        if (!zArr[i60]) {
                            long j15 = jArr2[i60];
                            if (j15 <= j14) {
                                i59 = i60;
                                j14 = j15;
                            }
                        }
                    }
                    int i61 = iArr[i59];
                    long[] jArr3 = jArr[i59];
                    jArr3[i61] = j11;
                    C16123s c16123s2 = c16115kArr[i59].f49955b;
                    j11 += (long) c16123s2.f50030d[i61];
                    int i62 = i61 + 1;
                    iArr[i59] = i62;
                    if (i62 < jArr3.length) {
                        jArr2[i59] = c16123s2.f50032f[i62];
                    } else {
                        zArr[i59] = true;
                        i58++;
                    }
                }
                i11 = 1;
                this.f49982w = jArr;
                this.f49980u.mo3061s();
                this.f49980u.mo3045F(this);
                arrayDeque.clear();
                this.f49970k = 2;
            } else {
                i10 = i19;
                i11 = i21;
                if (!arrayDeque5.isEmpty()) {
                    ((C16105a) arrayDeque5.peek()).f49885q0.add(c16105a);
                }
            }
            i21 = i11;
            i19 = i10;
            i18 = 4;
            i20 = 0;
        }
        if (this.f49970k != 2) {
            this.f49970k = 0;
            this.f49973n = 0;
        }
    }

    @Override // p372P3.InterfaceC6333o
    public final void release() {
    }
}
