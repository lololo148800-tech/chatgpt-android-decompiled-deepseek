package p1036u9;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import p1022t9.InterfaceC19827l;
import p1060v9.AbstractC20502t;
import p1139z0.C21585H;
import p746fa.C13599h;
import p846k4.C16340i;

/* JADX INFO: renamed from: u9.m */
/* JADX INFO: loaded from: classes.dex */
public final class C20167m {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f63871a = 1;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ BasePendingResult f63872b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f63873c;

    public C20167m(BasePendingResult basePendingResult, C13599h c13599h, C16340i c16340i) {
        this.f63872b = basePendingResult;
        this.f63873c = c13599h;
    }

    /* JADX INFO: renamed from: a */
    public final void m20985a(Status status) {
        InterfaceC19827l interfaceC19827l;
        switch (this.f63871a) {
            case 0:
                ((Map) ((C21585H) this.f63873c).f68344Z).remove(this.f63872b);
                return;
            default:
                if (!status.m13182b()) {
                    ((C13599h) this.f63873c).m15113a(AbstractC20502t.m21162m(status));
                    return;
                }
                BasePendingResult basePendingResult = this.f63872b;
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                AbstractC20502t.m21159j("Result has already been consumed.", !basePendingResult.f36063g);
                try {
                    if (!basePendingResult.f36058b.await(0L, timeUnit)) {
                        basePendingResult.m13185e(Status.f36050t0);
                    }
                    break;
                } catch (InterruptedException unused) {
                    basePendingResult.m13185e(Status.f36048r0);
                }
                AbstractC20502t.m21159j("Result is not ready.", basePendingResult.m13186f());
                synchronized (basePendingResult.f36057a) {
                    AbstractC20502t.m21159j("Result has already been consumed.", !basePendingResult.f36063g);
                    AbstractC20502t.m21159j("Result is not ready.", basePendingResult.m13186f());
                    interfaceC19827l = basePendingResult.f36061e;
                    basePendingResult.f36061e = null;
                    basePendingResult.f36063g = true;
                    break;
                }
                if (basePendingResult.f36060d.getAndSet(null) != null) {
                    throw new ClassCastException();
                }
                AbstractC20502t.m21157h(interfaceC19827l);
                ((C13599h) this.f63873c).m15114b(null);
                return;
        }
    }

    public C20167m(C21585H c21585h, BasePendingResult basePendingResult) {
        this.f63873c = c21585h;
        this.f63872b = basePendingResult;
    }
}
