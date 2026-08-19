package p025An;

import kotlin.jvm.internal.AbstractC16544l;
import p008A6.C0383c;
import p153Fn.AbstractC2923a;
import p153Fn.C2929g;
import p972qm.AbstractC18768a;
import p972qm.C18771d;
import p972qm.C18777j;
import p972qm.InterfaceC18772e;
import p972qm.InterfaceC18774g;
import p972qm.InterfaceC18775h;
import p972qm.InterfaceC18776i;

/* JADX INFO: renamed from: An.B */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0563B extends AbstractC18768a implements InterfaceC18772e {

    /* JADX INFO: renamed from: Y */
    public static final C0561A f1782Y = new C0561A(C18771d.f59681Y, new C0383c(3));

    public AbstractC0563B() {
        super(C18771d.f59681Y);
    }

    /* JADX INFO: renamed from: V0 */
    public abstract void mo872V0(InterfaceC18776i interfaceC18776i, Runnable runnable);

    /* JADX INFO: renamed from: W0 */
    public void mo1142W0(InterfaceC18776i interfaceC18776i, Runnable runnable) {
        AbstractC2923a.m3737k(this, interfaceC18776i, runnable);
    }

    /* JADX INFO: renamed from: X0 */
    public boolean mo1143X0(InterfaceC18776i interfaceC18776i) {
        return !(this instanceof C0580J0);
    }

    /* JADX INFO: renamed from: Y0 */
    public AbstractC0563B mo1144Y0(int i10, String str) {
        AbstractC2923a.m3729c(i10);
        return new C2929g(this, i10, str);
    }

    @Override // p972qm.AbstractC18768a, p972qm.InterfaceC18776i
    public final InterfaceC18774g get(InterfaceC18775h key) {
        AbstractC16544l.m18094g(key, "key");
        if (!(key instanceof C0561A)) {
            if (C18771d.f59681Y == key) {
                return this;
            }
            return null;
        }
        C0561A c0561a = (C0561A) key;
        InterfaceC18775h key2 = getKey();
        AbstractC16544l.m18094g(key2, "key");
        if (key2 != c0561a && c0561a.f1781Z != key2) {
            return null;
        }
        InterfaceC18774g interfaceC18774g = (InterfaceC18774g) c0561a.f1780Y.invoke(this);
        if (interfaceC18774g instanceof InterfaceC18774g) {
            return interfaceC18774g;
        }
        return null;
    }

    @Override // p972qm.AbstractC18768a, p972qm.InterfaceC18776i
    public final InterfaceC18776i minusKey(InterfaceC18775h key) {
        AbstractC16544l.m18094g(key, "key");
        boolean z6 = key instanceof C0561A;
        C18777j c18777j = C18777j.f59682Y;
        if (z6) {
            C0561A c0561a = (C0561A) key;
            InterfaceC18775h key2 = getKey();
            AbstractC16544l.m18094g(key2, "key");
            if ((key2 == c0561a || c0561a.f1781Z == key2) && ((InterfaceC18774g) c0561a.f1780Y.invoke(this)) != null) {
                return c18777j;
            }
        } else if (C18771d.f59681Y == key) {
            return c18777j;
        }
        return this;
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + AbstractC0575H.m1191t(this);
    }
}
