package com.withpersona.sdk2.inquiry.p689ui.network;

import android.gov.nist.core.Separators;
import bj.InterfaceC11472s;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import p571X9.AbstractC9306j0;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC11472s(generateAdapter = true)
@kotlin.Metadata(m18066d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/ui/network/Metadata;", "", "ui_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final /* data */ class Metadata {

    /* JADX INFO: renamed from: a */
    public final String f41028a;

    public Metadata(String str) {
        this.f41028a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Metadata) && AbstractC16544l.m18089b(this.f41028a, ((Metadata) obj).f41028a);
    }

    public final int hashCode() {
        String str = this.f41028a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return AbstractC9306j0.m9891j(this.f41028a, Separators.RPAREN, new StringBuilder("Metadata(oneTimeLinkCode="));
    }
}
