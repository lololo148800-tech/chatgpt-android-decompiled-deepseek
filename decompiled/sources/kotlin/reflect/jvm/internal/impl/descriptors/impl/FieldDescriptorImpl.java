package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.descriptors.FieldDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotatedImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;

/* JADX INFO: loaded from: classes2.dex */
public final class FieldDescriptorImpl extends AnnotatedImpl implements FieldDescriptor {

    /* JADX INFO: renamed from: Z */
    public final PropertyDescriptor f51501Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FieldDescriptorImpl(Annotations annotations, PropertyDescriptor correspondingProperty) {
        super(annotations);
        AbstractC16544l.m18094g(annotations, "annotations");
        AbstractC16544l.m18094g(correspondingProperty, "correspondingProperty");
        this.f51501Z = correspondingProperty;
    }
}
