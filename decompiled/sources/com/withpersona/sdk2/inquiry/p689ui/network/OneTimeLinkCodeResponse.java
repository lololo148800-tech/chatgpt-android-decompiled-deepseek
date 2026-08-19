package com.withpersona.sdk2.inquiry.p689ui.network;

import android.gov.nist.core.Separators;
import bj.InterfaceC11472s;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC11472s(generateAdapter = true)
@Metadata(m18066d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/ui/network/OneTimeLinkCodeResponse;", "", "ui_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final /* data */ class OneTimeLinkCodeResponse {

    /* JADX INFO: renamed from: a */
    public final Metadata f41031a;

    public OneTimeLinkCodeResponse(Metadata metadata) {
        this.f41031a = metadata;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof OneTimeLinkCodeResponse) && AbstractC16544l.m18089b(this.f41031a, ((OneTimeLinkCodeResponse) obj).f41031a);
    }

    public final int hashCode() {
        Metadata metadata = this.f41031a;
        if (metadata == null) {
            return 0;
        }
        return metadata.hashCode();
    }

    public final String toString() {
        return "OneTimeLinkCodeResponse(meta=" + this.f41031a + Separators.RPAREN;
    }
}
