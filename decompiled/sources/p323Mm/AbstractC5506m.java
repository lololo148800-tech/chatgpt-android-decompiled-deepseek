package p323Mm;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import kotlin.jvm.internal.AbstractC16544l;
import p909nm.AbstractC17678l;

/* JADX INFO: renamed from: Mm.m */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5506m extends AbstractC5517x {
    /* JADX WARN: Illegal instructions before constructor call */
    public AbstractC5506m(Field field, boolean z6) {
        Type genericType = field.getGenericType();
        AbstractC16544l.m18093f(genericType, "getGenericType(...)");
        super(field, genericType, z6 ? field.getDeclaringClass() : null, new Type[0]);
    }

    @Override // p323Mm.InterfaceC5500g
    public Object call(Object[] args) {
        AbstractC16544l.m18094g(args, "args");
        mo5920d(args);
        return ((Field) this.f17969a).get(this.f17971c != null ? AbstractC17678l.m19316w(args) : null);
    }
}
