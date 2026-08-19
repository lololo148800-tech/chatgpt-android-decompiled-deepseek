package p323Mm;

import java.lang.reflect.Field;
import kotlin.jvm.internal.AbstractC16544l;
import p544W9.AbstractC8501J3;

/* JADX INFO: renamed from: Mm.j */
/* JADX INFO: loaded from: classes2.dex */
public final class C5503j extends AbstractC5506m implements InterfaceC5499f {

    /* JADX INFO: renamed from: e */
    public final Object f17958e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5503j(Field field, Object obj) {
        super(field, false);
        AbstractC16544l.m18094g(field, "field");
        this.f17958e = obj;
    }

    @Override // p323Mm.AbstractC5506m, p323Mm.InterfaceC5500g
    public final Object call(Object[] args) {
        AbstractC16544l.m18094g(args, "args");
        AbstractC8501J3.m9165a(this, args);
        return ((Field) this.f17969a).get(this.f17958e);
    }
}
