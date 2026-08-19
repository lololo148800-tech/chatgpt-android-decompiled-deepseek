package p949pj;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1436k;
import p1113xn.C21317k;

/* JADX INFO: renamed from: pj.O */
/* JADX INFO: loaded from: classes3.dex */
public final class C18442O extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Z */
    public static final C18442O f58837Z = new C18442O(1, 0);

    /* JADX INFO: renamed from: o0 */
    public static final C18442O f58838o0 = new C18442O(1, 1);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f58839Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C18442O(int i10, int i11) {
        super(i10);
        this.f58839Y = i11;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        switch (this.f58839Y) {
            case 0:
                C21317k it = (C21317k) obj;
                AbstractC16544l.m18094g(it, "it");
                return it.m21659c();
            default:
                C21317k it2 = (C21317k) obj;
                AbstractC16544l.m18094g(it2, "it");
                return it2.m21659c();
        }
    }
}
