package p919o8;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: o8.t */
/* JADX INFO: loaded from: classes.dex */
public final class C18010t {

    /* JADX INFO: renamed from: a */
    public final C17894F f57498a;

    public C18010t(C17894F c17894f) {
        this.f57498a = c17894f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C18010t) && AbstractC16544l.m18089b(this.f57498a, ((C18010t) obj).f57498a);
    }

    public final int hashCode() {
        C17894F c17894f = this.f57498a;
        if (c17894f == null) {
            return 0;
        }
        return c17894f.hashCode();
    }

    public final String toString() {
        return "Display(viewport=" + this.f57498a + Separators.RPAREN;
    }
}
