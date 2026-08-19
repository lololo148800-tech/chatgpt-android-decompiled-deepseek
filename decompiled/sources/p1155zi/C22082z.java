package p1155zi;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.AbstractC16544l;
import p559Wn.InterfaceC8975g;
import p571X9.AbstractC9306j0;

/* JADX INFO: renamed from: zi.z */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C22082z {
    public static final C22078y Companion = new C22078y();

    /* JADX INFO: renamed from: a */
    public final String f69810a;

    public /* synthetic */ C22082z(String str) {
        this.f69810a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C22082z) {
            return AbstractC16544l.m18089b(this.f69810a, ((C22082z) obj).f69810a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f69810a.hashCode();
    }

    public final String toString() {
        return AbstractC9306j0.m9891j(this.f69810a, Separators.RPAREN, new StringBuilder("Id(value="));
    }
}
