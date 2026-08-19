package p936p0;

import java.util.List;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;

/* JADX INFO: renamed from: p0.k */
/* JADX INFO: loaded from: classes.dex */
public final class C18271k extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Z */
    public static final C18271k f58283Z = new C18271k(1, 0);

    /* JADX INFO: renamed from: o0 */
    public static final C18271k f58284o0 = new C18271k(1, 1);

    /* JADX INFO: renamed from: p0 */
    public static final C18271k f58285p0 = new C18271k(1, 2);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f58286Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C18271k(int i10, int i11) {
        super(i10);
        this.f58286Y = i11;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        switch (this.f58286Y) {
            case 0:
                return C17296C.f55119a;
            case 1:
                ((Number) obj).intValue();
                return null;
            default:
                List list = (List) obj;
                return new C18280t(((Number) list.get(0)).intValue(), ((Number) list.get(1)).intValue());
        }
    }
}
