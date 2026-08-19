package p1036u9;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import p1009s9.C19501d;
import p1022t9.C19819d;
import p1139z0.C21585H;
import p746fa.C13599h;

/* JADX INFO: renamed from: u9.B */
/* JADX INFO: loaded from: classes.dex */
public final class C20150B extends AbstractC20174t {

    /* JADX INFO: renamed from: b */
    public final C13599h f63831b;

    public C20150B(AbstractC20163i abstractC20163i, C13599h c13599h) {
        super(4);
        this.f63831b = c13599h;
    }

    @Override // p1036u9.AbstractC20151C
    /* JADX INFO: renamed from: a */
    public final void mo20963a(Status status) {
        this.f63831b.m15115c(new C19819d(status));
    }

    @Override // p1036u9.AbstractC20151C
    /* JADX INFO: renamed from: b */
    public final void mo20964b(RuntimeException runtimeException) {
        this.f63831b.m15115c(runtimeException);
    }

    @Override // p1036u9.AbstractC20151C
    /* JADX INFO: renamed from: c */
    public final void mo20965c(C20171q c20171q) throws DeadObjectException {
        try {
            m20969h(c20171q);
        } catch (DeadObjectException e10) {
            mo20963a(AbstractC20151C.m20970e(e10));
            throw e10;
        } catch (RemoteException e11) {
            mo20963a(AbstractC20151C.m20970e(e11));
        } catch (RuntimeException e12) {
            this.f63831b.m15115c(e12);
        }
    }

    @Override // p1036u9.AbstractC20174t
    /* JADX INFO: renamed from: f */
    public final boolean mo20967f(C20171q c20171q) {
        return false;
    }

    @Override // p1036u9.AbstractC20174t
    /* JADX INFO: renamed from: g */
    public final C19501d[] mo20968g(C20171q c20171q) {
        return null;
    }

    /* JADX INFO: renamed from: h */
    public final void m20969h(C20171q c20171q) {
        this.f63831b.m15116d(Boolean.FALSE);
    }

    @Override // p1036u9.AbstractC20151C
    /* JADX INFO: renamed from: d */
    public final /* bridge */ /* synthetic */ void mo20966d(C21585H c21585h, boolean z6) {
    }
}
