package p1155zi;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.AbstractC16544l;
import p1113xn.AbstractC21322p;
import p559Wn.InterfaceC8975g;
import p571X9.AbstractC9306j0;

/* JADX INFO: renamed from: zi.E */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C21907E {
    public static final C21903D Companion = new C21903D();

    /* JADX INFO: renamed from: a */
    public final String f69451a;

    public /* synthetic */ C21907E(String str) {
        this.f69451a = str;
    }

    /* JADX INFO: renamed from: a */
    public static final String m22337a(String str) {
        return AbstractC21322p.m21688V(AbstractC21322p.m21688V(str, "file-service://"), "sediment://");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C21907E) {
            return AbstractC16544l.m18089b(this.f69451a, ((C21907E) obj).f69451a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f69451a.hashCode();
    }

    public final String toString() {
        return AbstractC9306j0.m9891j(this.f69451a, Separators.RPAREN, new StringBuilder("AssetPointer(value="));
    }
}
