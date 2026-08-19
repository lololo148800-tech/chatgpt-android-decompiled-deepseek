package p1027tp;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import mm.C17296C;
import mo.AbstractC17325B;
import mo.AbstractC17329F;
import p1069vp.InterfaceC20688w;

/* JADX INFO: renamed from: tp.b */
/* JADX INFO: loaded from: classes2.dex */
public final class C20058b extends AbstractC20066j {

    /* JADX INFO: renamed from: a */
    public boolean f63553a;

    @Override // p1027tp.AbstractC20066j
    /* JADX INFO: renamed from: a */
    public final InterfaceC20067k mo20891a(Type type, Annotation[] annotationArr) {
        if (AbstractC17325B.class.isAssignableFrom(AbstractC20056V.m20880f(type))) {
            return C20057a.f63548p0;
        }
        return null;
    }

    @Override // p1027tp.AbstractC20066j
    /* JADX INFO: renamed from: b */
    public final InterfaceC20067k mo20892b(Type type, Annotation[] annotationArr, C20050O c20050o) {
        if (type == AbstractC17329F.class) {
            return AbstractC20056V.m20883i(annotationArr, InterfaceC20688w.class) ? C20057a.f63549q0 : C20057a.f63547o0;
        }
        if (type == Void.class) {
            return C20057a.f63551s0;
        }
        if (!this.f63553a || type != C17296C.class) {
            return null;
        }
        try {
            return C20057a.f63550r0;
        } catch (NoClassDefFoundError unused) {
            this.f63553a = false;
            return null;
        }
    }
}
