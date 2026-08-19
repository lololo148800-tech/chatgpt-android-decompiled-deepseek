package p988rc;

import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p1091wn.AbstractC21031l;
import p1091wn.C21027h;
import p204I1.C3590f;
import p858ko.C16482A;
import p909nm.AbstractC17680n;

/* JADX INFO: renamed from: rc.t */
/* JADX INFO: loaded from: classes3.dex */
public final class C18932t extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f60407Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C3590f f60408Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C18929q f60409o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C18932t(C3590f c3590f, C18929q c18929q, int i10) {
        super(1);
        this.f60407Y = i10;
        this.f60408Z = c3590f;
        this.f60409o0 = c18929q;
    }

    /* JADX WARN: Type inference failed for: r5v20, types: [Bm.a, kotlin.jvm.internal.n] */
    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        switch (this.f60407Y) {
            case 0:
                int iIntValue = ((Number) obj).intValue();
                Map map = this.f60409o0.f60395b;
                C3590f c3590f = this.f60408Z;
                boolean z6 = true;
                int length = c3590f.f10934Y.length() - 1;
                if (iIntValue > length) {
                    iIntValue = length;
                }
                C21027h c21027hM21496t = AbstractC21031l.m21496t(AbstractC17680n.m19329H(c3590f.m4300c(iIntValue, iIntValue, AbstractC18928p.f60391b)), new C16482A(map, 21));
                Iterator it = c21027hM21496t.f66902a.iterator();
                while (it.hasNext()) {
                    if (((Boolean) c21027hM21496t.f66904c.invoke(it.next())).booleanValue() == c21027hM21496t.f66903b) {
                        return Boolean.valueOf(z6);
                    }
                }
                z6 = false;
                return Boolean.valueOf(z6);
            default:
                int iIntValue2 = ((Number) obj).intValue();
                Map map2 = this.f60409o0.f60395b;
                C3590f c3590f2 = this.f60408Z;
                int length2 = c3590f2.f10934Y.length() - 1;
                if (iIntValue2 > length2) {
                    iIntValue2 = length2;
                }
                C18923k c18923k = (C18923k) AbstractC21031l.m21489m(AbstractC21031l.m21496t(AbstractC17680n.m19329H(c3590f2.m4300c(iIntValue2, iIntValue2, AbstractC18928p.f60391b)), new C16482A(map2, 21)));
                if (c18923k != null) {
                    c18923k.f60382d.invoke();
                }
                return C17296C.f55119a;
        }
    }
}
