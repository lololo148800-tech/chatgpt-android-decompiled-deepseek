package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: loaded from: classes2.dex */
public final class InvalidModuleExceptionKt {

    /* JADX INFO: renamed from: a */
    public static final ModuleCapability f51400a = new ModuleCapability("InvalidModuleNotifier");

    public static final void moduleInvalidated(ModuleDescriptor moduleDescriptor) {
        AbstractC16544l.m18094g(moduleDescriptor, "<this>");
        InvalidModuleNotifier invalidModuleNotifier = (InvalidModuleNotifier) moduleDescriptor.getCapability(f51400a);
        if (invalidModuleNotifier != null) {
            invalidModuleNotifier.notifyModuleInvalidated(moduleDescriptor);
        } else {
            throw new InvalidModuleException("Accessing invalid module descriptor " + moduleDescriptor);
        }
    }
}
