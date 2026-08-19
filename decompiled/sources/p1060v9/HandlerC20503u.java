package p1060v9;

import android.app.PendingIntent;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.google.android.gms.common.internal.AbstractC11852a;
import io.sentry.android.core.AbstractC15256t;
import p1009s9.C19499b;
import p1022t9.InterfaceC19822g;
import p377P9.HandlerC6378d;

/* JADX INFO: renamed from: v9.u */
/* JADX INFO: loaded from: classes.dex */
public final class HandlerC20503u extends HandlerC6378d {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AbstractC11852a f65102a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC20503u(AbstractC11852a abstractC11852a, Looper looper) {
        super(looper, 2);
        this.f65102a = abstractC11852a;
    }

    /* JADX WARN: Code duplicated, block: B:104:0x018f  */
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        Boolean bool;
        if (this.f65102a.f36089v.get() != message.arg1) {
            int i10 = message.what;
            if (i10 == 2 || i10 == 1 || i10 == 7) {
                AbstractC20499q abstractC20499q = (AbstractC20499q) message.obj;
                abstractC20499q.getClass();
                abstractC20499q.m21148d();
                return;
            }
            return;
        }
        int i11 = message.what;
        if (i11 != 1 && i11 != 7) {
            if (i11 == 4) {
                this.f65102a.getClass();
            } else if (i11 == 5) {
            }
            if (!this.f65102a.mo13200d()) {
                AbstractC20499q abstractC20499q2 = (AbstractC20499q) message.obj;
                abstractC20499q2.getClass();
                abstractC20499q2.m21148d();
                return;
            }
        } else if (!this.f65102a.mo13200d()) {
            AbstractC20499q abstractC20499q3 = (AbstractC20499q) message.obj;
            abstractC20499q3.getClass();
            abstractC20499q3.m21148d();
            return;
        }
        int i12 = message.what;
        if (i12 == 4) {
            AbstractC11852a abstractC11852a = this.f65102a;
            abstractC11852a.f36086s = new C19499b(message.arg2);
            if (!abstractC11852a.f36087t && !TextUtils.isEmpty(abstractC11852a.mo1033r()) && !TextUtils.isEmpty(null)) {
                try {
                    Class.forName(abstractC11852a.mo1033r());
                    AbstractC11852a abstractC11852a2 = this.f65102a;
                    if (!abstractC11852a2.f36087t) {
                        abstractC11852a2.m13210y(3, null);
                        return;
                    }
                } catch (ClassNotFoundException unused) {
                }
            }
            AbstractC11852a abstractC11852a3 = this.f65102a;
            C19499b c19499b = abstractC11852a3.f36086s;
            if (c19499b == null) {
                c19499b = new C19499b(8);
            }
            abstractC11852a3.f36076i.mo211d(c19499b);
            this.f65102a.getClass();
            System.currentTimeMillis();
            return;
        }
        if (i12 == 5) {
            AbstractC11852a abstractC11852a4 = this.f65102a;
            C19499b c19499b2 = abstractC11852a4.f36086s;
            if (c19499b2 == null) {
                c19499b2 = new C19499b(8);
            }
            abstractC11852a4.f36076i.mo211d(c19499b2);
            this.f65102a.getClass();
            System.currentTimeMillis();
            return;
        }
        if (i12 == 3) {
            Object obj = message.obj;
            this.f65102a.f36076i.mo211d(new C19499b(message.arg2, obj instanceof PendingIntent ? (PendingIntent) obj : null));
            this.f65102a.getClass();
            System.currentTimeMillis();
            return;
        }
        if (i12 == 6) {
            this.f65102a.m13210y(5, null);
            C20491i c20491i = this.f65102a.f36081n;
            if (c20491i != null) {
                ((InterfaceC19822g) c20491i.f65068Y).mo20771i(message.arg2);
            }
            this.f65102a.mo7733u();
            AbstractC11852a.m13196x(this.f65102a, 5, 1, null);
            return;
        }
        if (i12 == 2 && !this.f65102a.mo13197a()) {
            AbstractC20499q abstractC20499q4 = (AbstractC20499q) message.obj;
            abstractC20499q4.getClass();
            abstractC20499q4.m21148d();
            return;
        }
        int i13 = message.what;
        if (i13 != 2 && i13 != 1 && i13 != 7) {
            AbstractC15256t.m16485w("GmsClient", AbstractC10763a.m11048f(i13, "Don't know how to handle message: "), new Exception());
            return;
        }
        AbstractC20499q abstractC20499q5 = (AbstractC20499q) message.obj;
        synchronized (abstractC20499q5) {
            try {
                bool = abstractC20499q5.f65092a;
                if (abstractC20499q5.f65093b) {
                    AbstractC15256t.m16482t("GmsClient", "Callback proxy " + abstractC20499q5.toString() + " being reused. This is not safe.");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (bool != null) {
            AbstractC11852a abstractC11852a5 = abstractC20499q5.f65097f;
            int i14 = abstractC20499q5.f65095d;
            if (i14 != 0) {
                abstractC11852a5.m13210y(1, null);
                Bundle bundle = abstractC20499q5.f65096e;
                abstractC20499q5.mo21145a(new C19499b(i14, bundle != null ? (PendingIntent) bundle.getParcelable("pendingIntent") : null));
            } else if (!abstractC20499q5.mo21146b()) {
                abstractC11852a5.m13210y(1, null);
                abstractC20499q5.mo21145a(new C19499b(8, null));
            }
        }
        synchronized (abstractC20499q5) {
            abstractC20499q5.f65093b = true;
        }
        abstractC20499q5.m21148d();
    }
}
