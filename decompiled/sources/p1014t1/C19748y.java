package p1014t1;

import p003A1.InterfaceC0161D1;
import p025An.AbstractC0575H;
import p025An.C0564B0;
import p025An.C0624m;
import p049Bm.InterfaceC1439n;
import p1140z1.AbstractC21690f;
import p228J.AbstractC3794B0;
import p492U1.InterfaceC7537b;
import p523V9.AbstractC8112i6;
import p523V9.AbstractC8154o0;
import p571X9.AbstractC9233X;
import p759g1.C13803e;
import p972qm.C18777j;
import p972qm.InterfaceC18770c;
import p972qm.InterfaceC18776i;
import p996rm.EnumC19250a;
import sm.AbstractC19685a;

/* JADX INFO: renamed from: t1.y */
/* JADX INFO: loaded from: classes.dex */
public final class C19748y implements InterfaceC7537b, InterfaceC18770c {

    /* JADX INFO: renamed from: Y */
    public final C0624m f62523Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C19723A f62524Z;

    /* JADX INFO: renamed from: o0 */
    public C0624m f62525o0;

    /* JADX INFO: renamed from: p0 */
    public EnumC19730g f62526p0 = EnumC19730g.f62466Z;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ C19723A f62527q0;

    public C19748y(C19723A c19723a, C0624m c0624m) {
        this.f62527q0 = c19723a;
        this.f62523Y = c0624m;
        this.f62524Z = c19723a;
    }

    @Override // p492U1.InterfaceC7537b
    /* JADX INFO: renamed from: F */
    public final long mo7859F(int i10) {
        return this.f62524Z.mo7859F(i10);
    }

    @Override // p492U1.InterfaceC7537b
    /* JADX INFO: renamed from: J */
    public final long mo7860J(float f10) {
        return this.f62524Z.mo7860J(f10);
    }

    @Override // p492U1.InterfaceC7537b
    /* JADX INFO: renamed from: O */
    public final float mo7861O(int i10) {
        return this.f62524Z.mo7861O(i10);
    }

    @Override // p492U1.InterfaceC7537b
    /* JADX INFO: renamed from: P */
    public final float mo7862P(float f10) {
        return f10 / this.f62524Z.getDensity();
    }

    @Override // p492U1.InterfaceC7537b
    /* JADX INFO: renamed from: X */
    public final float mo7863X() {
        return this.f62524Z.mo7863X();
    }

    /* JADX INFO: renamed from: a */
    public final Object m20695a(EnumC19730g enumC19730g, AbstractC19685a abstractC19685a) {
        C0624m c0624m = new C0624m(1, AbstractC8154o0.m8714e(abstractC19685a));
        c0624m.m1262r();
        this.f62526p0 = enumC19730g;
        this.f62525o0 = c0624m;
        Object objM1261q = c0624m.m1261q();
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        return objM1261q;
    }

    @Override // p492U1.InterfaceC7537b
    /* JADX INFO: renamed from: b0 */
    public final float mo7864b0(float f10) {
        return this.f62524Z.getDensity() * f10;
    }

    /* JADX INFO: renamed from: c */
    public final long m20696c() {
        C19723A c19723a = this.f62527q0;
        c19723a.getClass();
        long jM4489n = AbstractC3794B0.m4489n(AbstractC21690f.m22217v(c19723a).f68635F0.mo501d(), c19723a);
        long j10 = c19723a.f62444I0;
        return AbstractC8112i6.m8603a(Math.max(0.0f, C13803e.m15333e(jM4489n) - ((int) (j10 >> 32))) / 2.0f, Math.max(0.0f, C13803e.m15331c(jM4489n) - ((int) (j10 & 4294967295L))) / 2.0f);
    }

