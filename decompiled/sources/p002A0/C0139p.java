package p002A0;

import p080D0.C1826r;
import p080D0.C1828s;
import p1071w0.EnumC20729S;
import p1071w0.InterfaceC20772r0;
import p1116y0.C21353b;
import p1139z0.C21574A0;
import p1139z0.C21582E0;
import p204I1.C3581L;
import p523V9.AbstractC8088f6;
import p544W9.AbstractC8676n;
import p759g1.C13800b;
import p823j3.C16084f;
import p937p1.C18286b;
import p937p1.InterfaceC18285a;

/* JADX INFO: renamed from: A0.p */
/* JADX INFO: loaded from: classes.dex */
public final class C0139p implements InterfaceC20772r0 {

    /* JADX INFO: renamed from: a */
    public final C16084f f579a;

    /* JADX INFO: renamed from: b */
    public int f580b = -1;

    /* JADX INFO: renamed from: c */
    public long f581c = 9205357640488583168L;

    /* JADX INFO: renamed from: d */
    public long f582d = 0;

    /* JADX INFO: renamed from: e */
    public EnumC20729S f583e = EnumC20729S.f65726o0;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C0120T f584f;

    public C0139p(C0120T c0120t, C16084f c16084f) {
        this.f584f = c0120t;
        this.f579a = c16084f;
    }

    @Override // p1071w0.InterfaceC20772r0
    /* JADX INFO: renamed from: a */
    public final void mo464a() {
        m469f();
    }

    @Override // p1071w0.InterfaceC20772r0
    /* JADX INFO: renamed from: b */
    public final void mo465b(long j10) {
        C0120T c0120t = this.f584f;
        if (c0120t.f502d) {
            c0120t.m420y(this.f583e, j10);
            c0120t.m418w(false);
            c0120t.f514p.setValue(EnumC0137n.f572Z);
            this.f581c = j10;
            this.f582d = 0L;
            c0120t.f518t = -1;
            C21574A0 c21574a0 = c0120t.f500b;
            boolean zM21852e = c21574a0.m21852e(j10);
            C21582E0 c21582e0 = c0120t.f499a;
            if (zM21852e) {
                if (c21582e0.m21881c().f67817Y.length() == 0) {
                    return;
                }
                int iM21850c = c21574a0.m21850c(j10, true);
                long jM421z = c0120t.m421z(new C21353b(c0120t.f499a.m21881c(), C3581L.f10906b, (C3581L) null, 12), iM21850c, iM21850c, false, C1828s.f5268f, false, false);
                c21582e0.m21884h(jM421z);
                c0120t.m419x(EnumC0123W.f528o0);
                this.f580b = (int) (jM421z >> 32);
                return;
            }
            int iM21850c2 = c21574a0.m21850c(j10, true);
            InterfaceC18285a interfaceC18285a = c0120t.f506h;
            if (interfaceC18285a != null) {
                ((C18286b) interfaceC18285a).m19828a(9);
            }
            c21582e0.getClass();
            c21582e0.m21884h(AbstractC8676n.m9365b(iM21850c2, iM21850c2));
            c0120t.m418w(true);
            c0120t.m419x(EnumC0123W.f527Z);
        }
    }

    @Override // p1071w0.InterfaceC20772r0
    /* JADX INFO: renamed from: e */
    public final void mo468e(long j10) {
        int iIntValue;
        int iM21850c;
        long j11;
        C0120T c0120t = this.f584f;
        if (c0120t.f502d) {
            C21582E0 c21582e0 = c0120t.f499a;
            if (c21582e0.m21881c().f67817Y.length() == 0) {
                return;
            }
            long jM15311l = C13800b.m15311l(this.f582d, j10);
            this.f582d = jM15311l;
            long jM15311l2 = C13800b.m15311l(this.f581c, jM15311l);
            int i10 = this.f580b;
            C1826r c1826r = C1828s.f5268f;
            C21574A0 c21574a0 = c0120t.f500b;
            if (i10 >= 0 || c21574a0.m21852e(jM15311l2)) {
                int i11 = this.f580b;
                Integer numValueOf = Integer.valueOf(i11);
                if (i11 < 0) {
                    numValueOf = null;
                }
                iIntValue = numValueOf != null ? numValueOf.intValue() : c21574a0.m21850c(this.f581c, false);
                iM21850c = c21574a0.m21850c(jM15311l2, false);
                if (this.f580b < 0 && iIntValue == iM21850c) {
                    return;
                } else {
                    c0120t.m419x(EnumC0123W.f528o0);
                }
            } else {
                iIntValue = c21574a0.m21850c(this.f581c, true);
                iM21850c = c21574a0.m21850c(jM15311l2, true);
                if (iIntValue == iM21850c) {
                    c1826r = C1828s.f5266d;
                }
            }
            C1826r c1826r2 = c1826r;
            int i12 = iIntValue;
            int i13 = iM21850c;
            long j12 = c21582e0.m21881c().f67818Z;
            long jM421z = c0120t.m421z(c0120t.f499a.m21881c(), i12, i13, false, c1826r2, false, false);
            if (this.f580b == -1 && !C3581L.m4267c(jM421z)) {
                this.f580b = (int) (jM421z >> 32);
            }
            if (C3581L.m4271g(jM421z)) {
                jM421z = AbstractC8676n.m9365b((int) (jM421z & 4294967295L), (int) (jM421z >> 32));
            }
            if (C3581L.m4266b(jM421z, j12)) {
                j11 = jM15311l2;
            } else {
                int i14 = (int) (jM421z >> 32);
                int i15 = (int) (j12 >> 32);
                EnumC20729S enumC20729S = EnumC20729S.f65725Z;
                if (i14 != i15) {
                    j11 = jM15311l2;
                    if (((int) (jM421z & 4294967295L)) != ((int) (j12 & 4294967295L))) {
                    }
                    this.f583e = enumC20729S;
                } else {
                    j11 = jM15311l2;
                }
                EnumC20729S enumC20729S2 = EnumC20729S.f65726o0;
                if ((i14 == i15 && ((int) (jM421z & 4294967295L)) != ((int) (j12 & 4294967295L))) || (i14 + ((int) (jM421z & 4294967295L))) / 2.0f > (i15 + ((int) (4294967295L & j12))) / 2.0f) {
                    enumC20729S = enumC20729S2;
                }
                this.f583e = enumC20729S;
            }
            if (C3581L.m4267c(j12) || !C3581L.m4267c(jM421z)) {
                c21582e0.m21884h(jM421z);
            }
            c0120t.m420y(this.f583e, j11);
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m469f() {
        if (AbstractC8088f6.m8538d(this.f581c)) {
            C0120T c0120t = this.f584f;
            c0120t.m402e();
            this.f580b = -1;
            this.f581c = 9205357640488583168L;
            this.f582d = 0L;
            c0120t.f518t = -1;
            c0120t.f514p.setValue(EnumC0137n.f571Y);
            this.f579a.invoke();
        }
    }

    @Override // p1071w0.InterfaceC20772r0
    public final void onCancel() {
        m469f();
    }

    @Override // p1071w0.InterfaceC20772r0
    /* JADX INFO: renamed from: c */
    public final void mo466c() {
    }

    @Override // p1071w0.InterfaceC20772r0
    /* JADX INFO: renamed from: d */
    public final void mo467d() {
    }
}
