package p1049up;

import bj.C11447L;
import bj.InterfaceC11474u;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import p1027tp.AbstractC20066j;
import p1027tp.C20050O;
import p1027tp.InterfaceC20067k;
import p817j$.util.DesugarCollections;

/* JADX INFO: renamed from: up.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C20408a extends AbstractC20066j {

    /* JADX INFO: renamed from: a */
    public final C11447L f64527a;

    public C20408a(C11447L c11447l) {
        this.f64527a = c11447l;
    }

    /* JADX INFO: renamed from: c */
    public static Set m21076c(Annotation[] annotationArr) {
        LinkedHashSet linkedHashSet = null;
        for (Annotation annotation : annotationArr) {
            if (annotation.annotationType().isAnnotationPresent(InterfaceC11474u.class)) {
                if (linkedHashSet == null) {
                    linkedHashSet = new LinkedHashSet();
                }
                linkedHashSet.add(annotation);
            }
        }
        return linkedHashSet != null ? DesugarCollections.unmodifiableSet(linkedHashSet) : Collections.emptySet();
    }

    @Override // p1027tp.AbstractC20066j
    /* JADX INFO: renamed from: a */
    public final InterfaceC20067k mo20891a(Type type, Annotation[] annotationArr) {
        return new C20409b(this.f64527a.m12850b(type, m21076c(annotationArr), null));
    }

    @Override // p1027tp.AbstractC20066j
    /* JADX INFO: renamed from: b */
    public final InterfaceC20067k mo20892b(Type type, Annotation[] annotationArr, C20050O c20050o) {
        return new C20410c(this.f64527a.m12850b(type, m21076c(annotationArr), null));
    }
}
