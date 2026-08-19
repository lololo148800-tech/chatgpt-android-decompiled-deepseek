package p247Jj;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p729ej.C13430u;

/* JADX INFO: renamed from: Jj.H0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4386H0 extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f14253Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ AbstractC4424d f14254Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4386H0(AbstractC4424d abstractC4424d, int i10) {
        super(1);
        this.f14253Y = i10;
        this.f14254Z = abstractC4424d;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        switch (this.f14253Y) {
            case 0:
                C13430u action = (C13430u) obj;
                AbstractC16544l.m18094g(action, "$this$action");
                action.f42521b = ((C4422c) this.f14254Z).f14367a;
                break;
            default:
                C13430u action2 = (C13430u) obj;
                AbstractC16544l.m18094g(action2, "$this$action");
                C4418a c4418a = (C4418a) this.f14254Z;
                C4412V c4412v = c4418a.f14338a;
                String str = c4412v.f14313u0;
                String str2 = c4412v.f14314v0;
                String str3 = c4412v.f14316x0;
                AbstractC16544l.m18091d(str3);
                action2.m14964a(new C4437j0(str, str3, str2, c4418a.f14338a.f14317y0));
                break;
        }
        return C17296C.f55119a;
    }
}
