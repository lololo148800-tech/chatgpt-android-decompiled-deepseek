package kotlin.reflect.jvm.internal.impl.types.error;

import cn.UfGr.EhBykzn;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import p909nm.AbstractC17665J;
import p909nm.C17689w;

/* JADX INFO: loaded from: classes2.dex */
public final class ErrorUtils {
    public static final ErrorUtils INSTANCE = new ErrorUtils();

    /* JADX INFO: renamed from: a */
    public static final ErrorModuleDescriptor f53268a = ErrorModuleDescriptor.INSTANCE;

    /* JADX INFO: renamed from: b */
    public static final ErrorClassDescriptor f53269b;

    /* JADX INFO: renamed from: c */
    public static final ErrorType f53270c;

    /* JADX INFO: renamed from: d */
    public static final ErrorType f53271d;

    /* JADX INFO: renamed from: e */
    public static final Set f53272e;

    static {
        Name nameSpecial = Name.special(String.format(ErrorEntity.ERROR_CLASS.getDebugText(), Arrays.copyOf(new Object[]{"unknown class"}, 1)));
        AbstractC16544l.m18093f(nameSpecial, "special(...)");
        f53269b = new ErrorClassDescriptor(nameSpecial);
        f53270c = createErrorType(ErrorTypeKind.CYCLIC_SUPERTYPES, new String[0]);
        f53271d = createErrorType(ErrorTypeKind.ERROR_PROPERTY_TYPE, new String[0]);
        f53272e = AbstractC17665J.m19268h(new ErrorPropertyDescriptor());
    }

    public static final ErrorScope createErrorScope(ErrorScopeKind kind, String... formatParams) {
        AbstractC16544l.m18094g(kind, "kind");
        AbstractC16544l.m18094g(formatParams, "formatParams");
        return createErrorScope(kind, false, (String[]) Arrays.copyOf(formatParams, formatParams.length));
    }

    public static final ErrorType createErrorType(ErrorTypeKind kind, String... formatParams) {
        AbstractC16544l.m18094g(kind, "kind");
        AbstractC16544l.m18094g(formatParams, "formatParams");
        return INSTANCE.createErrorTypeWithArguments(kind, C17689w.f56480Y, (String[]) Arrays.copyOf(formatParams, formatParams.length));
    }

    public static final boolean isError(DeclarationDescriptor declarationDescriptor) {
        if (declarationDescriptor != null) {
            INSTANCE.getClass();
            if ((declarationDescriptor instanceof ErrorClassDescriptor) || (declarationDescriptor.getContainingDeclaration() instanceof ErrorClassDescriptor) || declarationDescriptor == f53268a) {
                return true;
            }
        }
        return false;
    }

    public static final boolean isUninferredTypeVariable(KotlinType kotlinType) {
        if (kotlinType == null) {
            return false;
        }
        TypeConstructor constructor = kotlinType.getConstructor();
        return (constructor instanceof ErrorTypeConstructor) && ((ErrorTypeConstructor) constructor).getKind() == ErrorTypeKind.UNINFERRED_TYPE_VARIABLE;
    }

    public final ErrorType createErrorTypeWithArguments(ErrorTypeKind kind, List<? extends TypeProjection> arguments, String... formatParams) {
        AbstractC16544l.m18094g(kind, "kind");
        AbstractC16544l.m18094g(arguments, "arguments");
        AbstractC16544l.m18094g(formatParams, "formatParams");
        return createErrorTypeWithArguments(kind, arguments, createErrorTypeConstructor(kind, (String[]) Arrays.copyOf(formatParams, formatParams.length)), (String[]) Arrays.copyOf(formatParams, formatParams.length));
    }

    public final ErrorClassDescriptor getErrorClass() {
        return f53269b;
    }

    public final ModuleDescriptor getErrorModule() {
        return f53268a;
    }

    public final Set<PropertyDescriptor> getErrorPropertyGroup() {
        return f53272e;
    }

    public final KotlinType getErrorPropertyType() {
        return f53271d;
    }

    public final KotlinType getErrorTypeForLoopInSupertypes() {
        return f53270c;
    }

    public final String unresolvedTypeAsItIs(KotlinType type) {
        AbstractC16544l.m18094g(type, "type");
        TypeUtilsKt.isUnresolvedType(type);
        TypeConstructor constructor = type.getConstructor();
        AbstractC16544l.m18092e(constructor, "null cannot be cast to non-null type org.jetbrains.kotlin.types.error.ErrorTypeConstructor");
        return ((ErrorTypeConstructor) constructor).getParam(0);
    }

    public static final ErrorScope createErrorScope(ErrorScopeKind kind, boolean z6, String... formatParams) {
        AbstractC16544l.m18094g(kind, "kind");
        AbstractC16544l.m18094g(formatParams, "formatParams");
        return z6 ? new ThrowingScope(kind, (String[]) Arrays.copyOf(formatParams, formatParams.length)) : new ErrorScope(kind, (String[]) Arrays.copyOf(formatParams, formatParams.length));
    }

    public final ErrorType createErrorType(ErrorTypeKind kind, TypeConstructor typeConstructor, String... formatParams) {
        AbstractC16544l.m18094g(kind, "kind");
        AbstractC16544l.m18094g(typeConstructor, "typeConstructor");
        AbstractC16544l.m18094g(formatParams, "formatParams");
        return createErrorTypeWithArguments(kind, C17689w.f56480Y, typeConstructor, (String[]) Arrays.copyOf(formatParams, formatParams.length));
    }

    public final ErrorTypeConstructor createErrorTypeConstructor(ErrorTypeKind kind, String... strArr) {
        AbstractC16544l.m18094g(kind, "kind");
        AbstractC16544l.m18094g(strArr, EhBykzn.cPempB);
        return new ErrorTypeConstructor(kind, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public final ErrorType createErrorTypeWithArguments(ErrorTypeKind kind, List<? extends TypeProjection> arguments, TypeConstructor typeConstructor, String... formatParams) {
        AbstractC16544l.m18094g(kind, "kind");
        AbstractC16544l.m18094g(arguments, "arguments");
        AbstractC16544l.m18094g(typeConstructor, "typeConstructor");
        AbstractC16544l.m18094g(formatParams, "formatParams");
        return new ErrorType(typeConstructor, createErrorScope(ErrorScopeKind.ERROR_TYPE_SCOPE, typeConstructor.toString()), kind, arguments, false, (String[]) Arrays.copyOf(formatParams, formatParams.length));
    }
}
