package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor;
import kotlin.reflect.jvm.internal.impl.descriptors.InvalidModuleExceptionKt;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleCapability;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageViewDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.platform.TargetPlatform;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNotNull;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.utils.addToStdlib.GNuz.HJrCuD;
import mm.C17314q;
import p049Bm.InterfaceC1436k;
import p077Cn.C1756x;
import p298Lm.C5140G;
import p571X9.AbstractC9227W;
import p909nm.AbstractC17678l;
import p909nm.AbstractC17680n;
import p909nm.C17689w;
import p909nm.C17690x;
import p909nm.C17691y;

/* JADX INFO: loaded from: classes2.dex */
public final class ModuleDescriptorImpl extends DeclarationDescriptorImpl implements ModuleDescriptor {

    /* JADX INFO: renamed from: o0 */
    public final StorageManager f51570o0;

    /* JADX INFO: renamed from: p0 */
    public final KotlinBuiltIns f51571p0;

    /* JADX INFO: renamed from: q0 */
    public final Map f51572q0;

    /* JADX INFO: renamed from: r0 */
    public final PackageViewDescriptorFactory f51573r0;

    /* JADX INFO: renamed from: s0 */
    public ModuleDependencies f51574s0;

    /* JADX INFO: renamed from: t0 */
    public PackageFragmentProvider f51575t0;

    /* JADX INFO: renamed from: u0 */
    public final boolean f51576u0;

    /* JADX INFO: renamed from: v0 */
    public final MemoizedFunctionToNotNull f51577v0;

