package sg;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.AbstractC16544l;
import p559Wn.InterfaceC8975g;
import p571X9.AbstractC9306j0;

/* JADX INFO: renamed from: sg.i */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C19567i {
    public static final C19566h Companion = new C19566h();

    /* JADX INFO: renamed from: a */
    public final String f62148a;

    public /* synthetic */ C19567i(String str) {
        this.f62148a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C19567i) {
            return AbstractC16544l.m18089b(this.f62148a, ((C19567i) obj).f62148a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f62148a.hashCode();
    }

    public final String toString() {
        return AbstractC9306j0.m9891j(this.f62148a, Separators.RPAREN, new StringBuilder("Id(value="));
    }
}
