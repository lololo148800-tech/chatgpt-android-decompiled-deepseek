package p675c6;

import com.google.protobuf.AbstractC12107L1;
import p520V5.C7781j;
import p520V5.C7794w;
import p567X5.C9068r;
import p567X5.InterfaceC9053c;
import p660b6.C11249a;
import p698d6.AbstractC13029b;

/* JADX INFO: renamed from: c6.n */
/* JADX INFO: loaded from: classes.dex */
public final class C11679n implements InterfaceC11667b {

    /* JADX INFO: renamed from: a */
    public final String f35390a;

    /* JADX INFO: renamed from: b */
    public final int f35391b;

    /* JADX INFO: renamed from: c */
    public final C11249a f35392c;

    /* JADX INFO: renamed from: d */
    public final boolean f35393d;

    public C11679n(String str, int i10, C11249a c11249a, boolean z6) {
        this.f35390a = str;
        this.f35391b = i10;
        this.f35392c = c11249a;
        this.f35393d = z6;
    }

    @Override // p675c6.InterfaceC11667b
    /* JADX INFO: renamed from: a */
    public final InterfaceC9053c mo12679a(C7794w c7794w, C7781j c7781j, AbstractC13029b abstractC13029b) {
        return new C9068r(c7794w, abstractC13029b, this);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ShapePath{name=");
        sb2.append(this.f35390a);
        sb2.append(", index=");
        return AbstractC12107L1.m13826q(sb2, this.f35391b, '}');
    }
}
