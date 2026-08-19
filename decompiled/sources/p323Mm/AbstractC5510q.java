package p323Mm;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import p544W9.AbstractC8501J3;
import p909nm.AbstractC17678l;

/* JADX INFO: renamed from: Mm.q */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5510q extends AbstractC5517x {

    /* JADX INFO: renamed from: e */
    public final boolean f17962e;

    /* JADX WARN: Illegal instructions before constructor call */
    public AbstractC5510q(Field field, boolean z6, boolean z10) {
        Class TYPE = Void.TYPE;
        AbstractC16544l.m18093f(TYPE, "TYPE");
        super(field, TYPE, z10 ? field.getDeclaringClass() : null, new Type[]{field.getGenericType()});
        this.f17962e = z6;
    }

    @Override // p323Mm.InterfaceC5500g
    public Object call(Object[] args) throws IllegalAccessException {
        AbstractC16544l.m18094g(args, "args");
        mo5920d(args);
        ((Field) this.f17969a).set(this.f17971c != null ? AbstractC17678l.m19316w(args) : null, AbstractC17678l.m19284G(args));
        return C17296C.f55119a;
    }

    @Override // p323Mm.AbstractC5517x
    /* JADX INFO: renamed from: d */
    public void mo5920d(Object[] args) {
        AbstractC16544l.m18094g(args, "args");
        AbstractC8501J3.m9165a(this, args);
        if (this.f17962e && AbstractC17678l.m19284G(args) == null) {
            throw new IllegalArgumentException("null is not allowed as a value for this property.");
        }
    }
}
