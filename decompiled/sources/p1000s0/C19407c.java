package p1000s0;

import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p042Bf.C1267i;
import p049Bm.InterfaceC1436k;

/* JADX INFO: renamed from: s0.c */
/* JADX INFO: loaded from: classes.dex */
public final class C19407c extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Z */
    public static final C19407c f61485Z = new C19407c(1, 0);

    /* JADX INFO: renamed from: o0 */
    public static final C19407c f61486o0 = new C19407c(1, 1);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f61487Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C19407c(int i10, int i11) {
        super(i10);
        this.f61487Y = i11;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        switch (this.f61487Y) {
            case 0:
                List list = (List) obj;
                Object obj2 = list.get(0);
                AbstractC16544l.m18092e(obj2, "null cannot be cast to non-null type kotlin.Int");
                int iIntValue = ((Integer) obj2).intValue();
                Object obj3 = list.get(1);
                AbstractC16544l.m18092e(obj3, "null cannot be cast to non-null type kotlin.Float");
                return new C19408d(iIntValue, ((Float) obj3).floatValue(), new C1267i(7, list));
            default:
                return C17296C.f55119a;
        }
    }
}
