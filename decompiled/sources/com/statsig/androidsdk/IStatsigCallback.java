package com.statsig.androidsdk;

import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;

/* JADX INFO: loaded from: classes3.dex */
@FunctionalInterface
@Metadata(m18066d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0003\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0002H&¢\u0006\u0004\b\b\u0010\u0004¨\u0006\t"}, m18067d2 = {"Lcom/statsig/androidsdk/IStatsigCallback;", "", "Lmm/C;", "onStatsigInitialize", "()V", "Lcom/statsig/androidsdk/InitializationDetails;", "initDetails", "(Lcom/statsig/androidsdk/InitializationDetails;)V", "onStatsigUpdateUser", "build_release"}, m18068k = 1, m18069mv = {1, 5, 1}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public interface IStatsigCallback {

    @Metadata(m18068k = 3, m18069mv = {1, 5, 1}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class DefaultImpls {
        public static void onStatsigInitialize(IStatsigCallback iStatsigCallback) {
            AbstractC16544l.m18094g(iStatsigCallback, "this");
        }

        public static void onStatsigInitialize(IStatsigCallback iStatsigCallback, InitializationDetails initDetails) {
            AbstractC16544l.m18094g(iStatsigCallback, "this");
            AbstractC16544l.m18094g(initDetails, "initDetails");
            iStatsigCallback.onStatsigInitialize();
        }
    }

    void onStatsigInitialize();

    void onStatsigInitialize(InitializationDetails initDetails);

    void onStatsigUpdateUser();
}
