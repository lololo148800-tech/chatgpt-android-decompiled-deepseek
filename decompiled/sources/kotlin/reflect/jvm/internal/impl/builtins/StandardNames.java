package kotlin.reflect.jvm.internal.impl.builtins;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionTypeKind;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.utils.CollectionsKt;
import p046Bk.p047Ep.QzvfuIgrngtl;
import p211I8.lPE.sRXLFOsOgS;
import p909nm.AbstractC17678l;
import p909nm.AbstractC17681o;

/* JADX INFO: loaded from: classes2.dex */
public final class StandardNames {
    public static final FqName ANNOTATION_PACKAGE_FQ_NAME;
    public static final Name BACKING_FIELD;
    public static final FqName BUILT_INS_PACKAGE_FQ_NAME;
    public static final Set<FqName> BUILT_INS_PACKAGE_FQ_NAMES;
    public static final Name BUILT_INS_PACKAGE_NAME;
    public static final Name CHAR_CODE;
    public static final FqName COLLECTIONS_PACKAGE_FQ_NAME;
    public static final Name CONTEXT_FUNCTION_TYPE_PARAMETER_COUNT_NAME;
    public static final FqName CONTINUATION_INTERFACE_FQ_NAME;
    public static final FqName COROUTINES_INTRINSICS_PACKAGE_FQ_NAME;
    public static final FqName COROUTINES_JVM_INTERNAL_PACKAGE_FQ_NAME;
    public static final FqName COROUTINES_PACKAGE_FQ_NAME;
    public static final String DATA_CLASS_COMPONENT_PREFIX;
    public static final Name DATA_CLASS_COPY;
    public static final Name DEFAULT_VALUE_PARAMETER;
    public static final FqName DYNAMIC_FQ_NAME;
    public static final Name ENUM_ENTRIES;
    public static final Name ENUM_VALUES;
    public static final Name ENUM_VALUE_OF;
    public static final Name EQUALS_NAME;
    public static final Name HASHCODE_NAME;
    public static final Name IMPLICIT_LAMBDA_PARAMETER_NAME;
    public static final StandardNames INSTANCE = new StandardNames();
    public static final FqName KOTLIN_INTERNAL_FQ_NAME;
    public static final FqName KOTLIN_REFLECT_FQ_NAME;
    public static final Name MAIN;
    public static final Name NAME;
    public static final Name NEXT_CHAR;
    public static final List<String> PREFIXES;
    public static final FqName RANGES_PACKAGE_FQ_NAME;
    public static final FqName RESULT_FQ_NAME;
    public static final FqName TEXT_PACKAGE_FQ_NAME;
    public static final Name TO_STRING_NAME;

