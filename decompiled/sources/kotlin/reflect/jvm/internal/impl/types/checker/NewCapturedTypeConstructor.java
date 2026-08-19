package kotlin.reflect.jvm.internal.impl.types.checker;

import cn.UfGr.EhBykzn;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import mm.EnumC17307j;
import p049Bm.InterfaceC1426a;
import p298Lm.C5150L;
import p436Rm.C6941g;
import p571X9.AbstractC9227W;
import p909nm.C17689w;
import pn.C18515b;

/* JADX INFO: loaded from: classes2.dex */
public final class NewCapturedTypeConstructor implements CapturedTypeConstructor {

    /* JADX INFO: renamed from: a */
    public final TypeProjection f53235a;

    /* JADX INFO: renamed from: b */
    public InterfaceC1426a f53236b;

    /* JADX INFO: renamed from: c */
    public final NewCapturedTypeConstructor f53237c;

    /* JADX INFO: renamed from: d */
    public final TypeParameterDescriptor f53238d;

    /* JADX INFO: renamed from: e */
    public final Object f53239e;

    public NewCapturedTypeConstructor(TypeProjection projection, InterfaceC1426a interfaceC1426a, NewCapturedTypeConstructor newCapturedTypeConstructor, TypeParameterDescriptor typeParameterDescriptor) {
        AbstractC16544l.m18094g(projection, "projection");
        this.f53235a = projection;
        this.f53236b = interfaceC1426a;
        this.f53237c = newCapturedTypeConstructor;
        this.f53238d = typeParameterDescriptor;
        this.f53239e = AbstractC9227W.m9799b(EnumC17307j.f55133Y, new C18515b(this, 3));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!NewCapturedTypeConstructor.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        AbstractC16544l.m18092e(obj, "null cannot be cast to non-null type org.jetbrains.kotlin.types.checker.NewCapturedTypeConstructor");
        NewCapturedTypeConstructor newCapturedTypeConstructor = (NewCapturedTypeConstructor) obj;
        NewCapturedTypeConstructor newCapturedTypeConstructor2 = this.f53237c;
        if (newCapturedTypeConstructor2 == null) {
            newCapturedTypeConstructor2 = this;
        }
        NewCapturedTypeConstructor newCapturedTypeConstructor3 = newCapturedTypeConstructor.f53237c;
        if (newCapturedTypeConstructor3 != null) {
            obj = newCapturedTypeConstructor3;
        }
        return newCapturedTypeConstructor2 == obj;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public KotlinBuiltIns getBuiltIns() {
        KotlinType type = getProjection().getType();
        AbstractC16544l.m18093f(type, "getType(...)");
        return TypeUtilsKt.getBuiltIns(type);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    /* JADX INFO: renamed from: getDeclarationDescriptor */
    public ClassifierDescriptor mo22589getDeclarationDescriptor() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public List<TypeParameterDescriptor> getParameters() {
        return C17689w.f56480Y;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedTypeConstructor
    public TypeProjection getProjection() {
        return this.f53235a;
    }

    public int hashCode() {
        NewCapturedTypeConstructor newCapturedTypeConstructor = this.f53237c;
        return newCapturedTypeConstructor != null ? newCapturedTypeConstructor.hashCode() : super.hashCode();
    }

    public final void initializeSupertypes(List<? extends UnwrappedType> supertypes) {
        AbstractC16544l.m18094g(supertypes, "supertypes");
        this.f53236b = new C6941g(2, supertypes);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public boolean isDenotable() {
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, mm.i] */
    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public List<UnwrappedType> getSupertypes() {
        List<UnwrappedType> list = (List) this.f53239e.getValue();
        return list == null ? C17689w.f56480Y : list;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public NewCapturedTypeConstructor refine(KotlinTypeRefiner kotlinTypeRefiner) {
        AbstractC16544l.m18094g(kotlinTypeRefiner, "kotlinTypeRefiner");
        TypeProjection typeProjectionRefine = getProjection().refine(kotlinTypeRefiner);
        AbstractC16544l.m18093f(typeProjectionRefine, "refine(...)");
        C5150L c5150l = this.f53236b != null ? new C5150L(this, 19, kotlinTypeRefiner) : null;
        NewCapturedTypeConstructor newCapturedTypeConstructor = this.f53237c;
        if (newCapturedTypeConstructor == null) {
            newCapturedTypeConstructor = this;
        }
        return new NewCapturedTypeConstructor(typeProjectionRefine, c5150l, newCapturedTypeConstructor, this.f53238d);
    }

    public String toString() {
        return EhBykzn.VkMUvSFP + getProjection() + ')';
    }

    public /* synthetic */ NewCapturedTypeConstructor(TypeProjection typeProjection, InterfaceC1426a interfaceC1426a, NewCapturedTypeConstructor newCapturedTypeConstructor, TypeParameterDescriptor typeParameterDescriptor, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(typeProjection, (i10 & 2) != 0 ? null : interfaceC1426a, (i10 & 4) != 0 ? null : newCapturedTypeConstructor, (i10 & 8) != 0 ? null : typeParameterDescriptor);
    }

    public /* synthetic */ NewCapturedTypeConstructor(TypeProjection typeProjection, List list, NewCapturedTypeConstructor newCapturedTypeConstructor, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(typeProjection, list, (i10 & 4) != 0 ? null : newCapturedTypeConstructor);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NewCapturedTypeConstructor(TypeProjection projection, List<? extends UnwrappedType> supertypes, NewCapturedTypeConstructor newCapturedTypeConstructor) {
        this(projection, new C6941g(1, supertypes), newCapturedTypeConstructor, null, 8, null);
        AbstractC16544l.m18094g(projection, "projection");
        AbstractC16544l.m18094g(supertypes, "supertypes");
    }
}
