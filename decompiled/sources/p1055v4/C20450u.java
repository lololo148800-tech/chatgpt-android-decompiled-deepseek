package p1055v4;

import p1071w0.AbstractC20734X;
import p1073w3.AbstractC20800b;
import p1073w3.C20811m;
import p1073w3.C20816r;
import p372P3.C6318J;
import p372P3.InterfaceC6335q;
import p734ep.C13458b;

/* JADX INFO: renamed from: v4.u */
/* JADX INFO: loaded from: classes.dex */
public final class C20450u implements InterfaceC20429C {

    /* JADX INFO: renamed from: a */
    public final InterfaceC20435f f64886a;

    /* JADX INFO: renamed from: b */
    public final C6318J f64887b = new C6318J(10, new byte[10]);

    /* JADX INFO: renamed from: c */
    public int f64888c = 0;

    /* JADX INFO: renamed from: d */
    public int f64889d;

    /* JADX INFO: renamed from: e */
    public C20816r f64890e;

    /* JADX INFO: renamed from: f */
    public boolean f64891f;

    /* JADX INFO: renamed from: g */
    public boolean f64892g;

    /* JADX INFO: renamed from: h */
    public boolean f64893h;

    /* JADX INFO: renamed from: i */
    public int f64894i;

    /* JADX INFO: renamed from: j */
    public int f64895j;

    /* JADX INFO: renamed from: k */
    public boolean f64896k;

    /* JADX INFO: renamed from: l */
    public long f64897l;