    /* JADX INFO: renamed from: d */
    public final InterfaceC0161D1 m20697d() {
        C19723A c19723a = this.f62527q0;
        c19723a.getClass();
        return AbstractC21690f.m22217v(c19723a).f68635F0;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [long] */
    /* JADX WARN: Type inference failed for: r7v1, types: [An.n0] */
    /* JADX WARN: Type inference failed for: r7v4, types: [An.n0] */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r9v0, types: [Bm.n] */
    /* JADX INFO: renamed from: e */
    public final Object m20698e(long j10, InterfaceC1439n interfaceC1439n, AbstractC19685a abstractC19685a) {
        C19745v c19745v;
        C0624m c0624m;
        if (abstractC19685a instanceof C19745v) {
            c19745v = (C19745v) abstractC19685a;
            int i10 = c19745v.f62516p0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c19745v.f62516p0 = i10 - Integer.MIN_VALUE;
            } else {
                c19745v = new C19745v(this, abstractC19685a);
            }
        } else {
            c19745v = new C19745v(this, abstractC19685a);
        }
        Object objInvoke = c19745v.f62514Z;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c19745v.f62516p0;
        try {
            if (i11 == 0) {
                AbstractC9233X.m9807c(objInvoke);
                if (j10 <= 0 && (c0624m = this.f62525o0) != null) {
                    c0624m.resumeWith(AbstractC9233X.m9806b(new C19731h(j10)));
                }
                C0564B0 c0564b0M1156D = AbstractC0575H.m1156D(this.f62527q0.m10935y0(), null, null, new C19746w(j10, this, null), 3);
                c19745v.f62513Y = c0564b0M1156D;
                c19745v.f62516p0 = 1;
                objInvoke = interfaceC1439n.invoke(this, c19745v);
                j10 = c0564b0M1156D;
                if (objInvoke == enumC19250a) {
                    return enumC19250a;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C0564B0 c0564b0 = c19745v.f62513Y;
                AbstractC9233X.m9807c(objInvoke);
                j10 = c0564b0;
            }
            j10.mo1275e(C19725b.f62447Y);
            return objInvoke;
        } catch (Throwable th2) {
            j10.mo1275e(C19725b.f62447Y);
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: f */
    public final Object m20699f(long j10, InterfaceC1439n interfaceC1439n, AbstractC19685a abstractC19685a) {
        C19747x c19747x;
        if (abstractC19685a instanceof C19747x) {
            c19747x = (C19747x) abstractC19685a;
            int i10 = c19747x.f62522o0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c19747x.f62522o0 = i10 - Integer.MIN_VALUE;
            } else {
                c19747x = new C19747x(this, abstractC19685a);
            }
        } else {
            c19747x = new C19747x(this, abstractC19685a);
        }
        Object objM20698e = c19747x.f62520Y;
        Object obj = EnumC19250a.f61036Y;
        int i11 = c19747x.f62522o0;
        try {
            if (i11 == 0) {
                AbstractC9233X.m9807c(objM20698e);
                c19747x.f62522o0 = 1;
                objM20698e = m20698e(j10, interfaceC1439n, c19747x);
                if (objM20698e == obj) {
                    return obj;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9233X.m9807c(objM20698e);
            }
            return objM20698e;
        } catch (C19731h unused) {
            return null;
        }
    }

    @Override // p972qm.InterfaceC18770c
    public final InterfaceC18776i getContext() {
        return C18777j.f59682Y;
    }

    @Override // p492U1.InterfaceC7537b
    public final float getDensity() {
        return this.f62524Z.getDensity();
    }

    @Override // p492U1.InterfaceC7537b
    /* JADX INFO: renamed from: i0 */
    public final int mo7865i0(long j10) {
        return this.f62524Z.mo7865i0(j10);
    }

    @Override // p492U1.InterfaceC7537b
    /* JADX INFO: renamed from: k0 */
    public final int mo7866k0(float f10) {
        C19723A c19723a = this.f62524Z;
        c19723a.getClass();
        return AbstractC3794B0.m4485j(c19723a, f10);
    }

    @Override // p492U1.InterfaceC7537b
    /* JADX INFO: renamed from: r0 */
    public final long mo7867r0(long j10) {
        C19723A c19723a = this.f62524Z;
        c19723a.getClass();
        return AbstractC3794B0.m4489n(j10, c19723a);
    }

    @Override // p972qm.InterfaceC18770c
    public final void resumeWith(Object obj) {
        C19723A c19723a = this.f62527q0;
        synchronized (c19723a.f62441F0) {
            c19723a.f62441F0.m7110o(this);
        }
        this.f62523Y.resumeWith(obj);
    }

    @Override // p492U1.InterfaceC7537b
    /* JADX INFO: renamed from: s */
    public final long mo7868s(long j10) {
        C19723A c19723a = this.f62524Z;
        c19723a.getClass();
        return AbstractC3794B0.m4487l(j10, c19723a);
    }

    @Override // p492U1.InterfaceC7537b
    /* JADX INFO: renamed from: t0 */
    public final float mo7869t0(long j10) {
        C19723A c19723a = this.f62524Z;
        c19723a.getClass();
        return AbstractC3794B0.m4488m(j10, c19723a);
    }

    @Override // p492U1.InterfaceC7537b
    /* JADX INFO: renamed from: w */
    public final float mo7870w(long j10) {
        C19723A c19723a = this.f62524Z;
        c19723a.getClass();
        return AbstractC3794B0.m4486k(j10, c19723a);
    }
}
