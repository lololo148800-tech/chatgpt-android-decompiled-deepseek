package p193Hf;

import com.openai.feature.serverstatus.impl.sunset.p684ZP.VjclRfeKsMflo;
import kotlin.jvm.internal.AbstractC16544l;
import p003A1.AbstractC0168G;
import p479Td.C7370u;

/* JADX INFO: renamed from: Hf.i1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3372i1 implements InterfaceC3378k1 {

    /* JADX INFO: renamed from: a */
    public final String f10298a;

    /* JADX INFO: renamed from: b */
    public final C7370u f10299b;

    /* JADX INFO: renamed from: c */
    public final boolean f10300c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3372i1)) {
            return false;
        }
        C3372i1 c3372i1 = (C3372i1) obj;
        return AbstractC16544l.m18089b(this.f10298a, c3372i1.f10298a) && AbstractC16544l.m18089b(this.f10299b, c3372i1.f10299b) && this.f10300c == c3372i1.f10300c;
    }

    public final int hashCode() {
        return AbstractC0168G.m527p(this.f10298a.hashCode() * 31, 31, this.f10299b.f23370c) + (this.f10300c ? 1231 : 1237);
    }

    public final String toString() {
        return "█";
    }

    public C3372i1(String str, C7370u c7370u, boolean z6) {
        AbstractC16544l.m18094g(c7370u, VjclRfeKsMflo.KnZOGRPk);
        this.f10298a = str;
        this.f10299b = c7370u;
        this.f10300c = z6;
    }
}
