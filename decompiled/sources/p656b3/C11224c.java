package p656b3;

import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: b3.c */
/* JADX INFO: loaded from: classes.dex */
public final class C11224c {

    /* JADX INFO: renamed from: a */
    public final String f33981a;

    public C11224c(String str) {
        this.f33981a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C11224c) {
            if (AbstractC16544l.m18089b(this.f33981a, ((C11224c) obj).f33981a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f33981a.hashCode();
    }

    public final String toString() {
        return this.f33981a;
    }
}
