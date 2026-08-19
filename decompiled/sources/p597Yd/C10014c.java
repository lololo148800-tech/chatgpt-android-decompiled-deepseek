package p597Yd;

import android.gov.nist.core.Separators;
import com.auth0.android.provider.lcl.qffLJgOYizGmMj;
import kotlin.jvm.internal.AbstractC16544l;
import p559Wn.InterfaceC8975g;
import p571X9.AbstractC9306j0;

/* JADX INFO: renamed from: Yd.c */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C10014c {
    public static final C10013b Companion = new C10013b();

    /* JADX INFO: renamed from: a */
    public final String f29698a;

    public /* synthetic */ C10014c(String str) {
        this.f29698a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C10014c) {
            return AbstractC16544l.m18089b(this.f29698a, ((C10014c) obj).f29698a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f29698a.hashCode();
    }

    public final String toString() {
        return AbstractC9306j0.m9891j(this.f29698a, Separators.RPAREN, new StringBuilder(qffLJgOYizGmMj.ARFYL));
    }
}
