package p946pc;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.AbstractC16544l;
import p049Bm.InterfaceC1440o;
import p911o0.InterfaceC17763i0;

/* JADX INFO: renamed from: pc.u */
/* JADX INFO: loaded from: classes3.dex */
public final class C18355u {

    /* JADX INFO: renamed from: d */
    public static final C18355u f58606d = new C18355u(null, null, null);

    /* JADX INFO: renamed from: a */
    public final InterfaceC17763i0 f58607a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC1440o f58608b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC1440o f58609c;

    public C18355u(InterfaceC17763i0 interfaceC17763i0, InterfaceC1440o interfaceC1440o, InterfaceC1440o interfaceC1440o2) {
        this.f58607a = interfaceC17763i0;
        this.f58608b = interfaceC1440o;
        this.f58609c = interfaceC1440o2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18355u)) {
            return false;
        }
        C18355u c18355u = (C18355u) obj;
        return AbstractC16544l.m18089b(this.f58607a, c18355u.f58607a) && AbstractC16544l.m18089b(this.f58608b, c18355u.f58608b) && AbstractC16544l.m18089b(this.f58609c, c18355u.f58609c);
    }

    public final int hashCode() {
        InterfaceC17763i0 interfaceC17763i0 = this.f58607a;
        int iHashCode = (interfaceC17763i0 == null ? 0 : interfaceC17763i0.hashCode()) * 31;
        InterfaceC1440o interfaceC1440o = this.f58608b;
        int iHashCode2 = (iHashCode + (interfaceC1440o == null ? 0 : interfaceC1440o.hashCode())) * 31;
        InterfaceC1440o interfaceC1440o2 = this.f58609c;
        return iHashCode2 + (interfaceC1440o2 != null ? interfaceC1440o2.hashCode() : 0);
    }

    public final String toString() {
        return "InfoPanelStyle(contentPadding=" + this.f58607a + ", background=" + this.f58608b + ", textStyle=" + this.f58609c + Separators.RPAREN;
    }
}
