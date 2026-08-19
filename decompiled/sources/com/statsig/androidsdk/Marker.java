package com.statsig.androidsdk;

import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import livekit.LivekitInternal$NodeStats;
import p240Jb.InterfaceC4325b;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\bT\b\u0086\b\u0018\u00002\u00020\u0001:\u0001nBõ\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\r¢\u0006\u0002\u0010\u001fJ\u000b\u0010T\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010U\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u0010V\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u0010\u0010W\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010#J\u0010\u0010X\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u00104J\u0010\u0010Y\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u00104J\u000b\u0010Z\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u0010[\u001a\u0004\u0018\u00010\u0019HÆ\u0003J\u000b\u0010\\\u001a\u0004\u0018\u00010\u001bHÆ\u0003J\u0010\u0010]\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u00104J\u0010\u0010^\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010#J\u000b\u0010_\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010`\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u00104J\u0010\u0010a\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010PJ\u000b\u0010b\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0010\u0010c\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010#J\u0010\u0010d\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u00104J\u000b\u0010e\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u0010\u0010f\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010#J\u000b\u0010g\u001a\u0004\u0018\u00010\u000fHÆ\u0003Jþ\u0001\u0010h\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0002\u0010iJ\u0013\u0010j\u001a\u00020\r2\b\u0010k\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010l\u001a\u00020\u000bHÖ\u0001J\t\u0010m\u001a\u00020\u000fHÖ\u0001R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\"\u0010\u0014\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010&\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R \u0010\u0017\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R \u0010\u001a\u001a\u0004\u0018\u00010\u001b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R \u0010\u0018\u001a\u0004\u0018\u00010\u00198\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\"\u0010\u001c\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u00107\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\"\u0010\u0010\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010&\u001a\u0004\b8\u0010#\"\u0004\b9\u0010%R\"\u0010\u001e\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u00107\u001a\u0004\b\u001e\u00104\"\u0004\b:\u00106R\"\u0010\u0016\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u00107\u001a\u0004\b\u0016\u00104\"\u0004\b;\u00106R\"\u0010\u0015\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u00107\u001a\u0004\b\u0015\u00104\"\u0004\b<\u00106R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b=\u0010>R \u0010\u0013\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b?\u0010(\"\u0004\b@\u0010*R \u0010\u0011\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bA\u0010(\"\u0004\bB\u0010*R \u0010\u0012\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bC\u0010(\"\u0004\bD\u0010*R\"\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010&\u001a\u0004\bE\u0010#\"\u0004\bF\u0010%R \u0010\b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR\"\u0010\f\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u00107\u001a\u0004\bK\u00104\"\u0004\bL\u00106R\"\u0010\u001d\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010&\u001a\u0004\bM\u0010#\"\u0004\bN\u0010%R\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010Q\u001a\u0004\bO\u0010PR \u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bR\u0010(\"\u0004\bS\u0010*¨\u0006o"}, m18067d2 = {"Lcom/statsig/androidsdk/Marker;", "", SubscriberAttributeKt.JSON_NAME_KEY, "Lcom/statsig/androidsdk/KeyType;", "action", "Lcom/statsig/androidsdk/ActionType;", DiagnosticsEntry.TIMESTAMP_KEY, "", "step", "Lcom/statsig/androidsdk/StepType;", "statusCode", "", "success", "", "url", "", "idListCount", "reason", "sdkRegion", "markerID", "attempt", "isRetry", "isDelta", "configName", "evaluationDetails", "Lcom/statsig/androidsdk/EvaluationDetails;", "error", "Lcom/statsig/androidsdk/Marker$ErrorMessage;", "hasNetwork", "timeoutMS", "isBlocking", "(Lcom/statsig/androidsdk/KeyType;Lcom/statsig/androidsdk/ActionType;Ljava/lang/Double;Lcom/statsig/androidsdk/StepType;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Lcom/statsig/androidsdk/EvaluationDetails;Lcom/statsig/androidsdk/Marker$ErrorMessage;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Boolean;)V", "getAction", "()Lcom/statsig/androidsdk/ActionType;", "getAttempt", "()Ljava/lang/Integer;", "setAttempt", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getConfigName", "()Ljava/lang/String;", "setConfigName", "(Ljava/lang/String;)V", "getError", "()Lcom/statsig/androidsdk/Marker$ErrorMessage;", "setError", "(Lcom/statsig/androidsdk/Marker$ErrorMessage;)V", "getEvaluationDetails", "()Lcom/statsig/androidsdk/EvaluationDetails;", "setEvaluationDetails", "(Lcom/statsig/androidsdk/EvaluationDetails;)V", "getHasNetwork", "()Ljava/lang/Boolean;", "setHasNetwork", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getIdListCount", "setIdListCount", "setBlocking", "setDelta", "setRetry", "getKey", "()Lcom/statsig/androidsdk/KeyType;", "getMarkerID", "setMarkerID", "getReason", "setReason", "getSdkRegion", "setSdkRegion", "getStatusCode", "setStatusCode", "getStep", "()Lcom/statsig/androidsdk/StepType;", "setStep", "(Lcom/statsig/androidsdk/StepType;)V", "getSuccess", "setSuccess", "getTimeoutMS", "setTimeoutMS", "getTimestamp", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getUrl", "setUrl", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Lcom/statsig/androidsdk/KeyType;Lcom/statsig/androidsdk/ActionType;Ljava/lang/Double;Lcom/statsig/androidsdk/StepType;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Lcom/statsig/androidsdk/EvaluationDetails;Lcom/statsig/androidsdk/Marker$ErrorMessage;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Boolean;)Lcom/statsig/androidsdk/Marker;", "equals", "other", "hashCode", "toString", "ErrorMessage", "build_release"}, m18068k = 1, m18069mv = {1, 5, 1}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final /* data */ class Marker {

    @InterfaceC4325b("action")
    private final ActionType action;

    @InterfaceC4325b("attempt")
    private Integer attempt;

    @InterfaceC4325b("configName")
    private String configName;

    @InterfaceC4325b("error")
    private ErrorMessage error;

    @InterfaceC4325b("evaluationDetails")
    private EvaluationDetails evaluationDetails;

    @InterfaceC4325b("hasNetwork")
    private Boolean hasNetwork;

    @InterfaceC4325b("idListCount")
    private Integer idListCount;

    @InterfaceC4325b("isBlocking")
    private Boolean isBlocking;

    @InterfaceC4325b("isDelta")
    private Boolean isDelta;

    @InterfaceC4325b("isRetry")
    private Boolean isRetry;

    @InterfaceC4325b(SubscriberAttributeKt.JSON_NAME_KEY)
    private final KeyType key;

    @InterfaceC4325b("markerID")
    private String markerID;

    @InterfaceC4325b("reason")
    private String reason;

    @InterfaceC4325b("sdkRegion")
    private String sdkRegion;

    @InterfaceC4325b("statusCode")
    private Integer statusCode;

    @InterfaceC4325b("step")
    private StepType step;

    @InterfaceC4325b("success")
    private Boolean success;

    @InterfaceC4325b("timeoutMS")
    private Integer timeoutMS;

    @InterfaceC4325b(DiagnosticsEntry.TIMESTAMP_KEY)
    private final Double timestamp;

    @InterfaceC4325b("url")
    private String url;

    @Metadata(m18066d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, m18067d2 = {"Lcom/statsig/androidsdk/Marker$ErrorMessage;", "", "message", "", DiagnosticsEntry.NAME_KEY, "code", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCode", "()Ljava/lang/String;", "getMessage", "getName", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "build_release"}, m18068k = 1, m18069mv = {1, 5, 1}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final /* data */ class ErrorMessage {

        @InterfaceC4325b("code")
        private final String code;

        @InterfaceC4325b("message")
        private final String message;

        @InterfaceC4325b(DiagnosticsEntry.NAME_KEY)
        private final String name;

        public ErrorMessage() {
            this(null, null, null, 7, null);
        }

        public static /* synthetic */ ErrorMessage copy$default(ErrorMessage errorMessage, String str, String str2, String str3, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = errorMessage.message;
            }
            if ((i10 & 2) != 0) {
                str2 = errorMessage.name;
            }
            if ((i10 & 4) != 0) {
                str3 = errorMessage.code;
            }
            return errorMessage.copy(str, str2, str3);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getCode() {
            return this.code;
        }

        public final ErrorMessage copy(String message, String name, String code) {
            return new ErrorMessage(message, name, code);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ErrorMessage)) {
                return false;
            }
            ErrorMessage errorMessage = (ErrorMessage) other;
            return AbstractC16544l.m18089b(this.message, errorMessage.message) && AbstractC16544l.m18089b(this.name, errorMessage.name) && AbstractC16544l.m18089b(this.code, errorMessage.code);
        }

        public final String getCode() {
            return this.code;
        }

        public final String getMessage() {
            return this.message;
        }

        public final String getName() {
            return this.name;
        }

        public int hashCode() {
            String str = this.message;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.name;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.code;
            return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        }

        public String toString() {
            return "ErrorMessage(message=" + ((Object) this.message) + ", name=" + ((Object) this.name) + ", code=" + ((Object) this.code) + ')';
        }

        public ErrorMessage(String str, String str2, String str3) {
            this.message = str;
            this.name = str2;
            this.code = str3;
        }

        public /* synthetic */ ErrorMessage(String str, String str2, String str3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3);
        }
    }

    public Marker() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1048575, null);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final KeyType getKey() {
        return this.key;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getSdkRegion() {
        return this.sdkRegion;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getMarkerID() {
        return this.markerID;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final Integer getAttempt() {
        return this.attempt;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final Boolean getIsRetry() {
        return this.isRetry;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final Boolean getIsDelta() {
        return this.isDelta;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getConfigName() {
        return this.configName;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final EvaluationDetails getEvaluationDetails() {
        return this.evaluationDetails;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final ErrorMessage getError() {
        return this.error;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final Boolean getHasNetwork() {
        return this.hasNetwork;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final Integer getTimeoutMS() {
        return this.timeoutMS;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final ActionType getAction() {
        return this.action;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final Boolean getIsBlocking() {
        return this.isBlocking;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Double getTimestamp() {
        return this.timestamp;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final StepType getStep() {
        return this.step;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Integer getStatusCode() {
        return this.statusCode;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Boolean getSuccess() {
        return this.success;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Integer getIdListCount() {
        return this.idListCount;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getReason() {
        return this.reason;
    }

    public final Marker copy(KeyType key, ActionType action, Double timestamp, StepType step, Integer statusCode, Boolean success, String url, Integer idListCount, String reason, String sdkRegion, String markerID, Integer attempt, Boolean isRetry, Boolean isDelta, String configName, EvaluationDetails evaluationDetails, ErrorMessage error, Boolean hasNetwork, Integer timeoutMS, Boolean isBlocking) {
        return new Marker(key, action, timestamp, step, statusCode, success, url, idListCount, reason, sdkRegion, markerID, attempt, isRetry, isDelta, configName, evaluationDetails, error, hasNetwork, timeoutMS, isBlocking);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Marker)) {
            return false;
        }
        Marker marker = (Marker) other;
        return this.key == marker.key && this.action == marker.action && AbstractC16544l.m18089b(this.timestamp, marker.timestamp) && this.step == marker.step && AbstractC16544l.m18089b(this.statusCode, marker.statusCode) && AbstractC16544l.m18089b(this.success, marker.success) && AbstractC16544l.m18089b(this.url, marker.url) && AbstractC16544l.m18089b(this.idListCount, marker.idListCount) && AbstractC16544l.m18089b(this.reason, marker.reason) && AbstractC16544l.m18089b(this.sdkRegion, marker.sdkRegion) && AbstractC16544l.m18089b(this.markerID, marker.markerID) && AbstractC16544l.m18089b(this.attempt, marker.attempt) && AbstractC16544l.m18089b(this.isRetry, marker.isRetry) && AbstractC16544l.m18089b(this.isDelta, marker.isDelta) && AbstractC16544l.m18089b(this.configName, marker.configName) && AbstractC16544l.m18089b(this.evaluationDetails, marker.evaluationDetails) && AbstractC16544l.m18089b(this.error, marker.error) && AbstractC16544l.m18089b(this.hasNetwork, marker.hasNetwork) && AbstractC16544l.m18089b(this.timeoutMS, marker.timeoutMS) && AbstractC16544l.m18089b(this.isBlocking, marker.isBlocking);
    }

    public final ActionType getAction() {
        return this.action;
    }

    public final Integer getAttempt() {
        return this.attempt;
    }

    public final String getConfigName() {
        return this.configName;
    }

    public final ErrorMessage getError() {
        return this.error;
    }

    public final EvaluationDetails getEvaluationDetails() {
        return this.evaluationDetails;
    }

    public final Boolean getHasNetwork() {
        return this.hasNetwork;
    }

    public final Integer getIdListCount() {
        return this.idListCount;
    }

    public final KeyType getKey() {
        return this.key;
    }

    public final String getMarkerID() {
        return this.markerID;
    }

    public final String getReason() {
        return this.reason;
    }

    public final String getSdkRegion() {
        return this.sdkRegion;
    }

    public final Integer getStatusCode() {
        return this.statusCode;
    }

    public final StepType getStep() {
        return this.step;
    }

    public final Boolean getSuccess() {
        return this.success;
    }

    public final Integer getTimeoutMS() {
        return this.timeoutMS;
    }

    public final Double getTimestamp() {
        return this.timestamp;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        KeyType keyType = this.key;
        int iHashCode = (keyType == null ? 0 : keyType.hashCode()) * 31;
        ActionType actionType = this.action;
        int iHashCode2 = (iHashCode + (actionType == null ? 0 : actionType.hashCode())) * 31;
        Double d10 = this.timestamp;
        int iHashCode3 = (iHashCode2 + (d10 == null ? 0 : d10.hashCode())) * 31;
        StepType stepType = this.step;
        int iHashCode4 = (iHashCode3 + (stepType == null ? 0 : stepType.hashCode())) * 31;
        Integer num = this.statusCode;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.success;
        int iHashCode6 = (iHashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.url;
        int iHashCode7 = (iHashCode6 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num2 = this.idListCount;
        int iHashCode8 = (iHashCode7 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str2 = this.reason;
        int iHashCode9 = (iHashCode8 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.sdkRegion;
        int iHashCode10 = (iHashCode9 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.markerID;
        int iHashCode11 = (iHashCode10 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num3 = this.attempt;
        int iHashCode12 = (iHashCode11 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Boolean bool2 = this.isRetry;
        int iHashCode13 = (iHashCode12 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.isDelta;
        int iHashCode14 = (iHashCode13 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        String str5 = this.configName;
        int iHashCode15 = (iHashCode14 + (str5 == null ? 0 : str5.hashCode())) * 31;
        EvaluationDetails evaluationDetails = this.evaluationDetails;
        int iHashCode16 = (iHashCode15 + (evaluationDetails == null ? 0 : evaluationDetails.hashCode())) * 31;
        ErrorMessage errorMessage = this.error;
        int iHashCode17 = (iHashCode16 + (errorMessage == null ? 0 : errorMessage.hashCode())) * 31;
        Boolean bool4 = this.hasNetwork;
        int iHashCode18 = (iHashCode17 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Integer num4 = this.timeoutMS;
        int iHashCode19 = (iHashCode18 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Boolean bool5 = this.isBlocking;
        return iHashCode19 + (bool5 != null ? bool5.hashCode() : 0);
    }

    public final Boolean isBlocking() {
        return this.isBlocking;
    }

    public final Boolean isDelta() {
        return this.isDelta;
    }

    public final Boolean isRetry() {
        return this.isRetry;
    }

    public final void setAttempt(Integer num) {
        this.attempt = num;
    }

    public final void setBlocking(Boolean bool) {
        this.isBlocking = bool;
    }

    public final void setConfigName(String str) {
        this.configName = str;
    }

    public final void setDelta(Boolean bool) {
        this.isDelta = bool;
    }

    public final void setError(ErrorMessage errorMessage) {
        this.error = errorMessage;
    }

    public final void setEvaluationDetails(EvaluationDetails evaluationDetails) {
        this.evaluationDetails = evaluationDetails;
    }

    public final void setHasNetwork(Boolean bool) {
        this.hasNetwork = bool;
    }

    public final void setIdListCount(Integer num) {
        this.idListCount = num;
    }

    public final void setMarkerID(String str) {
        this.markerID = str;
    }

    public final void setReason(String str) {
        this.reason = str;
    }

    public final void setRetry(Boolean bool) {
        this.isRetry = bool;
    }

    public final void setSdkRegion(String str) {
        this.sdkRegion = str;
    }

    public final void setStatusCode(Integer num) {
        this.statusCode = num;
    }

    public final void setStep(StepType stepType) {
        this.step = stepType;
    }

    public final void setSuccess(Boolean bool) {
        this.success = bool;
    }

    public final void setTimeoutMS(Integer num) {
        this.timeoutMS = num;
    }

    public final void setUrl(String str) {
        this.url = str;
    }

    public String toString() {
        return "Marker(key=" + this.key + ", action=" + this.action + ", timestamp=" + this.timestamp + ", step=" + this.step + ", statusCode=" + this.statusCode + ", success=" + this.success + ", url=" + ((Object) this.url) + ", idListCount=" + this.idListCount + ", reason=" + ((Object) this.reason) + ", sdkRegion=" + ((Object) this.sdkRegion) + ", markerID=" + ((Object) this.markerID) + ", attempt=" + this.attempt + ", isRetry=" + this.isRetry + ", isDelta=" + this.isDelta + ", configName=" + ((Object) this.configName) + ", evaluationDetails=" + this.evaluationDetails + ", error=" + this.error + ", hasNetwork=" + this.hasNetwork + ", timeoutMS=" + this.timeoutMS + ", isBlocking=" + this.isBlocking + ')';
    }

    public Marker(KeyType keyType, ActionType actionType, Double d10, StepType stepType, Integer num, Boolean bool, String str, Integer num2, String str2, String str3, String str4, Integer num3, Boolean bool2, Boolean bool3, String str5, EvaluationDetails evaluationDetails, ErrorMessage errorMessage, Boolean bool4, Integer num4, Boolean bool5) {
        this.key = keyType;
        this.action = actionType;
        this.timestamp = d10;
        this.step = stepType;
        this.statusCode = num;
        this.success = bool;
        this.url = str;
        this.idListCount = num2;
        this.reason = str2;
        this.sdkRegion = str3;
        this.markerID = str4;
        this.attempt = num3;
        this.isRetry = bool2;
        this.isDelta = bool3;
        this.configName = str5;
        this.evaluationDetails = evaluationDetails;
        this.error = errorMessage;
        this.hasNetwork = bool4;
        this.timeoutMS = num4;
        this.isBlocking = bool5;
    }

    public /* synthetic */ Marker(KeyType keyType, ActionType actionType, Double d10, StepType stepType, Integer num, Boolean bool, String str, Integer num2, String str2, String str3, String str4, Integer num3, Boolean bool2, Boolean bool3, String str5, EvaluationDetails evaluationDetails, ErrorMessage errorMessage, Boolean bool4, Integer num4, Boolean bool5, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : keyType, (i10 & 2) != 0 ? null : actionType, (i10 & 4) != 0 ? null : d10, (i10 & 8) != 0 ? null : stepType, (i10 & 16) != 0 ? null : num, (i10 & 32) != 0 ? null : bool, (i10 & 64) != 0 ? null : str, (i10 & 128) != 0 ? null : num2, (i10 & 256) != 0 ? null : str2, (i10 & 512) != 0 ? null : str3, (i10 & 1024) != 0 ? null : str4, (i10 & 2048) != 0 ? null : num3, (i10 & 4096) != 0 ? null : bool2, (i10 & 8192) != 0 ? null : bool3, (i10 & 16384) != 0 ? null : str5, (i10 & 32768) != 0 ? null : evaluationDetails, (i10 & 65536) != 0 ? null : errorMessage, (i10 & 131072) != 0 ? null : bool4, (i10 & 262144) != 0 ? null : num4, (i10 & 524288) != 0 ? null : bool5);
    }
}
