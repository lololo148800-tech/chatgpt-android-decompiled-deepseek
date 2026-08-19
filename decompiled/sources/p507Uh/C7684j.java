package p507Uh;

import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;

/* JADX INFO: renamed from: Uh.j */
/* JADX INFO: loaded from: classes3.dex */
public final class C7684j extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Z */
    public static final C7684j f24221Z = new C7684j(1, 0);

    /* JADX INFO: renamed from: o0 */
    public static final C7684j f24222o0 = new C7684j(1, 1);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f24223Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C7684j(int i10, int i11) {
        super(i10);
        this.f24223Y = i11;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        switch (this.f24223Y) {
            case 0:
                Map it = (Map) obj;
                AbstractC16544l.m18094g(it, "it");
                break;
            default:
                ((Boolean) obj).booleanValue();
                break;
        }
        return C17296C.f55119a;
    }
}
