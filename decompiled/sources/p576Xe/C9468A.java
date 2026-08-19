package p576Xe;

import bf.C11349D;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1436k;

/* JADX INFO: renamed from: Xe.A */
/* JADX INFO: loaded from: classes3.dex */
public final class C9468A extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Z */
    public static final C9468A f28492Z = new C9468A(1, 0);

    /* JADX INFO: renamed from: o0 */
    public static final C9468A f28493o0 = new C9468A(1, 1);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f28494Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C9468A(int i10, int i11) {
        super(i10);
        this.f28494Y = i11;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        switch (this.f28494Y) {
            case 0:
                C11349D it = (C11349D) obj;
                AbstractC16544l.m18094g(it, "it");
                if (it.f34317D) {
                    return it;
                }
                return null;
            default:
                C11349D it2 = (C11349D) obj;
                AbstractC16544l.m18094g(it2, "it");
                if (it2.f34317D) {
                    return it2;
                }
                return null;
        }
    }
}
