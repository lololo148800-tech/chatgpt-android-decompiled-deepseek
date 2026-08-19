package p323Mm;

import java.lang.reflect.Method;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC16544l;
import p544W9.AbstractC8501J3;
import p909nm.C17689w;

/* JADX INFO: renamed from: Mm.y */
/* JADX INFO: loaded from: classes2.dex */
public final class C5518y extends AbstractC5490A implements InterfaceC5499f {

    /* JADX INFO: renamed from: d */
    public final Object f17973d;

    public C5518y(Method method, Object obj) {
        super(method, C17689w.f56480Y);
        this.f17973d = obj;
    }

    @Override // p323Mm.InterfaceC5500g
    public final Object call(Object[] args) {
        AbstractC16544l.m18094g(args, "args");
        AbstractC8501J3.m9165a(this, args);
        return this.f17921a.invoke(this.f17973d, Arrays.copyOf(args, args.length));
    }
}
