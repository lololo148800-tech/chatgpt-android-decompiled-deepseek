package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

/* JADX INFO: loaded from: classes2.dex */
public class AnnotatedImpl implements Annotated {

    /* JADX INFO: renamed from: Y */
    public final Annotations f51424Y;

    public AnnotatedImpl(Annotations annotations) {
        if (annotations != null) {
            this.f51424Y = annotations;
        } else {
            m18127a(0);
            throw null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m18127a(int i10) {
        String str = i10 != 1 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i10 != 1 ? 3 : 2];
        if (i10 != 1) {
            objArr[0] = "annotations";
        } else {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotatedImpl";
        }
        if (i10 != 1) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotatedImpl";
        } else {
            objArr[1] = "getAnnotations";
        }
        if (i10 != 1) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i10 == 1) {
            throw new IllegalStateException(str2);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated
    public Annotations getAnnotations() {
        Annotations annotations = this.f51424Y;
        if (annotations != null) {
            return annotations;
        }
        m18127a(1);
        throw null;
    }
}
