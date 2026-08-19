package p1047un;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorUtilKt;
import kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import kotlin.reflect.jvm.internal.impl.resolve.InlineClassesUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ImplicitClassReceiver;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ReceiverValue;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import kotlin.reflect.jvm.internal.impl.util.OperatorChecks;
import kotlin.reflect.jvm.internal.impl.util.ReturnsCheck;
import p049Bm.InterfaceC1436k;
import p138F8.vJO.vRJidSveZHcTw;
import p909nm.AbstractC17680n;

/* JADX INFO: renamed from: un.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C20392a implements InterfaceC1436k {

    /* JADX INFO: renamed from: Z */
    public static final C20392a f64490Z = new C20392a(0);

    /* JADX INFO: renamed from: o0 */
    public static final C20392a f64491o0 = new C20392a(1);

    /* JADX INFO: renamed from: p0 */
    public static final C20392a f64492p0 = new C20392a(2);

    /* JADX INFO: renamed from: q0 */
    public static final C20392a f64493q0 = new C20392a(3);

    /* JADX INFO: renamed from: r0 */
    public static final C20392a f64494r0 = new C20392a(4);

    /* JADX INFO: renamed from: s0 */
    public static final C20392a f64495s0 = new C20392a(5);

    /* JADX INFO: renamed from: t0 */
    public static final C20392a f64496t0 = new C20392a(6);

    /* JADX INFO: renamed from: u0 */
    public static final C20392a f64497u0 = new C20392a(7);

    /* JADX INFO: renamed from: v0 */
    public static final C20392a f64498v0 = new C20392a(8);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f64499Y;

    public /* synthetic */ C20392a(int i10) {
        this.f64499Y = i10;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x007a  */
    /* JADX WARN: Code duplicated, block: B:39:0x00b3  */
    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        boolean zIsSubtypeOf;
        ClassId classId;
        KotlinType returnType;
        boolean zIsSubtypeOf2;
        switch (this.f64499Y) {
            case 0:
                AbstractC16544l.m18094g((FunctionDescriptor) obj, "<this>");
                return null;
            case 1:
                AbstractC16544l.m18094g((FunctionDescriptor) obj, "<this>");
                return null;
            case 2:
                AbstractC16544l.m18094g((FunctionDescriptor) obj, "<this>");
                return null;
            case 3:
                FunctionDescriptor Checks = (FunctionDescriptor) obj;
                OperatorChecks operatorChecks = OperatorChecks.INSTANCE;
                AbstractC16544l.m18094g(Checks, "$this$Checks");
                List<ValueParameterDescriptor> valueParameters = Checks.getValueParameters();
                AbstractC16544l.m18093f(valueParameters, "getValueParameters(...)");
                ValueParameterDescriptor valueParameterDescriptor = (ValueParameterDescriptor) AbstractC17680n.m19353c0(valueParameters);
                if (valueParameterDescriptor == null || DescriptorUtilsKt.declaresOrInheritsDefaultValue(valueParameterDescriptor) || valueParameterDescriptor.getVarargElementType() != null) {
                    return "last parameter should not have a default value or be a vararg";
                }
                return null;
            case 4:
                FunctionDescriptor Checks2 = (FunctionDescriptor) obj;
                OperatorChecks operatorChecks2 = OperatorChecks.INSTANCE;
                AbstractC16544l.m18094g(Checks2, "$this$Checks");
                DeclarationDescriptor containingDeclaration = Checks2.getContainingDeclaration();
                AbstractC16544l.m18093f(containingDeclaration, "getContainingDeclaration(...)");
                if ((containingDeclaration instanceof ClassDescriptor) && KotlinBuiltIns.isAny((ClassDescriptor) containingDeclaration)) {
                    return null;
                }
                Collection<? extends FunctionDescriptor> overriddenDescriptors = Checks2.getOverriddenDescriptors();
                AbstractC16544l.m18093f(overriddenDescriptors, "getOverriddenDescriptors(...)");
                Collection<? extends FunctionDescriptor> collection = overriddenDescriptors;
                if (!collection.isEmpty()) {
                    Iterator<T> it = collection.iterator();
                    while (it.hasNext()) {
                        DeclarationDescriptor containingDeclaration2 = ((FunctionDescriptor) it.next()).getContainingDeclaration();
                        AbstractC16544l.m18093f(containingDeclaration2, "getContainingDeclaration(...)");
                        if ((containingDeclaration2 instanceof ClassDescriptor) && KotlinBuiltIns.isAny((ClassDescriptor) containingDeclaration2)) {
                            return null;
                        }
                    }
                }
                if (DescriptorUtilKt.isTypedEqualsInValueClass(Checks2)) {
                    return null;
                }
                StringBuilder sb2 = new StringBuilder("must override ''equals()'' in Any");
                DeclarationDescriptor containingDeclaration3 = Checks2.getContainingDeclaration();
                AbstractC16544l.m18093f(containingDeclaration3, "getContainingDeclaration(...)");
                if (InlineClassesUtilsKt.isValueClass(containingDeclaration3)) {
                    DescriptorRenderer descriptorRenderer = DescriptorRenderer.SHORT_NAMES_IN_TYPES;
                    DeclarationDescriptor containingDeclaration4 = Checks2.getContainingDeclaration();
                    AbstractC16544l.m18092e(containingDeclaration4, vRJidSveZHcTw.tdwOWILmBX);
                    SimpleType defaultType = ((ClassDescriptor) containingDeclaration4).getDefaultType();
                    AbstractC16544l.m18093f(defaultType, "getDefaultType(...)");
                    sb2.append(" or define ''equals(other: " + descriptorRenderer.renderType(TypeUtilsKt.replaceArgumentsWithStarProjections(defaultType)) + "): Boolean''");
                }
                return sb2.toString();
            case 5:
                FunctionDescriptor Checks3 = (FunctionDescriptor) obj;
                OperatorChecks operatorChecks3 = OperatorChecks.INSTANCE;
                AbstractC16544l.m18094g(Checks3, "$this$Checks");
                ReceiverParameterDescriptor dispatchReceiverParameter = Checks3.getDispatchReceiverParameter();
                if (dispatchReceiverParameter == null) {
                    dispatchReceiverParameter = Checks3.getExtensionReceiverParameter();
                }
                OperatorChecks operatorChecks4 = OperatorChecks.INSTANCE;
                boolean z6 = false;
                if (dispatchReceiverParameter != null) {
                    KotlinType returnType2 = Checks3.getReturnType();
                    if (returnType2 != null) {
                        KotlinType type = dispatchReceiverParameter.getType();
                        AbstractC16544l.m18093f(type, "getType(...)");
                        zIsSubtypeOf = TypeUtilsKt.isSubtypeOf(returnType2, type);
                    } else {
                        zIsSubtypeOf = false;
                    }
                    if (zIsSubtypeOf) {
                        z6 = true;
                    } else {
                        operatorChecks4.getClass();
                        ReceiverValue value = dispatchReceiverParameter.getValue();
                        AbstractC16544l.m18093f(value, "getValue(...)");
                        if (value instanceof ImplicitClassReceiver) {
                            ClassDescriptor classDescriptor = ((ImplicitClassReceiver) value).getClassDescriptor();
                            if (classDescriptor.isExpect() && (classId = DescriptorUtilsKt.getClassId(classDescriptor)) != null) {
                                ClassifierDescriptor classifierDescriptorFindClassifierAcrossModuleDependencies = FindClassInModuleKt.findClassifierAcrossModuleDependencies(DescriptorUtilsKt.getModule(classDescriptor), classId);
                                TypeAliasDescriptor typeAliasDescriptor = classifierDescriptorFindClassifierAcrossModuleDependencies instanceof TypeAliasDescriptor ? (TypeAliasDescriptor) classifierDescriptorFindClassifierAcrossModuleDependencies : null;
                                if (typeAliasDescriptor == null || (returnType = Checks3.getReturnType()) == null) {
                                    zIsSubtypeOf2 = false;
                                } else {
                                    zIsSubtypeOf2 = TypeUtilsKt.isSubtypeOf(returnType, typeAliasDescriptor.getExpandedType());
                                }
                            } else {
                                zIsSubtypeOf2 = false;
                            }
                        } else {
                            zIsSubtypeOf2 = false;
                        }
                        if (zIsSubtypeOf2) {
                            z6 = true;
                        }
                    }
                }
                if (z6) {
                    return null;
                }
                return "receiver must be a supertype of the return type";
            case 6:
                KotlinBuiltIns kotlinBuiltIns = (KotlinBuiltIns) obj;
                ReturnsCheck.ReturnsBoolean returnsBoolean = ReturnsCheck.ReturnsBoolean.INSTANCE;
                AbstractC16544l.m18094g(kotlinBuiltIns, "<this>");
                SimpleType booleanType = kotlinBuiltIns.getBooleanType();
                AbstractC16544l.m18093f(booleanType, "getBooleanType(...)");
                return booleanType;
            case 7:
                KotlinBuiltIns kotlinBuiltIns2 = (KotlinBuiltIns) obj;
                ReturnsCheck.ReturnsInt returnsInt = ReturnsCheck.ReturnsInt.INSTANCE;
                AbstractC16544l.m18094g(kotlinBuiltIns2, "<this>");
                SimpleType intType = kotlinBuiltIns2.getIntType();
                AbstractC16544l.m18093f(intType, "getIntType(...)");
                return intType;
            default:
                KotlinBuiltIns kotlinBuiltIns3 = (KotlinBuiltIns) obj;
                ReturnsCheck.ReturnsUnit returnsUnit = ReturnsCheck.ReturnsUnit.INSTANCE;
                AbstractC16544l.m18094g(kotlinBuiltIns3, "<this>");
                SimpleType unitType = kotlinBuiltIns3.getUnitType();
                AbstractC16544l.m18093f(unitType, "getUnitType(...)");
                return unitType;
        }
    }
}
