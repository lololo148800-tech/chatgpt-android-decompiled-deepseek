package kotlin.reflect.jvm.internal.impl.load.kotlin;

import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.constants.AnnotationValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ClassLiteralValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.EnumValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.KClassValue;
import p909nm.AbstractC17680n;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.BinaryClassAnnotationAndConstantLoaderImpl$AbstractAnnotationArgumentVisitor$visitArray$1 */
/* JADX INFO: loaded from: classes2.dex */
public final class C16568x4262547b implements KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor {

    /* JADX INFO: renamed from: a */
    public final ArrayList f52035a = new ArrayList();

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ BinaryClassAnnotationAndConstantLoaderImpl f52036b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Name f52037c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ BinaryClassAnnotationAndConstantLoaderImpl.AbstractAnnotationArgumentVisitor f52038d;

    public C16568x4262547b(BinaryClassAnnotationAndConstantLoaderImpl binaryClassAnnotationAndConstantLoaderImpl, Name name, BinaryClassAnnotationAndConstantLoaderImpl.AbstractAnnotationArgumentVisitor abstractAnnotationArgumentVisitor) {
        this.f52036b = binaryClassAnnotationAndConstantLoaderImpl;
        this.f52037c = name;
        this.f52038d = abstractAnnotationArgumentVisitor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor
    public void visit(Object obj) {
        this.f52035a.add(BinaryClassAnnotationAndConstantLoaderImpl.access$createConstant(this.f52036b, this.f52037c, obj));
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor
    public KotlinJvmBinaryClass.AnnotationArgumentVisitor visitAnnotation(ClassId classId) {
        AbstractC16544l.m18094g(classId, "classId");
        final ArrayList arrayList = new ArrayList();
        SourceElement NO_SOURCE = SourceElement.NO_SOURCE;
        AbstractC16544l.m18093f(NO_SOURCE, "NO_SOURCE");
        final BinaryClassAnnotationAndConstantLoaderImpl.C165701 c165701Mo18239e = this.f52036b.mo18239e(classId, NO_SOURCE, arrayList);
        return new KotlinJvmBinaryClass.AnnotationArgumentVisitor(this, arrayList) { // from class: kotlin.reflect.jvm.internal.impl.load.kotlin.BinaryClassAnnotationAndConstantLoaderImpl$AbstractAnnotationArgumentVisitor$visitArray$1$visitAnnotation$1

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ BinaryClassAnnotationAndConstantLoaderImpl.C165701 f52039a;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ C16568x4262547b f52041c;

            /* JADX INFO: renamed from: d */
            public final /* synthetic */ ArrayList f52042d;

            {
                this.f52041c = this;
                this.f52042d = arrayList;
                this.f52039a = this.f52040b;
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
            public void visit(Name name, Object obj) {
                this.f52039a.visit(name, obj);
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
            public KotlinJvmBinaryClass.AnnotationArgumentVisitor visitAnnotation(Name name, ClassId classId2) {
                AbstractC16544l.m18094g(classId2, "classId");
                return this.f52039a.visitAnnotation(name, classId2);
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
            public KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor visitArray(Name name) {
                return this.f52039a.visitArray(name);
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
            public void visitClassLiteral(Name name, ClassLiteralValue value) {
                AbstractC16544l.m18094g(value, "value");
                this.f52039a.visitClassLiteral(name, value);
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
            public void visitEnd() {
                this.f52040b.visitEnd();
                this.f52041c.f52035a.add(new AnnotationValue((AnnotationDescriptor) AbstractC17680n.m19365o0(this.f52042d)));
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
            public void visitEnum(Name name, ClassId enumClassId, Name enumEntryName) {
                AbstractC16544l.m18094g(enumClassId, "enumClassId");
                AbstractC16544l.m18094g(enumEntryName, "enumEntryName");
                this.f52039a.visitEnum(name, enumClassId, enumEntryName);
            }
        };
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor
    public void visitClassLiteral(ClassLiteralValue value) {
        AbstractC16544l.m18094g(value, "value");
        this.f52035a.add(new KClassValue(value));
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor
    public void visitEnd() {
        this.f52038d.visitArrayValue(this.f52037c, this.f52035a);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor
    public void visitEnum(ClassId enumClassId, Name enumEntryName) {
        AbstractC16544l.m18094g(enumClassId, "enumClassId");
        AbstractC16544l.m18094g(enumEntryName, "enumEntryName");
        this.f52035a.add(new EnumValue(enumClassId, enumEntryName));
    }
}
