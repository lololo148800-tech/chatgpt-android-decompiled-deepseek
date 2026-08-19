package kotlin.reflect.jvm.internal.impl.resolve.constants;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeKt;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributes;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import p025An.C0644w;
import p571X9.AbstractC9393x3;
import p909nm.AbstractC17680n;

/* JADX INFO: loaded from: classes2.dex */
public final class KClassValue extends ConstantValue<Value> {
    public static final Companion Companion = new Companion(null);

    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public final ConstantValue<?> create(KotlinType argumentType) {
            AbstractC16544l.m18094g(argumentType, "argumentType");
            if (KotlinTypeKt.isError(argumentType)) {
                return null;
            }
            KotlinType type = argumentType;
            int i10 = 0;
            while (KotlinBuiltIns.isArray(type)) {
                type = ((TypeProjection) AbstractC17680n.m19365o0(type.getArguments())).getType();
                i10++;
            }
            ClassifierDescriptor classifierDescriptorMo22589getDeclarationDescriptor = type.getConstructor().mo22589getDeclarationDescriptor();
            if (classifierDescriptorMo22589getDeclarationDescriptor instanceof ClassDescriptor) {
                ClassId classId = DescriptorUtilsKt.getClassId(classifierDescriptorMo22589getDeclarationDescriptor);
                return classId == null ? new KClassValue(new Value.LocalClass(argumentType)) : new KClassValue(classId, i10);
            }
            if (classifierDescriptorMo22589getDeclarationDescriptor instanceof TypeParameterDescriptor) {
                return new KClassValue(ClassId.Companion.topLevel(StandardNames.FqNames.any.toSafe()), 0);
            }
            return null;
        }
    }

    public static abstract class Value {

        public static final class LocalClass extends Value {

            /* JADX INFO: renamed from: a */
            public final KotlinType f52887a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public LocalClass(KotlinType type) {
                super(null);
                AbstractC16544l.m18094g(type, "type");
                this.f52887a = type;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LocalClass) && AbstractC16544l.m18089b(this.f52887a, ((LocalClass) obj).f52887a);
            }

            public final KotlinType getType() {
                return this.f52887a;
            }

            public int hashCode() {
                return this.f52887a.hashCode();
            }

            public String toString() {
                return "LocalClass(type=" + this.f52887a + ')';
            }
        }

        public static final class NormalClass extends Value {

            /* JADX INFO: renamed from: a */
            public final ClassLiteralValue f52888a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public NormalClass(ClassLiteralValue value) {
                super(null);
                AbstractC16544l.m18094g(value, "value");
                this.f52888a = value;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof NormalClass) && AbstractC16544l.m18089b(this.f52888a, ((NormalClass) obj).f52888a);
            }

            public final int getArrayDimensions() {
                return this.f52888a.getArrayNestedness();
            }

            public final ClassId getClassId() {
                return this.f52888a.getClassId();
            }

            public final ClassLiteralValue getValue() {
                return this.f52888a;
            }

            public int hashCode() {
                return this.f52888a.hashCode();
            }

            public String toString() {
                return "NormalClass(value=" + this.f52888a + ')';
            }
        }

        public Value(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KClassValue(Value value) {
        super(value);
        AbstractC16544l.m18094g(value, "value");
    }

    public final KotlinType getArgumentType(ModuleDescriptor module) {
        AbstractC16544l.m18094g(module, "module");
        Value value = getValue();
        if (value instanceof Value.LocalClass) {
            return ((Value.LocalClass) getValue()).getType();
        }
        if (!(value instanceof Value.NormalClass)) {
            throw new C0644w();
        }
        ClassLiteralValue value2 = ((Value.NormalClass) getValue()).getValue();
        ClassId classIdComponent1 = value2.component1();
        int iComponent2 = value2.component2();
        ClassDescriptor classDescriptorFindClassAcrossModuleDependencies = FindClassInModuleKt.findClassAcrossModuleDependencies(module, classIdComponent1);
        if (classDescriptorFindClassAcrossModuleDependencies == null) {
            return ErrorUtils.createErrorType(ErrorTypeKind.UNRESOLVED_KCLASS_CONSTANT_VALUE, classIdComponent1.toString(), String.valueOf(iComponent2));
        }
        SimpleType defaultType = classDescriptorFindClassAcrossModuleDependencies.getDefaultType();
        AbstractC16544l.m18093f(defaultType, "getDefaultType(...)");
        KotlinType kotlinTypeReplaceArgumentsWithStarProjections = TypeUtilsKt.replaceArgumentsWithStarProjections(defaultType);
        for (int i10 = 0; i10 < iComponent2; i10++) {
            kotlinTypeReplaceArgumentsWithStarProjections = module.getBuiltIns().getArrayType(Variance.INVARIANT, kotlinTypeReplaceArgumentsWithStarProjections);
        }
        return kotlinTypeReplaceArgumentsWithStarProjections;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue
    public KotlinType getType(ModuleDescriptor module) {
        AbstractC16544l.m18094g(module, "module");
        TypeAttributes empty = TypeAttributes.Companion.getEmpty();
        ClassDescriptor kClass = module.getBuiltIns().getKClass();
        AbstractC16544l.m18093f(kClass, "getKClass(...)");
        return KotlinTypeFactory.simpleNotNullType(empty, kClass, AbstractC9393x3.m9974d(new TypeProjectionImpl(getArgumentType(module))));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public KClassValue(ClassLiteralValue value) {
        this(new Value.NormalClass(value));
        AbstractC16544l.m18094g(value, "value");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public KClassValue(ClassId classId, int i10) {
        this(new ClassLiteralValue(classId, i10));
        AbstractC16544l.m18094g(classId, "classId");
    }
}
