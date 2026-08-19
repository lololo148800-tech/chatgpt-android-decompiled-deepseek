package p1036u9;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import java.util.Map;
import p1009s9.C19501d;
import p1060v9.AbstractC20502t;
import p1139z0.C21585H;
import p166Ga.C3029c;
import p746fa.C13599h;
import p849k7.C16361n;

/* JADX INFO: renamed from: u9.A */
/* JADX INFO: loaded from: classes.dex */
public final class C20149A extends AbstractC20174t {

    /* JADX INFO: renamed from: b */
    public final C3029c f63828b;

    /* JADX INFO: renamed from: c */
    public final C13599h f63829c;

    /* JADX INFO: renamed from: d */
    public final C16361n f63830d;

    public C20149A(int i10, C3029c c3029c, C13599h c13599h, C16361n c16361n) {
        super(i10);
        this.f63829c = c13599h;
        this.f63828b = c3029c;
        this.f63830d = c16361n;
        if (i10 == 2 && c3029c.f9118c) {
            throw new IllegalArgumentException("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
        }
    }

    @Override // p1036u9.AbstractC20151C
    /* JADX INFO: renamed from: a */
    public final void mo20963a(Status status) {
        this.f63830d.getClass();
        this.f63829c.m15115c(AbstractC20502t.m21162m(status));
    }

    @Override // p1036u9.AbstractC20151C
    /* JADX INFO: renamed from: b */
    public final void mo20964b(RuntimeException runtimeException) {
        this.f63829c.m15115c(runtimeException);
    }

    @Override // p1036u9.AbstractC20151C
    /* JADX INFO: renamed from: c */
    public final void mo20965c(C20171q c20171q) throws DeadObjectException {
        C13599h c13599h = this.f63829c;
        try {
            C3029c c3029c = this.f63828b;
            ((InterfaceC20165k) ((C3029c) c3029c.f9120e).f9119d).accept(c20171q.f63885b, c13599h);
        } catch (DeadObjectException e10) {
            throw e10;
        } catch (RemoteException e11) {
            mo20963a(AbstractC20151C.m20970e(e11));
        } catch (RuntimeException e12) {
            c13599h.m15115c(e12);
        }
    }

    @Override // p1036u9.AbstractC20151C
    /* JADX INFO: renamed from: d */
    public final void mo20966d(C21585H c21585h, boolean z6) {
        Boolean boolValueOf = Boolean.valueOf(z6);
        Map map = (Map) c21585h.f68345o0;
        C13599h c13599h = this.f63829c;
        map.put(c13599h, boolValueOf);
        c13599h.f42961a.m15122a(new C20168n(c21585h, c13599h));
    }

    @Override // p1036u9.AbstractC20174t
    /* JADX INFO: renamed from: f */
    public final boolean mo20967f(C20171q c20171q) {
        return this.f63828b.f9118c;
    }

    @Override // p1036u9.AbstractC20174t
    /* JADX INFO: renamed from: g */
    public final C19501d[] mo20968g(C20171q c20171q) {
        return (C19501d[]) this.f63828b.f9119d;
    }
}
