package com.withpersona.sdk2.inquiry.document.network;

import bj.InterfaceC11472s;
import java.util.List;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC11472s(generateAdapter = true)
@Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/document/network/DocumentFileData;", "", "Attributes", "RemoteDocumentFile", "document_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class DocumentFileData {

    /* JADX INFO: renamed from: a */
    public final String f40568a;

    /* JADX INFO: renamed from: b */
    public final Attributes f40569b;

    @InterfaceC11472s(generateAdapter = true)
    @Metadata(m18066d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/document/network/DocumentFileData$Attributes;", "", "document_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class Attributes {

        /* JADX INFO: renamed from: a */
        public final List f40570a;

        public Attributes(List list) {
            this.f40570a = list;
        }
    }

    @InterfaceC11472s(generateAdapter = true)
    @Metadata(m18066d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/document/network/DocumentFileData$RemoteDocumentFile;", "", "document_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class RemoteDocumentFile {

        /* JADX INFO: renamed from: a */
        public final String f40571a;

        /* JADX INFO: renamed from: b */
        public final String f40572b;

        public RemoteDocumentFile(String str, String str2) {
            this.f40571a = str;
            this.f40572b = str2;
        }
    }

    public DocumentFileData(String str, Attributes attributes) {
        this.f40568a = str;
        this.f40569b = attributes;
    }
}
