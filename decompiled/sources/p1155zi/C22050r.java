package p1155zi;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import kotlin.jvm.internal.AbstractC16544l;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: zi.r */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C22050r {
    public static final C22046q Companion = new C22046q();

    /* JADX INFO: renamed from: a */
    public final String f69739a;

    public /* synthetic */ C22050r(String str) {
        this.f69739a = str;
    }

    /* JADX INFO: renamed from: a */
    public static String m22347a(String str) {
        return AbstractC10763a.m11054l("AccountId(value=", str, Separators.RPAREN);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C22050r) {
            return AbstractC16544l.m18089b(this.f69739a, ((C22050r) obj).f69739a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f69739a.hashCode();
    }

    public final String toString() {
        return m22347a(this.f69739a);
    }
}
