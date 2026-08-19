package p604Yk;

import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p1113xn.AbstractC21329w;
import p857kl.AbstractC16457e;
import p857kl.C16460h;
import p857kl.InterfaceC16461i;
import p909nm.C17689w;

/* JADX INFO: renamed from: Yk.k */
/* JADX INFO: loaded from: classes3.dex */
public final class C10086k implements InterfaceC16461i {

    /* JADX INFO: renamed from: Y */
    public static final C10086k f29865Y = new C10086k();

    @Override // p857kl.InterfaceC16461i
    /* JADX INFO: renamed from: r */
    public final boolean mo10671r(C16460h contentType) {
        AbstractC16544l.m18094g(contentType, "contentType");
        if (contentType.m18036p(AbstractC16457e.f51060a)) {
            return true;
        }
        if (!((List) contentType.f879c).isEmpty()) {
            contentType = new C16460h(contentType.f51066d, contentType.f51067e, C17689w.f56480Y);
        }
        String string = contentType.toString();
        return AbstractC21329w.m21734u(string, "application/", true) && AbstractC21329w.m21725l(string, "+json", true);
    }
}
