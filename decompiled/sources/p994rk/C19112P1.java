package p994rk;

import android.content.Context;
import android.widget.ImageView;
import com.withpersona.sdk2.inquiry.network.dto.p686ui.UiComponentConfig;
import hk.C14525c;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1426a;
import p1075w5.C20830h;
import p1110xk.AbstractC21284g;
import p791hj.C14522e;
import p864l5.C16826m;

/* JADX INFO: renamed from: rk.P1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C19112P1 extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ C14525c f60815Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C19094J1 f60816Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ UiComponentConfig.RemoteImage.Attributes f60817o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19112P1(C14525c c14525c, C19094J1 c19094j1, UiComponentConfig.RemoteImage.Attributes attributes) {
        super(0);
        this.f60815Y = c14525c;
        this.f60816Z = c19094j1;
        this.f60817o0 = attributes;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        ImageView imageView = (ImageView) this.f60815Y.f45778c;
        C19094J1 c19094j1 = this.f60816Z;
        AbstractC21284g.m21627c(imageView, c19094j1.f60779Y);
        String url = this.f60817o0.getUrl();
        UiComponentConfig.RemoteImageComponentStyle styles = c19094j1.f60779Y.getStyles();
        Context context = imageView.getContext();
        AbstractC16544l.m18093f(context, "getContext(...)");
        C14522e c14522e = new C14522e(context);
        c14522e.m16020m(100);
        c14522e.m16020m(500);
        C16826m c16826mM16016g = c14522e.m16016g();
        C20830h c20830h = new C20830h(imageView.getContext());
        c20830h.f66187c = url;
        c20830h.m21438d(imageView);
        c20830h.f66191g = new C19097K1(styles, imageView, 0);
        c16826mM16016g.m18564b(c20830h.m21435a());
        return C17296C.f55119a;
    }
}
