package p605Ym;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope;
import kotlin.reflect.jvm.internal.impl.name.Name;
import p049Bm.InterfaceC1436k;

/* JADX INFO: renamed from: Ym.g */
/* JADX INFO: loaded from: classes2.dex */
public final class C10093g implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f29883Y;

    /* JADX INFO: renamed from: Z */
    public final LazyJavaClassMemberScope f29884Z;

    public /* synthetic */ C10093g(LazyJavaClassMemberScope lazyJavaClassMemberScope, int i10) {
        this.f29883Y = i10;
        this.f29884Z = lazyJavaClassMemberScope;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        LazyJavaClassMemberScope lazyJavaClassMemberScope = this.f29884Z;
        Name it = (Name) obj;
        switch (this.f29883Y) {
            case 0:
                int i10 = LazyJavaClassMemberScope.f51909u;
                AbstractC16544l.m18094g(it, "it");
                return lazyJavaClassMemberScope.m18195B(it);
            default:
                int i11 = LazyJavaClassMemberScope.f51909u;
                AbstractC16544l.m18094g(it, "it");
                return lazyJavaClassMemberScope.m18196C(it);
        }
    }
}