    public static final class FqNames {
        public static final FqName accessibleLateinitPropertyLiteral;
        public static final FqName annotation;
        public static final FqName annotationRetention;
        public static final FqName annotationTarget;
        public static final Map<FqNameUnsafe, PrimitiveType> arrayClassFqNameToPrimitiveType;
        public static final FqName collection;
        public static final FqName contextFunctionTypeParams;
        public static final FqName deprecated;
        public static final FqName deprecatedSinceKotlin;
        public static final FqName deprecationLevel;
        public static final FqName extensionFunctionType;
        public static final FqNameUnsafe findAssociatedObject;
        public static final Map<FqNameUnsafe, PrimitiveType> fqNameToPrimitiveType;
        public static final FqNameUnsafe intRange;
        public static final FqName iterable;
        public static final FqName iterator;
        public static final FqNameUnsafe kCallable;
        public static final FqNameUnsafe kClass;
        public static final FqNameUnsafe kDeclarationContainer;
        public static final FqNameUnsafe kMutableProperty0;
        public static final FqNameUnsafe kMutableProperty1;
        public static final FqNameUnsafe kMutableProperty2;
        public static final FqNameUnsafe kMutablePropertyFqName;
        public static final ClassId kProperty;
        public static final FqNameUnsafe kProperty0;
        public static final FqNameUnsafe kProperty1;
        public static final FqNameUnsafe kProperty2;
        public static final FqNameUnsafe kPropertyFqName;
        public static final FqNameUnsafe kType;
        public static final FqName list;
        public static final FqName listIterator;
        public static final FqNameUnsafe longRange;
        public static final FqName map;
        public static final FqName mapEntry;
        public static final FqName mustBeDocumented;
        public static final FqName mutableCollection;
        public static final FqName mutableIterable;
        public static final FqName mutableIterator;
        public static final FqName mutableList;
        public static final FqName mutableListIterator;
        public static final FqName mutableMap;
        public static final FqName mutableMapEntry;
        public static final FqName mutableSet;
        public static final FqName parameterName;
        public static final ClassId parameterNameClassId;
        public static final FqName platformDependent;
        public static final ClassId platformDependentClassId;
        public static final Set<Name> primitiveArrayTypeShortNames;
        public static final Set<Name> primitiveTypeShortNames;
        public static final FqName publishedApi;
        public static final FqName repeatable;
        public static final ClassId repeatableClassId;
        public static final FqName replaceWith;
        public static final FqName retention;
        public static final ClassId retentionClassId;
        public static final FqName set;
        public static final FqName target;
        public static final ClassId targetClassId;
        public static final ClassId uByte;
        public static final FqName uByteArrayFqName;
        public static final FqName uByteFqName;
        public static final ClassId uInt;
        public static final FqName uIntArrayFqName;
        public static final FqName uIntFqName;
        public static final ClassId uLong;
        public static final FqName uLongArrayFqName;
        public static final FqName uLongFqName;
        public static final ClassId uShort;
        public static final FqName uShortArrayFqName;
        public static final FqName uShortFqName;
        public static final FqName unsafeVariance;
        public static final FqNames INSTANCE = new FqNames();
        public static final FqNameUnsafe any = m18115d("Any");
        public static final FqNameUnsafe nothing = m18115d("Nothing");
        public static final FqNameUnsafe cloneable = m18115d("Cloneable");
        public static final FqName suppress = m18114c("Suppress");
        public static final FqNameUnsafe unit = m18115d("Unit");
        public static final FqNameUnsafe charSequence = m18115d("CharSequence");
        public static final FqNameUnsafe string = m18115d("String");
        public static final FqNameUnsafe array = m18115d("Array");
        public static final FqNameUnsafe _boolean = m18115d("Boolean");
        public static final FqNameUnsafe _char = m18115d("Char");
        public static final FqNameUnsafe _byte = m18115d("Byte");
        public static final FqNameUnsafe _short = m18115d("Short");
        public static final FqNameUnsafe _int = m18115d("Int");
        public static final FqNameUnsafe _long = m18115d("Long");
        public static final FqNameUnsafe _float = m18115d("Float");
        public static final FqNameUnsafe _double = m18115d("Double");
        public static final FqNameUnsafe number = m18115d("Number");
        public static final FqNameUnsafe _enum = m18115d("Enum");
        public static final FqNameUnsafe functionSupertype = m18115d("Function");
        public static final FqName throwable = m18114c("Throwable");
        public static final FqName comparable = m18114c("Comparable");

        /* JADX INFO: renamed from: b */
        public static FqName m18113b(String str) {
            FqName fqName = StandardNames.COLLECTIONS_PACKAGE_FQ_NAME;
            Name nameIdentifier = Name.identifier(str);
            AbstractC16544l.m18093f(nameIdentifier, "identifier(...)");
            return fqName.child(nameIdentifier);
        }

        /* JADX INFO: renamed from: c */
        public static FqName m18114c(String str) {
            FqName fqName = StandardNames.BUILT_INS_PACKAGE_FQ_NAME;
            Name nameIdentifier = Name.identifier(str);
            AbstractC16544l.m18093f(nameIdentifier, "identifier(...)");
            return fqName.child(nameIdentifier);
        }

        /* JADX INFO: renamed from: d */
        public static FqNameUnsafe m18115d(String str) {
            return m18114c(str).toUnsafe();
        }

