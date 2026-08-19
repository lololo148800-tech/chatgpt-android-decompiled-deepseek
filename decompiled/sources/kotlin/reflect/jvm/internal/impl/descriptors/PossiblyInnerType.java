package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;

/* JADX INFO: loaded from: classes2.dex */
public final class PossiblyInnerType {

    /* JADX INFO: renamed from: a */
    public final ClassifierDescriptorWithTypeParameters f51413a;

    /* JADX INFO: renamed from: b */
    public final List f51414b;

    /* JADX INFO: renamed from: c */
    public final PossiblyInnerType f51415c;

    public PossiblyInnerType(ClassifierDescriptorWithTypeParameters classifierDescriptor, List<? extends TypeProjection> arguments, PossiblyInnerType possiblyInnerType) {
        AbstractC16544l.m18094g(classifierDescriptor, "classifierDescriptor");
        AbstractC16544l.m18094g(arguments, "arguments");
        this.f51413a = classifierDescriptor;
        this.f51414b = arguments;
        this.f51415c = possiblyInnerType;
    }

    public final List<TypeProjection> getArguments() {
        return this.f51414b;
    }

    public final ClassifierDescriptorWithTypeParameters getClassifierDescriptor() {
        return this.f51413a;
    }

    public final PossiblyInnerType getOuterType() {
        return this.f51415c;
    }
}
