package com.google.android.gms.internal.play_billing;

import java.io.Serializable;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.v */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC12015v implements Comparable, Serializable {
    /* JADX INFO: renamed from: a */
    public abstract int mo13527a(AbstractC12015v abstractC12015v);

    /* JADX INFO: renamed from: b */
    public abstract void mo13528b(StringBuilder sb2);

    /* JADX INFO: renamed from: c */
    public abstract void mo13529c(StringBuilder sb2);

    public final boolean equals(Object obj) {
        if (obj instanceof AbstractC12015v) {
            try {
                if (mo13527a((AbstractC12015v) obj) == 0) {
                    return true;
                }
            } catch (ClassCastException unused) {
            }
        }
        return false;
    }

    public abstract int hashCode();
}
