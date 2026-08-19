package p298Lm;

import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.AbstractC16529F;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMap;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.EmptyPackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.RuntimeModuleData;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoBufUtilKt;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor;
import mm.EnumC17307j;
import p1113xn.AbstractC21329w;
import p225Im.InterfaceC3756d;
import p225Im.InterfaceC3776x;
import p523V9.AbstractC8138m0;
import p571X9.AbstractC9227W;
import p571X9.AbstractC9393x3;
import p909nm.AbstractC17680n;
import p909nm.C17689w;
import p909nm.C17691y;

/* JADX INFO: renamed from: Lm.D */
/* JADX INFO: loaded from: classes2.dex */
public final class C5134D extends AbstractC5148K implements InterfaceC3756d, InterfaceC5136E, InterfaceC5131B0 {

    /* JADX INFO: renamed from: p0 */
    public static final /* synthetic */ int f16769p0 = 0;

    /* JADX INFO: renamed from: Z */
    public final Class f16770Z;

    /* JADX INFO: renamed from: o0 */
    public final Object f16771o0;

    public C5134D(Class jClass) {
        AbstractC16544l.m18094g(jClass, "jClass");
        this.f16770Z = jClass;
        this.f16771o0 = AbstractC9227W.m9799b(EnumC17307j.f55133Y, new C5204u(this, 0));
    }

    /* JADX INFO: renamed from: u */
    public static ClassDescriptorImpl m5683u(ClassId classId, RuntimeModuleData runtimeModuleData) {
        ClassDescriptorImpl classDescriptorImpl = new ClassDescriptorImpl(new EmptyPackageFragmentDescriptor(runtimeModuleData.getModule(), classId.getPackageFqName()), classId.getShortClassName(), Modality.FINAL, ClassKind.CLASS, AbstractC9393x3.m9974d(runtimeModuleData.getModule().getBuiltIns().getAny().getDefaultType()), SourceElement.NO_SOURCE, false, runtimeModuleData.getDeserialization().getStorageManager());
        classDescriptorImpl.initialize(new C5130B(runtimeModuleData.getDeserialization().getStorageManager(), classDescriptorImpl), C17691y.f56482Y, null);
        return classDescriptorImpl;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, mm.i] */
    @Override // p225Im.InterfaceC3756d
    /* JADX INFO: renamed from: a */
    public final String mo4447a() {
        C5214z c5214z = (C5214z) this.f16771o0.getValue();
        c5214z.getClass();
        InterfaceC3776x interfaceC3776x = C5214z.f16939m[3];
        return (String) c5214z.f16942e.invoke();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, mm.i] */
    @Override // p225Im.InterfaceC3756d
    /* JADX INFO: renamed from: c */
    public final String mo4448c() {
        C5214z c5214z = (C5214z) this.f16771o0.getValue();
        c5214z.getClass();
        InterfaceC3776x interfaceC3776x = C5214z.f16939m[2];
        return (String) c5214z.f16941d.invoke();
    }

    @Override // kotlin.jvm.internal.InterfaceC16536d
    /* JADX INFO: renamed from: d */
    public final Class mo5684d() {
        return this.f16770Z;
    }

