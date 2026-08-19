package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ArrayValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.EnumValue;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import p571X9.AbstractC9393x3;
import p909nm.AbstractC17686t;
import p909nm.C17689w;

/* JADX INFO: loaded from: classes2.dex */
public final class AnnotationTypeQualifierResolver extends AbstractAnnotationTypeQualifierResolver<AnnotationDescriptor> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnnotationTypeQualifierResolver(JavaTypeEnhancementState javaTypeEnhancementState) {
        super(javaTypeEnhancementState);
        AbstractC16544l.m18094g(javaTypeEnhancementState, "javaTypeEnhancementState");
    }

    /* JADX INFO: renamed from: f */
    public static List m18168f(ConstantValue constantValue) {
        if (!(constantValue instanceof ArrayValue)) {
            return constantValue instanceof EnumValue ? AbstractC9393x3.m9974d(((EnumValue) constantValue).getEnumEntryName().getIdentifier()) : C17689w.f56480Y;
        }
        List<? extends ConstantValue<?>> value = ((ArrayValue) constantValue).getValue();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = value.iterator();
        while (it.hasNext()) {
            AbstractC17686t.m19398v(m18168f((ConstantValue) it.next()), arrayList);
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.AbstractAnnotationTypeQualifierResolver
    public Iterable enumArguments(Object obj, boolean z6) {
        AnnotationDescriptor annotationDescriptor = (AnnotationDescriptor) obj;
        AbstractC16544l.m18094g(annotationDescriptor, "<this>");
        Map<Name, ConstantValue<?>> allValueArguments = annotationDescriptor.getAllValueArguments();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<Name, ConstantValue<?>> entry : allValueArguments.entrySet()) {
            AbstractC17686t.m19398v((!z6 || AbstractC16544l.m18089b(entry.getKey(), JvmAnnotationNames.DEFAULT_ANNOTATION_MEMBER_NAME)) ? m18168f(entry.getValue()) : C17689w.f56480Y, arrayList);
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.AbstractAnnotationTypeQualifierResolver
    public FqName getFqName(Object obj) {
        AnnotationDescriptor annotationDescriptor = (AnnotationDescriptor) obj;
        AbstractC16544l.m18094g(annotationDescriptor, "<this>");
        return annotationDescriptor.getFqName();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.AbstractAnnotationTypeQualifierResolver
    public Object getKey(Object obj) {
        AnnotationDescriptor annotationDescriptor = (AnnotationDescriptor) obj;
        AbstractC16544l.m18094g(annotationDescriptor, "<this>");
        ClassDescriptor annotationClass = DescriptorUtilsKt.getAnnotationClass(annotationDescriptor);
        AbstractC16544l.m18091d(annotationClass);
        return annotationClass;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.AbstractAnnotationTypeQualifierResolver
    public Iterable getMetaAnnotations(Object obj) {
        Annotations annotations;
        AnnotationDescriptor annotationDescriptor = (AnnotationDescriptor) obj;
        AbstractC16544l.m18094g(annotationDescriptor, "<this>");
        ClassDescriptor annotationClass = DescriptorUtilsKt.getAnnotationClass(annotationDescriptor);
        return (annotationClass == null || (annotations = annotationClass.getAnnotations()) == null) ? C17689w.f56480Y : annotations;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.AbstractAnnotationTypeQualifierResolver
    public boolean isK2() {
        return false;
    }
}
