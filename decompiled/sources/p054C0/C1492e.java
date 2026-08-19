package p054C0;

import kotlin.jvm.internal.AbstractC16544l;
import p1071w0.AbstractC20740b0;
import p204I1.C3582M;
import p204I1.C3585a;
import p204I1.InterfaceC3603s;
import p279L1.VOxZ.sVoFrD;
import p328N1.InterfaceC5598n;
import p393Q1.C6551c;
import p492U1.EnumC7546k;
import p492U1.InterfaceC7537b;
import p523V9.AbstractC8242z0;
import p544W9.AbstractC8682o;
import p571X9.AbstractC9113C4;
import p571X9.AbstractC9160K3;
import p571X9.AbstractC9388w4;
import p909nm.C17689w;

/* JADX INFO: renamed from: C0.e */
/* JADX INFO: loaded from: classes.dex */
public final class C1492e {

    /* JADX INFO: renamed from: a */
    public String f3936a;

    /* JADX INFO: renamed from: b */
    public C3582M f3937b;

    /* JADX INFO: renamed from: c */
    public InterfaceC5598n f3938c;

    /* JADX INFO: renamed from: d */
    public int f3939d;

    /* JADX INFO: renamed from: e */
    public boolean f3940e;

    /* JADX INFO: renamed from: f */
    public int f3941f;

    /* JADX INFO: renamed from: g */
    public int f3942g;

    /* JADX INFO: renamed from: i */
    public InterfaceC7537b f3944i;

    /* JADX INFO: renamed from: j */
    public C3585a f3945j;

    /* JADX INFO: renamed from: k */
    public boolean f3946k;

    /* JADX INFO: renamed from: m */
    public C1489b f3948m;

    /* JADX INFO: renamed from: n */
    public InterfaceC3603s f3949n;

    /* JADX INFO: renamed from: o */
    public EnumC7546k f3950o;

    /* JADX INFO: renamed from: h */
    public long f3943h = AbstractC1488a.f3908a;

    /* JADX INFO: renamed from: l */
    public long f3947l = AbstractC9113C4.m9643a(0, 0);

    /* JADX INFO: renamed from: p */
    public long f3951p = AbstractC9388w4.m9966i(0, 0, 0, 0);

    /* JADX INFO: renamed from: q */
    public int f3952q = -1;

    /* JADX INFO: renamed from: r */
    public int f3953r = -1;

    public C1492e(String str, C3582M c3582m, InterfaceC5598n interfaceC5598n, int i10, boolean z6, int i11, int i12) {
        this.f3936a = str;
        this.f3937b = c3582m;
        this.f3938c = interfaceC5598n;
        this.f3939d = i10;
        this.f3940e = z6;
        this.f3941f = i11;
        this.f3942g = i12;
    }

    /* JADX INFO: renamed from: a */
    public final int m2139a(int i10, EnumC7546k enumC7546k) {
        int i11 = this.f3952q;
        int i12 = this.f3953r;
        if (i10 == i11 && i11 != -1) {
            return i12;
        }
        int iM21275p = AbstractC20740b0.m21275p(m2140b(AbstractC9388w4.m9958a(0, i10, 0, Integer.MAX_VALUE), enumC7546k).m4282b());
        this.f3952q = i10;
        this.f3953r = iM21275p;
        return iM21275p;
    }

    /* JADX INFO: renamed from: b */
    public final C3585a m2140b(long j10, EnumC7546k enumC7546k) {
        int i10;
        InterfaceC3603s interfaceC3603sM2142d = m2142d(enumC7546k);
        long jM8889b = AbstractC8242z0.m8889b(interfaceC3603sM2142d.mo3548e(), this.f3939d, j10, this.f3940e);
        boolean z6 = this.f3940e;
        int i11 = this.f3939d;
        int i12 = this.f3941f;
        if (z6 || !AbstractC9160K3.m9708a(i11, 2)) {
            if (i12 < 1) {
                i12 = 1;
            }
            i10 = i12;
        } else {
            i10 = 1;
        }
        return new C3585a((C6551c) interfaceC3603sM2142d, i10, AbstractC9160K3.m9708a(this.f3939d, 2), jM8889b);
    }

    /* JADX INFO: renamed from: c */
    public final void m2141c(InterfaceC7537b interfaceC7537b) {
        long jM2132a;
        InterfaceC7537b interfaceC7537b2 = this.f3944i;
        if (interfaceC7537b != null) {
            int i10 = AbstractC1488a.f3909b;
            jM2132a = AbstractC1488a.m2132a(interfaceC7537b.getDensity(), interfaceC7537b.mo7863X());
        } else {
            jM2132a = AbstractC1488a.f3908a;
        }
        if (interfaceC7537b2 == null) {
            this.f3944i = interfaceC7537b;
            this.f3943h = jM2132a;
            return;
        }
        if (interfaceC7537b == null || this.f3943h != jM2132a) {
            this.f3944i = interfaceC7537b;
            this.f3943h = jM2132a;
            this.f3945j = null;
            this.f3949n = null;
            this.f3950o = null;
            this.f3952q = -1;
            this.f3953r = -1;
            this.f3951p = AbstractC9388w4.m9966i(0, 0, 0, 0);
            this.f3947l = AbstractC9113C4.m9643a(0, 0);
            this.f3946k = false;
        }
    }

    /* JADX INFO: renamed from: d */
    public final InterfaceC3603s m2142d(EnumC7546k enumC7546k) {
        InterfaceC3603s c6551c = this.f3949n;
        if (c6551c == null || enumC7546k != this.f3950o || c6551c.mo3544a()) {
            this.f3950o = enumC7546k;
            String str = this.f3936a;
            C3582M c3582mM9379b = AbstractC8682o.m9379b(this.f3937b, enumC7546k);
            InterfaceC7537b interfaceC7537b = this.f3944i;
            AbstractC16544l.m18091d(interfaceC7537b);
            InterfaceC5598n interfaceC5598n = this.f3938c;
            C17689w c17689w = C17689w.f56480Y;
            c6551c = new C6551c(str, c3582mM9379b, c17689w, c17689w, interfaceC5598n, interfaceC7537b);
        }
        this.f3949n = c6551c;
        return c6551c;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ParagraphLayoutCache(paragraph=");
        sb2.append(this.f3945j != null ? sVoFrD.skuOv : "null");
        sb2.append(", lastDensity=");
        long j10 = this.f3943h;
        int i10 = AbstractC1488a.f3909b;
        sb2.append((Object) ("InlineDensity(density=" + Float.intBitsToFloat((int) (j10 >> 32)) + ", fontScale=" + Float.intBitsToFloat((int) (j10 & 4294967295L)) + ')'));
        sb2.append(')');
        return sb2.toString();
    }
}
