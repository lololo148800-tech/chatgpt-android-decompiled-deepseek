package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import p049Bm.InterfaceC1436k;

/* JADX INFO: loaded from: classes2.dex */
public interface ModuleDescriptor extends DeclarationDescriptor {

    public static final class DefaultImpls {
        public static <R, D> R accept(ModuleDescriptor moduleDescriptor, DeclarationDescriptorVisitor<R, D> visitor, D d10) {
            AbstractC16544l.m18094g(visitor, "visitor");
            return visitor.visitModuleDeclaration(moduleDescriptor, d10);
        }

        public static DeclarationDescriptor getContainingDeclaration(ModuleDescriptor moduleDescriptor) {
            return null;
        }
    }

    KotlinBuiltIns getBuiltIns();

    <T> T getCapability(ModuleCapability<T> moduleCapability);

    List<ModuleDescriptor> getExpectedByModules();

    PackageViewDescriptor getPackage(FqName fqName);

    Collection<FqName> getSubPackagesOf(FqName fqName, InterfaceC1436k interfaceC1436k);

    boolean shouldSeeInternalsOf(ModuleDescriptor moduleDescriptor);
}
