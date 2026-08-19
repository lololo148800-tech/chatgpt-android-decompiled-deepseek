package com.statsig.androidsdk;

import com.google.protobuf.AbstractC12107L1;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import livekit.LivekitInternal$NodeStats;
import p240Jb.InterfaceC4325b;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, m18067d2 = {"Lcom/statsig/androidsdk/InitializeResponse;", "", "()V", "FailedInitializeResponse", "SuccessfulInitializeResponse", "Lcom/statsig/androidsdk/InitializeResponse$FailedInitializeResponse;", "Lcom/statsig/androidsdk/InitializeResponse$SuccessfulInitializeResponse;", "build_release"}, m18068k = 1, m18069mv = {1, 5, 1}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public abstract class InitializeResponse {

    @Metadata(m18066d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u000eJ0\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000e¨\u0006\u001c"}, m18067d2 = {"Lcom/statsig/androidsdk/InitializeResponse$FailedInitializeResponse;", "Lcom/statsig/androidsdk/InitializeResponse;", "reason", "Lcom/statsig/androidsdk/InitializeFailReason;", "exception", "Ljava/lang/Exception;", "statusCode", "", "(Lcom/statsig/androidsdk/InitializeFailReason;Ljava/lang/Exception;Ljava/lang/Integer;)V", "getException", "()Ljava/lang/Exception;", "getReason", "()Lcom/statsig/androidsdk/InitializeFailReason;", "getStatusCode", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "copy", "(Lcom/statsig/androidsdk/InitializeFailReason;Ljava/lang/Exception;Ljava/lang/Integer;)Lcom/statsig/androidsdk/InitializeResponse$FailedInitializeResponse;", "equals", "", "other", "", "hashCode", "toString", "", "build_release"}, m18068k = 1, m18069mv = {1, 5, 1}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final /* data */ class FailedInitializeResponse extends InitializeResponse {

        @InterfaceC4325b("exception")
        private final Exception exception;

        @InterfaceC4325b("reason")
        private final InitializeFailReason reason;

        @InterfaceC4325b("statusCode")
        private final Integer statusCode;

        public /* synthetic */ FailedInitializeResponse(InitializeFailReason initializeFailReason, Exception exc, Integer num, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(initializeFailReason, (i10 & 2) != 0 ? null : exc, (i10 & 4) != 0 ? null : num);
        }

        public static /* synthetic */ FailedInitializeResponse copy$default(FailedInitializeResponse failedInitializeResponse, InitializeFailReason initializeFailReason, Exception exc, Integer num, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                initializeFailReason = failedInitializeResponse.reason;
            }
            if ((i10 & 2) != 0) {
                exc = failedInitializeResponse.exception;
            }
            if ((i10 & 4) != 0) {
                num = failedInitializeResponse.statusCode;
            }
            return failedInitializeResponse.copy(initializeFailReason, exc, num);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final InitializeFailReason getReason() {
            return this.reason;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final Exception getException() {
            return this.exception;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final Integer getStatusCode() {
            return this.statusCode;
        }

        public final FailedInitializeResponse copy(InitializeFailReason reason, Exception exception, Integer statusCode) {
            AbstractC16544l.m18094g(reason, "reason");
            return new FailedInitializeResponse(reason, exception, statusCode);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FailedInitializeResponse)) {
                return false;
            }
            FailedInitializeResponse failedInitializeResponse = (FailedInitializeResponse) other;
            return this.reason == failedInitializeResponse.reason && AbstractC16544l.m18089b(this.exception, failedInitializeResponse.exception) && AbstractC16544l.m18089b(this.statusCode, failedInitializeResponse.statusCode);
        }

        public final Exception getException() {
            return this.exception;
        }

        public final InitializeFailReason getReason() {
            return this.reason;
        }

        public final Integer getStatusCode() {
            return this.statusCode;
        }

        public int hashCode() {
            int iHashCode = this.reason.hashCode() * 31;
            Exception exc = this.exception;
            int iHashCode2 = (iHashCode + (exc == null ? 0 : exc.hashCode())) * 31;
            Integer num = this.statusCode;
            return iHashCode2 + (num != null ? num.hashCode() : 0);
        }

        public String toString() {
            return "FailedInitializeResponse(reason=" + this.reason + ", exception=" + this.exception + ", statusCode=" + this.statusCode + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FailedInitializeResponse(InitializeFailReason reason, Exception exc, Integer num) {
            super(null);
            AbstractC16544l.m18094g(reason, "reason");
            this.reason = reason;
            this.exception = exc;
            this.statusCode = num;
        }
    }

    @Metadata(m18066d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u001b\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B©\u0001\u0012\u0014\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0003\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012.\b\u0002\u0010\u0010\u001a(\u0012\u0004\u0012\u00020\u0004\u0012\u001c\u0012\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00110\u00030\u0003\u0018\u00010\u0003¢\u0006\u0002\u0010\u0012J\u0017\u0010!\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003HÆ\u0003J\u0017\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0003HÆ\u0003J\u0017\u0010#\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0003HÆ\u0003J\t\u0010$\u001a\u00020\nHÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\fHÆ\u0003J\t\u0010&\u001a\u00020\u000eHÆ\u0003J\u0017\u0010'\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J/\u0010(\u001a(\u0012\u0004\u0012\u00020\u0004\u0012\u001c\u0012\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00110\u00030\u0003\u0018\u00010\u0003HÆ\u0003J¹\u0001\u0010)\u001a\u00020\u00002\u0016\b\u0002\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00032\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00032\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032.\b\u0002\u0010\u0010\u001a(\u0012\u0004\u0012\u00020\u0004\u0012\u001c\u0012\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00110\u00030\u0003\u0018\u00010\u0003HÆ\u0001J\u0013\u0010*\u001a\u00020\n2\b\u0010+\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010,\u001a\u00020-HÖ\u0001J\t\u0010.\u001a\u00020\u0004HÖ\u0001R$\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R$\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R$\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR,\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0014\"\u0004\b\u001c\u0010\u001dR<\u0010\u0010\u001a(\u0012\u0004\u0012\u00020\u0004\u0012\u001c\u0012\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00110\u00030\u0003\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0014R\u0016\u0010\r\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 ¨\u0006/"}, m18067d2 = {"Lcom/statsig/androidsdk/InitializeResponse$SuccessfulInitializeResponse;", "Lcom/statsig/androidsdk/InitializeResponse;", "featureGates", "", "", "Lcom/statsig/androidsdk/APIFeatureGate;", "configs", "Lcom/statsig/androidsdk/APIDynamicConfig;", "layerConfigs", "hasUpdates", "", "hashUsed", "Lcom/statsig/androidsdk/HashAlgorithm;", "time", "", "derivedFields", "paramStores", "", "(Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;ZLcom/statsig/androidsdk/HashAlgorithm;JLjava/util/Map;Ljava/util/Map;)V", "getConfigs", "()Ljava/util/Map;", "getDerivedFields", "getFeatureGates", "getHasUpdates", "()Z", "getHashUsed", "()Lcom/statsig/androidsdk/HashAlgorithm;", "getLayerConfigs", "setLayerConfigs", "(Ljava/util/Map;)V", "getParamStores", "getTime", "()J", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "", "toString", "build_release"}, m18068k = 1, m18069mv = {1, 5, 1}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final /* data */ class SuccessfulInitializeResponse extends InitializeResponse {

        @InterfaceC4325b("dynamic_configs")
        private final Map<String, APIDynamicConfig> configs;

        @InterfaceC4325b("derived_fields")
        private final Map<String, String> derivedFields;

        @InterfaceC4325b("feature_gates")
        private final Map<String, APIFeatureGate> featureGates;

        @InterfaceC4325b("has_updates")
        private final boolean hasUpdates;

        @InterfaceC4325b("hash_used")
        private final HashAlgorithm hashUsed;

        @InterfaceC4325b("layer_configs")
        private Map<String, APIDynamicConfig> layerConfigs;

        @InterfaceC4325b("param_stores")
        private final Map<String, Map<String, Map<String, Object>>> paramStores;

        @InterfaceC4325b("time")
        private final long time;

        public /* synthetic */ SuccessfulInitializeResponse(Map map, Map map2, Map map3, boolean z6, HashAlgorithm hashAlgorithm, long j10, Map map4, Map map5, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(map, map2, map3, z6, (i10 & 16) != 0 ? null : hashAlgorithm, j10, map4, (i10 & 128) != 0 ? null : map5);
        }

        public final Map<String, APIFeatureGate> component1() {
            return this.featureGates;
        }

        public final Map<String, APIDynamicConfig> component2() {
            return this.configs;
        }

        public final Map<String, APIDynamicConfig> component3() {
            return this.layerConfigs;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final boolean getHasUpdates() {
            return this.hasUpdates;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final HashAlgorithm getHashUsed() {
            return this.hashUsed;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final long getTime() {
            return this.time;
        }

        public final Map<String, String> component7() {
            return this.derivedFields;
        }

        public final Map<String, Map<String, Map<String, Object>>> component8() {
            return this.paramStores;
        }

        public final SuccessfulInitializeResponse copy(Map<String, APIFeatureGate> featureGates, Map<String, APIDynamicConfig> configs, Map<String, APIDynamicConfig> layerConfigs, boolean hasUpdates, HashAlgorithm hashUsed, long time, Map<String, String> derivedFields, Map<String, ? extends Map<String, ? extends Map<String, ? extends Object>>> paramStores) {
            return new SuccessfulInitializeResponse(featureGates, configs, layerConfigs, hasUpdates, hashUsed, time, derivedFields, paramStores);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SuccessfulInitializeResponse)) {
                return false;
            }
            SuccessfulInitializeResponse successfulInitializeResponse = (SuccessfulInitializeResponse) other;
            return AbstractC16544l.m18089b(this.featureGates, successfulInitializeResponse.featureGates) && AbstractC16544l.m18089b(this.configs, successfulInitializeResponse.configs) && AbstractC16544l.m18089b(this.layerConfigs, successfulInitializeResponse.layerConfigs) && this.hasUpdates == successfulInitializeResponse.hasUpdates && this.hashUsed == successfulInitializeResponse.hashUsed && this.time == successfulInitializeResponse.time && AbstractC16544l.m18089b(this.derivedFields, successfulInitializeResponse.derivedFields) && AbstractC16544l.m18089b(this.paramStores, successfulInitializeResponse.paramStores);
        }

        public final Map<String, APIDynamicConfig> getConfigs() {
            return this.configs;
        }

        public final Map<String, String> getDerivedFields() {
            return this.derivedFields;
        }

        public final Map<String, APIFeatureGate> getFeatureGates() {
            return this.featureGates;
        }

        public final boolean getHasUpdates() {
            return this.hasUpdates;
        }

        public final HashAlgorithm getHashUsed() {
            return this.hashUsed;
        }

        public final Map<String, APIDynamicConfig> getLayerConfigs() {
            return this.layerConfigs;
        }

        public final Map<String, Map<String, Map<String, Object>>> getParamStores() {
            return this.paramStores;
        }

        public final long getTime() {
            return this.time;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v20 */
        /* JADX WARN: Type inference failed for: r2v23 */
        /* JADX WARN: Type inference failed for: r2v7, types: [int] */
        public int hashCode() {
            Map<String, APIFeatureGate> map = this.featureGates;
            int iHashCode = (map == null ? 0 : map.hashCode()) * 31;
            Map<String, APIDynamicConfig> map2 = this.configs;
            int iHashCode2 = (iHashCode + (map2 == null ? 0 : map2.hashCode())) * 31;
            Map<String, APIDynamicConfig> map3 = this.layerConfigs;
            int iHashCode3 = (iHashCode2 + (map3 == null ? 0 : map3.hashCode())) * 31;
            boolean z6 = this.hasUpdates;
            ?? r6 = z6;
            if (z6) {
                r6 = 1;
            }
            int i10 = (iHashCode3 + r6) * 31;
            HashAlgorithm hashAlgorithm = this.hashUsed;
            int iHashCode4 = (i10 + (hashAlgorithm == null ? 0 : hashAlgorithm.hashCode())) * 31;
            long j10 = this.time;
            int i11 = (iHashCode4 + ((int) (j10 ^ (j10 >>> 32)))) * 31;
            Map<String, String> map4 = this.derivedFields;
            int iHashCode5 = (i11 + (map4 == null ? 0 : map4.hashCode())) * 31;
            Map<String, Map<String, Map<String, Object>>> map5 = this.paramStores;
            return iHashCode5 + (map5 != null ? map5.hashCode() : 0);
        }

        public final void setLayerConfigs(Map<String, APIDynamicConfig> map) {
            this.layerConfigs = map;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("SuccessfulInitializeResponse(featureGates=");
            sb2.append(this.featureGates);
            sb2.append(", configs=");
            sb2.append(this.configs);
            sb2.append(", layerConfigs=");
            sb2.append(this.layerConfigs);
            sb2.append(", hasUpdates=");
            sb2.append(this.hasUpdates);
            sb2.append(", hashUsed=");
            sb2.append(this.hashUsed);
            sb2.append(", time=");
            sb2.append(this.time);
            sb2.append(", derivedFields=");
            sb2.append(this.derivedFields);
            sb2.append(", paramStores=");
            return AbstractC12107L1.m13827r(sb2, this.paramStores, ')');
        }

        /* JADX WARN: Multi-variable type inference failed */
        public SuccessfulInitializeResponse(Map<String, APIFeatureGate> map, Map<String, APIDynamicConfig> map2, Map<String, APIDynamicConfig> map3, boolean z6, HashAlgorithm hashAlgorithm, long j10, Map<String, String> map4, Map<String, ? extends Map<String, ? extends Map<String, ? extends Object>>> map5) {
            super(null);
            this.featureGates = map;
            this.configs = map2;
            this.layerConfigs = map3;
            this.hasUpdates = z6;
            this.hashUsed = hashAlgorithm;
            this.time = j10;
            this.derivedFields = map4;
            this.paramStores = map5;
        }
    }

    public /* synthetic */ InitializeResponse(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private InitializeResponse() {
    }
}
