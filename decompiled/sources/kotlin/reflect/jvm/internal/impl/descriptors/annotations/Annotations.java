package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import p076Cm.InterfaceC1723a;

/* JADX INFO: loaded from: classes2.dex */
public interface Annotations extends Iterable<AnnotationDescriptor>, InterfaceC1723a {
    public static final Companion Companion = Companion.f51435a;

    public static final class Companion {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ Companion f51435a = new Companion();

        /* JADX INFO: renamed from: b */
        public static final Annotations$Companion$EMPTY$1 f51436b = new Annotations$Companion$EMPTY$1();

        public final Annotations create(List<? extends AnnotationDescriptor> annotations) {
            AbstractC16544l.m18094g(annotations, "annotations");
            return annotations.isEmpty() ? f51436b : new AnnotationsImpl(annotations);
        }

        public final Annotations getEMPTY() {
            return f51436b;
        }
    }

    public static final class DefaultImpls {
        public static AnnotationDescriptor findAnnotation(Annotations annotations, FqName fqName) {
            AnnotationDescriptor next;
            AbstractC16544l.m18094g(fqName, "fqName");
            Iterator<AnnotationDescriptor> it = annotations.iterator();
            while (it.hasNext()) {
                next = it.next();
                if (AbstractC16544l.m18089b(next.getFqName(), fqName)) {
                    return next;
                }
            }
            next = null;
            return next;
        }

        public static boolean hasAnnotation(Annotations annotations, FqName fqName) {
            AbstractC16544l.m18094g(fqName, "fqName");
            return annotations.mo22585findAnnotation(fqName) != null;
        }
    }

    /* JADX INFO: renamed from: findAnnotation */
    AnnotationDescriptor mo22585findAnnotation(FqName fqName);

    boolean hasAnnotation(FqName fqName);

    boolean isEmpty();
}
