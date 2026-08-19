package p371P1;

import java.util.Locale;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: P1.a */
/* JADX INFO: loaded from: classes.dex */
public final class C6305a {

    /* JADX INFO: renamed from: a */
    public final Locale f20436a;

    public C6305a(Locale locale) {
        this.f20436a = locale;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C6305a)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return AbstractC16544l.m18089b(this.f20436a.toLanguageTag(), ((C6305a) obj).f20436a.toLanguageTag());
    }

    public final int hashCode() {
        return this.f20436a.toLanguageTag().hashCode();
    }

    public final String toString() {
        return this.f20436a.toLanguageTag();
    }
}
