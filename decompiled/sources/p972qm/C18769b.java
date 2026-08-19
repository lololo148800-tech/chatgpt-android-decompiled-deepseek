package p972qm;

import java.io.Serializable;
import kotlin.jvm.internal.AbstractC16544l;
import p008A6.C0384d;
import p049Bm.InterfaceC1439n;
import p571X9.AbstractC9306j0;

/* JADX INFO: renamed from: qm.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C18769b implements InterfaceC18776i, Serializable {

    /* JADX INFO: renamed from: Y */
    public final InterfaceC18776i f59679Y;

    /* JADX INFO: renamed from: Z */
    public final InterfaceC18774g f59680Z;

    public C18769b(InterfaceC18774g element, InterfaceC18776i left) {
        AbstractC16544l.m18094g(left, "left");
        AbstractC16544l.m18094g(element, "element");
        this.f59679Y = left;
        this.f59680Z = element;
    }

    public final boolean equals(Object obj) {
        boolean zM18089b;
        if (this != obj) {
            if (!(obj instanceof C18769b)) {
                return false;
            }
            C18769b c18769b = (C18769b) obj;
            c18769b.getClass();
            int i10 = 2;
            C18769b c18769b2 = c18769b;
            int i11 = 2;
            while (true) {
                InterfaceC18776i interfaceC18776i = c18769b2.f59679Y;
                c18769b2 = interfaceC18776i instanceof C18769b ? (C18769b) interfaceC18776i : null;
                if (c18769b2 == null) {
                    break;
                }
                i11++;
            }
            C18769b c18769b3 = this;
            while (true) {
                InterfaceC18776i interfaceC18776i2 = c18769b3.f59679Y;
                c18769b3 = interfaceC18776i2 instanceof C18769b ? (C18769b) interfaceC18776i2 : null;
                if (c18769b3 == null) {
                    break;
                }
                i10++;
            }
            if (i11 != i10) {
                return false;
            }
            C18769b c18769b4 = this;
            while (true) {
                InterfaceC18774g interfaceC18774g = c18769b4.f59680Z;
                if (!AbstractC16544l.m18089b(c18769b.get(interfaceC18774g.getKey()), interfaceC18774g)) {
                    zM18089b = false;
                    break;
                }
                InterfaceC18776i interfaceC18776i3 = c18769b4.f59679Y;
                if (!(interfaceC18776i3 instanceof C18769b)) {
                    AbstractC16544l.m18092e(interfaceC18776i3, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                    InterfaceC18774g interfaceC18774g2 = (InterfaceC18774g) interfaceC18776i3;
                    zM18089b = AbstractC16544l.m18089b(c18769b.get(interfaceC18774g2.getKey()), interfaceC18774g2);
                    break;
                }
                c18769b4 = (C18769b) interfaceC18776i3;
            }
            if (!zM18089b) {
                return false;
            }
        }
        return true;
    }

    @Override // p972qm.InterfaceC18776i
    public final Object fold(Object obj, InterfaceC1439n interfaceC1439n) {
        return interfaceC1439n.invoke(this.f59679Y.fold(obj, interfaceC1439n), this.f59680Z);
    }

    @Override // p972qm.InterfaceC18776i
    public final InterfaceC18774g get(InterfaceC18775h key) {
        AbstractC16544l.m18094g(key, "key");
        C18769b c18769b = this;
        while (true) {
            InterfaceC18774g interfaceC18774g = c18769b.f59680Z.get(key);
            if (interfaceC18774g != null) {
                return interfaceC18774g;
            }
            InterfaceC18776i interfaceC18776i = c18769b.f59679Y;
            if (!(interfaceC18776i instanceof C18769b)) {
                return interfaceC18776i.get(key);
            }
            c18769b = (C18769b) interfaceC18776i;
        }
    }

    public final int hashCode() {
        return this.f59680Z.hashCode() + this.f59679Y.hashCode();
    }

    @Override // p972qm.InterfaceC18776i
    public final InterfaceC18776i minusKey(InterfaceC18775h key) {
        AbstractC16544l.m18094g(key, "key");
        InterfaceC18774g interfaceC18774g = this.f59680Z;
        InterfaceC18774g interfaceC18774g2 = interfaceC18774g.get(key);
        InterfaceC18776i interfaceC18776i = this.f59679Y;
        if (interfaceC18774g2 != null) {
            return interfaceC18776i;
        }
        InterfaceC18776i interfaceC18776iMinusKey = interfaceC18776i.minusKey(key);
        if (interfaceC18776iMinusKey == interfaceC18776i) {
            return this;
        }
        return interfaceC18776iMinusKey == C18777j.f59682Y ? interfaceC18774g : new C18769b(interfaceC18774g, interfaceC18776iMinusKey);
    }

    @Override // p972qm.InterfaceC18776i
    public final InterfaceC18776i plus(InterfaceC18776i context) {
        AbstractC16544l.m18094g(context, "context");
        return context == C18777j.f59682Y ? this : (InterfaceC18776i) context.fold(this, new C0384d(13));
    }

    public final String toString() {
        return AbstractC9306j0.m9892k(new StringBuilder("["), (String) fold("", new C0384d(12)), ']');
    }
}
