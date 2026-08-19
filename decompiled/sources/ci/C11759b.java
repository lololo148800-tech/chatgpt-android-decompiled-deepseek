package ci;

import android.app.Application;
import android.os.Handler;
import android.os.Looper;
import com.openai.chatgpt.R;
import p092Dc.C1991h;
import p1155zi.EnumC21895B;
import p195Hh.C3430e;
import p523V9.AbstractC8168p6;

/* JADX INFO: renamed from: ci.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C11759b {

    /* JADX INFO: renamed from: a */
    public final Application f35660a;

    /* JADX INFO: renamed from: b */
    public final EnumC21895B f35661b;

    /* JADX INFO: renamed from: c */
    public final C1991h f35662c;

    /* JADX INFO: renamed from: d */
    public final C3430e f35663d = AbstractC8168p6.m8749b("DevNotificationManager", null);

    public C11759b(Application application, EnumC21895B enumC21895B, C1991h c1991h) {
        this.f35660a = application;
        this.f35661b = enumC21895B;
        this.f35662c = c1991h;
    }

    /* JADX INFO: renamed from: a */
    public final void m13053a(Exception exc) throws Exception {
        if (this.f35661b == EnumC21895B.f69419Z) {
            throw exc;
        }
        String message = exc.getMessage();
        if (message == null) {
            message = this.f35662c.m3160b(R.string.dev_notification_generic_error);
        }
        new Handler(Looper.getMainLooper()).post(new RunnableC11758a(this, message, 1));
        throw exc;
    }
}
