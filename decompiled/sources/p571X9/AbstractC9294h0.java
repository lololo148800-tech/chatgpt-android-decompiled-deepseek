package p571X9;

import android.gov.nist.javax.sip.header.SIPHeaderNames;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import mo.AbstractC17325B;
import mo.C17348o;
import mo.C17352s;
import mo.C17353t;
import mo.C17354u;
import p001A.AbstractC0010F;
import p003A1.AbstractC0168G;
import p228J.C3847l0;

/* JADX INFO: renamed from: X9.h0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9294h0 {
    /* JADX INFO: renamed from: a */
    public static final void m9872a(int i10, List list) {
        int size = list.size();
        if (i10 < 0 || i10 >= size) {
            throw new IndexOutOfBoundsException(AbstractC0168G.m532u("Index ", i10, " is out of bounds. The list has ", size, " elements."));
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m9873b(List list, int i10, int i11) {
        int size = list.size();
        if (i10 > i11) {
            throw new IllegalArgumentException(AbstractC0168G.m532u("Indices are out of order. fromIndex (", i10, ") is greater than toIndex (", i11, ")."));
        }
        if (i10 < 0) {
            throw new IndexOutOfBoundsException(AbstractC0010F.m19c(i10, "fromIndex (", ") is less than 0."));
        }
        if (i11 <= size) {
            return;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i11 + ") is more than than the list size (" + size + ')');
    }

    /* JADX INFO: renamed from: c */
    public static C17353t m9874c(String name, String value) {
        AbstractC16544l.m18094g(name, "name");
        AbstractC16544l.m18094g(value, "value");
        return m9875d(name, null, AbstractC9123E2.m9653a(value, null));
    }

    /* JADX INFO: renamed from: d */
    public static C17353t m9875d(String name, String str, AbstractC17325B abstractC17325B) {
        AbstractC16544l.m18094g(name, "name");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("form-data; name=");
        C17352s c17352s = C17354u.f55304e;
        AbstractC9288g0.m9864a(name, sb2);
        if (str != null) {
            sb2.append("; filename=");
            AbstractC9288g0.m9864a(str, sb2);
        }
        String string = sb2.toString();
        AbstractC16544l.m18093f(string, "StringBuilder().apply(builderAction).toString()");
        C3847l0 c3847l0 = new C3847l0(3);
        c3847l0.m4576c(SIPHeaderNames.CONTENT_DISPOSITION, string);
        C17348o c17348oM4577d = c3847l0.m4577d();
        if (c17348oM4577d.m19012f(SIPHeaderNames.CONTENT_TYPE) != null) {
            throw new IllegalArgumentException("Unexpected header: Content-Type");
        }
        if (c17348oM4577d.m19012f(SIPHeaderNames.CONTENT_LENGTH) == null) {
            return new C17353t(c17348oM4577d, abstractC17325B);
        }
        throw new IllegalArgumentException("Unexpected header: Content-Length");
    }
}
