package p1036u9;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import io.sentry.android.core.AbstractC15256t;
import java.util.Map;
import p1022t9.InterfaceC19818c;
import p1139z0.C21585H;
import p160G5.p161rK.TVCuK;
import p571X9.AbstractC9306j0;
import p960q9.C18653g;

/* JADX INFO: renamed from: u9.z */
/* JADX INFO: loaded from: classes.dex */
public final class C20180z extends AbstractC20151C {

    /* JADX INFO: renamed from: b */
    public final C18653g f63920b;

    public C20180z(C18653g c18653g) {
        super(1);
        this.f63920b = c18653g;
    }

    @Override // p1036u9.AbstractC20151C
    /* JADX INFO: renamed from: a */
    public final void mo20963a(Status status) {
        try {
            this.f63920b.m20019i(status);
        } catch (IllegalStateException e10) {
            AbstractC15256t.m16483u("ApiCallRunner", "Exception reporting failure", e10);
        }
    }

    @Override // p1036u9.AbstractC20151C
    /* JADX INFO: renamed from: c */
    public final void mo20965c(C20171q c20171q) throws DeadObjectException {
        try {
            C18653g c18653g = this.f63920b;
            InterfaceC19818c interfaceC19818c = c20171q.f63885b;
            c18653g.getClass();
            try {
                c18653g.m20018h(interfaceC19818c);
            } catch (DeadObjectException e10) {
                c18653g.m20019i(new Status(8, e10.getLocalizedMessage(), null, null));
                throw e10;
            } catch (RemoteException e11) {
                c18653g.m20019i(new Status(8, e11.getLocalizedMessage(), null, null));
            }
        } catch (RuntimeException e12) {
            mo20964b(e12);
        }
    }

    @Override // p1036u9.AbstractC20151C
    /* JADX INFO: renamed from: d */
    public final void mo20966d(C21585H c21585h, boolean z6) {
        Boolean boolValueOf = Boolean.valueOf(z6);
        Map map = (Map) c21585h.f68344Z;
        C18653g c18653g = this.f63920b;
        map.put(c18653g, boolValueOf);
        c18653g.m13183c(new C20167m(c21585h, c18653g));
    }

    @Override // p1036u9.AbstractC20151C
    /* JADX INFO: renamed from: b */
    public final void mo20964b(RuntimeException runtimeException) {
        try {
            this.f63920b.m20019i(new Status(10, AbstractC9306j0.m9890i(runtimeException.getClass().getSimpleName(), ": ", runtimeException.getLocalizedMessage()), null, null));
        } catch (IllegalStateException e10) {
            AbstractC15256t.m16483u(TVCuK.NriPHMuPGSd, "Exception reporting failure", e10);
        }
    }
}
