package cn;

import java.util.ArrayList;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ClassLiteralValue;

/* JADX INFO: renamed from: cn.a */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC11792a implements KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor {

    /* JADX INFO: renamed from: a */
    public final ArrayList f35755a = new ArrayList();

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m13059a(int i10) {
        Object[] objArr = new Object[3];
        if (i10 == 1) {
            objArr[0] = "enumEntryName";
        } else if (i10 == 2) {
            objArr[0] = "classLiteralValue";
        } else if (i10 != 3) {
            objArr[0] = "enumClassId";
        } else {
            objArr[0] = "classId";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$CollectStringArrayAnnotationVisitor";
        if (i10 == 2) {
            objArr[2] = "visitClassLiteral";
        } else if (i10 != 3) {
            objArr[2] = "visitEnum";
        } else {
            objArr[2] = "visitAnnotation";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    /* JADX INFO: renamed from: b */
    public abstract void mo13060b(String[] strArr);

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor
    public final void visit(Object obj) {
        if (obj instanceof String) {
            this.f35755a.add((String) obj);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor
    public final KotlinJvmBinaryClass.AnnotationArgumentVisitor visitAnnotation(ClassId classId) {
        if (classId != null) {
            return null;
        }
        m13059a(3);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor
    public final void visitClassLiteral(ClassLiteralValue classLiteralValue) {
        if (classLiteralValue != null) {
            return;
        }
        m13059a(2);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor
    public final void visitEnd() {
        mo13060b((String[]) this.f35755a.toArray(new String[0]));
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor
    public final void visitEnum(ClassId classId, Name name) {
        if (classId == null) {
            m13059a(0);
            throw null;
        }
        if (name != null) {
            return;
        }
        m13059a(1);
        throw null;
    }
}
