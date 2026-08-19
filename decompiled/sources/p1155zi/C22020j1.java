package p1155zi;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.AbstractC16544l;
import p559Wn.InterfaceC8975g;
import p571X9.AbstractC9306j0;

/* JADX INFO: renamed from: zi.j1 */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C22020j1 {
    public static final C22016i1 Companion = new C22016i1();

    /* JADX INFO: renamed from: a */
    public final String f69665a;

    public /* synthetic */ C22020j1(String str) {
        this.f69665a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C22020j1) {
            return AbstractC16544l.m18089b(this.f69665a, ((C22020j1) obj).f69665a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f69665a.hashCode();
    }

    public final String toString() {
        return AbstractC9306j0.m9891j(this.f69665a, Separators.RPAREN, new StringBuilder("ModelSlug(name="));
    }
}
