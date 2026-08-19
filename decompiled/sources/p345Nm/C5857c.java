package p345Nm;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUtilKt;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import p049Bm.InterfaceC1436k;

/* JADX INFO: renamed from: Nm.c */
/* JADX INFO: loaded from: classes2.dex */
public final class C5857c implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f19158Y;

    /* JADX INFO: renamed from: Z */
    public final KotlinBuiltIns f19159Z;

    public /* synthetic */ C5857c(KotlinBuiltIns kotlinBuiltIns, int i10) {
        this.f19158Y = i10;
        this.f19159Z = kotlinBuiltIns;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        KotlinBuiltIns kotlinBuiltIns = this.f19159Z;
        switch (this.f19158Y) {
            case 0:
                Name name = (Name) obj;
                ClassifierDescriptor classifierDescriptorMo22590getContributedClassifier = kotlinBuiltIns.getBuiltInsPackageScope().mo22590getContributedClassifier(name, NoLookupLocation.FROM_BUILTINS);
                if (classifierDescriptorMo22590getContributedClassifier == null) {
                    throw new AssertionError("Built-in class " + StandardNames.BUILT_INS_PACKAGE_FQ_NAME.child(name) + " is not found");
                }
                if (classifierDescriptorMo22590getContributedClassifier instanceof ClassDescriptor) {
                    return (ClassDescriptor) classifierDescriptorMo22590getContributedClassifier;
                }
                throw new AssertionError("Must be a class descriptor " + name + ", but was " + classifierDescriptorMo22590getContributedClassifier);
            default:
                ModuleDescriptor module = (ModuleDescriptor) obj;
                Name name2 = AnnotationUtilKt.f51430a;
                AbstractC16544l.m18094g(module, "module");
                SimpleType arrayType = module.getBuiltIns().getArrayType(Variance.INVARIANT, kotlinBuiltIns.getStringType());
                AbstractC16544l.m18093f(arrayType, "getArrayType(...)");
                return arrayType;
        }
    }
}
