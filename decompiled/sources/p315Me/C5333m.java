package p315Me;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.AbstractC16544l;
import p559Wn.InterfaceC8975g;
import p571X9.AbstractC9306j0;

/* JADX INFO: renamed from: Me.m */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C5333m {
    public static final C5332l Companion = new C5332l();

    /* JADX INFO: renamed from: a */
    public final String f17545a;

    public /* synthetic */ C5333m(String str) {
        this.f17545a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C5333m) {
            return AbstractC16544l.m18089b(this.f17545a, ((C5333m) obj).f17545a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f17545a.hashCode();
    }

    public final String toString() {
        return AbstractC9306j0.m9891j(this.f17545a, Separators.RPAREN, new StringBuilder("TurnSessionId(value="));
    }
}
