package p1009s9;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p1060v9.AbstractC20502t;

/* JADX INFO: renamed from: s9.a */
/* JADX INFO: loaded from: classes.dex */
public final class ServiceConnectionC19498a implements ServiceConnection {

    /* JADX INFO: renamed from: a */
    public boolean f61936a = false;

    /* JADX INFO: renamed from: b */
    public final LinkedBlockingQueue f61937b = new LinkedBlockingQueue();

    /* JADX INFO: renamed from: a */
    public final IBinder m20592a(TimeUnit timeUnit) throws TimeoutException {
        AbstractC20502t.m21156g("BlockingServiceConnection.getServiceWithTimeout() called on main thread");
        if (this.f61936a) {
            throw new IllegalStateException("Cannot call get on this connection more than once");
        }
        this.f61936a = true;
        IBinder iBinder = (IBinder) this.f61937b.poll(10000L, timeUnit);
        if (iBinder != null) {
            return iBinder;
        }
        throw new TimeoutException("Timed out waiting for the service connection");
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f61937b.add(iBinder);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
    }
}
