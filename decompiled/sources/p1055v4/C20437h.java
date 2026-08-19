package p1055v4;

import android.util.Pair;
import java.util.Arrays;
import java.util.Collections;
import p057C3.C1529G;
import p1016t3.AbstractC19754D;
import p1016t3.C19787n;
import p1016t3.C19788o;
import p1036u9.C20168n;
import p1073w3.AbstractC20800b;
import p1073w3.AbstractC20817s;
import p1073w3.C20811m;
import p1097x3.AbstractC21121g;
import p372P3.InterfaceC6316H;
import p372P3.InterfaceC6335q;
import p734ep.C13458b;

/* JADX INFO: renamed from: v4.h */
/* JADX INFO: loaded from: classes.dex */
public final class C20437h implements InterfaceC20435f {

    /* JADX INFO: renamed from: q */
    public static final double[] f64707q = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};

    /* JADX INFO: renamed from: a */
    public String f64708a;

    /* JADX INFO: renamed from: b */
    public InterfaceC6316H f64709b;

    /* JADX INFO: renamed from: c */
    public final C20168n f64710c;

    /* JADX INFO: renamed from: d */
    public final C20811m f64711d;

    /* JADX INFO: renamed from: e */
    public final C1529G f64712e;

    /* JADX INFO: renamed from: f */
    public final boolean[] f64713f = new boolean[4];

    /* JADX INFO: renamed from: g */
    public final C20436g f64714g;

    /* JADX INFO: renamed from: h */
    public long f64715h;

    /* JADX INFO: renamed from: i */
    public boolean f64716i;

    /* JADX INFO: renamed from: j */
    public boolean f64717j;

    /* JADX INFO: renamed from: k */
    public long f64718k;

    /* JADX INFO: renamed from: l */
    public long f64719l;

    /* JADX INFO: renamed from: m */
    public long f64720m;

    /* JADX INFO: renamed from: n */
    public long f64721n;

    /* JADX INFO: renamed from: o */
    public boolean f64722o;

    /* JADX INFO: renamed from: p */
    public boolean f64723p;

    public C20437h(C20168n c20168n) {
        this.f64710c = c20168n;
        C20436g c20436g = new C20436g();
        c20436g.f64706d = new byte[128];
        this.f64714g = c20436g;
        if (c20168n != null) {
            this.f64712e = new C1529G(178);
            this.f64711d = new C20811m();
        } else {
            this.f64712e = null;
            this.f64711d = null;
        }
        this.f64719l = -9223372036854775807L;
        this.f64721n = -9223372036854775807L;
    }

    /* JADX WARN: Code duplicated, block: B:63:0x0196  */
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
        C20436g c20436g;
        C1529G c1529g;
        int i10;
        int i11;
        boolean z6;
        boolean z10;
        boolean z11;
        int i12;
        float f10;
        long j10;
        float f11;
        int i13;
        char c9 = 4;
        char c10 = 3;
        AbstractC20800b.m21321i(this.f64709b);
        int i14 = c20811m.f66093b;
        int i15 = c20811m.f66094c;
        byte[] bArr = c20811m.f66092a;
        this.f64715h += (long) c20811m.m21346a();
        this.f64709b.mo4970c(c20811m.m21346a(), c20811m);
        while (true) {
            int iM21585b = AbstractC21121g.m21585b(bArr, i14, i15, this.f64713f);
            c20436g = this.f64714g;
            c1529g = this.f64712e;
            if (iM21585b == i15) {
                break;
            }
            int i16 = iM21585b + 3;
            int i17 = c20811m.f66092a[i16] & 255;
            int i18 = iM21585b - i14;
            if (this.f64717j) {
                i10 = i15;
                i11 = i16;
                i14 = i14;
            } else {
                if (i18 > 0) {
                    c20436g.m21096a(bArr, i14, iM21585b);
                }
                int i19 = i18 < 0 ? -i18 : 0;
                if (c20436g.f64703a) {
                    int i20 = c20436g.f64704b - i19;
                    c20436g.f64704b = i20;
                    if (c20436g.f64705c == 0 && i17 == 181) {
                        c20436g.f64705c = i20;
                        i10 = i15;
                        i11 = i16;
                        i14 = i14;
                    } else {
                        c20436g.f64703a = false;
                        String str = this.f64708a;
                        str.getClass();
                        byte[] bArrCopyOf = Arrays.copyOf(c20436g.f64706d, c20436g.f64704b);
                        int i21 = bArrCopyOf[c9] & 255;
                        byte b = bArrCopyOf[5];
                        i11 = i16;
                        i10 = i15;
                        int i22 = ((b & 255) >> 4) | (i21 << 4);
                        int i23 = ((b & 15) << 8) | (bArrCopyOf[6] & 255);
                        int i24 = (bArrCopyOf[7] & 240) >> 4;
                        if (i24 != 2) {
                            if (i24 == 3) {
                                f11 = i23 * 16;
                                i13 = i22 * 9;
                            } else if (i24 != 4) {
                                f10 = 1.0f;
                            } else {
                                f11 = i23 * 121;
                                i13 = i22 * 100;
                            }
                            f10 = f11 / i13;
                        } else {
                            f10 = (i23 * 4) / (i22 * 3);
                        }
                        C19787n c19787n = new C19787n();
                        c19787n.f62703a = str;
                        c19787n.f62714l = AbstractC19754D.m20711i("video/mpeg2");
                        c19787n.f62720r = i22;
                        c19787n.f62721s = i23;
                        c19787n.f62724v = f10;
                        c19787n.f62717o = Collections.singletonList(bArrCopyOf);
                        C19788o c19788o = new C19788o(c19787n);
                        int i25 = (bArrCopyOf[7] & 15) - 1;
                        if (i25 < 0 || i25 >= 8) {
                            i14 = i14;
                            j10 = 0;
                        } else {
                            double d10 = f64707q[i25];
                            byte b10 = bArrCopyOf[c20436g.f64705c + 9];
                            int i26 = (b10 & 96) >> 5;
                            int i27 = b10 & 31;
                            if (i26 != i27) {
                                d10 *= (((double) i26) + 1.0d) / ((double) (i27 + 1));
                            }
                            j10 = (long) (1000000.0d / d10);
                        }
                        Pair pairCreate = Pair.create(c19788o, Long.valueOf(j10));
                        this.f64709b.mo4971d((C19788o) pairCreate.first);
                        this.f64718k = ((Long) pairCreate.second).longValue();
                        this.f64717j = true;
                    }
                } else {
                    i10 = i15;
                    i11 = i16;
                    i14 = i14;
                    if (i17 == 179) {
                        c20436g.f64703a = true;
                    }
                }
                c20436g.m21096a(C20436g.f64702e, 0, 3);
            }
            if (c1529g == null) {
                z6 = true;
            } else {
                if (i18 > 0) {
                    c1529g.m2258a(bArr, i14, iM21585b);
                    i12 = 0;
                } else {
                    i12 = -i18;
                }
                if (c1529g.m2262e(i12)) {
                    int iM21589f = AbstractC21121g.m21589f(c1529g.f4109c, (byte[]) c1529g.f4112f);
                    int i28 = AbstractC20817s.f66106a;
                    byte[] bArr2 = (byte[]) c1529g.f4112f;
                    C20811m c20811m2 = this.f64711d;
                    c20811m2.m21342D(iM21589f, bArr2);
                    this.f64710c.m20989d(this.f64721n, c20811m2);
                }
                if (i17 == 178) {
                    z6 = true;
                    if (c20811m.f66092a[iM21585b + 2] == 1) {
                        c1529g.m2265h(i17);
                    }
                } else {
                    z6 = true;
                }
            }
            if (i17 == 0 || i17 == 179) {
                int i29 = i10 - iM21585b;
                if (this.f64723p && this.f64717j) {
                    long j11 = this.f64721n;
                    if (j11 != -9223372036854775807L) {
                        this.f64709b.mo4968a(j11, this.f64722o ? 1 : 0, ((int) (this.f64715h - this.f64720m)) - i29, i29, null);
                    }
                }
                if (!this.f64716i || this.f64723p) {
                    this.f64720m = this.f64715h - ((long) i29);
                    long j12 = this.f64719l;
                    if (j12 == -9223372036854775807L) {
                        long j13 = this.f64721n;
                        j12 = j13 != -9223372036854775807L ? j13 + this.f64718k : -9223372036854775807L;
                    }
                    this.f64721n = j12;
                    z10 = false;
                    this.f64722o = false;
                    this.f64719l = -9223372036854775807L;
                    z11 = true;
                    this.f64716i = true;
                } else {
                    z10 = false;
                    z11 = true;
                }
                this.f64723p = i17 == 0 ? z11 : z10;
            } else if (i17 == 184) {
                this.f64722o = z6;
            }
            i15 = i10;
            i14 = i11;
            c9 = 4;
            c10 = 3;
        }
        if (!this.f64717j) {
            c20436g.m21096a(bArr, i14, i15);
        }
        if (c1529g != null) {
            c1529g.m2258a(bArr, i14, i15);
        }
    }

    @Override // p1055v4.InterfaceC20435f
    /* JADX INFO: renamed from: c */
    public final void mo21089c() {
        AbstractC21121g.m21584a(this.f64713f);
        C20436g c20436g = this.f64714g;
        c20436g.f64703a = false;
        c20436g.f64704b = 0;
        c20436g.f64705c = 0;
        C1529G c1529g = this.f64712e;
        if (c1529g != null) {
            c1529g.m2264g();
        }
        this.f64715h = 0L;
        this.f64716i = false;
        this.f64719l = -9223372036854775807L;
        this.f64721n = -9223372036854775807L;
    }

    @Override // p1055v4.InterfaceC20435f
    /* JADX INFO: renamed from: d */
    public final void mo21090d(InterfaceC6335q interfaceC6335q, C13458b c13458b) {
        c13458b.m14981c();
        c13458b.m14986h();
        this.f64708a = (String) c13458b.f42596e;
        c13458b.m14986h();
        this.f64709b = interfaceC6335q.mo3044D(c13458b.f42594c, 2);
        C20168n c20168n = this.f64710c;
        if (c20168n != null) {
            c20168n.m20990e(interfaceC6335q, c13458b);
        }
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
        AbstractC20800b.m21321i(this.f64709b);
        if (z6) {
            boolean z10 = this.f64722o;
            this.f64709b.mo4968a(this.f64721n, z10 ? 1 : 0, (int) (this.f64715h - this.f64720m), 0, null);
        }
    }

    @Override // p1055v4.InterfaceC20435f
    /* JADX INFO: renamed from: f */
    public final void mo21092f(int i10, long j10) {
        this.f64719l = j10;
    }
}
