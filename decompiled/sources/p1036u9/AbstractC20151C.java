package p1036u9;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import p1139z0.C21585H;

/* JADX INFO: renamed from: u9.C */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC20151C {

    /* JADX INFO: renamed from: a */
    public final int f63832a;

    public AbstractC20151C(int i10) {
        this.f63832a = i10;
    }

    /* JADX INFO: renamed from: e */
    public static Status m20970e(RemoteException remoteException) {
        return new Status(19, remoteException.getClass().getSimpleName() + ": " + remoteException.getLocalizedMessage(), null, null);
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo20963a(Status status);

    /* JADX INFO: renamed from: b */
    public abstract void mo20964b(RuntimeException runtimeException);

    /* JADX INFO: renamed from: c */
    public abstract void mo20965c(C20171q c20171q);

    /* JADX INFO: renamed from: d */
    public abstract void mo20966d(C21585H c21585h, boolean z6);
}
