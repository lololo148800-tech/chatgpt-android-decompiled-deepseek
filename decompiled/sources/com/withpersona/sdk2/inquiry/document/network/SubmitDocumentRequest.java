package com.withpersona.sdk2.inquiry.document.network;

import android.gov.nist.javax.sip.header.extensions.ReferencesHeader;
import bj.InterfaceC11472s;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import livekit.LivekitInternal$NodeStats;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC11472s(generateAdapter = true)
@Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/document/network/SubmitDocumentRequest;", "", "Data", "Meta", "document_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class SubmitDocumentRequest {

    /* JADX INFO: renamed from: a */
    public final Data f40583a;

    /* JADX INFO: renamed from: b */
    public final Meta f40584b;

    @InterfaceC11472s(generateAdapter = true)
    @Metadata(m18066d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/document/network/SubmitDocumentRequest$Meta;", "", "document_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class Meta {

        /* JADX INFO: renamed from: a */
        public final String f40586a;

        /* JADX INFO: renamed from: b */
        public final String f40587b;

        public Meta(String fromStep, String fromComponent) {
            AbstractC16544l.m18094g(fromStep, "fromStep");
            AbstractC16544l.m18094g(fromComponent, "fromComponent");
            this.f40586a = fromStep;
            this.f40587b = fromComponent;
        }
    }

    public SubmitDocumentRequest(Data data, Meta meta) {
        AbstractC16544l.m18094g(data, "data");
        AbstractC16544l.m18094g(meta, "meta");
        this.f40583a = data;
        this.f40584b = meta;
    }

    @InterfaceC11472s(generateAdapter = true)
    @Metadata(m18066d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/document/network/SubmitDocumentRequest$Data;", "", "document_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class Data {

        /* JADX INFO: renamed from: a */
        public final String f40585a;

        public Data(String type) {
            AbstractC16544l.m18094g(type, "type");
            this.f40585a = type;
        }

        public /* synthetic */ Data(String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? ReferencesHeader.INQUIRY : str);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ SubmitDocumentRequest(Data data, Meta meta, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? new Data(null, 1, 0 == true ? 1 : 0) : data, meta);
    }
}
