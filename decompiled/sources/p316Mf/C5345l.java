package p316Mf;

import kotlin.jvm.internal.AbstractC16544l;
import p1150zd.EnumC21867c;
import p1150zd.EnumC21876l;
import p479Td.C7351f0;

/* JADX INFO: renamed from: Mf.l */
/* JADX INFO: loaded from: classes3.dex */
public final class C5345l implements InterfaceC5346m {

    /* JADX INFO: renamed from: a */
    public final C7351f0 f17567a;

    /* JADX INFO: renamed from: b */
    public final EnumC21867c f17568b;

    /* JADX INFO: renamed from: c */
    public final EnumC21876l f17569c;

    public C5345l(C7351f0 message, EnumC21867c enumC21867c, EnumC21876l enumC21876l) {
        AbstractC16544l.m18094g(message, "message");
        this.f17567a = message;
        this.f17568b = enumC21867c;
        this.f17569c = enumC21876l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5345l)) {
            return false;
        }
        C5345l c5345l = (C5345l) obj;
        return AbstractC16544l.m18089b(this.f17567a, c5345l.f17567a) && this.f17568b == c5345l.f17568b && this.f17569c == c5345l.f17569c;
    }

    public final int hashCode() {
        return this.f17569c.hashCode() + ((this.f17568b.hashCode() + (this.f17567a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "█";
    }
}
