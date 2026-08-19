package p1143z4;

import android.content.Context;
import android.content.ContextWrapper;
import com.openai.feature.serverstatus.impl.sunset.p684ZP.VjclRfeKsMflo;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p279L1.VOxZ.sVoFrD;

/* JADX INFO: renamed from: z4.b */
/* JADX INFO: loaded from: classes.dex */
public final class C21772b extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Z */
    public static final C21772b f69055Z = new C21772b(1, 0);

    /* JADX INFO: renamed from: o0 */
    public static final C21772b f69056o0 = new C21772b(1, 1);

    /* JADX INFO: renamed from: p0 */
    public static final C21772b f69057p0 = new C21772b(1, 2);

    /* JADX INFO: renamed from: q0 */
    public static final C21772b f69058q0 = new C21772b(1, 3);

    /* JADX INFO: renamed from: r0 */
    public static final C21772b f69059r0 = new C21772b(1, 4);

    /* JADX INFO: renamed from: s0 */
    public static final C21772b f69060s0 = new C21772b(1, 5);

    /* JADX INFO: renamed from: t0 */
    public static final C21772b f69061t0 = new C21772b(1, 6);

    /* JADX INFO: renamed from: u0 */
    public static final C21772b f69062u0 = new C21772b(1, 7);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f69063Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C21772b(int i10, int i11) {
        super(i10);
        this.f69063Y = i11;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        switch (this.f69063Y) {
            case 0:
                Context it = (Context) obj;
                AbstractC16544l.m18094g(it, "it");
                if (it instanceof ContextWrapper) {
                    return ((ContextWrapper) it).getBaseContext();
                }
                return null;
            case 1:
                Context context = (Context) obj;
                AbstractC16544l.m18094g(context, sVoFrD.XHWhcRZedE);
                if (context instanceof ContextWrapper) {
                    return ((ContextWrapper) context).getBaseContext();
                }
                return null;
            case 2:
                C21760B navOptions = (C21760B) obj;
                AbstractC16544l.m18094g(navOptions, "$this$navOptions");
                navOptions.f69031c = true;
                return C17296C.f55119a;
            case 3:
                AbstractC21790t destination = (AbstractC21790t) obj;
                AbstractC16544l.m18094g(destination, "destination");
                C21792v c21792v = destination.f69131Z;
                if (c21792v == null || c21792v.f69142v0 != destination.f69135r0) {
                    return null;
                }
                return c21792v;
            case 4:
                AbstractC21790t destination2 = (AbstractC21790t) obj;
                AbstractC16544l.m18094g(destination2, "destination");
                C21792v c21792v2 = destination2.f69131Z;
                if (c21792v2 == null || c21792v2.f69142v0 != destination2.f69135r0) {
                    return null;
                }
                return c21792v2;
            case 5:
                AbstractC21790t abstractC21790t = (AbstractC21790t) obj;
                AbstractC16544l.m18094g(abstractC21790t, VjclRfeKsMflo.gYPYgpcPhMygsJ);
                return abstractC21790t.f69131Z;
            case 6:
                AbstractC21790t it2 = (AbstractC21790t) obj;
                AbstractC16544l.m18094g(it2, "it");
                if (!(it2 instanceof C21792v)) {
                    return null;
                }
                C21792v c21792v3 = (C21792v) it2;
                return c21792v3.m22284s(c21792v3.f69142v0, true);
            default:
                C21760B navOptions2 = (C21760B) obj;
                AbstractC16544l.m18094g(navOptions2, "$this$navOptions");
                navOptions2.f69030b = true;
                return C17296C.f55119a;
        }
    }
}
