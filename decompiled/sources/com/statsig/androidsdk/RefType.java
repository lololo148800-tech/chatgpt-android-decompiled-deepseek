package com.statsig.androidsdk;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import livekit.LivekitInternal$NodeStats;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0001\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000eB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\u0003H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000f"}, m18067d2 = {"Lcom/statsig/androidsdk/RefType;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "toString", "GATE", "EXPERIMENT", "LAYER", "DYNAMIC_CONFIG", "STATIC", "UNKNOWN", "Companion", "build_release"}, m18068k = 1, m18069mv = {1, 5, 1}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public enum RefType {
    GATE("gate"),
    EXPERIMENT("experiment"),
    LAYER("layer"),
    DYNAMIC_CONFIG("dynamic_config"),
    STATIC("static"),
    UNKNOWN("unknown");


    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String value;

    @Metadata(m18066d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, m18067d2 = {"Lcom/statsig/androidsdk/RefType$Companion;", "", "()V", "fromString", "Lcom/statsig/androidsdk/RefType;", "value", "", "build_release"}, m18068k = 1, m18069mv = {1, 5, 1}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0020  */
        /* JADX WARN: Code duplicated, block: B:14:? A[RETURN, SYNTHETIC] */
        public final RefType fromString(String value) {
            AbstractC16544l.m18094g(value, "value");
            for (RefType refType : RefType.valuesCustom()) {
                if (AbstractC16544l.m18089b(refType.getValue(), value)) {
                    if (refType == null) {
                        return RefType.UNKNOWN;
                    }
                    return refType;
                }
            }
            refType = null;
            if (refType == null) {
                return RefType.UNKNOWN;
            }
            return refType;
        }

        private Companion() {
        }
    }

    RefType(String str) {
        this.value = str;
    }

    /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
    public static RefType[] valuesCustom() {
        RefType[] refTypeArrValuesCustom = values();
        return (RefType[]) Arrays.copyOf(refTypeArrValuesCustom, refTypeArrValuesCustom.length);
    }

    public final String getValue() {
        return this.value;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.value;
    }
}
