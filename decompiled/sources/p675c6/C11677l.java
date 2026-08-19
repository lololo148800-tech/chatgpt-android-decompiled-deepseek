package p675c6;

import android.graphics.Path;
import p228J.AbstractC3794B0;
import p520V5.C7781j;
import p520V5.C7794w;
import p567X5.C9057g;
import p567X5.InterfaceC9053c;
import p660b6.C11249a;
import p698d6.AbstractC13029b;

/* JADX INFO: renamed from: c6.l */
/* JADX INFO: loaded from: classes.dex */
public final class C11677l implements InterfaceC11667b {

    /* JADX INFO: renamed from: a */
    public final boolean f35381a;

    /* JADX INFO: renamed from: b */
    public final Path.FillType f35382b;

    /* JADX INFO: renamed from: c */
    public final String f35383c;

    /* JADX INFO: renamed from: d */
    public final C11249a f35384d;

    /* JADX INFO: renamed from: e */
    public final C11249a f35385e;

    /* JADX INFO: renamed from: f */
    public final boolean f35386f;

    public C11677l(String str, boolean z6, Path.FillType fillType, C11249a c11249a, C11249a c11249a2, boolean z10) {
        this.f35383c = str;
        this.f35381a = z6;
        this.f35382b = fillType;
        this.f35384d = c11249a;
        this.f35385e = c11249a2;
        this.f35386f = z10;
    }

    @Override // p675c6.InterfaceC11667b
    /* JADX INFO: renamed from: a */
    public final InterfaceC9053c mo12679a(C7794w c7794w, C7781j c7781j, AbstractC13029b abstractC13029b) {
        return new C9057g(c7794w, abstractC13029b, this);
    }

    public final String toString() {
        return AbstractC3794B0.m4499x(new StringBuilder("ShapeFill{color=, fillEnabled="), this.f35381a, '}');
    }
}
