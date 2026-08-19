package io.sentry.cache;

import java.io.File;
import java.io.FilenameFilter;

/* JADX INFO: renamed from: io.sentry.cache.b */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C15328b implements FilenameFilter {
    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        return str.endsWith(".envelope");
    }
}
