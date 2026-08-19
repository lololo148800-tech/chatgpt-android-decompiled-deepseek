package p318Mh;

import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import mm.C17309l;
import p049Bm.InterfaceC1436k;
import p1155zi.C21936L0;
import p909nm.AbstractC17659D;

/* JADX INFO: renamed from: Mh.v */
/* JADX INFO: loaded from: classes3.dex */
public final class C5429v extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f17741Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ String f17742Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ String f17743o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ String f17744p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5429v(String str, String str2, String str3, int i10) {
        super(1);
        this.f17741Y = i10;
        this.f17742Z = str;
        this.f17743o0 = str2;
        this.f17744p0 = str3;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        C17296C c17296c = C17296C.f55119a;
        String str = this.f17742Z;
        String str2 = this.f17744p0;
        String str3 = this.f17743o0;
        switch (this.f17741Y) {
            case 0:
                C5387a buildRoute = (C5387a) obj;
                AbstractC16544l.m18094g(buildRoute, "$this$buildRoute");
                C5431w.f17746g.getClass();
                buildRoute.m5900a(C5431w.f17751l, new C21936L0(str));
                buildRoute.m5900a(C5431w.f17757r, str3);
                buildRoute.m5900a(C5431w.f17752m, str2);
                buildRoute.m5900a(C5431w.f17748i, EnumC5368I0.f17611p0);
                break;
            default:
                Map it = (Map) obj;
                AbstractC16544l.m18094g(it, "it");
                it.put(str, AbstractC17659D.m19244f(new C17309l("span_id", str3), new C17309l("trace_id", str2)));
                break;
        }
        return c17296c;
    }
}
