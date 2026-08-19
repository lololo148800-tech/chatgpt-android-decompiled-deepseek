package p1055v4;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Arrays;
import p057C3.C1529G;
import p1016t3.AbstractC19754D;
import p1016t3.C19781h;
import p1016t3.C19787n;
import p1016t3.C19788o;
import p1073w3.AbstractC20800b;
import p1073w3.AbstractC20817s;
import p1073w3.C20811m;
import p1097x3.AbstractC21121g;
import p1097x3.C21119e;
import p1097x3.C21120f;
import p372P3.AbstractC6320b;
import p372P3.C6318J;
import p372P3.InterfaceC6316H;
import p372P3.InterfaceC6335q;
import p734ep.C13458b;
import sk.C19662a;

/* JADX INFO: renamed from: v4.n */
/* JADX INFO: loaded from: classes.dex */
public final class C20443n implements InterfaceC20435f {

    /* JADX INFO: renamed from: a */
    public final C19662a f64785a;

    /* JADX INFO: renamed from: b */
    public final boolean f64786b;

    /* JADX INFO: renamed from: c */
    public final boolean f64787c;

    /* JADX INFO: renamed from: g */
    public long f64791g;

    /* JADX INFO: renamed from: i */
    public String f64793i;

    /* JADX INFO: renamed from: j */
    public InterfaceC6316H f64794j;

    /* JADX INFO: renamed from: k */
    public C20442m f64795k;

    /* JADX INFO: renamed from: l */
    public boolean f64796l;

    /* JADX INFO: renamed from: n */
    public boolean f64798n;

    /* JADX INFO: renamed from: h */
    public final boolean[] f64792h = new boolean[3];

    /* JADX INFO: renamed from: d */
    public final C1529G f64788d = new C1529G(7);

    /* JADX INFO: renamed from: e */
    public final C1529G f64789e = new C1529G(8);

    /* JADX INFO: renamed from: f */
    public final C1529G f64790f = new C1529G(6);

    /* JADX INFO: renamed from: m */
    public long f64797m = -9223372036854775807L;

    /* JADX INFO: renamed from: o */
    public final C20811m f64799o = new C20811m();

    public C20443n(C19662a c19662a, boolean z6, boolean z10) {
        this.f64785a = c19662a;
        this.f64786b = z6;
        this.f64787c = z10;
    }

