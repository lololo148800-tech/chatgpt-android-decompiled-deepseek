package p990rg;

import ao.AbstractC11153a0;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import p003A1.AbstractC0168G;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: rg.i */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C18982i {
    public static final C18981h Companion = new C18981h();

    /* JADX INFO: renamed from: g */
    public static final KSerializer[] f60541g = {null, null, null, null, EnumC18976c.Companion.serializer(), null};

    /* JADX INFO: renamed from: a */
    public final String f60542a;

    /* JADX INFO: renamed from: b */
    public final String f60543b;

    /* JADX INFO: renamed from: c */
    public final String f60544c;

    /* JADX INFO: renamed from: d */
    public final String f60545d;

    /* JADX INFO: renamed from: e */
    public final EnumC18976c f60546e;

    /* JADX INFO: renamed from: f */
    public final String f60547f;

    public /* synthetic */ C18982i(int i10, String str, String str2, String str3, String str4, EnumC18976c enumC18976c, String str5) {
        if (63 != (i10 & 63)) {
            AbstractC11153a0.m12389l(i10, 63, C18980g.f60540a.getDescriptor());
            throw null;
        }
        this.f60542a = str;
        this.f60543b = str2;
        this.f60544c = str3;
        this.f60545d = str4;
        this.f60546e = enumC18976c;
        this.f60547f = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18982i)) {
            return false;
        }
        C18982i c18982i = (C18982i) obj;
        return AbstractC16544l.m18089b(this.f60542a, c18982i.f60542a) && AbstractC16544l.m18089b(this.f60543b, c18982i.f60543b) && AbstractC16544l.m18089b(this.f60544c, c18982i.f60544c) && AbstractC16544l.m18089b(this.f60545d, c18982i.f60545d) && this.f60546e == c18982i.f60546e && AbstractC16544l.m18089b(this.f60547f, c18982i.f60547f);
    }

    public final int hashCode() {
        return this.f60547f.hashCode() + ((this.f60546e.hashCode() + AbstractC0168G.m527p(AbstractC0168G.m527p(AbstractC0168G.m527p(this.f60542a.hashCode() * 31, 31, this.f60543b), 31, this.f60544c), 31, this.f60545d)) * 31);
    }

    public final String toString() {
        return "█";
    }

    public C18982i(String title, String description, String oneliner, String prompt, EnumC18976c category, String theme) {
        AbstractC16544l.m18094g(title, "title");
        AbstractC16544l.m18094g(description, "description");
        AbstractC16544l.m18094g(oneliner, "oneliner");
        AbstractC16544l.m18094g(prompt, "prompt");
        AbstractC16544l.m18094g(category, "category");
        AbstractC16544l.m18094g(theme, "theme");
        this.f60542a = title;
        this.f60543b = description;
        this.f60544c = oneliner;
        this.f60545d = prompt;
        this.f60546e = category;
        this.f60547f = theme;
    }
}
