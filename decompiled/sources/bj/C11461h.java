package bj;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: bj.h */
/* JADX INFO: loaded from: classes3.dex */
public final class C11461h extends AbstractC11452Q {

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ int f34663k = 0;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ Class f34664l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ AccessibleObject f34665m;

    public C11461h(Constructor constructor, Class cls) {
        this.f34665m = constructor;
        this.f34664l = cls;
    }

    @Override // bj.AbstractC11452Q
    /* JADX INFO: renamed from: e */
    public final Object mo12858e() {
        AccessibleObject accessibleObject = this.f34665m;
        switch (this.f34663k) {
            case 0:
                return ((Constructor) accessibleObject).newInstance(null);
            default:
                return ((Method) accessibleObject).invoke(null, this.f34664l, Object.class);
        }
    }

    public final String toString() {
        switch (this.f34663k) {
            case 0:
                break;
        }
        return this.f34664l.getName();
    }

    public C11461h(Method method, Class cls) {
        this.f34665m = method;
        this.f34664l = cls;
    }
}
