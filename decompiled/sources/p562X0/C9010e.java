package p562X0;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1439n;
import p909nm.AbstractC17659D;

/* JADX INFO: renamed from: X0.e */
/* JADX INFO: loaded from: classes.dex */
public final class C9010e extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Z */
    public static final C9010e f27498Z = new C9010e(2, 0);

    /* JADX INFO: renamed from: o0 */
    public static final C9010e f27499o0 = new C9010e(2, 1);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f27500Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C9010e(int i10, int i11) {
        super(i10);
        this.f27500Y = i11;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f27500Y) {
            case 0:
                C9013h c9013h = (C9013h) obj2;
                LinkedHashMap linkedHashMapM19256r = AbstractC17659D.m19256r(c9013h.f27508a);
                for (C9012g c9012g : c9013h.f27509b.values()) {
                    if (c9012g.f27505b) {
                        Map mapM9596c = c9012g.f27506c.m9596c();
                        boolean zIsEmpty = mapM9596c.isEmpty();
                        Object obj3 = c9012g.f27504a;
                        if (zIsEmpty) {
                            linkedHashMapM19256r.remove(obj3);
                        } else {
                            linkedHashMapM19256r.put(obj3, mapM9596c);
                        }
                    }
                }
                if (linkedHashMapM19256r.isEmpty()) {
                    return null;
                }
                return linkedHashMapM19256r;
            default:
                return obj2;
        }
    }
}
