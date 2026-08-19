package p316Mf;

import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p1150zd.EnumC21867c;
import p479Td.C7351f0;

/* JADX INFO: renamed from: Mf.k */
/* JADX INFO: loaded from: classes3.dex */
public final class C5344k implements InterfaceC5346m {

    /* JADX INFO: renamed from: a */
    public final C7351f0 f17563a;

    /* JADX INFO: renamed from: b */
    public final EnumC21867c f17564b;

    /* JADX INFO: renamed from: c */
    public final String f17565c;

    /* JADX INFO: renamed from: d */
    public final List f17566d;

    public C5344k(C7351f0 message, EnumC21867c enumC21867c, String str, List tags) {
        AbstractC16544l.m18094g(message, "message");
        AbstractC16544l.m18094g(tags, "tags");
        this.f17563a = message;
        this.f17564b = enumC21867c;
        this.f17565c = str;
        this.f17566d = tags;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5344k)) {
            return false;
        }
        C5344k c5344k = (C5344k) obj;
        return AbstractC16544l.m18089b(this.f17563a, c5344k.f17563a) && this.f17564b == c5344k.f17564b && AbstractC16544l.m18089b(this.f17565c, c5344k.f17565c) && AbstractC16544l.m18089b(this.f17566d, c5344k.f17566d);
    }

    public final int hashCode() {
        int iHashCode = (this.f17564b.hashCode() + (this.f17563a.hashCode() * 31)) * 31;
        String str = this.f17565c;
        return this.f17566d.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return "█";
    }
}
