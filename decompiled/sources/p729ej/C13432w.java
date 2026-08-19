package p729ej;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1436k;

/* JADX INFO: renamed from: ej.w */
/* JADX INFO: loaded from: classes3.dex */
public final class C13432w extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Z */
    public static final C13432w f42523Z = new C13432w(1, 0);

    /* JADX INFO: renamed from: o0 */
    public static final C13432w f42524o0 = new C13432w(1, 1);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f42525Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C13432w(int i10, int i11) {
        super(i10);
        this.f42525Y = i11;
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, mm.i] */
    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        switch (this.f42525Y) {
            case 0:
                C13433x it = (C13433x) obj;
                AbstractC16544l.m18094g(it, "it");
                return it.f42527b;
            default:
                C13433x it2 = (C13433x) obj;
                AbstractC16544l.m18094g(it2, "it");
                Object value = it2.f42529d.getValue();
                AbstractC16544l.m18093f(value, "<get-typeName>(...)");
                return (String) value;
        }
    }
}
