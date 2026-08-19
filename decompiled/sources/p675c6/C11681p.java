package p675c6;

import p520V5.C7781j;
import p520V5.C7794w;
import p567X5.C9070t;
import p567X5.InterfaceC9053c;
import p660b6.C11250b;
import p698d6.AbstractC13029b;

/* JADX INFO: renamed from: c6.p */
/* JADX INFO: loaded from: classes.dex */
public final class C11681p implements InterfaceC11667b {

    /* JADX INFO: renamed from: a */
    public final int f35404a;

    /* JADX INFO: renamed from: b */
    public final C11250b f35405b;

    /* JADX INFO: renamed from: c */
    public final C11250b f35406c;

    /* JADX INFO: renamed from: d */
    public final C11250b f35407d;

    /* JADX INFO: renamed from: e */
    public final boolean f35408e;

    public C11681p(String str, int i10, C11250b c11250b, C11250b c11250b2, C11250b c11250b3, boolean z6) {
        this.f35404a = i10;
        this.f35405b = c11250b;
        this.f35406c = c11250b2;
        this.f35407d = c11250b3;
        this.f35408e = z6;
    }

    @Override // p675c6.InterfaceC11667b
    /* JADX INFO: renamed from: a */
    public final InterfaceC9053c mo12679a(C7794w c7794w, C7781j c7781j, AbstractC13029b abstractC13029b) {
        return new C9070t(abstractC13029b, this);
    }

    public final String toString() {
        return "Trim Path: {start: " + this.f35405b + ", end: " + this.f35406c + ", offset: " + this.f35407d + "}";
    }
}
