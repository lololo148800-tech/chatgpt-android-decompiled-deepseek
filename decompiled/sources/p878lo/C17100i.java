package p878lo;

import android.view.KeyEvent;
import kotlin.jvm.internal.AbstractC16544l;
import p025An.AbstractC0575H;
import p025An.C0644w;
import p1014t1.AbstractC19736m;
import p1014t1.C19729f;
import p1014t1.C19738o;
import p1014t1.EnumC19730g;
import p1140z1.InterfaceC21697i0;
import p477Tb.AbstractC7294a;
import p479Td.AbstractC7360k;
import p482Tg.C7443a0;
import p571X9.AbstractC9400y4;
import p635a1.AbstractC10458p;
import p722e8.C13298H;
import p759g1.C13800b;
import p858ko.C16482A;
import p858ko.C16484C;
import p858ko.C16504g;
import p858ko.C16505h;
import p858ko.C16507j;
import p858ko.C16510m;
import p858ko.EnumC16506i;
import p858ko.EnumC16508k;
import p858ko.InterfaceC16509l;
import p978r1.AbstractC18857c;
import p978r1.C18855a;
import p978r1.InterfaceC18858d;

/* JADX INFO: renamed from: lo.i */
/* JADX INFO: loaded from: classes2.dex */
public final class C17100i extends AbstractC10458p implements InterfaceC18858d, InterfaceC21697i0 {

    /* JADX INFO: renamed from: A0 */
    public C16510m f54647A0;

    /* JADX INFO: renamed from: B0 */
    public final C13298H f54648B0;

    /* JADX INFO: renamed from: C0 */
    public final C7443a0 f54649C0;

    /* JADX INFO: renamed from: D0 */
    public final C16482A f54650D0;

    /* JADX INFO: renamed from: z0 */
    public C16484C f54651z0;

