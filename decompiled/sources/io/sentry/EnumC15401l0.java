package io.sentry;

import java.util.Locale;

/* JADX INFO: renamed from: io.sentry.l0 */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC15401l0 implements InterfaceC15404m0 {
    NANOSECOND,
    MICROSECOND,
    MILLISECOND,
    SECOND,
    MINUTE,
    HOUR,
    DAY,
    WEEK;

    @Override // io.sentry.InterfaceC15404m0
    public String apiName() {
        return name().toLowerCase(Locale.ROOT);
    }
}
