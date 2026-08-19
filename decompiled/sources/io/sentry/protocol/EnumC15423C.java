package io.sentry.protocol;

import java.util.Locale;

/* JADX INFO: renamed from: io.sentry.protocol.C */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC15423C {
    CUSTOM,
    URL,
    ROUTE,
    VIEW,
    COMPONENT,
    TASK;

    public String apiName() {
        return name().toLowerCase(Locale.ROOT);
    }
}
