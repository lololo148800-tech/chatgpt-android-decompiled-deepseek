package p823j3;

import androidx.glance.session.SessionWorker;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: j3.t */
/* JADX INFO: loaded from: classes.dex */
public final class C16098t extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f49863Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ SessionWorker f49864Z;

    /* JADX INFO: renamed from: o0 */
    public int f49865o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16098t(SessionWorker sessionWorker, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f49864Z = sessionWorker;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f49863Y = obj;
        this.f49865o0 |= Integer.MIN_VALUE;
        return this.f49864Z.mo12108f(this);
    }
}
