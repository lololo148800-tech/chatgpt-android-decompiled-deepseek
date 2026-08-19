package p001A;

import p109E3.C2292p;
import p140Fa.C2685e;
import p178H.C3124Q;
import p228J.AbstractC3842j;
import p228J.InterfaceC3854p;
import p523V9.AbstractC8072d6;
import p610Z1.C10142i;

/* JADX INFO: renamed from: A.X */
/* JADX INFO: loaded from: classes.dex */
public final class C0045X extends AbstractC3842j {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f215a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C10142i f216b;

    public /* synthetic */ C0045X(C10142i c10142i, int i10) {
        this.f215a = i10;
        this.f216b = c10142i;
    }

    @Override // p228J.AbstractC3842j
    /* JADX INFO: renamed from: a */
    public final void mo7a(int i10) {
        switch (this.f215a) {
            case 0:
                this.f216b.m10748b(new C3124Q("Capture request is cancelled because camera is closed", null));
                break;
            default:
                C10142i c10142i = this.f216b;
                if (c10142i != null) {
                    c10142i.m10748b(new C2292p("Camera is closed"));
                }
                break;
        }
    }

    @Override // p228J.AbstractC3842j
    /* JADX INFO: renamed from: b */
    public final void mo8b(int i10, InterfaceC3854p interfaceC3854p) {
        switch (this.f215a) {
            case 0:
                this.f216b.m10747a(null);
                break;
            default:
                C10142i c10142i = this.f216b;
                AbstractC8072d6.m8486c("FocusMeteringControl", "triggerAePrecapture: triggering capture request completed");
                c10142i.m10747a(null);
                break;
        }
    }

    @Override // p228J.AbstractC3842j
    /* JADX INFO: renamed from: c */
    public final void mo9c(int i10, C2685e c2685e) {
        switch (this.f215a) {
            case 0:
                this.f216b.m10748b(new C3124Q("Capture request failed with reason ".concat("ERROR"), null));
                break;
            default:
                this.f216b.m10748b(new C2292p());
                break;
        }
    }
}
