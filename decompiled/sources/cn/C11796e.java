package cn;

import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.ReadKotlinClassHeaderAnnotationVisitor;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ClassLiteralValue;
import p882m1.clb.WGTYqNchEpHca;

/* JADX INFO: renamed from: cn.e */
/* JADX INFO: loaded from: classes2.dex */
public final class C11796e implements KotlinJvmBinaryClass.AnnotationArgumentVisitor {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ReadKotlinClassHeaderAnnotationVisitor f35759a;

    public C11796e(ReadKotlinClassHeaderAnnotationVisitor readKotlinClassHeaderAnnotationVisitor) {
        this.f35759a = readKotlinClassHeaderAnnotationVisitor;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m13061a(int i10) {
        Object[] objArr = new Object[3];
        if (i10 == 1) {
            objArr[0] = WGTYqNchEpHca.yIJO;
        } else if (i10 == 2) {
            objArr[0] = "enumEntryName";
        } else if (i10 != 3) {
            objArr[0] = "classLiteralValue";
        } else {
            objArr[0] = "classId";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinSerializedIrArgumentVisitor";
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
    public final KotlinJvmBinaryClass.AnnotationArgumentVisitor visitAnnotation(Name name, ClassId classId) {
        if (classId != null) {
            return null;
        }
        m13061a(3);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
    public final KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor visitArray(Name name) {
        if ("b".equals(name != null ? name.asString() : null)) {
            return new C11795d(this);
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
    public final void visitClassLiteral(Name name, ClassLiteralValue classLiteralValue) {
        if (classLiteralValue != null) {
            return;
        }
        m13061a(0);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
    public final void visitEnum(Name name, ClassId classId, Name name2) {
        if (classId == null) {
            m13061a(1);
            throw null;
        }
        if (name2 != null) {
            return;
        }
        m13061a(2);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
    public final void visitEnd() {
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
    public final void visit(Name name, Object obj) {
    }
}
