package p953q0;

import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1439n;
import p562X0.InterfaceC9009d;

/* JADX INFO: renamed from: q0.g0 */
/* JADX INFO: loaded from: classes.dex */
public final class C18581g0 extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public static final C18581g0 f59185Y = new C18581g0(2);

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        C18583h0 c18583h0 = (C18583h0) obj2;
        InterfaceC9009d interfaceC9009d = (InterfaceC9009d) c18583h0.f59189b.getValue();
        if (interfaceC9009d != null) {
            Iterator it = c18583h0.f59190c.iterator();
            while (it.hasNext()) {
                interfaceC9009d.mo9595e(it.next());
            }
        }
        Map mapM9596c = c18583h0.f59188a.m9596c();
        if (mapM9596c.isEmpty()) {
            return null;
        }
        return mapM9596c;
    }
}
