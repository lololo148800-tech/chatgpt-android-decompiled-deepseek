package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.Collection;
import java.util.Set;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.utils.DFS;
import mm.C17296C;
import p049Bm.InterfaceC1436k;

/* JADX INFO: loaded from: classes2.dex */
public final class LazyJavaStaticClassScope$flatMapJavaStaticSupertypesScopes$2 extends DFS.AbstractNodeHandler<ClassDescriptor, C17296C> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ClassDescriptor f51956a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Set f51957b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ InterfaceC1436k f51958c;

    public LazyJavaStaticClassScope$flatMapJavaStaticSupertypesScopes$2(ClassDescriptor classDescriptor, Set set, InterfaceC1436k interfaceC1436k) {
        this.f51956a = classDescriptor;
        this.f51957b = set;
        this.f51958c = interfaceC1436k;
    }

    /* JADX INFO: renamed from: result, reason: collision with other method in class */
    public void m22587result() {
    }

    @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.AbstractNodeHandler, kotlin.reflect.jvm.internal.impl.utils.DFS.NodeHandler
    public boolean beforeChildren(ClassDescriptor current) {
        AbstractC16544l.m18094g(current, "current");
        if (current == this.f51956a) {
            return true;
        }
        MemberScope staticScope = current.getStaticScope();
        AbstractC16544l.m18093f(staticScope, "getStaticScope(...)");
        if (!(staticScope instanceof LazyJavaStaticScope)) {
            return true;
        }
        this.f51957b.addAll((Collection) this.f51958c.invoke(staticScope));
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.NodeHandler
    public /* bridge */ /* synthetic */ Object result() {
        m22587result();
        return C17296C.f55119a;
    }
}
