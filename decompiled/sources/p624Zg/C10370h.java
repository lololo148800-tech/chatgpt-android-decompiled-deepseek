package p624Zg;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1436k;

/* JADX INFO: renamed from: Zg.h */
/* JADX INFO: loaded from: classes3.dex */
public final class C10370h extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Z */
    public static final C10370h f30729Z = new C10370h(1, 0);

    /* JADX INFO: renamed from: o0 */
    public static final C10370h f30730o0 = new C10370h(1, 1);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f30731Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C10370h(int i10, int i11) {
        super(i10);
        this.f30731Y = i11;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        switch (this.f30731Y) {
            case 0:
                C10390v it = (C10390v) obj;
                AbstractC16544l.m18094g(it, "it");
                return it.f30791a.f30669a;
            default:
                C10337G it2 = (C10337G) obj;
                AbstractC16544l.m18094g(it2, "it");
                return it2.f30669a;
        }
    }
}
