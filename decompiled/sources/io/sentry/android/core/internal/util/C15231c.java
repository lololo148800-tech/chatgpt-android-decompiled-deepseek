package io.sentry.android.core.internal.util;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import p544W9.AbstractC8459C3;

/* JADX INFO: renamed from: io.sentry.android.core.internal.util.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C15231c {

    /* JADX INFO: renamed from: b */
    public static final C15231c f47528b = new C15231c();

    /* JADX INFO: renamed from: a */
    public final ArrayList f47529a = new ArrayList();

    /* JADX INFO: renamed from: a */
    public final synchronized ArrayList m16439a() {
        if (!this.f47529a.isEmpty()) {
            return this.f47529a;
        }
        File[] fileArrListFiles = new File("/sys/devices/system/cpu").listFiles();
        if (fileArrListFiles == null) {
            return new ArrayList();
        }
        for (File file : fileArrListFiles) {
            if (file.getName().matches("cpu[0-9]+")) {
                File file2 = new File(file, "cpufreq/cpuinfo_max_freq");
                if (file2.exists() && file2.canRead()) {
                    try {
                        String strM9080d = AbstractC8459C3.m9080d(file2);
                        if (strM9080d != null) {
                            this.f47529a.add(Integer.valueOf((int) (Long.parseLong(strM9080d.trim()) / 1000)));
                        }
                    } catch (IOException | NumberFormatException unused) {
                    }
                }
            }
        }
        return this.f47529a;
    }
}
