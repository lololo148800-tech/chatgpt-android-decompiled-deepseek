package p994rk;

import android.content.Context;
import android.widget.ImageView;
import com.withpersona.sdk2.inquiry.network.dto.p686ui.UiComponentConfig;
import hk.C14525c;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1426a;
import p1075w5.C20830h;
import p1110xk.AbstractC21284g;
import p473T7.AbstractC7262c;
import p791hj.C14522e;
import p864l5.C16815b;
import p864l5.C16826m;
import p899n5.C17502s;

/* JADX INFO: renamed from: rk.R1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C19117R1 extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ C14525c f60822Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C19094J1 f60823Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ UiComponentConfig.RemoteImage.Attributes f60824o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19117R1(C14525c c14525c, C19094J1 c19094j1, UiComponentConfig.RemoteImage.Attributes attributes) {
        super(0);
        this.f60822Y = c14525c;
        this.f60823Z = c19094j1;
        this.f60824o0 = attributes;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        ImageView imageView = (ImageView) this.f60822Y.f45778c;
        AbstractC21284g.m21627c(imageView, this.f60823Z.f60779Y);
        UiComponentConfig.RemoteImage.Attributes attributes = this.f60824o0;
        String url = attributes != null ? attributes.getUrl() : null;
        Context context = imageView.getContext();
        AbstractC16544l.m18093f(context, "getContext(...)");
        C14522e c14522e = new C14522e(context);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        arrayList5.add(new C17502s());
        c14522e.f45764p0 = new C16815b(AbstractC7262c.m7719h(arrayList), AbstractC7262c.m7719h(arrayList2), AbstractC7262c.m7719h(arrayList3), AbstractC7262c.m7719h(arrayList4), AbstractC7262c.m7719h(arrayList5));
        c14522e.m16020m(100);
        c14522e.m16020m(500);
        C16826m c16826mM16016g = c14522e.m16016g();
        C20830h c20830h = new C20830h(imageView.getContext());
        c20830h.f66187c = url;
        c20830h.m21438d(imageView);
        c16826mM16016g.m18564b(c20830h.m21435a());
        return C17296C.f55119a;
    }
}
