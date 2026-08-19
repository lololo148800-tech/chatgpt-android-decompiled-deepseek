package io.sentry.android.core.internal.util;

import android.content.Context;
import io.sentry.InterfaceC15127H;
import io.sentry.android.core.C15184B;
import java.nio.charset.Charset;
import p544W9.AbstractC8483G3;

/* JADX INFO: renamed from: io.sentry.android.core.internal.util.g */
/* JADX INFO: loaded from: classes3.dex */
public final class C15235g {

    /* JADX INFO: renamed from: g */
    public static final Charset f47540g = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: a */
    public final Context f47541a;

    /* JADX INFO: renamed from: b */
    public final C15184B f47542b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC15127H f47543c;

    /* JADX INFO: renamed from: d */
    public final String[] f47544d;

    /* JADX INFO: renamed from: e */
    public final String[] f47545e;

    /* JADX INFO: renamed from: f */
    public final Runtime f47546f;

    public C15235g(Context context, InterfaceC15127H interfaceC15127H, C15184B c15184b) {
        Runtime runtime = Runtime.getRuntime();
        this.f47541a = context;
        AbstractC8483G3.m9133c(c15184b, "The BuildInfoProvider is required.");
        this.f47542b = c15184b;
        AbstractC8483G3.m9133c(interfaceC15127H, "The Logger is required.");
        this.f47543c = interfaceC15127H;
        this.f47544d = new String[]{"/system/app/Superuser.apk", "/sbin/su", "/system/bin/su", "/system/xbin/su", "/data/local/xbin/su", "/data/local/bin/su", "/system/sd/xbin/su", "/system/bin/failsafe/su", "/data/local/su", "/su/bin/su", "/su/bin", "/system/xbin/daemonsu"};
        this.f47545e = new String[]{"com.devadvance.rootcloak", "com.devadvance.rootcloakplus", "com.koushikdutta.superuser", "com.thirdparty.superuser", "eu.chainfire.supersu", "com.noshufou.android.su"};
        AbstractC8483G3.m9133c(runtime, "The Runtime is required.");
        this.f47546f = runtime;
    }
}
