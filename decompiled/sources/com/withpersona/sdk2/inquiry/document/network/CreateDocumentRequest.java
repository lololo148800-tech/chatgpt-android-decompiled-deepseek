package com.withpersona.sdk2.inquiry.document.network;

import bj.InterfaceC11472s;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC11472s(generateAdapter = true)
@Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/document/network/CreateDocumentRequest;", "", "Attributes", "Data", "Meta", "document_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class CreateDocumentRequest {

    /* JADX INFO: renamed from: a */
    public final Data f40542a;

    /* JADX INFO: renamed from: b */
    public final Meta f40543b;

    @InterfaceC11472s(generateAdapter = true)
    @Metadata(m18066d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/document/network/CreateDocumentRequest$Attributes;", "", "document_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class Attributes {

        /* JADX INFO: renamed from: a */
        public final String f40544a;

        /* JADX INFO: renamed from: b */
        public final int f40545b;

        public Attributes(String kind, int i10) {
            AbstractC16544l.m18094g(kind, "kind");
            this.f40544a = kind;
            this.f40545b = i10;
        }
    }

    @InterfaceC11472s(generateAdapter = true)
    @Metadata(m18066d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/document/network/CreateDocumentRequest$Data;", "", "document_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class Data {

        /* JADX INFO: renamed from: a */
        public final String f40546a;

        /* JADX INFO: renamed from: b */
        public final Attributes f40547b;

        public Data(String str, Attributes attributes) {
            this.f40546a = str;
            this.f40547b = attributes;
        }
    }

    @InterfaceC11472s(generateAdapter = true)
    @Metadata(m18066d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/document/network/CreateDocumentRequest$Meta;", "", "document_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class Meta {

        /* JADX INFO: renamed from: a */
        public final String f40548a;

        public Meta(String fieldKeyDocument) {
            AbstractC16544l.m18094g(fieldKeyDocument, "fieldKeyDocument");
            this.f40548a = fieldKeyDocument;
        }
    }

    public CreateDocumentRequest(Data data, Meta meta) {
        this.f40542a = data;
        this.f40543b = meta;
    }
}
