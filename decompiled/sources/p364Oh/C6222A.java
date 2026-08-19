package p364Oh;

import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: Oh.A */
/* JADX INFO: loaded from: classes3.dex */
public final class C6222A extends AbstractC6249w {

    /* JADX INFO: renamed from: b */
    public final int f20254b;

    /* JADX INFO: renamed from: c */
    public final String f20255c;

    /* JADX INFO: renamed from: d */
    public final String f20256d;

    /* JADX INFO: renamed from: e */
    public final boolean f20257e;

    public /* synthetic */ C6222A(Throwable th2, int i10, String str, String str2, int i11) {
        this(th2, i10, (i11 & 4) != 0 ? null : str, (i11 & 8) != 0 ? null : str2, false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6222A(Throwable cause, int i10, String str, String str2, boolean z6) {
        super(cause);
        AbstractC16544l.m18094g(cause, "cause");
        this.f20254b = i10;
        this.f20255c = str;
        this.f20256d = str2;
        this.f20257e = z6;
    }
}
