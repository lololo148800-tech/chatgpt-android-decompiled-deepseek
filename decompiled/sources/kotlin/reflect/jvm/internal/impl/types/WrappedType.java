package kotlin.reflect.jvm.internal.impl.types;

import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;

/* JADX INFO: loaded from: classes2.dex */
public abstract class WrappedType extends KotlinType {
    public WrappedType() {
        super(null);
    }

    /* JADX INFO: renamed from: a */
    public abstract KotlinType mo18417a();

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public List<TypeProjection> getArguments() {
        return mo18417a().getArguments();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public TypeAttributes getAttributes() {
        return mo18417a().getAttributes();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public TypeConstructor getConstructor() {
        return mo18417a().getConstructor();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public MemberScope getMemberScope() {
        return mo18417a().getMemberScope();
    }

    public boolean isComputed() {
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public boolean isMarkedNullable() {
        return mo18417a().isMarkedNullable();
    }

    public String toString() {
        return isComputed() ? mo18417a().toString() : "<Not computed yet>";
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public final UnwrappedType unwrap() {
        KotlinType kotlinTypeMo18417a = mo18417a();
        while (kotlinTypeMo18417a instanceof WrappedType) {
            kotlinTypeMo18417a = ((WrappedType) kotlinTypeMo18417a).mo18417a();
        }
        AbstractC16544l.m18092e(kotlinTypeMo18417a, "null cannot be cast to non-null type org.jetbrains.kotlin.types.UnwrappedType");
        return (UnwrappedType) kotlinTypeMo18417a;
    }
}
