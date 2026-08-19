package p1014t1;

import java.util.ArrayList;
import mm.C17296C;
import p025An.AbstractC0575H;
import p025An.C0564B0;
import p025An.C0624m;
import p025An.EnumC0573G;
import p049Bm.InterfaceC1439n;
import p1140z1.AbstractC21690f;
import p1140z1.InterfaceC21697i0;
import p228J.AbstractC3794B0;
import p349O0.C5972Q;
import p392Q0.C6546d;
import p492U1.InterfaceC7537b;
import p523V9.AbstractC8154o0;
import p635a1.AbstractC10458p;
import p858ko.C16482A;
import p972qm.C18778k;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;

/* JADX INFO: renamed from: t1.A */
/* JADX INFO: loaded from: classes.dex */
public final class C19723A extends AbstractC10458p implements InterfaceC7537b, InterfaceC21697i0 {

    /* JADX INFO: renamed from: A0 */
    public Object f62436A0;

    /* JADX INFO: renamed from: B0 */
    public Object[] f62437B0;

    /* JADX INFO: renamed from: C0 */
    public InterfaceC1439n f62438C0;

    /* JADX INFO: renamed from: D0 */
    public C0564B0 f62439D0;

    /* JADX INFO: renamed from: H0 */
    public C19729f f62443H0;

    /* JADX INFO: renamed from: z0 */
    public Object f62445z0;

    /* JADX INFO: renamed from: E0 */
    public C19729f f62440E0 = AbstractC19744u.f62512a;

    /* JADX INFO: renamed from: F0 */
    public final C6546d f62441F0 = new C6546d(new C19748y[16]);

    /* JADX INFO: renamed from: G0 */
    public final C6546d f62442G0 = new C6546d(new C19748y[16]);

    /* JADX INFO: renamed from: I0 */
    public long f62444I0 = 0;

