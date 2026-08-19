package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.k */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC11971k {
    /* JADX INFO: renamed from: a */
    public abstract AbstractC11872G mo13261a();

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC11971k) {
            return mo13261a().equals(((AbstractC11971k) obj).mo13261a());
        }
        return false;
    }

    public final int hashCode() {
        return mo13261a().hashCode();
    }

    public final String toString() {
        return mo13261a().toString();
    }
}
