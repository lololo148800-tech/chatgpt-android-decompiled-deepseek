package p985r9;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import fo.C13711h;
import io.sentry.android.core.AbstractC15256t;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import p399Q9.AbstractC6582a;
import p666bl.C11500p;
import p692d0.C12959L;
import p746fa.C13599h;
import p746fa.C13606o;
import p935p.RunnableC18260f;

/* JADX INFO: renamed from: r9.b */
/* JADX INFO: loaded from: classes.dex */
public final class C18892b {

    /* JADX INFO: renamed from: h */
    public static int f60228h;

    /* JADX INFO: renamed from: i */
    public static PendingIntent f60229i;

    /* JADX INFO: renamed from: j */
    public static final Pattern f60230j = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)");

    /* JADX INFO: renamed from: b */
    public final Context f60232b;

    /* JADX INFO: renamed from: c */
    public final C11500p f60233c;

    /* JADX INFO: renamed from: d */
    public final ScheduledThreadPoolExecutor f60234d;

    /* JADX INFO: renamed from: f */
    public Messenger f60236f;

    /* JADX INFO: renamed from: g */
    public C18897g f60237g;

    /* JADX INFO: renamed from: a */
    public final C12959L f60231a = new C12959L(0);

    /* JADX INFO: renamed from: e */
    public final Messenger f60235e = new Messenger(new HandlerC18895e(this, Looper.getMainLooper()));

    public C18892b(Context context) {
        this.f60232b = context;
        this.f60233c = new C11500p(context);
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
        scheduledThreadPoolExecutor.setKeepAliveTime(60L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f60234d = scheduledThreadPoolExecutor;
    }

    /* JADX INFO: renamed from: b */
    public static synchronized String m20204b() {
        int i10;
        i10 = f60228h;
        f60228h = i10 + 1;
        return Integer.toString(i10);
    }

    /* JADX INFO: renamed from: c */
    public static synchronized void m20205c(Context context, Intent intent) {
        try {
            if (f60229i == null) {
                Intent intent2 = new Intent();
                intent2.setPackage("com.google.example.invalidpackage");
                f60229i = PendingIntent.getBroadcast(context, 0, intent2, AbstractC6582a.f21268a);
            }
            intent.putExtra("app", f60229i);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:29:0x00b1  */
    /* JADX INFO: renamed from: a */
    public final C13606o m20206a(Bundle bundle) {
        String strM20204b = m20204b();
        C13599h c13599h = new C13599h();
        synchronized (this.f60231a) {
            this.f60231a.put(strM20204b, c13599h);
        }
        Intent intent = new Intent();
        intent.setPackage("com.google.android.gms");
        if (this.f60233c.m12900i() == 2) {
            intent.setAction("com.google.iid.TOKEN_REQUEST");
        } else {
            intent.setAction("com.google.android.c2dm.intent.REGISTER");
        }
        intent.putExtras(bundle);
        m20205c(this.f60232b, intent);
        intent.putExtra("kid", "|ID|" + strM20204b + "|");
        if (Log.isLoggable("Rpc", 3)) {
            Log.d("Rpc", "Sending ".concat(String.valueOf(intent.getExtras())));
        }
        intent.putExtra("google.messenger", this.f60235e);
        if (this.f60236f != null || this.f60237g != null) {
            Message messageObtain = Message.obtain();
            messageObtain.obj = intent;
            try {
                Messenger messenger = this.f60236f;
                if (messenger != null) {
                    messenger.send(messageObtain);
                } else {
                    Messenger messenger2 = this.f60237g.f60244Y;
                    messenger2.getClass();
                    messenger2.send(messageObtain);
                }
            } catch (RemoteException unused) {
                if (Log.isLoggable("Rpc", 3)) {
                    Log.d("Rpc", "Messenger failed, fallback to startService");
                }
                if (this.f60233c.m12900i() == 2) {
                    this.f60232b.sendBroadcast(intent);
                } else {
                    this.f60232b.startService(intent);
                }
            }
        } else if (this.f60233c.m12900i() == 2) {
            this.f60232b.sendBroadcast(intent);
        } else {
            this.f60232b.startService(intent);
        }
        c13599h.f42961a.m15123b(ExecutorC18898h.f60246o0, new C13711h(this, strM20204b, this.f60234d.schedule(new RunnableC18260f(c13599h, 3), 30L, TimeUnit.SECONDS), 26));
        return c13599h.f42961a;
    }

    /* JADX INFO: renamed from: d */
    public final void m20207d(String str, Bundle bundle) {
        synchronized (this.f60231a) {
            try {
                C13599h c13599h = (C13599h) this.f60231a.remove(str);
                if (c13599h != null) {
                    c13599h.m15114b(bundle);
                    return;
                }
                AbstractC15256t.m16482t("Rpc", "Missing callback for " + str);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
