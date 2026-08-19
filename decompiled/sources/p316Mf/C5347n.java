package p316Mf;

import kotlin.jvm.internal.AbstractC16544l;
import p1150zd.EnumC21867c;
import p479Td.C7351f0;

/* JADX INFO: renamed from: Mf.n */
/* JADX INFO: loaded from: classes3.dex */
public final class C5347n extends AbstractC5349p {

    /* JADX INFO: renamed from: a */
    public final C7351f0 f17570a;

    /* JADX INFO: renamed from: b */
    public final EnumC21867c f17571b;

    /* JADX INFO: renamed from: c */
    public final boolean f17572c;

    public C5347n(C7351f0 message, EnumC21867c enumC21867c, boolean z6) {
        AbstractC16544l.m18094g(message, "message");
        this.f17570a = message;
        this.f17571b = enumC21867c;
        this.f17572c = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5347n)) {
            return false;
        }
        C5347n c5347n = (C5347n) obj;
        return AbstractC16544l.m18089b(this.f17570a, c5347n.f17570a) && this.f17571b == c5347n.f17571b && this.f17572c == c5347n.f17572c;
    }

    public final int hashCode() {
        return ((this.f17571b.hashCode() + (this.f17570a.hashCode() * 31)) * 31) + (this.f17572c ? 1231 : 1237);
    }

    public final String toString() {
        return "█";
    }
}
