package p1055v4;

import java.util.Arrays;
import java.util.Collections;
import p1016t3.AbstractC19754D;
import p1016t3.C19755E;
import p1016t3.C19787n;
import p1016t3.C19788o;
import p1073w3.AbstractC20800b;
import p1073w3.AbstractC20817s;
import p1073w3.C20811m;
import p372P3.AbstractC6320b;
import p372P3.C6318J;
import p372P3.C6319a;
import p372P3.C6332n;
import p372P3.InterfaceC6316H;
import p372P3.InterfaceC6335q;
import p734ep.C13458b;

/* JADX INFO: renamed from: v4.c */
/* JADX INFO: loaded from: classes.dex */
public final class C20432c implements InterfaceC20435f {

    /* JADX INFO: renamed from: w */
    public static final byte[] f64656w = {73, 68, 51};

    /* JADX INFO: renamed from: a */
    public final boolean f64657a;

    /* JADX INFO: renamed from: d */
    public final String f64660d;

    /* JADX INFO: renamed from: e */
    public final int f64661e;

    /* JADX INFO: renamed from: f */
    public String f64662f;

    /* JADX INFO: renamed from: g */
    public InterfaceC6316H f64663g;

    /* JADX INFO: renamed from: h */
    public InterfaceC6316H f64664h;

    /* JADX INFO: renamed from: l */
    public boolean f64668l;

    /* JADX INFO: renamed from: m */
    public boolean f64669m;

    /* JADX INFO: renamed from: p */
    public int f64672p;

    /* JADX INFO: renamed from: q */
    public boolean f64673q;

    /* JADX INFO: renamed from: s */
    public int f64675s;

    /* JADX INFO: renamed from: u */
    public InterfaceC6316H f64677u;

    /* JADX INFO: renamed from: v */
    public long f64678v;

    /* JADX INFO: renamed from: b */
    public final C6318J f64658b = new C6318J(7, new byte[7]);

    /* JADX INFO: renamed from: c */
    public final C20811m f64659c = new C20811m(Arrays.copyOf(f64656w, 10));

    /* JADX INFO: renamed from: i */
    public int f64665i = 0;

    /* JADX INFO: renamed from: j */
    public int f64666j = 0;

    /* JADX INFO: renamed from: k */
    public int f64667k = 256;

    /* JADX INFO: renamed from: n */
    public int f64670n = -1;

    /* JADX INFO: renamed from: o */
    public int f64671o = -1;

    /* JADX INFO: renamed from: r */
    public long f64674r = -9223372036854775807L;

    /* JADX INFO: renamed from: t */
    public long f64676t = -9223372036854775807L;

    public C20432c(boolean z6, String str, int i10) {
        this.f64657a = z6;
        this.f64660d = str;
        this.f64661e = i10;
    }

