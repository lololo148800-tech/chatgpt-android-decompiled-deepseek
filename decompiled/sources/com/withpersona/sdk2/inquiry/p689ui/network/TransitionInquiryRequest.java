package com.withpersona.sdk2.inquiry.p689ui.network;

import bj.InterfaceC11472s;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC11472s(generateAdapter = true)
@Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/ui/network/TransitionInquiryRequest;", "", "Attributes", "Data", "Meta", "ui_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class TransitionInquiryRequest {

    /* JADX INFO: renamed from: a */
    public final Data f41034a;

    /* JADX INFO: renamed from: b */
    public final Meta f41035b;

    @InterfaceC11472s(generateAdapter = true)
    @Metadata(m18066d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/ui/network/TransitionInquiryRequest$Attributes;", "", "ui_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class Attributes {

        /* JADX INFO: renamed from: a */
        public final Map f41036a;

        public Attributes(Map map) {
            this.f41036a = map;
        }
    }

    @InterfaceC11472s(generateAdapter = true)
    @Metadata(m18066d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/ui/network/TransitionInquiryRequest$Data;", "", "ui_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class Data {

        /* JADX INFO: renamed from: a */
        public final Attributes f41037a;

        public Data(Attributes attributes) {
            this.f41037a = attributes;
        }
    }

    @InterfaceC11472s(generateAdapter = true)
    @Metadata(m18066d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/ui/network/TransitionInquiryRequest$Meta;", "", "ui_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class Meta {

        /* JADX INFO: renamed from: a */
        public final String f41038a;

        /* JADX INFO: renamed from: b */
        public final String f41039b;

        public Meta(String fromComponent, String fromStep) {
            AbstractC16544l.m18094g(fromComponent, "fromComponent");
            AbstractC16544l.m18094g(fromStep, "fromStep");
            this.f41038a = fromComponent;
            this.f41039b = fromStep;
        }
    }

    public TransitionInquiryRequest(Data data, Meta meta) {
        this.f41034a = data;
        this.f41035b = meta;
    }
}
