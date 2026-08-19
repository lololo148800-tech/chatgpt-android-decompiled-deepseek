package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import mm.EnumC17307j;
import p571X9.AbstractC9227W;
import pn.C18515b;

/* JADX INFO: loaded from: classes2.dex */
public final class StarProjectionImpl extends TypeProjectionBase {

    /* JADX INFO: renamed from: a */
    public final TypeParameterDescriptor f53181a;

    /* JADX INFO: renamed from: b */
    public final Object f53182b;

    public StarProjectionImpl(TypeParameterDescriptor typeParameter) {
        AbstractC16544l.m18094g(typeParameter, "typeParameter");
        this.f53181a = typeParameter;
        this.f53182b = AbstractC9227W.m9799b(EnumC17307j.f55133Y, new C18515b(this, 1));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeProjection
    public Variance getProjectionKind() {
        return Variance.OUT_VARIANCE;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, mm.i] */
    @Override // kotlin.reflect.jvm.internal.impl.types.TypeProjection
    public KotlinType getType() {
        return (KotlinType) this.f53182b.getValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeProjection
    public boolean isStarProjection() {
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeProjection
    public TypeProjection refine(KotlinTypeRefiner kotlinTypeRefiner) {
        AbstractC16544l.m18094g(kotlinTypeRefiner, "kotlinTypeRefiner");
        return this;
    }
}
