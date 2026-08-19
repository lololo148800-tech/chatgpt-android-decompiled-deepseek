package p1140z1;

import kotlin.jvm.internal.AbstractC16544l;
import p1095x1.AbstractC21069X;
import p1095x1.C21094o;
import p1095x1.InterfaceC21057K;
import p392Q0.C6546d;
import sk.C19662a;

/* JADX INFO: renamed from: z1.s */
/* JADX INFO: loaded from: classes.dex */
public final class C21714s extends AbstractC21669O {
    @Override // p1095x1.InterfaceC21056J
    /* JADX INFO: renamed from: G */
    public final int mo21529G(int i10) {
        C19662a c19662aM22008F = this.f68765x0.f68819x0.m22008F();
        InterfaceC21057K interfaceC21057KM20634f = c19662aM22008F.m20634f();
        C21658D c21658d = (C21658D) c19662aM22008F.f62320Y;
        return interfaceC21057KM20634f.mo1120b((AbstractC21678Y) c21658d.f68638I0.f3469d, c21658d.m22050n(), i10);
    }

    @Override // p1140z1.AbstractC21668N
    /* JADX INFO: renamed from: V */
    public final int mo22117V(C21094o c21094o) {
        C21663I c21663i = this.f68765x0.f68819x0.m22060t().f68747s;
        AbstractC16544l.m18091d(c21663i);
        boolean z6 = c21663i.f68695v0;
        C21659E c21659e = c21663i.f68683D0;
        if (!z6) {
            C21665K c21665k = c21663i.f68690K0;
            if (c21665k.f68731c == 2) {
                c21659e.f68669f = true;
                if (c21659e.f68665b) {
                    c21665k.f68736h = true;
                    c21665k.f68737i = true;
                }
            } else {
                c21659e.f68670g = true;
            }
        }
        C21714s c21714s = c21663i.mo22090f().f68893X0;
        if (c21714s != null) {
            c21714s.f68758t0 = true;
        }
        c21663i.mo22097z();
        C21714s c21714s2 = c21663i.mo22090f().f68893X0;
        if (c21714s2 != null) {
            c21714s2.f68758t0 = false;
        }
        Integer num = (Integer) c21659e.f68672i.get(c21094o);
        int iIntValue = num != null ? num.intValue() : Integer.MIN_VALUE;
        this.f68764C0.put(c21094o, Integer.valueOf(iIntValue));
        return iIntValue;
    }

    @Override // p1095x1.InterfaceC21056J
    /* JADX INFO: renamed from: b */
    public final int mo21530b(int i10) {
        C19662a c19662aM22008F = this.f68765x0.f68819x0.m22008F();
        InterfaceC21057K interfaceC21057KM20634f = c19662aM22008F.m20634f();
        C21658D c21658d = (C21658D) c19662aM22008F.f62320Y;
        return interfaceC21057KM20634f.mo1119a((AbstractC21678Y) c21658d.f68638I0.f3469d, c21658d.m22050n(), i10);
    }

    @Override // p1095x1.InterfaceC21056J
    /* JADX INFO: renamed from: l */
    public final int mo21531l(int i10) {
        C19662a c19662aM22008F = this.f68765x0.f68819x0.m22008F();
        InterfaceC21057K interfaceC21057KM20634f = c19662aM22008F.m20634f();
        C21658D c21658d = (C21658D) c19662aM22008F.f62320Y;
        return interfaceC21057KM20634f.mo1123e((AbstractC21678Y) c21658d.f68638I0.f3469d, c21658d.m22050n(), i10);
    }

    @Override // p1095x1.InterfaceC21056J
    /* JADX INFO: renamed from: o */
    public final int mo21532o(int i10) {
        C19662a c19662aM22008F = this.f68765x0.f68819x0.m22008F();
        InterfaceC21057K interfaceC21057KM20634f = c19662aM22008F.m20634f();
        C21658D c21658d = (C21658D) c19662aM22008F.f62320Y;
        return interfaceC21057KM20634f.mo1122d((AbstractC21678Y) c21658d.f68638I0.f3469d, c21658d.m22050n(), i10);
    }

    @Override // p1095x1.InterfaceC21056J
    /* JADX INFO: renamed from: p */
    public final AbstractC21069X mo21533p(long j10) {
        m21554T(j10);
        AbstractC21678Y abstractC21678Y = this.f68765x0;
        C6546d c6546dM22014L = abstractC21678Y.f68819x0.m22014L();
        int i10 = c6546dM22014L.f21184o0;
        if (i10 > 0) {
            Object[] objArr = c6546dM22014L.f21182Y;
            int i11 = 0;
            do {
                C21663I c21663iM22070z = ((C21658D) objArr[i11]).m22070z();
                AbstractC16544l.m18091d(c21663iM22070z);
                c21663iM22070z.f68694u0 = 3;
                i11++;
            } while (i11 < i10);
        }
        C21658D c21658d = abstractC21678Y.f68819x0;
        AbstractC21669O.m22128w0(this, c21658d.f68631B0.mo1121c(this, c21658d.m22050n(), j10));
        return this;
    }

    @Override // p1140z1.AbstractC21669O
    /* JADX INFO: renamed from: y0 */
    public final void mo22130y0() {
        C21663I c21663iM22070z = this.f68765x0.f68819x0.m22070z();
        AbstractC16544l.m18091d(c21663iM22070z);
        c21663iM22070z.m22094j0();
    }
}
