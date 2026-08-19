package com.withpersona.sdk2.inquiry.network.dto;

import android.gov.nist.javax.sip.header.ParameterNames;
import bj.InterfaceC11468o;
import bj.InterfaceC11472s;
import java.util.Map;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import p247Jj.AbstractC4385H;
import p523V9.AbstractC7877E4;
import tm.InterfaceC20006a;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC11472s(generateAdapter = true)
@Metadata(m18066d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001:\u0004\u0007\b\t\nB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/CheckInquiryResponse;", "", "data", "Lcom/withpersona/sdk2/inquiry/network/dto/CheckInquiryResponse$Data;", "(Lcom/withpersona/sdk2/inquiry/network/dto/CheckInquiryResponse$Data;)V", "getData", "()Lcom/withpersona/sdk2/inquiry/network/dto/CheckInquiryResponse$Data;", "Attributes", "Data", "PollingMode", "WaitForTransitionConfig", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class CheckInquiryResponse {
    private final Data data;

    @InterfaceC11472s(generateAdapter = true)
    @Metadata(m18066d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0007\u0018\u00002\u00020\u0001BM\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\b\u0001\u0010\u000b\u001a\u00020\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u000f\u001a\u0004\b\u0012\u0010\u0011R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R%\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u000f\u001a\u0004\b\u001c\u0010\u0011¨\u0006\u001d"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/CheckInquiryResponse$Attributes;", "", "", "selectedCountryCode", "status", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep;", "nextStep", "", "LJj/H;", "fields", "Lcom/withpersona/sdk2/inquiry/network/dto/CheckInquiryResponse$WaitForTransitionConfig;", "waitForTransitionConfig", "environment", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep;Ljava/util/Map;Lcom/withpersona/sdk2/inquiry/network/dto/CheckInquiryResponse$WaitForTransitionConfig;Ljava/lang/String;)V", "Ljava/lang/String;", "getSelectedCountryCode", "()Ljava/lang/String;", "getStatus", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep;", "getNextStep", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep;", "Ljava/util/Map;", "getFields", "()Ljava/util/Map;", "Lcom/withpersona/sdk2/inquiry/network/dto/CheckInquiryResponse$WaitForTransitionConfig;", "getWaitForTransitionConfig", "()Lcom/withpersona/sdk2/inquiry/network/dto/CheckInquiryResponse$WaitForTransitionConfig;", "getEnvironment", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class Attributes {
        private final String environment;
        private final Map<String, AbstractC4385H> fields;
        private final NextStep nextStep;
        private final String selectedCountryCode;
        private final String status;
        private final WaitForTransitionConfig waitForTransitionConfig;

        /* JADX WARN: Multi-variable type inference failed */
        public Attributes(String str, String str2, NextStep nextStep, Map<String, ? extends AbstractC4385H> map, @InterfaceC11468o(name = "waitForTransition") WaitForTransitionConfig waitForTransitionConfig, String str3) {
            this.selectedCountryCode = str;
            this.status = str2;
            this.nextStep = nextStep;
            this.fields = map;
            this.waitForTransitionConfig = waitForTransitionConfig;
            this.environment = str3;
        }

        public final String getEnvironment() {
            return this.environment;
        }

        public final Map<String, AbstractC4385H> getFields() {
            return this.fields;
        }

        public final NextStep getNextStep() {
            return this.nextStep;
        }

        public final String getSelectedCountryCode() {
            return this.selectedCountryCode;
        }

        public final String getStatus() {
            return this.status;
        }

        public final WaitForTransitionConfig getWaitForTransitionConfig() {
            return this.waitForTransitionConfig;
        }
    }

    @InterfaceC11472s(generateAdapter = true)
    @Metadata(m18066d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\r"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/CheckInquiryResponse$Data;", "", ParameterNames.f31999ID, "", "type", "attributes", "Lcom/withpersona/sdk2/inquiry/network/dto/CheckInquiryResponse$Attributes;", "(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/CheckInquiryResponse$Attributes;)V", "getAttributes", "()Lcom/withpersona/sdk2/inquiry/network/dto/CheckInquiryResponse$Attributes;", "getId", "()Ljava/lang/String;", "getType", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class Data {
        private final Attributes attributes;
        private final String id;
        private final String type;

        public Data(String str, String str2, Attributes attributes) {
            this.id = str;
            this.type = str2;
            this.attributes = attributes;
        }

        public final Attributes getAttributes() {
            return this.attributes;
        }

        public final String getId() {
            return this.id;
        }

        public final String getType() {
            return this.type;
        }
    }

    @Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/CheckInquiryResponse$PollingMode;", "", "(Ljava/lang/String;I)V", "Blocking", "Background", "None", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public enum PollingMode {
        Blocking,
        Background,
        None;

        private static final /* synthetic */ InterfaceC20006a $ENTRIES = AbstractC7877E4.m8156j(values());

        public static InterfaceC20006a getEntries() {
            return $ENTRIES;
        }
    }

    @InterfaceC11472s(generateAdapter = true)
    @Metadata(m18066d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/CheckInquiryResponse$WaitForTransitionConfig;", "", "intervalMs", "", "maxAttempts", "pollingMode", "Lcom/withpersona/sdk2/inquiry/network/dto/CheckInquiryResponse$PollingMode;", "(Ljava/lang/Long;Ljava/lang/Long;Lcom/withpersona/sdk2/inquiry/network/dto/CheckInquiryResponse$PollingMode;)V", "getIntervalMs", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getMaxAttempts", "getPollingMode", "()Lcom/withpersona/sdk2/inquiry/network/dto/CheckInquiryResponse$PollingMode;", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class WaitForTransitionConfig {
        private final Long intervalMs;
        private final Long maxAttempts;
        private final PollingMode pollingMode;

        public WaitForTransitionConfig(Long l4, Long l10, PollingMode pollingMode) {
            this.intervalMs = l4;
            this.maxAttempts = l10;
            this.pollingMode = pollingMode;
        }

        public final Long getIntervalMs() {
            return this.intervalMs;
        }

        public final Long getMaxAttempts() {
            return this.maxAttempts;
        }

        public final PollingMode getPollingMode() {
            return this.pollingMode;
        }
    }

    public CheckInquiryResponse(Data data) {
        this.data = data;
    }

    public final Data getData() {
        return this.data;
    }
}
