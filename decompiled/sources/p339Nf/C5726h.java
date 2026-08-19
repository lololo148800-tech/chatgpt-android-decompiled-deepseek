package p339Nf;

import com.withpersona.sdk2.inquiry.network.dto.p686ui.UiComponentConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import mm.C17309l;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p1081wc.C20903v;
import p1081wc.InterfaceC20904w;
import p1155zi.C21965U0;
import p909nm.AbstractC17659D;
import p909nm.AbstractC17682p;
import p926of.C18146I;
import p926of.C18173j;

/* JADX INFO: renamed from: Nf.h */
/* JADX INFO: loaded from: classes3.dex */
public final class C5726h extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ List f18552Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC1436k f18553Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ int f18554o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ InterfaceC20904w f18555p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ String f18556q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ String f18557r0;

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ List f18558s0;

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ String f18559t0;

    /* JADX INFO: renamed from: u0 */
    public final /* synthetic */ String f18560u0;

    /* JADX INFO: renamed from: v0 */
    public final /* synthetic */ String f18561v0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5726h(List list, InterfaceC1436k interfaceC1436k, int i10, InterfaceC20904w interfaceC20904w, String str, String str2, List list2, String str3, String str4, String str5) {
        super(0);
        this.f18552Y = list;
        this.f18553Z = interfaceC1436k;
        this.f18554o0 = i10;
        this.f18555p0 = interfaceC20904w;
        this.f18556q0 = str;
        this.f18557r0 = str2;
        this.f18558s0 = list2;
        this.f18559t0 = str3;
        this.f18560u0 = str4;
        this.f18561v0 = str5;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        List list = this.f18552Y;
        ArrayList arrayList = new ArrayList(AbstractC17682p.m19389r(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new C18173j(((C21965U0) it.next()).f69534a, null, null, this.f18557r0, null, null, this.f18560u0, this.f18559t0, this.f18561v0, 54));
        }
        int i10 = this.f18554o0;
        this.f18553Z.invoke(new C18146I(arrayList, i10, 4));
        InterfaceC20904w interfaceC20904w = this.f18555p0;
        if (interfaceC20904w != null) {
            C20903v c20903v = C20903v.f66630g;
            String str = this.f18556q0;
            if (str == null) {
                str = null;
            }
            if (str == null) {
                str = "";
            }
            C17309l c17309l = new C17309l("conversationId", str);
            C17309l c17309l2 = new C17309l("messageId", this.f18557r0);
            C17309l c17309l3 = new C17309l("index", Integer.valueOf(i10));
            C17309l c17309l4 = new C17309l("num_images", Integer.valueOf(this.f18558s0.size()));
            C17309l c17309l5 = new C17309l("url", this.f18559t0);
            String str2 = this.f18560u0;
            interfaceC20904w.mo21447a(c20903v, AbstractC17659D.m19244f(c17309l, c17309l2, c17309l3, c17309l4, c17309l5, new C17309l(UiComponentConfig.Title.type, str2 != null ? str2 : "")));
        }
        return C17296C.f55119a;
    }
}
