package kotlin.reflect.jvm.internal.impl.resolve;

import gn.C14196a;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleCapability;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final class StdlibClassFinderKt {

    /* JADX INFO: renamed from: a */
    public static final ModuleCapability f52864a = new ModuleCapability("StdlibClassFinder");

    public static final StdlibClassFinder getStdlibClassFinder(ModuleDescriptor moduleDescriptor) {
        AbstractC16544l.m18094g(moduleDescriptor, "<this>");
        StdlibClassFinder stdlibClassFinder = (StdlibClassFinder) moduleDescriptor.getCapability(f52864a);
        return stdlibClassFinder == null ? C14196a.f44607a : stdlibClassFinder;
    }
}
