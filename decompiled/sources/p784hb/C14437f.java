package p784hb;

import android.content.Intent;
import android.media.AudioAttributes;
import android.os.Handler;
import android.os.Looper;
import android.os.ResultReceiver;
import com.android.billingclient.api.ProxyBillingActivityV2;
import com.google.android.gms.internal.play_billing.AbstractC11988o0;
import io.sentry.C15109B;
import io.sentry.C15524y1;
import io.sentry.C15526z0;
import io.sentry.EnumC15375i1;
import io.sentry.InterfaceC15127H;
import io.sentry.InterfaceC15143M0;
import io.sentry.android.core.C15243l;
import java.io.File;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import no.ThreadFactoryC17707a;
import p001A.C0031P0;
import p025An.InterfaceC0620k;
import p1016t3.AbstractC19776c;
import p1016t3.AbstractC19777d;
import p1016t3.C19778e;
import p1073w3.AbstractC20817s;
import p200Hm.C3508g;
import p392Q0.C6546d;
import p544W9.AbstractC8483G3;
import p775h2.AbstractC14376f;
import p841k.C16281a;
import p841k.InterfaceC16282b;
import p860l0.C16660B;
import p999s.InterfaceC19323V;

/* JADX INFO: renamed from: hb.f */
/* JADX INFO: loaded from: classes.dex */
public class C14437f implements InterfaceC14439h, InterfaceC15143M0, InterfaceC16282b, InterfaceC19323V {

    /* JADX INFO: renamed from: Y */
    public final Object f45413Y;

    public /* synthetic */ C14437f(Object obj) {
        this.f45413Y = obj;
    }

    @Override // io.sentry.InterfaceC15143M0
    /* JADX INFO: renamed from: E */
    public C0031P0 mo10195E(C15109B c15109b, C15524y1 c15524y1) {
        AbstractC8483G3.m9133c(c15109b, "Hub is required");
        AbstractC8483G3.m9133c(c15524y1, "SentryOptions is required");
        String outboxPath = ((C15243l) this.f45413Y).f47568Y.getOutboxPath();
        if (outboxPath == null || !AbstractC14376f.m15836b(outboxPath, c15524y1.getLogger())) {
            c15524y1.getLogger().mo16298o(EnumC15375i1.ERROR, "No outbox dir path is defined in options.", new Object[0]);
            return null;
        }
        return new C0031P0(c15524y1.getLogger(), outboxPath, new C15526z0(c15109b, c15524y1.getEnvelopeReader(), c15524y1.getSerializer(), c15524y1.getLogger(), c15524y1.getFlushTimeoutMillis(), c15524y1.getMaxQueueSize()), new File(outboxPath), 5);
    }

    @Override // io.sentry.InterfaceC15143M0
    /* JADX INFO: renamed from: I */
    public /* synthetic */ boolean mo10198I(String str, InterfaceC15127H interfaceC15127H) {
        return AbstractC14376f.m15836b(str, interfaceC15127H);
    }

    @Override // p841k.InterfaceC16282b
    /* JADX INFO: renamed from: d */
    public void mo3484d(Object obj) {
        C16281a c16281a = (C16281a) obj;
        ProxyBillingActivityV2 proxyBillingActivityV2 = (ProxyBillingActivityV2) this.f45413Y;
        proxyBillingActivityV2.getClass();
        Intent intent = c16281a.f50449Z;
        int i10 = AbstractC11988o0.m13509d(intent, "ProxyBillingActivityV2").f50151a;
        ResultReceiver resultReceiver = proxyBillingActivityV2.f35949J0;
        if (resultReceiver != null) {
            resultReceiver.send(i10, intent == null ? null : intent.getExtras());
        }
        int i11 = c16281a.f50448Y;
        if (i11 != -1 || i10 != 0) {
            AbstractC11988o0.m13512g("ProxyBillingActivityV2", "External offer dialog finished with resultCode: " + i11 + " and billing's responseCode: " + i10);
        }
        proxyBillingActivityV2.finish();
    }

    /* JADX INFO: renamed from: e */
    public void m15957e(CancellationException cancellationException) {
        C6546d c6546d = (C6546d) this.f45413Y;
        int i10 = c6546d.f21184o0;
        InterfaceC0620k[] interfaceC0620kArr = new InterfaceC0620k[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            interfaceC0620kArr[i11] = ((C16660B) c6546d.f21182Y[i11]).f53359b;
        }
        for (int i12 = 0; i12 < i10; i12++) {
            interfaceC0620kArr[i12].mo1244b(cancellationException);
        }
        if (!c6546d.m7108m()) {
            throw new IllegalStateException("uncancelled requests present");
        }
    }

    /* JADX INFO: renamed from: f */
    public void m15958f() {
        C6546d c6546d = (C6546d) this.f45413Y;
        int i10 = 0;
        int i11 = new C3508g(0, c6546d.f21184o0 - 1, 1).f10592Z;
        if (i11 >= 0) {
            while (true) {
                ((C16660B) c6546d.f21182Y[i10]).f53359b.resumeWith(C17296C.f55119a);
                if (i10 == i11) {
                    break;
                } else {
                    i10++;
                }
            }
        }
        c6546d.m7104i();
    }

    @Override // p784hb.InterfaceC14439h
    /* JADX INFO: renamed from: t */
    public Object mo15959t() {
        String[] strArr = {"GmsCore_OpenSSL", "AndroidOpenSSL"};
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < 2; i10++) {
            Provider provider = Security.getProvider(strArr[i10]);
            if (provider != null) {
                arrayList.add(provider);
            }
        }
        Iterator it = arrayList.iterator();
        Exception exc = null;
        while (true) {
            boolean zHasNext = it.hasNext();
            InterfaceC14441j interfaceC14441j = (InterfaceC14441j) this.f45413Y;
            if (!zHasNext) {
                return interfaceC14441j.mo3663A(null);
            }
            try {
                return interfaceC14441j.mo3663A((Provider) it.next());
            } catch (Exception e10) {
                if (exc == null) {
                    exc = e10;
                }
            }
        }
    }

    public C14437f(int i10) {
        switch (i10) {
            case 4:
                this.f45413Y = new C6546d(new C16660B[16]);
                break;
            default:
                Looper mainLooper = Looper.getMainLooper();
                AbstractC16544l.m18093f(mainLooper, "getMainLooper()");
                this.f45413Y = new Handler(mainLooper);
                break;
        }
    }

    public C14437f(C19778e c19778e) {
        AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(c19778e.f62666a).setFlags(0).setUsage(c19778e.f62667b);
        int i10 = AbstractC20817s.f66106a;
        if (i10 >= 29) {
            AbstractC19776c.m20734a(usage, 1);
        }
        if (i10 >= 32) {
            AbstractC19777d.m20735a(usage, 0);
        }
        this.f45413Y = usage.build();
    }

    public C14437f(ThreadFactoryC17707a threadFactoryC17707a) {
        this.f45413Y = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), threadFactoryC17707a);
    }

    @Override // p999s.InterfaceC19323V
    /* JADX INFO: renamed from: a */
    public void mo15954a(int i10) {
    }

    @Override // p999s.InterfaceC19323V
    /* JADX INFO: renamed from: b */
    public void mo15955b(int i10) {
    }

    @Override // p999s.InterfaceC19323V
    /* JADX INFO: renamed from: c */
    public void mo15956c(int i10, float f10) {
    }
}
