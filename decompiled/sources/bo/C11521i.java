package bo;

import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: bo.i */
/* JADX INFO: loaded from: classes2.dex */
public final class C11521i {

    /* JADX INFO: renamed from: a */
    public final boolean f34869a;

    /* JADX INFO: renamed from: b */
    public final boolean f34870b;

    /* JADX INFO: renamed from: c */
    public final boolean f34871c;

    /* JADX INFO: renamed from: d */
    public final boolean f34872d;

    /* JADX INFO: renamed from: e */
    public final boolean f34873e;

    /* JADX INFO: renamed from: f */
    public final boolean f34874f;

    /* JADX INFO: renamed from: g */
    public final String f34875g;

    /* JADX INFO: renamed from: h */
    public final boolean f34876h;

    /* JADX INFO: renamed from: i */
    public final boolean f34877i;

    /* JADX INFO: renamed from: j */
    public final String f34878j;

    /* JADX INFO: renamed from: k */
    public final boolean f34879k;

    /* JADX INFO: renamed from: l */
    public final boolean f34880l;

    /* JADX INFO: renamed from: m */
    public final C11531s f34881m;

    /* JADX INFO: renamed from: n */
    public final boolean f34882n;

    /* JADX INFO: renamed from: o */
    public final boolean f34883o;

    /* JADX INFO: renamed from: p */
    public final boolean f34884p;

    /* JADX INFO: renamed from: q */
    public final EnumC11513a f34885q;

    public C11521i(boolean z6, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, String prettyPrintIndent, boolean z15, boolean z16, String classDiscriminator, boolean z17, boolean z18, C11531s c11531s, boolean z19, boolean z20, boolean z21, EnumC11513a classDiscriminatorMode) {
        AbstractC16544l.m18094g(prettyPrintIndent, "prettyPrintIndent");
        AbstractC16544l.m18094g(classDiscriminator, "classDiscriminator");
        AbstractC16544l.m18094g(classDiscriminatorMode, "classDiscriminatorMode");
        this.f34869a = z6;
        this.f34870b = z10;
        this.f34871c = z11;
        this.f34872d = z12;
        this.f34873e = z13;
        this.f34874f = z14;
        this.f34875g = prettyPrintIndent;
        this.f34876h = z15;
        this.f34877i = z16;
        this.f34878j = classDiscriminator;
        this.f34879k = z17;
        this.f34880l = z18;
        this.f34881m = c11531s;
        this.f34882n = z19;
        this.f34883o = z20;
        this.f34884p = z21;
        this.f34885q = classDiscriminatorMode;
    }

    public final String toString() {
        return "JsonConfiguration(encodeDefaults=" + this.f34869a + ", ignoreUnknownKeys=" + this.f34870b + ", isLenient=" + this.f34871c + ", allowStructuredMapKeys=" + this.f34872d + ", prettyPrint=" + this.f34873e + ", explicitNulls=" + this.f34874f + ", prettyPrintIndent='" + this.f34875g + "', coerceInputValues=" + this.f34876h + ", useArrayPolymorphism=" + this.f34877i + ", classDiscriminator='" + this.f34878j + "', allowSpecialFloatingPointValues=" + this.f34879k + ", useAlternativeNames=" + this.f34880l + ", namingStrategy=" + this.f34881m + ", decodeEnumsCaseInsensitive=" + this.f34882n + ", allowTrailingComma=" + this.f34883o + ", allowComments=" + this.f34884p + ", classDiscriminatorMode=" + this.f34885q + ')';
    }
}
