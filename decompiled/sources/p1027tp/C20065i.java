package p1027tp;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import p588Y2.C9642z;
import p729ej.C13414e;
import p854kf.AbstractC16393k;

/* JADX INFO: renamed from: tp.i */
/* JADX INFO: loaded from: classes2.dex */
public final class C20065i extends AbstractC20060d {

    /* JADX INFO: renamed from: a */
    public static final C20065i f63555a = new C20065i();

    @Override // p1027tp.AbstractC20060d
    /* JADX INFO: renamed from: a */
    public final InterfaceC20061e mo20896a(Type type, Annotation[] annotationArr) {
        if (AbstractC20056V.m20880f(type) != AbstractC16393k.m17991n()) {
            return null;
        }
        if (!(type instanceof ParameterizedType)) {
            throw new IllegalStateException("CompletableFuture return type must be parameterized as CompletableFuture<Foo> or CompletableFuture<? extends Foo>");
        }
        Type typeM20879e = AbstractC20056V.m20879e(0, (ParameterizedType) type);
        if (AbstractC20056V.m20880f(typeM20879e) != C20048M.class) {
            return new C13414e(typeM20879e);
        }
        if (typeM20879e instanceof ParameterizedType) {
            return new C9642z(AbstractC20056V.m20879e(0, (ParameterizedType) typeM20879e), 22);
        }
        throw new IllegalStateException("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
    }
}
