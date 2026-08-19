package p675c6;

import p520V5.C7781j;
import p520V5.C7794w;
import p567X5.C9056f;
import p567X5.InterfaceC9053c;
import p660b6.C11249a;
import p660b6.InterfaceC11253e;
import p698d6.AbstractC13029b;

/* JADX INFO: renamed from: c6.a */
/* JADX INFO: loaded from: classes.dex */
public final class C11666a implements InterfaceC11667b {

    /* JADX INFO: renamed from: a */
    public final String f35326a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC11253e f35327b;

    /* JADX INFO: renamed from: c */
    public final C11249a f35328c;

    /* JADX INFO: renamed from: d */
    public final boolean f35329d;

    /* JADX INFO: renamed from: e */
    public final boolean f35330e;

    public C11666a(String str, InterfaceC11253e interfaceC11253e, C11249a c11249a, boolean z6, boolean z10) {
        this.f35326a = str;
        this.f35327b = interfaceC11253e;
        this.f35328c = c11249a;
        this.f35329d = z6;
        this.f35330e = z10;
    }

    @Override // p675c6.InterfaceC11667b
    /* JADX INFO: renamed from: a */
    public final InterfaceC9053c mo12679a(C7794w c7794w, C7781j c7781j, AbstractC13029b abstractC13029b) {
        return new C9056f(c7794w, abstractC13029b, this);
    }
}