    public C19723A(Object obj, Object obj2, Object[] objArr, InterfaceC1439n interfaceC1439n) {
        this.f62445z0 = obj;
        this.f62436A0 = obj2;
        this.f62437B0 = objArr;
        this.f62438C0 = interfaceC1439n;
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.util.List] */
    @Override // p1140z1.InterfaceC21697i0
    /* JADX INFO: renamed from: C */
    public final void mo15560C(C19729f c19729f, EnumC19730g enumC19730g, long j10) {
        this.f62444I0 = j10;
        if (enumC19730g == EnumC19730g.f62465Y) {
            this.f62440E0 = c19729f;
        }
        if (this.f62439D0 == null) {
            this.f62439D0 = AbstractC0575H.m1156D(m10935y0(), null, EnumC0573G.f1793p0, new C19749z(this, null), 1);
        }
        m20668L0(c19729f, enumC19730g);
        ?? r6 = c19729f.f62460a;
        int size = r6.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!AbstractC19736m.m20681c((C19738o) r6.get(i10))) {
                this.f62443H0 = c19729f;
            }
        }
        c19729f = null;
        this.f62443H0 = c19729f;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
    @Override // p1140z1.InterfaceC21697i0
    /* JADX INFO: renamed from: D */
    public final void mo15561D() {
        C19729f c19729f = this.f62443H0;
        if (c19729f == null) {
            return;
        }
        ?? r6 = c19729f.f62460a;
        int size = r6.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (((C19738o) r6.get(i10)).f62481d) {
                ArrayList arrayList = new ArrayList(r6.size());
                int size2 = r6.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    C19738o c19738o = (C19738o) r6.get(i11);
                    long j10 = c19738o.f62478a;
                    boolean z6 = c19738o.f62481d;
                    long j11 = c19738o.f62479b;
                    long j12 = c19738o.f62480c;
                    arrayList.add(new C19738o(j10, j11, j12, false, c19738o.f62482e, j11, j12, z6, z6, 1, 0L));
                }
                C19729f c19729f2 = new C19729f(arrayList, null);
                this.f62440E0 = c19729f2;
                m20668L0(c19729f2, EnumC19730g.f62465Y);
                m20668L0(c19729f2, EnumC19730g.f62466Z);
                m20668L0(c19729f2, EnumC19730g.f62467o0);
                this.f62443H0 = null;
                return;
            }
        }
    }

    @Override // p635a1.AbstractC10458p
    /* JADX INFO: renamed from: D0 */
    public final void mo4226D0() {
        m20669M0();
    }

    @Override // p492U1.InterfaceC7537b
    /* JADX INFO: renamed from: F */
    public final long mo7859F(int i10) {
        return m20670N0(mo7861O(i10));
    }

    @Override // p492U1.InterfaceC7537b
    /* JADX INFO: renamed from: J */
    public final long mo7860J(float f10) {
        return m20670N0(mo7862P(f10));
    }

    /* JADX INFO: renamed from: K0 */
    public final Object m20667K0(InterfaceC1439n interfaceC1439n, InterfaceC18770c interfaceC18770c) {
        C0624m c0624m = new C0624m(1, AbstractC8154o0.m8714e(interfaceC18770c));
        c0624m.m1262r();
        C19748y c19748y = new C19748y(this, c0624m);
        synchronized (this.f62441F0) {
            this.f62441F0.m7099c(c19748y);
            new C18778k(AbstractC8154o0.m8714e(AbstractC8154o0.m8710a(interfaceC1439n, c19748y, c19748y)), EnumC19250a.f61036Y).resumeWith(C17296C.f55119a);
        }
        c0624m.m1264u(new C16482A(c19748y, 24));
        return c0624m.m1261q();
    }

    /* JADX WARN: Code duplicated, block: B:26:0x003c A[Catch: all -> 0x003a, TryCatch #1 {all -> 0x003a, blocks: (B:6:0x000d, B:13:0x001b, B:15:0x0021, B:16:0x0024, B:18:0x002c, B:20:0x0030, B:21:0x0035, B:26:0x003c, B:28:0x0042, B:29:0x0045, B:31:0x004d, B:33:0x0051), top: B:45:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:28:0x0042 A[Catch: all -> 0x003a, TryCatch #1 {all -> 0x003a, blocks: (B:6:0x000d, B:13:0x001b, B:15:0x0021, B:16:0x0024, B:18:0x002c, B:20:0x0030, B:21:0x0035, B:26:0x003c, B:28:0x0042, B:29:0x0045, B:31:0x004d, B:33:0x0051), top: B:45:0x000d }] */
    /* JADX INFO: renamed from: L0 */
    public final void m20668L0(C19729f c19729f, EnumC19730g enumC19730g) {
        C6546d c6546d;
        int i10;
        Object[] objArr;
        int i11;
        C19748y c19748y;
        C0624m c0624m;
        C0624m c0624m2;
        synchronized (this.f62441F0) {
            C6546d c6546d2 = this.f62442G0;
            c6546d2.m7100d(c6546d2.f21184o0, this.f62441F0);
        }
        try {
            int iOrdinal = enumC19730g.ordinal();
            if (iOrdinal == 0) {
                c6546d = this.f62442G0;
                i10 = c6546d.f21184o0;
                if (i10 > 0) {
                    objArr = c6546d.f21182Y;
                    i11 = 0;
                    do {
                        c19748y = (C19748y) objArr[i11];
                        if (enumC19730g == c19748y.f62526p0 && (c0624m = c19748y.f62525o0) != null) {
                            c19748y.f62525o0 = null;
                            c0624m.resumeWith(c19729f);
                        }
                        i11++;
                    } while (i11 < i10);
                }
            } else if (iOrdinal == 1) {
                C6546d c6546d3 = this.f62442G0;
                int i12 = c6546d3.f21184o0;
                if (i12 > 0) {
                    int i13 = i12 - 1;
                    Object[] objArr2 = c6546d3.f21182Y;
                    do {
                        C19748y c19748y2 = (C19748y) objArr2[i13];
                        if (enumC19730g == c19748y2.f62526p0 && (c0624m2 = c19748y2.f62525o0) != null) {
                            c19748y2.f62525o0 = null;
                            c0624m2.resumeWith(c19729f);
                        }
                        i13--;
                    } while (i13 >= 0);
                }
            } else if (iOrdinal == 2) {
                c6546d = this.f62442G0;
                i10 = c6546d.f21184o0;
                if (i10 > 0) {
                    objArr = c6546d.f21182Y;
                    i11 = 0;
                    do {
                        c19748y = (C19748y) objArr[i11];
                        if (enumC19730g == c19748y.f62526p0) {
                            c19748y.f62525o0 = null;
                            c0624m.resumeWith(c19729f);
                        }
                        i11++;
                    } while (i11 < i10);
                }
            }
        } finally {
            this.f62442G0.m7104i();
        }
    }

    /* JADX INFO: renamed from: M0 */
    public final void m20669M0() {
        C0564B0 c0564b0 = this.f62439D0;
        if (c0564b0 != null) {
            c0564b0.mo1311w(new C5972Q("Pointer input was reset", 6));
            this.f62439D0 = null;
        }
    }

    @Override // p1140z1.InterfaceC21697i0
    /* JADX INFO: renamed from: N */
    public final /* synthetic */ void mo15563N() {
    }

    /* JADX INFO: renamed from: N0 */
    public final /* synthetic */ long m20670N0(float f10) {
        return AbstractC3794B0.m4490o(this, f10);
    }

    @Override // p492U1.InterfaceC7537b
    /* JADX INFO: renamed from: O */
    public final float mo7861O(int i10) {
        return i10 / getDensity();
    }

    @Override // p492U1.InterfaceC7537b
    /* JADX INFO: renamed from: P */
    public final float mo7862P(float f10) {
        return f10 / getDensity();
    }

    @Override // p1140z1.InterfaceC21697i0
    /* JADX INFO: renamed from: T */
    public final void mo15564T() {
        m20669M0();
    }

    @Override // p492U1.InterfaceC7537b
    /* JADX INFO: renamed from: X */
    public final float mo7863X() {
        return AbstractC21690f.m22217v(this).f68633D0.mo7863X();
    }

    @Override // p492U1.InterfaceC7537b
    /* JADX INFO: renamed from: b0 */
    public final float mo7864b0(float f10) {
        return getDensity() * f10;
    }

    @Override // p492U1.InterfaceC7537b
    public final float getDensity() {
        return AbstractC21690f.m22217v(this).f68633D0.getDensity();
    }

    @Override // p492U1.InterfaceC7537b
    /* JADX INFO: renamed from: i0 */
    public final int mo7865i0(long j10) {
        return Math.round(mo7869t0(j10));
    }

    @Override // p492U1.InterfaceC7537b
    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ int mo7866k0(float f10) {
        return AbstractC3794B0.m4485j(this, f10);
    }

    @Override // p1140z1.InterfaceC21697i0
    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ boolean mo15565q0() {
        return false;
    }

    @Override // p492U1.InterfaceC7537b
    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ long mo7867r0(long j10) {
        return AbstractC3794B0.m4489n(j10, this);
    }

    @Override // p492U1.InterfaceC7537b
    /* JADX INFO: renamed from: s */
    public final /* synthetic */ long mo7868s(long j10) {
        return AbstractC3794B0.m4487l(j10, this);
    }

    @Override // p1140z1.InterfaceC21697i0
    /* JADX INFO: renamed from: s0 */
    public final void mo15566s0() {
        m20669M0();
    }

    @Override // p492U1.InterfaceC7537b
    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ float mo7869t0(long j10) {
        return AbstractC3794B0.m4488m(j10, this);
    }

    @Override // p492U1.InterfaceC7537b
    /* JADX INFO: renamed from: w */
    public final /* synthetic */ float mo7870w(long j10) {
        return AbstractC3794B0.m4486k(j10, this);
    }
}
