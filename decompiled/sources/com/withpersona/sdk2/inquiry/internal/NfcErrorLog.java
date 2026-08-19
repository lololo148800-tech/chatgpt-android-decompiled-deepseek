package com.withpersona.sdk2.inquiry.internal;

import android.gov.nist.core.Separators;
import bj.InterfaceC11472s;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import p571X9.AbstractC9306j0;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC11472s(generateAdapter = true)
@Metadata(m18066d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/internal/NfcErrorLog;", "", "inquiry-internal_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final /* data */ class NfcErrorLog {

    /* JADX INFO: renamed from: a */
    public final String f40731a;

    public NfcErrorLog(String str) {
        this.f40731a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof NfcErrorLog) && AbstractC16544l.m18089b(this.f40731a, ((NfcErrorLog) obj).f40731a);
    }

    public final int hashCode() {
        String str = this.f40731a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return AbstractC9306j0.m9891j(this.f40731a, Separators.RPAREN, new StringBuilder("NfcErrorLog(info="));
    }
}
