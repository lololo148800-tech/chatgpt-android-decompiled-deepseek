package com.withpersona.sdk2.inquiry.internal.network;

import bj.InterfaceC11472s;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import p342Nj.EnumC5812f;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC11472s(generateAdapter = true)
@Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/internal/network/ErrorRequest;", "", "Nj/f", "inquiry-internal_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class ErrorRequest {

    /* JADX INFO: renamed from: a */
    public final EnumC5812f f40824a;

    /* JADX INFO: renamed from: b */
    public final Object f40825b;

    public ErrorRequest(EnumC5812f errorType, Object obj) {
        AbstractC16544l.m18094g(errorType, "errorType");
        this.f40824a = errorType;
        this.f40825b = obj;
    }
}
