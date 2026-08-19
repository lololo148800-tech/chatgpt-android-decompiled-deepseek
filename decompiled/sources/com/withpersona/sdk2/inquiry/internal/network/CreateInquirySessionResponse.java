package com.withpersona.sdk2.inquiry.internal.network;

import bj.InterfaceC11472s;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import livekit.LivekitInternal$NodeStats;
import p342Nj.EnumC5810d;
import p342Nj.EnumC5811e;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC11472s(generateAdapter = true)
@Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006¨\u0006\u0007"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquirySessionResponse;", "", "Attributes", "Data", "Nj/d", "Nj/e", "Meta", "inquiry-internal_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class CreateInquirySessionResponse {

    /* JADX INFO: renamed from: a */
    public final Data f40805a;

    /* JADX INFO: renamed from: b */
    public final Meta f40806b;

    @InterfaceC11472s(generateAdapter = true)
    @Metadata(m18066d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquirySessionResponse$Data;", "", "inquiry-internal_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class Data {

        /* JADX INFO: renamed from: a */
        public final String f40809a;

        /* JADX INFO: renamed from: b */
        public final Attributes f40810b;

        public Data(String str, Attributes attributes) {
            this.f40809a = str;
            this.f40810b = attributes;
        }
    }

    @InterfaceC11472s(generateAdapter = true)
    @Metadata(m18066d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquirySessionResponse$Meta;", "", "inquiry-internal_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class Meta {

        /* JADX INFO: renamed from: a */
        public final String f40811a;

        public Meta(String str) {
            this.f40811a = str;
        }
    }

    public CreateInquirySessionResponse(Data data, Meta meta) {
        this.f40805a = data;
        this.f40806b = meta;
    }

    @InterfaceC11472s(generateAdapter = true)
    @Metadata(m18066d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquirySessionResponse$Attributes;", "", "inquiry-internal_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class Attributes {

        /* JADX INFO: renamed from: a */
        public final EnumC5810d f40807a;

        /* JADX INFO: renamed from: b */
        public final EnumC5811e f40808b;

        public Attributes(EnumC5810d enumC5810d, EnumC5811e enumC5811e) {
            this.f40807a = enumC5810d;
            this.f40808b = enumC5811e;
        }

        public /* synthetic */ Attributes(EnumC5810d enumC5810d, EnumC5811e enumC5811e, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? null : enumC5810d, (i10 & 2) != 0 ? null : enumC5811e);
        }
    }
}
