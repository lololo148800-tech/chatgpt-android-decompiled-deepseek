package p977r0;

import java.util.List;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;

/* JADX INFO: renamed from: r0.l */
/* JADX INFO: loaded from: classes.dex */
public final class C18840l extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Z */
    public static final C18840l f59978Z = new C18840l(1, 0);

    /* JADX INFO: renamed from: o0 */
    public static final C18840l f59979o0 = new C18840l(1, 1);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f59980Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C18840l(int i10, int i11) {
        super(i10);
        this.f59980Y = i11;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        switch (this.f59980Y) {
            case 0:
                return C17296C.f55119a;
            default:
                List list = (List) obj;
                return new C18852x((int[]) list.get(0), (int[]) list.get(1));
        }
    }
}