    /* JADX WARN: Code duplicated, block: B:106:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:107:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x0100  */
    /* JADX WARN: Code duplicated, block: B:57:0x0102  */
    /* JADX WARN: Code duplicated, block: B:59:0x0105  */
    /* JADX WARN: Code duplicated, block: B:62:0x010d  */
    /* JADX WARN: Code duplicated, block: B:63:0x0112  */
    /* JADX WARN: Code duplicated, block: B:66:0x0119  */
    /* JADX WARN: Code duplicated, block: B:69:0x0123  */
    /* JADX WARN: Code duplicated, block: B:78:0x013e  */
    /* JADX INFO: renamed from: a */
    public final void m21101a(byte[] bArr, int i10, int i11) {
        boolean zM6871h;
        boolean zM6871h2;
        boolean z6;
        boolean z10;
        int iM6876m;
        boolean z11;
        int i12;
        int iM6872i;
        int i13;
        int iM6877n;
        int iM6877n2;
        int i14;
        if (!this.f64796l || this.f64795k.f64768c) {
            this.f64788d.m2258a(bArr, i10, i11);
            this.f64789e.m2258a(bArr, i10, i11);
        }
        this.f64790f.m2258a(bArr, i10, i11);
        C20442m c20442m = this.f64795k;
        if (c20442m.f64776k) {
            int i15 = i11 - i10;
            byte[] bArr2 = c20442m.f64772g;
            int length = bArr2.length;
            int i16 = c20442m.f64773h + i15;
            if (length < i16) {
                c20442m.f64772g = Arrays.copyOf(bArr2, i16 * 2);
            }
            System.arraycopy(bArr, i10, c20442m.f64772g, c20442m.f64773h, i15);
            int i17 = c20442m.f64773h + i15;
            c20442m.f64773h = i17;
            byte[] bArr3 = c20442m.f64772g;
            C6318J c6318j = c20442m.f64771f;
            c6318j.f20467d = bArr3;
            c6318j.f20466c = 0;
            c6318j.f20465b = i17;
            c6318j.f20468e = 0;
            c6318j.m6864a();
            if (c6318j.m6867d(8)) {
                c6318j.m6882s();
                int iM6872i2 = c6318j.m6872i(2);
                c6318j.m6883t(5);
                if (c6318j.m6868e()) {
                    c6318j.m6876m();
                    if (c6318j.m6868e()) {
                        int iM6876m2 = c6318j.m6876m();
                        if (!c20442m.f64768c) {
                            c20442m.f64776k = false;
                            C20441l c20441l = c20442m.f64779n;
                            c20441l.f64754e = iM6876m2;
                            c20441l.f64751b = true;
                            return;
                        }
                        if (c6318j.m6868e()) {
                            int iM6876m3 = c6318j.m6876m();
                            SparseArray sparseArray = c20442m.f64770e;
                            if (sparseArray.indexOfKey(iM6876m3) < 0) {
                                c20442m.f64776k = false;
                                return;
                            }
                            C21119e c21119e = (C21119e) sparseArray.get(iM6876m3);
                            C21120f c21120f = (C21120f) c20442m.f64769d.get(c21119e.f67093a);
                            if (c21120f.f67104j) {
                                if (!c6318j.m6867d(2)) {
                                    return;
                                } else {
                                    c6318j.m6883t(2);
                                }
                            }
                            int i18 = c21120f.f67106l;
                            if (c6318j.m6867d(i18)) {
                                int iM6872i3 = c6318j.m6872i(i18);
                                if (!c21120f.f67105k) {
                                    if (c6318j.m6867d(1)) {
                                        zM6871h = c6318j.m6871h();
                                        if (!zM6871h) {
                                            zM6871h2 = false;
                                        } else {
                                            if (!c6318j.m6867d(1)) {
                                                return;
                                            }
                                            zM6871h2 = c6318j.m6871h();
                                            z6 = true;
                                        }
                                        if (c20442m.f64774i == 5) {
                                            z10 = true;
                                        } else {
                                            z10 = false;
                                        }
                                        if (z10) {
                                            iM6876m = 0;
                                        } else if (!c6318j.m6868e()) {
                                            return;
                                        } else {
                                            iM6876m = c6318j.m6876m();
                                        }
                                        z11 = c21119e.f67094b;
                                        i12 = c21120f.f67107m;
                                        if (i12 == 0) {
                                            i14 = c21120f.f67108n;
                                            if (!c6318j.m6867d(i14)) {
                                                return;
                                            }
                                            iM6872i = c6318j.m6872i(i14);
                                            if (z11 || zM6871h) {
                                                i13 = 0;
                                                iM6877n = 0;
                                                iM6877n2 = 0;
                                            } else {
                                                if (!c6318j.m6868e()) {
                                                    return;
                                                }
                                                iM6877n2 = c6318j.m6877n();
                                                i13 = 0;
                                                iM6877n = 0;
                                            }
                                        } else if (i12 == 1 || c21120f.f67109o) {
                                            iM6872i = 0;
                                            i13 = 0;
                                            iM6877n = 0;
                                            iM6877n2 = 0;
                                        } else {
                                            if (!c6318j.m6868e()) {
                                                return;
                                            }
                                            int iM6877n3 = c6318j.m6877n();
                                            if (!z11 || zM6871h) {
                                                i13 = iM6877n3;
                                                iM6872i = 0;
                                                iM6877n = 0;
                                                iM6877n2 = 0;
                                            } else {
                                                if (!c6318j.m6868e()) {
                                                    return;
                                                }
                                                iM6877n = c6318j.m6877n();
                                                iM6877n2 = 0;
                                                i13 = iM6877n3;
                                                iM6872i = 0;
                                            }
                                        }
                                        C20441l c20441l2 = c20442m.f64779n;
                                        c20441l2.f64752c = c21120f;
                                        c20441l2.f64753d = iM6872i2;
                                        c20441l2.f64754e = iM6876m2;
                                        c20441l2.f64755f = iM6872i3;
                                        c20441l2.f64756g = iM6876m3;
                                        c20441l2.f64757h = zM6871h;
                                        c20441l2.f64758i = z6;
                                        c20441l2.f64759j = zM6871h2;
                                        c20441l2.f64760k = z10;
                                        c20441l2.f64761l = iM6876m;
                                        c20441l2.f64762m = iM6872i;
                                        c20441l2.f64763n = iM6877n2;
                                        c20441l2.f64764o = i13;
                                        c20441l2.f64765p = iM6877n;
                                        c20441l2.f64750a = true;
                                        c20441l2.f64751b = true;
                                        c20442m.f64776k = false;
                                    }
                                    return;
                                }
                                zM6871h = false;
                                zM6871h2 = false;
                                z6 = zM6871h2;
                                if (c20442m.f64774i == 5) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                if (z10) {
                                    iM6876m = 0;
                                } else if (!c6318j.m6868e()) {
                                    return;
                                } else {
                                    iM6876m = c6318j.m6876m();
                                }
                                z11 = c21119e.f67094b;
                                i12 = c21120f.f67107m;
                                if (i12 == 0) {
                                    i14 = c21120f.f67108n;
                                    if (!c6318j.m6867d(i14)) {
                                        return;
                                    }
                                    iM6872i = c6318j.m6872i(i14);
                                    if (z11) {
                                    }
                                    i13 = 0;
                                    iM6877n = 0;
                                    iM6877n2 = 0;
                                } else {
                                    if (i12 == 1) {
                                    }
                                    iM6872i = 0;
                                    i13 = 0;
                                    iM6877n = 0;
                                    iM6877n2 = 0;
                                }
                                C20441l c20441l3 = c20442m.f64779n;
                                c20441l3.f64752c = c21120f;
                                c20441l3.f64753d = iM6872i2;
                                c20441l3.f64754e = iM6876m2;
                                c20441l3.f64755f = iM6872i3;
                                c20441l3.f64756g = iM6876m3;
                                c20441l3.f64757h = zM6871h;
                                c20441l3.f64758i = z6;
                                c20441l3.f64759j = zM6871h2;
                                c20441l3.f64760k = z10;
                                c20441l3.f64761l = iM6876m;
                                c20441l3.f64762m = iM6872i;
                                c20441l3.f64763n = iM6877n2;
                                c20441l3.f64764o = i13;
                                c20441l3.f64765p = iM6877n;
                                c20441l3.f64750a = true;
                                c20441l3.f64751b = true;
                                c20442m.f64776k = false;
                            }
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:106:0x02d1  */
    /* JADX WARN: Code duplicated, block: B:19:0x005a  */
    /* JADX WARN: Code duplicated, block: B:89:0x027d  */
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
    @Override // p1055v4.InterfaceC20435f
    /* JADX INFO: renamed from: b */
    public final void mo21088b(C20811m c20811m) {
        int i10;
        int i11;
        byte[] bArr;
        int i12;
        int i13;
        long j10;
        boolean z6;
        long j11;
        int i14;
        long j12;
        int i15;
        int i16;
        int i17;
        int i18;
        boolean z10;
        AbstractC20800b.m21321i(this.f64794j);
        int i19 = AbstractC20817s.f66106a;
        int i20 = c20811m.f66093b;
        int i21 = c20811m.f66094c;
        byte[] bArr2 = c20811m.f66092a;
        this.f64791g += (long) c20811m.m21346a();
        this.f64794j.mo4970c(c20811m.m21346a(), c20811m);
        while (true) {
            int iM21585b = AbstractC21121g.m21585b(bArr2, i20, i21, this.f64792h);
            if (iM21585b == i21) {
                m21101a(bArr2, i20, i21);
                return;
            }
            int i22 = iM21585b + 3;
            int i23 = bArr2[i22] & 31;
            int i24 = iM21585b - i20;
            if (i24 > 0) {
                m21101a(bArr2, i20, iM21585b);
            }
            int i25 = i21 - iM21585b;
            long j13 = this.f64791g - ((long) i25);
            int i26 = i24 < 0 ? -i24 : 0;
            long j14 = this.f64797m;
            boolean z11 = this.f64796l;
            C1529G c1529g = this.f64789e;
            C1529G c1529g2 = this.f64788d;
            if (!z11 || this.f64795k.f64768c) {
                c1529g2.m2262e(i26);
                c1529g.m2262e(i26);
                if (this.f64796l) {
                    i10 = i25;
                    i11 = i21;
                    bArr = bArr2;
                    i12 = i22;
                    i13 = i23;
                    j10 = j13;
                    if (c1529g2.f4111e) {
                        C21120f c21120fM21587d = AbstractC21121g.m21587d((byte[]) c1529g2.f4112f, 3, c1529g2.f4109c);
                        this.f64795k.f64769d.append(c21120fM21587d.f67098d, c21120fM21587d);
                        c1529g2.m2264g();
                    } else if (c1529g.f4111e) {
                        C6318J c6318j = new C6318J((byte[]) c1529g.f4112f, 4, c1529g.f4109c);
                        int iM6876m = c6318j.m6876m();
                        int iM6876m2 = c6318j.m6876m();
                        c6318j.m6882s();
                        this.f64795k.f64770e.append(iM6876m, new C21119e(iM6876m, iM6876m2, c6318j.m6871h()));
                        c1529g.m2264g();
                    }
                } else if (c1529g2.f4111e && c1529g.f4111e) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(Arrays.copyOf((byte[]) c1529g2.f4112f, c1529g2.f4109c));
                    arrayList.add(Arrays.copyOf((byte[]) c1529g.f4112f, c1529g.f4109c));
                    i11 = i21;
                    C21120f c21120fM21587d2 = AbstractC21121g.m21587d((byte[]) c1529g2.f4112f, 3, c1529g2.f4109c);
                    bArr = bArr2;
                    i12 = i22;
                    C6318J c6318j2 = new C6318J((byte[]) c1529g.f4112f, 4, c1529g.f4109c);
                    int iM6876m3 = c6318j2.m6876m();
                    int iM6876m4 = c6318j2.m6876m();
                    c6318j2.m6882s();
                    C21119e c21119e = new C21119e(iM6876m3, iM6876m4, c6318j2.m6871h());
                    i13 = i23;
                    i10 = i25;
                    j10 = j13;
                    String str = String.format("avc1.%02X%02X%02X", Integer.valueOf(c21120fM21587d2.f67095a), Integer.valueOf(c21120fM21587d2.f67096b), Integer.valueOf(c21120fM21587d2.f67097c));
                    InterfaceC6316H interfaceC6316H = this.f64794j;
                    C19787n c19787n = new C19787n();
                    c19787n.f62703a = this.f64793i;
                    c19787n.f62714l = AbstractC19754D.m20711i("video/avc");
                    c19787n.f62711i = str;
                    c19787n.f62720r = c21120fM21587d2.f67099e;
                    c19787n.f62721s = c21120fM21587d2.f67100f;
                    c19787n.f62727y = new C19781h(c21120fM21587d2.f67110p, c21120fM21587d2.f67111q, c21120fM21587d2.f67112r, c21120fM21587d2.f67102h + 8, c21120fM21587d2.f67103i + 8, null);
                    c19787n.f62724v = c21120fM21587d2.f67101g;
                    c19787n.f62717o = arrayList;
                    c19787n.f62716n = c21120fM21587d2.f67113s;
                    interfaceC6316H.mo4971d(new C19788o(c19787n));
                    this.f64796l = true;
                    this.f64795k.f64769d.append(c21120fM21587d2.f67098d, c21120fM21587d2);
                    this.f64795k.f64770e.append(iM6876m3, c21119e);
                    c1529g2.m2264g();
                    c1529g.m2264g();
                } else {
                    i10 = i25;
                    i11 = i21;
                    bArr = bArr2;
                    i12 = i22;
                    i13 = i23;
                    j10 = j13;
                }
            } else {
                i10 = i25;
                i11 = i21;
                bArr = bArr2;
                i12 = i22;
                i13 = i23;
                j10 = j13;
            }
            C1529G c1529g3 = this.f64790f;
            if (c1529g3.m2262e(i26)) {
                int iM21589f = AbstractC21121g.m21589f(c1529g3.f4109c, (byte[]) c1529g3.f4112f);
                byte[] bArr3 = (byte[]) c1529g3.f4112f;
                C20811m c20811m2 = this.f64799o;
                c20811m2.m21342D(iM21589f, bArr3);
                c20811m2.m21344F(4);
                AbstractC6320b.m6888d(j14, c20811m2, (InterfaceC6316H[]) this.f64785a.f62321Z);
            }
            C20442m c20442m = this.f64795k;
            boolean z12 = this.f64796l;
            if (c20442m.f64774i == 9) {
                if (z12 && c20442m.f64780o) {
                    j11 = c20442m.f64775j;
                    i14 = i10 + ((int) (j10 - j11));
                    j12 = c20442m.f64782q;
                    if (j12 != -9223372036854775807L) {
                        c20442m.f64766a.mo4968a(j12, c20442m.f64783r ? 1 : 0, (int) (j11 - c20442m.f64781p), i14, null);
                    }
                }
                c20442m.f64781p = c20442m.f64775j;
                c20442m.f64782q = c20442m.f64777l;
                z6 = false;
                c20442m.f64783r = false;
                c20442m.f64780o = true;
            } else {
                if (c20442m.f64768c) {
                    C20441l c20441l = c20442m.f64779n;
                    C20441l c20441l2 = c20442m.f64778m;
                    if (c20441l.f64750a) {
                        if (c20441l2.f64750a) {
                            C21120f c21120f = c20441l.f64752c;
                            AbstractC20800b.m21321i(c21120f);
                            C21120f c21120f2 = c20441l2.f64752c;
                            AbstractC20800b.m21321i(c21120f2);
                            if (c20441l.f64755f == c20441l2.f64755f && c20441l.f64756g == c20441l2.f64756g && c20441l.f64757h == c20441l2.f64757h && ((!c20441l.f64758i || !c20441l2.f64758i || c20441l.f64759j == c20441l2.f64759j) && ((i17 = c20441l.f64753d) == (i18 = c20441l2.f64753d) || (i17 != 0 && i18 != 0)))) {
                                int i27 = c21120f2.f67107m;
                                int i28 = c21120f.f67107m;
                                if ((i28 != 0 || i27 != 0 || (c20441l.f64762m == c20441l2.f64762m && c20441l.f64763n == c20441l2.f64763n)) && ((i28 != 1 || i27 != 1 || (c20441l.f64764o == c20441l2.f64764o && c20441l.f64765p == c20441l2.f64765p)) && (z10 = c20441l.f64760k) == c20441l2.f64760k && (!z10 || c20441l.f64761l == c20441l2.f64761l))) {
                                }
                            }
                        }
                        if (z12) {
                            j11 = c20442m.f64775j;
                            i14 = i10 + ((int) (j10 - j11));
                            j12 = c20442m.f64782q;
                            if (j12 != -9223372036854775807L) {
                                c20442m.f64766a.mo4968a(j12, c20442m.f64783r ? 1 : 0, (int) (j11 - c20442m.f64781p), i14, null);
                            }
                        }
                        c20442m.f64781p = c20442m.f64775j;
                        c20442m.f64782q = c20442m.f64777l;
                        z6 = false;
                        c20442m.f64783r = false;
                        c20442m.f64780o = true;
                    }
                }
                z6 = false;
            }
            c20442m.m21100a();
            if (c20442m.f64783r) {
                this.f64798n = z6;
            }
            long j15 = this.f64797m;
            if (!this.f64796l || this.f64795k.f64768c) {
                i15 = i13;
                c1529g2.m2265h(i15);
                c1529g.m2265h(i15);
            } else {
                i15 = i13;
            }
            c1529g3.m2265h(i15);
            C20442m c20442m2 = this.f64795k;
            boolean z13 = this.f64798n;
            c20442m2.f64774i = i15;
            c20442m2.f64777l = j15;
            c20442m2.f64775j = j10;
            c20442m2.f64784s = z13;
            if (c20442m2.f64767b) {
                i16 = 1;
                if (i15 == 1) {
                    C20441l c20441l3 = c20442m2.f64778m;
                    c20442m2.f64778m = c20442m2.f64779n;
                    c20442m2.f64779n = c20441l3;
                    c20441l3.f64751b = false;
                    c20441l3.f64750a = false;
                    c20442m2.f64773h = 0;
                    c20442m2.f64776k = true;
                }
                i21 = i11;
                bArr2 = bArr;
                i20 = i12;
            } else {
                i16 = 1;
            }
            if (c20442m2.f64768c) {
                if (i15 != 5 && i15 != i16) {
                    if (i15 == 2) {
                    }
                    i21 = i11;
                    bArr2 = bArr;
                    i20 = i12;
                }
                C20441l c20441l4 = c20442m2.f64778m;
                c20442m2.f64778m = c20442m2.f64779n;
                c20442m2.f64779n = c20441l4;
                c20441l4.f64751b = false;
                c20441l4.f64750a = false;
                c20442m2.f64773h = 0;
                c20442m2.f64776k = true;
                i21 = i11;
                bArr2 = bArr;
                i20 = i12;
            }
            i21 = i11;
            bArr2 = bArr;
            i20 = i12;
        }
    }

    @Override // p1055v4.InterfaceC20435f
    /* JADX INFO: renamed from: c */
    public final void mo21089c() {
        this.f64791g = 0L;
        this.f64798n = false;
        this.f64797m = -9223372036854775807L;
        AbstractC21121g.m21584a(this.f64792h);
        this.f64788d.m2264g();
        this.f64789e.m2264g();
        this.f64790f.m2264g();
        C20442m c20442m = this.f64795k;
        if (c20442m != null) {
            c20442m.f64776k = false;
            c20442m.f64780o = false;
            C20441l c20441l = c20442m.f64779n;
            c20441l.f64751b = false;
            c20441l.f64750a = false;
        }
    }

    @Override // p1055v4.InterfaceC20435f
    /* JADX INFO: renamed from: d */
    public final void mo21090d(InterfaceC6335q interfaceC6335q, C13458b c13458b) {
        c13458b.m14981c();
        c13458b.m14986h();
        this.f64793i = (String) c13458b.f42596e;
        c13458b.m14986h();
        InterfaceC6316H interfaceC6316HMo3044D = interfaceC6335q.mo3044D(c13458b.f42594c, 2);
        this.f64794j = interfaceC6316HMo3044D;
        this.f64795k = new C20442m(interfaceC6316HMo3044D, this.f64786b, this.f64787c);
        this.f64785a.m20632c(interfaceC6335q, c13458b);
    }

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
    @Override // p1055v4.InterfaceC20435f
    /* JADX INFO: renamed from: e */
    public final void mo21091e(boolean z6) {
        AbstractC20800b.m21321i(this.f64794j);
        int i10 = AbstractC20817s.f66106a;
        if (z6) {
            C20442m c20442m = this.f64795k;
            long j10 = this.f64791g;
            c20442m.m21100a();
            c20442m.f64775j = j10;
            long j11 = c20442m.f64782q;
            if (j11 != -9223372036854775807L) {
                boolean z10 = c20442m.f64783r;
                c20442m.f64766a.mo4968a(j11, z10 ? 1 : 0, (int) (j10 - c20442m.f64781p), 0, null);
            }
            c20442m.f64780o = false;
        }
    }

    @Override // p1055v4.InterfaceC20435f
    /* JADX INFO: renamed from: f */
    public final void mo21092f(int i10, long j10) {
        this.f64797m = j10;
        this.f64798n = ((i10 & 2) != 0) | this.f64798n;
    }
}
