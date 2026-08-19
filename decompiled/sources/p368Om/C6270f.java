package p368Om;

import kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.utils.DFS;
import p225Im.InterfaceC3776x;

/* JADX INFO: renamed from: Om.f */
/* JADX INFO: loaded from: classes2.dex */
public final class C6270f implements DFS.Neighbors {

    /* JADX INFO: renamed from: Y */
    public static final C6270f f20367Y = new C6270f();

    @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.Neighbors
    public final Iterable getNeighbors(Object obj) {
        InterfaceC3776x[] interfaceC3776xArr = JvmBuiltInsCustomizer.f51371i;
        return ((CallableMemberDescriptor) obj).getOriginal().getOverriddenDescriptors();
    }
}
