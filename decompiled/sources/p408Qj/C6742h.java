package p408Qj;

import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p769gj.InterfaceC14167i;
import p838jj.InterfaceC16230k;

/* JADX INFO: renamed from: Qj.h */
/* JADX INFO: loaded from: classes3.dex */
public final class C6742h implements InterfaceC16230k, InterfaceC14167i {

    /* JADX INFO: renamed from: a */
    public final Object f21644a;

    /* JADX INFO: renamed from: b */
    public final List f21645b;

    /* JADX INFO: renamed from: c */
    public final String f21646c;

    /* JADX INFO: renamed from: d */
    public final Object f21647d;

    public C6742h(Object baseScreen, String str, List list) {
        AbstractC16544l.m18094g(baseScreen, "baseScreen");
        this.f21644a = baseScreen;
        this.f21645b = list;
        this.f21646c = str;
        this.f21647d = baseScreen;
    }

    @Override // p838jj.InterfaceC16230k
    /* JADX INFO: renamed from: a */
    public final Object mo7185a() {
        return this.f21647d;
    }

    @Override // p769gj.InterfaceC14167i
    /* JADX INFO: renamed from: b */
    public final String mo6751b() {
        return this.f21646c;
    }

    @Override // p838jj.InterfaceC16230k
    /* JADX INFO: renamed from: c */
    public final List mo7186c() {
        return this.f21645b;
    }
}
