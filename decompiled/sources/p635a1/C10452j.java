package p635a1;

import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1439n;

/* JADX INFO: renamed from: a1.j */
/* JADX INFO: loaded from: classes.dex */
public final class C10452j extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public static final C10452j f30954Y = new C10452j(2);

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        String str = (String) obj;
        InterfaceC10457o interfaceC10457o = (InterfaceC10457o) obj2;
        if (str.length() == 0) {
            return interfaceC10457o.toString();
        }
        return str + ", " + interfaceC10457o;
    }
}
