package p839jk;

import android.gov.nist.javax.sdp.fields.SDPKeywords;
import kotlin.jvm.internal.AbstractC16544l;
import p025An.C0644w;
import p544W9.AbstractC8548R3;

/* JADX INFO: renamed from: jk.t */
/* JADX INFO: loaded from: classes3.dex */
public final class C16263t extends AbstractC8548R3 {

    /* JADX INFO: renamed from: a */
    public final String f50390a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC16249f f50391b;

    public C16263t(String stepName, InterfaceC16249f interfaceC16249f) {
        AbstractC16544l.m18094g(stepName, "stepName");
        this.f50390a = stepName;
        this.f50391b = interfaceC16249f;
    }

    @Override // p544W9.AbstractC8548R3
    /* JADX INFO: renamed from: b */
    public final String mo9209b() {
        return this.f50390a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16263t)) {
            return false;
        }
        C16263t c16263t = (C16263t) obj;
        return AbstractC16544l.m18089b(this.f50390a, c16263t.f50390a) && AbstractC16544l.m18089b(this.f50391b, c16263t.f50391b);
    }

    public final int hashCode() {
        return this.f50391b.hashCode() + (this.f50390a.hashCode() * 31);
    }

    public final String toString() {
        String str;
        C16245b c16245b = C16245b.f50369a;
        InterfaceC16249f interfaceC16249f = this.f50391b;
        if (AbstractC16544l.m18089b(interfaceC16249f, c16245b)) {
            str = "pending";
        } else if (AbstractC16544l.m18089b(interfaceC16249f, C16246c.f50370a)) {
            str = SDPKeywords.PROMPT;
        } else if (AbstractC16544l.m18089b(interfaceC16249f, C16247d.f50371a)) {
            str = "review";
        } else {
            if (!AbstractC16544l.m18089b(interfaceC16249f, C16248e.f50372a)) {
                throw new C0644w();
            }
            str = "capture";
        }
        return "/inquiry/documents/".concat(str);
    }
}