    /* JADX INFO: renamed from: w0 */
    public final C17314q f51578w0;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ModuleDescriptorImpl(Name moduleName, StorageManager storageManager, KotlinBuiltIns builtIns, TargetPlatform targetPlatform) {
        this(moduleName, storageManager, builtIns, targetPlatform, null, null, 48, null);
        AbstractC16544l.m18094g(moduleName, "moduleName");
        AbstractC16544l.m18094g(storageManager, "storageManager");
        AbstractC16544l.m18094g(builtIns, "builtIns");
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public <R, D> R accept(DeclarationDescriptorVisitor<R, D> declarationDescriptorVisitor, D d10) {
        return (R) ModuleDescriptor.DefaultImpls.accept(this, declarationDescriptorVisitor, d10);
    }

    public void assertValid() {
        if (isValid()) {
            return;
        }
        InvalidModuleExceptionKt.moduleInvalidated(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor
    public KotlinBuiltIns getBuiltIns() {
        return this.f51571p0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor
    public <T> T getCapability(ModuleCapability<T> capability) {
        AbstractC16544l.m18094g(capability, "capability");
        T t10 = (T) this.f51572q0.get(capability);
        if (t10 == null) {
            return null;
        }
        return t10;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public DeclarationDescriptor getContainingDeclaration() {
        return ModuleDescriptor.DefaultImpls.getContainingDeclaration(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor
    public List<ModuleDescriptor> getExpectedByModules() {
        ModuleDependencies moduleDependencies = this.f51574s0;
        if (moduleDependencies != null) {
            return moduleDependencies.getDirectExpectedByDependencies();
        }
        StringBuilder sb2 = new StringBuilder("Dependencies of module ");
        String string = getName().toString();
        AbstractC16544l.m18093f(string, "toString(...)");
        sb2.append(string);
        sb2.append(" were not set");
        throw new AssertionError(sb2.toString());
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor
    public PackageViewDescriptor getPackage(FqName fqName) {
        AbstractC16544l.m18094g(fqName, "fqName");
        assertValid();
        return (PackageViewDescriptor) this.f51577v0.invoke(fqName);
    }

    public final PackageFragmentProvider getPackageFragmentProvider() {
        assertValid();
        return (CompositePackageFragmentProvider) this.f51578w0.getValue();
    }

    public final void initialize(PackageFragmentProvider providerForModuleContent) {
        AbstractC16544l.m18094g(providerForModuleContent, "providerForModuleContent");
        this.f51575t0 = providerForModuleContent;
    }

    public boolean isValid() {
        return this.f51576u0;
    }

    public final void setDependencies(ModuleDependencies dependencies) {
        AbstractC16544l.m18094g(dependencies, "dependencies");
        this.f51574s0 = dependencies;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor
    public boolean shouldSeeInternalsOf(ModuleDescriptor targetModule) {
        AbstractC16544l.m18094g(targetModule, "targetModule");
        if (equals(targetModule)) {
            return true;
        }
        ModuleDependencies moduleDependencies = this.f51574s0;
        AbstractC16544l.m18091d(moduleDependencies);
        return AbstractC17680n.m19333J(moduleDependencies.getModulesWhoseInternalsAreVisible(), targetModule) || getExpectedByModules().contains(targetModule) || targetModule.getExpectedByModules().contains(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorImpl
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        if (!isValid()) {
            sb2.append(" !isValid");
        }
        sb2.append(" packageFragmentProvider: ");
        PackageFragmentProvider packageFragmentProvider = this.f51575t0;
        sb2.append(packageFragmentProvider != null ? packageFragmentProvider.getClass().getSimpleName() : null);
        return sb2.toString();
    }

    public /* synthetic */ ModuleDescriptorImpl(Name name, StorageManager storageManager, KotlinBuiltIns kotlinBuiltIns, TargetPlatform targetPlatform, Map map, Name name2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(name, storageManager, kotlinBuiltIns, (i10 & 8) != 0 ? null : targetPlatform, (i10 & 16) != 0 ? C17690x.f56481Y : map, (i10 & 32) != 0 ? null : name2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor
    public Collection<FqName> getSubPackagesOf(FqName fqName, InterfaceC1436k nameFilter) {
        AbstractC16544l.m18094g(fqName, HJrCuD.TWDtupSpxXqGh);
        AbstractC16544l.m18094g(nameFilter, "nameFilter");
        assertValid();
        return getPackageFragmentProvider().getSubPackagesOf(fqName, nameFilter);
    }

    public final void setDependencies(ModuleDescriptorImpl... descriptors) {
        AbstractC16544l.m18094g(descriptors, "descriptors");
        setDependencies(AbstractC17678l.m19291N(descriptors));
    }

    public final void setDependencies(List<ModuleDescriptorImpl> descriptors) {
        AbstractC16544l.m18094g(descriptors, "descriptors");
        setDependencies(descriptors, C17691y.f56482Y);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ModuleDescriptorImpl(Name moduleName, StorageManager storageManager, KotlinBuiltIns builtIns, TargetPlatform targetPlatform, Map<ModuleCapability<?>, ? extends Object> capabilities, Name name) {
        super(Annotations.Companion.getEMPTY(), moduleName);
        AbstractC16544l.m18094g(moduleName, "moduleName");
        AbstractC16544l.m18094g(storageManager, "storageManager");
        AbstractC16544l.m18094g(builtIns, "builtIns");
        AbstractC16544l.m18094g(capabilities, "capabilities");
        this.f51570o0 = storageManager;
        this.f51571p0 = builtIns;
        if (moduleName.isSpecial()) {
            this.f51572q0 = capabilities;
            PackageViewDescriptorFactory packageViewDescriptorFactory = (PackageViewDescriptorFactory) getCapability(PackageViewDescriptorFactory.Companion.getCAPABILITY());
            this.f51573r0 = packageViewDescriptorFactory == null ? PackageViewDescriptorFactory.Default.INSTANCE : packageViewDescriptorFactory;
            this.f51576u0 = true;
            this.f51577v0 = storageManager.createMemoizedFunction(new C1756x(this, 5));
            this.f51578w0 = AbstractC9227W.m9800c(new C5140G(this, 13));
            return;
        }
        throw new IllegalArgumentException("Module name must be special: " + moduleName);
    }

    public final void setDependencies(List<ModuleDescriptorImpl> descriptors, Set<ModuleDescriptorImpl> friends) {
        AbstractC16544l.m18094g(descriptors, "descriptors");
        AbstractC16544l.m18094g(friends, "friends");
        setDependencies(new ModuleDependenciesImpl(descriptors, friends, C17689w.f56480Y, C17691y.f56482Y));
    }
}
