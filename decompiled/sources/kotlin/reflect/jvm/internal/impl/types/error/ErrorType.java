package kotlin.reflect.jvm.internal.impl.types.error;

import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributes;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import p909nm.C17689w;

/* JADX INFO: loaded from: classes2.dex */
public final class ErrorType extends SimpleType {

    /* JADX INFO: renamed from: Z */
    public final TypeConstructor f53255Z;

    /* JADX INFO: renamed from: o0 */
    public final MemberScope f53256o0;

    /* JADX INFO: renamed from: p0 */
    public final ErrorTypeKind f53257p0;

    /* JADX INFO: renamed from: q0 */
    public final List f53258q0;

    /* JADX INFO: renamed from: r0 */
    public final boolean f53259r0;

    /* JADX INFO: renamed from: s0 */
    public final String[] f53260s0;

    /* JADX INFO: renamed from: t0 */
    public final String f53261t0;

    public /* synthetic */ ErrorType(TypeConstructor typeConstructor, MemberScope memberScope, ErrorTypeKind errorTypeKind, List list, boolean z6, String[] strArr, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(typeConstructor, memberScope, errorTypeKind, (i10 & 8) != 0 ? C17689w.f56480Y : list, (i10 & 16) != 0 ? false : z6, strArr);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public List<TypeProjection> getArguments() {
        return this.f53258q0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public TypeAttributes getAttributes() {
        return TypeAttributes.Companion.getEmpty();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public TypeConstructor getConstructor() {
        return this.f53255Z;
    }

    public final String getDebugMessage() {
        return this.f53261t0;
    }

    public final ErrorTypeKind getKind() {
        return this.f53257p0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public MemberScope getMemberScope() {
        return this.f53256o0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public boolean isMarkedNullable() {
        return this.f53259r0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType, kotlin.reflect.jvm.internal.impl.types.KotlinType
    public ErrorType refine(KotlinTypeRefiner kotlinTypeRefiner) {
        AbstractC16544l.m18094g(kotlinTypeRefiner, "kotlinTypeRefiner");
        return this;
    }

    public final ErrorType replaceArguments(List<? extends TypeProjection> newArguments) {
        AbstractC16544l.m18094g(newArguments, "newArguments");
        TypeConstructor constructor = getConstructor();
        MemberScope memberScope = getMemberScope();
        boolean zIsMarkedNullable = isMarkedNullable();
        String[] strArr = this.f53260s0;
        return new ErrorType(constructor, memberScope, this.f53257p0, newArguments, zIsMarkedNullable, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.SimpleType, kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    public SimpleType replaceAttributes(TypeAttributes newAttributes) {
        AbstractC16544l.m18094g(newAttributes, "newAttributes");
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.SimpleType, kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    public SimpleType makeNullableAsSpecified(boolean z6) {
        TypeConstructor constructor = getConstructor();
        MemberScope memberScope = getMemberScope();
        List<TypeProjection> arguments = getArguments();
        String[] strArr = this.f53260s0;
        return new ErrorType(constructor, memberScope, this.f53257p0, arguments, z6, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public ErrorType(TypeConstructor constructor, MemberScope memberScope, ErrorTypeKind kind, List<? extends TypeProjection> arguments, boolean z6, String... formatParams) {
        AbstractC16544l.m18094g(constructor, "constructor");
        AbstractC16544l.m18094g(memberScope, "memberScope");
        AbstractC16544l.m18094g(kind, "kind");
        AbstractC16544l.m18094g(arguments, "arguments");
        AbstractC16544l.m18094g(formatParams, "formatParams");
        this.f53255Z = constructor;
        this.f53256o0 = memberScope;
        this.f53257p0 = kind;
        this.f53258q0 = arguments;
        this.f53259r0 = z6;
        this.f53260s0 = formatParams;
        String debugMessage = kind.getDebugMessage();
        Object[] objArrCopyOf = Arrays.copyOf(formatParams, formatParams.length);
        this.f53261t0 = String.format(debugMessage, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
    }
}
