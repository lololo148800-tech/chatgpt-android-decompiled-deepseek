package p1009s9;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.Message;
import io.sentry.android.core.AbstractC15256t;
import java.util.concurrent.atomic.AtomicBoolean;
import p377P9.HandlerC6378d;

/* JADX INFO: renamed from: s9.k */
/* JADX INFO: loaded from: classes.dex */
public final class HandlerC19508k extends HandlerC6378d {

    /* JADX INFO: renamed from: a */
    public final Context f61964a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C19502e f61965b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC19508k(C19502e c19502e, Context context) {
        super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper(), 0);
        this.f61965b = c19502e;
        this.f61964a = context.getApplicationContext();
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i10 = message.what;
        if (i10 != 1) {
            AbstractC15256t.m16482t("GoogleApiAvailability", "Don't know how to handle this message: " + i10);
            return;
        }
        int i11 = C19503f.f61951a;
        C19502e c19502e = this.f61965b;
        Context context = this.f61964a;
        int iM20602c = c19502e.m20602c(context, i11);
        AtomicBoolean atomicBoolean = AbstractC19505h.f61953a;
        if (iM20602c == 1 || iM20602c == 2 || iM20602c == 3 || iM20602c == 9) {
            Intent intentM20601b = c19502e.m20601b(iM20602c, context, "n");
            c19502e.m20598g(context, iM20602c, intentM20601b == null ? null : PendingIntent.getActivity(context, 0, intentM20601b, 201326592));
        }
    }
}
