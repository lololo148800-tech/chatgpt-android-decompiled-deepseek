package p881m0;

import androidx.compose.foundation.gestures.AbstractC10840a;
import kotlin.jvm.internal.AbstractC16544l;
import p025An.AbstractC0575H;
import p049Bm.InterfaceC1436k;
import p571X9.AbstractC9233X;
import p594Y9.C9895g4;
import p729ej.C13414e;
import p758g0.AbstractC13758e;
import p758g0.C13774m;
import p758g0.C13796x;
import p758g0.InterfaceC13772l;
import p860l0.C16700O0;
import p860l0.C16725b;
import p860l0.InterfaceC16661B0;
import p860l0.InterfaceC16694M0;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: m0.j */
/* JADX INFO: loaded from: classes.dex */
public final class C17133j implements InterfaceC16661B0 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC17137n f54784a;

    /* JADX INFO: renamed from: b */
    public final C13796x f54785b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC13772l f54786c;

    /* JADX INFO: renamed from: d */
    public final C16700O0 f54787d = AbstractC10840a.f32469b;

    public C17133j(InterfaceC17137n interfaceC17137n, C13796x c13796x, InterfaceC13772l interfaceC13772l) {
        this.f54784a = interfaceC17137n;
        this.f54785b = c13796x;
        this.f54786c = interfaceC13772l;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0017  */
    /* JADX INFO: renamed from: b */
    public static final Object m18897b(C17133j c17133j, InterfaceC16694M0 interfaceC16694M0, float f10, float f11, C17129f c17129f, AbstractC19687c abstractC19687c) {
        C17132i c17132i;
        C13774m c13774mM15237b;
        c17133j.getClass();
        if (abstractC19687c instanceof C17132i) {
            c17132i = (C17132i) abstractC19687c;
            int i10 = c17132i.f54783o0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c17132i.f54783o0 = i10 - Integer.MIN_VALUE;
            } else {
                c17132i = new C17132i(c17133j, abstractC19687c);
            }
        } else {
            c17132i = new C17132i(c17133j, abstractC19687c);
        }
        C17132i c17132i2 = c17132i;
        Object objMo10556g = c17132i2.f54781Y;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c17132i2.f54783o0;
        if (i11 == 0) {
            AbstractC9233X.m9807c(objMo10556g);
            if (Math.abs(f10) == 0.0f || Math.abs(f11) == 0.0f) {
                c13774mM15237b = AbstractC13758e.m15237b(f10, f11, 28);
            } else {
                c17132i2.f54783o0 = 1;
                C13796x c13796x = c17133j.f54785b;
                objMo10556g = (Math.abs(AbstractC13758e.m15246k(c13796x, 0.0f, f11)) >= Math.abs(f10) ? new C9895g4(c13796x) : new C13414e(c17133j.f54786c)).mo10556g(interfaceC16694M0, new Float(f10), new Float(f11), c17129f, c17132i2);
                if (objMo10556g == enumC19250a) {
                    return enumC19250a;
                }
            }
            return c13774mM15237b;
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC9233X.m9807c(objMo10556g);
        c13774mM15237b = ((C17124a) objMo10556g).f54759b;
        return c13774mM15237b;
    }

    @Override // p860l0.InterfaceC16661B0
    /* JADX INFO: renamed from: a */
    public final Object mo18490a(InterfaceC16694M0 interfaceC16694M0, float f10, InterfaceC18770c interfaceC18770c) {
        return m18899d(interfaceC16694M0, f10, C16725b.f53603v0, (AbstractC19687c) interfaceC18770c);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    public final Object m18898c(InterfaceC16694M0 interfaceC16694M0, float f10, InterfaceC1436k interfaceC1436k, AbstractC19687c abstractC19687c) throws Throwable {
        C17128e c17128e;
        if (abstractC19687c instanceof C17128e) {
            c17128e = (C17128e) abstractC19687c;
            int i10 = c17128e.f54768p0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c17128e.f54768p0 = i10 - Integer.MIN_VALUE;
            } else {
                c17128e = new C17128e(this, abstractC19687c);
            }
        } else {
            c17128e = new C17128e(this, abstractC19687c);
        }
        Object objM1168P = c17128e.f54766Z;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c17128e.f54768p0;
        if (i11 == 0) {
            AbstractC9233X.m9807c(objM1168P);
            C16700O0 c16700o0 = this.f54787d;
            C17130g c17130g = new C17130g(this, f10, interfaceC1436k, interfaceC16694M0, null);
            c17128e.f54765Y = interfaceC1436k;
            c17128e.f54768p0 = 1;
            objM1168P = AbstractC0575H.m1168P(c16700o0, c17130g, c17128e);
            if (objM1168P == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC1436k = c17128e.f54765Y;
            AbstractC9233X.m9807c(objM1168P);
        }
        C17124a c17124a = (C17124a) objM1168P;
        interfaceC1436k.invoke(new Float(0.0f));
        return c17124a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: d */
    public final Object m18899d(InterfaceC16694M0 interfaceC16694M0, float f10, InterfaceC1436k interfaceC1436k, AbstractC19687c abstractC19687c) throws Throwable {
        C17131h c17131h;
        if (abstractC19687c instanceof C17131h) {
            c17131h = (C17131h) abstractC19687c;
            int i10 = c17131h.f54780o0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c17131h.f54780o0 = i10 - Integer.MIN_VALUE;
            } else {
                c17131h = new C17131h(this, abstractC19687c);
            }
        } else {
            c17131h = new C17131h(this, abstractC19687c);
        }
        Object objM18898c = c17131h.f54778Y;
        Object obj = EnumC19250a.f61036Y;
        int i11 = c17131h.f54780o0;
        if (i11 == 0) {
            AbstractC9233X.m9807c(objM18898c);
            c17131h.f54780o0 = 1;
            objM18898c = m18898c(interfaceC16694M0, f10, interfaceC1436k, c17131h);
            if (objM18898c == obj) {
                return obj;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(objM18898c);
        }
        C17124a c17124a = (C17124a) objM18898c;
        return new Float(c17124a.f54758a.floatValue() != 0.0f ? ((Number) c17124a.f54759b.m15282c()).floatValue() : 0.0f);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C17133j)) {
            return false;
        }
        C17133j c17133j = (C17133j) obj;
        return AbstractC16544l.m18089b(c17133j.f54786c, this.f54786c) && AbstractC16544l.m18089b(c17133j.f54785b, this.f54785b) && AbstractC16544l.m18089b(c17133j.f54784a, this.f54784a);
    }

    public final int hashCode() {
        return this.f54784a.hashCode() + ((this.f54785b.hashCode() + (this.f54786c.hashCode() * 31)) * 31);
    }
}
