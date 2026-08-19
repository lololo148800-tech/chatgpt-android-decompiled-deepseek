package tn;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* JADX INFO: renamed from: tn.b */
/* JADX INFO: loaded from: classes2.dex */
public final class C20009b {

    /* JADX INFO: renamed from: a */
    public final TypeParameterDescriptor f63327a;

    /* JADX INFO: renamed from: b */
    public final KotlinType f63328b;

    /* JADX INFO: renamed from: c */
    public final KotlinType f63329c;

    public C20009b(TypeParameterDescriptor typeParameter, KotlinType inProjection, KotlinType outProjection) {
        AbstractC16544l.m18094g(typeParameter, "typeParameter");
        AbstractC16544l.m18094g(inProjection, "inProjection");
        AbstractC16544l.m18094g(outProjection, "outProjection");
        this.f63327a = typeParameter;
        this.f63328b = inProjection;
        this.f63329c = outProjection;
    }
}
