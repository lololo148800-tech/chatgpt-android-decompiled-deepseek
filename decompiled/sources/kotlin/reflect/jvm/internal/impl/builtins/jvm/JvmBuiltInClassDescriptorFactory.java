package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import java.util.Collection;
import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.C16553u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.ClassDescriptorFactory;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageKt;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import p049Bm.InterfaceC1436k;
import p225Im.InterfaceC3776x;
import p298Lm.C5150L;
import p368Om.C6266b;
import p909nm.AbstractC17665J;
import p909nm.C17691y;

/* JADX INFO: loaded from: classes2.dex */
public final class JvmBuiltInClassDescriptorFactory implements ClassDescriptorFactory {

    /* JADX INFO: renamed from: f */
    public static final Name f51360f;

    /* JADX INFO: renamed from: g */
    public static final ClassId f51361g;

    /* JADX INFO: renamed from: a */
    public final ModuleDescriptor f51362a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC1436k f51363b;

    /* JADX INFO: renamed from: c */
    public final NotNullLazyValue f51364c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ InterfaceC3776x[] f51358d = {AbstractC16526C.f51263a.mo5699h(new C16553u(JvmBuiltInClassDescriptorFactory.class, "cloneable", "getCloneable()Lorg/jetbrains/kotlin/descriptors/impl/ClassDescriptorImpl;", 0))};
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: e */
    public static final FqName f51359e = StandardNames.BUILT_INS_PACKAGE_FQ_NAME;

    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public final ClassId getCLONEABLE_CLASS_ID() {
            return JvmBuiltInClassDescriptorFactory.f51361g;
        }
    }

    static {
        FqNameUnsafe fqNameUnsafe = StandardNames.FqNames.cloneable;
        f51360f = fqNameUnsafe.shortName();
        f51361g = ClassId.Companion.topLevel(fqNameUnsafe.toSafe());
    }

    public JvmBuiltInClassDescriptorFactory(StorageManager storageManager, ModuleDescriptor moduleDescriptor, InterfaceC1436k computeContainingDeclaration) {
        AbstractC16544l.m18094g(storageManager, "storageManager");
        AbstractC16544l.m18094g(moduleDescriptor, "moduleDescriptor");
        AbstractC16544l.m18094g(computeContainingDeclaration, "computeContainingDeclaration");
        this.f51362a = moduleDescriptor;
        this.f51363b = computeContainingDeclaration;
        this.f51364c = storageManager.createLazyValue(new C5150L(this, 4, storageManager));
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.deserialization.ClassDescriptorFactory
    public ClassDescriptor createClass(ClassId classId) {
        AbstractC16544l.m18094g(classId, "classId");
        if (!classId.equals(f51361g)) {
            return null;
        }
        return (ClassDescriptorImpl) StorageKt.getValue(this.f51364c, this, f51358d[0]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.deserialization.ClassDescriptorFactory
    public Collection<ClassDescriptor> getAllContributedClassesIfPossible(FqName packageFqName) {
        AbstractC16544l.m18094g(packageFqName, "packageFqName");
        if (!packageFqName.equals(f51359e)) {
            return C17691y.f56482Y;
        }
        return AbstractC17665J.m19268h((ClassDescriptorImpl) StorageKt.getValue(this.f51364c, this, f51358d[0]));
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.deserialization.ClassDescriptorFactory
    public boolean shouldCreateClass(FqName packageFqName, Name name) {
        AbstractC16544l.m18094g(packageFqName, "packageFqName");
        AbstractC16544l.m18094g(name, "name");
        return name.equals(f51360f) && packageFqName.equals(f51359e);
    }

    public /* synthetic */ JvmBuiltInClassDescriptorFactory(StorageManager storageManager, ModuleDescriptor moduleDescriptor, InterfaceC1436k interfaceC1436k, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(storageManager, moduleDescriptor, (i10 & 4) != 0 ? C6266b.f20360Y : interfaceC1436k);
    }
}
