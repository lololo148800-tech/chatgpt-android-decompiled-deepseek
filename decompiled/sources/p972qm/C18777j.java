package p972qm;

import java.io.Serializable;
import kotlin.jvm.internal.AbstractC16544l;
import p049Bm.InterfaceC1439n;

/* JADX INFO: renamed from: qm.j */
/* JADX INFO: loaded from: classes3.dex */
public final class C18777j implements InterfaceC18776i, Serializable {

    /* JADX INFO: renamed from: Y */
    public static final C18777j f59682Y = new C18777j();

    @Override // p972qm.InterfaceC18776i
    public final InterfaceC18774g get(InterfaceC18775h key) {
        AbstractC16544l.m18094g(key, "key");
        return null;
    }

    public final int hashCode() {
        return 0;
    }

    @Override // p972qm.InterfaceC18776i
    public final InterfaceC18776i minusKey(InterfaceC18775h key) {
        AbstractC16544l.m18094g(key, "key");
        return this;
    }

    @Override // p972qm.InterfaceC18776i
    public final InterfaceC18776i plus(InterfaceC18776i context) {
        AbstractC16544l.m18094g(context, "context");
        return context;
    }

    public final String toString() {
        return "EmptyCoroutineContext";
    }

    @Override // p972qm.InterfaceC18776i
    public final Object fold(Object obj, InterfaceC1439n interfaceC1439n) {
        return obj;
    }
}
