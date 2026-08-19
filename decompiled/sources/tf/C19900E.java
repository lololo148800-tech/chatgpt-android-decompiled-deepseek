package tf;

import androidx.compose.animation.AbstractC10831a;
import androidx.compose.foundation.layout.AbstractC10844c;
import androidx.compose.foundation.layout.FillElement;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import io.C15052h;
import io.C15053i;
import io.C15105o;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1440o;
import p1000s0.C19408d;
import p124Ei.C2451F0;
import p124Ei.C2494b;
import p349O0.C5994b0;
import p349O0.C6021p;
import p349O0.InterfaceC5985X;
import p523V9.AbstractC8210v0;
import p537W0.AbstractC8411c;
import p736f0.AbstractC13508z;
import p749fd.C13625j;
import p758g0.AbstractC13758e;
import p911o0.InterfaceC17784t;

/* JADX INFO: renamed from: tf.E */
/* JADX INFO: loaded from: classes3.dex */
public final class C19900E extends AbstractC16546n implements InterfaceC1440o {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ C19408d f63049Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C15105o f63050Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C13625j f63051o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ ArrayList f63052p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ List f63053q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ C19906K f63054r0;

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ InterfaceC5985X f63055s0;

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ InterfaceC1436k f63056t0;

    /* JADX INFO: renamed from: u0 */
    public final /* synthetic */ C5994b0 f63057u0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19900E(C19408d c19408d, C15105o c15105o, C13625j c13625j, ArrayList arrayList, List list, C19906K c19906k, InterfaceC5985X interfaceC5985X, InterfaceC1436k interfaceC1436k, C5994b0 c5994b0) {
        super(3);
        this.f63049Y = c19408d;
        this.f63050Z = c15105o;
        this.f63051o0 = c13625j;
        this.f63052p0 = arrayList;
        this.f63053q0 = list;
        this.f63054r0 = c19906k;
        this.f63055s0 = interfaceC5985X;
        this.f63056t0 = interfaceC1436k;
        this.f63057u0 = c5994b0;
    }

    @Override // p049Bm.InterfaceC1440o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        InterfaceC17784t FlickToDismiss = (InterfaceC17784t) obj;
        C6021p c6021p = (C6021p) obj2;
        int iIntValue = ((Number) obj3).intValue();
        AbstractC16544l.m18094g(FlickToDismiss, "$this$FlickToDismiss");
        if ((iIntValue & 17) == 16 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            FillElement fillElement = AbstractC10844c.f32512c;
            ArrayList arrayList = this.f63052p0;
            C13625j c13625j = this.f63051o0;
            C19906K c19906k = this.f63054r0;
            AbstractC8210v0.m8835b(this.f63049Y, fillElement, null, null, 0, 0.0f, null, null, false, false, null, null, null, AbstractC8411c.m8969c(-560239851, c6021p, new C2451F0(c13625j, arrayList, this.f63053q0, c19906k, this.f63055s0, 2)), c6021p, 48, 3072, 8188);
            C15105o c15105o = this.f63050Z;
            AbstractC10831a.m11201d((c15105o.m16229b() instanceof C15052h) || (c15105o.m16229b() instanceof C15053i), null, AbstractC13508z.m15013e(AbstractC13758e.m15255t(RCHTTPStatusCodes.SUCCESS, 0, null, 6), 2), AbstractC13508z.m15014f(AbstractC13758e.m15255t(RCHTTPStatusCodes.SUCCESS, 0, null, 6), 2), null, AbstractC8411c.m8969c(1241542219, c6021p, new C2494b(c19906k, this.f63056t0, this.f63055s0, c13625j, this.f63057u0)), c6021p, 200064, 18);
        }
        return C17296C.f55119a;
    }
}
