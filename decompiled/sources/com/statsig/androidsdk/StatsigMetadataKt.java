package com.statsig.androidsdk;

import android.os.Build;
import java.util.Locale;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import p228J.AbstractC3794B0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\b\u0010\u0000\u001a\u00020\u0001H\u0000\u001a\b\u0010\u0002\u001a\u00020\u0001H\u0000¨\u0006\u0003"}, m18067d2 = {"createCoreStatsigMetadata", "Lcom/statsig/androidsdk/StatsigMetadata;", "createStatsigMetadata", "build_release"}, m18068k = 2, m18069mv = {1, 5, 1}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class StatsigMetadataKt {
    public static final StatsigMetadata createCoreStatsigMetadata() {
        return new StatsigMetadata(null, "android-client", BuildConfig.VERSION_NAME, AbstractC3794B0.m4498w("randomUUID().toString()"), null, null, null, null, null, null, null, null);
    }

    public static final StatsigMetadata createStatsigMetadata() {
        return new StatsigMetadata(null, "android-client", BuildConfig.VERSION_NAME, AbstractC3794B0.m4498w("randomUUID().toString()"), null, null, Build.MODEL, "Android", Locale.getDefault().toString(), Locale.getDefault().toLanguageTag(), String.valueOf(Build.VERSION.SDK_INT), "Android");
    }
}
