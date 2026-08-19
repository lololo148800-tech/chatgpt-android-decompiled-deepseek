package p769gj;

import android.view.View;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p544W9.AbstractC8718u;
import p544W9.AbstractC8724v;

/* JADX INFO: renamed from: gj.e */
/* JADX INFO: loaded from: classes3.dex */
public final class C14163e extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Z */
    public static final C14163e f44536Z = new C14163e(1, 0);

    /* JADX INFO: renamed from: o0 */
    public static final C14163e f44537o0 = new C14163e(1, 1);

    /* JADX INFO: renamed from: p0 */
    public static final C14163e f44538p0 = new C14163e(1, 2);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f44539Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C14163e(int i10, int i11) {
        super(i10);
        this.f44539Y = i11;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        switch (this.f44539Y) {
            case 0:
                C14165g outer = (C14165g) obj;
                AbstractC16544l.m18094g(outer, "outer");
                return outer.f44541Y;
            case 1:
                C14172n named = (C14172n) obj;
                AbstractC16544l.m18094g(named, "named");
                return named.f44556a;
            default:
                View view = (View) obj;
                AbstractC16544l.m18094g(view, "view");
                AbstractC14158L abstractC14158LM9449g = AbstractC8724v.m9449g(view);
                Object objMo15504c = abstractC14158LM9449g == null ? null : abstractC14158LM9449g.mo15504c();
                if (objMo15504c == null) {
                    objMo15504c = null;
                }
                AbstractC16544l.m18091d(objMo15504c);
                AbstractC14158L abstractC14158LM9449g2 = AbstractC8724v.m9449g(view);
                C14183y c14183yMo15502a = abstractC14158LM9449g2 != null ? abstractC14158LM9449g2.mo15502a() : null;
                AbstractC16544l.m18091d(c14183yMo15502a);
                AbstractC8718u.m9435d(view, objMo15504c, c14183yMo15502a);
                return C17296C.f55119a;
        }
    }
}
