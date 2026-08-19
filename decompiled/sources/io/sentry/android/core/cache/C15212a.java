package io.sentry.android.core.cache;

import android.os.SystemClock;
import io.sentry.C15170V1;
import io.sentry.C15516w;
import io.sentry.C15524y1;
import io.sentry.EnumC15375i1;
import io.sentry.InterfaceC15127H;
import io.sentry.android.core.C15254r;
import io.sentry.android.core.C15259w;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.android.core.internal.util.C15230b;
import io.sentry.android.core.performance.C15251d;
import io.sentry.android.core.performance.C15252e;
import io.sentry.cache.C15329c;
import java.io.File;
import java.io.FileOutputStream;
import p544W9.AbstractC8465D3;
import p544W9.AbstractC8483G3;
import p658b5.C11241l;

/* JADX INFO: renamed from: io.sentry.android.core.cache.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C15212a extends C15329c {

    /* JADX INFO: renamed from: u0 */
    public static final /* synthetic */ int f47459u0 = 0;

    /* JADX INFO: renamed from: t0 */
    public final C15230b f47460t0;

    /* JADX WARN: Illegal instructions before constructor call */
    public C15212a(SentryAndroidOptions sentryAndroidOptions) {
        C15230b c15230b = C15230b.f47526a;
        String cacheDirPath = sentryAndroidOptions.getCacheDirPath();
        AbstractC8483G3.m9133c(cacheDirPath, "cacheDirPath must not be null");
        super(sentryAndroidOptions, cacheDirPath, sentryAndroidOptions.getMaxCacheItems());
        this.f47460t0 = c15230b;
    }

    @Override // io.sentry.cache.C15329c, io.sentry.cache.InterfaceC15330d
    /* JADX INFO: renamed from: o */
    public final void mo16422o(C11241l c11241l, C15516w c15516w) {
        super.mo16422o(c11241l, c15516w);
        C15524y1 c15524y1 = this.f47877Y;
        SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) c15524y1;
        C15252e c15252e = C15251d.m16451b().f47609p0;
        if (C15170V1.class.isInstance(AbstractC8465D3.m9088b(c15516w)) && c15252e.m16457b()) {
            this.f47460t0.getClass();
            long jUptimeMillis = SystemClock.uptimeMillis() - c15252e.f47618o0;
            if (jUptimeMillis <= sentryAndroidOptions.getStartupCrashDurationThresholdMillis()) {
                InterfaceC15127H logger = sentryAndroidOptions.getLogger();
                EnumC15375i1 enumC15375i1 = EnumC15375i1.DEBUG;
                logger.mo16298o(enumC15375i1, "Startup Crash detected %d milliseconds after SDK init. Writing a startup crash marker file to disk.", Long.valueOf(jUptimeMillis));
                String outboxPath = c15524y1.getOutboxPath();
                if (outboxPath == null) {
                    c15524y1.getLogger().mo16298o(enumC15375i1, "Outbox path is null, the startup crash marker file will not be written", new Object[0]);
                } else {
                    try {
                        new File(outboxPath, "startup_crash").createNewFile();
                    } catch (Throwable th2) {
                        c15524y1.getLogger().mo16297h(EnumC15375i1.ERROR, "Error writing the startup crash marker file to the disk", th2);
                    }
                }
            }
        }
        C15254r c15254r = new C15254r(this, 1, sentryAndroidOptions);
        Object objM9088b = AbstractC8465D3.m9088b(c15516w);
        if (!C15259w.class.isInstance(AbstractC8465D3.m9088b(c15516w)) || objM9088b == null) {
            return;
        }
        C15212a c15212a = (C15212a) c15254r.f47623o0;
        c15212a.getClass();
        Long lValueOf = Long.valueOf(((C15259w) objM9088b).f47632p0);
        InterfaceC15127H logger2 = ((SentryAndroidOptions) c15254r.f47622Z).getLogger();
        EnumC15375i1 enumC15375i2 = EnumC15375i1.DEBUG;
        logger2.mo16298o(enumC15375i2, "Writing last reported ANR marker with timestamp %d", lValueOf);
        C15524y1 c15524y2 = c15212a.f47877Y;
        String cacheDirPath = c15524y2.getCacheDirPath();
        if (cacheDirPath == null) {
            c15524y2.getLogger().mo16298o(enumC15375i2, "Cache dir path is null, the ANR marker will not be written", new Object[0]);
            return;
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(cacheDirPath, "last_anr_report"));
            try {
                fileOutputStream.write(String.valueOf(lValueOf).getBytes(C15329c.f47876s0));
                fileOutputStream.flush();
                fileOutputStream.close();
            } catch (Throwable th3) {
                try {
                    fileOutputStream.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        } catch (Throwable th5) {
            c15524y2.getLogger().mo16297h(EnumC15375i1.ERROR, "Error writing the ANR marker to the disk", th5);
        }
    }
}
