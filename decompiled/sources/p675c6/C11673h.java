package p675c6;

import p520V5.C7781j;
import p520V5.C7794w;
import p567X5.C9064n;
import p567X5.InterfaceC9053c;
import p660b6.C11250b;
import p660b6.InterfaceC11253e;
import p698d6.AbstractC13029b;

/* JADX INFO: renamed from: c6.h */
/* JADX INFO: loaded from: classes.dex */
public final class C11673h implements InterfaceC11667b {

    /* JADX INFO: renamed from: a */
    public final String f35360a;

    /* JADX INFO: renamed from: b */
    public final int f35361b;

    /* JADX INFO: renamed from: c */
    public final C11250b f35362c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC11253e f35363d;

    /* JADX INFO: renamed from: e */
    public final C11250b f35364e;

    /* JADX INFO: renamed from: f */
    public final C11250b f35365f;

    /* JADX INFO: renamed from: g */
    public final C11250b f35366g;

    /* JADX INFO: renamed from: h */
    public final C11250b f35367h;

    /* JADX INFO: renamed from: i */
    public final C11250b f35368i;

    /* JADX INFO: renamed from: j */
    public final boolean f35369j;

    /* JADX INFO: renamed from: k */
    public final boolean f35370k;

    public C11673h(String str, int i10, C11250b c11250b, InterfaceC11253e interfaceC11253e, C11250b c11250b2, C11250b c11250b3, C11250b c11250b4, C11250b c11250b5, C11250b c11250b6, boolean z6, boolean z10) {
        this.f35360a = str;
        this.f35361b = i10;
        this.f35362c = c11250b;
        this.f35363d = interfaceC11253e;
        this.f35364e = c11250b2;
        this.f35365f = c11250b3;
        this.f35366g = c11250b4;
        this.f35367h = c11250b5;
        this.f35368i = c11250b6;
        this.f35369j = z6;
        this.f35370k = z10;
    }

    @Override // p675c6.InterfaceC11667b
    /* JADX INFO: renamed from: a */
    public final InterfaceC9053c mo12679a(C7794w c7794w, C7781j c7781j, AbstractC13029b abstractC13029b) {
        return new C9064n(c7794w, abstractC13029b, this);
    }
}
