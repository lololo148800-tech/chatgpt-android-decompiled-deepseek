package ye;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.AbstractC16544l;
import p559Wn.InterfaceC8975g;
import p571X9.AbstractC9306j0;

/* JADX INFO: renamed from: ye.c */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C21514c {
    public static final C21513b Companion = new C21513b();

    /* JADX INFO: renamed from: a */
    public final String f68131a;

    public /* synthetic */ C21514c(String str) {
        this.f68131a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C21514c) {
            return AbstractC16544l.m18089b(this.f68131a, ((C21514c) obj).f68131a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f68131a.hashCode();
    }

    public final String toString() {
        return AbstractC9306j0.m9891j(this.f68131a, Separators.RPAREN, new StringBuilder("CanmoreId(value="));
    }
}
