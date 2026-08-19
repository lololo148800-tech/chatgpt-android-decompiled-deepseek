package p985r9;

import android.content.Context;
import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import io.sentry.android.core.RunnableC15195M;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import p658b5.C11232c;

/* JADX INFO: renamed from: r9.j */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC18900j implements Runnable {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f60253Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ ServiceConnectionC18901k f60254Z;

    public /* synthetic */ RunnableC18900j(ServiceConnectionC18901k serviceConnectionC18901k, int i10) {
        this.f60253Y = i10;
        this.f60254Z = serviceConnectionC18901k;
    }

    /* JADX INFO: renamed from: a */
    private final void m20208a() {
        ServiceConnectionC18901k serviceConnectionC18901k = this.f60254Z;
        synchronized (serviceConnectionC18901k) {
            if (serviceConnectionC18901k.f60255a == 1) {
                serviceConnectionC18901k.m20209a(1, "Timed out while binding");
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f60253Y) {
            case 0:
                break;
            case 1:
                m20208a();
                return;
            default:
                this.f60254Z.m20209a(2, "Service disconnected");
                return;
        }
        while (true) {
            ServiceConnectionC18901k serviceConnectionC18901k = this.f60254Z;
            synchronized (serviceConnectionC18901k) {
                try {
                    if (serviceConnectionC18901k.f60255a != 2) {
                        return;
                    }
                    if (serviceConnectionC18901k.f60258d.isEmpty()) {
                        serviceConnectionC18901k.m20211c();
                        return;
                    }
                    C18902l c18902l = (C18902l) serviceConnectionC18901k.f60258d.poll();
                    serviceConnectionC18901k.f60259e.put(c18902l.f60261a, c18902l);
                    ((ScheduledExecutorService) serviceConnectionC18901k.f60260f.f60269c).schedule(new RunnableC15195M(serviceConnectionC18901k, c18902l, false, 13), 30L, TimeUnit.SECONDS);
                    if (Log.isLoggable("MessengerIpcClient", 3)) {
                        Log.d("MessengerIpcClient", "Sending ".concat(String.valueOf(c18902l)));
                    }
                    C18903m c18903m = serviceConnectionC18901k.f60260f;
                    Messenger messenger = serviceConnectionC18901k.f60256b;
                    int i10 = c18902l.f60263c;
                    Context context = (Context) c18903m.f60268b;
                    Message messageObtain = Message.obtain();
                    messageObtain.what = i10;
                    messageObtain.arg1 = c18902l.f60261a;
                    messageObtain.replyTo = messenger;
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("oneWay", c18902l.m20213a());
                    bundle.putString("pkg", context.getPackageName());
                    bundle.putBundle("data", c18902l.f60264d);
                    messageObtain.setData(bundle);
                    try {
                        C11232c c11232c = serviceConnectionC18901k.f60257c;
                        Messenger messenger2 = (Messenger) c11232c.f33996Y;
                        if (messenger2 != null) {
                            messenger2.send(messageObtain);
                        } else {
                            C18897g c18897g = (C18897g) c11232c.f33997Z;
                            if (c18897g == null) {
                                throw new IllegalStateException("Both messengers are null");
                            }
                            Messenger messenger3 = c18897g.f60244Y;
                            messenger3.getClass();
                            messenger3.send(messageObtain);
                        }
                    } catch (RemoteException e10) {
                        serviceConnectionC18901k.m20209a(2, e10.getMessage());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }
}
