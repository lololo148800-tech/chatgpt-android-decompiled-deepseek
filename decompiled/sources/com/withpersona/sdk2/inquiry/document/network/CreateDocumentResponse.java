package com.withpersona.sdk2.inquiry.document.network;

import bj.InterfaceC11472s;
import java.util.List;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC11472s(generateAdapter = true)
@Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/document/network/CreateDocumentResponse;", "", "Data", "document_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class CreateDocumentResponse {

    /* JADX INFO: renamed from: a */
    public final Data f40560a;

    /* JADX INFO: renamed from: b */
    public final List f40561b;

    @InterfaceC11472s(generateAdapter = true)
    @Metadata(m18066d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/document/network/CreateDocumentResponse$Data;", "", "document_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class Data {

        /* JADX INFO: renamed from: a */
        public final String f40562a;

        public Data(String str) {
            this.f40562a = str;
        }
    }

    public CreateDocumentResponse(Data data, List list) {
        this.f40560a = data;
        this.f40561b = list;
    }
}
