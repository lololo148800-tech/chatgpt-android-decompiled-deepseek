package p357Oa;

import android.os.IBinder;
import android.os.RemoteException;
import java.util.Iterator;
import p524Va.AbstractRunnableC8253e;
import p524Va.C8256h;
import p572Xa.AbstractRunnableC9428v;
import p572Xa.C9408b;
import p746fa.C13599h;

/* JADX INFO: renamed from: Oa.j */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C6157j implements IBinder.DeathRecipient {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f20041a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f20042b;

    public /* synthetic */ C6157j(Object obj, int i10) {
        this.f20041a = i10;
        this.f20042b = obj;
    }

    /* JADX INFO: renamed from: a */
    private final void m6714a() {
        C6161n c6161n = (C6161n) this.f20042b;
        c6161n.f20051b.m7758K("reportBinderDeath", new Object[0]);
        if (c6161n.f20058i.get() != null) {
            throw new ClassCastException();
        }
        c6161n.f20051b.m7758K("%s : Binder has died.", c6161n.f20052c);
        for (AbstractRunnableC6156i abstractRunnableC6156i : c6161n.f20053d) {
            RemoteException remoteException = new RemoteException(String.valueOf(c6161n.f20052c).concat(" : Binder has died."));
            C13599h c13599h = abstractRunnableC6156i.f20040Y;
            if (c13599h != null) {
                c13599h.m15115c(remoteException);
            }
        }
        c6161n.f20053d.clear();
        synchronized (c6161n.f20055f) {
            c6161n.m6719d();
        }
    }

    /* JADX INFO: renamed from: b */
    private final void m6715b() {
        C8256h c8256h = (C8256h) this.f20042b;
        c8256h.f25744b.m5360c("reportBinderDeath", new Object[0]);
        if (c8256h.f25751i.get() != null) {
            throw new ClassCastException();
        }
        c8256h.f25744b.m5360c("%s : Binder has died.", c8256h.f25745c);
        for (AbstractRunnableC8253e abstractRunnableC8253e : c8256h.f25746d) {
            RemoteException remoteException = new RemoteException(String.valueOf(c8256h.f25745c).concat(" : Binder has died."));
            C13599h c13599h = abstractRunnableC8253e.f25736Y;
            if (c13599h != null) {
                c13599h.m15115c(remoteException);
            }
        }
        c8256h.f25746d.clear();
        synchronized (c8256h.f25748f) {
            c8256h.m8893c();
        }
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        switch (this.f20041a) {
            case 0:
                m6714a();
                return;
            case 1:
                m6715b();
                return;
            default:
                C9408b c9408b = (C9408b) this.f20042b;
                c9408b.f28368b.m10000b("reportBinderDeath", new Object[0]);
                if (c9408b.f28376j.get() != null) {
                    throw new ClassCastException();
                }
                c9408b.f28368b.m10000b("%s : Binder has died.", c9408b.f28369c);
                Iterator it = c9408b.f28370d.iterator();
                while (it.hasNext()) {
                    ((AbstractRunnableC9428v) it.next()).mo7276a(new RemoteException(String.valueOf(c9408b.f28369c).concat(" : Binder has died.")));
                }
                c9408b.f28370d.clear();
                synchronized (c9408b.f28372f) {
                    c9408b.m9987d();
                    break;
                }
                return;
        }
    }
}
