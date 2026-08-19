package sg;

import ao.AbstractC11153a0;
import ao.C11158d;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import p003A1.AbstractC0168G;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: sg.w */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C19581w {
    public static final C19580v Companion = new C19580v();

    /* JADX INFO: renamed from: d */
    public static final KSerializer[] f62178d = {null, null, new C11158d(C19576r.f62165a, 0)};

    /* JADX INFO: renamed from: a */
    public final String f62179a;

    /* JADX INFO: renamed from: b */
    public final String f62180b;

    /* JADX INFO: renamed from: c */
    public final List f62181c;

    public /* synthetic */ C19581w(int i10, String str, String str2, List list) {
        if (7 != (i10 & 7)) {
            AbstractC11153a0.m12389l(i10, 7, C19579u.f62177a.getDescriptor());
            throw null;
        }
        this.f62179a = str;
        this.f62180b = str2;
        this.f62181c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19581w)) {
            return false;
        }
        C19581w c19581w = (C19581w) obj;
        return AbstractC16544l.m18089b(this.f62179a, c19581w.f62179a) && AbstractC16544l.m18089b(this.f62180b, c19581w.f62180b) && AbstractC16544l.m18089b(this.f62181c, c19581w.f62181c);
    }

    public final int hashCode() {
        return this.f62181c.hashCode() + AbstractC0168G.m527p(this.f62179a.hashCode() * 31, 31, this.f62180b);
    }

    public final String toString() {
        return "█";
    }

    public C19581w(String header, String headerExplanation, List list) {
        AbstractC16544l.m18094g(header, "header");
        AbstractC16544l.m18094g(headerExplanation, "headerExplanation");
        this.f62179a = header;
        this.f62180b = headerExplanation;
        this.f62181c = list;
    }
}