    public C17100i(C16484C c16484c, C16510m spec) {
        AbstractC16544l.m18094g(spec, "spec");
        this.f54651z0 = c16484c;
        this.f54647A0 = spec;
        this.f54648B0 = new C13298H(this, 28);
        this.f54649C0 = new C7443a0(this, 18);
        this.f54650D0 = new C16482A(this, 9);
    }

    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.Object, java.util.List] */
    @Override // p1140z1.InterfaceC21697i0
    /* JADX INFO: renamed from: C */
    public final void mo15560C(C19729f pointerEvent, EnumC19730g enumC19730g, long j10) {
        long j11;
        AbstractC16544l.m18094g(pointerEvent, "pointerEvent");
        if (AbstractC19736m.m20682d(pointerEvent.f62464e, 6) && enumC19730g == EnumC19730g.f62466Z) {
            ?? r12 = pointerEvent.f62460a;
            int size = r12.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (!((C19738o) r12.get(i10)).m20692b()) {
                    this.f54647A0.f51210b.getClass();
                    C16507j c16507j = null;
                    if ((pointerEvent.f62463d & 2) != 0) {
                        long jM15311l = 0;
                        C13800b c13800b = new C13800b(0L);
                        int size2 = r12.size();
                        int i11 = 0;
                        while (true) {
                            j11 = c13800b.f43584a;
                            if (i11 >= size2) {
                                break;
                            }
                            c13800b = new C13800b(C13800b.m15311l(j11, ((C19738o) r12.get(i11)).f62487j));
                            i11++;
                        }
                        float fM15307h = C13800b.m15307h(j11);
                        if (fM15307h != 0.0f) {
                            EnumC16508k enumC16508k = fM15307h < 0.0f ? EnumC16508k.f51205Y : EnumC16508k.f51206Z;
                            if (!AbstractC19736m.m20682d(pointerEvent.f62464e, 6)) {
                                throw new IllegalStateException("Check failed.");
                            }
                            int size3 = r12.size();
                            float f10 = 0.0f;
                            for (int i12 = 0; i12 < size3; i12++) {
                                jM15311l = C13800b.m15311l(jM15311l, ((C19738o) r12.get(i12)).f62480c);
                                f10 += 1.0f;
                            }
                            c16507j = new C16507j(enumC16508k, Math.abs(fM15307h) * 1.2f, f10 == 0.0f ? 9205357640488583168L : C13800b.m15302c(f10, jM15311l));
                        }
                    }
                    if (c16507j != null) {
                        int size4 = r12.size();
                        for (int i13 = 0; i13 < size4; i13++) {
                            ((C19738o) r12.get(i13)).m20691a();
                        }
                        m18893K0(c16507j);
                        return;
                    }
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: K0 */
    public final void m18893K0(InterfaceC16509l interfaceC16509l) {
        long jM9978a;
        if (interfaceC16509l instanceof C16507j) {
            C16507j c16507j = (C16507j) interfaceC16509l;
            int iOrdinal = c16507j.f51202b.ordinal();
            C7443a0 c7443a0 = this.f54649C0;
            C17100i c17100i = (C17100i) c7443a0.f23559Z;
            if (iOrdinal == 0) {
                AbstractC0575H.m1156D(c17100i.m10935y0(), null, null, new C17099h((C17100i) c7443a0.f23559Z, c16507j.f51203c, c16507j.f51204d, null), 3);
                return;
            } else {
                if (iOrdinal != 1) {
                    return;
                }
                AbstractC0575H.m1156D(c17100i.m10935y0(), null, null, new C17099h((C17100i) c7443a0.f23559Z, 1.0f / c16507j.f51203c, c16507j.f51204d, null), 3);
                return;
            }
        }
        if ((interfaceC16509l instanceof C16505h) && ((Boolean) this.f54648B0.invoke()).booleanValue()) {
            C16505h c16505h = (C16505h) interfaceC16509l;
            int iOrdinal2 = c16505h.f51195b.ordinal();
            float f10 = c16505h.f51196c;
            if (iOrdinal2 == 0) {
                jM9978a = AbstractC9400y4.m9978a(0, f10);
            } else if (iOrdinal2 == 1) {
                jM9978a = AbstractC9400y4.m9978a(0, -f10);
            } else if (iOrdinal2 == 2) {
                jM9978a = AbstractC9400y4.m9978a(f10, 0);
            } else {
                if (iOrdinal2 != 3) {
                    throw new C0644w();
                }
                jM9978a = AbstractC9400y4.m9978a(-f10, 0);
            }
            C17100i c17100i2 = (C17100i) this.f54650D0.f51128Z;
            AbstractC0575H.m1156D(c17100i2.m10935y0(), null, null, new C17098g(c17100i2, jM9978a, null), 3);
        }
    }

    @Override // p1140z1.InterfaceC21697i0
    /* JADX INFO: renamed from: N */
    public final /* synthetic */ void mo15563N() {
    }

    @Override // p1140z1.InterfaceC21697i0
    /* JADX INFO: renamed from: T */
    public final void mo15564T() {
    }

    @Override // p978r1.InterfaceC18858d
    /* JADX INFO: renamed from: l */
    public final boolean mo15576l(KeyEvent event) {
        AbstractC16544l.m18094g(event, "event");
        return false;
    }

    @Override // p1140z1.InterfaceC21697i0
    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ boolean mo15565q0() {
        return false;
    }

    @Override // p1140z1.InterfaceC21697i0
    /* JADX INFO: renamed from: s0 */
    public final void mo15566s0() {
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00e3  */
    @Override // p978r1.InterfaceC18858d
    /* JADX INFO: renamed from: z */
    public final boolean mo15577z(KeyEvent event) {
        C16507j c16507j;
        InterfaceC16509l c16505h;
        EnumC16506i enumC16506i;
        AbstractC16544l.m18094g(event, "event");
        if (!AbstractC7294a.m7746c(AbstractC18857c.m20158e(event), 2)) {
            return false;
        }
        this.f54647A0.f51210b.getClass();
        if (C18855a.m20153a(AbstractC7360k.m7784a(event.getKeyCode()), C18855a.f60077p)) {
            c16507j = new C16507j(EnumC16508k.f51205Y, 1.2f, 9205357640488583168L);
            c16505h = c16507j;
        } else {
            if (C18855a.m20153a(AbstractC7360k.m7784a(event.getKeyCode()), C18855a.f60070i)) {
                AbstractC16544l.m18094g(EnumC17101j.f54652Y, "<this>");
                if (event.isCtrlPressed()) {
                    c16507j = new C16507j(EnumC16508k.f51205Y, 1.2f, 9205357640488583168L);
                }
                c16505h = c16507j;
            }
            if (!C18855a.m20153a(AbstractC7360k.m7784a(event.getKeyCode()), C18855a.f60078q)) {
                if (C18855a.m20153a(AbstractC7360k.m7784a(event.getKeyCode()), C18855a.f60069h)) {
                    AbstractC16544l.m18094g(EnumC17101j.f54652Y, "<this>");
                    if (event.isCtrlPressed()) {
                    }
                }
                long jM7784a = AbstractC7360k.m7784a(event.getKeyCode());
                c16505h = null;
                if (C18855a.m20153a(jM7784a, C18855a.f60064c)) {
                    enumC16506i = EnumC16506i.f51197Y;
                } else if (C18855a.m20153a(jM7784a, C18855a.f60065d)) {
                    enumC16506i = EnumC16506i.f51198Z;
                } else if (C18855a.m20153a(jM7784a, C18855a.f60066e)) {
                    enumC16506i = EnumC16506i.f51199o0;
                } else {
                    enumC16506i = C18855a.m20153a(jM7784a, C18855a.f60067f) ? EnumC16506i.f51200p0 : null;
                }
                if ((enumC16506i == null ? -1 : AbstractC17093b.f54629a[enumC16506i.ordinal()]) != -1) {
                    InterfaceC16509l.f51208a.getClass();
                    c16505h = new C16505h(enumC16506i, C16504g.f51194b * (event.isAltPressed() ? 10.0f : 1.0f));
                }
            }
            c16507j = new C16507j(EnumC16508k.f51206Z, 1.2f, 9205357640488583168L);
            c16505h = c16507j;
        }
        if (c16505h != null) {
            m18893K0(c16505h);
        }
        return c16505h != null;
    }

    @Override // p1140z1.InterfaceC21697i0
    /* JADX INFO: renamed from: D */
    public final void mo15561D() {
    }
}
