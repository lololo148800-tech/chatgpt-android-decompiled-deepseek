package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import p1091wn.AbstractC21031l;
import p1091wn.C21025f;
import p1091wn.C21028i;
import p1091wn.C21034o;
import p388Pm.C6514h;
import p411Qm.C6759a;
import p909nm.AbstractC17678l;
import p909nm.AbstractC17680n;

/* JADX INFO: loaded from: classes2.dex */
public final class CompositeAnnotations implements Annotations {

    /* JADX INFO: renamed from: Y */
    public final List f51442Y;

    public CompositeAnnotations(List<? extends Annotations> delegates) {
        AbstractC16544l.m18094g(delegates, "delegates");
        this.f51442Y = delegates;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    /* JADX INFO: renamed from: findAnnotation */
    public AnnotationDescriptor mo22585findAnnotation(FqName fqName) {
        AbstractC16544l.m18094g(fqName, "fqName");
        return (AnnotationDescriptor) AbstractC21031l.m21489m(AbstractC21031l.m21496t(AbstractC17680n.m19329H(this.f51442Y), new C6514h(fqName, 1)));
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    public boolean hasAnnotation(FqName fqName) {
        AbstractC16544l.m18094g(fqName, "fqName");
        Iterator it = ((Iterable) AbstractC17680n.m19329H(this.f51442Y).f2104b).iterator();
        while (it.hasNext()) {
            if (((Annotations) it.next()).hasAnnotation(fqName)) {
                return true;
            }
        }
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    public boolean isEmpty() {
        List list = this.f51442Y;
        if ((list instanceof Collection) && list.isEmpty()) {
            return true;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!((Annotations) it.next()).isEmpty()) {
                return false;
            }
        }
        return true;
    }

    @Override // java.lang.Iterable
    public Iterator<AnnotationDescriptor> iterator() {
        return new C21025f(new C21028i(AbstractC17680n.m19329H(this.f51442Y), C6759a.f21690Y, C21034o.f66913Y));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CompositeAnnotations(Annotations... delegates) {
        this((List<? extends Annotations>) AbstractC17678l.m19291N(delegates));
        AbstractC16544l.m18094g(delegates, "delegates");
    }
}
