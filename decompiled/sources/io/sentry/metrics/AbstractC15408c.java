package io.sentry.metrics;

import io.sentry.util.C15501f;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: io.sentry.metrics.c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC15408c {

    /* JADX INFO: renamed from: a */
    public static final long f48028a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ int f48029b = 0;

    static {
        Pattern.compile("\\W+");
        Pattern.compile("[^\\w\\-.]+");
        Pattern.compile("[^\\w\\-./]+");
        f48028a = (long) ((new C15501f().m16685a(24) / 1.6777216E7f) * 10000.0f);
    }
}
