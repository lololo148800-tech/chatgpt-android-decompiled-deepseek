package p389Pn;

import kotlin.jvm.internal.AbstractC16544l;
import p225Im.InterfaceC3764l;
import p437Rn.InterfaceC6943a;

/* JADX INFO: renamed from: Pn.s */
/* JADX INFO: loaded from: classes2.dex */
public final class C6534s implements InterfaceC6943a {

    /* JADX INFO: renamed from: Y */
    public final InterfaceC3764l f21150Y;

    public C6534s(InterfaceC3764l property) {
        AbstractC16544l.m18094g(property, "property");
        this.f21150Y = property;
    }

    /* JADX INFO: renamed from: a */
    public final Object m7093a(Object obj) {
        InterfaceC3764l interfaceC3764l = this.f21150Y;
        Object obj2 = interfaceC3764l.get(obj);
        if (obj2 != null) {
            return obj2;
        }
        throw new IllegalStateException("Field " + interfaceC3764l.getName() + " is not set");
    }

    @Override // p437Rn.InterfaceC6943a
    /* JADX INFO: renamed from: d */
    public final Object mo7094d(Object obj, Object obj2) {
        InterfaceC3764l interfaceC3764l = this.f21150Y;
        Object obj3 = interfaceC3764l.get(obj);
        if (obj3 == null) {
            interfaceC3764l.mo4450g(obj, obj2);
        } else if (!obj3.equals(obj2)) {
            return obj3;
        }
        return null;
    }
}
