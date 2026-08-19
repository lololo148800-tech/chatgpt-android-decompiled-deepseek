package p996rm;

import io.ktor.utils.p815io.AbstractC15070F;
import io.ktor.utils.p815io.C15067C;
import io.ktor.utils.p815io.C15068D;
import kotlin.jvm.internal.AbstractC16529F;
import p571X9.AbstractC9233X;
import sm.AbstractC19691g;

/* JADX INFO: renamed from: rm.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C19251b extends AbstractC19691g {

    /* JADX INFO: renamed from: Y */
    public int f61040Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C15068D f61041Z;

    /* JADX WARN: Illegal instructions before constructor call */
    public C19251b(C15068D c15068d) {
        C15067C c15067c = AbstractC15070F.f46833a;
        this.f61041Z = c15068d;
        super(c15067c);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        int i10 = this.f61040Y;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("This coroutine had already completed");
            }
            this.f61040Y = 2;
            AbstractC9233X.m9807c(obj);
            return obj;
        }
        this.f61040Y = 1;
        AbstractC9233X.m9807c(obj);
        C15068D c15068d = this.f61041Z;
        AbstractC16529F.m18081e(1, c15068d);
        return c15068d.invoke(this);
    }
}
