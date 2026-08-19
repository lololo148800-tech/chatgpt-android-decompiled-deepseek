package kotlin.reflect.jvm.internal.impl.resolve.calls.inference;

import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedTypeConstructor;
import p571X9.AbstractC9393x3;
import p909nm.C17689w;

/* JADX INFO: loaded from: classes2.dex */
public final class CapturedTypeConstructorImpl implements CapturedTypeConstructor {

    /* JADX INFO: renamed from: a */
    public final TypeProjection f52872a;

    /* JADX INFO: renamed from: b */
    public NewCapturedTypeConstructor f52873b;

    public CapturedTypeConstructorImpl(TypeProjection projection) {
        AbstractC16544l.m18094g(projection, "projection");
        this.f52872a = projection;
        getProjection().getProjectionKind();
        Variance variance = Variance.INVARIANT;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public KotlinBuiltIns getBuiltIns() {
        KotlinBuiltIns builtIns = getProjection().getType().getConstructor().getBuiltIns();
        AbstractC16544l.m18093f(builtIns, "getBuiltIns(...)");
        return builtIns;
    }

    public Void getDeclarationDescriptor() {
        return null;
    }

    public final NewCapturedTypeConstructor getNewTypeConstructor() {
        return this.f52873b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public List<TypeParameterDescriptor> getParameters() {
        return C17689w.f56480Y;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedTypeConstructor
    public TypeProjection getProjection() {
        return this.f52872a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public Collection<KotlinType> getSupertypes() {
        KotlinType type = getProjection().getProjectionKind() == Variance.OUT_VARIANCE ? getProjection().getType() : getBuiltIns().getNullableAnyType();
        AbstractC16544l.m18091d(type);
        return AbstractC9393x3.m9974d(type);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public boolean isDenotable() {
        return false;
    }

    public final void setNewTypeConstructor(NewCapturedTypeConstructor newCapturedTypeConstructor) {
        this.f52873b = newCapturedTypeConstructor;
    }

    public String toString() {
        return "CapturedTypeConstructor(" + getProjection() + ')';
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    /* JADX INFO: renamed from: getDeclarationDescriptor, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ ClassifierDescriptor mo22589getDeclarationDescriptor() {
        return (ClassifierDescriptor) getDeclarationDescriptor();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public CapturedTypeConstructorImpl refine(KotlinTypeRefiner kotlinTypeRefiner) {
        AbstractC16544l.m18094g(kotlinTypeRefiner, "kotlinTypeRefiner");
        TypeProjection typeProjectionRefine = getProjection().refine(kotlinTypeRefiner);
        AbstractC16544l.m18093f(typeProjectionRefine, "refine(...)");
        return new CapturedTypeConstructorImpl(typeProjectionRefine);
    }
}
