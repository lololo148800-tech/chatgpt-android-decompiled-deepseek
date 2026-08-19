package ml;

import java.nio.charset.Charset;
import kotlin.jvm.internal.AbstractC16544l;
import p1113xn.AbstractC21322p;
import p1113xn.C21307a;
import p544W9.AbstractC8627e4;
import p544W9.AbstractC8700r;
import p857kl.C16440G;
import p857kl.C16460h;

/* JADX INFO: renamed from: ml.k */
/* JADX INFO: loaded from: classes3.dex */
public final class C17293k extends AbstractC17285c {

    /* JADX INFO: renamed from: a */
    public final String f55113a;

    /* JADX INFO: renamed from: b */
    public final C16460h f55114b;

    /* JADX INFO: renamed from: c */
    public final C16440G f55115c;

    /* JADX INFO: renamed from: d */
    public final byte[] f55116d;

    public C17293k(String text, C16460h contentType) {
        AbstractC16544l.m18094g(text, "text");
        AbstractC16544l.m18094g(contentType, "contentType");
        this.f55113a = text;
        this.f55114b = contentType;
        this.f55115c = null;
        Charset charsetM9277a = AbstractC8627e4.m9277a(contentType);
        this.f55116d = AbstractC8700r.m9408d(text, charsetM9277a == null ? C21307a.f67720a : charsetM9277a);
    }

    @Override // ml.AbstractC17288f
    /* JADX INFO: renamed from: a */
    public final Long mo7529a() {
        return Long.valueOf(this.f55116d.length);
    }

    @Override // ml.AbstractC17288f
    /* JADX INFO: renamed from: b */
    public final C16460h mo7530b() {
        return this.f55114b;
    }

    @Override // ml.AbstractC17288f
    /* JADX INFO: renamed from: d */
    public final C16440G mo7532d() {
        return this.f55115c;
    }

    @Override // ml.AbstractC17285c
    /* JADX INFO: renamed from: e */
    public final byte[] mo9568e() {
        return this.f55116d;
    }

    public final String toString() {
        return "TextContent[" + this.f55114b + "] \"" + AbstractC21322p.m21709q0(30, this.f55113a) + '\"';
    }
}
