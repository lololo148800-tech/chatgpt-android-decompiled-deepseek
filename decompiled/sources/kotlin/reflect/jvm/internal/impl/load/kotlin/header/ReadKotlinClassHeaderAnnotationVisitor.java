package kotlin.reflect.jvm.internal.impl.load.kotlin.header;

import cn.C11796e;
import cn.C11799h;
import java.security.AccessControlException;
import java.util.HashMap;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.load.java.JvmAnnotationNames;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.BitEncoding;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMetadataVersion;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;

/* JADX INFO: loaded from: classes2.dex */
public class ReadKotlinClassHeaderAnnotationVisitor implements KotlinJvmBinaryClass.AnnotationVisitor {

    /* JADX INFO: renamed from: j */
    public static final boolean f52100j;

    /* JADX INFO: renamed from: k */
    public static final HashMap f52101k;

    /* JADX INFO: renamed from: a */
    public int[] f52102a = null;

    /* JADX INFO: renamed from: b */
    public String f52103b = null;

    /* JADX INFO: renamed from: c */
    public int f52104c = 0;

    /* JADX INFO: renamed from: d */
    public String f52105d = null;

    /* JADX INFO: renamed from: e */
    public String[] f52106e = null;

    /* JADX INFO: renamed from: f */
    public String[] f52107f = null;

    /* JADX INFO: renamed from: g */
    public String[] f52108g = null;

    /* JADX INFO: renamed from: h */
    public KotlinClassHeader.Kind f52109h = null;

    /* JADX INFO: renamed from: i */
    public String[] f52110i = null;

    static {
        try {
            f52100j = "true".equals(System.getProperty("kotlin.ignore.old.metadata"));
        } catch (AccessControlException unused) {
            f52100j = false;
        }
        HashMap map = new HashMap();
        f52101k = map;
        map.put(ClassId.topLevel(new FqName("kotlin.jvm.internal.KotlinClass")), KotlinClassHeader.Kind.CLASS);
        map.put(ClassId.topLevel(new FqName("kotlin.jvm.internal.KotlinFileFacade")), KotlinClassHeader.Kind.FILE_FACADE);
        map.put(ClassId.topLevel(new FqName("kotlin.jvm.internal.KotlinMultifileClass")), KotlinClassHeader.Kind.MULTIFILE_CLASS);
        map.put(ClassId.topLevel(new FqName("kotlin.jvm.internal.KotlinMultifileClassPart")), KotlinClassHeader.Kind.MULTIFILE_CLASS_PART);
        map.put(ClassId.topLevel(new FqName("kotlin.jvm.internal.KotlinSyntheticClass")), KotlinClassHeader.Kind.SYNTHETIC_CLASS);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m18248a(int i10) {
        Object[] objArr = new Object[3];
        if (i10 != 1) {
            objArr[0] = "classId";
        } else {
            objArr[0] = "source";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor";
        objArr[2] = "visitAnnotation";
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public KotlinClassHeader createHeader(JvmMetadataVersion jvmMetadataVersion) {
        if (this.f52109h == null || this.f52102a == null) {
            return null;
        }
        JvmMetadataVersion jvmMetadataVersion2 = new JvmMetadataVersion(this.f52102a, (this.f52104c & 8) != 0);
        if (jvmMetadataVersion2.isCompatible(jvmMetadataVersion)) {
            KotlinClassHeader.Kind kind = this.f52109h;
            if ((kind == KotlinClassHeader.Kind.CLASS || kind == KotlinClassHeader.Kind.FILE_FACADE || kind == KotlinClassHeader.Kind.MULTIFILE_CLASS_PART) && this.f52106e == null) {
                return null;
            }
        } else {
            this.f52108g = this.f52106e;
            this.f52106e = null;
        }
        String[] strArr = this.f52110i;
        return new KotlinClassHeader(this.f52109h, jvmMetadataVersion2, this.f52106e, this.f52108g, this.f52107f, this.f52103b, this.f52104c, this.f52105d, strArr != null ? BitEncoding.decodeBytes(strArr) : null);
    }

    public KotlinClassHeader createHeaderWithDefaultMetadataVersion() {
        return createHeader(JvmMetadataVersion.INSTANCE);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationVisitor
    public KotlinJvmBinaryClass.AnnotationArgumentVisitor visitAnnotation(ClassId classId, SourceElement sourceElement) {
        KotlinClassHeader.Kind kind;
        if (classId == null) {
            m18248a(0);
            throw null;
        }
        if (sourceElement == null) {
            m18248a(1);
            throw null;
        }
        FqName fqNameAsSingleFqName = classId.asSingleFqName();
        if (fqNameAsSingleFqName.equals(JvmAnnotationNames.METADATA_FQ_NAME)) {
            return new C16573a(this);
        }
        if (fqNameAsSingleFqName.equals(JvmAnnotationNames.SERIALIZED_IR_FQ_NAME)) {
            return new C11796e(this);
        }
        if (f52100j || this.f52109h != null || (kind = (KotlinClassHeader.Kind) f52101k.get(classId)) == null) {
            return null;
        }
        this.f52109h = kind;
        return new C11799h(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationVisitor
    public void visitEnd() {
    }
}
