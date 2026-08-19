package p1027tp;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import p784hb.C14438g;
import p817j$.util.Optional;

/* JADX INFO: renamed from: tp.v */
/* JADX INFO: loaded from: classes2.dex */
public final class C20078v extends AbstractC20066j {

    /* JADX INFO: renamed from: a */
    public static final C20078v f63587a = new C20078v();

    @Override // p1027tp.AbstractC20066j
    /* JADX INFO: renamed from: b */
    public final InterfaceC20067k mo20892b(Type type, Annotation[] annotationArr, C20050O c20050o) {
        if (AbstractC20056V.m20880f(type) != Optional.class) {
            return null;
        }
        return new C14438g(c20050o.m20874d(AbstractC20056V.m20879e(0, (ParameterizedType) type), annotationArr));
    }
}
