package com.statsig.androidsdk;

import java.util.Map;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import mm.C17296C;
import p025An.InterfaceC0571F;
import p103Dn.InterfaceC2184i;
import p972qm.InterfaceC18770c;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b`\u0018\u00002\u00020\u0001Jo\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0012H¦@ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J9\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u00172\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\u0019\u0010\u001aJ/\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u00022\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u001b\u0010 \u001a\u00020\u001d2\u0006\u0010\u0003\u001a\u00020\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b \u0010!J\u001b\u0010#\u001a\u00020\u001d2\u0006\u0010\"\u001a\u00020\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b#\u0010!\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006$"}, m18067d2 = {"Lcom/statsig/androidsdk/StatsigNetwork;", "", "", "api", "Lcom/statsig/androidsdk/StatsigUser;", "user", "", "sinceTime", "Lcom/statsig/androidsdk/StatsigMetadata;", "metadata", "LAn/F;", "coroutineScope", "Lcom/statsig/androidsdk/ContextType;", "context", "Lcom/statsig/androidsdk/Diagnostics;", "diagnostics", "Lcom/statsig/androidsdk/HashAlgorithm;", "hashUsed", "", "previousDerivedFields", "Lcom/statsig/androidsdk/InitializeResponse;", "initialize", "(Ljava/lang/String;Lcom/statsig/androidsdk/StatsigUser;Ljava/lang/Long;Lcom/statsig/androidsdk/StatsigMetadata;LAn/F;Lcom/statsig/androidsdk/ContextType;Lcom/statsig/androidsdk/Diagnostics;Lcom/statsig/androidsdk/HashAlgorithm;Ljava/util/Map;Lqm/c;)Ljava/lang/Object;", "LDn/i;", "Lcom/statsig/androidsdk/InitializeResponse$SuccessfulInitializeResponse;", "pollForChanges", "(Ljava/lang/String;Lcom/statsig/androidsdk/StatsigUser;Ljava/lang/Long;Lcom/statsig/androidsdk/StatsigMetadata;)LDn/i;", "bodyString", "eventsCount", "Lmm/C;", "apiPostLogs", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lqm/c;)Ljava/lang/Object;", "apiRetryFailedLogs", "(Ljava/lang/String;Lqm/c;)Ljava/lang/Object;", "requestBody", "addFailedLogRequest", "build_release"}, m18068k = 1, m18069mv = {1, 5, 1}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public interface StatsigNetwork {

    @Metadata(m18068k = 3, m18069mv = {1, 5, 1}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class DefaultImpls {
        public static /* synthetic */ Object apiPostLogs$default(StatsigNetwork statsigNetwork, String str, String str2, String str3, InterfaceC18770c interfaceC18770c, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: apiPostLogs");
            }
            if ((i10 & 4) != 0) {
                str3 = null;
            }
            return statsigNetwork.apiPostLogs(str, str2, str3, interfaceC18770c);
        }

        public static /* synthetic */ Object initialize$default(StatsigNetwork statsigNetwork, String str, StatsigUser statsigUser, Long l4, StatsigMetadata statsigMetadata, InterfaceC0571F interfaceC0571F, ContextType contextType, Diagnostics diagnostics, HashAlgorithm hashAlgorithm, Map map, InterfaceC18770c interfaceC18770c, int i10, Object obj) {
            if (obj == null) {
                return statsigNetwork.initialize(str, statsigUser, l4, statsigMetadata, interfaceC0571F, contextType, (i10 & 64) != 0 ? null : diagnostics, hashAlgorithm, map, interfaceC18770c);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: initialize");
        }
    }

    Object addFailedLogRequest(String str, InterfaceC18770c<? super C17296C> interfaceC18770c);

    Object apiPostLogs(String str, String str2, String str3, InterfaceC18770c<? super C17296C> interfaceC18770c);

    Object apiRetryFailedLogs(String str, InterfaceC18770c<? super C17296C> interfaceC18770c);

    Object initialize(String str, StatsigUser statsigUser, Long l4, StatsigMetadata statsigMetadata, InterfaceC0571F interfaceC0571F, ContextType contextType, Diagnostics diagnostics, HashAlgorithm hashAlgorithm, Map<String, String> map, InterfaceC18770c<? super InitializeResponse> interfaceC18770c);

    InterfaceC2184i pollForChanges(String api, StatsigUser user, Long sinceTime, StatsigMetadata metadata);
}