    /* JADX WARN: Code duplicated, block: B:114:0x02a3  */
    /* JADX WARN: Code duplicated, block: B:115:0x02a5  */
    /* JADX WARN: Code duplicated, block: B:118:0x02ac  */
    /* JADX WARN: Code duplicated, block: B:119:0x02b2  */
    /* JADX WARN: Code duplicated, block: B:121:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:124:0x02ca  */
    /* JADX WARN: Code duplicated, block: B:126:0x02ce  */
    /* JADX WARN: Code duplicated, block: B:128:0x02d2  */
    /* JADX WARN: Code duplicated, block: B:130:0x02d6  */
    /* JADX WARN: Code duplicated, block: B:132:0x02da  */
    /* JADX WARN: Code duplicated, block: B:133:0x02e0  */
    /* JADX WARN: Code duplicated, block: B:135:0x02f4  */
    /* JADX WARN: Code duplicated, block: B:136:0x02fe  */
    /* JADX WARN: Code duplicated, block: B:137:0x0308  */
    /* JADX WARN: Code duplicated, block: B:171:0x02e4 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r24v0, types: [w3.m] */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [int] */
    /* JADX WARN: Type inference failed for: r2v45 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
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
    public final void mo21088b(C20811m c20811m) throws C19755E {
        ?? r10;
        int i10;
        byte[] bArr;
        int i11;
        int i12;
        int i13;
        char c9;
        char c10;
        boolean z6;
        boolean z10;
        int i14;
        int i15;
        int i16;
        ?? r6 = 0;
        int i17 = 7;
        int i18 = 2;
        this.f64663g.getClass();
        int i19 = AbstractC20817s.f66106a;
        while (c20811m.m21346a() > 0) {
            int i20 = this.f64665i;
            C6318J c6318j = this.f64658b;
            int i21 = 4;
            C20811m c20811m2 = this.f64659c;
            if (i20 == 0) {
                byte[] bArr2 = c20811m.f66092a;
                int i22 = c20811m.f66093b;
                int i23 = c20811m.f66094c;
                ?? r11 = r6;
                while (true) {
                    if (i22 < i23) {
                        int i24 = i22 + 1;
                        byte b = bArr2[i22];
                        int i25 = b & 255;
                        if (this.f64667k == 512 && ((65280 | (((byte) i25) & 255)) & 65526) == 65520) {
                            if (!this.f64669m) {
                                int i26 = i22 - 1;
                                c20811m.m21344F(i22);
                                byte[] bArr3 = c6318j.f20467d;
                                if (c20811m.m21346a() < 1) {
                                    bArr = bArr2;
                                } else {
                                    c20811m.m21350e(bArr3, r11, 1);
                                    c6318j.m6880q(i21);
                                    int iM6872i = c6318j.m6872i(1);
                                    int i27 = this.f64670n;
                                    if (i27 == -1 || iM6872i == i27) {
                                        if (this.f64671o != -1) {
                                            byte[] bArr4 = c6318j.f20467d;
                                            if (c20811m.m21346a() >= 1) {
                                                c20811m.m21350e(bArr4, r11, 1);
                                                c6318j.m6880q(i18);
                                                i14 = 4;
                                                if (c6318j.m6872i(4) != this.f64671o) {
                                                    bArr = bArr2;
                                                } else {
                                                    c20811m.m21344F(i24);
                                                }
                                            }
                                        } else {
                                            i14 = 4;
                                        }
                                        byte[] bArr5 = c6318j.f20467d;
                                        if (c20811m.m21346a() >= i14) {
                                            c20811m.m21350e(bArr5, r11, i14);
                                            c6318j.m6880q(14);
                                            int iM6872i2 = c6318j.m6872i(13);
                                            if (iM6872i2 < 7) {
                                                bArr = bArr2;
                                            } else {
                                                byte[] bArr6 = c20811m.f66092a;
                                                int i28 = c20811m.f66094c;
                                                int i29 = i26 + iM6872i2;
                                                if (i29 < i28) {
                                                    byte b10 = bArr6[i29];
                                                    bArr = bArr2;
                                                    if (b10 == -1) {
                                                        int i30 = i29 + 1;
                                                        if (i30 != i28) {
                                                            byte b11 = bArr6[i30];
                                                            if (((65280 | (b11 & 255)) & 65526) != 65520 || ((b11 & 8) >> 3) != iM6872i) {
                                                            }
                                                        }
                                                    } else if (b10 == 73 && ((i15 = i29 + 1) == i28 || (bArr6[i15] == 68 && ((i16 = i29 + 2) == i28 || bArr6[i16] == 51)))) {
                                                    }
                                                }
                                                this.f64672p = (b & 8) >> 3;
                                                if ((b & 1) == 0) {
                                                    z10 = true;
                                                } else {
                                                    z10 = false;
                                                }
                                                this.f64668l = z10;
                                                if (this.f64669m) {
                                                    this.f64665i = 3;
                                                    this.f64666j = 0;
                                                } else {
                                                    this.f64665i = 1;
                                                    this.f64666j = 0;
                                                }
                                                c20811m.m21344F(i24);
                                                i10 = 2;
                                                r10 = 0;
                                            }
                                        }
                                    } else {
                                        bArr = bArr2;
                                    }
                                }
                                i11 = this.f64667k;
                                i12 = i11 | i25;
                                if (i12 != 329) {
                                    i13 = 2;
                                    c9 = 256;
                                    c10 = 3;
                                    z6 = false;
                                    this.f64667k = 768;
                                } else if (i12 != 511) {
                                    i13 = 2;
                                    c9 = 256;
                                    c10 = 3;
                                    z6 = false;
                                    this.f64667k = 512;
                                } else if (i12 != 836) {
                                    i13 = 2;
                                    c9 = 256;
                                    c10 = 3;
                                    z6 = false;
                                    this.f64667k = 1024;
                                } else if (i12 != 1075) {
                                    c9 = 256;
                                    if (i11 != 256) {
                                        this.f64667k = 256;
                                        i13 = 2;
                                        c10 = 3;
                                        z6 = false;
                                    } else {
                                        i13 = 2;
                                        c10 = 3;
                                        z6 = false;
                                    }
                                    bArr2 = bArr;
                                    i21 = 4;
                                    i18 = i13;
                                    r11 = z6;
                                } else {
                                    i10 = 2;
                                    this.f64665i = 2;
                                    this.f64666j = 3;
                                    r10 = 0;
                                    this.f64675s = 0;
                                    c20811m2.m21344F(0);
                                    c20811m.m21344F(i24);
                                }
                                i22 = i24;
                                bArr2 = bArr;
                                i21 = 4;
                                i18 = i13;
                                r11 = z6;
                            }
                            this.f64672p = (b & 8) >> 3;
                            if ((b & 1) == 0) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            this.f64668l = z10;
                            if (this.f64669m) {
                                this.f64665i = 1;
                                this.f64666j = 0;
                            } else {
                                this.f64665i = 3;
                                this.f64666j = 0;
                            }
                            c20811m.m21344F(i24);
                            i10 = 2;
                            r10 = 0;
                        } else {
                            bArr = bArr2;
                            i11 = this.f64667k;
                            i12 = i11 | i25;
                            if (i12 != 329) {
                                i13 = 2;
                                c9 = 256;
                                c10 = 3;
                                z6 = false;
                                this.f64667k = 768;
                            } else if (i12 != 511) {
                                i13 = 2;
                                c9 = 256;
                                c10 = 3;
                                z6 = false;
                                this.f64667k = 512;
                            } else if (i12 != 836) {
                                i13 = 2;
                                c9 = 256;
                                c10 = 3;
                                z6 = false;
                                this.f64667k = 1024;
                            } else if (i12 != 1075) {
                                c9 = 256;
                                if (i11 != 256) {
                                    this.f64667k = 256;
                                    i13 = 2;
                                    c10 = 3;
                                    z6 = false;
                                } else {
                                    i13 = 2;
                                    c10 = 3;
                                    z6 = false;
                                }
                                bArr2 = bArr;
                                i21 = 4;
                                i18 = i13;
                                r11 = z6;
                            } else {
                                i10 = 2;
                                this.f64665i = 2;
                                this.f64666j = 3;
                                r10 = 0;
                                this.f64675s = 0;
                                c20811m2.m21344F(0);
                                c20811m.m21344F(i24);
                            }
                            i22 = i24;
                            bArr2 = bArr;
                            i21 = 4;
                            i18 = i13;
                            r11 = z6;
                        }
                    } else {
                        r10 = r11;
                        i10 = i18;
                        c20811m.m21344F(i22);
                    }
                    i18 = i10;
                    r6 = r10;
                    i17 = 7;
                }
            } else if (i20 != 1) {
                if (i20 == i18) {
                    byte[] bArr7 = c20811m2.f66092a;
                    int iMin = Math.min(c20811m.m21346a(), 10 - this.f64666j);
                    c20811m.m21350e(bArr7, this.f64666j, iMin);
                    int i31 = this.f64666j + iMin;
                    this.f64666j = i31;
                    if (i31 == 10) {
                        this.f64664h.mo4970c(10, c20811m2);
                        c20811m2.m21344F(6);
                        InterfaceC6316H interfaceC6316H = this.f64664h;
                        int iM21364s = c20811m2.m21364s() + 10;
                        this.f64665i = 4;
                        this.f64666j = 10;
                        this.f64677u = interfaceC6316H;
                        this.f64678v = 0L;
                        this.f64675s = iM21364s;
                    }
                } else if (i20 == 3) {
                    int i32 = this.f64668l ? i17 : 5;
                    byte[] bArr8 = c6318j.f20467d;
                    int iMin2 = Math.min(c20811m.m21346a(), i32 - this.f64666j);
                    c20811m.m21350e(bArr8, this.f64666j, iMin2);
                    int i33 = this.f64666j + iMin2;
                    this.f64666j = i33;
                    if (i33 == i32) {
                        c6318j.m6880q(r6 == true ? 1 : 0);
                        if (this.f64673q) {
                            c6318j.m6883t(10);
                        } else {
                            int iM6872i3 = c6318j.m6872i(i18) + 1;
                            if (iM6872i3 != i18) {
                                AbstractC20800b.m21332t("AdtsReader", "Detected audio object type: " + iM6872i3 + ", but assuming AAC LC.");
                                iM6872i3 = i18;
                            }
                            c6318j.m6883t(5);
                            int iM6872i4 = c6318j.m6872i(3);
                            int i34 = this.f64671o;
                            byte b12 = (byte) (((iM6872i3 << 3) & 248) | ((i34 >> 1) & i17));
                            byte b13 = (byte) (((iM6872i4 << 3) & 120) | ((i34 << i17) & 128));
                            byte[] bArr9 = new byte[i18];
                            bArr9[r6 == true ? 1 : 0] = b12;
                            bArr9[1] = b13;
                            C6319a c6319aM6898n = AbstractC6320b.m6898n(new C6318J(i18, bArr9), r6);
                            C19787n c19787n = new C19787n();
                            c19787n.f62703a = this.f64662f;
                            c19787n.f62714l = AbstractC19754D.m20711i("audio/mp4a-latm");
                            c19787n.f62711i = c6319aM6898n.f20469a;
                            c19787n.f62728z = c6319aM6898n.f20471c;
                            c19787n.f62694A = c6319aM6898n.f20470b;
                            c19787n.f62717o = Collections.singletonList(bArr9);
                            c19787n.f62706d = this.f64660d;
                            c19787n.f62708f = this.f64661e;
                            C19788o c19788o = new C19788o(c19787n);
                            this.f64674r = 1024000000 / ((long) c19788o.f62730B);
                            this.f64663g.mo4971d(c19788o);
                            this.f64673q = true;
                        }
                        c6318j.m6883t(4);
                        int iM6872i5 = c6318j.m6872i(13);
                        int i35 = iM6872i5 - 7;
                        if (this.f64668l) {
                            i35 = iM6872i5 - 9;
                        }
                        InterfaceC6316H interfaceC6316H2 = this.f64663g;
                        long j10 = this.f64674r;
                        this.f64665i = 4;
                        this.f64666j = r6 == true ? 1 : 0;
                        this.f64677u = interfaceC6316H2;
                        this.f64678v = j10;
                        this.f64675s = i35;
                    }
                } else {
                    if (i20 != 4) {
                        throw new IllegalStateException();
                    }
                    int iMin3 = Math.min(c20811m.m21346a(), this.f64675s - this.f64666j);
                    this.f64677u.mo4970c(iMin3, c20811m);
                    int i36 = this.f64666j + iMin3;
                    this.f64666j = i36;
                    if (i36 == this.f64675s) {
                        AbstractC20800b.m21320h(this.f64676t != -9223372036854775807L ? true : r6 == true ? 1 : 0);
                        this.f64677u.mo4968a(this.f64676t, 1, this.f64675s, 0, null);
                        this.f64676t += this.f64678v;
                        this.f64665i = r6 == true ? 1 : 0;
                        this.f64666j = r6 == true ? 1 : 0;
                        this.f64667k = 256;
                    }
                }
            } else if (c20811m.m21346a() != 0) {
                c6318j.f20467d[r6 == true ? 1 : 0] = c20811m.f66092a[c20811m.f66093b];
                c6318j.m6880q(i18);
                int iM6872i6 = c6318j.m6872i(4);
                int i37 = this.f64671o;
                if (i37 == -1 || iM6872i6 == i37) {
                    if (!this.f64669m) {
                        this.f64669m = true;
                        this.f64670n = this.f64672p;
                        this.f64671o = iM6872i6;
                    }
                    this.f64665i = 3;
                    this.f64666j = r6 == true ? 1 : 0;
                } else {
                    this.f64669m = r6;
                    this.f64665i = r6 == true ? 1 : 0;
                    this.f64666j = r6 == true ? 1 : 0;
                    this.f64667k = 256;
                }
            }
        }
    }

    @Override // p1055v4.InterfaceC20435f
    /* JADX INFO: renamed from: c */
    public final void mo21089c() {
        this.f64676t = -9223372036854775807L;
        this.f64669m = false;
        this.f64665i = 0;
        this.f64666j = 0;
        this.f64667k = 256;
    }

