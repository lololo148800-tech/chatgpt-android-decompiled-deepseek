package p990rg;

import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p003A1.AbstractC0168G;
import p909nm.AbstractC17681o;

/* JADX INFO: renamed from: rg.l */
/* JADX INFO: loaded from: classes3.dex */
public final class C18985l {

    /* JADX INFO: renamed from: d */
    public static final List f60553d = AbstractC17681o.m19382k(new C18985l("Create a horror story", "Create a 500-word horror story.", AbstractC17681o.m19382k(new C18984k("Create a ", true), new C18984k("horror", false), new C18984k(" story", true))), new C18985l("In French, create a 5-minute speech about the story of learning languages.", "What are the benefits of learning languages?", AbstractC17681o.m19382k(new C18984k("In French, ", false), new C18984k("create a ", true), new C18984k("5-minute speech about the ", false), new C18984k("story ", true), new C18984k("of learning languages.", true))));

    /* JADX INFO: renamed from: a */
    public final String f60554a;

    /* JADX INFO: renamed from: b */
    public final String f60555b;

    /* JADX INFO: renamed from: c */
    public final List f60556c;

    public C18985l(String oneliner, String fullPrompt, List list) {
        AbstractC16544l.m18094g(oneliner, "oneliner");
        AbstractC16544l.m18094g(fullPrompt, "fullPrompt");
        this.f60554a = oneliner;
        this.f60555b = fullPrompt;
        this.f60556c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18985l)) {
            return false;
        }
        C18985l c18985l = (C18985l) obj;
        return AbstractC16544l.m18089b(this.f60554a, c18985l.f60554a) && AbstractC16544l.m18089b(this.f60555b, c18985l.f60555b) && AbstractC16544l.m18089b(this.f60556c, c18985l.f60556c);
    }

    public final int hashCode() {
        return this.f60556c.hashCode() + AbstractC0168G.m527p(this.f60554a.hashCode() * 31, 31, this.f60555b);
    }

    public final String toString() {
        return "█";
    }
}
