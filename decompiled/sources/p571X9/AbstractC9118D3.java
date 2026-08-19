package p571X9;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import kotlin.jvm.internal.AbstractC16544l;
import p060C6.C1607d;
import p1006s6.InterfaceC19455e;
import p559Wn.C8976h;

/* JADX INFO: renamed from: X9.D3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9118D3 {
    /* JADX INFO: renamed from: a */
    public static final void m9646a(InterfaceC19455e jsonReader, String str) {
        AbstractC16544l.m18094g(jsonReader, "jsonReader");
        StringBuilder sbM11058p = AbstractC10763a.m11058p("Field '", str, "' is missing or null at path ");
        sbM11058p.append(jsonReader.mo20578n());
        String message = sbM11058p.toString();
        AbstractC16544l.m18094g(message, "message");
        throw new C1607d(message, null);
    }

    /* JADX INFO: renamed from: b */
    public static final void m9647b(int i10) {
        throw new C8976h(AbstractC10763a.m11048f(i10, "An unknown field for index "));
    }
}