        public static final FqNameUnsafe reflect(String simpleName) {
            AbstractC16544l.m18094g(simpleName, "simpleName");
            FqName fqName = StandardNames.KOTLIN_REFLECT_FQ_NAME;
            Name nameIdentifier = Name.identifier(simpleName);
            AbstractC16544l.m18093f(nameIdentifier, "identifier(...)");
            return fqName.child(nameIdentifier).toUnsafe();
        }

        static {
            FqName fqName = StandardNames.RANGES_PACKAGE_FQ_NAME;
            Name nameIdentifier = Name.identifier("IntRange");
            AbstractC16544l.m18093f(nameIdentifier, "identifier(...)");
            intRange = fqName.child(nameIdentifier).toUnsafe();
            Name nameIdentifier2 = Name.identifier("LongRange");
            AbstractC16544l.m18093f(nameIdentifier2, "identifier(...)");
            longRange = fqName.child(nameIdentifier2).toUnsafe();
            deprecated = m18114c("Deprecated");
            deprecatedSinceKotlin = m18114c("DeprecatedSinceKotlin");
            deprecationLevel = m18114c("DeprecationLevel");
            replaceWith = m18114c("ReplaceWith");
            extensionFunctionType = m18114c("ExtensionFunctionType");
            contextFunctionTypeParams = m18114c("ContextFunctionTypeParams");
            FqName fqNameM18114c = m18114c("ParameterName");
            parameterName = fqNameM18114c;
            ClassId.Companion companion = ClassId.Companion;
            parameterNameClassId = companion.topLevel(fqNameM18114c);
            annotation = m18114c("Annotation");
            FqName fqNameM18112a = m18112a("Target");
            target = fqNameM18112a;
            targetClassId = companion.topLevel(fqNameM18112a);
            annotationTarget = m18112a("AnnotationTarget");
            annotationRetention = m18112a("AnnotationRetention");
            FqName fqNameM18112a2 = m18112a("Retention");
            retention = fqNameM18112a2;
            retentionClassId = companion.topLevel(fqNameM18112a2);
            FqName fqNameM18112a3 = m18112a("Repeatable");
            repeatable = fqNameM18112a3;
            repeatableClassId = companion.topLevel(fqNameM18112a3);
            mustBeDocumented = m18112a("MustBeDocumented");
            unsafeVariance = m18114c("UnsafeVariance");
            publishedApi = m18114c("PublishedApi");
            FqName fqName2 = StandardNames.KOTLIN_INTERNAL_FQ_NAME;
            Name nameIdentifier3 = Name.identifier("AccessibleLateinitPropertyLiteral");
            AbstractC16544l.m18093f(nameIdentifier3, "identifier(...)");
            accessibleLateinitPropertyLiteral = fqName2.child(nameIdentifier3);
            FqName fqName3 = new FqName("kotlin.internal.PlatformDependent");
            platformDependent = fqName3;
            platformDependentClassId = companion.topLevel(fqName3);
            iterator = m18113b("Iterator");
            iterable = m18113b("Iterable");
            collection = m18113b("Collection");
            list = m18113b("List");
            listIterator = m18113b("ListIterator");
            set = m18113b("Set");
            FqName fqNameM18113b = m18113b("Map");
            map = fqNameM18113b;
            Name nameIdentifier4 = Name.identifier("Entry");
            AbstractC16544l.m18093f(nameIdentifier4, "identifier(...)");
            mapEntry = fqNameM18113b.child(nameIdentifier4);
            mutableIterator = m18113b("MutableIterator");
            mutableIterable = m18113b("MutableIterable");
            mutableCollection = m18113b("MutableCollection");
            mutableList = m18113b("MutableList");
            mutableListIterator = m18113b("MutableListIterator");
            mutableSet = m18113b("MutableSet");
            FqName fqNameM18113b2 = m18113b("MutableMap");
            mutableMap = fqNameM18113b2;
            Name nameIdentifier5 = Name.identifier("MutableEntry");
            AbstractC16544l.m18093f(nameIdentifier5, "identifier(...)");
            mutableMapEntry = fqNameM18113b2.child(nameIdentifier5);
            kClass = reflect("KClass");
            kType = reflect("KType");
            kCallable = reflect("KCallable");
            kProperty0 = reflect("KProperty0");
            kProperty1 = reflect(sRXLFOsOgS.UPbm);
            kProperty2 = reflect("KProperty2");
            kMutableProperty0 = reflect("KMutableProperty0");
            kMutableProperty1 = reflect("KMutableProperty1");
            kMutableProperty2 = reflect("KMutableProperty2");
            FqNameUnsafe fqNameUnsafeReflect = reflect("KProperty");
            kPropertyFqName = fqNameUnsafeReflect;
            kMutablePropertyFqName = reflect("KMutableProperty");
            kProperty = companion.topLevel(fqNameUnsafeReflect.toSafe());
            kDeclarationContainer = reflect("KDeclarationContainer");
            findAssociatedObject = reflect("findAssociatedObject");
            FqName fqNameM18114c2 = m18114c("UByte");
            uByteFqName = fqNameM18114c2;
            FqName fqNameM18114c3 = m18114c("UShort");
            uShortFqName = fqNameM18114c3;
            FqName fqNameM18114c4 = m18114c("UInt");
            uIntFqName = fqNameM18114c4;
            FqName fqNameM18114c5 = m18114c("ULong");
            uLongFqName = fqNameM18114c5;
            uByte = companion.topLevel(fqNameM18114c2);
            uShort = companion.topLevel(fqNameM18114c3);
            uInt = companion.topLevel(fqNameM18114c4);
            uLong = companion.topLevel(fqNameM18114c5);
            uByteArrayFqName = m18114c("UByteArray");
            uShortArrayFqName = m18114c("UShortArray");
            uIntArrayFqName = m18114c("UIntArray");
            uLongArrayFqName = m18114c("ULongArray");
            HashSet hashSetNewHashSetWithExpectedSize = CollectionsKt.newHashSetWithExpectedSize(PrimitiveType.values().length);
            for (PrimitiveType primitiveType : PrimitiveType.values()) {
                hashSetNewHashSetWithExpectedSize.add(primitiveType.getTypeName());
            }
            primitiveTypeShortNames = hashSetNewHashSetWithExpectedSize;
            HashSet hashSetNewHashSetWithExpectedSize2 = CollectionsKt.newHashSetWithExpectedSize(PrimitiveType.values().length);
            for (PrimitiveType primitiveType2 : PrimitiveType.values()) {
                hashSetNewHashSetWithExpectedSize2.add(primitiveType2.getArrayTypeName());
            }
            primitiveArrayTypeShortNames = hashSetNewHashSetWithExpectedSize2;
            HashMap mapNewHashMapWithExpectedSize = CollectionsKt.newHashMapWithExpectedSize(PrimitiveType.values().length);
            for (PrimitiveType primitiveType3 : PrimitiveType.values()) {
                FqNames fqNames = INSTANCE;
                String strAsString = primitiveType3.getTypeName().asString();
                AbstractC16544l.m18093f(strAsString, "asString(...)");
                fqNames.getClass();
                mapNewHashMapWithExpectedSize.put(m18115d(strAsString), primitiveType3);
            }
            fqNameToPrimitiveType = mapNewHashMapWithExpectedSize;
            HashMap mapNewHashMapWithExpectedSize2 = CollectionsKt.newHashMapWithExpectedSize(PrimitiveType.values().length);
            for (PrimitiveType primitiveType4 : PrimitiveType.values()) {
                FqNames fqNames2 = INSTANCE;
                String strAsString2 = primitiveType4.getArrayTypeName().asString();
                AbstractC16544l.m18093f(strAsString2, "asString(...)");
                fqNames2.getClass();
                mapNewHashMapWithExpectedSize2.put(m18115d(strAsString2), primitiveType4);
            }
            arrayClassFqNameToPrimitiveType = mapNewHashMapWithExpectedSize2;
        }

