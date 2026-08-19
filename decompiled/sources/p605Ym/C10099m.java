package p605Ym;

import java.util.Collection;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaStaticClassScope;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.utils.DFS;
import p1091wn.AbstractC21031l;
import p606Yn.C10107h;
import p909nm.AbstractC17680n;

/* JADX INFO: renamed from: Ym.m */
/* JADX INFO: loaded from: classes2.dex */
public final class C10099m implements DFS.Neighbors {

    /* JADX INFO: renamed from: Y */
    public static final C10099m f29897Y = new C10099m();

    @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.Neighbors
    public final Iterable getNeighbors(Object obj) {
        int i10 = LazyJavaStaticClassScope.f51953o;
        Collection<KotlinType> supertypes = ((ClassDescriptor) obj).getTypeConstructor().getSupertypes();
        AbstractC16544l.m18093f(supertypes, "getSupertypes(...)");
        return new C10107h(AbstractC21031l.m21496t(AbstractC17680n.m19329H(supertypes), C10092f.f29881r0), 3);
    }
}
