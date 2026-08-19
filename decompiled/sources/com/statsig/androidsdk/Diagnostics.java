package com.statsig.androidsdk;

import android.gov.nist.javax.sip.parser.TokenNames;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import livekit.LivekitInternal$NodeStats;
import mm.C17309l;
import p817j$.util.DesugarCollections;
import p909nm.AbstractC17659D;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010%\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 02\u00020\u0001:\u00010B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ#\u0010\u000e\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00102\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\b¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0017\u001a\u00020\u00142\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0017\u0010\u0018J9\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00192\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u001e\u0010\u001fJA\u0010!\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010 \u001a\u00020\u00022\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b!\u0010\"R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010#R\"\u0010$\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010\u0018R\u0016\u0010)\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\"\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b0+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010,R,\u0010/\u001a\u0018\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0-0+j\u0002`.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u0010,¨\u00061"}, m18067d2 = {"Lcom/statsig/androidsdk/Diagnostics;", "", "", "isDisabled", "<init>", "(Z)V", "Lcom/statsig/androidsdk/ContextType;", "context", "", "getMaxMarkers", "(Lcom/statsig/androidsdk/ContextType;)I", "Lcom/statsig/androidsdk/Marker;", "marker", "overrideContext", "addMarker", "(Lcom/statsig/androidsdk/Marker;Lcom/statsig/androidsdk/ContextType;)Z", "", "getMarkers", "(Lcom/statsig/androidsdk/ContextType;)Ljava/util/List;", "maxMarkers", "Lmm/C;", "setMaxMarkers", "(Lcom/statsig/androidsdk/ContextType;I)V", "clearContext", "(Lcom/statsig/androidsdk/ContextType;)V", "Lcom/statsig/androidsdk/KeyType;", SubscriberAttributeKt.JSON_NAME_KEY, "Lcom/statsig/androidsdk/StepType;", "step", "additionalMarker", "markStart", "(Lcom/statsig/androidsdk/KeyType;Lcom/statsig/androidsdk/StepType;Lcom/statsig/androidsdk/Marker;Lcom/statsig/androidsdk/ContextType;)Z", "success", "markEnd", "(Lcom/statsig/androidsdk/KeyType;ZLcom/statsig/androidsdk/StepType;Lcom/statsig/androidsdk/Marker;Lcom/statsig/androidsdk/ContextType;)Z", "Z", "diagnosticsContext", "Lcom/statsig/androidsdk/ContextType;", "getDiagnosticsContext", "()Lcom/statsig/androidsdk/ContextType;", "setDiagnosticsContext", "defaultMaxMarkers", TokenNames.f32012I, "", "Ljava/util/Map;", "", "Lcom/statsig/androidsdk/DiagnosticsMarkers;", "markers", "Companion", "build_release"}, m18068k = 1, m18069mv = {1, 5, 1}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class Diagnostics {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private int defaultMaxMarkers;
    private ContextType diagnosticsContext;
    private boolean isDisabled;
    private Map<ContextType, List<Marker>> markers;
    private Map<ContextType, Integer> maxMarkers;

    @Metadata(m18066d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, m18067d2 = {"Lcom/statsig/androidsdk/Diagnostics$Companion;", "", "()V", "formatFailedResponse", "Lcom/statsig/androidsdk/Marker$ErrorMessage;", "failResponse", "Lcom/statsig/androidsdk/InitializeResponse$FailedInitializeResponse;", "build_release"}, m18068k = 1, m18069mv = {1, 5, 1}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Marker.ErrorMessage formatFailedResponse(InitializeResponse.FailedInitializeResponse failResponse) {
            String string;
            AbstractC16544l.m18094g(failResponse, "failResponse");
            Exception exception = failResponse.getException();
            Class<?> cls = exception == null ? null : exception.getClass();
            String str = (cls == null || (string = cls.toString()) == null) ? "unknown" : string;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(failResponse.getReason());
            sb2.append(" : ");
            Exception exception2 = failResponse.getException();
            sb2.append((Object) (exception2 != null ? exception2.getMessage() : null));
            return new Marker.ErrorMessage(sb2.toString(), str, null, 4, null);
        }

        private Companion() {
        }
    }

    @Metadata(m18068k = 3, m18069mv = {1, 5, 1}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ContextType.valuesCustom().length];
            iArr[ContextType.INITIALIZE.ordinal()] = 1;
            iArr[ContextType.UPDATE_USER.ordinal()] = 2;
            iArr[ContextType.API_CALL.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public Diagnostics(boolean z6) {
        this.isDisabled = z6;
        ContextType contextType = ContextType.INITIALIZE;
        this.diagnosticsContext = contextType;
        this.defaultMaxMarkers = 30;
        this.maxMarkers = AbstractC17659D.m19246h(new C17309l(contextType, 30), new C17309l(ContextType.API_CALL, Integer.valueOf(this.defaultMaxMarkers)), new C17309l(ContextType.EVENT_LOGGING, 0), new C17309l(ContextType.CONFIG_SYNC, 0), new C17309l(ContextType.UPDATE_USER, Integer.valueOf(this.defaultMaxMarkers)));
        Map<ContextType, List<Marker>> mapSynchronizedMap = DesugarCollections.synchronizedMap(new LinkedHashMap());
        AbstractC16544l.m18093f(mapSynchronizedMap, "synchronizedMap(mutableMapOf())");
        this.markers = mapSynchronizedMap;
    }

    private final boolean addMarker(Marker marker, ContextType overrideContext) {
        if (overrideContext == null) {
            overrideContext = this.diagnosticsContext;
        }
        int maxMarkers = getMaxMarkers(overrideContext);
        List<Marker> list = this.markers.get(overrideContext);
        if (maxMarkers <= (list == null ? 0 : list.size())) {
            return false;
        }
        if (this.markers.get(overrideContext) == null) {
            Map<ContextType, List<Marker>> map = this.markers;
            List<Marker> listSynchronizedList = DesugarCollections.synchronizedList(new ArrayList());
            AbstractC16544l.m18093f(listSynchronizedList, "synchronizedList(mutableListOf())");
            map.put(overrideContext, listSynchronizedList);
        }
        List<Marker> list2 = this.markers.get(overrideContext);
        if (list2 != null) {
            list2.add(marker);
        }
        this.markers.values();
        return true;
    }

    public static /* synthetic */ boolean addMarker$default(Diagnostics diagnostics, Marker marker, ContextType contextType, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            contextType = null;
        }
        return diagnostics.addMarker(marker, contextType);
    }

    public static /* synthetic */ void clearContext$default(Diagnostics diagnostics, ContextType contextType, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            contextType = null;
        }
        diagnostics.clearContext(contextType);
    }

    public static /* synthetic */ List getMarkers$default(Diagnostics diagnostics, ContextType contextType, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            contextType = null;
        }
        return diagnostics.getMarkers(contextType);
    }

    private final int getMaxMarkers(ContextType context) {
        Integer num = this.maxMarkers.get(context);
        return num == null ? this.defaultMaxMarkers : num.intValue();
    }

    public static /* synthetic */ boolean markStart$default(Diagnostics diagnostics, KeyType keyType, StepType stepType, Marker marker, ContextType contextType, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            stepType = null;
        }
        if ((i10 & 4) != 0) {
            marker = null;
        }
        if ((i10 & 8) != 0) {
            contextType = null;
        }
        return diagnostics.markStart(keyType, stepType, marker, contextType);
    }

    public final void clearContext(ContextType context) {
        Map<ContextType, List<Marker>> map = this.markers;
        if (context == null) {
            context = this.diagnosticsContext;
        }
        List<Marker> listSynchronizedList = DesugarCollections.synchronizedList(new ArrayList());
        AbstractC16544l.m18093f(listSynchronizedList, "synchronizedList(\n            mutableListOf(),\n        )");
        map.put(context, listSynchronizedList);
    }

    public final ContextType getDiagnosticsContext() {
        return this.diagnosticsContext;
    }

    public final List<Marker> getMarkers(ContextType context) {
        Map<ContextType, List<Marker>> map = this.markers;
        if (context == null) {
            context = this.diagnosticsContext;
        }
        List<Marker> list = map.get(context);
        if (list != null) {
            return list;
        }
        List<Marker> listSynchronizedList = DesugarCollections.synchronizedList(new ArrayList());
        AbstractC16544l.m18093f(listSynchronizedList, "synchronizedList(\n            mutableListOf(),\n        )");
        return listSynchronizedList;
    }

    public final boolean markEnd(KeyType key, boolean success, StepType step, Marker additionalMarker, ContextType overrideContext) {
        Marker marker;
        AbstractC16544l.m18094g(key, "key");
        ContextType contextType = overrideContext == null ? this.diagnosticsContext : overrideContext;
        if (this.isDisabled && contextType == ContextType.API_CALL) {
            return false;
        }
        int maxMarkers = getMaxMarkers(contextType);
        List<Marker> list = this.markers.get(contextType);
        if (maxMarkers < (list == null ? 0 : list.size())) {
            return false;
        }
        Marker marker2 = new Marker(key, ActionType.END, Double.valueOf(System.nanoTime() / 1000000.0d), step, null, Boolean.valueOf(success), null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1048528, null);
        int i10 = WhenMappings.$EnumSwitchMapping$0[contextType.ordinal()];
        if (i10 == 1 || i10 == 2) {
            marker = marker2;
            marker.setEvaluationDetails(additionalMarker == null ? null : additionalMarker.getEvaluationDetails());
            marker.setAttempt(additionalMarker == null ? null : additionalMarker.getAttempt());
            marker.setSdkRegion(additionalMarker == null ? null : additionalMarker.getSdkRegion());
            marker.setStatusCode(additionalMarker == null ? null : additionalMarker.getStatusCode());
            marker.setError(additionalMarker == null ? null : additionalMarker.getError());
        } else {
            if (i10 != 3) {
                return false;
            }
            marker = marker2;
            marker.setMarkerID(additionalMarker == null ? null : additionalMarker.getMarkerID());
            marker.setConfigName(additionalMarker == null ? null : additionalMarker.getConfigName());
        }
        if (step == StepType.NETWORK_REQUEST) {
            marker.setHasNetwork(additionalMarker != null ? additionalMarker.getHasNetwork() : null);
        }
        return addMarker(marker, contextType);
    }

    public final boolean markStart(KeyType key, StepType step, Marker additionalMarker, ContextType overrideContext) {
        Marker marker;
        AbstractC16544l.m18094g(key, "key");
        ContextType contextType = overrideContext == null ? this.diagnosticsContext : overrideContext;
        if (this.isDisabled && contextType == ContextType.API_CALL) {
            return false;
        }
        int maxMarkers = getMaxMarkers(contextType);
        List<Marker> list = this.markers.get(contextType);
        if (maxMarkers < (list == null ? 0 : list.size())) {
            return false;
        }
        ContextType contextType2 = contextType;
        Marker marker2 = new Marker(key, ActionType.START, Double.valueOf(System.nanoTime() / 1000000.0d), step, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1048560, null);
        int i10 = WhenMappings.$EnumSwitchMapping$0[contextType2.ordinal()];
        if (i10 == 1 || i10 == 2) {
            marker = marker2;
            if (key == KeyType.INITIALIZE && step == StepType.NETWORK_REQUEST) {
                marker.setAttempt(additionalMarker != null ? additionalMarker.getAttempt() : null);
            }
        } else {
            if (i10 != 3) {
                return false;
            }
            marker = marker2;
            marker.setMarkerID(additionalMarker != null ? additionalMarker.getMarkerID() : null);
        }
        return addMarker(marker, contextType2);
    }

    public final void setDiagnosticsContext(ContextType contextType) {
        AbstractC16544l.m18094g(contextType, "<set-?>");
        this.diagnosticsContext = contextType;
    }

    public final void setMaxMarkers(ContextType context, int maxMarkers) {
        AbstractC16544l.m18094g(context, "context");
        this.maxMarkers.put(context, Integer.valueOf(maxMarkers));
    }
}
