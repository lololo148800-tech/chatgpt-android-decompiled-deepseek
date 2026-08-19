package p323Mm;

import java.lang.reflect.Method;
import kotlin.jvm.internal.AbstractC16544l;
import p544W9.AbstractC8501J3;

/* JADX INFO: renamed from: Mm.r */
/* JADX INFO: loaded from: classes2.dex */
public final class C5511r extends AbstractC5516w implements InterfaceC5499f {

    /* JADX INFO: renamed from: f */
    public final Object f17963f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5511r(Method method, Object obj) {
        super(method, false, 4);
        AbstractC16544l.m18094g(method, "method");
        this.f17963f = obj;
    }

    @Override // p323Mm.InterfaceC5500g
    public final Object call(Object[] args) {
        AbstractC16544l.m18094g(args, "args");
        AbstractC8501J3.m9165a(this, args);
        return m5921f(this.f17963f, args);
    }
}
