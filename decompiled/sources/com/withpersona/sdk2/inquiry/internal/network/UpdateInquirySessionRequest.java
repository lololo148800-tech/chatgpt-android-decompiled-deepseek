package com.withpersona.sdk2.inquiry.internal.network;

import bj.InterfaceC11472s;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import livekit.LivekitInternal$NodeStats;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC11472s(generateAdapter = true)
@Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/internal/network/UpdateInquirySessionRequest;", "", "Attributes", "Data", "inquiry-internal_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class UpdateInquirySessionRequest {

    /* JADX INFO: renamed from: a */
    public final Data f40835a;

    @InterfaceC11472s(generateAdapter = true)
    @Metadata(m18066d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/internal/network/UpdateInquirySessionRequest$Data;", "", "inquiry-internal_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class Data {

        /* JADX INFO: renamed from: a */
        public final Attributes f40839a;

        public Data(Attributes attributes) {
            this.f40839a = attributes;
        }
    }

    public UpdateInquirySessionRequest(Data data) {
        this.f40835a = data;
    }

    @InterfaceC11472s(generateAdapter = true)
    @Metadata(m18066d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/internal/network/UpdateInquirySessionRequest$Attributes;", "", "inquiry-internal_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class Attributes {

        /* JADX INFO: renamed from: a */
        public final Double f40836a;

        /* JADX INFO: renamed from: b */
        public final Double f40837b;

        /* JADX INFO: renamed from: c */
        public final String f40838c;

        public Attributes(Double d10, Double d11, String str) {
            this.f40836a = d10;
            this.f40837b = d11;
            this.f40838c = str;
        }

        public /* synthetic */ Attributes(Double d10, Double d11, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? null : d10, (i10 & 2) != 0 ? null : d11, (i10 & 4) != 0 ? null : str);
        }
    }
}
