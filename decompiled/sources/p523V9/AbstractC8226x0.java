package p523V9;

import android.gov.nist.core.Separators;
import androidx.lifecycle.C11107p;
import androidx.lifecycle.InterfaceC11112u;
import kotlin.jvm.internal.AbstractC16544l;
import p1155zi.AbstractC21933K1;
import p1155zi.C21937L1;
import p1155zi.C21949O1;

/* JADX INFO: renamed from: V9.x0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8226x0 {
    /* JADX INFO: renamed from: a */
    public static final boolean m8860a(int i10, int i11) {
        return i10 == i11;
    }

    /* JADX INFO: renamed from: b */
    public static final C11107p m8861b(InterfaceC11112u interfaceC11112u) {
        AbstractC16544l.m18094g(interfaceC11112u, "<this>");
        return AbstractC8218w0.m8848c(interfaceC11112u.mo7809i());
    }

    /* JADX INFO: renamed from: c */
    public static final String m8862c(AbstractC21933K1 abstractC21933K1) {
        AbstractC16544l.m18094g(abstractC21933K1, "<this>");
        if (!(abstractC21933K1 instanceof C21949O1)) {
            return abstractC21933K1 instanceof C21937L1 ? "network" : "other";
        }
        C21949O1 c21949o1 = (C21949O1) abstractC21933K1;
        String str = c21949o1.f69507c;
        if (str == null) {
            str = "";
        }
        return "service " + c21949o1.f69506b + Separators.f31991SP + str;
    }
}
