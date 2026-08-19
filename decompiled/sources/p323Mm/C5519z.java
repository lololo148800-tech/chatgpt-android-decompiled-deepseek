package p323Mm;

import java.util.Arrays;
import kotlin.jvm.internal.AbstractC16544l;
import p544W9.AbstractC8501J3;
import p909nm.AbstractC17678l;

/* JADX INFO: renamed from: Mm.z */
/* JADX INFO: loaded from: classes2.dex */
public final class C5519z extends AbstractC5490A {
    @Override // p323Mm.InterfaceC5500g
    public final Object call(Object[] args) {
        AbstractC16544l.m18094g(args, "args");
        AbstractC8501J3.m9165a(this, args);
        Object obj = args[0];
        Object[] objArrM19310q = args.length <= 1 ? new Object[0] : AbstractC17678l.m19310q(args, 1, args.length);
        return this.f17921a.invoke(obj, Arrays.copyOf(objArrM19310q, objArrM19310q.length));
    }
}