    @Override // p1055v4.InterfaceC20435f
    /* JADX INFO: renamed from: d */
    public final void mo21090d(InterfaceC6335q interfaceC6335q, C13458b c13458b) {
        c13458b.m14981c();
        c13458b.m14986h();
        this.f64662f = (String) c13458b.f42596e;
        c13458b.m14986h();
        InterfaceC6316H interfaceC6316HMo3044D = interfaceC6335q.mo3044D(c13458b.f42594c, 1);
        this.f64663g = interfaceC6316HMo3044D;
        this.f64677u = interfaceC6316HMo3044D;
        if (!this.f64657a) {
            this.f64664h = new C6332n();
            return;
        }
        c13458b.m14981c();
        c13458b.m14986h();
        InterfaceC6316H interfaceC6316HMo3044D2 = interfaceC6335q.mo3044D(c13458b.f42594c, 5);
        this.f64664h = interfaceC6316HMo3044D2;
        C19787n c19787n = new C19787n();
        c13458b.m14986h();
        c19787n.f62703a = (String) c13458b.f42596e;
        c19787n.f62714l = AbstractC19754D.m20711i("application/id3");
        interfaceC6316HMo3044D2.mo4971d(new C19788o(c19787n));
    }

    @Override // p1055v4.InterfaceC20435f
    /* JADX INFO: renamed from: f */
    public final void mo21092f(int i10, long j10) {
        this.f64676t = j10;
    }

    @Override // p1055v4.InterfaceC20435f
    /* JADX INFO: renamed from: e */
    public final void mo21091e(boolean z6) {
    }
}
