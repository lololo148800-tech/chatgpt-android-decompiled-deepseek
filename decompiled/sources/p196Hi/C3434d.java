package p196Hi;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1436k;

/* JADX INFO: renamed from: Hi.d */
/* JADX INFO: loaded from: classes3.dex */
public final class C3434d extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Z */
    public static final C3434d f10454Z = new C3434d(1, 0);

    /* JADX INFO: renamed from: o0 */
    public static final C3434d f10455o0 = new C3434d(1, 1);

    /* JADX INFO: renamed from: p0 */
    public static final C3434d f10456p0 = new C3434d(1, 2);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f10457Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3434d(int i10, int i11) {
        super(i10);
        this.f10457Y = i11;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        switch (this.f10457Y) {
            case 0:
                C3450t it = (C3450t) obj;
                AbstractC16544l.m18094g(it, "it");
                return Boolean.valueOf(it.f10493d);
            case 1:
                C3450t it2 = (C3450t) obj;
                AbstractC16544l.m18094g(it2, "it");
                return it2.f10491b;
            default:
                C3450t it3 = (C3450t) obj;
                AbstractC16544l.m18094g(it3, "it");
                return Boolean.valueOf(it3.f10494e);
        }
    }
}