        /* JADX INFO: renamed from: a */
        public static FqName m18112a(String str) {
            FqName fqName = StandardNames.ANNOTATION_PACKAGE_FQ_NAME;
            Name nameIdentifier = Name.identifier(str);
            AbstractC16544l.m18093f(nameIdentifier, QzvfuIgrngtl.CazFW);
            return fqName.child(nameIdentifier);
        }
    }

    static {
        Name nameIdentifier = Name.identifier("field");
        AbstractC16544l.m18093f(nameIdentifier, "identifier(...)");
        BACKING_FIELD = nameIdentifier;
        Name nameIdentifier2 = Name.identifier("value");
        AbstractC16544l.m18093f(nameIdentifier2, "identifier(...)");
        DEFAULT_VALUE_PARAMETER = nameIdentifier2;
        Name nameIdentifier3 = Name.identifier("values");
        AbstractC16544l.m18093f(nameIdentifier3, "identifier(...)");
        ENUM_VALUES = nameIdentifier3;
        Name nameIdentifier4 = Name.identifier("entries");
        AbstractC16544l.m18093f(nameIdentifier4, "identifier(...)");
        ENUM_ENTRIES = nameIdentifier4;
        Name nameIdentifier5 = Name.identifier("valueOf");
        AbstractC16544l.m18093f(nameIdentifier5, "identifier(...)");
        ENUM_VALUE_OF = nameIdentifier5;
        Name nameIdentifier6 = Name.identifier("copy");
        AbstractC16544l.m18093f(nameIdentifier6, "identifier(...)");
        DATA_CLASS_COPY = nameIdentifier6;
        DATA_CLASS_COMPONENT_PREFIX = "component";
        Name nameIdentifier7 = Name.identifier("hashCode");
        AbstractC16544l.m18093f(nameIdentifier7, "identifier(...)");
        HASHCODE_NAME = nameIdentifier7;
        Name nameIdentifier8 = Name.identifier("toString");
        AbstractC16544l.m18093f(nameIdentifier8, "identifier(...)");
        TO_STRING_NAME = nameIdentifier8;
        Name nameIdentifier9 = Name.identifier("equals");
        AbstractC16544l.m18093f(nameIdentifier9, "identifier(...)");
        EQUALS_NAME = nameIdentifier9;
        Name nameIdentifier10 = Name.identifier("code");
        AbstractC16544l.m18093f(nameIdentifier10, "identifier(...)");
        CHAR_CODE = nameIdentifier10;
        Name nameIdentifier11 = Name.identifier(DiagnosticsEntry.NAME_KEY);
        AbstractC16544l.m18093f(nameIdentifier11, "identifier(...)");
        NAME = nameIdentifier11;
        Name nameIdentifier12 = Name.identifier("main");
        AbstractC16544l.m18093f(nameIdentifier12, "identifier(...)");
        MAIN = nameIdentifier12;
        Name nameIdentifier13 = Name.identifier("nextChar");
        AbstractC16544l.m18093f(nameIdentifier13, "identifier(...)");
        NEXT_CHAR = nameIdentifier13;
        Name nameIdentifier14 = Name.identifier("it");
        AbstractC16544l.m18093f(nameIdentifier14, "identifier(...)");
        IMPLICIT_LAMBDA_PARAMETER_NAME = nameIdentifier14;
        Name nameIdentifier15 = Name.identifier("count");
        AbstractC16544l.m18093f(nameIdentifier15, "identifier(...)");
        CONTEXT_FUNCTION_TYPE_PARAMETER_COUNT_NAME = nameIdentifier15;
        DYNAMIC_FQ_NAME = new FqName("<dynamic>");
        FqName fqName = new FqName("kotlin.coroutines");
        COROUTINES_PACKAGE_FQ_NAME = fqName;
        COROUTINES_JVM_INTERNAL_PACKAGE_FQ_NAME = new FqName("kotlin.coroutines.jvm.internal");
        COROUTINES_INTRINSICS_PACKAGE_FQ_NAME = new FqName("kotlin.coroutines.intrinsics");
        Name nameIdentifier16 = Name.identifier("Continuation");
        AbstractC16544l.m18093f(nameIdentifier16, "identifier(...)");
        CONTINUATION_INTERFACE_FQ_NAME = fqName.child(nameIdentifier16);
        RESULT_FQ_NAME = new FqName("kotlin.Result");
        FqName fqName2 = new FqName("kotlin.reflect");
        KOTLIN_REFLECT_FQ_NAME = fqName2;
        PREFIXES = AbstractC17681o.m19382k("KProperty", "KMutableProperty", "KFunction", "KSuspendFunction");
        Name nameIdentifier17 = Name.identifier("kotlin");
        AbstractC16544l.m18093f(nameIdentifier17, "identifier(...)");
        BUILT_INS_PACKAGE_NAME = nameIdentifier17;
        FqName fqName3 = FqName.Companion.topLevel(nameIdentifier17);
        BUILT_INS_PACKAGE_FQ_NAME = fqName3;
        Name nameIdentifier18 = Name.identifier("annotation");
        AbstractC16544l.m18093f(nameIdentifier18, "identifier(...)");
        FqName fqNameChild = fqName3.child(nameIdentifier18);
        ANNOTATION_PACKAGE_FQ_NAME = fqNameChild;
        Name nameIdentifier19 = Name.identifier("collections");
        AbstractC16544l.m18093f(nameIdentifier19, "identifier(...)");
        FqName fqNameChild2 = fqName3.child(nameIdentifier19);
        COLLECTIONS_PACKAGE_FQ_NAME = fqNameChild2;
        Name nameIdentifier20 = Name.identifier("ranges");
        AbstractC16544l.m18093f(nameIdentifier20, "identifier(...)");
        FqName fqNameChild3 = fqName3.child(nameIdentifier20);
        RANGES_PACKAGE_FQ_NAME = fqNameChild3;
        Name nameIdentifier21 = Name.identifier("text");
        AbstractC16544l.m18093f(nameIdentifier21, "identifier(...)");
        TEXT_PACKAGE_FQ_NAME = fqName3.child(nameIdentifier21);
        Name nameIdentifier22 = Name.identifier("internal");
        AbstractC16544l.m18093f(nameIdentifier22, "identifier(...)");
        FqName fqNameChild4 = fqName3.child(nameIdentifier22);
        KOTLIN_INTERNAL_FQ_NAME = fqNameChild4;
        new FqName("error.NonExistentClass");
        BUILT_INS_PACKAGE_FQ_NAMES = AbstractC17678l.m19293P(new FqName[]{fqName3, fqNameChild2, fqNameChild3, fqNameChild, fqName2, fqNameChild4, fqName});
    }

    public static final ClassId getFunctionClassId(int i10) {
        FqName fqName = BUILT_INS_PACKAGE_FQ_NAME;
        Name nameIdentifier = Name.identifier(getFunctionName(i10));
        AbstractC16544l.m18093f(nameIdentifier, "identifier(...)");
        return new ClassId(fqName, nameIdentifier);
    }

    public static final String getFunctionName(int i10) {
        return AbstractC10763a.m11048f(i10, "Function");
    }

    public static final FqName getPrimitiveFqName(PrimitiveType primitiveType) {
        AbstractC16544l.m18094g(primitiveType, "primitiveType");
        return BUILT_INS_PACKAGE_FQ_NAME.child(primitiveType.getTypeName());
    }

    public static final String getSuspendFunctionName(int i10) {
        return FunctionTypeKind.SuspendFunction.INSTANCE.getClassNamePrefix() + i10;
    }

    public static final boolean isPrimitiveArray(FqNameUnsafe arrayFqName) {
        AbstractC16544l.m18094g(arrayFqName, "arrayFqName");
        return FqNames.arrayClassFqNameToPrimitiveType.get(arrayFqName) != null;
    }
}
