package p1027tp;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.Executor;
import p658b5.C11248s;

/* JADX INFO: renamed from: tp.n */
/* JADX INFO: loaded from: classes2.dex */
public final class C20070n extends AbstractC20060d {

    /* JADX INFO: renamed from: a */
    public final Executor f63562a;

    public C20070n(Executor executor) {
        this.f63562a = executor;
    }

    @Override // p1027tp.AbstractC20060d
    /* JADX INFO: renamed from: a */
    public final InterfaceC20061e mo20896a(Type type, Annotation[] annotationArr) {
        if (AbstractC20056V.m20880f(type) != InterfaceC20059c.class) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            return new C11248s(AbstractC20056V.m20879e(0, (ParameterizedType) type), AbstractC20056V.m20883i(annotationArr, InterfaceC20051P.class) ? null : this.f63562a, false, 29);
        }
        throw new IllegalArgumentException("Call return type must be parameterized as Call<Foo> or Call<? extends Foo>");
    }
}