    @Override // p225Im.InterfaceC3756d
    /* JADX INFO: renamed from: e */
    public final boolean mo4449e(Object obj) {
        Class<?> cls = this.f16770Z;
        Integer functionClassArity = ReflectClassUtilKt.getFunctionClassArity(cls);
        if (functionClassArity != null) {
            return AbstractC16529F.m18082f(functionClassArity.intValue(), obj);
        }
        Class<?> wrapperByPrimitive = ReflectClassUtilKt.getWrapperByPrimitive(cls);
        if (wrapperByPrimitive != null) {
            cls = wrapperByPrimitive;
        }
        return cls.isInstance(obj);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C5134D) && AbstractC8138m0.m8668c(this).equals(AbstractC8138m0.m8668c((InterfaceC3756d) obj));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, mm.i] */
    @Override // p225Im.InterfaceC3756d
    public final List getTypeParameters() {
        C5214z c5214z = (C5214z) this.f16771o0.getValue();
        c5214z.getClass();
        InterfaceC3776x interfaceC3776x = C5214z.f16939m[6];
        Object objInvoke = c5214z.f16943f.invoke();
        AbstractC16544l.m18093f(objInvoke, "getValue(...)");
        return (List) objInvoke;
    }

    @Override // p225Im.InterfaceC3756d
    public final int hashCode() {
        return AbstractC8138m0.m8668c(this).hashCode();
    }

    @Override // p225Im.InterfaceC3756d
    public final boolean isValue() {
        return getDescriptor().isValue();
    }

    @Override // p298Lm.AbstractC5148K
    /* JADX INFO: renamed from: j */
    public final Collection mo5685j() {
        ClassDescriptor descriptor = getDescriptor();
        if (descriptor.getKind() == ClassKind.INTERFACE || descriptor.getKind() == ClassKind.OBJECT) {
            return C17689w.f56480Y;
        }
        Collection<ClassConstructorDescriptor> constructors = descriptor.getConstructors();
        AbstractC16544l.m18093f(constructors, "getConstructors(...)");
        return constructors;
    }

    @Override // p298Lm.AbstractC5148K
    /* JADX INFO: renamed from: k */
    public final Collection mo5686k(Name name) {
        MemberScope memberScope = getDescriptor().getDefaultType().getMemberScope();
        NoLookupLocation noLookupLocation = NoLookupLocation.FROM_REFLECTION;
        Collection<? extends SimpleFunctionDescriptor> contributedFunctions = memberScope.getContributedFunctions(name, noLookupLocation);
        MemberScope staticScope = getDescriptor().getStaticScope();
        AbstractC16544l.m18093f(staticScope, "getStaticScope(...)");
        return AbstractC17680n.m19361k0(staticScope.getContributedFunctions(name, noLookupLocation), contributedFunctions);
    }

    @Override // p298Lm.AbstractC5148K
    /* JADX INFO: renamed from: l */
    public final PropertyDescriptor mo5687l(int i10) {
        Class<?> declaringClass;
        Class cls = this.f16770Z;
        if (cls.getSimpleName().equals("DefaultImpls") && (declaringClass = cls.getDeclaringClass()) != null && declaringClass.isInterface()) {
            return ((C5134D) AbstractC8138m0.m8670e(declaringClass)).mo5687l(i10);
        }
        ClassDescriptor descriptor = getDescriptor();
        DeserializedClassDescriptor deserializedClassDescriptor = descriptor instanceof DeserializedClassDescriptor ? (DeserializedClassDescriptor) descriptor : null;
        if (deserializedClassDescriptor == null) {
            return null;
        }
        ProtoBuf.Class classProto = deserializedClassDescriptor.getClassProto();
        GeneratedMessageLite.GeneratedExtension<ProtoBuf.Class, List<ProtoBuf.Property>> classLocalVariable = JvmProtoBuf.classLocalVariable;
        AbstractC16544l.m18093f(classLocalVariable, "classLocalVariable");
        ProtoBuf.Property property = (ProtoBuf.Property) ProtoBufUtilKt.getExtensionOrNull(classProto, classLocalVariable, i10);
        if (property != null) {
            return (PropertyDescriptor) AbstractC5147J0.m5718f(this.f16770Z, property, deserializedClassDescriptor.getC().getNameResolver(), deserializedClassDescriptor.getC().getTypeTable(), deserializedClassDescriptor.getMetadataVersion(), C5132C.f16767Y);
        }
        return null;
    }

    @Override // p298Lm.AbstractC5148K
    /* JADX INFO: renamed from: o */
    public final Collection mo5688o(Name name) {
        MemberScope memberScope = getDescriptor().getDefaultType().getMemberScope();
        NoLookupLocation noLookupLocation = NoLookupLocation.FROM_REFLECTION;
        Collection<? extends PropertyDescriptor> contributedVariables = memberScope.getContributedVariables(name, noLookupLocation);
        MemberScope staticScope = getDescriptor().getStaticScope();
        AbstractC16544l.m18093f(staticScope, "getStaticScope(...)");
        return AbstractC17680n.m19361k0(staticScope.getContributedVariables(name, noLookupLocation), contributedVariables);
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("class ");
        ClassId classIdM5689v = m5689v();
        FqName packageFqName = classIdM5689v.getPackageFqName();
        if (packageFqName.isRoot()) {
            str = "";
        } else {
            str = packageFqName.asString() + '.';
        }
        sb2.append(str + AbstractC21329w.m21730q(classIdM5689v.getRelativeClassName().asString(), '.', '$'));
        return sb2.toString();
    }

    /* JADX INFO: renamed from: v */
    public final ClassId m5689v() {
        PrimitiveType primitiveType;
        ClassId classIdMapJavaToKotlin;
        ClassId classId = AbstractC5143H0.f16781a;
        Class klass = this.f16770Z;
        AbstractC16544l.m18094g(klass, "klass");
        if (klass.isArray()) {
            Class<?> componentType = klass.getComponentType();
            AbstractC16544l.m18093f(componentType, "getComponentType(...)");
            primitiveType = componentType.isPrimitive() ? JvmPrimitiveType.get(componentType.getSimpleName()).getPrimitiveType() : null;
            return primitiveType != null ? new ClassId(StandardNames.BUILT_INS_PACKAGE_FQ_NAME, primitiveType.getArrayTypeName()) : ClassId.Companion.topLevel(StandardNames.FqNames.array.toSafe());
        }
        if (klass.equals(Void.TYPE)) {
            return AbstractC5143H0.f16781a;
        }
        primitiveType = klass.isPrimitive() ? JvmPrimitiveType.get(klass.getSimpleName()).getPrimitiveType() : null;
        if (primitiveType != null) {
            return new ClassId(StandardNames.BUILT_INS_PACKAGE_FQ_NAME, primitiveType.getTypeName());
        }
        ClassId classId2 = ReflectClassUtilKt.getClassId(klass);
        return (classId2.isLocal() || (classIdMapJavaToKotlin = JavaToKotlinClassMap.INSTANCE.mapJavaToKotlin(classId2.asSingleFqName())) == null) ? classId2 : classIdMapJavaToKotlin;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, mm.i] */
    @Override // p298Lm.InterfaceC5136E
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public final ClassDescriptor getDescriptor() {
        return ((C5214z) this.f16771o0.getValue()).m5763a();
    }
}
