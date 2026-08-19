package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.List;
import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.C16527D;
import kotlin.jvm.internal.C16553u;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageViewDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.LazyScopeAdapter;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageKt;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import p225Im.InterfaceC3776x;
import p228J.AbstractC3794B0;
import p436Rm.C6942h;

/* JADX INFO: loaded from: classes2.dex */
public class LazyPackageViewDescriptorImpl extends DeclarationDescriptorImpl implements PackageViewDescriptor {

    /* JADX INFO: renamed from: t0 */
    public static final /* synthetic */ InterfaceC3776x[] f51554t0;

    /* JADX INFO: renamed from: o0 */
    public final ModuleDescriptorImpl f51555o0;

    /* JADX INFO: renamed from: p0 */
    public final FqName f51556p0;

    /* JADX INFO: renamed from: q0 */
    public final NotNullLazyValue f51557q0;

    /* JADX INFO: renamed from: r0 */
    public final NotNullLazyValue f51558r0;

    /* JADX INFO: renamed from: s0 */
    public final LazyScopeAdapter f51559s0;

    static {
        C16553u c16553u = new C16553u(LazyPackageViewDescriptorImpl.class, "fragments", "getFragments()Ljava/util/List;", 0);
        C16527D c16527d = AbstractC16526C.f51263a;
        f51554t0 = new InterfaceC3776x[]{c16527d.mo5699h(c16553u), AbstractC3794B0.m4493r(LazyPackageViewDescriptorImpl.class, "empty", "getEmpty()Z", 0, c16527d)};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyPackageViewDescriptorImpl(ModuleDescriptorImpl module, FqName fqName, StorageManager storageManager) {
        super(Annotations.Companion.getEMPTY(), fqName.shortNameOrSpecial());
        AbstractC16544l.m18094g(module, "module");
        AbstractC16544l.m18094g(fqName, "fqName");
        AbstractC16544l.m18094g(storageManager, "storageManager");
        this.f51555o0 = module;
        this.f51556p0 = fqName;
        this.f51557q0 = storageManager.createLazyValue(new C6942h(this, 0));
        this.f51558r0 = storageManager.createLazyValue(new C6942h(this, 1));
        this.f51559s0 = new LazyScopeAdapter(storageManager, new C6942h(this, 2));
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public <R, D> R accept(DeclarationDescriptorVisitor<R, D> visitor, D d10) {
        AbstractC16544l.m18094g(visitor, "visitor");
        return visitor.visitPackageViewDescriptor(this, d10);
    }

    public boolean equals(Object obj) {
        PackageViewDescriptor packageViewDescriptor = obj instanceof PackageViewDescriptor ? (PackageViewDescriptor) obj : null;
        return packageViewDescriptor != null && AbstractC16544l.m18089b(getFqName(), packageViewDescriptor.getFqName()) && AbstractC16544l.m18089b(getModule(), packageViewDescriptor.getModule());
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageViewDescriptor
    public FqName getFqName() {
        return this.f51556p0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageViewDescriptor
    public List<PackageFragmentDescriptor> getFragments() {
        return (List) StorageKt.getValue(this.f51557q0, this, f51554t0[0]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageViewDescriptor
    public MemberScope getMemberScope() {
        return this.f51559s0;
    }

    public int hashCode() {
        return getFqName().hashCode() + (getModule().hashCode() * 31);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageViewDescriptor
    public boolean isEmpty() {
        return ((Boolean) StorageKt.getValue(this.f51558r0, this, f51554t0[1])).booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public PackageViewDescriptor getContainingDeclaration() {
        if (getFqName().isRoot()) {
            return null;
        }
        return getModule().getPackage(getFqName().parent());
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageViewDescriptor
    public ModuleDescriptorImpl getModule() {
        return this.f51555o0;
    }
}
