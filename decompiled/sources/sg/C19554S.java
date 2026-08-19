package sg;

import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import p003A1.AbstractC0168G;

/* JADX INFO: renamed from: sg.S */
/* JADX INFO: loaded from: classes3.dex */
public final class C19554S implements InterfaceC19558W {

    /* JADX INFO: renamed from: a */
    public final C19575q f62106a;

    /* JADX INFO: renamed from: b */
    public final String f62107b;

    /* JADX INFO: renamed from: c */
    public final String f62108c;

    /* JADX INFO: renamed from: d */
    public final Map f62109d;

    public C19554S(C19575q c19575q, String reasonId, String str, Map collectedAdditionalFields) {
        AbstractC16544l.m18094g(reasonId, "reasonId");
        AbstractC16544l.m18094g(collectedAdditionalFields, "collectedAdditionalFields");
        this.f62106a = c19575q;
        this.f62107b = reasonId;
        this.f62108c = str;
        this.f62109d = collectedAdditionalFields;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19554S)) {
            return false;
        }
        C19554S c19554s = (C19554S) obj;
        return AbstractC16544l.m18089b(this.f62106a, c19554s.f62106a) && AbstractC16544l.m18089b(this.f62107b, c19554s.f62107b) && AbstractC16544l.m18089b(this.f62108c, c19554s.f62108c) && AbstractC16544l.m18089b(this.f62109d, c19554s.f62109d);
    }

    public final int hashCode() {
        int iM527p = AbstractC0168G.m527p(this.f62106a.hashCode() * 31, 31, this.f62107b);
        String str = this.f62108c;
        return this.f62109d.hashCode() + ((iM527p + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return "█";
    }
}
