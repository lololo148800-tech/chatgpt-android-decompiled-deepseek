package kotlin.reflect.jvm.internal.impl.load.kotlin.header;

import cn.C11793b;
import cn.C11794c;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ClassLiteralValue;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.header.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C16573a implements KotlinJvmBinaryClass.AnnotationArgumentVisitor {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ReadKotlinClassHeaderAnnotationVisitor f52111a;

    public C16573a(ReadKotlinClassHeaderAnnotationVisitor readKotlinClassHeaderAnnotationVisitor) {
        this.f52111a = readKotlinClassHeaderAnnotationVisitor;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m18249a(int i10) {
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
        objArr[1] = "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinMetadataArgumentVisitor";
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
        boolean zEquals = "k".equals(strAsString);
        ReadKotlinClassHeaderAnnotationVisitor readKotlinClassHeaderAnnotationVisitor = this.f52111a;
        if (zEquals) {
            if (obj instanceof Integer) {
                readKotlinClassHeaderAnnotationVisitor.f52109h = KotlinClassHeader.Kind.getById(((Integer) obj).intValue());
                return;
            }
            return;
        }
        if ("mv".equals(strAsString)) {
            if (obj instanceof int[]) {
                readKotlinClassHeaderAnnotationVisitor.f52102a = (int[]) obj;
                return;
            }
            return;
        }
        if ("xs".equals(strAsString)) {
            if (obj instanceof String) {
                String str = (String) obj;
                if (str.isEmpty()) {
                    return;
                }
                readKotlinClassHeaderAnnotationVisitor.f52103b = str;
                return;
            }
            return;
        }
        if ("xi".equals(strAsString)) {
            if (obj instanceof Integer) {
                readKotlinClassHeaderAnnotationVisitor.f52104c = ((Integer) obj).intValue();
            }
        } else if ("pn".equals(strAsString) && (obj instanceof String)) {
            String str2 = (String) obj;
            if (str2.isEmpty()) {
                return;
            }
            readKotlinClassHeaderAnnotationVisitor.f52105d = str2;
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
    public final KotlinJvmBinaryClass.AnnotationArgumentVisitor visitAnnotation(Name name, ClassId classId) {
        if (classId != null) {
            return null;
        }
        m18249a(3);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
    public final KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor visitArray(Name name) {
        String strAsString = name != null ? name.asString() : null;
        if ("d1".equals(strAsString)) {
            return new C11793b(this);
        }
        if ("d2".equals(strAsString)) {
            return new C11794c(this);
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
    public final void visitClassLiteral(Name name, ClassLiteralValue classLiteralValue) {
        if (classLiteralValue != null) {
            return;
        }
        m18249a(0);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
    public final void visitEnd() {
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
    public final void visitEnum(Name name, ClassId classId, Name name2) {
        if (classId == null) {
            m18249a(1);
            throw null;
        }
        if (name2 != null) {
            return;
        }
        m18249a(2);
        throw null;
    }
}
