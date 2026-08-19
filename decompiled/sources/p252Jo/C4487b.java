package p252Jo;

import java.util.ArrayList;
import java.util.List;
import p049Bm.InterfaceC1439n;
import p078Co.InterfaceC1760b;
import p523V9.AbstractC8086f4;
import p544W9.AbstractC8458C2;

/* JADX INFO: renamed from: Jo.b */
/* JADX INFO: loaded from: classes2.dex */
public final class C4487b implements InterfaceC1760b, InterfaceC4488c {

    /* JADX INFO: renamed from: b */
    public static final C4487b f14641b = new C4487b(0);

    /* JADX INFO: renamed from: c */
    public static final C4487b f14642c = new C4487b(1);

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f14643a;

    public /* synthetic */ C4487b(int i10) {
        this.f14643a = i10;
    }

    @Override // p104Do.InterfaceC2220a
    /* JADX INFO: renamed from: a */
    public final Boolean mo3259a(Comparable comparable) {
        switch (this.f14643a) {
            case 0:
                break;
        }
        return AbstractC8086f4.m8531r(comparable);
    }

    @Override // p252Jo.InterfaceC4488c
    /* JADX INFO: renamed from: b */
    public final Object mo5213b(Object obj) {
        switch (this.f14643a) {
            case 0:
                break;
        }
        return AbstractC8458C2.m9075c(obj);
    }

    @Override // p252Jo.InterfaceC4488c
    /* JADX INFO: renamed from: c */
    public final Object mo5214c(Object obj) {
        switch (this.f14643a) {
            case 0:
                break;
        }
        return AbstractC8458C2.m9076d(this, obj);
    }

    @Override // p078Co.InterfaceC1760b
    /* JADX INFO: renamed from: d */
    public final Object mo2570d(Object obj, Object obj2) {
        switch (this.f14643a) {
            case 0:
                return Boolean.valueOf(AbstractC8458C2.m9073a(this, obj, C4486a.f14638Z));
            default:
                return Boolean.valueOf(!AbstractC8458C2.m9073a(this, obj, C4486a.f14639o0));
        }
    }

    @Override // p104Do.InterfaceC2220a
    /* JADX INFO: renamed from: e */
    public final List mo3260e(Comparable comparable, Comparable comparable2) {
        switch (this.f14643a) {
            case 0:
                break;
        }
        return AbstractC8086f4.m8529p(this, comparable, comparable2);
    }

    @Override // p104Do.InterfaceC2220a
    /* JADX INFO: renamed from: f */
    public final boolean mo3261f(List list, InterfaceC1439n interfaceC1439n) {
        switch (this.f14643a) {
            case 0:
                break;
        }
        return AbstractC8086f4.m8524k(this, (ArrayList) list, interfaceC1439n);
    }

    @Override // p104Do.InterfaceC2220a
    /* JADX INFO: renamed from: g */
    public final List mo3262g(Comparable comparable, Comparable comparable2) {
        switch (this.f14643a) {
            case 0:
                break;
        }
        return AbstractC8086f4.m8530q(comparable, comparable2);
    }
}
