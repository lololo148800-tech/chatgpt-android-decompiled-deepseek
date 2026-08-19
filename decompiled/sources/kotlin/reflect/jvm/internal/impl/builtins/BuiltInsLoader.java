package kotlin.reflect.jvm.internal.impl.builtins;

import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.ClassDescriptorFactory;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.PlatformDependentDeclarationFilter;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import mm.EnumC17307j;
import p345Nm.C5855a;
import p571X9.AbstractC9227W;

/* JADX INFO: loaded from: classes2.dex */
public interface BuiltInsLoader {
    public static final Companion Companion = Companion.f51291a;

    public static final class Companion {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ Companion f51291a = new Companion();

        /* JADX INFO: renamed from: b */
        public static final Object f51292b = AbstractC9227W.m9799b(EnumC17307j.f55133Y, C5855a.f19153Z);

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, mm.i] */
        public final BuiltInsLoader getInstance() {
            return (BuiltInsLoader) f51292b.getValue();
        }
    }

    PackageFragmentProvider createPackageFragmentProvider(StorageManager storageManager, ModuleDescriptor moduleDescriptor, Iterable<? extends ClassDescriptorFactory> iterable, PlatformDependentDeclarationFilter platformDependentDeclarationFilter, AdditionalClassPartsProvider additionalClassPartsProvider, boolean z6);
}
