package p323Mm;

import java.lang.reflect.Field;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import p909nm.AbstractC17678l;

/* JADX INFO: renamed from: Mm.n */
/* JADX INFO: loaded from: classes2.dex */
public final class C5507n extends AbstractC5510q implements InterfaceC5499f {

    /* JADX INFO: renamed from: f */
    public final Object f17960f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5507n(Field field, boolean z6, Object obj) {
        super(field, z6, false);
        AbstractC16544l.m18094g(field, "field");
        this.f17960f = obj;
    }

    @Override // p323Mm.AbstractC5510q, p323Mm.InterfaceC5500g
    public final Object call(Object[] args) throws IllegalAccessException {
        AbstractC16544l.m18094g(args, "args");
        mo5920d(args);
        ((Field) this.f17969a).set(this.f17960f, AbstractC17678l.m19316w(args));
        return C17296C.f55119a;
    }
}
