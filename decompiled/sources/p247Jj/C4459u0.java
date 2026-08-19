package p247Jj;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p729ej.C13430u;

/* JADX INFO: renamed from: Jj.u0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4459u0 extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f14587Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C4415X f14588Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ AbstractC4438k f14589o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4459u0(C4415X c4415x, AbstractC4438k abstractC4438k, int i10) {
        super(1);
        this.f14587Y = i10;
        this.f14588Z = c4415x;
        this.f14589o0 = abstractC4438k;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        switch (this.f14587Y) {
            case 0:
                C13430u action = (C13430u) obj;
                AbstractC16544l.m18094g(action, "$this$action");
                String str = this.f14588Z.f14327u0;
                C4436j c4436j = (C4436j) this.f14589o0;
                action.f42521b = new C4427e0(c4436j.f14445a, str, null, c4436j.f14446b);
                break;
            default:
                C13430u action2 = (C13430u) obj;
                AbstractC16544l.m18094g(action2, "$this$action");
                String str2 = this.f14588Z.f14428Y;
                C4434i c4434i = (C4434i) this.f14589o0;
                action2.m14964a(new C4439k0("There was a problem reaching the server.", AbstractC4379E.m5173a(c4434i.f14436a), c4434i.f14436a, str2));
                break;
        }
        return C17296C.f55119a;
    }
}
