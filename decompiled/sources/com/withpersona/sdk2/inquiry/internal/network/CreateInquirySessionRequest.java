package com.withpersona.sdk2.inquiry.internal.network;

import bj.InterfaceC11472s;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import livekit.LivekitInternal$NodeStats;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC11472s(generateAdapter = true)
@Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquirySessionRequest;", "", "Data", "Meta", "inquiry-internal_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class CreateInquirySessionRequest {

    /* JADX INFO: renamed from: a */
    public final Data f40793a;

    /* JADX INFO: renamed from: b */
    public final Meta f40794b;

    @InterfaceC11472s(generateAdapter = true)
    @Metadata(m18066d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquirySessionRequest$Meta;", "", "inquiry-internal_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class Meta {

        /* JADX INFO: renamed from: a */
        public final String f40796a;

        public Meta(String inquiryId) {
            AbstractC16544l.m18094g(inquiryId, "inquiryId");
            this.f40796a = inquiryId;
        }
    }

    public CreateInquirySessionRequest(Data data, Meta meta) {
        this.f40793a = data;
        this.f40794b = meta;
    }

    @InterfaceC11472s(generateAdapter = true)
    @Metadata(m18066d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquirySessionRequest$Data;", "", "inquiry-internal_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class Data {

        /* JADX INFO: renamed from: a */
        public final String f40795a;

        public Data(String type) {
            AbstractC16544l.m18094g(type, "type");
            this.f40795a = type;
        }

        public /* synthetic */ Data(String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? "inquiry-session" : str);
        }
    }
}
