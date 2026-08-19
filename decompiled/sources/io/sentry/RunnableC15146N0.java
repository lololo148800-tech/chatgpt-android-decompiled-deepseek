package io.sentry;

import io.sentry.cache.C15331e;
import io.sentry.protocol.C15445r;
import io.sentry.protocol.EnumC15423C;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import p544W9.AbstractC8459C3;
import p604Yk.C10077b;

/* JADX INFO: renamed from: io.sentry.N0 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RunnableC15146N0 implements Runnable {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f47156Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C15524y1 f47157Z;

    public /* synthetic */ RunnableC15146N0(C15524y1 c15524y1, int i10) {
        this.f47156Y = i10;
        this.f47157Z = c15524y1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f47156Y) {
            case 0:
                this.f47157Z.loadLazyFields();
                return;
            case 1:
                C15524y1 c15524y1 = this.f47157Z;
                String cacheDirPathWithoutDsn = c15524y1.getCacheDirPathWithoutDsn();
                if (cacheDirPathWithoutDsn != null) {
                    File file = new File(cacheDirPathWithoutDsn, "app_start_profiling_config");
                    try {
                        AbstractC8459C3.m9077a(file);
                        if (c15524y1.isEnableAppStartProfiling()) {
                            if (!c15524y1.isTracingEnabled()) {
                                c15524y1.getLogger().mo16298o(EnumC15375i1.INFO, "Tracing is disabled and app start profiling will not start.", new Object[0]);
                                return;
                            }
                            if (file.createNewFile()) {
                                C15155Q0 c15155q0 = new C15155Q0(c15524y1, new C10077b(c15524y1).m10663K(new C10077b(new C15161S1("app.launch", EnumC15423C.CUSTOM, "profile", null), 9)));
                                FileOutputStream fileOutputStream = new FileOutputStream(file);
                                try {
                                    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(fileOutputStream, AbstractC15152P0.f47167d));
                                    try {
                                        c15524y1.getSerializer().mo16326f(c15155q0, bufferedWriter);
                                        bufferedWriter.close();
                                        fileOutputStream.close();
                                        return;
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
                                        fileOutputStream.close();
                                        break;
                                    } catch (Throwable th5) {
                                        th4.addSuppressed(th5);
                                    }
                                    throw th4;
                                }
                            }
                            return;
                        }
                        return;
                    } catch (Throwable th6) {
                        c15524y1.getLogger().mo16297h(EnumC15375i1.ERROR, "Unable to create app start profiling config file. ", th6);
                        return;
                    }
                }
                return;
            case 2:
                C15524y1 c15524y2 = this.f47157Z;
                for (InterfaceC15133J interfaceC15133J : c15524y2.getOptionsObservers()) {
                    String release = c15524y2.getRelease();
                    C15331e c15331e = (C15331e) interfaceC15133J;
                    if (release == null) {
                        c15331e.m16545a("release.json");
                    } else {
                        c15331e.m16546b(release, "release.json");
                    }
                    String proguardUuid = c15524y2.getProguardUuid();
                    if (proguardUuid == null) {
                        c15331e.m16545a("proguard-uuid.json");
                    } else {
                        c15331e.m16546b(proguardUuid, "proguard-uuid.json");
                    }
                    C15445r sdkVersion = c15524y2.getSdkVersion();
                    if (sdkVersion == null) {
                        c15331e.m16545a("sdk-version.json");
                    } else {
                        c15331e.m16546b(sdkVersion, "sdk-version.json");
                    }
                    String dist = c15524y2.getDist();
                    if (dist == null) {
                        c15331e.m16545a("dist.json");
                    } else {
                        c15331e.m16546b(dist, "dist.json");
                    }
                    String environment = c15524y2.getEnvironment();
                    if (environment == null) {
                        c15331e.m16545a("environment.json");
                    } else {
                        c15331e.m16546b(environment, "environment.json");
                    }
                    c15331e.m16546b(c15524y2.getTags(), "tags.json");
                    Double d10 = c15524y2.getExperimental().f48340a.f47050b;
                    if (d10 == null) {
                        c15331e.m16545a("replay-error-sample-rate.json");
                    } else {
                        c15331e.m16546b(d10.toString(), "replay-error-sample-rate.json");
                    }
                }
                return;
            default:
                AbstractC15152P0.m16330d(this.f47157Z.getFlushTimeoutMillis());
                return;
        }
    }
}
