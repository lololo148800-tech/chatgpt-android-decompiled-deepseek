package p840jn;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.utils.DFS;
import p909nm.AbstractC17682p;

/* JADX INFO: renamed from: jn.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C16272a implements DFS.Neighbors {

    /* JADX INFO: renamed from: Y */
    public static final C16272a f50401Y = new C16272a();

    @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.Neighbors
    public final Iterable getNeighbors(Object obj) {
        int i10 = DescriptorUtilsKt.f52893a;
        Collection<ValueParameterDescriptor> overriddenDescriptors = ((ValueParameterDescriptor) obj).getOverriddenDescriptors();
        ArrayList arrayList = new ArrayList(AbstractC17682p.m19389r(overriddenDescriptors, 10));
        Iterator<T> it = overriddenDescriptors.iterator();
        while (it.hasNext()) {
            arrayList.add(((ValueParameterDescriptor) it.next()).getOriginal());
        }
        return arrayList;
    }
}
