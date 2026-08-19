package p254K0;

import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p042Bf.C1267i;
import p049Bm.InterfaceC1436k;

/* JADX INFO: renamed from: K0.i */
/* JADX INFO: loaded from: classes.dex */
public final class C4512i extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Z */
    public static final C4512i f14730Z = new C4512i(1, 0);

    /* JADX INFO: renamed from: o0 */
    public static final C4512i f14731o0 = new C4512i(1, 1);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f14732Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4512i(int i10, int i11) {
        super(i10);
        this.f14732Y = i11;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        switch (this.f14732Y) {
            case 0:
                return C17296C.f55119a;
            default:
                List list = (List) obj;
                Object obj2 = list.get(0);
                AbstractC16544l.m18092e(obj2, "null cannot be cast to non-null type kotlin.Int");
                int iIntValue = ((Integer) obj2).intValue();
                Object obj3 = list.get(1);
                AbstractC16544l.m18092e(obj3, "null cannot be cast to non-null type kotlin.Float");
                return new C4518o(iIntValue, ((Float) obj3).floatValue(), new C1267i(2, list));
        }
    }
}
