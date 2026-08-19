package com.withpersona.sdk2.inquiry.p689ui.network;

import bj.InterfaceC11472s;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC11472s(generateAdapter = true)
@Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/ui/network/AddressAutocompleteRequest;", "", "Meta", "ui_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class AddressAutocompleteRequest {

    /* JADX INFO: renamed from: a */
    public final Meta f41005a;

    @InterfaceC11472s(generateAdapter = true)
    @Metadata(m18066d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/ui/network/AddressAutocompleteRequest$Meta;", "", "ui_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class Meta {

        /* JADX INFO: renamed from: a */
        public final String f41006a;

        /* JADX INFO: renamed from: b */
        public final String f41007b;

        public Meta(String fromComponent, String searchInput) {
            AbstractC16544l.m18094g(fromComponent, "fromComponent");
            AbstractC16544l.m18094g(searchInput, "searchInput");
            this.f41006a = fromComponent;
            this.f41007b = searchInput;
        }
    }

    public AddressAutocompleteRequest(Meta meta) {
        this.f41005a = meta;
    }
}
