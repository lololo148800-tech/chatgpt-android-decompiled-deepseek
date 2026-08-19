package p835jg;

import android.app.AlertDialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import android.net.Uri;
import android.os.Build;
import com.google.android.gms.common.api.Status;
import io.sentry.android.core.RunnableC15195M;
import kotlin.jvm.internal.AbstractC16544l;
import p077Cn.C1757y;
import p077Cn.InterfaceC1758z;
import p1036u9.DialogInterfaceOnCancelListenerC20169o;
import p1113xn.C21317k;
import p195Hh.C3430e;
import p377P9.HandlerC6378d;
import p523V9.AbstractC8160o6;
import p913o2.AbstractC17807h;
import sk.C19665d;

/* JADX INFO: renamed from: jg.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C16206a extends BroadcastReceiver {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f50284a = 0;

    /* JADX INFO: renamed from: b */
    public Object f50285b;

    /* JADX INFO: renamed from: c */
    public final Object f50286c;

    public C16206a(C19665d c19665d) {
        this.f50286c = c19665d;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Object parcelableExtra;
        switch (this.f50284a) {
            case 0:
                AbstractC16544l.m18094g(context, "context");
                AbstractC16544l.m18094g(intent, "intent");
                if ("com.google.android.gms.auth.api.phone.SMS_RETRIEVED".equals(intent.getAction())) {
                    if (Build.VERSION.SDK_INT >= 34) {
                        parcelableExtra = AbstractC17807h.m19565b(intent, "com.google.android.gms.auth.api.phone.EXTRA_STATUS", Status.class);
                    } else {
                        parcelableExtra = intent.getParcelableExtra("com.google.android.gms.auth.api.phone.EXTRA_STATUS");
                        if (!Status.class.isInstance(parcelableExtra)) {
                            parcelableExtra = null;
                        }
                    }
                    Status status = (Status) parcelableExtra;
                    if (status == null) {
                        return;
                    }
                    C3430e c3430e = (C3430e) this.f50285b;
                    int i10 = status.f36052Y;
                    if (i10 != 0) {
                        if (i10 != 15) {
                            return;
                        }
                        AbstractC8160o6.m8726a(c3430e, "OTP retriever timed out", null, 6);
                        return;
                    }
                    String stringExtra = intent.getStringExtra("com.google.android.gms.auth.api.phone.EXTRA_SMS_MESSAGE");
                    C21317k c21317kM21662a = AbstractC16208c.f50291a.m21662a(0, stringExtra == null ? "" : stringExtra);
                    String strM21659c = c21317kM21662a != null ? c21317kM21662a.m21659c() : null;
                    AbstractC8160o6.m8726a(c3430e, AbstractC10763a.m11055m("OTP retriever message: ", stringExtra, " code: ", strM21659c), null, 6);
                    if (strM21659c != null) {
                        ((C1757y) ((InterfaceC1758z) this.f50286c)).f5030p0.mo2524p(strM21659c);
                        return;
                    }
                    return;
                }
                return;
            default:
                Uri data = intent.getData();
                if ("com.google.android.gms".equals(data != null ? data.getSchemeSpecificPart() : null)) {
                    C19665d c19665d = (C19665d) this.f50286c;
                    DialogInterfaceOnCancelListenerC20169o dialogInterfaceOnCancelListenerC20169o = (DialogInterfaceOnCancelListenerC20169o) ((RunnableC15195M) c19665d.f62330o0).f47349o0;
                    dialogInterfaceOnCancelListenerC20169o.f63878o0.set(null);
                    HandlerC6378d handlerC6378d = dialogInterfaceOnCancelListenerC20169o.f63882s0.f63870z0;
                    handlerC6378d.sendMessage(handlerC6378d.obtainMessage(3));
                    AlertDialog alertDialog = (AlertDialog) c19665d.f62329Z;
                    if (alertDialog.isShowing()) {
                        alertDialog.dismiss();
                    }
                    synchronized (this) {
                        try {
                            Context context2 = (Context) this.f50285b;
                            if (context2 != null) {
                                context2.unregisterReceiver(this);
                            }
                            this.f50285b = null;
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    return;
                }
                return;
        }
    }

    public C16206a(C3430e c3430e, InterfaceC1758z interfaceC1758z) {
        this.f50285b = c3430e;
        this.f50286c = interfaceC1758z;
    }
}
