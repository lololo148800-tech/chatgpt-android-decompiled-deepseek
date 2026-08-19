package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.resolve.constants.AnnotationValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ArrayValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.BooleanValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ByteValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.CharValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValueFactory;
import kotlin.reflect.jvm.internal.impl.resolve.constants.DoubleValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.EnumValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ErrorValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.FloatValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.IntValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.KClassValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.LongValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ShortValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.StringValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.UByteValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.UIntValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ULongValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.UShortValue;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;
import mm.C17309l;
import p200Hm.C3507f;
import p909nm.AbstractC17659D;
import p909nm.AbstractC17660E;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17681o;
import p909nm.AbstractC17682p;
import p909nm.C17690x;

/* JADX INFO: loaded from: classes2.dex */
public final class AnnotationDeserializer {

    /* JADX INFO: renamed from: a */
    public final ModuleDescriptor f52983a;

    /* JADX INFO: renamed from: b */
    public final NotFoundClasses f52984b;

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ProtoBuf.Annotation.Argument.Value.Type.values().length];
            try {
                iArr[ProtoBuf.Annotation.Argument.Value.Type.BYTE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ProtoBuf.Annotation.Argument.Value.Type.CHAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ProtoBuf.Annotation.Argument.Value.Type.SHORT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ProtoBuf.Annotation.Argument.Value.Type.INT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ProtoBuf.Annotation.Argument.Value.Type.LONG.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ProtoBuf.Annotation.Argument.Value.Type.FLOAT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ProtoBuf.Annotation.Argument.Value.Type.DOUBLE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[ProtoBuf.Annotation.Argument.Value.Type.BOOLEAN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[ProtoBuf.Annotation.Argument.Value.Type.STRING.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[ProtoBuf.Annotation.Argument.Value.Type.CLASS.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[ProtoBuf.Annotation.Argument.Value.Type.ENUM.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[ProtoBuf.Annotation.Argument.Value.Type.ANNOTATION.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[ProtoBuf.Annotation.Argument.Value.Type.ARRAY.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public AnnotationDeserializer(ModuleDescriptor module, NotFoundClasses notFoundClasses) {
        AbstractC16544l.m18094g(module, "module");
        AbstractC16544l.m18094g(notFoundClasses, "notFoundClasses");
        this.f52983a = module;
        this.f52984b = notFoundClasses;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m18368a(ConstantValue constantValue, KotlinType kotlinType, ProtoBuf.Annotation.Argument.Value value) {
        ProtoBuf.Annotation.Argument.Value.Type type = value.getType();
        int i10 = type == null ? -1 : WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
        if (i10 != 10) {
            ModuleDescriptor moduleDescriptor = this.f52983a;
            if (i10 != 13) {
                return AbstractC16544l.m18089b(constantValue.getType(moduleDescriptor), kotlinType);
            }
            if (constantValue instanceof ArrayValue) {
                ArrayValue arrayValue = (ArrayValue) constantValue;
                if (arrayValue.getValue().size() == value.getArrayElementList().size()) {
                    KotlinType arrayElementTypeOrNull = moduleDescriptor.getBuiltIns().getArrayElementTypeOrNull(kotlinType);
                    if (arrayElementTypeOrNull == null) {
                        return false;
                    }
                    Iterable iterableM19380i = AbstractC17681o.m19380i(arrayValue.getValue());
                    if ((iterableM19380i instanceof Collection) && ((Collection) iterableM19380i).isEmpty()) {
                        return true;
                    }
                    C3507f it = iterableM19380i.iterator();
                    while (it.f10596o0) {
                        int iMo4199a = it.mo4199a();
                        ConstantValue<?> constantValue2 = arrayValue.getValue().get(iMo4199a);
                        ProtoBuf.Annotation.Argument.Value arrayElement = value.getArrayElement(iMo4199a);
                        AbstractC16544l.m18093f(arrayElement, "getArrayElement(...)");
                        if (!m18368a(constantValue2, arrayElementTypeOrNull, arrayElement)) {
                        }
                    }
                    return true;
                }
            }
            throw new IllegalStateException(("Deserialized ArrayValue should have the same number of elements as the original array value: " + constantValue).toString());
        }
        ClassifierDescriptor classifierDescriptorMo22589getDeclarationDescriptor = kotlinType.getConstructor().mo22589getDeclarationDescriptor();
        ClassDescriptor classDescriptor = classifierDescriptorMo22589getDeclarationDescriptor instanceof ClassDescriptor ? (ClassDescriptor) classifierDescriptorMo22589getDeclarationDescriptor : null;
        if (classDescriptor == null || KotlinBuiltIns.isKClass(classDescriptor)) {
            return true;
        }
        return false;
    }

    public final AnnotationDescriptor deserializeAnnotation(ProtoBuf.Annotation proto, NameResolver nameResolver) {
        AbstractC16544l.m18094g(proto, "proto");
        AbstractC16544l.m18094g(nameResolver, "nameResolver");
        ClassDescriptor classDescriptorFindNonGenericClassAcrossDependencies = FindClassInModuleKt.findNonGenericClassAcrossDependencies(this.f52983a, NameResolverUtilKt.getClassId(nameResolver, proto.getId()), this.f52984b);
        Map mapM19253o = C17690x.f56481Y;
        if (proto.getArgumentCount() != 0 && !ErrorUtils.isError(classDescriptorFindNonGenericClassAcrossDependencies) && DescriptorUtils.isAnnotationClass(classDescriptorFindNonGenericClassAcrossDependencies)) {
            Collection<ClassConstructorDescriptor> constructors = classDescriptorFindNonGenericClassAcrossDependencies.getConstructors();
            AbstractC16544l.m18093f(constructors, "getConstructors(...)");
            ClassConstructorDescriptor classConstructorDescriptor = (ClassConstructorDescriptor) AbstractC17680n.m19366p0(constructors);
            if (classConstructorDescriptor != null) {
                List<ValueParameterDescriptor> valueParameters = classConstructorDescriptor.getValueParameters();
                AbstractC16544l.m18093f(valueParameters, "getValueParameters(...)");
                List<ValueParameterDescriptor> list = valueParameters;
                int iM19257b = AbstractC17660E.m19257b(AbstractC17682p.m19389r(list, 10));
                if (iM19257b < 16) {
                    iM19257b = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iM19257b);
                for (Object obj : list) {
                    linkedHashMap.put(((ValueParameterDescriptor) obj).getName(), obj);
                }
                List<ProtoBuf.Annotation.Argument> argumentList = proto.getArgumentList();
                AbstractC16544l.m18093f(argumentList, "getArgumentList(...)");
                ArrayList arrayList = new ArrayList();
                for (ProtoBuf.Annotation.Argument argument : argumentList) {
                    AbstractC16544l.m18091d(argument);
                    ValueParameterDescriptor valueParameterDescriptor = (ValueParameterDescriptor) linkedHashMap.get(NameResolverUtilKt.getName(nameResolver, argument.getNameId()));
                    Object c17309l = null;
                    if (valueParameterDescriptor != null) {
                        Name name = NameResolverUtilKt.getName(nameResolver, argument.getNameId());
                        KotlinType type = valueParameterDescriptor.getType();
                        AbstractC16544l.m18093f(type, "getType(...)");
                        ProtoBuf.Annotation.Argument.Value value = argument.getValue();
                        AbstractC16544l.m18093f(value, "getValue(...)");
                        ConstantValue<?> constantValueResolveValue = resolveValue(type, value, nameResolver);
                        c17309l = m18368a(constantValueResolveValue, type, value) ? constantValueResolveValue : null;
                        if (c17309l == null) {
                            c17309l = ErrorValue.Companion.create("Unexpected argument value: actual type " + value.getType() + " != expected type " + type);
                        }
                        c17309l = new C17309l(name, c17309l);
                    }
                    if (c17309l != null) {
                        arrayList.add(c17309l);
                    }
                }
                mapM19253o = AbstractC17659D.m19253o(arrayList);
            }
        }
        return new AnnotationDescriptorImpl(classDescriptorFindNonGenericClassAcrossDependencies.getDefaultType(), mapM19253o, SourceElement.NO_SOURCE);
    }

    public final ConstantValue<?> resolveValue(KotlinType expectedType, ProtoBuf.Annotation.Argument.Value value, NameResolver nameResolver) {
        ConstantValue<?> uByteValue;
        AbstractC16544l.m18094g(expectedType, "expectedType");
        AbstractC16544l.m18094g(value, "value");
        AbstractC16544l.m18094g(nameResolver, "nameResolver");
        Boolean bool = Flags.IS_UNSIGNED.get(value.getFlags());
        AbstractC16544l.m18093f(bool, "get(...)");
        boolean zBooleanValue = bool.booleanValue();
        ProtoBuf.Annotation.Argument.Value.Type type = value.getType();
        switch (type == null ? -1 : WhenMappings.$EnumSwitchMapping$0[type.ordinal()]) {
            case 1:
                byte intValue = (byte) value.getIntValue();
                uByteValue = zBooleanValue ? new UByteValue(intValue) : new ByteValue(intValue);
                break;
            case 2:
                return new CharValue((char) value.getIntValue());
            case 3:
                short intValue2 = (short) value.getIntValue();
                uByteValue = zBooleanValue ? new UShortValue(intValue2) : new ShortValue(intValue2);
                break;
            case 4:
                int intValue3 = (int) value.getIntValue();
                uByteValue = zBooleanValue ? new UIntValue(intValue3) : new IntValue(intValue3);
                break;
            case 5:
                long intValue4 = value.getIntValue();
                return zBooleanValue ? new ULongValue(intValue4) : new LongValue(intValue4);
            case 6:
                return new FloatValue(value.getFloatValue());
            case 7:
                return new DoubleValue(value.getDoubleValue());
            case 8:
                return new BooleanValue(value.getIntValue() != 0);
            case 9:
                return new StringValue(nameResolver.getString(value.getStringValue()));
            case 10:
                return new KClassValue(NameResolverUtilKt.getClassId(nameResolver, value.getClassId()), value.getArrayDimensionCount());
            case 11:
                return new EnumValue(NameResolverUtilKt.getClassId(nameResolver, value.getClassId()), NameResolverUtilKt.getName(nameResolver, value.getEnumValueId()));
            case 12:
                ProtoBuf.Annotation annotation = value.getAnnotation();
                AbstractC16544l.m18093f(annotation, "getAnnotation(...)");
                return new AnnotationValue(deserializeAnnotation(annotation, nameResolver));
            case 13:
                ConstantValueFactory constantValueFactory = ConstantValueFactory.INSTANCE;
                List<ProtoBuf.Annotation.Argument.Value> arrayElementList = value.getArrayElementList();
                AbstractC16544l.m18093f(arrayElementList, "getArrayElementList(...)");
                List<ProtoBuf.Annotation.Argument.Value> list = arrayElementList;
                ArrayList arrayList = new ArrayList(AbstractC17682p.m19389r(list, 10));
                for (ProtoBuf.Annotation.Argument.Value value2 : list) {
                    SimpleType anyType = this.f52983a.getBuiltIns().getAnyType();
                    AbstractC16544l.m18093f(anyType, "getAnyType(...)");
                    AbstractC16544l.m18091d(value2);
                    arrayList.add(resolveValue(anyType, value2, nameResolver));
                }
                return constantValueFactory.createArrayValue(arrayList, expectedType);
            default:
                throw new IllegalStateException(("Unsupported annotation argument type: " + value.getType() + " (expected " + expectedType + ')').toString());
        }
        return uByteValue;
    }
}
