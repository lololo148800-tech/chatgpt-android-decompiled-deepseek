package io.sentry;

import android.gov.nist.javax.sip.header.ParameterNames;

/* JADX INFO: renamed from: io.sentry.h */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC15359h {
    All("__all__"),
    Default("default"),
    Error("error"),
    Session(ParameterNames.SESSION),
    Attachment("attachment"),
    Monitor("monitor"),
    Profile("profile"),
    MetricBucket("metric_bucket"),
    Transaction("transaction"),
    Replay("replay"),
    Span("span"),
    Security("security"),
    UserReport("user_report"),
    Unknown("unknown");

    private final String category;

    EnumC15359h(String str) {
        this.category = str;
    }

    public String getCategory() {
        return this.category;
    }
}
