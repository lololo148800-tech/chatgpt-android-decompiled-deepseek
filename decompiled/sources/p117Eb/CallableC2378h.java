package p117Eb;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.gov.nist.core.Separators;
import android.util.Log;
import com.airbnb.lottie.LottieAnimationView;
import com.withpersona.sdk2.inquiry.network.HttpStatusCode;
import io.sentry.AbstractC15160S0;
import io.sentry.C15132I1;
import io.sentry.C15321b1;
import io.sentry.InterfaceC15151P;
import io.sentry.android.core.AbstractC15256t;
import io.sentry.android.core.C15185C;
import io.sentry.android.core.C15187E;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.clientreport.C15335c;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.org.webrtc.VideoEncoder;
import p520V5.AbstractC7785n;
import p557Wl.C8964t;

/* JADX INFO: renamed from: Eb.h */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class CallableC2378h implements Callable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f7397a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f7398b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f7399c;

    public /* synthetic */ CallableC2378h(Object obj, int i10, Object obj2) {
        this.f7397a = i10;
        this.f7398b = obj;
        this.f7399c = obj2;
    }

    /* JADX INFO: renamed from: a */
    private final Object m3476a() {
        String str;
        ServiceInfo serviceInfo;
        String str2;
        int i10;
        ComponentName componentNameStartService;
        Context context = (Context) this.f7398b;
        Intent intent = (Intent) this.f7399c;
        C2391u c2391uM3503y = C2391u.m3503y();
        c2391uM3503y.getClass();
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Starting service");
        }
        ((ArrayDeque) c2391uM3503y.f7432q0).offer(intent);
        Intent intent2 = new Intent("com.google.firebase.MESSAGING_EVENT");
        intent2.setPackage(context.getPackageName());
        synchronized (c2391uM3503y) {
            try {
                str = (String) c2391uM3503y.f7429Z;
                if (str == null) {
                    ResolveInfo resolveInfoResolveService = context.getPackageManager().resolveService(intent2, 0);
                    if (resolveInfoResolveService == null || (serviceInfo = resolveInfoResolveService.serviceInfo) == null) {
                        AbstractC15256t.m16465c("FirebaseMessaging", "Failed to resolve target intent service, skipping classname enforcement");
                    } else if (!context.getPackageName().equals(serviceInfo.packageName) || (str2 = serviceInfo.name) == null) {
                        AbstractC15256t.m16465c("FirebaseMessaging", "Error resolving target intent service, skipping classname enforcement. Resolved service was: " + serviceInfo.packageName + Separators.SLASH + serviceInfo.name);
                    } else {
                        if (str2.startsWith(Separators.DOT)) {
                            c2391uM3503y.f7429Z = context.getPackageName() + serviceInfo.name;
                        } else {
                            c2391uM3503y.f7429Z = serviceInfo.name;
                        }
                        str = (String) c2391uM3503y.f7429Z;
                    }
                    str = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (str != null) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Restricting intent to a specific service: ".concat(str));
            }
            intent2.setClassName(context.getPackageName(), str);
        }
        try {
            if (c2391uM3503y.m3505B(context)) {
                componentNameStartService = AbstractC2367E.m3467d(context, intent2);
            } else {
                componentNameStartService = context.startService(intent2);
                Log.d("FirebaseMessaging", "Missing wake lock permission, service start may be delayed");
            }
            if (componentNameStartService == null) {
                AbstractC15256t.m16465c("FirebaseMessaging", "Error while delivering the message: ServiceIntent not found.");
                i10 = 404;
            } else {
                i10 = -1;
            }
        } catch (IllegalStateException e10) {
            AbstractC15256t.m16465c("FirebaseMessaging", "Failed to start service while in background: " + e10);
            i10 = 402;
        } catch (SecurityException e11) {
            AbstractC15256t.m16466d("FirebaseMessaging", "Error while delivering the message to the serviceIntent", e11);
            i10 = HttpStatusCode.UNAUTHORIZED_401;
        }
        return Integer.valueOf(i10);
    }

    @Override // java.util.concurrent.Callable
    public final Object call() throws IOException {
        switch (this.f7397a) {
            case 0:
                return m3476a();
            case 1:
                LottieAnimationView lottieAnimationView = (LottieAnimationView) this.f7398b;
                boolean z6 = lottieAnimationView.f35928A0;
                String str = (String) this.f7399c;
                if (!z6) {
                    return AbstractC7785n.m8044b(lottieAnimationView.getContext(), str, null);
                }
                Context context = lottieAnimationView.getContext();
                HashMap map = AbstractC7785n.f24607a;
                return AbstractC7785n.m8044b(context, str, "asset_" + str);
            case 2:
                C8964t this$0 = (C8964t) this.f7398b;
                AbstractC16544l.m18094g(this$0, "this$0");
                return this$0.f27396a.setRates((VideoEncoder.RateControlParameters) this.f7399c);
            case 3:
                InterfaceC15151P interfaceC15151P = (InterfaceC15151P) this.f7398b;
                C15132I1 c15132i1 = (C15132I1) this.f7399c;
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream, C15321b1.f47862d));
                    try {
                        interfaceC15151P.mo16326f(c15132i1, bufferedWriter);
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        bufferedWriter.close();
                        byteArrayOutputStream.close();
                        return byteArray;
                    } catch (Throwable th2) {
                        try {
                            bufferedWriter.close();
                            break;
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                        throw th2;
                    }
                } catch (Throwable th4) {
                    try {
                        byteArrayOutputStream.close();
                        break;
                    } catch (Throwable th5) {
                        th4.addSuppressed(th5);
                    }
                    throw th4;
                }
            case 4:
                InterfaceC15151P interfaceC15151P2 = (InterfaceC15151P) this.f7398b;
                AbstractC15160S0 abstractC15160S0 = (AbstractC15160S0) this.f7399c;
                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                try {
                    BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream2, C15321b1.f47862d));
                    try {
                        interfaceC15151P2.mo16326f(abstractC15160S0, bufferedWriter2);
                        byte[] byteArray2 = byteArrayOutputStream2.toByteArray();
                        bufferedWriter2.close();
                        byteArrayOutputStream2.close();
                        return byteArray2;
                    } catch (Throwable th6) {
                        try {
                            bufferedWriter2.close();
                            break;
                        } catch (Throwable th7) {
                            th6.addSuppressed(th7);
                        }
                        throw th6;
                    }
                } catch (Throwable th8) {
                    try {
                        byteArrayOutputStream2.close();
                        break;
                    } catch (Throwable th9) {
                        th8.addSuppressed(th9);
                    }
                    throw th8;
                }
            case 5:
                InterfaceC15151P interfaceC15151P3 = (InterfaceC15151P) this.f7398b;
                C15335c c15335c = (C15335c) this.f7399c;
                ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
                try {
                    BufferedWriter bufferedWriter3 = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream3, C15321b1.f47862d));
                    try {
                        interfaceC15151P3.mo16326f(c15335c, bufferedWriter3);
                        byte[] byteArray3 = byteArrayOutputStream3.toByteArray();
                        bufferedWriter3.close();
                        byteArrayOutputStream3.close();
                        return byteArray3;
                    } catch (Throwable th10) {
                        try {
                            bufferedWriter3.close();
                            break;
                        } catch (Throwable th11) {
                            th10.addSuppressed(th11);
                        }
                        throw th10;
                    }
                } catch (Throwable th12) {
                    try {
                        byteArrayOutputStream3.close();
                        break;
                    } catch (Throwable th13) {
                        th12.addSuppressed(th13);
                    }
                    throw th12;
                }
            default:
                C15185C c15185c = (C15185C) this.f7398b;
                SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) this.f7399c;
                Context context2 = c15185c.f47306Y;
                if (C15187E.f47312h == null) {
                    synchronized (C15187E.class) {
                        try {
                            if (C15187E.f47312h == null) {
                                Context applicationContext = context2.getApplicationContext();
                                if (applicationContext != null) {
                                    context2 = applicationContext;
                                }
                                C15187E.f47312h = new C15187E(context2, sentryAndroidOptions);
                            }
                        } catch (Throwable th14) {
                            throw th14;
                        }
                        break;
                    }
                }
                return C15187E.f47312h;
        }
    }
}
