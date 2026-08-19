package kotlin.reflect.jvm.internal.impl.builtins.functions;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SupertypeLoopChecker;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.types.AbstractClassTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributes;
import kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl;
import kotlin.reflect.jvm.internal.impl.utils.addToStdlib.AddToStdlibKt;
import p025An.C0644w;
import p571X9.AbstractC9393x3;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17681o;
import p909nm.AbstractC17682p;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.builtins.functions.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C16560a extends AbstractClassTypeConstructor {

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ FunctionClassDescriptor f51339c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16560a(FunctionClassDescriptor functionClassDescriptor) {
        super(functionClassDescriptor.f51324q0);
        this.f51339c = functionClassDescriptor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
    /* JADX INFO: renamed from: b */
    public final Collection mo7319b() {
        List listM19382k;
        FunctionClassDescriptor functionClassDescriptor = this.f51339c;
        FunctionTypeKind functionTypeKind = functionClassDescriptor.getFunctionTypeKind();
        FunctionTypeKind.Function function = FunctionTypeKind.Function.INSTANCE;
        if (AbstractC16544l.m18089b(functionTypeKind, function)) {
            listM19382k = AbstractC9393x3.m9974d(FunctionClassDescriptor.f51322x0);
        } else if (AbstractC16544l.m18089b(functionTypeKind, FunctionTypeKind.KFunction.INSTANCE)) {
            listM19382k = AbstractC17681o.m19382k(FunctionClassDescriptor.f51323y0, new ClassId(StandardNames.BUILT_INS_PACKAGE_FQ_NAME, function.numberedClassName(functionClassDescriptor.getArity())));
        } else {
            FunctionTypeKind.SuspendFunction suspendFunction = FunctionTypeKind.SuspendFunction.INSTANCE;
            if (AbstractC16544l.m18089b(functionTypeKind, suspendFunction)) {
                listM19382k = AbstractC9393x3.m9974d(FunctionClassDescriptor.f51322x0);
            } else {
                if (!AbstractC16544l.m18089b(functionTypeKind, FunctionTypeKind.KSuspendFunction.INSTANCE)) {
                    AddToStdlibKt.shouldNotBeCalled$default(null, 1, null);
                    throw new C0644w();
                }
                listM19382k = AbstractC17681o.m19382k(FunctionClassDescriptor.f51323y0, new ClassId(StandardNames.COROUTINES_PACKAGE_FQ_NAME, suspendFunction.numberedClassName(functionClassDescriptor.getArity())));
            }
        }
        ModuleDescriptor containingDeclaration = functionClassDescriptor.f51325r0.getContainingDeclaration();
        List<ClassId> list = listM19382k;
        ArrayList arrayList = new ArrayList(AbstractC17682p.m19389r(list, 10));
        for (ClassId classId : list) {
            ClassDescriptor classDescriptorFindClassAcrossModuleDependencies = FindClassInModuleKt.findClassAcrossModuleDependencies(containingDeclaration, classId);
            if (classDescriptorFindClassAcrossModuleDependencies == null) {
                throw new IllegalStateException(("Built-in class " + classId + " not found").toString());
            }
            List listM19374x0 = AbstractC17680n.m19374x0(classDescriptorFindClassAcrossModuleDependencies.getTypeConstructor().getParameters().size(), functionClassDescriptor.f51330w0);
            ArrayList arrayList2 = new ArrayList(AbstractC17682p.m19389r(listM19374x0, 10));
            Iterator it = listM19374x0.iterator();
            while (it.hasNext()) {
                arrayList2.add(new TypeProjectionImpl(((TypeParameterDescriptor) it.next()).getDefaultType()));
            }
            arrayList.add(KotlinTypeFactory.simpleNotNullType(TypeAttributes.Companion.getEmpty(), classDescriptorFindClassAcrossModuleDependencies, arrayList2));
        }
        return AbstractC17680n.m19322C0(arrayList);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
    /* JADX INFO: renamed from: e */
    public final SupertypeLoopChecker mo7321e() {
        return SupertypeLoopChecker.EMPTY.INSTANCE;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractClassTypeConstructor, kotlin.reflect.jvm.internal.impl.types.ClassifierBasedTypeConstructor, kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    /* JADX INFO: renamed from: getDeclarationDescriptor */
    public final ClassDescriptor mo22589getDeclarationDescriptor() {
        return this.f51339c;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public final List getParameters() {
        return this.f51339c.f51330w0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public final boolean isDenotable() {
        return true;
    }

    public final String toString() {
        return this.f51339c.toString();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractClassTypeConstructor, kotlin.reflect.jvm.internal.impl.types.ClassifierBasedTypeConstructor, kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    /* JADX INFO: renamed from: getDeclarationDescriptor */
    public final ClassifierDescriptor mo22589getDeclarationDescriptor() {
        return this.f51339c;
    }
}
