package io.sentry.android.ndk;

import io.sentry.C15345d;
import io.sentry.EnumC15375i1;
import io.sentry.InterfaceC15374i0;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.protocol.C15425E;
import java.util.Locale;
import p544W9.AbstractC8656j3;
import p817j$.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: io.sentry.android.ndk.b */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RunnableC15264b implements Runnable {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f47647Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C15266d f47648Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ InterfaceC15374i0 f47649o0;

    public /* synthetic */ RunnableC15264b(C15266d c15266d, InterfaceC15374i0 interfaceC15374i0, int i10) {
        this.f47647Y = i10;
        this.f47648Z = c15266d;
        this.f47649o0 = interfaceC15374i0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f47647Y) {
            case 0:
                InterfaceC15263a interfaceC15263a = this.f47648Z.f47654b;
                C15425E c15425e = (C15425E) this.f47649o0;
                if (c15425e != null) {
                    String str = c15425e.f48063Z;
                    String str2 = c15425e.f48062Y;
                    String str3 = c15425e.f48066q0;
                    String str4 = c15425e.f48064o0;
                    ((NativeScope) interfaceC15263a).getClass();
                    NativeScope.nativeSetUser(str, str2, str3, str4);
                } else {
                    ((NativeScope) interfaceC15263a).getClass();
                    NativeScope.nativeRemoveUser();
                }
                break;
            default:
                C15266d c15266d = this.f47648Z;
                SentryAndroidOptions sentryAndroidOptions = c15266d.f47653a;
                C15345d c15345d = (C15345d) this.f47649o0;
                EnumC15375i1 enumC15375i1 = c15345d.f47911t0;
                String strMo16321a = null;
                String lowerCase = enumC15375i1 != null ? enumC15375i1.name().toLowerCase(Locale.ROOT) : null;
                String strM9344l = AbstractC8656j3.m9344l(c15345d.m16573a());
                try {
                    ConcurrentHashMap concurrentHashMap = c15345d.f47908q0;
                    if (!concurrentHashMap.isEmpty()) {
                        strMo16321a = sentryAndroidOptions.getSerializer().mo16321a(concurrentHashMap);
                    }
                } catch (Throwable th2) {
                    sentryAndroidOptions.getLogger().mo16296g(EnumC15375i1.ERROR, th2, "Breadcrumb data is not serializable.", new Object[0]);
                }
                String str5 = strMo16321a;
                String str6 = c15345d.f47906o0;
                String str7 = c15345d.f47909r0;
                String str8 = c15345d.f47907p0;
                ((NativeScope) c15266d.f47654b).getClass();
                NativeScope.nativeAddBreadcrumb(lowerCase, str6, str7, str8, strM9344l, str5);
                break;
        }
    }
}
