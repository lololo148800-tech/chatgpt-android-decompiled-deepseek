package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import p049Bm.InterfaceC1436k;

/* JADX INFO: loaded from: classes2.dex */
public final class FilteredAnnotations implements Annotations {

    /* JADX INFO: renamed from: Y */
    public final Annotations f51443Y;

    /* JADX INFO: renamed from: Z */
    public final boolean f51444Z;

    /* JADX INFO: renamed from: o0 */
    public final InterfaceC1436k f51445o0;

    public FilteredAnnotations(Annotations delegate, boolean z6, InterfaceC1436k fqNameFilter) {
        AbstractC16544l.m18094g(delegate, "delegate");
        AbstractC16544l.m18094g(fqNameFilter, "fqNameFilter");
        this.f51443Y = delegate;
        this.f51444Z = z6;
        this.f51445o0 = fqNameFilter;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    /* JADX INFO: renamed from: findAnnotation */
    public AnnotationDescriptor mo22585findAnnotation(FqName fqName) {
        AbstractC16544l.m18094g(fqName, "fqName");
        if (((Boolean) this.f51445o0.invoke(fqName)).booleanValue()) {
            return this.f51443Y.mo22585findAnnotation(fqName);
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    public boolean hasAnnotation(FqName fqName) {
        AbstractC16544l.m18094g(fqName, "fqName");
        if (((Boolean) this.f51445o0.invoke(fqName)).booleanValue()) {
            return this.f51443Y.hasAnnotation(fqName);
        }
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    public boolean isEmpty() {
        boolean z6;
        Annotations annotations = this.f51443Y;
        if (!(annotations instanceof Collection) || !((Collection) annotations).isEmpty()) {
            Iterator<AnnotationDescriptor> it = annotations.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z6 = false;
                    break;
                }
                FqName fqName = it.next().getFqName();
                if (fqName != null && ((Boolean) this.f51445o0.invoke(fqName)).booleanValue()) {
                    z6 = true;
                    break;
                }
            }
        } else {
            z6 = false;
            break;
        }
        if (this.f51444Z) {
            return !z6;
        }
        return z6;
    }

    @Override // java.lang.Iterable
    public Iterator<AnnotationDescriptor> iterator() {
        ArrayList arrayList = new ArrayList();
        for (AnnotationDescriptor annotationDescriptor : this.f51443Y) {
            FqName fqName = annotationDescriptor.getFqName();
            if (fqName != null && ((Boolean) this.f51445o0.invoke(fqName)).booleanValue()) {
                arrayList.add(annotationDescriptor);
            }
        }
        return arrayList.iterator();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FilteredAnnotations(Annotations delegate, InterfaceC1436k fqNameFilter) {
        this(delegate, false, fqNameFilter);
        AbstractC16544l.m18094g(delegate, "delegate");
        AbstractC16544l.m18094g(fqNameFilter, "fqNameFilter");
    }
}
