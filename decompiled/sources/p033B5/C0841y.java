package p033B5;

import p025An.InterfaceC0567D;
import p045Bj.C1312j;
import p530Vi.C8298F;
import p530Vi.C8300H;
import p571X9.AbstractC9221V;
import p594Y9.AbstractC9852a3;
import p972qm.AbstractC18768a;
import p972qm.InterfaceC18775h;
import p972qm.InterfaceC18776i;

/* JADX INFO: renamed from: B5.y */
/* JADX INFO: loaded from: classes.dex */
public final class C0841y extends AbstractC18768a implements InterfaceC0567D {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f2347Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0841y(InterfaceC18775h interfaceC18775h, int i10) {
        super(interfaceC18775h);
        this.f2347Y = i10;
    }

    @Override // p025An.InterfaceC0567D
    public final void handleException(InterfaceC18776i interfaceC18776i, Throwable th2) {
        switch (this.f2347Y) {
            case 3:
                AbstractC9852a3.m10501b(null, th2, "Caught Exception in Analytics Scope", "analytics_mobile.invoke.error", AbstractC9221V.m9790b(th2), new C1312j(1, th2));
                break;
            case 4:
                C8298F c8298f = C8300H.f25866q0;
                if (c8298f != null) {
                    c8298f.invoke(new Exception("Caught Exception in Telemetry Scope: " + th2.getMessage(), th2));
                }
                break;
        }
    }

    /* JADX INFO: renamed from: V0 */
    private final void m1900V0(InterfaceC18776i interfaceC18776i, Throwable th2) {
    }

    /* JADX INFO: renamed from: W0 */
    private final void m1901W0(InterfaceC18776i interfaceC18776i, Throwable th2) {
    }

    /* JADX INFO: renamed from: X0 */
    private final void m1902X0(InterfaceC18776i interfaceC18776i, Throwable th2) {
    }

    /* JADX INFO: renamed from: Y0 */
    private final void m1903Y0(InterfaceC18776i interfaceC18776i, Throwable th2) {
    }
}
