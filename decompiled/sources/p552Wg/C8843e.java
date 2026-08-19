package p552Wg;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p403Qd.AbstractC6601G;
import p926of.InterfaceC18159W;

/* JADX INFO: renamed from: Wg.e */
/* JADX INFO: loaded from: classes3.dex */
public final class C8843e extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Z */
    public static final C8843e f27076Z = new C8843e(1, 0);

    /* JADX INFO: renamed from: o0 */
    public static final C8843e f27077o0 = new C8843e(1, 1);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f27078Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C8843e(int i10, int i11) {
        super(i10);
        this.f27078Y = i11;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        switch (this.f27078Y) {
            case 0:
                AbstractC6601G it = (AbstractC6601G) obj;
                AbstractC16544l.m18094g(it, "it");
                return it.mo7159a();
            default:
                AbstractC16544l.m18094g((InterfaceC18159W) obj, "it");
                return C17296C.f55119a;
        }
    }
}
