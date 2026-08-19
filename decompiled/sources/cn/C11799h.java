package cn;

import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.ReadKotlinClassHeaderAnnotationVisitor;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ClassLiteralValue;

/* JADX INFO: renamed from: cn.h */
/* JADX INFO: loaded from: classes2.dex */
public final class C11799h implements KotlinJvmBinaryClass.AnnotationArgumentVisitor {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ReadKotlinClassHeaderAnnotationVisitor f35762a;

    public C11799h(ReadKotlinClassHeaderAnnotationVisitor readKotlinClassHeaderAnnotationVisitor) {
        this.f35762a = readKotlinClassHeaderAnnotationVisitor;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m13062a(int i10) {
        Object[] objArr = new Object[3];
        if (i10 == 1) {
            objArr[0] = "enumClassId";
        } else if (i10 == 2) {
            objArr[0] = "enumEntryName";
        } else if (i10 != 3) {
            objArr[0] = "classLiteralValue";
        } else {
            objArr[0] = "classId";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$OldDeprecatedAnnotationArgumentVisitor";
        if (i10 == 1 || i10 == 2) {
            objArr[2] = "visitEnum";
        } else if (i10 != 3) {
            objArr[2] = "visitClassLiteral";
        } else {
            objArr[2] = "visitAnnotation";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
    public final void visit(Name name, Object obj) {
        if (name == null) {
            return;
        }
        String strAsString = name.asString();
        boolean zEquals = "version".equals(strAsString);
        ReadKotlinClassHeaderAnnotationVisitor readKotlinClassHeaderAnnotationVisitor = this.f35762a;
        if (zEquals) {
            if (obj instanceof int[]) {
                readKotlinClassHeaderAnnotationVisitor.f52102a = (int[]) obj;
            }
        } else if ("multifileClassName".equals(strAsString)) {
            readKotlinClassHeaderAnnotationVisitor.f52103b = obj instanceof String ? (String) obj : null;
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
    public final KotlinJvmBinaryClass.AnnotationArgumentVisitor visitAnnotation(Name name, ClassId classId) {
        if (classId != null) {
            return null;
        }
        m13062a(3);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
    public final KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor visitArray(Name name) {
        String strAsString = name != null ? name.asString() : null;
        if ("data".equals(strAsString) || "filePartClassNames".equals(strAsString)) {
            return new C11797f(this);
        }
        if ("strings".equals(strAsString)) {
            return new C11798g(this);
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
    public final void visitClassLiteral(Name name, ClassLiteralValue classLiteralValue) {
        if (classLiteralValue != null) {
            return;
        }
        m13062a(0);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
    public final void visitEnum(Name name, ClassId classId, Name name2) {
        if (classId == null) {
            m13062a(1);
            throw null;
        }
        if (name2 != null) {
            return;
        }
        m13062a(2);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
    public final void visitEnd() {
    }
}