    public C20450u(InterfaceC20435f interfaceC20435f) {
        this.f64886a = interfaceC20435f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v9, types: [int] */
    /* JADX WARN: Type inference failed for: r11v0, types: [P3.J] */
    /* JADX WARN: Type inference failed for: r11v3, types: [int] */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r17v3 */
    /* JADX WARN: Type inference failed for: r18v0 */
    /* JADX WARN: Type inference failed for: r18v2 */
    /* JADX WARN: Type inference failed for: r3v0, types: [v4.f] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
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
    @Override // p1055v4.InterfaceC20429C
    /* JADX INFO: renamed from: a */
    public final void mo21083a(int i10, C20811m c20811m) {
        int i11;
        int i12;
        int i13;
        boolean z6;
        int i14;
        int i15;
        ?? r11;
        AbstractC20800b.m21321i(this.f64890e);
        int i16 = i10 & 1;
        ?? r6 = this.f64886a;
        int i17 = -1;
        int i18 = 3;
        int i19 = 2;
        ?? r10 = 0;
        if (i16 != 0) {
            int i20 = this.f64888c;
            if (i20 != 0 && i20 != 1) {
                if (i20 == 2) {
                    AbstractC20800b.m21332t("PesReader", "Unexpected start indicator reading extended header");
                } else {
                    if (i20 != 3) {
                        throw new IllegalStateException();
                    }
                    if (this.f64895j != -1) {
                        AbstractC20800b.m21332t("PesReader", "Unexpected start indicator: expected " + this.f64895j + " more bytes");
                    }
                    r6.mo21091e(c20811m.f66094c == 0);
                }
            }
            this.f64888c = 1;
            this.f64889d = 0;
        }
        int i21 = i10;
        while (c20811m.m21346a() > 0) {
            int i22 = this.f64888c;
            if (i22 != 0) {
                ?? r12 = this.f64887b;
                if (i22 == 1) {
                    i12 = i18;
                    ?? r13 = r10;
                    if (m21104b(c20811m, r12.f20467d, 9)) {
                        r12.m6880q(r13 == true ? 1 : 0);
                        int iM6872i = r12.m6872i(24);
                        if (iM6872i != 1) {
                            AbstractC20734X.m21224A(iM6872i, "Unexpected start code prefix: ", "PesReader");
                            this.f64895j = -1;
                            i11 = -1;
                            i14 = 0;
                            i13 = 2;
                        } else {
                            r12.m6883t(8);
                            int iM6872i2 = r12.m6872i(16);
                            r12.m6883t(5);
                            this.f64896k = r12.m6871h();
                            i13 = 2;
                            r12.m6883t(2);
                            this.f64891f = r12.m6871h();
                            this.f64892g = r12.m6871h();
                            r12.m6883t(6);
                            int iM6872i3 = r12.m6872i(8);
                            this.f64894i = iM6872i3;
                            if (iM6872i2 == 0) {
                                this.f64895j = -1;
                                i11 = -1;
                            } else {
                                int i23 = (iM6872i2 - 3) - iM6872i3;
                                this.f64895j = i23;
                                if (i23 < 0) {
                                    AbstractC20800b.m21332t("PesReader", "Found negative packet payload size: " + this.f64895j);
                                    i11 = -1;
                                    this.f64895j = -1;
                                } else {
                                    i11 = -1;
                                }
                            }
                            i14 = 2;
                        }
                        this.f64888c = i14;
                        z6 = false;
                        this.f64889d = 0;
                    } else {
                        z6 = r13 == true ? 1 : 0;
                        i11 = -1;
                        i13 = 2;
                    }
                } else if (i22 == i19) {
                    if (m21104b(c20811m, r12.f20467d, Math.min(10, this.f64894i)) && m21104b(c20811m, null, this.f64894i)) {
                        r12.m6880q(r10);
                        this.f64897l = -9223372036854775807L;
                        if (this.f64891f) {
                            r12.m6883t(4);
                            long jM6872i = ((long) r12.m6872i(i18)) << 30;
                            r12.m6883t(1);
                            long jM6872i2 = jM6872i | ((long) (r12.m6872i(15) << 15));
                            r12.m6883t(1);
                            long jM6872i3 = jM6872i2 | ((long) r12.m6872i(15));
                            r12.m6883t(1);
                            if (!this.f64893h && this.f64892g) {
                                r12.m6883t(4);
                                long jM6872i4 = ((long) r12.m6872i(i18)) << 30;
                                r12.m6883t(1);
                                long jM6872i5 = ((long) (r12.m6872i(15) << 15)) | jM6872i4;
                                r12.m6883t(1);
                                long jM6872i6 = jM6872i5 | ((long) r12.m6872i(15));
                                r12.m6883t(1);
                                this.f64890e.m21381b(jM6872i6);
                                this.f64893h = true;
                            }
                            this.f64897l = this.f64890e.m21381b(jM6872i3);
                        }
                        i21 |= this.f64896k ? 4 : 0;
                        r6.mo21092f(i21, this.f64897l);
                        this.f64888c = 3;
                        this.f64889d = 0;
                        r10 = 0;
                        i19 = 2;
                        i18 = 3;
                        i17 = -1;
                    } else {
                        i12 = i18;
                        i11 = -1;
                        ?? r17 = r10;
                        i13 = i19;
                        z6 = r17 == true ? 1 : 0;
                    }
                } else {
                    if (i22 != i18) {
                        throw new IllegalStateException();
                    }
                    int iM21346a = c20811m.m21346a();
                    int i24 = this.f64895j;
                    if (i24 == i17) {
                        r11 = r10;
                    } else {
                        i15 = iM21346a - i24;
                    }
                    if (r11 > 0) {
                        r11 = i15;
                        iM21346a -= r11;
                        c20811m.m21343E(c20811m.f66093b + iM21346a);
                    }
                    r11 = i15;
                    r6.mo21088b(c20811m);
                    int i25 = this.f64895j;
                    if (i25 != i17) {
                        int i26 = i25 - iM21346a;
                        this.f64895j = i26;
                        if (i26 == 0) {
                            r6.mo21091e(r10);
                            this.f64888c = 1;
                            this.f64889d = r10;
                        }
                    }
                    int i27 = i18;
                    i11 = i17;
                    i12 = i27;
                    ?? r18 = r10;
                    i13 = i19;
                    z6 = r18 == true ? 1 : 0;
                }
            } else {
                int i28 = i18;
                i11 = i17;
                i12 = i28;
                ?? r19 = r10;
                i13 = i19;
                z6 = r19 == true ? 1 : 0;
                c20811m.m21345G(c20811m.m21346a());
            }
            int i29 = i11;
            i18 = i12;
            i17 = i29;
            int i30 = i13;
            r10 = z6;
            i19 = i30;
        }
    }

    /* JADX INFO: renamed from: b */
    public final boolean m21104b(C20811m c20811m, byte[] bArr, int i10) {
        int iMin = Math.min(c20811m.m21346a(), i10 - this.f64889d);
        if (iMin <= 0) {
            return true;
        }
        if (bArr == null) {
            c20811m.m21345G(iMin);
        } else {
            c20811m.m21350e(bArr, this.f64889d, iMin);
        }
        int i11 = this.f64889d + iMin;
        this.f64889d = i11;
        return i11 == i10;
    }

    @Override // p1055v4.InterfaceC20429C
    /* JADX INFO: renamed from: c */
    public final void mo21084c() {
        this.f64888c = 0;
        this.f64889d = 0;
        this.f64893h = false;
        this.f64886a.mo21089c();
    }

    @Override // p1055v4.InterfaceC20429C
    /* JADX INFO: renamed from: d */
    public final void mo21085d(C20816r c20816r, InterfaceC6335q interfaceC6335q, C13458b c13458b) {
        this.f64890e = c20816r;
        this.f64886a.mo21090d(interfaceC6335q, c13458b);
    }
}
