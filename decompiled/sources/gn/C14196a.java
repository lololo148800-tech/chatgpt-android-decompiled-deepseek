package gn;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.name.StandardClassIds;
import kotlin.reflect.jvm.internal.impl.resolve.StdlibClassFinder;

/* JADX INFO: renamed from: gn.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C14196a implements StdlibClassFinder {

    /* JADX INFO: renamed from: a */
    public static final C14196a f44607a = new C14196a();

    @Override // kotlin.reflect.jvm.internal.impl.resolve.StdlibClassFinder
    public final ClassDescriptor findEnumEntriesClass(ModuleDescriptor moduleDescriptor) {
        AbstractC16544l.m18094g(moduleDescriptor, "moduleDescriptor");
        return FindClassInModuleKt.findClassAcrossModuleDependencies(moduleDescriptor, StandardClassIds.INSTANCE.getEnumEntries());
    }
}
