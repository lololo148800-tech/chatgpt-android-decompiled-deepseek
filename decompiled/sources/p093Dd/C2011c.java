package p093Dd;

import ao.AbstractC11153a0;
import kotlin.jvm.internal.AbstractC16544l;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: Dd.c */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C2011c {
    public static final C2010b Companion = new C2010b();

    /* JADX INFO: renamed from: a */
    public final String f6169a;

    /* JADX INFO: renamed from: b */
    public final String f6170b;

    /* JADX INFO: renamed from: c */
    public final boolean f6171c;

    public /* synthetic */ C2011c(int i10, String str, String str2, boolean z6) {
        if (5 != (i10 & 5)) {
            AbstractC11153a0.m12389l(i10, 5, C2009a.f6168a.getDescriptor());
            throw null;
        }
        this.f6169a = str;
        if ((i10 & 2) == 0) {
            this.f6170b = null;
        } else {
            this.f6170b = str2;
        }
        this.f6171c = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2011c)) {
            return false;
        }
        C2011c c2011c = (C2011c) obj;
        return AbstractC16544l.m18089b(this.f6169a, c2011c.f6169a) && AbstractC16544l.m18089b(this.f6170b, c2011c.f6170b) && this.f6171c == c2011c.f6171c;
    }

    public final int hashCode() {
        int iHashCode = this.f6169a.hashCode() * 31;
        String str = this.f6170b;
        return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + (this.f6171c ? 1231 : 1237);
    }

    public final String toString() {
        return "█";
    }

    public C2011c(String conversationId, String str, boolean z6) {
        AbstractC16544l.m18094g(conversationId, "conversationId");
        this.f6169a = conversationId;
        this.f6170b = str;
        this.f6171c = z6;
    }
}
