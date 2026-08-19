package com.statsig.androidsdk;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import livekit.LivekitInternal$NodeStats;
import p1113xn.AbstractC21322p;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000b\b\u0086\u0001\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, m18067d2 = {"Lcom/statsig/androidsdk/KeyType;", "", "(Ljava/lang/String;I)V", "INITIALIZE", "BOOTSTRAP", "OVERALL", "CHECK_GATE", "GET_CONFIG", "GET_EXPERIMENT", "GET_LAYER", "RETRY_FAILED_LOG", "Companion", "build_release"}, m18068k = 1, m18069mv = {1, 5, 1}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public enum KeyType {
    INITIALIZE,
    BOOTSTRAP,
    OVERALL,
    CHECK_GATE,
    GET_CONFIG,
    GET_EXPERIMENT,
    GET_LAYER,
    RETRY_FAILED_LOG;


    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(m18066d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, m18067d2 = {"Lcom/statsig/androidsdk/KeyType$Companion;", "", "()V", "convertFromString", "Lcom/statsig/androidsdk/KeyType;", "value", "", "build_release"}, m18068k = 1, m18069mv = {1, 5, 1}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KeyType convertFromString(String value) {
            AbstractC16544l.m18094g(value, "value");
            if (AbstractC21322p.m21667A("checkGate", value, false)) {
                return KeyType.CHECK_GATE;
            }
            if (AbstractC21322p.m21667A("getExperiment", value, false)) {
                return KeyType.GET_EXPERIMENT;
            }
            if (AbstractC21322p.m21667A("getConfig", value, false)) {
                return KeyType.GET_CONFIG;
            }
            if (AbstractC21322p.m21667A("getLayer", value, false)) {
                return KeyType.GET_LAYER;
            }
            return null;
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
    public static KeyType[] valuesCustom() {
        KeyType[] keyTypeArrValuesCustom = values();
        return (KeyType[]) Arrays.copyOf(keyTypeArrValuesCustom, keyTypeArrValuesCustom.length);
    }
}
