package p173Gj;

import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p949pj.C18428A;

/* JADX INFO: renamed from: Gj.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C3096c extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Z */
    public static final C3096c f9315Z = new C3096c(2, 0);

    /* JADX INFO: renamed from: o0 */
    public static final C3096c f9316o0 = new C3096c(2, 1);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f9317Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3096c(int i10, int i11) {
        super(i10);
        this.f9317Y = i11;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f9317Y) {
            case 0:
                AbstractC16544l.m18094g((List) obj, "<anonymous parameter 0>");
                AbstractC16544l.m18094g((C18428A) obj2, "<anonymous parameter 1>");
                break;
            default:
                AbstractC16544l.m18094g((List) obj, "<anonymous parameter 0>");
                AbstractC16544l.m18094g((C18428A) obj2, "<anonymous parameter 1>");
                break;
        }
        return C17296C.f55119a;
    }
}
