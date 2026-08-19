package com.withpersona.sdk2.inquiry.internal.network;

import bj.InterfaceC11472s;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC11472s(generateAdapter = true)
@Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/internal/network/TransitionBackRequest;", "", "Meta", "inquiry-internal_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class TransitionBackRequest {

    /* JADX INFO: renamed from: a */
    public final Meta f40829a;

    @InterfaceC11472s(generateAdapter = true)
    @Metadata(m18066d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/internal/network/TransitionBackRequest$Meta;", "", "inquiry-internal_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class Meta {

        /* JADX INFO: renamed from: a */
        public final String f40830a;

        public Meta(String str) {
            this.f40830a = str;
        }
    }

    public TransitionBackRequest(Meta meta) {
        this.f40829a = meta;
    }
}
