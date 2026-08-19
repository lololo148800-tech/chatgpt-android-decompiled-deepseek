package p647ak;

import com.withpersona.sdk2.inquiry.network.InternalErrorInfo;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p531Vj.C8340J;
import p531Vj.C8365e0;
import p531Vj.EnumC8363d0;
import p729ej.C13421l;
import p729ej.C13430u;

/* JADX INFO: renamed from: ak.a1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C10684a1 extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ C8340J f31730Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C10701g0 f31731Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C10730t0 f31732o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C10696e1 f31733p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ C13421l f31734q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10684a1(C8340J c8340j, C10701g0 c10701g0, C10730t0 c10730t0, C10696e1 c10696e1, C13421l c13421l) {
        super(1);
        this.f31730Y = c8340j;
        this.f31731Z = c10701g0;
        this.f31732o0 = c10730t0;
        this.f31733p0 = c10696e1;
        this.f31734q0 = c13421l;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        C13430u action = (C13430u) obj;
        AbstractC16544l.m18094g(action, "$this$action");
        C8365e0 c8365e0 = this.f31730Y.f25996a;
        if (c8365e0.f26059Z == EnumC8363d0.f26046Y) {
            action.f42521b = C10701g0.m11026l(this.f31731Z, true, false, 14);
        } else {
            C10730t0 c10730t0 = this.f31732o0;
            if (c10730t0.f31891i) {
                C13421l c13421l = this.f31734q0;
                boolean z6 = c10730t0.f31887e;
                C10696e1 c10696e1 = this.f31733p0;
                if (z6) {
                    c10696e1.m11024h(c13421l, C10732u0.f31908a);
                } else {
                    c10696e1.m11024h(c13421l, new C10736w0(new InternalErrorInfo.PermissionErrorInfo("User rejected camera permissions for the selfie flow.")));
                }
            } else {
                action.f42521b = new C10686b0(null);
            }
        }
        return C17296C.f55119a;
    }
}
