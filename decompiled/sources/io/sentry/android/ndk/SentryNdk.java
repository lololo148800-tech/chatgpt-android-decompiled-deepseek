package io.sentry.android.ndk;

import io.sentry.C15358g1;
import io.sentry.android.core.SentryAndroidOptions;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import p001A.RunnableC0068j;
import p451Sb.C7102a;
import p658b5.p659zh.MMVKXkcLpuHFDi;

/* JADX INFO: loaded from: classes3.dex */
public final class SentryNdk {
    private static final CountDownLatch loadLibraryLatch = new CountDownLatch(1);

    static {
        new Thread(new RunnableC0068j(5), "SentryNdkLoadLibs").start();
    }

    private SentryNdk() {
    }

    public static void init(SentryAndroidOptions sentryAndroidOptions) {
        if (sentryAndroidOptions.getSdkVersion() != null) {
            C15358g1.m16578n().m16580f("maven:io.sentry:sentry-android-ndk");
        }
        try {
            if (!loadLibraryLatch.await(2000L, TimeUnit.MILLISECONDS)) {
                throw new IllegalStateException("Timeout waiting for Sentry NDK library to load");
            }
            initSentryNative(sentryAndroidOptions);
            if (sentryAndroidOptions.isEnableScopeSync()) {
                sentryAndroidOptions.addScopeObserver(new C15266d(sentryAndroidOptions));
            }
            sentryAndroidOptions.setDebugImagesLoader(new C7102a(29));
        } catch (InterruptedException e10) {
            throw new IllegalStateException("Thread interrupted while waiting for NDK libs to be loaded", e10);
        }
    }

    private static native void initSentryNative(SentryAndroidOptions sentryAndroidOptions);

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$static$0() {
        try {
            System.loadLibrary("log");
            System.loadLibrary("sentry");
            System.loadLibrary("sentry-android");
        } catch (Throwable unused) {
        }
        loadLibraryLatch.countDown();
    }

    private static native void shutdown();

    public static void close() {
        try {
            if (!loadLibraryLatch.await(2000L, TimeUnit.MILLISECONDS)) {
                throw new IllegalStateException(MMVKXkcLpuHFDi.ffCM);
            }
            shutdown();
        } catch (InterruptedException e10) {
            throw new IllegalStateException("Thread interrupted while waiting for NDK libs to be loaded", e10);
        }
    }
}
